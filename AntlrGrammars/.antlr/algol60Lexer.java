// Generated from /home/abdullah/Git/Studies/Honours/CS713/Grammar_Metrics/AntlrGrammars/algol60-algol60.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class algol60Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Array_=1, Begin_=2, Boolean_=3, Comment_=4, Do_=5, Else_=6, End_=7, False_=8, 
		For_=9, Goto_=10, If_=11, Integer_=12, Label_=13, Own_=14, Procedure_=15, 
		Real_=16, Step_=17, String_=18, Switch_=19, Then_=20, True_=21, Until_=22, 
		Value_=23, While_=24, And_=25, Assign_=26, Colon_=27, Comma_=28, Dot_=29, 
		Divide_=30, Eor_=31, Eq_=32, Equiv_=33, Exp_=34, Gt_=35, Ge_=36, Includes_=37, 
		Lb_=38, Le_=39, LP_=40, Lt_=41, Minus_=42, Mult_=43, Ne_=44, Not_=45, 
		Or_=46, Plus_=47, Rb_=48, Rp_=49, Semi_=50, Underscore_=51, ULCorner=52, 
		URCorner=53, Logical_value=54, Relational_operator=55, Comment=56, Identifier=57, 
		Unsigned_integer=58, Decimal_fraction=59, Exponential_part=60, Decimal_number=61, 
		Unsigned_number=62, String=63, WS=64;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Basic_symbol", "Array_", "Begin_", "Boolean_", "Comment_", "Do_", "Else_", 
			"End_", "False_", "For_", "Goto_", "If_", "Integer_", "Label_", "Own_", 
			"Procedure_", "Real_", "Step_", "String_", "Switch_", "Then_", "True_", 
			"Until_", "Value_", "While_", "And_", "Assign_", "Colon_", "Comma_", 
			"Dot_", "Divide_", "Eor_", "Eq_", "Equiv_", "Exp_", "Gt_", "Ge_", "Includes_", 
			"Lb_", "Le_", "LP_", "Lt_", "Minus_", "Mult_", "Ne_", "Not_", "Or_", 
			"Plus_", "Rb_", "Rp_", "Semi_", "Underscore_", "Letter", "Digit", "ULCorner_f", 
			"ULCorner", "URCorner_f", "URCorner", "Logical_value_f", "Logical_value", 
			"Delimiter", "Operator", "Arithmetic_operator", "Relational_operator_f", 
			"Relational_operator", "Logical_operator", "Sequential_operator", "Separator", 
			"Bracket", "Declarator", "Specificator", "Comment", "Identifier", "Unsigned_integer", 
			"Decimal_fraction", "Exponential_part", "Decimal_number", "Unsigned_number", 
			"Proper_string", "Open_string", "Closed_string", "StdString", "String", 
			"WS", "Ws"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "':='", "':'", "','", "'.'", null, "'^='", "'='", "'\u2261'", 
			null, "'>'", null, "'\u2283'", "'['", null, "'('", "'<'", null, null, 
			null, null, null, "'+'", "']'", "')'", "';'", "'_'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Array_", "Begin_", "Boolean_", "Comment_", "Do_", "Else_", "End_", 
			"False_", "For_", "Goto_", "If_", "Integer_", "Label_", "Own_", "Procedure_", 
			"Real_", "Step_", "String_", "Switch_", "Then_", "True_", "Until_", "Value_", 
			"While_", "And_", "Assign_", "Colon_", "Comma_", "Dot_", "Divide_", "Eor_", 
			"Eq_", "Equiv_", "Exp_", "Gt_", "Ge_", "Includes_", "Lb_", "Le_", "LP_", 
			"Lt_", "Minus_", "Mult_", "Ne_", "Not_", "Or_", "Plus_", "Rb_", "Rp_", 
			"Semi_", "Underscore_", "ULCorner", "URCorner", "Logical_value", "Relational_operator", 
			"Comment", "Identifier", "Unsigned_integer", "Decimal_fraction", "Exponential_part", 
			"Decimal_number", "Unsigned_number", "String", "WS"
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


	public algol60Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "algol60-algol60.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2B\u024d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\3\2\3\2\3\2\3\2\5\2\u00b2\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\7\f\u00e9\n\f\f\f\16"+
		"\f\u00ec\13\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3"+
		"\37\3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\5&\u015f\n&\3\'"+
		"\3\'\3(\3(\3)\3)\3)\5)\u0168\n)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3.\5.\u0175"+
		"\n.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65"+
		"\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\5<\u0193\n<\3=\3=\3"+
		">\3>\3>\3>\3>\5>\u019c\n>\3?\3?\3?\3?\5?\u01a2\n?\3@\3@\3@\3@\3@\5@\u01a9"+
		"\n@\3A\3A\3A\3A\3A\3A\5A\u01b1\nA\3B\3B\3C\3C\3C\3C\3C\5C\u01ba\nC\3D"+
		"\3D\3D\3D\3D\3D\5D\u01c2\nD\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\5E\u01d0"+
		"\nE\3F\3F\3F\3F\3F\3F\3F\5F\u01d9\nF\3G\3G\3G\3G\3G\3G\3G\5G\u01e2\nG"+
		"\3H\3H\3H\5H\u01e7\nH\3I\3I\6I\u01eb\nI\rI\16I\u01ec\3I\3I\3I\3I\3J\3"+
		"J\6J\u01f5\nJ\rJ\16J\u01f6\3K\6K\u01fa\nK\rK\16K\u01fb\3L\3L\3L\3M\3M"+
		"\3M\3M\3M\3M\3M\3M\3M\3M\5M\u020b\nM\3N\3N\3N\3N\3N\5N\u0212\nN\3O\3O"+
		"\3O\3O\3O\5O\u0219\nO\3P\7P\u021c\nP\fP\16P\u021f\13P\3Q\3Q\3Q\3Q\3Q\5"+
		"Q\u0226\nQ\3R\3R\3R\3R\3S\3S\3S\3S\5S\u0230\nS\3T\3T\3T\7T\u0235\nT\f"+
		"T\16T\u0238\13T\3T\3T\3T\7T\u023d\nT\fT\16T\u0240\13T\3T\5T\u0243\nT\3"+
		"U\3U\3U\3U\3V\6V\u024a\nV\rV\16V\u024b\2\2W\3\2\5\3\7\4\t\5\13\6\r\7\17"+
		"\b\21\t\23\n\25\13\27\f\31\r\33\16\35\17\37\20!\21#\22%\23\'\24)\25+\26"+
		"-\27/\30\61\31\63\32\65\33\67\349\35;\36=\37? A!C\"E#G$I%K&M\'O(Q)S*U"+
		"+W,Y-[.]/_\60a\61c\62e\63g\64i\65k\2m\2o\2q\66s\2u\67w\2y8{\2}\2\177\2"+
		"\u0081\2\u00839\u0085\2\u0087\2\u0089\2\u008b\2\u008d\2\u008f\2\u0091"+
		":\u0093;\u0095<\u0097=\u0099>\u009b?\u009d@\u009f\2\u00a1\2\u00a3\2\u00a5"+
		"\2\u00a7A\u00a9B\u00ab\2\3\2%\4\2CCcc\4\2TTtt\4\2[[{{\4\2DDdd\4\2GGgg"+
		"\4\2IIii\4\2KKkk\4\2PPpp\4\2QQqq\4\2NNnn\4\2EEee\4\2OOoo\4\2VVvv\4\2F"+
		"Fff\4\2UUuu\4\2HHhh\4\2YYyy\4\2RRrr\4\2WWww\4\2JJjj\4\2XXxx\4\2((\u22c2"+
		"\u22c2\4\2\61\61\u00f9\u00f9\4\2``\u2193\u2193\4\2//\u2015\u2015\4\2,"+
		",\u00d9\u00d9\4\2##\u00ae\u00ae\4\2~~\u22c3\u22c3\5\2C\\aac|\4\2\u230a"+
		"\u230a\u231f\u231f\3\2==\3\2\u231e\u231f\3\2$$\3\2))\5\2\13\f\17\17\""+
		"\"\2\u0282\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U"+
		"\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2"+
		"\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2q\3\2\2\2\2u\3\2\2\2"+
		"\2y\3\2\2\2\2\u0083\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3"+
		"\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2"+
		"\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\3\u00b1\3\2\2\2\5\u00b3\3\2\2\2\7\u00b9"+
		"\3\2\2\2\t\u00bf\3\2\2\2\13\u00c7\3\2\2\2\r\u00cf\3\2\2\2\17\u00d2\3\2"+
		"\2\2\21\u00d7\3\2\2\2\23\u00db\3\2\2\2\25\u00e1\3\2\2\2\27\u00e5\3\2\2"+
		"\2\31\u00f0\3\2\2\2\33\u00f3\3\2\2\2\35\u00fb\3\2\2\2\37\u0101\3\2\2\2"+
		"!\u0105\3\2\2\2#\u010f\3\2\2\2%\u0114\3\2\2\2\'\u0119\3\2\2\2)\u0120\3"+
		"\2\2\2+\u0127\3\2\2\2-\u012c\3\2\2\2/\u0131\3\2\2\2\61\u0137\3\2\2\2\63"+
		"\u013d\3\2\2\2\65\u0143\3\2\2\2\67\u0145\3\2\2\29\u0148\3\2\2\2;\u014a"+
		"\3\2\2\2=\u014c\3\2\2\2?\u014e\3\2\2\2A\u0150\3\2\2\2C\u0153\3\2\2\2E"+
		"\u0155\3\2\2\2G\u0157\3\2\2\2I\u0159\3\2\2\2K\u015e\3\2\2\2M\u0160\3\2"+
		"\2\2O\u0162\3\2\2\2Q\u0167\3\2\2\2S\u0169\3\2\2\2U\u016b\3\2\2\2W\u016d"+
		"\3\2\2\2Y\u016f\3\2\2\2[\u0174\3\2\2\2]\u0176\3\2\2\2_\u0178\3\2\2\2a"+
		"\u017a\3\2\2\2c\u017c\3\2\2\2e\u017e\3\2\2\2g\u0180\3\2\2\2i\u0182\3\2"+
		"\2\2k\u0184\3\2\2\2m\u0186\3\2\2\2o\u0188\3\2\2\2q\u018a\3\2\2\2s\u018c"+
		"\3\2\2\2u\u018e\3\2\2\2w\u0192\3\2\2\2y\u0194\3\2\2\2{\u019b\3\2\2\2}"+
		"\u01a1\3\2\2\2\177\u01a8\3\2\2\2\u0081\u01b0\3\2\2\2\u0083\u01b2\3\2\2"+
		"\2\u0085\u01b9\3\2\2\2\u0087\u01c1\3\2\2\2\u0089\u01cf\3\2\2\2\u008b\u01d8"+
		"\3\2\2\2\u008d\u01e1\3\2\2\2\u008f\u01e6\3\2\2\2\u0091\u01e8\3\2\2\2\u0093"+
		"\u01f4\3\2\2\2\u0095\u01f9\3\2\2\2\u0097\u01fd\3\2\2\2\u0099\u0200\3\2"+
		"\2\2\u009b\u0211\3\2\2\2\u009d\u0218\3\2\2\2\u009f\u021d\3\2\2\2\u00a1"+
		"\u0225\3\2\2\2\u00a3\u0227\3\2\2\2\u00a5\u022f\3\2\2\2\u00a7\u0242\3\2"+
		"\2\2\u00a9\u0244\3\2\2\2\u00ab\u0249\3\2\2\2\u00ad\u00b2\5k\66\2\u00ae"+
		"\u00b2\5m\67\2\u00af\u00b2\5w<\2\u00b0\u00b2\5{>\2\u00b1\u00ad\3\2\2\2"+
		"\u00b1\u00ae\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\4\3"+
		"\2\2\2\u00b3\u00b4\t\2\2\2\u00b4\u00b5\t\3\2\2\u00b5\u00b6\t\3\2\2\u00b6"+
		"\u00b7\t\2\2\2\u00b7\u00b8\t\4\2\2\u00b8\6\3\2\2\2\u00b9\u00ba\t\5\2\2"+
		"\u00ba\u00bb\t\6\2\2\u00bb\u00bc\t\7\2\2\u00bc\u00bd\t\b\2\2\u00bd\u00be"+
		"\t\t\2\2\u00be\b\3\2\2\2\u00bf\u00c0\t\5\2\2\u00c0\u00c1\t\n\2\2\u00c1"+
		"\u00c2\t\n\2\2\u00c2\u00c3\t\13\2\2\u00c3\u00c4\t\6\2\2\u00c4\u00c5\t"+
		"\2\2\2\u00c5\u00c6\t\t\2\2\u00c6\n\3\2\2\2\u00c7\u00c8\t\f\2\2\u00c8\u00c9"+
		"\t\n\2\2\u00c9\u00ca\t\r\2\2\u00ca\u00cb\t\r\2\2\u00cb\u00cc\t\6\2\2\u00cc"+
		"\u00cd\t\t\2\2\u00cd\u00ce\t\16\2\2\u00ce\f\3\2\2\2\u00cf\u00d0\t\17\2"+
		"\2\u00d0\u00d1\t\n\2\2\u00d1\16\3\2\2\2\u00d2\u00d3\t\6\2\2\u00d3\u00d4"+
		"\t\13\2\2\u00d4\u00d5\t\20\2\2\u00d5\u00d6\t\6\2\2\u00d6\20\3\2\2\2\u00d7"+
		"\u00d8\t\6\2\2\u00d8\u00d9\t\t\2\2\u00d9\u00da\t\17\2\2\u00da\22\3\2\2"+
		"\2\u00db\u00dc\t\21\2\2\u00dc\u00dd\t\2\2\2\u00dd\u00de\t\13\2\2\u00de"+
		"\u00df\t\20\2\2\u00df\u00e0\t\6\2\2\u00e0\24\3\2\2\2\u00e1\u00e2\t\21"+
		"\2\2\u00e2\u00e3\t\n\2\2\u00e3\u00e4\t\3\2\2\u00e4\26\3\2\2\2\u00e5\u00e6"+
		"\t\7\2\2\u00e6\u00ea\t\n\2\2\u00e7\u00e9\5\u00abV\2\u00e8\u00e7\3\2\2"+
		"\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed"+
		"\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ee\t\16\2\2\u00ee\u00ef\t\n\2\2"+
		"\u00ef\30\3\2\2\2\u00f0\u00f1\t\b\2\2\u00f1\u00f2\t\21\2\2\u00f2\32\3"+
		"\2\2\2\u00f3\u00f4\t\b\2\2\u00f4\u00f5\t\t\2\2\u00f5\u00f6\t\16\2\2\u00f6"+
		"\u00f7\t\6\2\2\u00f7\u00f8\t\7\2\2\u00f8\u00f9\t\6\2\2\u00f9\u00fa\t\3"+
		"\2\2\u00fa\34\3\2\2\2\u00fb\u00fc\t\13\2\2\u00fc\u00fd\t\2\2\2\u00fd\u00fe"+
		"\t\5\2\2\u00fe\u00ff\t\6\2\2\u00ff\u0100\t\13\2\2\u0100\36\3\2\2\2\u0101"+
		"\u0102\t\n\2\2\u0102\u0103\t\22\2\2\u0103\u0104\t\t\2\2\u0104 \3\2\2\2"+
		"\u0105\u0106\t\23\2\2\u0106\u0107\t\3\2\2\u0107\u0108\t\n\2\2\u0108\u0109"+
		"\t\f\2\2\u0109\u010a\t\6\2\2\u010a\u010b\t\17\2\2\u010b\u010c\t\24\2\2"+
		"\u010c\u010d\t\3\2\2\u010d\u010e\t\6\2\2\u010e\"\3\2\2\2\u010f\u0110\t"+
		"\3\2\2\u0110\u0111\t\6\2\2\u0111\u0112\t\2\2\2\u0112\u0113\t\13\2\2\u0113"+
		"$\3\2\2\2\u0114\u0115\t\20\2\2\u0115\u0116\t\16\2\2\u0116\u0117\t\6\2"+
		"\2\u0117\u0118\t\23\2\2\u0118&\3\2\2\2\u0119\u011a\t\20\2\2\u011a\u011b"+
		"\t\16\2\2\u011b\u011c\t\3\2\2\u011c\u011d\t\b\2\2\u011d\u011e\t\t\2\2"+
		"\u011e\u011f\t\7\2\2\u011f(\3\2\2\2\u0120\u0121\t\20\2\2\u0121\u0122\t"+
		"\22\2\2\u0122\u0123\t\b\2\2\u0123\u0124\t\16\2\2\u0124\u0125\t\f\2\2\u0125"+
		"\u0126\t\25\2\2\u0126*\3\2\2\2\u0127\u0128\t\16\2\2\u0128\u0129\t\25\2"+
		"\2\u0129\u012a\t\6\2\2\u012a\u012b\t\t\2\2\u012b,\3\2\2\2\u012c\u012d"+
		"\t\16\2\2\u012d\u012e\t\3\2\2\u012e\u012f\t\24\2\2\u012f\u0130\t\6\2\2"+
		"\u0130.\3\2\2\2\u0131\u0132\t\24\2\2\u0132\u0133\t\t\2\2\u0133\u0134\t"+
		"\16\2\2\u0134\u0135\t\b\2\2\u0135\u0136\t\13\2\2\u0136\60\3\2\2\2\u0137"+
		"\u0138\t\26\2\2\u0138\u0139\t\2\2\2\u0139\u013a\t\13\2\2\u013a\u013b\t"+
		"\24\2\2\u013b\u013c\t\6\2\2\u013c\62\3\2\2\2\u013d\u013e\t\22\2\2\u013e"+
		"\u013f\t\25\2\2\u013f\u0140\t\b\2\2\u0140\u0141\t\13\2\2\u0141\u0142\t"+
		"\6\2\2\u0142\64\3\2\2\2\u0143\u0144\t\27\2\2\u0144\66\3\2\2\2\u0145\u0146"+
		"\7<\2\2\u0146\u0147\7?\2\2\u01478\3\2\2\2\u0148\u0149\7<\2\2\u0149:\3"+
		"\2\2\2\u014a\u014b\7.\2\2\u014b<\3\2\2\2\u014c\u014d\7\60\2\2\u014d>\3"+
		"\2\2\2\u014e\u014f\t\30\2\2\u014f@\3\2\2\2\u0150\u0151\7`\2\2\u0151\u0152"+
		"\7?\2\2\u0152B\3\2\2\2\u0153\u0154\7?\2\2\u0154D\3\2\2\2\u0155\u0156\7"+
		"\u2263\2\2\u0156F\3\2\2\2\u0157\u0158\t\31\2\2\u0158H\3\2\2\2\u0159\u015a"+
		"\7@\2\2\u015aJ\3\2\2\2\u015b\u015f\7\u2267\2\2\u015c\u015d\7@\2\2\u015d"+
		"\u015f\7?\2\2\u015e\u015b\3\2\2\2\u015e\u015c\3\2\2\2\u015fL\3\2\2\2\u0160"+
		"\u0161\7\u2285\2\2\u0161N\3\2\2\2\u0162\u0163\7]\2\2\u0163P\3\2\2\2\u0164"+
		"\u0165\7>\2\2\u0165\u0168\7?\2\2\u0166\u0168\7\u2266\2\2\u0167\u0164\3"+
		"\2\2\2\u0167\u0166\3\2\2\2\u0168R\3\2\2\2\u0169\u016a\7*\2\2\u016aT\3"+
		"\2\2\2\u016b\u016c\7>\2\2\u016cV\3\2\2\2\u016d\u016e\t\32\2\2\u016eX\3"+
		"\2\2\2\u016f\u0170\t\33\2\2\u0170Z\3\2\2\2\u0171\u0175\7\u2262\2\2\u0172"+
		"\u0173\7#\2\2\u0173\u0175\7?\2\2\u0174\u0171\3\2\2\2\u0174\u0172\3\2\2"+
		"\2\u0175\\\3\2\2\2\u0176\u0177\t\34\2\2\u0177^\3\2\2\2\u0178\u0179\t\35"+
		"\2\2\u0179`\3\2\2\2\u017a\u017b\7-\2\2\u017bb\3\2\2\2\u017c\u017d\7_\2"+
		"\2\u017dd\3\2\2\2\u017e\u017f\7+\2\2\u017ff\3\2\2\2\u0180\u0181\7=\2\2"+
		"\u0181h\3\2\2\2\u0182\u0183\7a\2\2\u0183j\3\2\2\2\u0184\u0185\t\36\2\2"+
		"\u0185l\3\2\2\2\u0186\u0187\4\62;\2\u0187n\3\2\2\2\u0188\u0189\7\u231e"+
		"\2\2\u0189p\3\2\2\2\u018a\u018b\5o8\2\u018br\3\2\2\2\u018c\u018d\7\u231f"+
		"\2\2\u018dt\3\2\2\2\u018e\u018f\5s:\2\u018fv\3\2\2\2\u0190\u0193\5-\27"+
		"\2\u0191\u0193\5\23\n\2\u0192\u0190\3\2\2\2\u0192\u0191\3\2\2\2\u0193"+
		"x\3\2\2\2\u0194\u0195\5w<\2\u0195z\3\2\2\2\u0196\u019c\5}?\2\u0197\u019c"+
		"\5\u0089E\2\u0198\u019c\5\u008bF\2\u0199\u019c\5\u008dG\2\u019a\u019c"+
		"\5\u008fH\2\u019b\u0196\3\2\2\2\u019b\u0197\3\2\2\2\u019b\u0198\3\2\2"+
		"\2\u019b\u0199\3\2\2\2\u019b\u019a\3\2\2\2\u019c|\3\2\2\2\u019d\u01a2"+
		"\5\177@\2\u019e\u01a2\5\u0081A\2\u019f\u01a2\5\u0085C\2\u01a0\u01a2\5"+
		"\u0087D\2\u01a1\u019d\3\2\2\2\u01a1\u019e\3\2\2\2\u01a1\u019f\3\2\2\2"+
		"\u01a1\u01a0\3\2\2\2\u01a2~\3\2\2\2\u01a3\u01a9\5a\61\2\u01a4\u01a9\5"+
		"W,\2\u01a5\u01a9\5Y-\2\u01a6\u01a9\5? \2\u01a7\u01a9\5G$\2\u01a8\u01a3"+
		"\3\2\2\2\u01a8\u01a4\3\2\2\2\u01a8\u01a5\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8"+
		"\u01a7\3\2\2\2\u01a9\u0080\3\2\2\2\u01aa\u01b1\5U+\2\u01ab\u01b1\5Q)\2"+
		"\u01ac\u01b1\5C\"\2\u01ad\u01b1\5[.\2\u01ae\u01b1\5I%\2\u01af\u01b1\5"+
		"K&\2\u01b0\u01aa\3\2\2\2\u01b0\u01ab\3\2\2\2\u01b0\u01ac\3\2\2\2\u01b0"+
		"\u01ad\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01af\3\2\2\2\u01b1\u0082\3\2"+
		"\2\2\u01b2\u01b3\5\u0081A\2\u01b3\u0084\3\2\2\2\u01b4\u01ba\5E#\2\u01b5"+
		"\u01ba\5M\'\2\u01b6\u01ba\5_\60\2\u01b7\u01ba\5\65\33\2\u01b8\u01ba\5"+
		"]/\2\u01b9\u01b4\3\2\2\2\u01b9\u01b5\3\2\2\2\u01b9\u01b6\3\2\2\2\u01b9"+
		"\u01b7\3\2\2\2\u01b9\u01b8\3\2\2\2\u01ba\u0086\3\2\2\2\u01bb\u01c2\5\27"+
		"\f\2\u01bc\u01c2\5\31\r\2\u01bd\u01c2\5+\26\2\u01be\u01c2\5\17\b\2\u01bf"+
		"\u01c2\5\25\13\2\u01c0\u01c2\5\r\7\2\u01c1\u01bb\3\2\2\2\u01c1\u01bc\3"+
		"\2\2\2\u01c1\u01bd\3\2\2\2\u01c1\u01be\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c1"+
		"\u01c0\3\2\2\2\u01c2\u0088\3\2\2\2\u01c3\u01d0\5;\36\2\u01c4\u01d0\5="+
		"\37\2\u01c5\u01c6\7\63\2\2\u01c6\u01d0\7\62\2\2\u01c7\u01d0\59\35\2\u01c8"+
		"\u01d0\5g\64\2\u01c9\u01d0\5\67\34\2\u01ca\u01d0\5i\65\2\u01cb\u01d0\5"+
		"%\23\2\u01cc\u01d0\5/\30\2\u01cd\u01d0\5\63\32\2\u01ce\u01d0\5\13\6\2"+
		"\u01cf\u01c3\3\2\2\2\u01cf\u01c4\3\2\2\2\u01cf\u01c5\3\2\2\2\u01cf\u01c7"+
		"\3\2\2\2\u01cf\u01c8\3\2\2\2\u01cf\u01c9\3\2\2\2\u01cf\u01ca\3\2\2\2\u01cf"+
		"\u01cb\3\2\2\2\u01cf\u01cc\3\2\2\2\u01cf\u01cd\3\2\2\2\u01cf\u01ce\3\2"+
		"\2\2\u01d0\u008a\3\2\2\2\u01d1\u01d9\5S*\2\u01d2\u01d9\5e\63\2\u01d3\u01d9"+
		"\5O(\2\u01d4\u01d9\5c\62\2\u01d5\u01d9\t\37\2\2\u01d6\u01d9\5\7\4\2\u01d7"+
		"\u01d9\5\21\t\2\u01d8\u01d1\3\2\2\2\u01d8\u01d2\3\2\2\2\u01d8\u01d3\3"+
		"\2\2\2\u01d8\u01d4\3\2\2\2\u01d8\u01d5\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d8"+
		"\u01d7\3\2\2\2\u01d9\u008c\3\2\2\2\u01da\u01e2\5\37\20\2\u01db\u01e2\5"+
		"\t\5\2\u01dc\u01e2\5\33\16\2\u01dd\u01e2\5#\22\2\u01de\u01e2\5\5\3\2\u01df"+
		"\u01e2\5)\25\2\u01e0\u01e2\5!\21\2\u01e1\u01da\3\2\2\2\u01e1\u01db\3\2"+
		"\2\2\u01e1\u01dc\3\2\2\2\u01e1\u01dd\3\2\2\2\u01e1\u01de\3\2\2\2\u01e1"+
		"\u01df\3\2\2\2\u01e1\u01e0\3\2\2\2\u01e2\u008e\3\2\2\2\u01e3\u01e7\5\'"+
		"\24\2\u01e4\u01e7\5\35\17\2\u01e5\u01e7\5\61\31\2\u01e6\u01e3\3\2\2\2"+
		"\u01e6\u01e4\3\2\2\2\u01e6\u01e5\3\2\2\2\u01e7\u0090\3\2\2\2\u01e8\u01ea"+
		"\5\13\6\2\u01e9\u01eb\n \2\2\u01ea\u01e9\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec"+
		"\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01ef\5g"+
		"\64\2\u01ef\u01f0\3\2\2\2\u01f0\u01f1\bI\2\2\u01f1\u0092\3\2\2\2\u01f2"+
		"\u01f5\5k\66\2\u01f3\u01f5\5m\67\2\u01f4\u01f2\3\2\2\2\u01f4\u01f3\3\2"+
		"\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7"+
		"\u0094\3\2\2\2\u01f8\u01fa\5m\67\2\u01f9\u01f8\3\2\2\2\u01fa\u01fb\3\2"+
		"\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u0096\3\2\2\2\u01fd"+
		"\u01fe\5=\37\2\u01fe\u01ff\5\u0095K\2\u01ff\u0098\3\2\2\2\u0200\u0201"+
		"\7\63\2\2\u0201\u0202\7\62\2\2\u0202\u020a\3\2\2\2\u0203\u020b\5\u0095"+
		"K\2\u0204\u0205\5a\61\2\u0205\u0206\5\u0095K\2\u0206\u020b\3\2\2\2\u0207"+
		"\u0208\5W,\2\u0208\u0209\5\u0095K\2\u0209\u020b\3\2\2\2\u020a\u0203\3"+
		"\2\2\2\u020a\u0204\3\2\2\2\u020a\u0207\3\2\2\2\u020b\u009a\3\2\2\2\u020c"+
		"\u0212\5\u0095K\2\u020d\u0212\5\u0097L\2\u020e\u020f\5\u0095K\2\u020f"+
		"\u0210\5\u0097L\2\u0210\u0212\3\2\2\2\u0211\u020c\3\2\2\2\u0211\u020d"+
		"\3\2\2\2\u0211\u020e\3\2\2\2\u0212\u009c\3\2\2\2\u0213\u0219\5\u009bN"+
		"\2\u0214\u0219\5\u0099M\2\u0215\u0216\5\u009bN\2\u0216\u0217\5\u0099M"+
		"\2\u0217\u0219\3\2\2\2\u0218\u0213\3\2\2\2\u0218\u0214\3\2\2\2\u0218\u0215"+
		"\3\2\2\2\u0219\u009e\3\2\2\2\u021a\u021c\n!\2\2\u021b\u021a\3\2\2\2\u021c"+
		"\u021f\3\2\2\2\u021d\u021b\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u00a0\3\2"+
		"\2\2\u021f\u021d\3\2\2\2\u0220\u0226\5\u009fP\2\u0221\u0222\5\u009fP\2"+
		"\u0222\u0223\5\u00a3R\2\u0223\u0224\5\u00a1Q\2\u0224\u0226\3\2\2\2\u0225"+
		"\u0220\3\2\2\2\u0225\u0221\3\2\2\2\u0226\u00a2\3\2\2\2\u0227\u0228\5q"+
		"9\2\u0228\u0229\5\u00a1Q\2\u0229\u022a\5u;\2\u022a\u00a4\3\2\2\2\u022b"+
		"\u0230\5\u00a3R\2\u022c\u022d\5\u00a3R\2\u022d\u022e\5\u00a5S\2\u022e"+
		"\u0230\3\2\2\2\u022f\u022b\3\2\2\2\u022f\u022c\3\2\2\2\u0230\u00a6\3\2"+
		"\2\2\u0231\u0243\5\u00a5S\2\u0232\u0236\7$\2\2\u0233\u0235\n\"\2\2\u0234"+
		"\u0233\3\2\2\2\u0235\u0238\3\2\2\2\u0236\u0234\3\2\2\2\u0236\u0237\3\2"+
		"\2\2\u0237\u0239\3\2\2\2\u0238\u0236\3\2\2\2\u0239\u0243\7$\2\2\u023a"+
		"\u023e\7b\2\2\u023b\u023d\n#\2\2\u023c\u023b\3\2\2\2\u023d\u0240\3\2\2"+
		"\2\u023e\u023c\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0241\3\2\2\2\u0240\u023e"+
		"\3\2\2\2\u0241\u0243\7)\2\2\u0242\u0231\3\2\2\2\u0242\u0232\3\2\2\2\u0242"+
		"\u023a\3\2\2\2\u0243\u00a8\3\2\2\2\u0244\u0245\5\u00abV\2\u0245\u0246"+
		"\3\2\2\2\u0246\u0247\bU\2\2\u0247\u00aa\3\2\2\2\u0248\u024a\t$\2\2\u0249"+
		"\u0248\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u0249\3\2\2\2\u024b\u024c\3\2"+
		"\2\2\u024c\u00ac\3\2\2\2!\2\u00b1\u00ea\u015e\u0167\u0174\u0192\u019b"+
		"\u01a1\u01a8\u01b0\u01b9\u01c1\u01cf\u01d8\u01e1\u01e6\u01ec\u01f4\u01f6"+
		"\u01fb\u020a\u0211\u0218\u021d\u0225\u022f\u0236\u023e\u0242\u024b\3\2"+
		"\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}