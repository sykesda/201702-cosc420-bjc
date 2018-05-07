// Generated from /Users/sykesda/IdeaProjects/2018/02/201702-cosc420-bjc/src/main/java/BantamJava.g4 by ANTLR 4.7
import org.antlr.symtab.*;
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
		SPACE=1, NEWLINE=2, DQUOTE=3, BADID=4, CLASS=5, EXTENDS=6, THIS=7, SUPER=8, 
		RETURN=9, IF=10, ELSE=11, WHILE=12, NEW=13, INSTANCEOF=14, TRUE=15, FALSE=16, 
		VOID=17, INT=18, BOOLEAN=19, LBRACE=20, RBRACE=21, LPAREN=22, RPAREN=23, 
		SEMI=24, COMMA=25, PLUS=26, MINUS=27, TIMES=28, DIVIDE=29, MODULUS=30, 
		EQ=31, NE=32, LE=33, GE=34, LT=35, GT=36, NOT=37, AND=38, OR=39, ASSIGN=40, 
		DOT=41, ID=42, INT_CONST=43, STR_CONST=44, ML_COMMENT=45, SL_COMMENT=46;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SPACE", "NEWLINE", "DQUOTE", "BADID", "CLASS", "EXTENDS", "THIS", "SUPER", 
		"RETURN", "IF", "ELSE", "WHILE", "NEW", "INSTANCEOF", "TRUE", "FALSE", 
		"VOID", "INT", "BOOLEAN", "LBRACE", "RBRACE", "LPAREN", "RPAREN", "SEMI", 
		"COMMA", "PLUS", "MINUS", "TIMES", "DIVIDE", "MODULUS", "EQ", "NE", "LE", 
		"GE", "LT", "GT", "NOT", "AND", "OR", "ASSIGN", "DOT", "ID", "INT_CONST", 
		"STR_CONST", "ESC", "ML_COMMENT", "SL_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'\"'", null, "'class'", "'extends'", "'this'", "'super'", 
		"'return'", "'if'", "'else'", "'while'", "'new'", "'instanceof'", "'true'", 
		"'false'", "'void'", "'int'", "'boolean'", "'{'", "'}'", "'('", "')'", 
		"';'", "','", "'+'", "'-'", "'*'", "'/'", "'%'", "'=='", "'!='", "'<='", 
		"'>='", "'<'", "'>'", "'!'", "'&&'", "'||'", "'='", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SPACE", "NEWLINE", "DQUOTE", "BADID", "CLASS", "EXTENDS", "THIS", 
		"SUPER", "RETURN", "IF", "ELSE", "WHILE", "NEW", "INSTANCEOF", "TRUE", 
		"FALSE", "VOID", "INT", "BOOLEAN", "LBRACE", "RBRACE", "LPAREN", "RPAREN", 
		"SEMI", "COMMA", "PLUS", "MINUS", "TIMES", "DIVIDE", "MODULUS", "EQ", 
		"NE", "LE", "GE", "LT", "GT", "NOT", "AND", "OR", "ASSIGN", "DOT", "ID", 
		"INT_CONST", "STR_CONST", "ML_COMMENT", "SL_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\60\u013f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\6\2c\n\2\r\2\16\2d\3\2\3\2\3\3"+
		"\6\3j\n\3\r\3\16\3k\3\3\3\3\3\4\3\4\3\5\6\5s\n\5\r\5\16\5t\3\5\3\5\7\5"+
		"y\n\5\f\5\16\5|\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3"+
		"\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\""+
		"\3\"\3#\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3*\3*\3+\3"+
		"+\7+\u010b\n+\f+\16+\u010e\13+\3,\6,\u0111\n,\r,\16,\u0112\3-\3-\3-\7"+
		"-\u0118\n-\f-\16-\u011b\13-\3-\3-\3.\3.\3.\3/\3/\3/\3/\7/\u0126\n/\f/"+
		"\16/\u0129\13/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\7\60\u0134\n\60\f\60"+
		"\16\60\u0137\13\60\3\60\5\60\u013a\n\60\3\60\3\60\3\60\3\60\5\u0119\u0127"+
		"\u0135\2\61\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[\2]/_\60\3\2\t\5\2\13\13\16"+
		"\16\"\"\4\2\f\f\17\17\3\2\62;\4\2C\\c|\5\2\62;C\\c|\6\2\62;C\\aac|\b\2"+
		"$$^^ddppttvv\2\u0148\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q"+
		"\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\3b\3\2\2\2\5i\3\2\2\2\7o\3\2\2\2\tr\3\2\2\2\13}\3\2\2\2\r\u0083\3"+
		"\2\2\2\17\u008b\3\2\2\2\21\u0090\3\2\2\2\23\u0096\3\2\2\2\25\u009d\3\2"+
		"\2\2\27\u00a0\3\2\2\2\31\u00a5\3\2\2\2\33\u00ab\3\2\2\2\35\u00af\3\2\2"+
		"\2\37\u00ba\3\2\2\2!\u00bf\3\2\2\2#\u00c5\3\2\2\2%\u00ca\3\2\2\2\'\u00ce"+
		"\3\2\2\2)\u00d6\3\2\2\2+\u00d8\3\2\2\2-\u00da\3\2\2\2/\u00dc\3\2\2\2\61"+
		"\u00de\3\2\2\2\63\u00e0\3\2\2\2\65\u00e2\3\2\2\2\67\u00e4\3\2\2\29\u00e6"+
		"\3\2\2\2;\u00e8\3\2\2\2=\u00ea\3\2\2\2?\u00ec\3\2\2\2A\u00ef\3\2\2\2C"+
		"\u00f2\3\2\2\2E\u00f5\3\2\2\2G\u00f8\3\2\2\2I\u00fa\3\2\2\2K\u00fc\3\2"+
		"\2\2M\u00fe\3\2\2\2O\u0101\3\2\2\2Q\u0104\3\2\2\2S\u0106\3\2\2\2U\u0108"+
		"\3\2\2\2W\u0110\3\2\2\2Y\u0114\3\2\2\2[\u011e\3\2\2\2]\u0121\3\2\2\2_"+
		"\u012f\3\2\2\2ac\t\2\2\2ba\3\2\2\2cd\3\2\2\2db\3\2\2\2de\3\2\2\2ef\3\2"+
		"\2\2fg\b\2\2\2g\4\3\2\2\2hj\t\3\2\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3"+
		"\2\2\2lm\3\2\2\2mn\b\3\2\2n\6\3\2\2\2op\7$\2\2p\b\3\2\2\2qs\t\4\2\2rq"+
		"\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2uv\3\2\2\2vz\t\5\2\2wy\t\6\2\2x"+
		"w\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\n\3\2\2\2|z\3\2\2\2}~\7e\2\2"+
		"~\177\7n\2\2\177\u0080\7c\2\2\u0080\u0081\7u\2\2\u0081\u0082\7u\2\2\u0082"+
		"\f\3\2\2\2\u0083\u0084\7g\2\2\u0084\u0085\7z\2\2\u0085\u0086\7v\2\2\u0086"+
		"\u0087\7g\2\2\u0087\u0088\7p\2\2\u0088\u0089\7f\2\2\u0089\u008a\7u\2\2"+
		"\u008a\16\3\2\2\2\u008b\u008c\7v\2\2\u008c\u008d\7j\2\2\u008d\u008e\7"+
		"k\2\2\u008e\u008f\7u\2\2\u008f\20\3\2\2\2\u0090\u0091\7u\2\2\u0091\u0092"+
		"\7w\2\2\u0092\u0093\7r\2\2\u0093\u0094\7g\2\2\u0094\u0095\7t\2\2\u0095"+
		"\22\3\2\2\2\u0096\u0097\7t\2\2\u0097\u0098\7g\2\2\u0098\u0099\7v\2\2\u0099"+
		"\u009a\7w\2\2\u009a\u009b\7t\2\2\u009b\u009c\7p\2\2\u009c\24\3\2\2\2\u009d"+
		"\u009e\7k\2\2\u009e\u009f\7h\2\2\u009f\26\3\2\2\2\u00a0\u00a1\7g\2\2\u00a1"+
		"\u00a2\7n\2\2\u00a2\u00a3\7u\2\2\u00a3\u00a4\7g\2\2\u00a4\30\3\2\2\2\u00a5"+
		"\u00a6\7y\2\2\u00a6\u00a7\7j\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9\7n\2\2"+
		"\u00a9\u00aa\7g\2\2\u00aa\32\3\2\2\2\u00ab\u00ac\7p\2\2\u00ac\u00ad\7"+
		"g\2\2\u00ad\u00ae\7y\2\2\u00ae\34\3\2\2\2\u00af\u00b0\7k\2\2\u00b0\u00b1"+
		"\7p\2\2\u00b1\u00b2\7u\2\2\u00b2\u00b3\7v\2\2\u00b3\u00b4\7c\2\2\u00b4"+
		"\u00b5\7p\2\2\u00b5\u00b6\7e\2\2\u00b6\u00b7\7g\2\2\u00b7\u00b8\7q\2\2"+
		"\u00b8\u00b9\7h\2\2\u00b9\36\3\2\2\2\u00ba\u00bb\7v\2\2\u00bb\u00bc\7"+
		"t\2\2\u00bc\u00bd\7w\2\2\u00bd\u00be\7g\2\2\u00be \3\2\2\2\u00bf\u00c0"+
		"\7h\2\2\u00c0\u00c1\7c\2\2\u00c1\u00c2\7n\2\2\u00c2\u00c3\7u\2\2\u00c3"+
		"\u00c4\7g\2\2\u00c4\"\3\2\2\2\u00c5\u00c6\7x\2\2\u00c6\u00c7\7q\2\2\u00c7"+
		"\u00c8\7k\2\2\u00c8\u00c9\7f\2\2\u00c9$\3\2\2\2\u00ca\u00cb\7k\2\2\u00cb"+
		"\u00cc\7p\2\2\u00cc\u00cd\7v\2\2\u00cd&\3\2\2\2\u00ce\u00cf\7d\2\2\u00cf"+
		"\u00d0\7q\2\2\u00d0\u00d1\7q\2\2\u00d1\u00d2\7n\2\2\u00d2\u00d3\7g\2\2"+
		"\u00d3\u00d4\7c\2\2\u00d4\u00d5\7p\2\2\u00d5(\3\2\2\2\u00d6\u00d7\7}\2"+
		"\2\u00d7*\3\2\2\2\u00d8\u00d9\7\177\2\2\u00d9,\3\2\2\2\u00da\u00db\7*"+
		"\2\2\u00db.\3\2\2\2\u00dc\u00dd\7+\2\2\u00dd\60\3\2\2\2\u00de\u00df\7"+
		"=\2\2\u00df\62\3\2\2\2\u00e0\u00e1\7.\2\2\u00e1\64\3\2\2\2\u00e2\u00e3"+
		"\7-\2\2\u00e3\66\3\2\2\2\u00e4\u00e5\7/\2\2\u00e58\3\2\2\2\u00e6\u00e7"+
		"\7,\2\2\u00e7:\3\2\2\2\u00e8\u00e9\7\61\2\2\u00e9<\3\2\2\2\u00ea\u00eb"+
		"\7\'\2\2\u00eb>\3\2\2\2\u00ec\u00ed\7?\2\2\u00ed\u00ee\7?\2\2\u00ee@\3"+
		"\2\2\2\u00ef\u00f0\7#\2\2\u00f0\u00f1\7?\2\2\u00f1B\3\2\2\2\u00f2\u00f3"+
		"\7>\2\2\u00f3\u00f4\7?\2\2\u00f4D\3\2\2\2\u00f5\u00f6\7@\2\2\u00f6\u00f7"+
		"\7?\2\2\u00f7F\3\2\2\2\u00f8\u00f9\7>\2\2\u00f9H\3\2\2\2\u00fa\u00fb\7"+
		"@\2\2\u00fbJ\3\2\2\2\u00fc\u00fd\7#\2\2\u00fdL\3\2\2\2\u00fe\u00ff\7("+
		"\2\2\u00ff\u0100\7(\2\2\u0100N\3\2\2\2\u0101\u0102\7~\2\2\u0102\u0103"+
		"\7~\2\2\u0103P\3\2\2\2\u0104\u0105\7?\2\2\u0105R\3\2\2\2\u0106\u0107\7"+
		"\60\2\2\u0107T\3\2\2\2\u0108\u010c\t\5\2\2\u0109\u010b\t\7\2\2\u010a\u0109"+
		"\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d"+
		"V\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0111\t\4\2\2\u0110\u010f\3\2\2\2"+
		"\u0111\u0112\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113X\3"+
		"\2\2\2\u0114\u0119\5\7\4\2\u0115\u0118\5[.\2\u0116\u0118\13\2\2\2\u0117"+
		"\u0115\3\2\2\2\u0117\u0116\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u011a\3\2"+
		"\2\2\u0119\u0117\3\2\2\2\u011a\u011c\3\2\2\2\u011b\u0119\3\2\2\2\u011c"+
		"\u011d\5\7\4\2\u011dZ\3\2\2\2\u011e\u011f\7^\2\2\u011f\u0120\t\b\2\2\u0120"+
		"\\\3\2\2\2\u0121\u0122\7\61\2\2\u0122\u0123\7,\2\2\u0123\u0127\3\2\2\2"+
		"\u0124\u0126\13\2\2\2\u0125\u0124\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0128"+
		"\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u012a\3\2\2\2\u0129\u0127\3\2\2\2\u012a"+
		"\u012b\7,\2\2\u012b\u012c\7\61\2\2\u012c\u012d\3\2\2\2\u012d\u012e\b/"+
		"\2\2\u012e^\3\2\2\2\u012f\u0130\7\61\2\2\u0130\u0131\7\61\2\2\u0131\u0135"+
		"\3\2\2\2\u0132\u0134\13\2\2\2\u0133\u0132\3\2\2\2\u0134\u0137\3\2\2\2"+
		"\u0135\u0136\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135"+
		"\3\2\2\2\u0138\u013a\7\17\2\2\u0139\u0138\3\2\2\2\u0139\u013a\3\2\2\2"+
		"\u013a\u013b\3\2\2\2\u013b\u013c\7\f\2\2\u013c\u013d\3\2\2\2\u013d\u013e"+
		"\b\60\2\2\u013e`\3\2\2\2\16\2dktz\u010c\u0112\u0117\u0119\u0127\u0135"+
		"\u0139\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}