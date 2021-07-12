// Generated from /home/abdullah/Git/Studies/Honours/CS713/capstone/Antlr4/ANTLRv4Parser.g4 by ANTLR 4.8
 
   import java.io.*; 
   import Antlr4.Term.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ANTLRv4Parser extends ParserData {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TOKEN_REF=1, RULE_REF=2, LEXER_CHAR_SET=3, DOC_COMMENT=4, BLOCK_COMMENT=5, 
		LINE_COMMENT=6, INT=7, STRING_LITERAL=8, UNTERMINATED_STRING_LITERAL=9, 
		BEGIN_ARGUMENT=10, BEGIN_ACTION=11, OPTIONS=12, TOKENS=13, CHANNELS=14, 
		IMPORT=15, FRAGMENT=16, LEXER=17, PARSER=18, GRAMMAR=19, PROTECTED=20, 
		PUBLIC=21, PRIVATE=22, RETURNS=23, LOCALS=24, THROWS=25, CATCH=26, FINALLY=27, 
		MODE=28, COLON=29, COLONCOLON=30, COMMA=31, SEMI=32, LPAREN=33, RPAREN=34, 
		LBRACE=35, RBRACE=36, RARROW=37, LT=38, GT=39, ASSIGN=40, QUESTION=41, 
		STAR=42, PLUS_ASSIGN=43, PLUS=44, OR=45, DOLLAR=46, RANGE=47, DOT=48, 
		AT=49, POUND=50, NOT=51, ID=52, WS=53, ERRCHAR=54, END_ARGUMENT=55, UNTERMINATED_ARGUMENT=56, 
		ARGUMENT_CONTENT=57, END_ACTION=58, UNTERMINATED_ACTION=59, ACTION_CONTENT=60, 
		UNTERMINATED_CHAR_SET=61;
	public static final int
		RULE_grammarSpec = 0, RULE_grammarDecl = 1, RULE_grammarType = 2, RULE_prequelConstruct = 3, 
		RULE_optionsSpec = 4, RULE_option = 5, RULE_optionValue = 6, RULE_delegateGrammars = 7, 
		RULE_delegateGrammarList = 8, RULE_delegateGrammar = 9, RULE_tokensSpec = 10, 
		RULE_channelsSpec = 11, RULE_idList = 12, RULE_action_ = 13, RULE_actionScopeName = 14, 
		RULE_actionBlock = 15, RULE_argActionBlock = 16, RULE_modeSpec = 17, RULE_rules = 18, 
		RULE_ruleSpec = 19, RULE_parserRuleSpec = 20, RULE_exceptionGroup = 21, 
		RULE_exceptionHandler = 22, RULE_finallyClause = 23, RULE_rulePrequel = 24, 
		RULE_ruleReturns = 25, RULE_throwsSpec = 26, RULE_localsSpec = 27, RULE_ruleAction = 28, 
		RULE_ruleModifiers = 29, RULE_ruleModifier = 30, RULE_ruleAltList = 31, 
		RULE_labeledAlt = 32, RULE_lexerRuleSpec = 33, RULE_lexerRuleBlock = 34, 
		RULE_lexerAltList = 35, RULE_lexerAlt = 36, RULE_lexerElements = 37, RULE_lexerElement = 38, 
		RULE_labeledLexerElement = 39, RULE_lexerBlock = 40, RULE_lexerCommands = 41, 
		RULE_lexerCommand = 42, RULE_lexerCommandName = 43, RULE_lexerCommandExpr = 44, 
		RULE_altList = 45, RULE_alternative = 46, RULE_element = 47, RULE_postAtom = 48, 
		RULE_ebnf = 49, RULE_ebnfSuffix = 50, RULE_lexerAtom = 51, RULE_atom = 52, 
		RULE_notSet = 53, RULE_blockSet = 54, RULE_setElement = 55, RULE_block = 56, 
		RULE_ruleref = 57, RULE_characterRange = 58, RULE_terminal = 59, RULE_elementOptions = 60, 
		RULE_elementOption = 61, RULE_identifier = 62, RULE_tokenRef = 63;
	private static String[] makeRuleNames() {
		return new String[] {
			"grammarSpec", "grammarDecl", "grammarType", "prequelConstruct", "optionsSpec", 
			"option", "optionValue", "delegateGrammars", "delegateGrammarList", "delegateGrammar", 
			"tokensSpec", "channelsSpec", "idList", "action_", "actionScopeName", 
			"actionBlock", "argActionBlock", "modeSpec", "rules", "ruleSpec", "parserRuleSpec", 
			"exceptionGroup", "exceptionHandler", "finallyClause", "rulePrequel", 
			"ruleReturns", "throwsSpec", "localsSpec", "ruleAction", "ruleModifiers", 
			"ruleModifier", "ruleAltList", "labeledAlt", "lexerRuleSpec", "lexerRuleBlock", 
			"lexerAltList", "lexerAlt", "lexerElements", "lexerElement", "labeledLexerElement", 
			"lexerBlock", "lexerCommands", "lexerCommand", "lexerCommandName", "lexerCommandExpr", 
			"altList", "alternative", "element", "postAtom", "ebnf", "ebnfSuffix", 
			"lexerAtom", "atom", "notSet", "blockSet", "setElement", "block", "ruleref", 
			"characterRange", "terminal", "elementOptions", "elementOption", "identifier", 
			"tokenRef"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "'import'", "'fragment'", "'lexer'", "'parser'", "'grammar'", 
			"'protected'", "'public'", "'private'", "'returns'", "'locals'", "'throws'", 
			"'catch'", "'finally'", "'mode'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TOKEN_REF", "RULE_REF", "LEXER_CHAR_SET", "DOC_COMMENT", "BLOCK_COMMENT", 
			"LINE_COMMENT", "INT", "STRING_LITERAL", "UNTERMINATED_STRING_LITERAL", 
			"BEGIN_ARGUMENT", "BEGIN_ACTION", "OPTIONS", "TOKENS", "CHANNELS", "IMPORT", 
			"FRAGMENT", "LEXER", "PARSER", "GRAMMAR", "PROTECTED", "PUBLIC", "PRIVATE", 
			"RETURNS", "LOCALS", "THROWS", "CATCH", "FINALLY", "MODE", "COLON", "COLONCOLON", 
			"COMMA", "SEMI", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "RARROW", "LT", 
			"GT", "ASSIGN", "QUESTION", "STAR", "PLUS_ASSIGN", "PLUS", "OR", "DOLLAR", 
			"RANGE", "DOT", "AT", "POUND", "NOT", "ID", "WS", "ERRCHAR", "END_ARGUMENT", 
			"UNTERMINATED_ARGUMENT", "ARGUMENT_CONTENT", "END_ACTION", "UNTERMINATED_ACTION", 
			"ACTION_CONTENT", "UNTERMINATED_CHAR_SET"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ANTLRv4Parser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	   Atom t;
	   int group = 0;
	   boolean first = false;

	public ANTLRv4Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class GrammarSpecContext extends ParserRuleContext {
		public GrammarDeclContext grammarDecl() {
			return getRuleContext(GrammarDeclContext.class,0);
		}
		public RulesContext rules() {
			return getRuleContext(RulesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ANTLRv4Parser.EOF, 0); }
		public List<PrequelConstructContext> prequelConstruct() {
			return getRuleContexts(PrequelConstructContext.class);
		}
		public PrequelConstructContext prequelConstruct(int i) {
			return getRuleContext(PrequelConstructContext.class,i);
		}
		public List<ModeSpecContext> modeSpec() {
			return getRuleContexts(ModeSpecContext.class);
		}
		public ModeSpecContext modeSpec(int i) {
			return getRuleContext(ModeSpecContext.class,i);
		}
		public GrammarSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammarSpec; }
	}

	public final GrammarSpecContext grammarSpec() throws RecognitionException {
		GrammarSpecContext _localctx = new GrammarSpecContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_grammarSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			grammarDecl();
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPTIONS) | (1L << TOKENS) | (1L << CHANNELS) | (1L << IMPORT) | (1L << AT))) != 0)) {
				{
				{
				setState(129);
				prequelConstruct();
				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(135);
			rules();
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODE) {
				{
				{
				setState(136);
				modeSpec();
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(142);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GrammarDeclContext extends ParserRuleContext {
		public GrammarTypeContext grammarType() {
			return getRuleContext(GrammarTypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ANTLRv4Parser.SEMI, 0); }
		public GrammarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammarDecl; }
	}

	public final GrammarDeclContext grammarDecl() throws RecognitionException {
		GrammarDeclContext _localctx = new GrammarDeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_grammarDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			grammarType();
			setState(145);
			identifier();
			setState(146);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GrammarTypeContext extends ParserRuleContext {
		public TerminalNode LEXER() { return getToken(ANTLRv4Parser.LEXER, 0); }
		public TerminalNode GRAMMAR() { return getToken(ANTLRv4Parser.GRAMMAR, 0); }
		public TerminalNode PARSER() { return getToken(ANTLRv4Parser.PARSER, 0); }
		public GrammarTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammarType; }
	}

	public final GrammarTypeContext grammarType() throws RecognitionException {
		GrammarTypeContext _localctx = new GrammarTypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_grammarType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEXER:
				{
				setState(148);
				match(LEXER);
				setState(149);
				match(GRAMMAR);
				}
				break;
			case PARSER:
				{
				setState(150);
				match(PARSER);
				setState(151);
				match(GRAMMAR);
				}
				break;
			case GRAMMAR:
				{
				setState(152);
				match(GRAMMAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrequelConstructContext extends ParserRuleContext {
		public OptionsSpecContext optionsSpec() {
			return getRuleContext(OptionsSpecContext.class,0);
		}
		public DelegateGrammarsContext delegateGrammars() {
			return getRuleContext(DelegateGrammarsContext.class,0);
		}
		public TokensSpecContext tokensSpec() {
			return getRuleContext(TokensSpecContext.class,0);
		}
		public ChannelsSpecContext channelsSpec() {
			return getRuleContext(ChannelsSpecContext.class,0);
		}
		public Action_Context action_() {
			return getRuleContext(Action_Context.class,0);
		}
		public PrequelConstructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prequelConstruct; }
	}

	public final PrequelConstructContext prequelConstruct() throws RecognitionException {
		PrequelConstructContext _localctx = new PrequelConstructContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_prequelConstruct);
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPTIONS:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				optionsSpec();
				}
				break;
			case IMPORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				delegateGrammars();
				}
				break;
			case TOKENS:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				tokensSpec();
				}
				break;
			case CHANNELS:
				enterOuterAlt(_localctx, 4);
				{
				setState(158);
				channelsSpec();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 5);
				{
				setState(159);
				action_();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionsSpecContext extends ParserRuleContext {
		public TerminalNode OPTIONS() { return getToken(ANTLRv4Parser.OPTIONS, 0); }
		public TerminalNode RBRACE() { return getToken(ANTLRv4Parser.RBRACE, 0); }
		public List<OptionContext> option() {
			return getRuleContexts(OptionContext.class);
		}
		public OptionContext option(int i) {
			return getRuleContext(OptionContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(ANTLRv4Parser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(ANTLRv4Parser.SEMI, i);
		}
		public OptionsSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionsSpec; }
	}

	public final OptionsSpecContext optionsSpec() throws RecognitionException {
		OptionsSpecContext _localctx = new OptionsSpecContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_optionsSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(OPTIONS);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_REF || _la==RULE_REF) {
				{
				{
				setState(163);
				option();
				setState(164);
				match(SEMI);
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(ANTLRv4Parser.ASSIGN, 0); }
		public OptionValueContext optionValue() {
			return getRuleContext(OptionValueContext.class,0);
		}
		public OptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_option; }
	}

	public final OptionContext option() throws RecognitionException {
		OptionContext _localctx = new OptionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_option);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			identifier();
			setState(174);
			match(ASSIGN);
			setState(175);
			optionValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionValueContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(ANTLRv4Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ANTLRv4Parser.DOT, i);
		}
		public TerminalNode STRING_LITERAL() { return getToken(ANTLRv4Parser.STRING_LITERAL, 0); }
		public ActionBlockContext actionBlock() {
			return getRuleContext(ActionBlockContext.class,0);
		}
		public TerminalNode INT() { return getToken(ANTLRv4Parser.INT, 0); }
		public OptionValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionValue; }
	}

	public final OptionValueContext optionValue() throws RecognitionException {
		OptionValueContext _localctx = new OptionValueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_optionValue);
		int _la;
		try {
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOKEN_REF:
			case RULE_REF:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				identifier();
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(178);
					match(DOT);
					setState(179);
					identifier();
					}
					}
					setState(184);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				match(STRING_LITERAL);
				}
				break;
			case BEGIN_ACTION:
				enterOuterAlt(_localctx, 3);
				{
				setState(186);
				actionBlock();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 4);
				{
				setState(187);
				match(INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DelegateGrammarsContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(ANTLRv4Parser.IMPORT, 0); }
		public List<DelegateGrammarContext> delegateGrammar() {
			return getRuleContexts(DelegateGrammarContext.class);
		}
		public DelegateGrammarContext delegateGrammar(int i) {
			return getRuleContext(DelegateGrammarContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(ANTLRv4Parser.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ANTLRv4Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ANTLRv4Parser.COMMA, i);
		}
		public DelegateGrammarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delegateGrammars; }
	}

	public final DelegateGrammarsContext delegateGrammars() throws RecognitionException {
		DelegateGrammarsContext _localctx = new DelegateGrammarsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_delegateGrammars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(IMPORT);
			setState(191);
			delegateGrammar();
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(192);
				match(COMMA);
				setState(193);
				delegateGrammar();
				}
				}
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(199);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DelegateGrammarListContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(ANTLRv4Parser.COMMA, 0); }
		public DelegateGrammarContext delegateGrammar() {
			return getRuleContext(DelegateGrammarContext.class,0);
		}
		public DelegateGrammarListContext delegateGrammarList() {
			return getRuleContext(DelegateGrammarListContext.class,0);
		}
		public DelegateGrammarListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delegateGrammarList; }
	}

	public final DelegateGrammarListContext delegateGrammarList() throws RecognitionException {
		DelegateGrammarListContext _localctx = new DelegateGrammarListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_delegateGrammarList);
		try {
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				match(COMMA);
				setState(202);
				delegateGrammar();
				setState(203);
				delegateGrammarList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DelegateGrammarContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(ANTLRv4Parser.ASSIGN, 0); }
		public DelegateGrammarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delegateGrammar; }
	}

	public final DelegateGrammarContext delegateGrammar() throws RecognitionException {
		DelegateGrammarContext _localctx = new DelegateGrammarContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_delegateGrammar);
		try {
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				identifier();
				setState(209);
				match(ASSIGN);
				setState(210);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TokensSpecContext extends ParserRuleContext {
		public TerminalNode TOKENS() { return getToken(ANTLRv4Parser.TOKENS, 0); }
		public TerminalNode RBRACE() { return getToken(ANTLRv4Parser.RBRACE, 0); }
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public TokensSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokensSpec; }
	}

	public final TokensSpecContext tokensSpec() throws RecognitionException {
		TokensSpecContext _localctx = new TokensSpecContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tokensSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(TOKENS);
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TOKEN_REF || _la==RULE_REF) {
				{
				setState(216);
				idList();
				}
			}

			setState(219);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChannelsSpecContext extends ParserRuleContext {
		public TerminalNode CHANNELS() { return getToken(ANTLRv4Parser.CHANNELS, 0); }
		public TerminalNode RBRACE() { return getToken(ANTLRv4Parser.RBRACE, 0); }
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public ChannelsSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_channelsSpec; }
	}

	public final ChannelsSpecContext channelsSpec() throws RecognitionException {
		ChannelsSpecContext _localctx = new ChannelsSpecContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_channelsSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(CHANNELS);
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TOKEN_REF || _la==RULE_REF) {
				{
				setState(222);
				idList();
				}
			}

			setState(225);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdListContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ANTLRv4Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ANTLRv4Parser.COMMA, i);
		}
		public IdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idList; }
	}

	public final IdListContext idList() throws RecognitionException {
		IdListContext _localctx = new IdListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_idList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			identifier();
			setState(232);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(228);
					match(COMMA);
					setState(229);
					identifier();
					}
					} 
				}
				setState(234);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(235);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Action_Context extends ParserRuleContext {
		public TerminalNode AT() { return getToken(ANTLRv4Parser.AT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ActionBlockContext actionBlock() {
			return getRuleContext(ActionBlockContext.class,0);
		}
		public ActionScopeNameContext actionScopeName() {
			return getRuleContext(ActionScopeNameContext.class,0);
		}
		public TerminalNode COLONCOLON() { return getToken(ANTLRv4Parser.COLONCOLON, 0); }
		public Action_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action_; }
	}

	public final Action_Context action_() throws RecognitionException {
		Action_Context _localctx = new Action_Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_action_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(AT);
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(239);
				actionScopeName();
				setState(240);
				match(COLONCOLON);
				}
				break;
			}
			setState(244);
			identifier();
			setState(245);
			actionBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActionScopeNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LEXER() { return getToken(ANTLRv4Parser.LEXER, 0); }
		public TerminalNode PARSER() { return getToken(ANTLRv4Parser.PARSER, 0); }
		public ActionScopeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionScopeName; }
	}

	public final ActionScopeNameContext actionScopeName() throws RecognitionException {
		ActionScopeNameContext _localctx = new ActionScopeNameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_actionScopeName);
		try {
			setState(250);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOKEN_REF:
			case RULE_REF:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				identifier();
				}
				break;
			case LEXER:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				match(LEXER);
				}
				break;
			case PARSER:
				enterOuterAlt(_localctx, 3);
				{
				setState(249);
				match(PARSER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActionBlockContext extends ParserRuleContext {
		public TerminalNode BEGIN_ACTION() { return getToken(ANTLRv4Parser.BEGIN_ACTION, 0); }
		public TerminalNode END_ACTION() { return getToken(ANTLRv4Parser.END_ACTION, 0); }
		public List<TerminalNode> ACTION_CONTENT() { return getTokens(ANTLRv4Parser.ACTION_CONTENT); }
		public TerminalNode ACTION_CONTENT(int i) {
			return getToken(ANTLRv4Parser.ACTION_CONTENT, i);
		}
		public ActionBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionBlock; }
	}

	public final ActionBlockContext actionBlock() throws RecognitionException {
		ActionBlockContext _localctx = new ActionBlockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_actionBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(BEGIN_ACTION);
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ACTION_CONTENT) {
				{
				{
				setState(253);
				match(ACTION_CONTENT);
				}
				}
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(259);
			match(END_ACTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgActionBlockContext extends ParserRuleContext {
		public TerminalNode BEGIN_ARGUMENT() { return getToken(ANTLRv4Parser.BEGIN_ARGUMENT, 0); }
		public TerminalNode END_ARGUMENT() { return getToken(ANTLRv4Parser.END_ARGUMENT, 0); }
		public List<TerminalNode> ARGUMENT_CONTENT() { return getTokens(ANTLRv4Parser.ARGUMENT_CONTENT); }
		public TerminalNode ARGUMENT_CONTENT(int i) {
			return getToken(ANTLRv4Parser.ARGUMENT_CONTENT, i);
		}
		public ArgActionBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argActionBlock; }
	}

	public final ArgActionBlockContext argActionBlock() throws RecognitionException {
		ArgActionBlockContext _localctx = new ArgActionBlockContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_argActionBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(BEGIN_ARGUMENT);
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ARGUMENT_CONTENT) {
				{
				{
				setState(262);
				match(ARGUMENT_CONTENT);
				}
				}
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(268);
			match(END_ARGUMENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModeSpecContext extends ParserRuleContext {
		public TerminalNode MODE() { return getToken(ANTLRv4Parser.MODE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ANTLRv4Parser.SEMI, 0); }
		public List<LexerRuleSpecContext> lexerRuleSpec() {
			return getRuleContexts(LexerRuleSpecContext.class);
		}
		public LexerRuleSpecContext lexerRuleSpec(int i) {
			return getRuleContext(LexerRuleSpecContext.class,i);
		}
		public ModeSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modeSpec; }
	}

	public final ModeSpecContext modeSpec() throws RecognitionException {
		ModeSpecContext _localctx = new ModeSpecContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_modeSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(MODE);
			setState(271);
			identifier();
			setState(272);
			match(SEMI);
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_REF || _la==FRAGMENT) {
				{
				{
				setState(273);
				lexerRuleSpec();
				}
				}
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RulesContext extends ParserRuleContext {
		public List<RuleSpecContext> ruleSpec() {
			return getRuleContexts(RuleSpecContext.class);
		}
		public RuleSpecContext ruleSpec(int i) {
			return getRuleContext(RuleSpecContext.class,i);
		}
		public RulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rules; }
	}

	public final RulesContext rules() throws RecognitionException {
		RulesContext _localctx = new RulesContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_rules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOKEN_REF) | (1L << RULE_REF) | (1L << FRAGMENT) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << PRIVATE))) != 0)) {
				{
				{
				setState(279);
				ruleSpec();
				}
				}
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleSpecContext extends ParserRuleContext {
		public ParserRuleSpecContext p;
		public LexerRuleSpecContext l;
		public ParserRuleSpecContext parserRuleSpec() {
			return getRuleContext(ParserRuleSpecContext.class,0);
		}
		public LexerRuleSpecContext lexerRuleSpec() {
			return getRuleContext(LexerRuleSpecContext.class,0);
		}
		public RuleSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleSpec; }
	}

	public final RuleSpecContext ruleSpec() throws RecognitionException {
		RuleSpecContext _localctx = new RuleSpecContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ruleSpec);
		try {
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				((RuleSpecContext)_localctx).p = parserRuleSpec();
				 
				      // parseProduction(p.text);
				   
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				((RuleSpecContext)_localctx).l = lexerRuleSpec();
				 
				      // System.out.println((((RuleSpecContext)_localctx).l!=null?_input.getText(((RuleSpecContext)_localctx).l.start,((RuleSpecContext)_localctx).l.stop):null));
				   
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParserRuleSpecContext extends ParserRuleContext {
		public Alternate al;
		public Token r;
		public TerminalNode COLON() { return getToken(ANTLRv4Parser.COLON, 0); }
		public RuleAltListContext ruleAltList() {
			return getRuleContext(RuleAltListContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ANTLRv4Parser.SEMI, 0); }
		public ExceptionGroupContext exceptionGroup() {
			return getRuleContext(ExceptionGroupContext.class,0);
		}
		public TerminalNode RULE_REF() { return getToken(ANTLRv4Parser.RULE_REF, 0); }
		public RuleModifiersContext ruleModifiers() {
			return getRuleContext(RuleModifiersContext.class,0);
		}
		public ArgActionBlockContext argActionBlock() {
			return getRuleContext(ArgActionBlockContext.class,0);
		}
		public RuleReturnsContext ruleReturns() {
			return getRuleContext(RuleReturnsContext.class,0);
		}
		public ThrowsSpecContext throwsSpec() {
			return getRuleContext(ThrowsSpecContext.class,0);
		}
		public LocalsSpecContext localsSpec() {
			return getRuleContext(LocalsSpecContext.class,0);
		}
		public List<RulePrequelContext> rulePrequel() {
			return getRuleContexts(RulePrequelContext.class);
		}
		public RulePrequelContext rulePrequel(int i) {
			return getRuleContext(RulePrequelContext.class,i);
		}
		public ParserRuleSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parserRuleSpec; }
	}

	public final ParserRuleSpecContext parserRuleSpec() throws RecognitionException {
		ParserRuleSpecContext _localctx = new ParserRuleSpecContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_parserRuleSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FRAGMENT) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << PRIVATE))) != 0)) {
				{
				setState(293);
				ruleModifiers();
				}
			}

			setState(296);
			((ParserRuleSpecContext)_localctx).r = match(RULE_REF);
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BEGIN_ARGUMENT) {
				{
				setState(297);
				argActionBlock();
				}
			}

			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURNS) {
				{
				setState(300);
				ruleReturns();
				}
			}

			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(303);
				throwsSpec();
				}
			}

			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCALS) {
				{
				setState(306);
				localsSpec();
				}
			}

			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPTIONS || _la==AT) {
				{
				{
				setState(309);
				rulePrequel();
				}
				}
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(315);
			match(COLON);
			setState(316);
			ruleAltList();
			setState(317);
			match(SEMI);
			setState(318);
			exceptionGroup();
			}
			_ctx.stop = _input.LT(-1);
			 
			      NonTerminal n = new NonTerminal((((ParserRuleSpecContext)_localctx).r!=null?((ParserRuleSpecContext)_localctx).r.getText():null));
			      Production p = new Production(n, _localctx.al);

			      addProduction((((ParserRuleSpecContext)_localctx).r!=null?((ParserRuleSpecContext)_localctx).r.getText():null), p);
			   
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptionGroupContext extends ParserRuleContext {
		public List<ExceptionHandlerContext> exceptionHandler() {
			return getRuleContexts(ExceptionHandlerContext.class);
		}
		public ExceptionHandlerContext exceptionHandler(int i) {
			return getRuleContext(ExceptionHandlerContext.class,i);
		}
		public FinallyClauseContext finallyClause() {
			return getRuleContext(FinallyClauseContext.class,0);
		}
		public ExceptionGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionGroup; }
	}

	public final ExceptionGroupContext exceptionGroup() throws RecognitionException {
		ExceptionGroupContext _localctx = new ExceptionGroupContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_exceptionGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CATCH) {
				{
				{
				setState(320);
				exceptionHandler();
				}
				}
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINALLY) {
				{
				setState(326);
				finallyClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptionHandlerContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(ANTLRv4Parser.CATCH, 0); }
		public ArgActionBlockContext argActionBlock() {
			return getRuleContext(ArgActionBlockContext.class,0);
		}
		public ActionBlockContext actionBlock() {
			return getRuleContext(ActionBlockContext.class,0);
		}
		public ExceptionHandlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionHandler; }
	}

	public final ExceptionHandlerContext exceptionHandler() throws RecognitionException {
		ExceptionHandlerContext _localctx = new ExceptionHandlerContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_exceptionHandler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(CATCH);
			setState(330);
			argActionBlock();
			setState(331);
			actionBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FinallyClauseContext extends ParserRuleContext {
		public TerminalNode FINALLY() { return getToken(ANTLRv4Parser.FINALLY, 0); }
		public ActionBlockContext actionBlock() {
			return getRuleContext(ActionBlockContext.class,0);
		}
		public FinallyClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyClause; }
	}

	public final FinallyClauseContext finallyClause() throws RecognitionException {
		FinallyClauseContext _localctx = new FinallyClauseContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_finallyClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(FINALLY);
			setState(334);
			actionBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RulePrequelContext extends ParserRuleContext {
		public OptionsSpecContext optionsSpec() {
			return getRuleContext(OptionsSpecContext.class,0);
		}
		public RuleActionContext ruleAction() {
			return getRuleContext(RuleActionContext.class,0);
		}
		public RulePrequelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rulePrequel; }
	}

	public final RulePrequelContext rulePrequel() throws RecognitionException {
		RulePrequelContext _localctx = new RulePrequelContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_rulePrequel);
		try {
			setState(338);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPTIONS:
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				optionsSpec();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				ruleAction();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleReturnsContext extends ParserRuleContext {
		public TerminalNode RETURNS() { return getToken(ANTLRv4Parser.RETURNS, 0); }
		public ArgActionBlockContext argActionBlock() {
			return getRuleContext(ArgActionBlockContext.class,0);
		}
		public RuleReturnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleReturns; }
	}

	public final RuleReturnsContext ruleReturns() throws RecognitionException {
		RuleReturnsContext _localctx = new RuleReturnsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ruleReturns);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(RETURNS);
			setState(341);
			argActionBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThrowsSpecContext extends ParserRuleContext {
		public TerminalNode THROWS() { return getToken(ANTLRv4Parser.THROWS, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ANTLRv4Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ANTLRv4Parser.COMMA, i);
		}
		public ThrowsSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwsSpec; }
	}

	public final ThrowsSpecContext throwsSpec() throws RecognitionException {
		ThrowsSpecContext _localctx = new ThrowsSpecContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_throwsSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(THROWS);
			setState(344);
			identifier();
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(345);
				match(COMMA);
				setState(346);
				identifier();
				}
				}
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalsSpecContext extends ParserRuleContext {
		public TerminalNode LOCALS() { return getToken(ANTLRv4Parser.LOCALS, 0); }
		public ArgActionBlockContext argActionBlock() {
			return getRuleContext(ArgActionBlockContext.class,0);
		}
		public LocalsSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localsSpec; }
	}

	public final LocalsSpecContext localsSpec() throws RecognitionException {
		LocalsSpecContext _localctx = new LocalsSpecContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_localsSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(LOCALS);
			setState(353);
			argActionBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleActionContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(ANTLRv4Parser.AT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ActionBlockContext actionBlock() {
			return getRuleContext(ActionBlockContext.class,0);
		}
		public RuleActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleAction; }
	}

	public final RuleActionContext ruleAction() throws RecognitionException {
		RuleActionContext _localctx = new RuleActionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_ruleAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(AT);
			setState(356);
			identifier();
			setState(357);
			actionBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleModifiersContext extends ParserRuleContext {
		public List<RuleModifierContext> ruleModifier() {
			return getRuleContexts(RuleModifierContext.class);
		}
		public RuleModifierContext ruleModifier(int i) {
			return getRuleContext(RuleModifierContext.class,i);
		}
		public RuleModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleModifiers; }
	}

	public final RuleModifiersContext ruleModifiers() throws RecognitionException {
		RuleModifiersContext _localctx = new RuleModifiersContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_ruleModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(359);
				ruleModifier();
				}
				}
				setState(362); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FRAGMENT) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << PRIVATE))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleModifierContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(ANTLRv4Parser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(ANTLRv4Parser.PRIVATE, 0); }
		public TerminalNode PROTECTED() { return getToken(ANTLRv4Parser.PROTECTED, 0); }
		public TerminalNode FRAGMENT() { return getToken(ANTLRv4Parser.FRAGMENT, 0); }
		public RuleModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleModifier; }
	}

	public final RuleModifierContext ruleModifier() throws RecognitionException {
		RuleModifierContext _localctx = new RuleModifierContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_ruleModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FRAGMENT) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << PRIVATE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleAltListContext extends ParserRuleContext {
		public ArrayList<Concat> concats = new ArrayList<>();;
		public List<LabeledAltContext> labeledAlt() {
			return getRuleContexts(LabeledAltContext.class);
		}
		public LabeledAltContext labeledAlt(int i) {
			return getRuleContext(LabeledAltContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(ANTLRv4Parser.OR); }
		public TerminalNode OR(int i) {
			return getToken(ANTLRv4Parser.OR, i);
		}
		public RuleAltListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleAltList; }
	}

	public final RuleAltListContext ruleAltList() throws RecognitionException {
		RuleAltListContext _localctx = new RuleAltListContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_ruleAltList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			labeledAlt();
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(367);
				match(OR);
				setState(368);
				labeledAlt();
				}
				}
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			_ctx.stop = _input.LT(-1);

			      ((ParserRuleSpecContext)getInvokingContext(20)).al =  new Alternate(_localctx.concats);
			   
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledAltContext extends ParserRuleContext {
		public AlternativeContext alternative() {
			return getRuleContext(AlternativeContext.class,0);
		}
		public TerminalNode POUND() { return getToken(ANTLRv4Parser.POUND, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LabeledAltContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledAlt; }
	}

	public final LabeledAltContext labeledAlt() throws RecognitionException {
		LabeledAltContext _localctx = new LabeledAltContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_labeledAlt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			alternative();
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POUND) {
				{
				setState(375);
				match(POUND);
				setState(376);
				identifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LexerRuleSpecContext extends ParserRuleContext {
		public TokenRefContext tokenRef() {
			return getRuleContext(TokenRefContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ANTLRv4Parser.COLON, 0); }
		public LexerRuleBlockContext lexerRuleBlock() {
			return getRuleContext(LexerRuleBlockContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ANTLRv4Parser.SEMI, 0); }
		public TerminalNode FRAGMENT() { return getToken(ANTLRv4Parser.FRAGMENT, 0); }
		public LexerRuleSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerRuleSpec; }
	}

	public final LexerRuleSpecContext lexerRuleSpec() throws RecognitionException {
		LexerRuleSpecContext _localctx = new LexerRuleSpecContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_lexerRuleSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FRAGMENT) {
				{
				setState(379);
				match(FRAGMENT);
				}
			}

			setState(382);
			tokenRef();
			setState(383);
			match(COLON);
			setState(384);
			lexerRuleBlock();
			setState(385);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LexerRuleBlockContext extends ParserRuleContext {
		public LexerAltListContext lexerAltList() {
			return getRuleContext(LexerAltListContext.class,0);
		}
		public LexerRuleBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerRuleBlock; }
	}

	public final LexerRuleBlockContext lexerRuleBlock() throws RecognitionException {
		LexerRuleBlockContext _localctx = new LexerRuleBlockContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_lexerRuleBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			lexerAltList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LexerAltListContext extends ParserRuleContext {
		public List<LexerAltContext> lexerAlt() {
			return getRuleContexts(LexerAltContext.class);
		}
		public LexerAltContext lexerAlt(int i) {
			return getRuleContext(LexerAltContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(ANTLRv4Parser.OR); }
		public TerminalNode OR(int i) {
			return getToken(ANTLRv4Parser.OR, i);
		}
		public LexerAltListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerAltList; }
	}

	public final LexerAltListContext lexerAltList() throws RecognitionException {
		LexerAltListContext _localctx = new LexerAltListContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_lexerAltList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			lexerAlt();
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(390);
				match(OR);
				setState(391);
				lexerAlt();
				}
				}
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LexerAltContext extends ParserRuleContext {
		public LexerElementsContext lexerElements() {
			return getRuleContext(LexerElementsContext.class,0);
		}
		public LexerCommandsContext lexerCommands() {
			return getRuleContext(LexerCommandsContext.class,0);
		}
		public LexerAltContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerAlt; }
	}

	public final LexerAltContext lexerAlt() throws RecognitionException {
		LexerAltContext _localctx = new LexerAltContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_lexerAlt);
		int _la;
		try {
			setState(402);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(397);
				lexerElements();
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RARROW) {
					{
					setState(398);
					lexerCommands();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LexerElementsContext extends ParserRuleContext {
		public List<LexerElementContext> lexerElement() {
			return getRuleContexts(LexerElementContext.class);
		}
		public LexerElementContext lexerElement(int i) {
			return getRuleContext(LexerElementContext.class,i);
		}
		public LexerElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerElements; }
	}

	public final LexerElementsContext lexerElements() throws RecognitionException {
		LexerElementsContext _localctx = new LexerElementsContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_lexerElements);
		int _la;
		try {
			setState(410);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOKEN_REF:
			case RULE_REF:
			case LEXER_CHAR_SET:
			case STRING_LITERAL:
			case BEGIN_ACTION:
			case LPAREN:
			case DOT:
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(405); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(404);
					lexerElement();
					}
					}
					setState(407); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOKEN_REF) | (1L << RULE_REF) | (1L << LEXER_CHAR_SET) | (1L << STRING_LITERAL) | (1L << BEGIN_ACTION) | (1L << LPAREN) | (1L << DOT) | (1L << NOT))) != 0) );
				}
				break;
			case SEMI:
			case RPAREN:
			case RARROW:
			case OR:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LexerElementContext extends ParserRuleContext {
		public LabeledLexerElementContext labeledLexerElement() {
			return getRuleContext(LabeledLexerElementContext.class,0);
		}
		public EbnfSuffixContext ebnfSuffix() {
			return getRuleContext(EbnfSuffixContext.class,0);
		}
		public LexerAtomContext lexerAtom() {
			return getRuleContext(LexerAtomContext.class,0);
		}
		public LexerBlockContext lexerBlock() {
			return getRuleContext(LexerBlockContext.class,0);
		}
		public ActionBlockContext actionBlock() {
			return getRuleContext(ActionBlockContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(ANTLRv4Parser.QUESTION, 0); }
		public LexerElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerElement; }
	}

	public final LexerElementContext lexerElement() throws RecognitionException {
		LexerElementContext _localctx = new LexerElementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_lexerElement);
		int _la;
		try {
			setState(428);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(412);
				labeledLexerElement();
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QUESTION) | (1L << STAR) | (1L << PLUS))) != 0)) {
					{
					setState(413);
					ebnfSuffix();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(416);
				lexerAtom();
				setState(418);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QUESTION) | (1L << STAR) | (1L << PLUS))) != 0)) {
					{
					setState(417);
					ebnfSuffix();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(420);
				lexerBlock();
				setState(422);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QUESTION) | (1L << STAR) | (1L << PLUS))) != 0)) {
					{
					setState(421);
					ebnfSuffix();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(424);
				actionBlock();
				setState(426);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUESTION) {
					{
					setState(425);
					match(QUESTION);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledLexerElementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(ANTLRv4Parser.ASSIGN, 0); }
		public TerminalNode PLUS_ASSIGN() { return getToken(ANTLRv4Parser.PLUS_ASSIGN, 0); }
		public LexerAtomContext lexerAtom() {
			return getRuleContext(LexerAtomContext.class,0);
		}
		public LexerBlockContext lexerBlock() {
			return getRuleContext(LexerBlockContext.class,0);
		}
		public LabeledLexerElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledLexerElement; }
	}

	public final LabeledLexerElementContext labeledLexerElement() throws RecognitionException {
		LabeledLexerElementContext _localctx = new LabeledLexerElementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_labeledLexerElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			identifier();
			setState(431);
			_la = _input.LA(1);
			if ( !(_la==ASSIGN || _la==PLUS_ASSIGN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(434);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOKEN_REF:
			case LEXER_CHAR_SET:
			case STRING_LITERAL:
			case DOT:
			case NOT:
				{
				setState(432);
				lexerAtom();
				}
				break;
			case LPAREN:
				{
				setState(433);
				lexerBlock();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LexerBlockContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ANTLRv4Parser.LPAREN, 0); }
		public LexerAltListContext lexerAltList() {
			return getRuleContext(LexerAltListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ANTLRv4Parser.RPAREN, 0); }
		public LexerBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerBlock; }
	}

	public final LexerBlockContext lexerBlock() throws RecognitionException {
		LexerBlockContext _localctx = new LexerBlockContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_lexerBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			match(LPAREN);
			setState(437);
			lexerAltList();
			setState(438);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LexerCommandsContext extends ParserRuleContext {
		public TerminalNode RARROW() { return getToken(ANTLRv4Parser.RARROW, 0); }
		public List<LexerCommandContext> lexerCommand() {
			return getRuleContexts(LexerCommandContext.class);
		}
		public LexerCommandContext lexerCommand(int i) {
			return getRuleContext(LexerCommandContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ANTLRv4Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ANTLRv4Parser.COMMA, i);
		}
		public LexerCommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerCommands; }
	}

	public final LexerCommandsContext lexerCommands() throws RecognitionException {
		LexerCommandsContext _localctx = new LexerCommandsContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_lexerCommands);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(RARROW);
			setState(441);
			lexerCommand();
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(442);
				match(COMMA);
				setState(443);
				lexerCommand();
				}
				}
				setState(448);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LexerCommandContext extends ParserRuleContext {
		public LexerCommandNameContext lexerCommandName() {
			return getRuleContext(LexerCommandNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ANTLRv4Parser.LPAREN, 0); }
		public LexerCommandExprContext lexerCommandExpr() {
			return getRuleContext(LexerCommandExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ANTLRv4Parser.RPAREN, 0); }
		public LexerCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerCommand; }
	}

	public final LexerCommandContext lexerCommand() throws RecognitionException {
		LexerCommandContext _localctx = new LexerCommandContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_lexerCommand);
		try {
			setState(455);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(449);
				lexerCommandName();
				setState(450);
				match(LPAREN);
				setState(451);
				lexerCommandExpr();
				setState(452);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(454);
				lexerCommandName();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LexerCommandNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode MODE() { return getToken(ANTLRv4Parser.MODE, 0); }
		public LexerCommandNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerCommandName; }
	}

	public final LexerCommandNameContext lexerCommandName() throws RecognitionException {
		LexerCommandNameContext _localctx = new LexerCommandNameContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_lexerCommandName);
		try {
			setState(459);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOKEN_REF:
			case RULE_REF:
				enterOuterAlt(_localctx, 1);
				{
				setState(457);
				identifier();
				}
				break;
			case MODE:
				enterOuterAlt(_localctx, 2);
				{
				setState(458);
				match(MODE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LexerCommandExprContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode INT() { return getToken(ANTLRv4Parser.INT, 0); }
		public LexerCommandExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerCommandExpr; }
	}

	public final LexerCommandExprContext lexerCommandExpr() throws RecognitionException {
		LexerCommandExprContext _localctx = new LexerCommandExprContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_lexerCommandExpr);
		try {
			setState(463);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOKEN_REF:
			case RULE_REF:
				enterOuterAlt(_localctx, 1);
				{
				setState(461);
				identifier();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(462);
				match(INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AltListContext extends ParserRuleContext {
		public ArrayList<Concat> concats = new ArrayList<>();;
		public List<AlternativeContext> alternative() {
			return getRuleContexts(AlternativeContext.class);
		}
		public AlternativeContext alternative(int i) {
			return getRuleContext(AlternativeContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(ANTLRv4Parser.OR); }
		public TerminalNode OR(int i) {
			return getToken(ANTLRv4Parser.OR, i);
		}
		public AltListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_altList; }
	}

	public final AltListContext altList() throws RecognitionException {
		AltListContext _localctx = new AltListContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_altList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			alternative();
			setState(470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(466);
				match(OR);
				setState(467);
				alternative();
				}
				}
				setState(472);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			_ctx.stop = _input.LT(-1);
			 
			      t = new Group(new Alternate(_localctx.concats));
			   
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlternativeContext extends ParserRuleContext {
		public ArrayList<Atom> terms = new ArrayList<>();;
		public ElementOptionsContext elementOptions() {
			return getRuleContext(ElementOptionsContext.class,0);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public AlternativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alternative; }
	}

	public final AlternativeContext alternative() throws RecognitionException {
		AlternativeContext _localctx = new AlternativeContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_alternative);
		int _la;
		try {
			setState(484);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOKEN_REF:
			case RULE_REF:
			case STRING_LITERAL:
			case BEGIN_ACTION:
			case LPAREN:
			case LT:
			case DOT:
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(474);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(473);
					elementOptions();
					}
				}

				setState(479); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(476);
					element();
					 _localctx.terms.add(t); 
					}
					}
					setState(481); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOKEN_REF) | (1L << RULE_REF) | (1L << STRING_LITERAL) | (1L << BEGIN_ACTION) | (1L << LPAREN) | (1L << DOT) | (1L << NOT))) != 0) );
				}
				break;
			case SEMI:
			case RPAREN:
			case OR:
			case POUND:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);

			      Concat cn = new Concat(_localctx.terms);
			      if (group > 0) {
			         ((AltListContext)getInvokingContext(45)).concats.add(cn);
			      } else {
			         ((RuleAltListContext)getInvokingContext(31)).concats.add(cn);
			      }
			   
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PostAtomContext postAtom() {
			return getRuleContext(PostAtomContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(ANTLRv4Parser.ASSIGN, 0); }
		public TerminalNode PLUS_ASSIGN() { return getToken(ANTLRv4Parser.PLUS_ASSIGN, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public EbnfContext ebnf() {
			return getRuleContext(EbnfContext.class,0);
		}
		public ActionBlockContext actionBlock() {
			return getRuleContext(ActionBlockContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(ANTLRv4Parser.QUESTION, 0); }
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_element);
		int _la;
		try {
			setState(502);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(486);
				identifier();
				setState(487);
				_la = _input.LA(1);
				if ( !(_la==ASSIGN || _la==PLUS_ASSIGN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(490);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TOKEN_REF:
				case RULE_REF:
				case STRING_LITERAL:
				case DOT:
				case NOT:
					{
					setState(488);
					atom();
					}
					break;
				case LPAREN:
					{
					setState(489);
					block();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(492);
				postAtom();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(494);
				atom();
				setState(495);
				postAtom();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(497);
				ebnf();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(498);
				actionBlock();
				setState(500);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUESTION) {
					{
					setState(499);
					match(QUESTION);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostAtomContext extends ParserRuleContext {
		public EbnfSuffixContext e;
		public EbnfSuffixContext ebnfSuffix() {
			return getRuleContext(EbnfSuffixContext.class,0);
		}
		public PostAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postAtom; }
	}

	public final PostAtomContext postAtom() throws RecognitionException {
		PostAtomContext _localctx = new PostAtomContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_postAtom);
		try {
			setState(508);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUESTION:
			case STAR:
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(504);
				((PostAtomContext)_localctx).e = ebnfSuffix();

				      if ((((PostAtomContext)_localctx).e!=null?_input.getText(((PostAtomContext)_localctx).e.start,((PostAtomContext)_localctx).e.stop):null).equals("?")) t.setOption(1);
				      if ((((PostAtomContext)_localctx).e!=null?_input.getText(((PostAtomContext)_localctx).e.start,((PostAtomContext)_localctx).e.stop):null).equals("*")) t.setOption(2);
				      if ((((PostAtomContext)_localctx).e!=null?_input.getText(((PostAtomContext)_localctx).e.start,((PostAtomContext)_localctx).e.stop):null).equals("+")) t.setOption(3);
				   
				}
				break;
			case TOKEN_REF:
			case RULE_REF:
			case STRING_LITERAL:
			case BEGIN_ACTION:
			case SEMI:
			case LPAREN:
			case RPAREN:
			case OR:
			case DOT:
			case POUND:
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EbnfContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public PostAtomContext postAtom() {
			return getRuleContext(PostAtomContext.class,0);
		}
		public EbnfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ebnf; }
	}

	public final EbnfContext ebnf() throws RecognitionException {
		EbnfContext _localctx = new EbnfContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_ebnf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			block();
			setState(511);
			postAtom();
			 
			      
			   
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EbnfSuffixContext extends ParserRuleContext {
		public List<TerminalNode> QUESTION() { return getTokens(ANTLRv4Parser.QUESTION); }
		public TerminalNode QUESTION(int i) {
			return getToken(ANTLRv4Parser.QUESTION, i);
		}
		public TerminalNode STAR() { return getToken(ANTLRv4Parser.STAR, 0); }
		public TerminalNode PLUS() { return getToken(ANTLRv4Parser.PLUS, 0); }
		public EbnfSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ebnfSuffix; }
	}

	public final EbnfSuffixContext ebnfSuffix() throws RecognitionException {
		EbnfSuffixContext _localctx = new EbnfSuffixContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_ebnfSuffix);
		int _la;
		try {
			setState(526);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUESTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(514);
				match(QUESTION);
				setState(516);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUESTION) {
					{
					setState(515);
					match(QUESTION);
					}
				}

				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(518);
				match(STAR);
				setState(520);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUESTION) {
					{
					setState(519);
					match(QUESTION);
					}
				}

				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(522);
				match(PLUS);
				setState(524);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUESTION) {
					{
					setState(523);
					match(QUESTION);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LexerAtomContext extends ParserRuleContext {
		public CharacterRangeContext characterRange() {
			return getRuleContext(CharacterRangeContext.class,0);
		}
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public NotSetContext notSet() {
			return getRuleContext(NotSetContext.class,0);
		}
		public TerminalNode LEXER_CHAR_SET() { return getToken(ANTLRv4Parser.LEXER_CHAR_SET, 0); }
		public TerminalNode DOT() { return getToken(ANTLRv4Parser.DOT, 0); }
		public ElementOptionsContext elementOptions() {
			return getRuleContext(ElementOptionsContext.class,0);
		}
		public LexerAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerAtom; }
	}

	public final LexerAtomContext lexerAtom() throws RecognitionException {
		LexerAtomContext _localctx = new LexerAtomContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_lexerAtom);
		int _la;
		try {
			setState(536);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(528);
				characterRange();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(529);
				terminal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(530);
				notSet();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(531);
				match(LEXER_CHAR_SET);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(532);
				match(DOT);
				setState(534);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(533);
					elementOptions();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public RulerefContext ruleref() {
			return getRuleContext(RulerefContext.class,0);
		}
		public NotSetContext notSet() {
			return getRuleContext(NotSetContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ANTLRv4Parser.DOT, 0); }
		public ElementOptionsContext elementOptions() {
			return getRuleContext(ElementOptionsContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_atom);
		int _la;
		try {
			setState(546);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOKEN_REF:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(538);
				terminal();
				}
				break;
			case RULE_REF:
				enterOuterAlt(_localctx, 2);
				{
				setState(539);
				ruleref();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(540);
				notSet();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 4);
				{
				setState(541);
				match(DOT);
				setState(543);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(542);
					elementOptions();
					}
				}


				      t = new Terminal(".");
				   
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotSetContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(ANTLRv4Parser.NOT, 0); }
		public SetElementContext setElement() {
			return getRuleContext(SetElementContext.class,0);
		}
		public BlockSetContext blockSet() {
			return getRuleContext(BlockSetContext.class,0);
		}
		public NotSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notSet; }
	}

	public final NotSetContext notSet() throws RecognitionException {
		NotSetContext _localctx = new NotSetContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_notSet);
		try {
			setState(552);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(548);
				match(NOT);
				setState(549);
				setElement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(550);
				match(NOT);
				setState(551);
				blockSet();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockSetContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ANTLRv4Parser.LPAREN, 0); }
		public List<SetElementContext> setElement() {
			return getRuleContexts(SetElementContext.class);
		}
		public SetElementContext setElement(int i) {
			return getRuleContext(SetElementContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ANTLRv4Parser.RPAREN, 0); }
		public List<TerminalNode> OR() { return getTokens(ANTLRv4Parser.OR); }
		public TerminalNode OR(int i) {
			return getToken(ANTLRv4Parser.OR, i);
		}
		public BlockSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockSet; }
	}

	public final BlockSetContext blockSet() throws RecognitionException {
		BlockSetContext _localctx = new BlockSetContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_blockSet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			match(LPAREN);
			setState(555);
			setElement();
			setState(560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(556);
				match(OR);
				setState(557);
				setElement();
				}
				}
				setState(562);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(563);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetElementContext extends ParserRuleContext {
		public TokenRefContext tokenRef() {
			return getRuleContext(TokenRefContext.class,0);
		}
		public ElementOptionsContext elementOptions() {
			return getRuleContext(ElementOptionsContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(ANTLRv4Parser.STRING_LITERAL, 0); }
		public CharacterRangeContext characterRange() {
			return getRuleContext(CharacterRangeContext.class,0);
		}
		public TerminalNode LEXER_CHAR_SET() { return getToken(ANTLRv4Parser.LEXER_CHAR_SET, 0); }
		public SetElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setElement; }
	}

	public final SetElementContext setElement() throws RecognitionException {
		SetElementContext _localctx = new SetElementContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_setElement);
		int _la;
		try {
			setState(575);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(565);
				tokenRef();
				setState(567);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(566);
					elementOptions();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(569);
				match(STRING_LITERAL);
				setState(571);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(570);
					elementOptions();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(573);
				characterRange();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(574);
				match(LEXER_CHAR_SET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ANTLRv4Parser.LPAREN, 0); }
		public AltListContext altList() {
			return getRuleContext(AltListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ANTLRv4Parser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(ANTLRv4Parser.COLON, 0); }
		public OptionsSpecContext optionsSpec() {
			return getRuleContext(OptionsSpecContext.class,0);
		}
		public List<RuleActionContext> ruleAction() {
			return getRuleContexts(RuleActionContext.class);
		}
		public RuleActionContext ruleAction(int i) {
			return getRuleContext(RuleActionContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_block);
		 group++; 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			match(LPAREN);
			setState(588);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPTIONS) | (1L << COLON) | (1L << AT))) != 0)) {
				{
				setState(579);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(578);
					optionsSpec();
					}
				}

				setState(584);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(581);
					ruleAction();
					}
					}
					setState(586);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(587);
				match(COLON);
				}
			}

			setState(590);
			altList();
			setState(591);
			match(RPAREN);
			}
			_ctx.stop = _input.LT(-1);
			 group--; 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RulerefContext extends ParserRuleContext {
		public Token r;
		public TerminalNode RULE_REF() { return getToken(ANTLRv4Parser.RULE_REF, 0); }
		public ArgActionBlockContext argActionBlock() {
			return getRuleContext(ArgActionBlockContext.class,0);
		}
		public ElementOptionsContext elementOptions() {
			return getRuleContext(ElementOptionsContext.class,0);
		}
		public RulerefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleref; }
	}

	public final RulerefContext ruleref() throws RecognitionException {
		RulerefContext _localctx = new RulerefContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_ruleref);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			((RulerefContext)_localctx).r = match(RULE_REF);
			setState(595);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BEGIN_ARGUMENT) {
				{
				setState(594);
				argActionBlock();
				}
			}

			setState(598);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(597);
				elementOptions();
				}
			}


			      t = new NonTerminal((((RulerefContext)_localctx).r!=null?((RulerefContext)_localctx).r.getText():null));
			   
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharacterRangeContext extends ParserRuleContext {
		public List<TerminalNode> STRING_LITERAL() { return getTokens(ANTLRv4Parser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(ANTLRv4Parser.STRING_LITERAL, i);
		}
		public TerminalNode RANGE() { return getToken(ANTLRv4Parser.RANGE, 0); }
		public CharacterRangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characterRange; }
	}

	public final CharacterRangeContext characterRange() throws RecognitionException {
		CharacterRangeContext _localctx = new CharacterRangeContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_characterRange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			match(STRING_LITERAL);
			setState(603);
			match(RANGE);
			setState(604);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TerminalContext extends ParserRuleContext {
		public Token s;
		public TokenRefContext tokenRef() {
			return getRuleContext(TokenRefContext.class,0);
		}
		public ElementOptionsContext elementOptions() {
			return getRuleContext(ElementOptionsContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(ANTLRv4Parser.STRING_LITERAL, 0); }
		public TerminalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminal; }
	}

	public final TerminalContext terminal() throws RecognitionException {
		TerminalContext _localctx = new TerminalContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_terminal);
		int _la;
		try {
			setState(615);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOKEN_REF:
				enterOuterAlt(_localctx, 1);
				{
				setState(606);
				tokenRef();
				setState(608);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(607);
					elementOptions();
					}
				}

				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(610);
				((TerminalContext)_localctx).s = match(STRING_LITERAL);
				setState(612);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(611);
					elementOptions();
					}
				}

				 
				      t = new Terminal((((TerminalContext)_localctx).s!=null?((TerminalContext)_localctx).s.getText():null));
				   
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementOptionsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(ANTLRv4Parser.LT, 0); }
		public List<ElementOptionContext> elementOption() {
			return getRuleContexts(ElementOptionContext.class);
		}
		public ElementOptionContext elementOption(int i) {
			return getRuleContext(ElementOptionContext.class,i);
		}
		public TerminalNode GT() { return getToken(ANTLRv4Parser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ANTLRv4Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ANTLRv4Parser.COMMA, i);
		}
		public ElementOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementOptions; }
	}

	public final ElementOptionsContext elementOptions() throws RecognitionException {
		ElementOptionsContext _localctx = new ElementOptionsContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_elementOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			match(LT);
			setState(618);
			elementOption();
			setState(623);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(619);
				match(COMMA);
				setState(620);
				elementOption();
				}
				}
				setState(625);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(626);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementOptionContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(ANTLRv4Parser.ASSIGN, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ANTLRv4Parser.STRING_LITERAL, 0); }
		public ElementOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementOption; }
	}

	public final ElementOptionContext elementOption() throws RecognitionException {
		ElementOptionContext _localctx = new ElementOptionContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_elementOption);
		try {
			setState(635);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(628);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(629);
				identifier();
				setState(630);
				match(ASSIGN);
				setState(633);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TOKEN_REF:
				case RULE_REF:
					{
					setState(631);
					identifier();
					}
					break;
				case STRING_LITERAL:
					{
					setState(632);
					match(STRING_LITERAL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode RULE_REF() { return getToken(ANTLRv4Parser.RULE_REF, 0); }
		public TokenRefContext tokenRef() {
			return getRuleContext(TokenRefContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_identifier);
		try {
			setState(639);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RULE_REF:
				enterOuterAlt(_localctx, 1);
				{
				setState(637);
				match(RULE_REF);
				}
				break;
			case TOKEN_REF:
				enterOuterAlt(_localctx, 2);
				{
				setState(638);
				tokenRef();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TokenRefContext extends ParserRuleContext {
		public Token t;
		public TerminalNode TOKEN_REF() { return getToken(ANTLRv4Parser.TOKEN_REF, 0); }
		public TokenRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokenRef; }
	}

	public final TokenRefContext tokenRef() throws RecognitionException {
		TokenRefContext _localctx = new TokenRefContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_tokenRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
			((TokenRefContext)_localctx).t = match(TOKEN_REF);

			      t = new Terminal((((TokenRefContext)_localctx).t!=null?((TokenRefContext)_localctx).t.getText():null));
			   
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3?\u0287\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\3\2\3\2\7\2\u0085\n\2\f\2\16\2\u0088\13\2\3\2"+
		"\3\2\7\2\u008c\n\2\f\2\16\2\u008f\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\5\4\u009c\n\4\3\5\3\5\3\5\3\5\3\5\5\5\u00a3\n\5\3\6\3\6\3"+
		"\6\3\6\7\6\u00a9\n\6\f\6\16\6\u00ac\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\7\b\u00b7\n\b\f\b\16\b\u00ba\13\b\3\b\3\b\3\b\5\b\u00bf\n\b\3\t"+
		"\3\t\3\t\3\t\7\t\u00c5\n\t\f\t\16\t\u00c8\13\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\5\n\u00d1\n\n\3\13\3\13\3\13\3\13\3\13\5\13\u00d8\n\13\3\f\3\f\5"+
		"\f\u00dc\n\f\3\f\3\f\3\r\3\r\5\r\u00e2\n\r\3\r\3\r\3\16\3\16\3\16\7\16"+
		"\u00e9\n\16\f\16\16\16\u00ec\13\16\3\16\5\16\u00ef\n\16\3\17\3\17\3\17"+
		"\3\17\5\17\u00f5\n\17\3\17\3\17\3\17\3\20\3\20\3\20\5\20\u00fd\n\20\3"+
		"\21\3\21\7\21\u0101\n\21\f\21\16\21\u0104\13\21\3\21\3\21\3\22\3\22\7"+
		"\22\u010a\n\22\f\22\16\22\u010d\13\22\3\22\3\22\3\23\3\23\3\23\3\23\7"+
		"\23\u0115\n\23\f\23\16\23\u0118\13\23\3\24\7\24\u011b\n\24\f\24\16\24"+
		"\u011e\13\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0126\n\25\3\26\5\26\u0129"+
		"\n\26\3\26\3\26\5\26\u012d\n\26\3\26\5\26\u0130\n\26\3\26\5\26\u0133\n"+
		"\26\3\26\5\26\u0136\n\26\3\26\7\26\u0139\n\26\f\26\16\26\u013c\13\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\27\7\27\u0144\n\27\f\27\16\27\u0147\13\27\3"+
		"\27\5\27\u014a\n\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\5\32"+
		"\u0155\n\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\7\34\u015e\n\34\f\34\16"+
		"\34\u0161\13\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\6\37\u016b\n\37"+
		"\r\37\16\37\u016c\3 \3 \3!\3!\3!\7!\u0174\n!\f!\16!\u0177\13!\3\"\3\""+
		"\3\"\5\"\u017c\n\"\3#\5#\u017f\n#\3#\3#\3#\3#\3#\3$\3$\3%\3%\3%\7%\u018b"+
		"\n%\f%\16%\u018e\13%\3&\3&\5&\u0192\n&\3&\5&\u0195\n&\3\'\6\'\u0198\n"+
		"\'\r\'\16\'\u0199\3\'\5\'\u019d\n\'\3(\3(\5(\u01a1\n(\3(\3(\5(\u01a5\n"+
		"(\3(\3(\5(\u01a9\n(\3(\3(\5(\u01ad\n(\5(\u01af\n(\3)\3)\3)\3)\5)\u01b5"+
		"\n)\3*\3*\3*\3*\3+\3+\3+\3+\7+\u01bf\n+\f+\16+\u01c2\13+\3,\3,\3,\3,\3"+
		",\3,\5,\u01ca\n,\3-\3-\5-\u01ce\n-\3.\3.\5.\u01d2\n.\3/\3/\3/\7/\u01d7"+
		"\n/\f/\16/\u01da\13/\3\60\5\60\u01dd\n\60\3\60\3\60\3\60\6\60\u01e2\n"+
		"\60\r\60\16\60\u01e3\3\60\5\60\u01e7\n\60\3\61\3\61\3\61\3\61\5\61\u01ed"+
		"\n\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u01f7\n\61\5\61\u01f9"+
		"\n\61\3\62\3\62\3\62\3\62\5\62\u01ff\n\62\3\63\3\63\3\63\3\63\3\64\3\64"+
		"\5\64\u0207\n\64\3\64\3\64\5\64\u020b\n\64\3\64\3\64\5\64\u020f\n\64\5"+
		"\64\u0211\n\64\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u0219\n\65\5\65\u021b"+
		"\n\65\3\66\3\66\3\66\3\66\3\66\5\66\u0222\n\66\3\66\5\66\u0225\n\66\3"+
		"\67\3\67\3\67\3\67\5\67\u022b\n\67\38\38\38\38\78\u0231\n8\f8\168\u0234"+
		"\138\38\38\39\39\59\u023a\n9\39\39\59\u023e\n9\39\39\59\u0242\n9\3:\3"+
		":\5:\u0246\n:\3:\7:\u0249\n:\f:\16:\u024c\13:\3:\5:\u024f\n:\3:\3:\3:"+
		"\3;\3;\5;\u0256\n;\3;\5;\u0259\n;\3;\3;\3<\3<\3<\3<\3=\3=\5=\u0263\n="+
		"\3=\3=\5=\u0267\n=\3=\5=\u026a\n=\3>\3>\3>\3>\7>\u0270\n>\f>\16>\u0273"+
		"\13>\3>\3>\3?\3?\3?\3?\3?\5?\u027c\n?\5?\u027e\n?\3@\3@\5@\u0282\n@\3"+
		"A\3A\3A\3A\2\2B\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\2\4\4\2\22\22\26\30"+
		"\4\2**--\2\u02ac\2\u0082\3\2\2\2\4\u0092\3\2\2\2\6\u009b\3\2\2\2\b\u00a2"+
		"\3\2\2\2\n\u00a4\3\2\2\2\f\u00af\3\2\2\2\16\u00be\3\2\2\2\20\u00c0\3\2"+
		"\2\2\22\u00d0\3\2\2\2\24\u00d7\3\2\2\2\26\u00d9\3\2\2\2\30\u00df\3\2\2"+
		"\2\32\u00e5\3\2\2\2\34\u00f0\3\2\2\2\36\u00fc\3\2\2\2 \u00fe\3\2\2\2\""+
		"\u0107\3\2\2\2$\u0110\3\2\2\2&\u011c\3\2\2\2(\u0125\3\2\2\2*\u0128\3\2"+
		"\2\2,\u0145\3\2\2\2.\u014b\3\2\2\2\60\u014f\3\2\2\2\62\u0154\3\2\2\2\64"+
		"\u0156\3\2\2\2\66\u0159\3\2\2\28\u0162\3\2\2\2:\u0165\3\2\2\2<\u016a\3"+
		"\2\2\2>\u016e\3\2\2\2@\u0170\3\2\2\2B\u0178\3\2\2\2D\u017e\3\2\2\2F\u0185"+
		"\3\2\2\2H\u0187\3\2\2\2J\u0194\3\2\2\2L\u019c\3\2\2\2N\u01ae\3\2\2\2P"+
		"\u01b0\3\2\2\2R\u01b6\3\2\2\2T\u01ba\3\2\2\2V\u01c9\3\2\2\2X\u01cd\3\2"+
		"\2\2Z\u01d1\3\2\2\2\\\u01d3\3\2\2\2^\u01e6\3\2\2\2`\u01f8\3\2\2\2b\u01fe"+
		"\3\2\2\2d\u0200\3\2\2\2f\u0210\3\2\2\2h\u021a\3\2\2\2j\u0224\3\2\2\2l"+
		"\u022a\3\2\2\2n\u022c\3\2\2\2p\u0241\3\2\2\2r\u0243\3\2\2\2t\u0253\3\2"+
		"\2\2v\u025c\3\2\2\2x\u0269\3\2\2\2z\u026b\3\2\2\2|\u027d\3\2\2\2~\u0281"+
		"\3\2\2\2\u0080\u0283\3\2\2\2\u0082\u0086\5\4\3\2\u0083\u0085\5\b\5\2\u0084"+
		"\u0083\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2"+
		"\2\2\u0087\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008d\5&\24\2\u008a"+
		"\u008c\5$\23\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2"+
		"\2\2\u008d\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u0090"+
		"\u0091\7\2\2\3\u0091\3\3\2\2\2\u0092\u0093\5\6\4\2\u0093\u0094\5~@\2\u0094"+
		"\u0095\7\"\2\2\u0095\5\3\2\2\2\u0096\u0097\7\23\2\2\u0097\u009c\7\25\2"+
		"\2\u0098\u0099\7\24\2\2\u0099\u009c\7\25\2\2\u009a\u009c\7\25\2\2\u009b"+
		"\u0096\3\2\2\2\u009b\u0098\3\2\2\2\u009b\u009a\3\2\2\2\u009c\7\3\2\2\2"+
		"\u009d\u00a3\5\n\6\2\u009e\u00a3\5\20\t\2\u009f\u00a3\5\26\f\2\u00a0\u00a3"+
		"\5\30\r\2\u00a1\u00a3\5\34\17\2\u00a2\u009d\3\2\2\2\u00a2\u009e\3\2\2"+
		"\2\u00a2\u009f\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\t"+
		"\3\2\2\2\u00a4\u00aa\7\16\2\2\u00a5\u00a6\5\f\7\2\u00a6\u00a7\7\"\2\2"+
		"\u00a7\u00a9\3\2\2\2\u00a8\u00a5\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8"+
		"\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad"+
		"\u00ae\7&\2\2\u00ae\13\3\2\2\2\u00af\u00b0\5~@\2\u00b0\u00b1\7*\2\2\u00b1"+
		"\u00b2\5\16\b\2\u00b2\r\3\2\2\2\u00b3\u00b8\5~@\2\u00b4\u00b5\7\62\2\2"+
		"\u00b5\u00b7\5~@\2\u00b6\u00b4\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6"+
		"\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bf\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb"+
		"\u00bf\7\n\2\2\u00bc\u00bf\5 \21\2\u00bd\u00bf\7\t\2\2\u00be\u00b3\3\2"+
		"\2\2\u00be\u00bb\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf"+
		"\17\3\2\2\2\u00c0\u00c1\7\21\2\2\u00c1\u00c6\5\24\13\2\u00c2\u00c3\7!"+
		"\2\2\u00c3\u00c5\5\24\13\2\u00c4\u00c2\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6"+
		"\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00c6\3\2"+
		"\2\2\u00c9\u00ca\7\"\2\2\u00ca\21\3\2\2\2\u00cb\u00cc\7!\2\2\u00cc\u00cd"+
		"\5\24\13\2\u00cd\u00ce\5\22\n\2\u00ce\u00d1\3\2\2\2\u00cf\u00d1\3\2\2"+
		"\2\u00d0\u00cb\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1\23\3\2\2\2\u00d2\u00d3"+
		"\5~@\2\u00d3\u00d4\7*\2\2\u00d4\u00d5\5~@\2\u00d5\u00d8\3\2\2\2\u00d6"+
		"\u00d8\5~@\2\u00d7\u00d2\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d8\25\3\2\2\2"+
		"\u00d9\u00db\7\17\2\2\u00da\u00dc\5\32\16\2\u00db\u00da\3\2\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\7&\2\2\u00de\27\3\2\2\2"+
		"\u00df\u00e1\7\20\2\2\u00e0\u00e2\5\32\16\2\u00e1\u00e0\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\7&\2\2\u00e4\31\3\2\2\2"+
		"\u00e5\u00ea\5~@\2\u00e6\u00e7\7!\2\2\u00e7\u00e9\5~@\2\u00e8\u00e6\3"+
		"\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
		"\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ef\7!\2\2\u00ee\u00ed\3\2"+
		"\2\2\u00ee\u00ef\3\2\2\2\u00ef\33\3\2\2\2\u00f0\u00f4\7\63\2\2\u00f1\u00f2"+
		"\5\36\20\2\u00f2\u00f3\7 \2\2\u00f3\u00f5\3\2\2\2\u00f4\u00f1\3\2\2\2"+
		"\u00f4\u00f5\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\5~@\2\u00f7\u00f8"+
		"\5 \21\2\u00f8\35\3\2\2\2\u00f9\u00fd\5~@\2\u00fa\u00fd\7\23\2\2\u00fb"+
		"\u00fd\7\24\2\2\u00fc\u00f9\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fb\3"+
		"\2\2\2\u00fd\37\3\2\2\2\u00fe\u0102\7\r\2\2\u00ff\u0101\7>\2\2\u0100\u00ff"+
		"\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103"+
		"\u0105\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u0106\7<\2\2\u0106!\3\2\2\2\u0107"+
		"\u010b\7\f\2\2\u0108\u010a\7;\2\2\u0109\u0108\3\2\2\2\u010a\u010d\3\2"+
		"\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010e\3\2\2\2\u010d"+
		"\u010b\3\2\2\2\u010e\u010f\79\2\2\u010f#\3\2\2\2\u0110\u0111\7\36\2\2"+
		"\u0111\u0112\5~@\2\u0112\u0116\7\"\2\2\u0113\u0115\5D#\2\u0114\u0113\3"+
		"\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		"%\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011b\5(\25\2\u011a\u0119\3\2\2\2"+
		"\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\'\3"+
		"\2\2\2\u011e\u011c\3\2\2\2\u011f\u0120\5*\26\2\u0120\u0121\b\25\1\2\u0121"+
		"\u0126\3\2\2\2\u0122\u0123\5D#\2\u0123\u0124\b\25\1\2\u0124\u0126\3\2"+
		"\2\2\u0125\u011f\3\2\2\2\u0125\u0122\3\2\2\2\u0126)\3\2\2\2\u0127\u0129"+
		"\5<\37\2\u0128\u0127\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\3\2\2\2\u012a"+
		"\u012c\7\4\2\2\u012b\u012d\5\"\22\2\u012c\u012b\3\2\2\2\u012c\u012d\3"+
		"\2\2\2\u012d\u012f\3\2\2\2\u012e\u0130\5\64\33\2\u012f\u012e\3\2\2\2\u012f"+
		"\u0130\3\2\2\2\u0130\u0132\3\2\2\2\u0131\u0133\5\66\34\2\u0132\u0131\3"+
		"\2\2\2\u0132\u0133\3\2\2\2\u0133\u0135\3\2\2\2\u0134\u0136\58\35\2\u0135"+
		"\u0134\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u013a\3\2\2\2\u0137\u0139\5\62"+
		"\32\2\u0138\u0137\3\2\2\2\u0139\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a"+
		"\u013b\3\2\2\2\u013b\u013d\3\2\2\2\u013c\u013a\3\2\2\2\u013d\u013e\7\37"+
		"\2\2\u013e\u013f\5@!\2\u013f\u0140\7\"\2\2\u0140\u0141\5,\27\2\u0141+"+
		"\3\2\2\2\u0142\u0144\5.\30\2\u0143\u0142\3\2\2\2\u0144\u0147\3\2\2\2\u0145"+
		"\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2"+
		"\2\2\u0148\u014a\5\60\31\2\u0149\u0148\3\2\2\2\u0149\u014a\3\2\2\2\u014a"+
		"-\3\2\2\2\u014b\u014c\7\34\2\2\u014c\u014d\5\"\22\2\u014d\u014e\5 \21"+
		"\2\u014e/\3\2\2\2\u014f\u0150\7\35\2\2\u0150\u0151\5 \21\2\u0151\61\3"+
		"\2\2\2\u0152\u0155\5\n\6\2\u0153\u0155\5:\36\2\u0154\u0152\3\2\2\2\u0154"+
		"\u0153\3\2\2\2\u0155\63\3\2\2\2\u0156\u0157\7\31\2\2\u0157\u0158\5\"\22"+
		"\2\u0158\65\3\2\2\2\u0159\u015a\7\33\2\2\u015a\u015f\5~@\2\u015b\u015c"+
		"\7!\2\2\u015c\u015e\5~@\2\u015d\u015b\3\2\2\2\u015e\u0161\3\2\2\2\u015f"+
		"\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160\67\3\2\2\2\u0161\u015f\3\2\2"+
		"\2\u0162\u0163\7\32\2\2\u0163\u0164\5\"\22\2\u01649\3\2\2\2\u0165\u0166"+
		"\7\63\2\2\u0166\u0167\5~@\2\u0167\u0168\5 \21\2\u0168;\3\2\2\2\u0169\u016b"+
		"\5> \2\u016a\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016a\3\2\2\2\u016c"+
		"\u016d\3\2\2\2\u016d=\3\2\2\2\u016e\u016f\t\2\2\2\u016f?\3\2\2\2\u0170"+
		"\u0175\5B\"\2\u0171\u0172\7/\2\2\u0172\u0174\5B\"\2\u0173\u0171\3\2\2"+
		"\2\u0174\u0177\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176A"+
		"\3\2\2\2\u0177\u0175\3\2\2\2\u0178\u017b\5^\60\2\u0179\u017a\7\64\2\2"+
		"\u017a\u017c\5~@\2\u017b\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017cC\3\2"+
		"\2\2\u017d\u017f\7\22\2\2\u017e\u017d\3\2\2\2\u017e\u017f\3\2\2\2\u017f"+
		"\u0180\3\2\2\2\u0180\u0181\5\u0080A\2\u0181\u0182\7\37\2\2\u0182\u0183"+
		"\5F$\2\u0183\u0184\7\"\2\2\u0184E\3\2\2\2\u0185\u0186\5H%\2\u0186G\3\2"+
		"\2\2\u0187\u018c\5J&\2\u0188\u0189\7/\2\2\u0189\u018b\5J&\2\u018a\u0188"+
		"\3\2\2\2\u018b\u018e\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d"+
		"I\3\2\2\2\u018e\u018c\3\2\2\2\u018f\u0191\5L\'\2\u0190\u0192\5T+\2\u0191"+
		"\u0190\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0195\3\2\2\2\u0193\u0195\3\2"+
		"\2\2\u0194\u018f\3\2\2\2\u0194\u0193\3\2\2\2\u0195K\3\2\2\2\u0196\u0198"+
		"\5N(\2\u0197\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u0197\3\2\2\2\u0199"+
		"\u019a\3\2\2\2\u019a\u019d\3\2\2\2\u019b\u019d\3\2\2\2\u019c\u0197\3\2"+
		"\2\2\u019c\u019b\3\2\2\2\u019dM\3\2\2\2\u019e\u01a0\5P)\2\u019f\u01a1"+
		"\5f\64\2\u01a0\u019f\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01af\3\2\2\2\u01a2"+
		"\u01a4\5h\65\2\u01a3\u01a5\5f\64\2\u01a4\u01a3\3\2\2\2\u01a4\u01a5\3\2"+
		"\2\2\u01a5\u01af\3\2\2\2\u01a6\u01a8\5R*\2\u01a7\u01a9\5f\64\2\u01a8\u01a7"+
		"\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01af\3\2\2\2\u01aa\u01ac\5 \21\2\u01ab"+
		"\u01ad\7+\2\2\u01ac\u01ab\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01af\3\2"+
		"\2\2\u01ae\u019e\3\2\2\2\u01ae\u01a2\3\2\2\2\u01ae\u01a6\3\2\2\2\u01ae"+
		"\u01aa\3\2\2\2\u01afO\3\2\2\2\u01b0\u01b1\5~@\2\u01b1\u01b4\t\3\2\2\u01b2"+
		"\u01b5\5h\65\2\u01b3\u01b5\5R*\2\u01b4\u01b2\3\2\2\2\u01b4\u01b3\3\2\2"+
		"\2\u01b5Q\3\2\2\2\u01b6\u01b7\7#\2\2\u01b7\u01b8\5H%\2\u01b8\u01b9\7$"+
		"\2\2\u01b9S\3\2\2\2\u01ba\u01bb\7\'\2\2\u01bb\u01c0\5V,\2\u01bc\u01bd"+
		"\7!\2\2\u01bd\u01bf\5V,\2\u01be\u01bc\3\2\2\2\u01bf\u01c2\3\2\2\2\u01c0"+
		"\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1U\3\2\2\2\u01c2\u01c0\3\2\2\2"+
		"\u01c3\u01c4\5X-\2\u01c4\u01c5\7#\2\2\u01c5\u01c6\5Z.\2\u01c6\u01c7\7"+
		"$\2\2\u01c7\u01ca\3\2\2\2\u01c8\u01ca\5X-\2\u01c9\u01c3\3\2\2\2\u01c9"+
		"\u01c8\3\2\2\2\u01caW\3\2\2\2\u01cb\u01ce\5~@\2\u01cc\u01ce\7\36\2\2\u01cd"+
		"\u01cb\3\2\2\2\u01cd\u01cc\3\2\2\2\u01ceY\3\2\2\2\u01cf\u01d2\5~@\2\u01d0"+
		"\u01d2\7\t\2\2\u01d1\u01cf\3\2\2\2\u01d1\u01d0\3\2\2\2\u01d2[\3\2\2\2"+
		"\u01d3\u01d8\5^\60\2\u01d4\u01d5\7/\2\2\u01d5\u01d7\5^\60\2\u01d6\u01d4"+
		"\3\2\2\2\u01d7\u01da\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9"+
		"]\3\2\2\2\u01da\u01d8\3\2\2\2\u01db\u01dd\5z>\2\u01dc\u01db\3\2\2\2\u01dc"+
		"\u01dd\3\2\2\2\u01dd\u01e1\3\2\2\2\u01de\u01df\5`\61\2\u01df\u01e0\b\60"+
		"\1\2\u01e0\u01e2\3\2\2\2\u01e1\u01de\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3"+
		"\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e7\3\2\2\2\u01e5\u01e7\3\2"+
		"\2\2\u01e6\u01dc\3\2\2\2\u01e6\u01e5\3\2\2\2\u01e7_\3\2\2\2\u01e8\u01e9"+
		"\5~@\2\u01e9\u01ec\t\3\2\2\u01ea\u01ed\5j\66\2\u01eb\u01ed\5r:\2\u01ec"+
		"\u01ea\3\2\2\2\u01ec\u01eb\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01ef\5b"+
		"\62\2\u01ef\u01f9\3\2\2\2\u01f0\u01f1\5j\66\2\u01f1\u01f2\5b\62\2\u01f2"+
		"\u01f9\3\2\2\2\u01f3\u01f9\5d\63\2\u01f4\u01f6\5 \21\2\u01f5\u01f7\7+"+
		"\2\2\u01f6\u01f5\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f9\3\2\2\2\u01f8"+
		"\u01e8\3\2\2\2\u01f8\u01f0\3\2\2\2\u01f8\u01f3\3\2\2\2\u01f8\u01f4\3\2"+
		"\2\2\u01f9a\3\2\2\2\u01fa\u01fb\5f\64\2\u01fb\u01fc\b\62\1\2\u01fc\u01ff"+
		"\3\2\2\2\u01fd\u01ff\3\2\2\2\u01fe\u01fa\3\2\2\2\u01fe\u01fd\3\2\2\2\u01ff"+
		"c\3\2\2\2\u0200\u0201\5r:\2\u0201\u0202\5b\62\2\u0202\u0203\b\63\1\2\u0203"+
		"e\3\2\2\2\u0204\u0206\7+\2\2\u0205\u0207\7+\2\2\u0206\u0205\3\2\2\2\u0206"+
		"\u0207\3\2\2\2\u0207\u0211\3\2\2\2\u0208\u020a\7,\2\2\u0209\u020b\7+\2"+
		"\2\u020a\u0209\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u0211\3\2\2\2\u020c\u020e"+
		"\7.\2\2\u020d\u020f\7+\2\2\u020e\u020d\3\2\2\2\u020e\u020f\3\2\2\2\u020f"+
		"\u0211\3\2\2\2\u0210\u0204\3\2\2\2\u0210\u0208\3\2\2\2\u0210\u020c\3\2"+
		"\2\2\u0211g\3\2\2\2\u0212\u021b\5v<\2\u0213\u021b\5x=\2\u0214\u021b\5"+
		"l\67\2\u0215\u021b\7\5\2\2\u0216\u0218\7\62\2\2\u0217\u0219\5z>\2\u0218"+
		"\u0217\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021b\3\2\2\2\u021a\u0212\3\2"+
		"\2\2\u021a\u0213\3\2\2\2\u021a\u0214\3\2\2\2\u021a\u0215\3\2\2\2\u021a"+
		"\u0216\3\2\2\2\u021bi\3\2\2\2\u021c\u0225\5x=\2\u021d\u0225\5t;\2\u021e"+
		"\u0225\5l\67\2\u021f\u0221\7\62\2\2\u0220\u0222\5z>\2\u0221\u0220\3\2"+
		"\2\2\u0221\u0222\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0225\b\66\1\2\u0224"+
		"\u021c\3\2\2\2\u0224\u021d\3\2\2\2\u0224\u021e\3\2\2\2\u0224\u021f\3\2"+
		"\2\2\u0225k\3\2\2\2\u0226\u0227\7\65\2\2\u0227\u022b\5p9\2\u0228\u0229"+
		"\7\65\2\2\u0229\u022b\5n8\2\u022a\u0226\3\2\2\2\u022a\u0228\3\2\2\2\u022b"+
		"m\3\2\2\2\u022c\u022d\7#\2\2\u022d\u0232\5p9\2\u022e\u022f\7/\2\2\u022f"+
		"\u0231\5p9\2\u0230\u022e\3\2\2\2\u0231\u0234\3\2\2\2\u0232\u0230\3\2\2"+
		"\2\u0232\u0233\3\2\2\2\u0233\u0235\3\2\2\2\u0234\u0232\3\2\2\2\u0235\u0236"+
		"\7$\2\2\u0236o\3\2\2\2\u0237\u0239\5\u0080A\2\u0238\u023a\5z>\2\u0239"+
		"\u0238\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u0242\3\2\2\2\u023b\u023d\7\n"+
		"\2\2\u023c\u023e\5z>\2\u023d\u023c\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u0242"+
		"\3\2\2\2\u023f\u0242\5v<\2\u0240\u0242\7\5\2\2\u0241\u0237\3\2\2\2\u0241"+
		"\u023b\3\2\2\2\u0241\u023f\3\2\2\2\u0241\u0240\3\2\2\2\u0242q\3\2\2\2"+
		"\u0243\u024e\7#\2\2\u0244\u0246\5\n\6\2\u0245\u0244\3\2\2\2\u0245\u0246"+
		"\3\2\2\2\u0246\u024a\3\2\2\2\u0247\u0249\5:\36\2\u0248\u0247\3\2\2\2\u0249"+
		"\u024c\3\2\2\2\u024a\u0248\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u024d\3\2"+
		"\2\2\u024c\u024a\3\2\2\2\u024d\u024f\7\37\2\2\u024e\u0245\3\2\2\2\u024e"+
		"\u024f\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u0251\5\\/\2\u0251\u0252\7$\2"+
		"\2\u0252s\3\2\2\2\u0253\u0255\7\4\2\2\u0254\u0256\5\"\22\2\u0255\u0254"+
		"\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0258\3\2\2\2\u0257\u0259\5z>\2\u0258"+
		"\u0257\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u025b\b;"+
		"\1\2\u025bu\3\2\2\2\u025c\u025d\7\n\2\2\u025d\u025e\7\61\2\2\u025e\u025f"+
		"\7\n\2\2\u025fw\3\2\2\2\u0260\u0262\5\u0080A\2\u0261\u0263\5z>\2\u0262"+
		"\u0261\3\2\2\2\u0262\u0263\3\2\2\2\u0263\u026a\3\2\2\2\u0264\u0266\7\n"+
		"\2\2\u0265\u0267\5z>\2\u0266\u0265\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u0268"+
		"\3\2\2\2\u0268\u026a\b=\1\2\u0269\u0260\3\2\2\2\u0269\u0264\3\2\2\2\u026a"+
		"y\3\2\2\2\u026b\u026c\7(\2\2\u026c\u0271\5|?\2\u026d\u026e\7!\2\2\u026e"+
		"\u0270\5|?\2\u026f\u026d\3\2\2\2\u0270\u0273\3\2\2\2\u0271\u026f\3\2\2"+
		"\2\u0271\u0272\3\2\2\2\u0272\u0274\3\2\2\2\u0273\u0271\3\2\2\2\u0274\u0275"+
		"\7)\2\2\u0275{\3\2\2\2\u0276\u027e\5~@\2\u0277\u0278\5~@\2\u0278\u027b"+
		"\7*\2\2\u0279\u027c\5~@\2\u027a\u027c\7\n\2\2\u027b\u0279\3\2\2\2\u027b"+
		"\u027a\3\2\2\2\u027c\u027e\3\2\2\2\u027d\u0276\3\2\2\2\u027d\u0277\3\2"+
		"\2\2\u027e}\3\2\2\2\u027f\u0282\7\4\2\2\u0280\u0282\5\u0080A\2\u0281\u027f"+
		"\3\2\2\2\u0281\u0280\3\2\2\2\u0282\177\3\2\2\2\u0283\u0284\7\3\2\2\u0284"+
		"\u0285\bA\1\2\u0285\u0081\3\2\2\2U\u0086\u008d\u009b\u00a2\u00aa\u00b8"+
		"\u00be\u00c6\u00d0\u00d7\u00db\u00e1\u00ea\u00ee\u00f4\u00fc\u0102\u010b"+
		"\u0116\u011c\u0125\u0128\u012c\u012f\u0132\u0135\u013a\u0145\u0149\u0154"+
		"\u015f\u016c\u0175\u017b\u017e\u018c\u0191\u0194\u0199\u019c\u01a0\u01a4"+
		"\u01a8\u01ac\u01ae\u01b4\u01c0\u01c9\u01cd\u01d1\u01d8\u01dc\u01e3\u01e6"+
		"\u01ec\u01f6\u01f8\u01fe\u0206\u020a\u020e\u0210\u0218\u021a\u0221\u0224"+
		"\u022a\u0232\u0239\u023d\u0241\u0245\u024a\u024e\u0255\u0258\u0262\u0266"+
		"\u0269\u0271\u027b\u027d\u0281";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}