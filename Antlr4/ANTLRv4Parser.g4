/*
 * [The "BSD license"]
 *  Copyright (c) 2012-2014 Terence Parr
 *  Copyright (c) 2012-2014 Sam Harwell
 *  Copyright (c) 2015 Gerald Rosenberg
 *  All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without
 *  modification, are permitted provided that the following conditions
 *  are met:
 *
 *  1. Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *  2. Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *  3. The name of the author may not be used to endorse or promote products
 *     derived from this software without specific prior written permission.
 *
 *  THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 *  IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 *  OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 *  IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 *  INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 *  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 *  DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 *  THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 *  (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 *  THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

/*	A grammar for ANTLR v4 written in ANTLR v4.
 *
 *	Modified 2015.06.16 gbr
 *	-- update for compatibility with Antlr v4.5
 *	-- add mode for channels
 *	-- moved members to LexerAdaptor
 * 	-- move fragments to imports
 */
parser grammar ANTLRv4Parser;

@header { 
   import java.io.*; 
   import Antlr4.Term.*;
}

@members {
   Atom t;
   int group = 0;
   boolean first = false;
}

options { 
   superClass = ParserData;
   tokenVocab = ANTLRv4Lexer;
}


// The main entry point for parsing a v4 grammar.
grammarSpec
   : grammarDecl prequelConstruct* rules modeSpec* EOF
   ;

grammarDecl
   : grammarType identifier SEMI
   ;

grammarType
   : (LEXER GRAMMAR | PARSER GRAMMAR | GRAMMAR)
   ;
   // This is the list of all constructs that can be declared before
   // the set of rules that compose the grammar, and is invoked 0..n
   // times by the grammarPrequel rule.

prequelConstruct
   : optionsSpec
   | delegateGrammars
   | tokensSpec
   | channelsSpec
   | action_
   ;
   // ------------
   // Options - things that affect analysis and/or code generation

optionsSpec
   : OPTIONS (option SEMI)* RBRACE
   ;

option
   : identifier ASSIGN optionValue
   ;

optionValue
   : identifier (DOT identifier)*
   | STRING_LITERAL
   | actionBlock
   | INT
   ;
   // ------------
   // Delegates

delegateGrammars
   : IMPORT delegateGrammar (COMMA delegateGrammar)* SEMI
   ;

delegateGrammarList
   : COMMA delegateGrammar delegateGrammarList
   |
   ;

delegateGrammar
   : identifier ASSIGN identifier
   | identifier
   ;
   // ------------
   // Tokens & Channels

tokensSpec
   : TOKENS idList? RBRACE
   ;

channelsSpec
   : CHANNELS idList? RBRACE
   ;

idList
   : identifier (COMMA identifier)* COMMA?
   ;
   // Match stuff like @parser::members {int i;}

action_
   : AT (actionScopeName COLONCOLON)? identifier actionBlock
   ;
   // Scope names could collide with keywords; allow them as ids for action scopes

actionScopeName
   : identifier
   | LEXER
   | PARSER
   ;

actionBlock
   : BEGIN_ACTION ACTION_CONTENT* END_ACTION
   ;

argActionBlock
   : BEGIN_ARGUMENT ARGUMENT_CONTENT* END_ARGUMENT
   ;

modeSpec
   : MODE identifier SEMI lexerRuleSpec*
   ;

rules
   : ruleSpec*
   ;

ruleSpec
   : p=parserRuleSpec { 
      // parseProduction(p.text);
   }
   | l=lexerRuleSpec  { 
      // System.out.println($l.text);
   }
   ;


parserRuleSpec
   locals [
      Alternate al
   ] @after { 
      NonTerminal n = new NonTerminal($r.text);
      Production p = new Production(n, $al);

      addProduction($r.text, p);
   }
   : ruleModifiers? r=RULE_REF argActionBlock? ruleReturns? throwsSpec? localsSpec? rulePrequel* COLON ruleAltList SEMI exceptionGroup
   ;

exceptionGroup
   : exceptionHandler* finallyClause?
   ;

exceptionHandler
   : CATCH argActionBlock actionBlock
   ;

finallyClause
   : FINALLY actionBlock
   ;

rulePrequel
   : optionsSpec
   | ruleAction
   ;

ruleReturns
   : RETURNS argActionBlock
   ;

// --------------
// Exception spec
throwsSpec
   : THROWS identifier (COMMA identifier)*
   ;

localsSpec
   : LOCALS argActionBlock
   ;

/** Match stuff like @init {int i;} */
ruleAction
   : AT identifier actionBlock
   ;

ruleModifiers
   : ruleModifier+
   ;
   // An individual access modifier for a rule. The 'fragment' modifier
   // is an internal indication for lexer rules that they do not match
   // from the input but are like subroutines for other lexer rules to
   // reuse for certain lexical patterns. The other modifiers are passed
   // to the code generation templates and may be ignored by the template
   // if they are of no use in that language.

