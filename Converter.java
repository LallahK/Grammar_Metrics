import java.util.ArrayList;
import java.util.HashMap;

import Antlr4.ParserData;
import Antlr4.Term;
import Antlr4.Term.Alternate;
import CUP.CUPGrammar;
import CUP.CUPNonTerminal;
import CUP.CUPProduction;
import CUP.CUPTerminal;
import JavaCC.*;
import JavaCC.CCTerm.*;

import org.antlr.v4.runtime.Parser;

abstract class Converter {
    
    public abstract Grammar convert();

}

class AntlrConverter extends Converter {

    private ArrayList<Term.Production> productions;
    private Grammar grammar;

    public AntlrConverter(ParserData parser) {
        this.productions = parser.getProductions();
        this.grammar = new Grammar();
    }

    public Grammar convert() {
        boolean first = true;

        for (Term.Production p: productions) {
            String literal = p.getLHS().literal;
            int index = grammar.nonTerminals.size();
            NonTerminal nt = new NonTerminal(literal, index);
            grammar.addNonTerminal(nt);
            if (first) {
                first = false;
                grammar.first = nt;
            }
        }

        for (Term.Production p: productions) {
            Term.Alternate RHS = p.getRHS();
            String literal = p.getLHS().literal;
            NonTerminal nt = grammar.getNonTerminal(literal);

            for (int i = 0; i < RHS.getConcatCount(); i++) {
                convertConcat(nt, RHS.getConcat(i));
            }
        }

        return grammar;
    }

    public void convertConcat(NonTerminal nt, Term.Concat c) {
        Production p = new Production(nt);

        for (int j = 0; j < c.getTermCount(); j++) {
            Term.Atom a = c.getTerm(j);

            if (a.getType() == 1) {
                convertTerminal(p, ((Term.Terminal) a).literal, a.option);
            } else if (a.getType() == 2) {
                convertNonTerminal(p, ((Term.NonTerminal) a).literal, a.option);
            } else {
                convertGroup(nt, p, ((Term.Group) a).group, a.option);
            }
        }

        grammar.addProduction(p);
    }

    public void convertTerminal(Production p, String t, int option) {
        String literal = t;
        Terminal term = grammar.getTerminal(literal);
        if (term == null) {
            int index = grammar.terminals.size();
            term = new Terminal(literal, index);
            grammar.addTerminal(term);
        }

        if (option > 0) {
            convertNewTerm(p, term, term.literal.toLowerCase(), option);
        } else {
            p.addRule(term);
            term.addProduction(p);
        }
    }

    public void convertNonTerminal(Production p, String t, int option) {
        String literal = t;
        NonTerminal term = grammar.getNonTerminal(literal);  
        
        if (option > 0) {
            convertNewTerm(p, term, literal, option);
        } else {
            p.addRule(term);
        }
    }

    public void convertGroup(NonTerminal nt, Production p, Alternate a, int option) {
        String literal = nt.literal + "Group" + Character.toString((char) (65 + nt.groups));
        nt.groups++;
        int index = grammar.nonTerminals.size();
        NonTerminal term = new NonTerminal(literal, index);
        grammar.addNonTerminal(term);

        if (option > 0) {
            convertNewTerm(p, term, literal, option);
        } else {
            p.addRule(term);
        }

        for (int i = 0; i < a.getConcatCount(); i++) {
            convertConcat(term, a.getConcat(i));
            // System.out.println(RHS);
        }
    }

    public void convertNewTerm(Production p, Symbol term, String t, int option) {
        String literal = t;
        if (option == 1) literal += "Option";
        else literal += "Multi";

        NonTerminal newTerm = grammar.getNonTerminal(literal);
        if (newTerm == null) {
            int index = grammar.nonTerminals.size();
            newTerm = new NonTerminal(literal, index);
            grammar.addNonTerminal(newTerm);

            Production pr = new Production(newTerm);
            pr.addRule(term); 
            if (option > 1) pr.addRule(newTerm);
            grammar.addProduction(pr);
            
            pr = new Production(newTerm);
            grammar.addProduction(pr);
            if (option == 3) p.addRule(term);
        }

        p.addRule(newTerm);
    }

}

class CUPConverter extends Converter {

    private CUPGrammar cupGrammar;
    private Grammar grammar;

    public CUPConverter(CUPGrammar cupGrammar) {
        this.cupGrammar = cupGrammar;
        this.grammar = new Grammar();
    }

    @Override
    public Grammar convert() {
        addTerms();
        addProductions();

        return grammar;
    }

