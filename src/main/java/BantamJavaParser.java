// Generated from /Users/sykesda/IdeaProjects/2018/02/201702-cosc420-bjc/src/main/java/BantamJava.g4 by ANTLR 4.7
import org.antlr.symtab.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BantamJavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SPACE=1, NEWLINE=2, DQUOTE=3, BADID=4, CLASS=5, EXTENDS=6, RETURN=7, IF=8, 
		ELSE=9, WHILE=10, NEW=11, INSTANCEOF=12, TRUE=13, FALSE=14, VOID=15, INT=16, 
		BOOLEAN=17, LBRACE=18, RBRACE=19, LPAREN=20, RPAREN=21, SEMI=22, COMMA=23, 
		PLUS=24, MINUS=25, TIMES=26, DIVIDE=27, MODULUS=28, EQ=29, NE=30, LE=31, 
		GE=32, LT=33, GT=34, NOT=35, AND=36, OR=37, ASSIGN=38, DOT=39, ID=40, 
		INT_CONST=41, STR_CONST=42, ML_COMMENT=43, SL_COMMENT=44;
	public static final int
		RULE_program = 0, RULE_classDefn = 1, RULE_type = 2, RULE_member = 3, 
		RULE_field = 4, RULE_method = 5, RULE_formalList = 6, RULE_formal = 7, 
		RULE_stmt = 8, RULE_retn = 9, RULE_expr = 10, RULE_argsList = 11;
	public static final String[] ruleNames = {
		"program", "classDefn", "type", "member", "field", "method", "formalList", 
		"formal", "stmt", "retn", "expr", "argsList"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'\"'", null, "'class'", "'extends'", "'return'", "'if'", 
		"'else'", "'while'", "'new'", "'instanceof'", "'true'", "'false'", "'void'", 
		"'int'", "'boolean'", "'{'", "'}'", "'('", "')'", "';'", "','", "'+'", 
		"'-'", "'*'", "'/'", "'%'", "'=='", "'!='", "'<='", "'>='", "'<'", "'>'", 
		"'!'", "'&&'", "'||'", "'='", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SPACE", "NEWLINE", "DQUOTE", "BADID", "CLASS", "EXTENDS", "RETURN", 
		"IF", "ELSE", "WHILE", "NEW", "INSTANCEOF", "TRUE", "FALSE", "VOID", "INT", 
		"BOOLEAN", "LBRACE", "RBRACE", "LPAREN", "RPAREN", "SEMI", "COMMA", "PLUS", 
		"MINUS", "TIMES", "DIVIDE", "MODULUS", "EQ", "NE", "LE", "GE", "LT", "GT", 
		"NOT", "AND", "OR", "ASSIGN", "DOT", "ID", "INT_CONST", "STR_CONST", "ML_COMMENT", 
		"SL_COMMENT"
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

	@Override
	public String getGrammarFileName() { return "BantamJava.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BantamJavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<ClassDefnContext> classDefn() {
			return getRuleContexts(ClassDefnContext.class);
		}
		public ClassDefnContext classDefn(int i) {
			return getRuleContext(ClassDefnContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BantamJavaVisitor ) return ((BantamJavaVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(24);
				classDefn();
				}
				}
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CLASS );
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

	public static class ClassDefnContext extends ParserRuleContext {
		public ClassDefnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDefn; }
	 
		public ClassDefnContext() { }
		public void copyFrom(ClassDefnContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ClassContext extends ClassDefnContext {
		public Token className;
		public Token superclassName;
		public TerminalNode CLASS() { return getToken(BantamJavaParser.CLASS, 0); }
		public TerminalNode LBRACE() { return getToken(BantamJavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(BantamJavaParser.RBRACE, 0); }
		public List<TerminalNode> ID() { return getTokens(BantamJavaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(BantamJavaParser.ID, i);
		}
		public TerminalNode EXTENDS() { return getToken(BantamJavaParser.EXTENDS, 0); }
		public List<MemberContext> member() {
			return getRuleContexts(MemberContext.class);
		}
		public MemberContext member(int i) {
			return getRuleContext(MemberContext.class,i);
		}
		public ClassContext(ClassDefnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).enterClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).exitClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BantamJavaVisitor ) return ((BantamJavaVisitor<? extends T>)visitor).visitClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDefnContext classDefn() throws RecognitionException {
		ClassDefnContext _localctx = new ClassDefnContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classDefn);
		int _la;
		try {
			_localctx = new ClassContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(CLASS);
			setState(30);
			((ClassContext)_localctx).className = match(ID);
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(31);
				match(EXTENDS);
				setState(32);
				((ClassContext)_localctx).superclassName = match(ID);
				}
			}

			setState(35);
			match(LBRACE);
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << INT) | (1L << BOOLEAN) | (1L << ID))) != 0)) {
				{
				{
				setState(36);
				member();
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42);
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TypeIntContext extends TypeContext {
		public TerminalNode INT() { return getToken(BantamJavaParser.INT, 0); }
		public TypeIntContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).enterTypeInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).exitTypeInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BantamJavaVisitor ) return ((BantamJavaVisitor<? extends T>)visitor).visitTypeInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeIDContext extends TypeContext {
		public TerminalNode ID() { return getToken(BantamJavaParser.ID, 0); }
		public TypeIDContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).enterTypeID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).exitTypeID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BantamJavaVisitor ) return ((BantamJavaVisitor<? extends T>)visitor).visitTypeID(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeBoolContext extends TypeContext {
		public TerminalNode BOOLEAN() { return getToken(BantamJavaParser.BOOLEAN, 0); }
		public TypeBoolContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).enterTypeBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).exitTypeBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BantamJavaVisitor ) return ((BantamJavaVisitor<? extends T>)visitor).visitTypeBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeVoidContext extends TypeContext {
		public TerminalNode VOID() { return getToken(BantamJavaParser.VOID, 0); }
		public TypeVoidContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).enterTypeVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).exitTypeVoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BantamJavaVisitor ) return ((BantamJavaVisitor<? extends T>)visitor).visitTypeVoid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type);
		try {
			setState(48);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				_localctx = new TypeVoidContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				match(VOID);
				}
				break;
			case INT:
				_localctx = new TypeIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				match(INT);
				}
				break;
			case BOOLEAN:
				_localctx = new TypeBoolContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
				match(BOOLEAN);
				}
				break;
			case ID:
				_localctx = new TypeIDContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(47);
				match(ID);
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

	public static class MemberContext extends ParserRuleContext {
		public MemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member; }
	 
		public MemberContext() { }
		public void copyFrom(MemberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MemberMethodContext extends MemberContext {
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public MemberMethodContext(MemberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).enterMemberMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).exitMemberMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BantamJavaVisitor ) return ((BantamJavaVisitor<? extends T>)visitor).visitMemberMethod(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MemberFieldContext extends MemberContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public MemberFieldContext(MemberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).enterMemberField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).exitMemberField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BantamJavaVisitor ) return ((BantamJavaVisitor<? extends T>)visitor).visitMemberField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberContext member() throws RecognitionException {
		MemberContext _localctx = new MemberContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_member);
		try {
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new MemberFieldContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				field();
				}
				break;
			case 2:
				_localctx = new MemberMethodContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				method();
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

	public static class FieldContext extends ParserRuleContext {
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
	 
		public FieldContext() { }
		public void copyFrom(FieldContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FieldDeclOrInstContext extends FieldContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(BantamJavaParser.ID, 0); }
		public TerminalNode SEMI() { return getToken(BantamJavaParser.SEMI, 0); }
		public TerminalNode ASSIGN() { return getToken(BantamJavaParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FieldDeclOrInstContext(FieldContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).enterFieldDeclOrInst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).exitFieldDeclOrInst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BantamJavaVisitor ) return ((BantamJavaVisitor<? extends T>)visitor).visitFieldDeclOrInst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_field);
		int _la;
		try {
			_localctx = new FieldDeclOrInstContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			type();
			setState(55);
			match(ID);
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(56);
				match(ASSIGN);
				setState(57);
				expr(0);
				}
			}

			setState(60);
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

	public static class MethodContext extends ParserRuleContext {
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
	 
		public MethodContext() { }
		public void copyFrom(MethodContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MethodDeclarationContext extends MethodContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(BantamJavaParser.ID, 0); }
		public FormalListContext formalList() {
			return getRuleContext(FormalListContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(BantamJavaParser.LBRACE, 0); }
		public RetnContext retn() {
			return getRuleContext(RetnContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(BantamJavaParser.RBRACE, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public MethodDeclarationContext(MethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BantamJavaVisitor ) return ((BantamJavaVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_method);
		int _la;
		try {
			_localctx = new MethodDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			type();
			setState(63);
			match(ID);
			setState(64);
			formalList();
			setState(65);
			match(LBRACE);
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << VOID) | (1L << INT) | (1L << BOOLEAN) | (1L << LBRACE) | (1L << LPAREN) | (1L << MINUS) | (1L << NOT) | (1L << ID) | (1L << INT_CONST) | (1L << STR_CONST))) != 0)) {
				{
				{
				setState(66);
				stmt();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
			retn();
			setState(73);
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

	public static class FormalListContext extends ParserRuleContext {
		public FormalListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalList; }
	 
		public FormalListContext() { }
		public void copyFrom(FormalListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LstOfFormalsContext extends FormalListContext {
		public TerminalNode LPAREN() { return getToken(BantamJavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(BantamJavaParser.RPAREN, 0); }
		public List<FormalContext> formal() {
			return getRuleContexts(FormalContext.class);
		}
		public FormalContext formal(int i) {
			return getRuleContext(FormalContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BantamJavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BantamJavaParser.COMMA, i);
		}
		public LstOfFormalsContext(FormalListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).enterLstOfFormals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).exitLstOfFormals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BantamJavaVisitor ) return ((BantamJavaVisitor<? extends T>)visitor).visitLstOfFormals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalListContext formalList() throws RecognitionException {
		FormalListContext _localctx = new FormalListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_formalList);
		int _la;
		try {
			_localctx = new LstOfFormalsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(LPAREN);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << INT) | (1L << BOOLEAN) | (1L << ID))) != 0)) {
				{
				{
				setState(76);
				formal();
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(77);
					match(COMMA);
					setState(78);
					formal();
					}
					}
					setState(83);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
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

	public static class FormalContext extends ParserRuleContext {
		public FormalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal; }
	 
		public FormalContext() { }
		public void copyFrom(FormalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TypeWithIDContext extends FormalContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(BantamJavaParser.ID, 0); }
		public TypeWithIDContext(FormalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).enterTypeWithID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).exitTypeWithID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BantamJavaVisitor ) return ((BantamJavaVisitor<? extends T>)visitor).visitTypeWithID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalContext formal() throws RecognitionException {
		FormalContext _localctx = new FormalContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_formal);
		try {
			_localctx = new TypeWithIDContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			type();
			setState(92);
			match(ID);
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

	public static class StmtContext extends ParserRuleContext {
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	 
		public StmtContext() { }
		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StmtBlockContext extends StmtContext {
		public TerminalNode LBRACE() { return getToken(BantamJavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(BantamJavaParser.RBRACE, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public StmtBlockContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).enterStmtBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).exitStmtBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BantamJavaVisitor ) return ((BantamJavaVisitor<? extends T>)visitor).visitStmtBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtLocalVarDeclContext extends StmtContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(BantamJavaParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(BantamJavaParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(BantamJavaParser.SEMI, 0); }
		public StmtLocalVarDeclContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).enterStmtLocalVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).exitStmtLocalVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BantamJavaVisitor ) return ((BantamJavaVisitor<? extends T>)visitor).visitStmtLocalVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtWhileContext extends StmtContext {
		public TerminalNode WHILE() { return getToken(BantamJavaParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(BantamJavaParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(BantamJavaParser.RPAREN, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public StmtWhileContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).enterStmtWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).exitStmtWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BantamJavaVisitor ) return ((BantamJavaVisitor<? extends T>)visitor).visitStmtWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtExprSemiContext extends StmtContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(BantamJavaParser.SEMI, 0); }
		public StmtExprSemiContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).enterStmtExprSemi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).exitStmtExprSemi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BantamJavaVisitor ) return ((BantamJavaVisitor<? extends T>)visitor).visitStmtExprSemi(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtIfContext extends StmtContext {
		public TerminalNode IF() { return getToken(BantamJavaParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(BantamJavaParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(BantamJavaParser.RPAREN, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(BantamJavaParser.ELSE, 0); }
		public StmtIfContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).enterStmtIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).exitStmtIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BantamJavaVisitor ) return ((BantamJavaVisitor<? extends T>)visitor).visitStmtIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stmt);
		int _la;
		try {
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new StmtExprSemiContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				expr(0);
				setState(95);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new StmtBlockContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				match(LBRACE);
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << VOID) | (1L << INT) | (1L << BOOLEAN) | (1L << LBRACE) | (1L << LPAREN) | (1L << MINUS) | (1L << NOT) | (1L << ID) | (1L << INT_CONST) | (1L << STR_CONST))) != 0)) {
					{
					{
					setState(98);
					stmt();
					}
					}
					setState(103);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(104);
				match(RBRACE);
				}
				break;
			case 3:
				_localctx = new StmtIfContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(105);
				match(IF);
				setState(106);
				match(LPAREN);
				setState(107);
				expr(0);
				setState(108);
				match(RPAREN);
				setState(109);
				stmt();
				setState(112);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(110);
					match(ELSE);
					setState(111);
					stmt();
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new StmtWhileContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(114);
				match(WHILE);
				setState(115);
				match(LPAREN);
				setState(116);
				expr(0);
				setState(117);
				match(RPAREN);
				setState(118);
				stmt();
				}
				break;
			case 5:
				_localctx = new StmtLocalVarDeclContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(120);
				type();
				setState(121);
				match(ID);
				setState(122);
				match(ASSIGN);
				setState(123);
				expr(0);
				setState(124);
				match(SEMI);
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

	public static class RetnContext extends ParserRuleContext {
		public RetnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retn; }
	 
		public RetnContext() { }
		public void copyFrom(RetnContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReturnContext extends RetnContext {
		public TerminalNode RETURN() { return getToken(BantamJavaParser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(BantamJavaParser.SEMI, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnContext(RetnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).exitReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BantamJavaVisitor ) return ((BantamJavaVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetnContext retn() throws RecognitionException {
		RetnContext _localctx = new RetnContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_retn);
		int _la;
		try {
			_localctx = new ReturnContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(RETURN);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << LPAREN) | (1L << MINUS) | (1L << NOT) | (1L << ID) | (1L << INT_CONST) | (1L << STR_CONST))) != 0)) {
				{
				setState(129);
				expr(0);
				}
			}

			setState(132);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprIntContext extends ExprContext {
		public TerminalNode INT_CONST() { return getToken(BantamJavaParser.INT_CONST, 0); }
		public ExprIntContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).enterExprInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).exitExprInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BantamJavaVisitor ) return ((BantamJavaVisitor<? extends T>)visitor).visitExprInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprMulDivModContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode TIMES() { return getToken(BantamJavaParser.TIMES, 0); }
		public TerminalNode DIVIDE() { return getToken(BantamJavaParser.DIVIDE, 0); }
		public TerminalNode MODULUS() { return getToken(BantamJavaParser.MODULUS, 0); }
		public ExprMulDivModContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).enterExprMulDivMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).exitExprMulDivMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BantamJavaVisitor ) return ((BantamJavaVisitor<? extends T>)visitor).visitExprMulDivMod(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprNotContext extends ExprContext {
		public TerminalNode NOT() { return getToken(BantamJavaParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprNotContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).enterExprNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).exitExprNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BantamJavaVisitor ) return ((BantamJavaVisitor<? extends T>)visitor).visitExprNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprVarAssignContext extends ExprContext {
		public TerminalNode ID() { return getToken(BantamJavaParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(BantamJavaParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprVarAssignContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).enterExprVarAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).exitExprVarAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BantamJavaVisitor ) return ((BantamJavaVisitor<? extends T>)visitor).visitExprVarAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprAddSubContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(BantamJavaParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(BantamJavaParser.MINUS, 0); }
		public ExprAddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).enterExprAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).exitExprAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BantamJavaVisitor ) return ((BantamJavaVisitor<? extends T>)visitor).visitExprAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpStrLiteralContext extends ExprContext {
		public TerminalNode STR_CONST() { return getToken(BantamJavaParser.STR_CONST, 0); }
		public ExpStrLiteralContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).enterExpStrLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).exitExpStrLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BantamJavaVisitor ) return ((BantamJavaVisitor<? extends T>)visitor).visitExpStrLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprInstanceofContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode INSTANCEOF() { return getToken(BantamJavaParser.INSTANCEOF, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExprInstanceofContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).enterExprInstanceof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).exitExprInstanceof(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BantamJavaVisitor ) return ((BantamJavaVisitor<? extends T>)visitor).visitExprInstanceof(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprNewContext extends ExprContext {
		public TerminalNode NEW() { return getToken(BantamJavaParser.NEW, 0); }
		public TerminalNode ID() { return getToken(BantamJavaParser.ID, 0); }
		public ArgsListContext argsList() {
			return getRuleContext(ArgsListContext.class,0);
		}
		public ExprNewContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).enterExprNew(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).exitExprNew(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BantamJavaVisitor ) return ((BantamJavaVisitor<? extends T>)visitor).visitExprNew(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprOrContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OR() { return getToken(BantamJavaParser.OR, 0); }
		public ExprOrContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).enterExprOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).exitExprOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BantamJavaVisitor ) return ((BantamJavaVisitor<? extends T>)visitor).visitExprOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprTypeConversionContext extends ExprContext {
		public List<TerminalNode> LPAREN() { return getTokens(BantamJavaParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(BantamJavaParser.LPAREN, i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(BantamJavaParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(BantamJavaParser.RPAREN, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprTypeConversionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).enterExprTypeConversion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).exitExprTypeConversion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BantamJavaVisitor ) return ((BantamJavaVisitor<? extends T>)visitor).visitExprTypeConversion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprFieldAssignContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DOT() { return getToken(BantamJavaParser.DOT, 0); }
		public TerminalNode ID() { return getToken(BantamJavaParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(BantamJavaParser.ASSIGN, 0); }
		public ExprFieldAssignContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).enterExprFieldAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).exitExprFieldAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BantamJavaVisitor ) return ((BantamJavaVisitor<? extends T>)visitor).visitExprFieldAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprParenthesizedContext extends ExprContext {
		public TerminalNode LPAREN() { return getToken(BantamJavaParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(BantamJavaParser.RPAREN, 0); }
		public ExprParenthesizedContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).enterExprParenthesized(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).exitExprParenthesized(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BantamJavaVisitor ) return ((BantamJavaVisitor<? extends T>)visitor).visitExprParenthesized(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprRelationalContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQ() { return getToken(BantamJavaParser.EQ, 0); }
		public TerminalNode NE() { return getToken(BantamJavaParser.NE, 0); }
		public TerminalNode LT() { return getToken(BantamJavaParser.LT, 0); }
		public TerminalNode LE() { return getToken(BantamJavaParser.LE, 0); }
		public TerminalNode GT() { return getToken(BantamJavaParser.GT, 0); }
		public TerminalNode GE() { return getToken(BantamJavaParser.GE, 0); }
		public ExprRelationalContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).enterExprRelational(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).exitExprRelational(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BantamJavaVisitor ) return ((BantamJavaVisitor<? extends T>)visitor).visitExprRelational(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprBoolLiteralContext extends ExprContext {
		public TerminalNode TRUE() { return getToken(BantamJavaParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(BantamJavaParser.FALSE, 0); }
		public ExprBoolLiteralContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).enterExprBoolLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).exitExprBoolLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BantamJavaVisitor ) return ((BantamJavaVisitor<? extends T>)visitor).visitExprBoolLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprAndContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(BantamJavaParser.AND, 0); }
		public ExprAndContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).enterExprAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).exitExprAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BantamJavaVisitor ) return ((BantamJavaVisitor<? extends T>)visitor).visitExprAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprIDContext extends ExprContext {
		public TerminalNode ID() { return getToken(BantamJavaParser.ID, 0); }
		public ExprIDContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).enterExprID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).exitExprID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BantamJavaVisitor ) return ((BantamJavaVisitor<? extends T>)visitor).visitExprID(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprMethodCallContext extends ExprContext {
		public TerminalNode ID() { return getToken(BantamJavaParser.ID, 0); }
		public ArgsListContext argsList() {
			return getRuleContext(ArgsListContext.class,0);
		}
		public ExprMethodCallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).enterExprMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).exitExprMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BantamJavaVisitor ) return ((BantamJavaVisitor<? extends T>)visitor).visitExprMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprNegationContext extends ExprContext {
		public TerminalNode MINUS() { return getToken(BantamJavaParser.MINUS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprNegationContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).enterExprNegation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).exitExprNegation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BantamJavaVisitor ) return ((BantamJavaVisitor<? extends T>)visitor).visitExprNegation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprDotMethodCallContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DOT() { return getToken(BantamJavaParser.DOT, 0); }
		public TerminalNode ID() { return getToken(BantamJavaParser.ID, 0); }
		public ArgsListContext argsList() {
			return getRuleContext(ArgsListContext.class,0);
		}
		public ExprDotMethodCallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).enterExprDotMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).exitExprDotMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BantamJavaVisitor ) return ((BantamJavaVisitor<? extends T>)visitor).visitExprDotMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				_localctx = new ExprVarAssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(135);
				match(ID);
				setState(136);
				match(ASSIGN);
				setState(137);
				expr(19);
				}
				break;
			case 2:
				{
				_localctx = new ExprIDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(138);
				match(ID);
				}
				break;
			case 3:
				{
				_localctx = new ExprMethodCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(139);
				match(ID);
				setState(141);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(140);
					argsList();
					}
					break;
				}
				}
				break;
			case 4:
				{
				_localctx = new ExprNewContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(143);
				match(NEW);
				setState(144);
				match(ID);
				setState(145);
				argsList();
				}
				break;
			case 5:
				{
				_localctx = new ExprTypeConversionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(146);
				match(LPAREN);
				setState(147);
				type();
				setState(148);
				match(RPAREN);
				setState(149);
				match(LPAREN);
				setState(150);
				expr(0);
				setState(151);
				match(RPAREN);
				}
				break;
			case 6:
				{
				_localctx = new ExprNegationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(153);
				match(MINUS);
				setState(154);
				expr(11);
				}
				break;
			case 7:
				{
				_localctx = new ExprNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(155);
				match(NOT);
				setState(156);
				expr(7);
				}
				break;
			case 8:
				{
				_localctx = new ExprParenthesizedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(157);
				match(LPAREN);
				setState(158);
				expr(0);
				setState(159);
				match(RPAREN);
				}
				break;
			case 9:
				{
				_localctx = new ExprIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(161);
				match(INT_CONST);
				}
				break;
			case 10:
				{
				_localctx = new ExprBoolLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(162);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 11:
				{
				_localctx = new ExpStrLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(163);
				match(STR_CONST);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(197);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(195);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new ExprFieldAssignContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(166);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(167);
						match(DOT);
						setState(168);
						match(ID);
						setState(169);
						match(ASSIGN);
						setState(170);
						expr(16);
						}
						break;
					case 2:
						{
						_localctx = new ExprMulDivModContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(171);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(172);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << DIVIDE) | (1L << MODULUS))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(173);
						expr(11);
						}
						break;
					case 3:
						{
						_localctx = new ExprAddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(174);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(175);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(176);
						expr(10);
						}
						break;
					case 4:
						{
						_localctx = new ExprRelationalContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(177);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(178);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NE) | (1L << LE) | (1L << GE) | (1L << LT) | (1L << GT))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(179);
						expr(9);
						}
						break;
					case 5:
						{
						_localctx = new ExprAndContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(180);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(181);
						match(AND);
						setState(182);
						expr(7);
						}
						break;
					case 6:
						{
						_localctx = new ExprOrContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(183);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(184);
						match(OR);
						setState(185);
						expr(6);
						}
						break;
					case 7:
						{
						_localctx = new ExprDotMethodCallContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(186);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(187);
						match(DOT);
						setState(188);
						match(ID);
						setState(190);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
						case 1:
							{
							setState(189);
							argsList();
							}
							break;
						}
						}
						break;
					case 8:
						{
						_localctx = new ExprInstanceofContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(192);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(193);
						match(INSTANCEOF);
						setState(194);
						type();
						}
						break;
					}
					} 
				}
				setState(199);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArgsListContext extends ParserRuleContext {
		public ArgsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argsList; }
	 
		public ArgsListContext() { }
		public void copyFrom(ArgsListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LstOfArgsContext extends ArgsListContext {
		public TerminalNode LPAREN() { return getToken(BantamJavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(BantamJavaParser.RPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BantamJavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BantamJavaParser.COMMA, i);
		}
		public LstOfArgsContext(ArgsListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).enterLstOfArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).exitLstOfArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BantamJavaVisitor ) return ((BantamJavaVisitor<? extends T>)visitor).visitLstOfArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsListContext argsList() throws RecognitionException {
		ArgsListContext _localctx = new ArgsListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_argsList);
		int _la;
		try {
			_localctx = new LstOfArgsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(LPAREN);
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << LPAREN) | (1L << MINUS) | (1L << NOT) | (1L << ID) | (1L << INT_CONST) | (1L << STR_CONST))) != 0)) {
				{
				{
				setState(201);
				expr(0);
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(202);
					match(COMMA);
					setState(203);
					expr(0);
					}
					}
					setState(208);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(214);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 15);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 16);
		case 7:
			return precpred(_ctx, 13);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u00db\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\6\2\34\n\2\r\2\16\2\35\3\3\3\3\3\3\3\3\5\3$\n"+
		"\3\3\3\3\3\7\3(\n\3\f\3\16\3+\13\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4\63\n\4"+
		"\3\5\3\5\5\5\67\n\5\3\6\3\6\3\6\3\6\5\6=\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\7\7F\n\7\f\7\16\7I\13\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\7\bR\n\b\f\b\16"+
		"\bU\13\b\7\bW\n\b\f\b\16\bZ\13\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\7\nf\n\n\f\n\16\ni\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\ns\n\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0081\n\n\3\13\3\13"+
		"\5\13\u0085\n\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0090\n\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\5\f\u00a7\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00c1\n\f\3\f"+
		"\3\f\3\f\7\f\u00c6\n\f\f\f\16\f\u00c9\13\f\3\r\3\r\3\r\3\r\7\r\u00cf\n"+
		"\r\f\r\16\r\u00d2\13\r\7\r\u00d4\n\r\f\r\16\r\u00d7\13\r\3\r\3\r\3\r\2"+
		"\3\26\16\2\4\6\b\n\f\16\20\22\24\26\30\2\6\3\2\17\20\3\2\34\36\3\2\32"+
		"\33\3\2\37$\2\u00f6\2\33\3\2\2\2\4\37\3\2\2\2\6\62\3\2\2\2\b\66\3\2\2"+
		"\2\n8\3\2\2\2\f@\3\2\2\2\16M\3\2\2\2\20]\3\2\2\2\22\u0080\3\2\2\2\24\u0082"+
		"\3\2\2\2\26\u00a6\3\2\2\2\30\u00ca\3\2\2\2\32\34\5\4\3\2\33\32\3\2\2\2"+
		"\34\35\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36\3\3\2\2\2\37 \7\7\2\2 #"+
		"\7*\2\2!\"\7\b\2\2\"$\7*\2\2#!\3\2\2\2#$\3\2\2\2$%\3\2\2\2%)\7\24\2\2"+
		"&(\5\b\5\2\'&\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*,\3\2\2\2+)\3\2\2"+
		"\2,-\7\25\2\2-\5\3\2\2\2.\63\7\21\2\2/\63\7\22\2\2\60\63\7\23\2\2\61\63"+
		"\7*\2\2\62.\3\2\2\2\62/\3\2\2\2\62\60\3\2\2\2\62\61\3\2\2\2\63\7\3\2\2"+
		"\2\64\67\5\n\6\2\65\67\5\f\7\2\66\64\3\2\2\2\66\65\3\2\2\2\67\t\3\2\2"+
		"\289\5\6\4\29<\7*\2\2:;\7(\2\2;=\5\26\f\2<:\3\2\2\2<=\3\2\2\2=>\3\2\2"+
		"\2>?\7\30\2\2?\13\3\2\2\2@A\5\6\4\2AB\7*\2\2BC\5\16\b\2CG\7\24\2\2DF\5"+
		"\22\n\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2JK"+
		"\5\24\13\2KL\7\25\2\2L\r\3\2\2\2MX\7\26\2\2NS\5\20\t\2OP\7\31\2\2PR\5"+
		"\20\t\2QO\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TW\3\2\2\2US\3\2\2\2VN"+
		"\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2[\\\7\27\2\2"+
		"\\\17\3\2\2\2]^\5\6\4\2^_\7*\2\2_\21\3\2\2\2`a\5\26\f\2ab\7\30\2\2b\u0081"+
		"\3\2\2\2cg\7\24\2\2df\5\22\n\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2"+
		"hj\3\2\2\2ig\3\2\2\2j\u0081\7\25\2\2kl\7\n\2\2lm\7\26\2\2mn\5\26\f\2n"+
		"o\7\27\2\2or\5\22\n\2pq\7\13\2\2qs\5\22\n\2rp\3\2\2\2rs\3\2\2\2s\u0081"+
		"\3\2\2\2tu\7\f\2\2uv\7\26\2\2vw\5\26\f\2wx\7\27\2\2xy\5\22\n\2y\u0081"+
		"\3\2\2\2z{\5\6\4\2{|\7*\2\2|}\7(\2\2}~\5\26\f\2~\177\7\30\2\2\177\u0081"+
		"\3\2\2\2\u0080`\3\2\2\2\u0080c\3\2\2\2\u0080k\3\2\2\2\u0080t\3\2\2\2\u0080"+
		"z\3\2\2\2\u0081\23\3\2\2\2\u0082\u0084\7\t\2\2\u0083\u0085\5\26\f\2\u0084"+
		"\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\7\30"+
		"\2\2\u0087\25\3\2\2\2\u0088\u0089\b\f\1\2\u0089\u008a\7*\2\2\u008a\u008b"+
		"\7(\2\2\u008b\u00a7\5\26\f\25\u008c\u00a7\7*\2\2\u008d\u008f\7*\2\2\u008e"+
		"\u0090\5\30\r\2\u008f\u008e\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u00a7\3"+
		"\2\2\2\u0091\u0092\7\r\2\2\u0092\u0093\7*\2\2\u0093\u00a7\5\30\r\2\u0094"+
		"\u0095\7\26\2\2\u0095\u0096\5\6\4\2\u0096\u0097\7\27\2\2\u0097\u0098\7"+
		"\26\2\2\u0098\u0099\5\26\f\2\u0099\u009a\7\27\2\2\u009a\u00a7\3\2\2\2"+
		"\u009b\u009c\7\33\2\2\u009c\u00a7\5\26\f\r\u009d\u009e\7%\2\2\u009e\u00a7"+
		"\5\26\f\t\u009f\u00a0\7\26\2\2\u00a0\u00a1\5\26\f\2\u00a1\u00a2\7\27\2"+
		"\2\u00a2\u00a7\3\2\2\2\u00a3\u00a7\7+\2\2\u00a4\u00a7\t\2\2\2\u00a5\u00a7"+
		"\7,\2\2\u00a6\u0088\3\2\2\2\u00a6\u008c\3\2\2\2\u00a6\u008d\3\2\2\2\u00a6"+
		"\u0091\3\2\2\2\u00a6\u0094\3\2\2\2\u00a6\u009b\3\2\2\2\u00a6\u009d\3\2"+
		"\2\2\u00a6\u009f\3\2\2\2\u00a6\u00a3\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6"+
		"\u00a5\3\2\2\2\u00a7\u00c7\3\2\2\2\u00a8\u00a9\f\21\2\2\u00a9\u00aa\7"+
		")\2\2\u00aa\u00ab\7*\2\2\u00ab\u00ac\7(\2\2\u00ac\u00c6\5\26\f\22\u00ad"+
		"\u00ae\f\f\2\2\u00ae\u00af\t\3\2\2\u00af\u00c6\5\26\f\r\u00b0\u00b1\f"+
		"\13\2\2\u00b1\u00b2\t\4\2\2\u00b2\u00c6\5\26\f\f\u00b3\u00b4\f\n\2\2\u00b4"+
		"\u00b5\t\5\2\2\u00b5\u00c6\5\26\f\13\u00b6\u00b7\f\b\2\2\u00b7\u00b8\7"+
		"&\2\2\u00b8\u00c6\5\26\f\t\u00b9\u00ba\f\7\2\2\u00ba\u00bb\7\'\2\2\u00bb"+
		"\u00c6\5\26\f\b\u00bc\u00bd\f\22\2\2\u00bd\u00be\7)\2\2\u00be\u00c0\7"+
		"*\2\2\u00bf\u00c1\5\30\r\2\u00c0\u00bf\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1"+
		"\u00c6\3\2\2\2\u00c2\u00c3\f\17\2\2\u00c3\u00c4\7\16\2\2\u00c4\u00c6\5"+
		"\6\4\2\u00c5\u00a8\3\2\2\2\u00c5\u00ad\3\2\2\2\u00c5\u00b0\3\2\2\2\u00c5"+
		"\u00b3\3\2\2\2\u00c5\u00b6\3\2\2\2\u00c5\u00b9\3\2\2\2\u00c5\u00bc\3\2"+
		"\2\2\u00c5\u00c2\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8\27\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00d5\7\26\2"+
		"\2\u00cb\u00d0\5\26\f\2\u00cc\u00cd\7\31\2\2\u00cd\u00cf\5\26\f\2\u00ce"+
		"\u00cc\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2"+
		"\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00cb\3\2\2\2\u00d4"+
		"\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\3\2"+
		"\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00d9\7\27\2\2\u00d9\31\3\2\2\2\26\35#"+
		")\62\66<GSXgr\u0080\u0084\u008f\u00a6\u00c0\u00c5\u00c7\u00d0\u00d5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}