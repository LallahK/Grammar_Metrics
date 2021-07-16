// Generated from /home/abdullah/Git/Studies/Honours/CS713/Grammar_Metrics/Input/alan.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class alanParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, ALAN_STRING=44, ID=45, 
		NUM=46, COMMENT=47, WS=48;
	public static final int
		RULE_source = 0, RULE_funcdef = 1, RULE_body = 2, RULE_type = 3, RULE_vardef = 4, 
		RULE_statements = 5, RULE_statement = 6, RULE_assign = 7, RULE_call = 8, 
		RULE_alan_if = 9, RULE_input = 10, RULE_leave = 11, RULE_output = 12, 
		RULE_alan_while = 13, RULE_expr = 14, RULE_relop = 15, RULE_simple = 16, 
		RULE_addop = 17, RULE_term = 18, RULE_mulop = 19, RULE_factor = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"source", "funcdef", "body", "type", "vardef", "statements", "statement", 
			"assign", "call", "alan_if", "input", "leave", "output", "alan_while", 
			"expr", "relop", "simple", "addop", "term", "mulop", "factor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'source'", "'function'", "'('", "','", "')'", "'to'", "'begin'", 
			"'end'", "'boolean'", "'integer'", "'array'", "';'", "'relax'", "'['", 
			"']'", "':='", "'call'", "'if'", "'then'", "'elsif'", "'else'", "'get'", 
			"'leave'", "'put'", "'.'", "'while'", "'do'", "'='", "'>='", "'>'", "'<='", 
			"'<'", "'<>'", "'-'", "'or'", "'+'", "'and'", "'/'", "'*'", "'rem'", 
			"'not'", "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "ALAN_STRING", "ID", 
			"NUM", "COMMENT", "WS"
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
	public String getGrammarFileName() { return "alan.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public alanParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SourceContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(alanParser.ID, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<FuncdefContext> funcdef() {
			return getRuleContexts(FuncdefContext.class);
		}
		public FuncdefContext funcdef(int i) {
			return getRuleContext(FuncdefContext.class,i);
		}
		public SourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source; }
	}

	public final SourceContext source() throws RecognitionException {
		SourceContext _localctx = new SourceContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_source);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(T__0);
			setState(43);
			match(ID);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(44);
				funcdef();
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
			body();
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

	public static class FuncdefContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(alanParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(alanParser.ID, i);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public FuncdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdef; }
	}

	public final FuncdefContext funcdef() throws RecognitionException {
		FuncdefContext _localctx = new FuncdefContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_funcdef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(T__1);
			setState(53);
			match(ID);
			setState(54);
			match(T__2);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8 || _la==T__9) {
				{
				setState(55);
				type();
				setState(56);
				match(ID);
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(57);
					match(T__3);
					setState(58);
					type();
					setState(59);
					match(ID);
					}
					}
					setState(65);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(68);
			match(T__4);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(69);
				match(T__5);
				setState(70);
				type();
				}
			}

			setState(73);
			body();
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

	public static class BodyContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public List<VardefContext> vardef() {
			return getRuleContexts(VardefContext.class);
		}
		public VardefContext vardef(int i) {
			return getRuleContext(VardefContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(T__6);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8 || _la==T__9) {
				{
				{
				setState(76);
				vardef();
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
			statements();
			setState(83);
			match(T__7);
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			_la = _input.LA(1);
			if ( !(_la==T__8 || _la==T__9) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(86);
				match(T__10);
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

	public static class VardefContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(alanParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(alanParser.ID, i);
		}
		public VardefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardef; }
	}

	public final VardefContext vardef() throws RecognitionException {
		VardefContext _localctx = new VardefContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_vardef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			type();
			setState(90);
			match(ID);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(91);
				match(T__3);
				setState(92);
				match(ID);
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
			match(T__11);
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

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statements);
		int _la;
		try {
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				match(T__12);
				}
				break;
			case T__16:
			case T__17:
			case T__21:
			case T__22:
			case T__23:
			case T__25:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				statement();
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(102);
					match(T__11);
					setState(103);
					statement();
					}
					}
					setState(108);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class StatementContext extends ParserRuleContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public Alan_ifContext alan_if() {
			return getRuleContext(Alan_ifContext.class,0);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public LeaveContext leave() {
			return getRuleContext(LeaveContext.class,0);
		}
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public Alan_whileContext alan_while() {
			return getRuleContext(Alan_whileContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		try {
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				assign();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				call();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				alan_if();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 4);
				{
				setState(114);
				input();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 5);
				{
				setState(115);
				leave();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 6);
				{
				setState(116);
				output();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 7);
				{
				setState(117);
				alan_while();
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

	public static class AssignContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(alanParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<SimpleContext> simple() {
			return getRuleContexts(SimpleContext.class);
		}
		public SimpleContext simple(int i) {
			return getRuleContext(SimpleContext.class,i);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(ID);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(121);
				match(T__13);
				setState(122);
				simple();
				setState(123);
				match(T__14);
				}
			}

			setState(127);
			match(T__15);
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__33:
			case T__40:
			case T__41:
			case T__42:
			case ID:
			case NUM:
				{
				setState(128);
				expr();
				}
				break;
			case T__10:
				{
				setState(129);
				match(T__10);
				setState(130);
				simple();
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

	public static class CallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(alanParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(T__16);
			setState(134);
			match(ID);
			setState(135);
			match(T__2);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__33) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << ID) | (1L << NUM))) != 0)) {
				{
				setState(136);
				expr();
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(137);
					match(T__3);
					setState(138);
					expr();
					}
					}
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(146);
			match(T__4);
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

	public static class Alan_ifContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public Alan_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alan_if; }
	}

	public final Alan_ifContext alan_if() throws RecognitionException {
		Alan_ifContext _localctx = new Alan_ifContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_alan_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(T__17);
			setState(149);
			expr();
			setState(150);
			match(T__18);
			setState(151);
			statements();
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__19) {
				{
				{
				setState(152);
				match(T__19);
				setState(153);
				expr();
				setState(154);
				match(T__18);
				setState(155);
				statements();
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(162);
				match(T__20);
				setState(163);
				statements();
				}
			}

			setState(166);
			match(T__7);
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

	public static class InputContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(alanParser.ID, 0); }
		public SimpleContext simple() {
			return getRuleContext(SimpleContext.class,0);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(T__21);
			setState(169);
			match(ID);
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(170);
				match(T__13);
				setState(171);
				simple();
				setState(172);
				match(T__14);
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

	public static class LeaveContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LeaveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leave; }
	}

	public final LeaveContext leave() throws RecognitionException {
		LeaveContext _localctx = new LeaveContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_leave);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(T__22);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__33) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << ID) | (1L << NUM))) != 0)) {
				{
				setState(177);
				expr();
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

	public static class OutputContext extends ParserRuleContext {
		public List<TerminalNode> ALAN_STRING() { return getTokens(alanParser.ALAN_STRING); }
		public TerminalNode ALAN_STRING(int i) {
			return getToken(alanParser.ALAN_STRING, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_output);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(T__23);
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALAN_STRING:
				{
				setState(181);
				match(ALAN_STRING);
				}
				break;
			case T__2:
			case T__33:
			case T__40:
			case T__41:
			case T__42:
			case ID:
			case NUM:
				{
				setState(182);
				expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__24) {
				{
				{
				setState(185);
				match(T__24);
				setState(188);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ALAN_STRING:
					{
					setState(186);
					match(ALAN_STRING);
					}
					break;
				case T__2:
				case T__33:
				case T__40:
				case T__41:
				case T__42:
				case ID:
				case NUM:
					{
					setState(187);
					expr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(194);
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

	public static class Alan_whileContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Alan_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alan_while; }
	}

	public final Alan_whileContext alan_while() throws RecognitionException {
		Alan_whileContext _localctx = new Alan_whileContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_alan_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(T__25);
			setState(196);
			expr();
			setState(197);
			match(T__26);
			setState(198);
			statements();
			setState(199);
			match(T__7);
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

	public static class ExprContext extends ParserRuleContext {
		public List<SimpleContext> simple() {
			return getRuleContexts(SimpleContext.class);
		}
		public SimpleContext simple(int i) {
			return getRuleContext(SimpleContext.class,i);
		}
		public RelopContext relop() {
			return getRuleContext(RelopContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			simple();
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32))) != 0)) {
				{
				setState(202);
				relop();
				setState(203);
				simple();
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

	public static class RelopContext extends ParserRuleContext {
		public RelopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relop; }
	}

	public final RelopContext relop() throws RecognitionException {
		RelopContext _localctx = new RelopContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_relop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32))) != 0)) ) {
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

	public static class SimpleContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<AddopContext> addop() {
			return getRuleContexts(AddopContext.class);
		}
		public AddopContext addop(int i) {
			return getRuleContext(AddopContext.class,i);
		}
		public SimpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple; }
	}

	public final SimpleContext simple() throws RecognitionException {
		SimpleContext _localctx = new SimpleContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_simple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__33) {
				{
				setState(209);
				match(T__33);
				}
			}

			setState(212);
			term();
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__33) | (1L << T__34) | (1L << T__35))) != 0)) {
				{
				{
				setState(213);
				addop();
				setState(214);
				term();
				}
				}
				setState(220);
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

	public static class AddopContext extends ParserRuleContext {
		public AddopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addop; }
	}

	public final AddopContext addop() throws RecognitionException {
		AddopContext _localctx = new AddopContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_addop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__33) | (1L << T__34) | (1L << T__35))) != 0)) ) {
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

	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<MulopContext> mulop() {
			return getRuleContexts(MulopContext.class);
		}
		public MulopContext mulop(int i) {
			return getRuleContext(MulopContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			factor();
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39))) != 0)) {
				{
				{
				setState(224);
				mulop();
				setState(225);
				factor();
				}
				}
				setState(231);
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

	public static class MulopContext extends ParserRuleContext {
		public MulopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulop; }
	}

	public final MulopContext mulop() throws RecognitionException {
		MulopContext _localctx = new MulopContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_mulop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39))) != 0)) ) {
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

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(alanParser.ID, 0); }
		public SimpleContext simple() {
			return getRuleContext(SimpleContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode NUM() { return getToken(alanParser.NUM, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_factor);
		int _la;
		try {
			setState(262);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				match(ID);
				setState(251);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__13:
					{
					setState(235);
					match(T__13);
					setState(236);
					simple();
					setState(237);
					match(T__14);
					}
					break;
				case T__2:
					{
					setState(239);
					match(T__2);
					setState(248);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__33) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << ID) | (1L << NUM))) != 0)) {
						{
						setState(240);
						expr();
						setState(245);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__3) {
							{
							{
							setState(241);
							match(T__3);
							setState(242);
							expr();
							}
							}
							setState(247);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(250);
					match(T__4);
					}
					break;
				case T__3:
				case T__4:
				case T__7:
				case T__11:
				case T__14:
				case T__18:
				case T__19:
				case T__20:
				case T__24:
				case T__26:
				case T__27:
				case T__28:
				case T__29:
				case T__30:
				case T__31:
				case T__32:
				case T__33:
				case T__34:
				case T__35:
				case T__36:
				case T__37:
				case T__38:
				case T__39:
					break;
				default:
					break;
				}
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				match(NUM);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(254);
				match(T__2);
				setState(255);
				expr();
				setState(256);
				match(T__4);
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 4);
				{
				setState(258);
				match(T__40);
				setState(259);
				factor();
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 5);
				{
				setState(260);
				match(T__41);
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 6);
				{
				setState(261);
				match(T__42);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\u010b\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\7\2\60\n\2\f\2\16"+
		"\2\63\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3@\n\3\f\3\16"+
		"\3C\13\3\5\3E\n\3\3\3\3\3\3\3\5\3J\n\3\3\3\3\3\3\4\3\4\7\4P\n\4\f\4\16"+
		"\4S\13\4\3\4\3\4\3\4\3\5\3\5\5\5Z\n\5\3\6\3\6\3\6\3\6\7\6`\n\6\f\6\16"+
		"\6c\13\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7k\n\7\f\7\16\7n\13\7\5\7p\n\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\5\by\n\b\3\t\3\t\3\t\3\t\3\t\5\t\u0080\n\t\3"+
		"\t\3\t\3\t\3\t\5\t\u0086\n\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u008e\n\n\f\n"+
		"\16\n\u0091\13\n\5\n\u0093\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\7\13\u00a0\n\13\f\13\16\13\u00a3\13\13\3\13\3\13\5\13\u00a7"+
		"\n\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00b1\n\f\3\r\3\r\5\r\u00b5"+
		"\n\r\3\16\3\16\3\16\5\16\u00ba\n\16\3\16\3\16\3\16\5\16\u00bf\n\16\7\16"+
		"\u00c1\n\16\f\16\16\16\u00c4\13\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\5\20\u00d0\n\20\3\21\3\21\3\22\5\22\u00d5\n\22\3\22\3"+
		"\22\3\22\3\22\7\22\u00db\n\22\f\22\16\22\u00de\13\22\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\7\24\u00e6\n\24\f\24\16\24\u00e9\13\24\3\25\3\25\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u00f6\n\26\f\26\16\26\u00f9"+
		"\13\26\5\26\u00fb\n\26\3\26\5\26\u00fe\n\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\5\26\u0109\n\26\3\26\2\2\27\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*\2\6\3\2\13\f\3\2\36#\3\2$&\3\2\'*\2\u011c\2,\3"+
		"\2\2\2\4\66\3\2\2\2\6M\3\2\2\2\bW\3\2\2\2\n[\3\2\2\2\fo\3\2\2\2\16x\3"+
		"\2\2\2\20z\3\2\2\2\22\u0087\3\2\2\2\24\u0096\3\2\2\2\26\u00aa\3\2\2\2"+
		"\30\u00b2\3\2\2\2\32\u00b6\3\2\2\2\34\u00c5\3\2\2\2\36\u00cb\3\2\2\2 "+
		"\u00d1\3\2\2\2\"\u00d4\3\2\2\2$\u00df\3\2\2\2&\u00e1\3\2\2\2(\u00ea\3"+
		"\2\2\2*\u0108\3\2\2\2,-\7\3\2\2-\61\7/\2\2.\60\5\4\3\2/.\3\2\2\2\60\63"+
		"\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\64\3\2\2\2\63\61\3\2\2\2\64\65\5"+
		"\6\4\2\65\3\3\2\2\2\66\67\7\4\2\2\678\7/\2\28D\7\5\2\29:\5\b\5\2:A\7/"+
		"\2\2;<\7\6\2\2<=\5\b\5\2=>\7/\2\2>@\3\2\2\2?;\3\2\2\2@C\3\2\2\2A?\3\2"+
		"\2\2AB\3\2\2\2BE\3\2\2\2CA\3\2\2\2D9\3\2\2\2DE\3\2\2\2EF\3\2\2\2FI\7\7"+
		"\2\2GH\7\b\2\2HJ\5\b\5\2IG\3\2\2\2IJ\3\2\2\2JK\3\2\2\2KL\5\6\4\2L\5\3"+
		"\2\2\2MQ\7\t\2\2NP\5\n\6\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RT\3"+
		"\2\2\2SQ\3\2\2\2TU\5\f\7\2UV\7\n\2\2V\7\3\2\2\2WY\t\2\2\2XZ\7\r\2\2YX"+
		"\3\2\2\2YZ\3\2\2\2Z\t\3\2\2\2[\\\5\b\5\2\\a\7/\2\2]^\7\6\2\2^`\7/\2\2"+
		"_]\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2bd\3\2\2\2ca\3\2\2\2de\7\16\2"+
		"\2e\13\3\2\2\2fp\7\17\2\2gl\5\16\b\2hi\7\16\2\2ik\5\16\b\2jh\3\2\2\2k"+
		"n\3\2\2\2lj\3\2\2\2lm\3\2\2\2mp\3\2\2\2nl\3\2\2\2of\3\2\2\2og\3\2\2\2"+
		"p\r\3\2\2\2qy\5\20\t\2ry\5\22\n\2sy\5\24\13\2ty\5\26\f\2uy\5\30\r\2vy"+
		"\5\32\16\2wy\5\34\17\2xq\3\2\2\2xr\3\2\2\2xs\3\2\2\2xt\3\2\2\2xu\3\2\2"+
		"\2xv\3\2\2\2xw\3\2\2\2y\17\3\2\2\2z\177\7/\2\2{|\7\20\2\2|}\5\"\22\2}"+
		"~\7\21\2\2~\u0080\3\2\2\2\177{\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\3"+
		"\2\2\2\u0081\u0085\7\22\2\2\u0082\u0086\5\36\20\2\u0083\u0084\7\r\2\2"+
		"\u0084\u0086\5\"\22\2\u0085\u0082\3\2\2\2\u0085\u0083\3\2\2\2\u0086\21"+
		"\3\2\2\2\u0087\u0088\7\23\2\2\u0088\u0089\7/\2\2\u0089\u0092\7\5\2\2\u008a"+
		"\u008f\5\36\20\2\u008b\u008c\7\6\2\2\u008c\u008e\5\36\20\2\u008d\u008b"+
		"\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u008a\3\2\2\2\u0092\u0093\3\2"+
		"\2\2\u0093\u0094\3\2\2\2\u0094\u0095\7\7\2\2\u0095\23\3\2\2\2\u0096\u0097"+
		"\7\24\2\2\u0097\u0098\5\36\20\2\u0098\u0099\7\25\2\2\u0099\u00a1\5\f\7"+
		"\2\u009a\u009b\7\26\2\2\u009b\u009c\5\36\20\2\u009c\u009d\7\25\2\2\u009d"+
		"\u009e\5\f\7\2\u009e\u00a0\3\2\2\2\u009f\u009a\3\2\2\2\u00a0\u00a3\3\2"+
		"\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a6\3\2\2\2\u00a3"+
		"\u00a1\3\2\2\2\u00a4\u00a5\7\27\2\2\u00a5\u00a7\5\f\7\2\u00a6\u00a4\3"+
		"\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\7\n\2\2\u00a9"+
		"\25\3\2\2\2\u00aa\u00ab\7\30\2\2\u00ab\u00b0\7/\2\2\u00ac\u00ad\7\20\2"+
		"\2\u00ad\u00ae\5\"\22\2\u00ae\u00af\7\21\2\2\u00af\u00b1\3\2\2\2\u00b0"+
		"\u00ac\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\27\3\2\2\2\u00b2\u00b4\7\31\2"+
		"\2\u00b3\u00b5\5\36\20\2\u00b4\u00b3\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"\31\3\2\2\2\u00b6\u00b9\7\32\2\2\u00b7\u00ba\7.\2\2\u00b8\u00ba\5\36\20"+
		"\2\u00b9\u00b7\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00c2\3\2\2\2\u00bb\u00be"+
		"\7\33\2\2\u00bc\u00bf\7.\2\2\u00bd\u00bf\5\36\20\2\u00be\u00bc\3\2\2\2"+
		"\u00be\u00bd\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00bb\3\2\2\2\u00c1\u00c4"+
		"\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\33\3\2\2\2\u00c4"+
		"\u00c2\3\2\2\2\u00c5\u00c6\7\34\2\2\u00c6\u00c7\5\36\20\2\u00c7\u00c8"+
		"\7\35\2\2\u00c8\u00c9\5\f\7\2\u00c9\u00ca\7\n\2\2\u00ca\35\3\2\2\2\u00cb"+
		"\u00cf\5\"\22\2\u00cc\u00cd\5 \21\2\u00cd\u00ce\5\"\22\2\u00ce\u00d0\3"+
		"\2\2\2\u00cf\u00cc\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\37\3\2\2\2\u00d1"+
		"\u00d2\t\3\2\2\u00d2!\3\2\2\2\u00d3\u00d5\7$\2\2\u00d4\u00d3\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00dc\5&\24\2\u00d7\u00d8\5$"+
		"\23\2\u00d8\u00d9\5&\24\2\u00d9\u00db\3\2\2\2\u00da\u00d7\3\2\2\2\u00db"+
		"\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd#\3\2\2\2"+
		"\u00de\u00dc\3\2\2\2\u00df\u00e0\t\4\2\2\u00e0%\3\2\2\2\u00e1\u00e7\5"+
		"*\26\2\u00e2\u00e3\5(\25\2\u00e3\u00e4\5*\26\2\u00e4\u00e6\3\2\2\2\u00e5"+
		"\u00e2\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2"+
		"\2\2\u00e8\'\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb\t\5\2\2\u00eb)\3"+
		"\2\2\2\u00ec\u00fd\7/\2\2\u00ed\u00ee\7\20\2\2\u00ee\u00ef\5\"\22\2\u00ef"+
		"\u00f0\7\21\2\2\u00f0\u00fe\3\2\2\2\u00f1\u00fa\7\5\2\2\u00f2\u00f7\5"+
		"\36\20\2\u00f3\u00f4\7\6\2\2\u00f4\u00f6\5\36\20\2\u00f5\u00f3\3\2\2\2"+
		"\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fb"+
		"\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00f2\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"\u00fc\3\2\2\2\u00fc\u00fe\7\7\2\2\u00fd\u00ed\3\2\2\2\u00fd\u00f1\3\2"+
		"\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0109\3\2\2\2\u00ff\u0109\7\60\2\2\u0100"+
		"\u0101\7\5\2\2\u0101\u0102\5\36\20\2\u0102\u0103\7\7\2\2\u0103\u0109\3"+
		"\2\2\2\u0104\u0105\7+\2\2\u0105\u0109\5*\26\2\u0106\u0109\7,\2\2\u0107"+
		"\u0109\7-\2\2\u0108\u00ec\3\2\2\2\u0108\u00ff\3\2\2\2\u0108\u0100\3\2"+
		"\2\2\u0108\u0104\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0107\3\2\2\2\u0109"+
		"+\3\2\2\2\37\61ADIQYalox\177\u0085\u008f\u0092\u00a1\u00a6\u00b0\u00b4"+
		"\u00b9\u00be\u00c2\u00cf\u00d4\u00dc\u00e7\u00f7\u00fa\u00fd\u0108";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}