ruleModifier
   : PUBLIC
   | PRIVATE
   | PROTECTED
   | FRAGMENT
   ;

ruleAltList
   locals [
      ArrayList<Concat> concats = new ArrayList<>();
   ] @after {
      $parserRuleSpec::al = new Alternate($concats);
   }
   : labeledAlt (OR labeledAlt)*
   ;

labeledAlt
   : alternative (POUND identifier)?
   ;
   // --------------------
   // Lexer rules

lexerRuleSpec
   : FRAGMENT? tokenRef COLON lexerRuleBlock SEMI
   ;

lexerRuleBlock
   : lexerAltList
   ;

lexerAltList
   : lexerAlt (OR lexerAlt)*
   ;

lexerAlt
   : lexerElements lexerCommands?
   |
   // explicitly allow empty alts
   ;

lexerElements
   : lexerElement+
   |
   ;

lexerElement
   : labeledLexerElement ebnfSuffix?
   | lexerAtom ebnfSuffix?
   | lexerBlock ebnfSuffix?
   | actionBlock QUESTION?
   ;
   // but preds can be anywhere

labeledLexerElement
   : identifier (ASSIGN | PLUS_ASSIGN) (lexerAtom | lexerBlock)
   ;

lexerBlock
   : LPAREN lexerAltList RPAREN
   ;
   // E.g., channel(HIDDEN), skip, more, mode(INSIDE), push(INSIDE), pop

lexerCommands
   : RARROW lexerCommand (COMMA lexerCommand)*
   ;

lexerCommand
   : lexerCommandName LPAREN lexerCommandExpr RPAREN
   | lexerCommandName
   ;

lexerCommandName
   : identifier
   | MODE
   ;

lexerCommandExpr
   : identifier
   | INT
   ;
   // --------------------
   // Rule Alts

altList 
   locals [
      ArrayList<Concat> concats = new ArrayList<>();
   ] @after { 
      t = new Group(new Alternate($concats));
   }
   : alternative (OR alternative)*
   ;

alternative
   locals [ 
      ArrayList<Atom> terms = new ArrayList<>();
   ] @after {
      Concat cn = new Concat($terms);
      if (group > 0) {
         $altList::concats.add(cn);
      } else {
         $ruleAltList::concats.add(cn);
      }
   }
   : elementOptions? (element { $terms.add(t); } )+
   |
   // explicitly allow empty alts
   ; 

element
   : identifier (ASSIGN | PLUS_ASSIGN) (atom | block) postAtom
   | atom postAtom
   | ebnf
   | actionBlock QUESTION?
   ;

postAtom
   : e=ebnfSuffix {
      if ($e.text.equals("?")) t.setOption(1);
      if ($e.text.equals("*")) t.setOption(2);
      if ($e.text.equals("+")) t.setOption(3);
   }
   |
   ;

   // --------------------
   // EBNF and blocks

ebnf
   : block postAtom { 
      
   }
   ;

ebnfSuffix
   : QUESTION QUESTION?
   | STAR QUESTION?
   | PLUS QUESTION?
   ;

lexerAtom
   : characterRange
   | terminal
   | notSet
   | LEXER_CHAR_SET
   | DOT elementOptions?
   ;

atom
   : terminal
   | ruleref
   | notSet
   | DOT elementOptions? {
      t = new Terminal(".");
   }
   ;

// --------------------
// Inverted element set
notSet
   : NOT setElement
   | NOT blockSet
   ;

blockSet
   : LPAREN setElement (OR setElement)* RPAREN
   ;

setElement
   : tokenRef elementOptions?
   | STRING_LITERAL elementOptions?
   | characterRange 
   | LEXER_CHAR_SET
   ;

// -------------
// Grammar Block
block @init { group++; } @after { group--; }
   : LPAREN (optionsSpec? ruleAction* COLON)? altList RPAREN
   ;

// ----------------
// Parser rule ref
ruleref
   : r=RULE_REF argActionBlock? elementOptions? {
      t = new NonTerminal($r.text);
   }
   ;

// ---------------
// Character Range
characterRange
   : STRING_LITERAL RANGE STRING_LITERAL
   ;

terminal
   : tokenRef elementOptions?
   | s=STRING_LITERAL elementOptions? { 
      t = new Terminal($s.text);
   }
   ;

// Terminals may be adorned with certain options when
// reference in the grammar: TOK<,,,>
elementOptions
   : LT elementOption (COMMA elementOption)* GT
   ;

elementOption
   : identifier
   | identifier ASSIGN (identifier | STRING_LITERAL)
   ;

identifier
   : RULE_REF
   | tokenRef
   ;
   
tokenRef
   : t=TOKEN_REF {
      t = new Terminal($t.text);
   }
   ;