    public void addTerms() {
        for (CUPTerminal t: cupGrammar.terminals) {
            int index = grammar.terminals.size();
            grammar.addTerminal(new Terminal(t.literal, index));
        }
        for (CUPNonTerminal t: cupGrammar.nonterminals) {
            int index = grammar.nonTerminals.size();
            grammar.addNonTerminal(new NonTerminal(t.literal, index));
        }
    }

    public void addProductions() {
        NonTerminal nt;
        Terminal t;

        for (CUPProduction p: cupGrammar.productions) {
            nt = grammar.getNonTerminal(p.LHS);
            Production newP = new Production(nt);
            
            for (String s: p.RHS) {
                nt = grammar.getNonTerminal(s);

                if (nt == null) {
                    t = grammar.getTerminal(s);
                    newP.addRule(t);
                } else newP.addRule(nt);
            }

            grammar.addProduction(newP);
        }
    }

}

class JavaCCConverter extends Converter {

    private ArrayList<CCProduction> productions;
    private Grammar grammar;

    public JavaCCConverter(ArrayList<CCProduction> parser) {
        this.productions = parser;
        this.grammar = new Grammar();
    }

    public Grammar convert() {
        boolean first = true;

        for (CCProduction p: productions) {
            String literal = p.getLHS();
            int index = grammar.nonTerminals.size();
            NonTerminal nt = new NonTerminal(literal, index);
            grammar.addNonTerminal(nt);
            if (first) {
                first = false;
                grammar.first = nt;
            }
        }

        for (CCProduction p: productions) {
            CCAlternate RHS = p.getRHS();
            String literal = p.getLHS();
            NonTerminal nt = grammar.getNonTerminal(literal);

            for (int i = 0; i < RHS.getConcatCount(); i++) {
                convertConcat(nt, RHS.getConcat(i));
            }
        }

        return grammar;
    }

    public void convertConcat(NonTerminal nt, CCConcat c) {
        Production p = new Production(nt);

        for (int j = 0; j < c.getTermCount(); j++) {
            CCAtom a = c.getTerm(j);

            if (a.getType() == 1) {
                CCTerminal ct = (CCTerminal) a;
                NonTerminal t = new NonTerminal(ct.literal, 0);
                if (grammar.nonTerminals.indexOf(t) == -1) {
                    Terminal o = grammar.getTerminal(ct.literal);

                    if (o == null) {
                        int index = grammar.terminals.size();
                        o = new Terminal(ct.literal, index);
                        grammar.addTerminal(o);
                    }
                    convertTerminal(p, o.literal, a.option);
                } else {
                    convertNonTerminal(p, ct.literal, a.option);
                }
            } else {
                convertGroup(nt, p, ((CCGroup) a).group, a.option);
            }
        }

        grammar.addProduction(p);
    }

    public void convertTerminal(Production p, String t, int option) {
        String literal = t;
        Terminal term = grammar.getTerminal(literal);
        if (term == null) {
            int index = grammar.terminals.size();
            term = new Terminal(literal, index);
            grammar.addTerminal(term);
        }

        if (option > 0) {
            convertNewTerm(p, term, term.literal.toLowerCase(), option);
        } else {
            p.addRule(term);
        }
    }

    public void convertNonTerminal(Production p, String t, int option) {
        String literal = t;
        NonTerminal term = grammar.getNonTerminal(literal);  
        
        if (option > 0) {
            convertNewTerm(p, term, literal, option);
        } else {
            p.addRule(term);
        }
    }

    public void convertGroup(NonTerminal nt, Production p, CCAlternate a, int option) {
        String literal = nt.literal + "Group" + Character.toString((char) (65 + nt.groups));
        nt.groups++;
        int index = grammar.nonTerminals.size();
        NonTerminal term = new NonTerminal(literal, index);
        grammar.addNonTerminal(term);

        if (option > 0) {
            convertNewTerm(p, term, literal, option);
        } else {
            p.addRule(term);
        }

        for (int i = 0; i < a.getConcatCount(); i++) {
            convertConcat(term, a.getConcat(i));
        }
    }

    public void convertNewTerm(Production p, Symbol term, String t, int option) {
        String literal = t;
        if (option == 1) literal += "Option";
        else literal += "Multi";

        NonTerminal newTerm = grammar.getNonTerminal(literal);
        if (newTerm == null) {
            int index = grammar.nonTerminals.size();
            newTerm = new NonTerminal(literal, index);
            grammar.addNonTerminal(newTerm);

            Production pr = new Production(newTerm);
            pr.addRule(term); 
            if (option > 1) pr.addRule(newTerm);
            grammar.addProduction(pr);
            
            pr = new Production(newTerm);
            grammar.addProduction(pr);
            if (option == 3) p.addRule(term);
        }

        p.addRule(newTerm);
    }

}