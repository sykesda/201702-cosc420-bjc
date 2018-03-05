// Generated from C:/Users/cgwid/IdeaProjects/201702-cosc420-bjc/src/main/java\BantamJava.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BantamJavaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SPACE=1, NEWLINE=2, STRING_CONST_DELIM=3, BADID=4, CLASS=5, EXTENDS=6, 
		RETURN=7, IF=8, ELSE=9, WHILE=10, NEW=11, INSTANCEOF=12, LBRACE=13, RBRACE=14, 
		LPAREN=15, RPAREN=16, SEMI=17, COMMA=18, PLUS=19, MINUS=20, TIMES=21, 
		DIVIDE=22, MODULUS=23, EQ=24, NE=25, LEQ=26, GEQ=27, LT=28, GT=29, NOT=30, 
		AND=31, OR=32, ASSIGN=33, DOT=34, TRUE=35, FALSE=36, ID=37, BOOLEAN_CONST=38, 
		INT_CONST=39, STRING_CONST=40, ML_COMMENT=41, SL_COMMENT=42;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SPACE", "NEWLINE", "STRING_CONST_DELIM", "BADID", "CLASS", "EXTENDS", 
		"RETURN", "IF", "ELSE", "WHILE", "NEW", "INSTANCEOF", "LBRACE", "RBRACE", 
		"LPAREN", "RPAREN", "SEMI", "COMMA", "PLUS", "MINUS", "TIMES", "DIVIDE", 
		"MODULUS", "EQ", "NE", "LEQ", "GEQ", "LT", "GT", "NOT", "AND", "OR", "ASSIGN", 
		"DOT", "TRUE", "FALSE", "ID", "BOOLEAN_CONST", "INT_CONST", "STRING_CONST", 
		"ESC", "ML_COMMENT", "SL_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'\"'", null, "'class'", "'extends'", "'return'", "'if'", 
		"'else'", "'while'", "'new'", "'instanceof'", "'{'", "'}'", "'('", "')'", 
		"';'", "','", "'+'", "'-'", "'*'", "'/'", "'%'", "'=='", "'!='", "'<='", 
		"'>='", "'<'", "'>'", "'!'", "'&&'", "'||'", "'='", "'.'", "'true'", "'false'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SPACE", "NEWLINE", "STRING_CONST_DELIM", "BADID", "CLASS", "EXTENDS", 
		"RETURN", "IF", "ELSE", "WHILE", "NEW", "INSTANCEOF", "LBRACE", "RBRACE", 
		"LPAREN", "RPAREN", "SEMI", "COMMA", "PLUS", "MINUS", "TIMES", "DIVIDE", 
		"MODULUS", "EQ", "NE", "LEQ", "GEQ", "LT", "GT", "NOT", "AND", "OR", "ASSIGN", 
		"DOT", "TRUE", "FALSE", "ID", "BOOLEAN_CONST", "INT_CONST", "STRING_CONST", 
		"ML_COMMENT", "SL_COMMENT"
	};
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


	public BantamJavaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "BantamJava.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2,\u011f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\6\2[\n\2\r\2\16\2\\\3\2\3\2\3\3\6\3b\n\3\r\3\16\3c\3\3\3\3\3"+
		"\4\3\4\3\5\6\5k\n\5\r\5\16\5l\3\5\3\5\7\5q\n\5\f\5\16\5t\13\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3"+
		"\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3"+
		"\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3\""+
		"\3\"\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\7&\u00e7\n&\f&\16&\u00ea"+
		"\13&\3\'\3\'\5\'\u00ee\n\'\3(\6(\u00f1\n(\r(\16(\u00f2\3)\3)\3)\7)\u00f8"+
		"\n)\f)\16)\u00fb\13)\3)\3)\3*\3*\3*\3+\3+\3+\3+\7+\u0106\n+\f+\16+\u0109"+
		"\13+\3+\3+\3+\3+\3+\3,\3,\3,\3,\7,\u0114\n,\f,\16,\u0117\13,\3,\5,\u011a"+
		"\n,\3,\3,\3,\3,\5\u00f9\u0107\u0115\2-\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S\2U+W,\3"+
		"\2\t\5\2\13\13\16\16\"\"\4\2\f\f\17\17\3\2\62;\4\2C\\c|\5\2\62;C\\c|\6"+
		"\2\62;C\\aac|\b\2$$^^ddppttvv\2\u0129\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2"+
		"\2\2O\3\2\2\2\2Q\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\3Z\3\2\2\2\5a\3\2\2\2\7"+
		"g\3\2\2\2\tj\3\2\2\2\13u\3\2\2\2\r{\3\2\2\2\17\u0083\3\2\2\2\21\u008a"+
		"\3\2\2\2\23\u008d\3\2\2\2\25\u0092\3\2\2\2\27\u0098\3\2\2\2\31\u009c\3"+
		"\2\2\2\33\u00a7\3\2\2\2\35\u00a9\3\2\2\2\37\u00ab\3\2\2\2!\u00ad\3\2\2"+
		"\2#\u00af\3\2\2\2%\u00b1\3\2\2\2\'\u00b3\3\2\2\2)\u00b5\3\2\2\2+\u00b7"+
		"\3\2\2\2-\u00b9\3\2\2\2/\u00bb\3\2\2\2\61\u00bd\3\2\2\2\63\u00c0\3\2\2"+
		"\2\65\u00c3\3\2\2\2\67\u00c6\3\2\2\29\u00c9\3\2\2\2;\u00cb\3\2\2\2=\u00cd"+
		"\3\2\2\2?\u00cf\3\2\2\2A\u00d2\3\2\2\2C\u00d5\3\2\2\2E\u00d7\3\2\2\2G"+
		"\u00d9\3\2\2\2I\u00de\3\2\2\2K\u00e4\3\2\2\2M\u00ed\3\2\2\2O\u00f0\3\2"+
		"\2\2Q\u00f4\3\2\2\2S\u00fe\3\2\2\2U\u0101\3\2\2\2W\u010f\3\2\2\2Y[\t\2"+
		"\2\2ZY\3\2\2\2[\\\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^_\b\2\2\2_\4"+
		"\3\2\2\2`b\t\3\2\2a`\3\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2\2\2de\3\2\2\2e"+
		"f\b\3\2\2f\6\3\2\2\2gh\7$\2\2h\b\3\2\2\2ik\t\4\2\2ji\3\2\2\2kl\3\2\2\2"+
		"lj\3\2\2\2lm\3\2\2\2mn\3\2\2\2nr\t\5\2\2oq\t\6\2\2po\3\2\2\2qt\3\2\2\2"+
		"rp\3\2\2\2rs\3\2\2\2s\n\3\2\2\2tr\3\2\2\2uv\7e\2\2vw\7n\2\2wx\7c\2\2x"+
		"y\7u\2\2yz\7u\2\2z\f\3\2\2\2{|\7g\2\2|}\7z\2\2}~\7v\2\2~\177\7g\2\2\177"+
		"\u0080\7p\2\2\u0080\u0081\7f\2\2\u0081\u0082\7u\2\2\u0082\16\3\2\2\2\u0083"+
		"\u0084\7t\2\2\u0084\u0085\7g\2\2\u0085\u0086\7v\2\2\u0086\u0087\7w\2\2"+
		"\u0087\u0088\7t\2\2\u0088\u0089\7p\2\2\u0089\20\3\2\2\2\u008a\u008b\7"+
		"k\2\2\u008b\u008c\7h\2\2\u008c\22\3\2\2\2\u008d\u008e\7g\2\2\u008e\u008f"+
		"\7n\2\2\u008f\u0090\7u\2\2\u0090\u0091\7g\2\2\u0091\24\3\2\2\2\u0092\u0093"+
		"\7y\2\2\u0093\u0094\7j\2\2\u0094\u0095\7k\2\2\u0095\u0096\7n\2\2\u0096"+
		"\u0097\7g\2\2\u0097\26\3\2\2\2\u0098\u0099\7p\2\2\u0099\u009a\7g\2\2\u009a"+
		"\u009b\7y\2\2\u009b\30\3\2\2\2\u009c\u009d\7k\2\2\u009d\u009e\7p\2\2\u009e"+
		"\u009f\7u\2\2\u009f\u00a0\7v\2\2\u00a0\u00a1\7c\2\2\u00a1\u00a2\7p\2\2"+
		"\u00a2\u00a3\7e\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5\7q\2\2\u00a5\u00a6"+
		"\7h\2\2\u00a6\32\3\2\2\2\u00a7\u00a8\7}\2\2\u00a8\34\3\2\2\2\u00a9\u00aa"+
		"\7\177\2\2\u00aa\36\3\2\2\2\u00ab\u00ac\7*\2\2\u00ac \3\2\2\2\u00ad\u00ae"+
		"\7+\2\2\u00ae\"\3\2\2\2\u00af\u00b0\7=\2\2\u00b0$\3\2\2\2\u00b1\u00b2"+
		"\7.\2\2\u00b2&\3\2\2\2\u00b3\u00b4\7-\2\2\u00b4(\3\2\2\2\u00b5\u00b6\7"+
		"/\2\2\u00b6*\3\2\2\2\u00b7\u00b8\7,\2\2\u00b8,\3\2\2\2\u00b9\u00ba\7\61"+
		"\2\2\u00ba.\3\2\2\2\u00bb\u00bc\7\'\2\2\u00bc\60\3\2\2\2\u00bd\u00be\7"+
		"?\2\2\u00be\u00bf\7?\2\2\u00bf\62\3\2\2\2\u00c0\u00c1\7#\2\2\u00c1\u00c2"+
		"\7?\2\2\u00c2\64\3\2\2\2\u00c3\u00c4\7>\2\2\u00c4\u00c5\7?\2\2\u00c5\66"+
		"\3\2\2\2\u00c6\u00c7\7@\2\2\u00c7\u00c8\7?\2\2\u00c88\3\2\2\2\u00c9\u00ca"+
		"\7>\2\2\u00ca:\3\2\2\2\u00cb\u00cc\7@\2\2\u00cc<\3\2\2\2\u00cd\u00ce\7"+
		"#\2\2\u00ce>\3\2\2\2\u00cf\u00d0\7(\2\2\u00d0\u00d1\7(\2\2\u00d1@\3\2"+
		"\2\2\u00d2\u00d3\7~\2\2\u00d3\u00d4\7~\2\2\u00d4B\3\2\2\2\u00d5\u00d6"+
		"\7?\2\2\u00d6D\3\2\2\2\u00d7\u00d8\7\60\2\2\u00d8F\3\2\2\2\u00d9\u00da"+
		"\7v\2\2\u00da\u00db\7t\2\2\u00db\u00dc\7w\2\2\u00dc\u00dd\7g\2\2\u00dd"+
		"H\3\2\2\2\u00de\u00df\7h\2\2\u00df\u00e0\7c\2\2\u00e0\u00e1\7n\2\2\u00e1"+
		"\u00e2\7u\2\2\u00e2\u00e3\7g\2\2\u00e3J\3\2\2\2\u00e4\u00e8\t\5\2\2\u00e5"+
		"\u00e7\t\7\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2"+
		"\2\2\u00e8\u00e9\3\2\2\2\u00e9L\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ee"+
		"\5G$\2\u00ec\u00ee\5I%\2\u00ed\u00eb\3\2\2\2\u00ed\u00ec\3\2\2\2\u00ee"+
		"N\3\2\2\2\u00ef\u00f1\t\4\2\2\u00f0\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2"+
		"\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3P\3\2\2\2\u00f4\u00f9\5"+
		"\7\4\2\u00f5\u00f8\5S*\2\u00f6\u00f8\13\2\2\2\u00f7\u00f5\3\2\2\2\u00f7"+
		"\u00f6\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00fa\3\2\2\2\u00f9\u00f7\3\2"+
		"\2\2\u00fa\u00fc\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00fd\5\7\4\2\u00fd"+
		"R\3\2\2\2\u00fe\u00ff\7^\2\2\u00ff\u0100\t\b\2\2\u0100T\3\2\2\2\u0101"+
		"\u0102\7\61\2\2\u0102\u0103\7,\2\2\u0103\u0107\3\2\2\2\u0104\u0106\13"+
		"\2\2\2\u0105\u0104\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0108\3\2\2\2\u0107"+
		"\u0105\3\2\2\2\u0108\u010a\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u010b\7,"+
		"\2\2\u010b\u010c\7\61\2\2\u010c\u010d\3\2\2\2\u010d\u010e\b+\2\2\u010e"+
		"V\3\2\2\2\u010f\u0110\7\61\2\2\u0110\u0111\7\61\2\2\u0111\u0115\3\2\2"+
		"\2\u0112\u0114\13\2\2\2\u0113\u0112\3\2\2\2\u0114\u0117\3\2\2\2\u0115"+
		"\u0116\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2"+
		"\2\2\u0118\u011a\7\17\2\2\u0119\u0118\3\2\2\2\u0119\u011a\3\2\2\2\u011a"+
		"\u011b\3\2\2\2\u011b\u011c\7\f\2\2\u011c\u011d\3\2\2\2\u011d\u011e\b,"+
		"\2\2\u011eX\3\2\2\2\17\2\\clr\u00e8\u00ed\u00f2\u00f7\u00f9\u0107\u0115"+
		"\u0119\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}