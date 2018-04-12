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
		SPACE=1, NEWLINE=2, DQUOTE=3, BADID=4, CLASS=5, EXTENDS=6, THIS=7, SUPER=8, 
		RETURN=9, IF=10, ELSE=11, WHILE=12, NEW=13, INSTANCEOF=14, TRUE=15, FALSE=16, 
		VOID=17, INT=18, BOOLEAN=19, LBRACE=20, RBRACE=21, LPAREN=22, RPAREN=23, 
		SEMI=24, COMMA=25, PLUS=26, MINUS=27, TIMES=28, DIVIDE=29, MODULUS=30, 
		EQ=31, NE=32, LE=33, GE=34, LT=35, GT=36, NOT=37, AND=38, OR=39, ASSIGN=40, 
		DOT=41, ID=42, INT_CONST=43, STR_CONST=44, ML_COMMENT=45, SL_COMMENT=46;
	public static final int
		RULE_program = 0, RULE_classDefn = 1, RULE_type = 2, RULE_member = 3, 
		RULE_field = 4, RULE_method = 5, RULE_formalList = 6, RULE_formal = 7, 
		RULE_stmt = 8, RULE_blockStmt = 9, RULE_retn = 10, RULE_expr = 11, RULE_argsList = 12;
	public static final String[] ruleNames = {
		"program", "classDefn", "type", "member", "field", "method", "formalList", 
		"formal", "stmt", "blockStmt", "retn", "expr", "argsList"
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
		public org.antlr.symtab.Scope scope;
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
			setState(27); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(26);
				classDefn();
				}
				}
				setState(29); 
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
		public org.antlr.symtab.Scope scope;
		public ClassDefnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDefn; }
	 
		public ClassDefnContext() { }
		public void copyFrom(ClassDefnContext ctx) {
			super.copyFrom(ctx);
			this.scope = ctx.scope;
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
			setState(31);
			match(CLASS);
			setState(32);
			((ClassContext)_localctx).className = match(ID);
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(33);
				match(EXTENDS);
				setState(34);
				((ClassContext)_localctx).superclassName = match(ID);
				}
			}

			setState(37);
			match(LBRACE);
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << INT) | (1L << BOOLEAN) | (1L << ID))) != 0)) {
				{
				{
				setState(38);
				member();
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44);
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
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				_localctx = new TypeVoidContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				match(VOID);
				}
				break;
			case INT:
				_localctx = new TypeIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				match(INT);
				}
				break;
			case BOOLEAN:
				_localctx = new TypeBoolContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				match(BOOLEAN);
				}
				break;
			case ID:
				_localctx = new TypeIDContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(49);
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
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new MemberFieldContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				field();
				}
				break;
			case 2:
				_localctx = new MemberMethodContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
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
		public Token fieldName;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(BantamJavaParser.SEMI, 0); }
		public TerminalNode ID() { return getToken(BantamJavaParser.ID, 0); }
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
			setState(56);
			type();
			setState(57);
			((FieldDeclOrInstContext)_localctx).fieldName = match(ID);
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(58);
				match(ASSIGN);
				setState(59);
				expr(0);
				}
			}

			setState(62);
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
		public org.antlr.symtab.Scope scope;
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
	 
		public MethodContext() { }
		public void copyFrom(MethodContext ctx) {
			super.copyFrom(ctx);
			this.scope = ctx.scope;
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
			setState(64);
			type();
			setState(65);
			match(ID);
			setState(66);
			formalList();
			setState(67);
			match(LBRACE);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << SUPER) | (1L << IF) | (1L << WHILE) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << VOID) | (1L << INT) | (1L << BOOLEAN) | (1L << LBRACE) | (1L << LPAREN) | (1L << MINUS) | (1L << NOT) | (1L << ID) | (1L << INT_CONST) | (1L << STR_CONST))) != 0)) {
				{
				{
				setState(68);
				stmt();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
			retn();
			setState(75);
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
			setState(77);
			match(LPAREN);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << INT) | (1L << BOOLEAN) | (1L << ID))) != 0)) {
				{
				{
				setState(78);
				formal();
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(79);
					match(COMMA);
					setState(80);
					formal();
					}
					}
					setState(85);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
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
	public static class FormalParameterContext extends FormalContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(BantamJavaParser.ID, 0); }
		public FormalParameterContext(FormalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).exitFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BantamJavaVisitor ) return ((BantamJavaVisitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalContext formal() throws RecognitionException {
		FormalContext _localctx = new FormalContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_formal);
		try {
			_localctx = new FormalParameterContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			type();
			setState(94);
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
		public BlockStmtContext blockStmt() {
			return getRuleContext(BlockStmtContext.class,0);
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
		try {
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new StmtExprSemiContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				expr(0);
				setState(97);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new StmtBlockContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				blockStmt();
				}
				break;
			case 3:
				_localctx = new StmtIfContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(100);
				match(IF);
				setState(101);
				match(LPAREN);
				setState(102);
				expr(0);
				setState(103);
				match(RPAREN);
				setState(104);
				stmt();
				setState(107);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(105);
					match(ELSE);
					setState(106);
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
				setState(109);
				match(WHILE);
				setState(110);
				match(LPAREN);
				setState(111);
				expr(0);
				setState(112);
				match(RPAREN);
				setState(113);
				stmt();
				}
				break;
			case 5:
				_localctx = new StmtLocalVarDeclContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(115);
				type();
				setState(116);
				match(ID);
				setState(117);
				match(ASSIGN);
				setState(118);
				expr(0);
				setState(119);
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

	public static class BlockStmtContext extends ParserRuleContext {
		public org.antlr.symtab.Scope scope;
		public TerminalNode LBRACE() { return getToken(BantamJavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(BantamJavaParser.RBRACE, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public BlockStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).enterBlockStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).exitBlockStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BantamJavaVisitor ) return ((BantamJavaVisitor<? extends T>)visitor).visitBlockStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStmtContext blockStmt() throws RecognitionException {
		BlockStmtContext _localctx = new BlockStmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_blockStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(LBRACE);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << SUPER) | (1L << IF) | (1L << WHILE) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << VOID) | (1L << INT) | (1L << BOOLEAN) | (1L << LBRACE) | (1L << LPAREN) | (1L << MINUS) | (1L << NOT) | (1L << ID) | (1L << INT_CONST) | (1L << STR_CONST))) != 0)) {
				{
				{
				setState(124);
				stmt();
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(130);
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
		enterRule(_localctx, 20, RULE_retn);
		int _la;
		try {
			_localctx = new ReturnContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(RETURN);
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << SUPER) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << LPAREN) | (1L << MINUS) | (1L << NOT) | (1L << ID) | (1L << INT_CONST) | (1L << STR_CONST))) != 0)) {
				{
				setState(133);
				expr(0);
				}
			}

			setState(136);
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
		public org.antlr.symtab.Type exprType;
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
			this.exprType = ctx.exprType;
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
		public TerminalNode DOT() { return getToken(BantamJavaParser.DOT, 0); }
		public TerminalNode ID() { return getToken(BantamJavaParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(BantamJavaParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode THIS() { return getToken(BantamJavaParser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(BantamJavaParser.SUPER, 0); }
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				_localctx = new ExprVarAssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(139);
				match(ID);
				setState(140);
				match(ASSIGN);
				setState(141);
				expr(19);
				}
				break;
			case 2:
				{
				_localctx = new ExprIDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(142);
				match(ID);
				}
				break;
			case 3:
				{
				_localctx = new ExprMethodCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(143);
				match(ID);
				setState(144);
				argsList();
				}
				break;
			case 4:
				{
				_localctx = new ExprFieldAssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(145);
				_la = _input.LA(1);
				if ( !(_la==THIS || _la==SUPER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(146);
				match(DOT);
				setState(147);
				match(ID);
				setState(148);
				match(ASSIGN);
				setState(149);
				expr(15);
				}
				break;
			case 5:
				{
				_localctx = new ExprNewContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(150);
				match(NEW);
				setState(151);
				match(ID);
				setState(152);
				argsList();
				}
				break;
			case 6:
				{
				_localctx = new ExprTypeConversionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(153);
				match(LPAREN);
				setState(154);
				type();
				setState(155);
				match(RPAREN);
				setState(156);
				match(LPAREN);
				setState(157);
				expr(0);
				setState(158);
				match(RPAREN);
				}
				break;
			case 7:
				{
				_localctx = new ExprNegationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(160);
				match(MINUS);
				setState(161);
				expr(11);
				}
				break;
			case 8:
				{
				_localctx = new ExprNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(162);
				match(NOT);
				setState(163);
				expr(7);
				}
				break;
			case 9:
				{
				_localctx = new ExprParenthesizedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(164);
				match(LPAREN);
				setState(165);
				expr(0);
				setState(166);
				match(RPAREN);
				}
				break;
			case 10:
				{
				_localctx = new ExprIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(168);
				match(INT_CONST);
				}
				break;
			case 11:
				{
				_localctx = new ExprBoolLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(169);
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
			case 12:
				{
				_localctx = new ExpStrLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(170);
				match(STR_CONST);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(197);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(195);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExprMulDivModContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(173);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(174);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << DIVIDE) | (1L << MODULUS))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(175);
						expr(11);
						}
						break;
					case 2:
						{
						_localctx = new ExprAddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(176);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(177);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(178);
						expr(10);
						}
						break;
					case 3:
						{
						_localctx = new ExprRelationalContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(179);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(180);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NE) | (1L << LE) | (1L << GE) | (1L << LT) | (1L << GT))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(181);
						expr(9);
						}
						break;
					case 4:
						{
						_localctx = new ExprAndContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(182);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(183);
						match(AND);
						setState(184);
						expr(7);
						}
						break;
					case 5:
						{
						_localctx = new ExprOrContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(185);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(186);
						match(OR);
						setState(187);
						expr(6);
						}
						break;
					case 6:
						{
						_localctx = new ExprDotMethodCallContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(188);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(189);
						match(DOT);
						setState(190);
						match(ID);
						setState(191);
						argsList();
						}
						break;
					case 7:
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
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
		enterRule(_localctx, 24, RULE_argsList);
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << SUPER) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << LPAREN) | (1L << MINUS) | (1L << NOT) | (1L << ID) | (1L << INT_CONST) | (1L << STR_CONST))) != 0)) {
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
		case 11:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 16);
		case 6:
			return precpred(_ctx, 13);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u00db\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\6\2\36\n\2\r\2\16\2\37\3\3\3\3\3\3"+
		"\3\3\5\3&\n\3\3\3\3\3\7\3*\n\3\f\3\16\3-\13\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\5\4\65\n\4\3\5\3\5\5\59\n\5\3\6\3\6\3\6\3\6\5\6?\n\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\7\7H\n\7\f\7\16\7K\13\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\7\bT"+
		"\n\b\f\b\16\bW\13\b\7\bY\n\b\f\b\16\b\\\13\b\3\b\3\b\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nn\n\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n|\n\n\3\13\3\13\7\13\u0080\n\13\f\13\16"+
		"\13\u0083\13\13\3\13\3\13\3\f\3\f\5\f\u0089\n\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ae\n\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\7\r\u00c6\n\r\f\r\16\r\u00c9\13\r\3\16\3\16\3\16\3\16\7\16"+
		"\u00cf\n\16\f\16\16\16\u00d2\13\16\7\16\u00d4\n\16\f\16\16\16\u00d7\13"+
		"\16\3\16\3\16\3\16\2\3\30\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\7\3\2"+
		"\t\n\3\2\21\22\3\2\36 \3\2\34\35\3\2!&\2\u00f3\2\35\3\2\2\2\4!\3\2\2\2"+
		"\6\64\3\2\2\2\b8\3\2\2\2\n:\3\2\2\2\fB\3\2\2\2\16O\3\2\2\2\20_\3\2\2\2"+
		"\22{\3\2\2\2\24}\3\2\2\2\26\u0086\3\2\2\2\30\u00ad\3\2\2\2\32\u00ca\3"+
		"\2\2\2\34\36\5\4\3\2\35\34\3\2\2\2\36\37\3\2\2\2\37\35\3\2\2\2\37 \3\2"+
		"\2\2 \3\3\2\2\2!\"\7\7\2\2\"%\7,\2\2#$\7\b\2\2$&\7,\2\2%#\3\2\2\2%&\3"+
		"\2\2\2&\'\3\2\2\2\'+\7\26\2\2(*\5\b\5\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2\2"+
		"+,\3\2\2\2,.\3\2\2\2-+\3\2\2\2./\7\27\2\2/\5\3\2\2\2\60\65\7\23\2\2\61"+
		"\65\7\24\2\2\62\65\7\25\2\2\63\65\7,\2\2\64\60\3\2\2\2\64\61\3\2\2\2\64"+
		"\62\3\2\2\2\64\63\3\2\2\2\65\7\3\2\2\2\669\5\n\6\2\679\5\f\7\28\66\3\2"+
		"\2\28\67\3\2\2\29\t\3\2\2\2:;\5\6\4\2;>\7,\2\2<=\7*\2\2=?\5\30\r\2><\3"+
		"\2\2\2>?\3\2\2\2?@\3\2\2\2@A\7\32\2\2A\13\3\2\2\2BC\5\6\4\2CD\7,\2\2D"+
		"E\5\16\b\2EI\7\26\2\2FH\5\22\n\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2"+
		"\2JL\3\2\2\2KI\3\2\2\2LM\5\26\f\2MN\7\27\2\2N\r\3\2\2\2OZ\7\30\2\2PU\5"+
		"\20\t\2QR\7\33\2\2RT\5\20\t\2SQ\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2"+
		"VY\3\2\2\2WU\3\2\2\2XP\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2"+
		"\2\\Z\3\2\2\2]^\7\31\2\2^\17\3\2\2\2_`\5\6\4\2`a\7,\2\2a\21\3\2\2\2bc"+
		"\5\30\r\2cd\7\32\2\2d|\3\2\2\2e|\5\24\13\2fg\7\f\2\2gh\7\30\2\2hi\5\30"+
		"\r\2ij\7\31\2\2jm\5\22\n\2kl\7\r\2\2ln\5\22\n\2mk\3\2\2\2mn\3\2\2\2n|"+
		"\3\2\2\2op\7\16\2\2pq\7\30\2\2qr\5\30\r\2rs\7\31\2\2st\5\22\n\2t|\3\2"+
		"\2\2uv\5\6\4\2vw\7,\2\2wx\7*\2\2xy\5\30\r\2yz\7\32\2\2z|\3\2\2\2{b\3\2"+
		"\2\2{e\3\2\2\2{f\3\2\2\2{o\3\2\2\2{u\3\2\2\2|\23\3\2\2\2}\u0081\7\26\2"+
		"\2~\u0080\5\22\n\2\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2"+
		"\u0081\u0082\3\2\2\2\u0082\u0084\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0085"+
		"\7\27\2\2\u0085\25\3\2\2\2\u0086\u0088\7\13\2\2\u0087\u0089\5\30\r\2\u0088"+
		"\u0087\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\7\32"+
		"\2\2\u008b\27\3\2\2\2\u008c\u008d\b\r\1\2\u008d\u008e\7,\2\2\u008e\u008f"+
		"\7*\2\2\u008f\u00ae\5\30\r\25\u0090\u00ae\7,\2\2\u0091\u0092\7,\2\2\u0092"+
		"\u00ae\5\32\16\2\u0093\u0094\t\2\2\2\u0094\u0095\7+\2\2\u0095\u0096\7"+
		",\2\2\u0096\u0097\7*\2\2\u0097\u00ae\5\30\r\21\u0098\u0099\7\17\2\2\u0099"+
		"\u009a\7,\2\2\u009a\u00ae\5\32\16\2\u009b\u009c\7\30\2\2\u009c\u009d\5"+
		"\6\4\2\u009d\u009e\7\31\2\2\u009e\u009f\7\30\2\2\u009f\u00a0\5\30\r\2"+
		"\u00a0\u00a1\7\31\2\2\u00a1\u00ae\3\2\2\2\u00a2\u00a3\7\35\2\2\u00a3\u00ae"+
		"\5\30\r\r\u00a4\u00a5\7\'\2\2\u00a5\u00ae\5\30\r\t\u00a6\u00a7\7\30\2"+
		"\2\u00a7\u00a8\5\30\r\2\u00a8\u00a9\7\31\2\2\u00a9\u00ae\3\2\2\2\u00aa"+
		"\u00ae\7-\2\2\u00ab\u00ae\t\3\2\2\u00ac\u00ae\7.\2\2\u00ad\u008c\3\2\2"+
		"\2\u00ad\u0090\3\2\2\2\u00ad\u0091\3\2\2\2\u00ad\u0093\3\2\2\2\u00ad\u0098"+
		"\3\2\2\2\u00ad\u009b\3\2\2\2\u00ad\u00a2\3\2\2\2\u00ad\u00a4\3\2\2\2\u00ad"+
		"\u00a6\3\2\2\2\u00ad\u00aa\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ac\3\2"+
		"\2\2\u00ae\u00c7\3\2\2\2\u00af\u00b0\f\f\2\2\u00b0\u00b1\t\4\2\2\u00b1"+
		"\u00c6\5\30\r\r\u00b2\u00b3\f\13\2\2\u00b3\u00b4\t\5\2\2\u00b4\u00c6\5"+
		"\30\r\f\u00b5\u00b6\f\n\2\2\u00b6\u00b7\t\6\2\2\u00b7\u00c6\5\30\r\13"+
		"\u00b8\u00b9\f\b\2\2\u00b9\u00ba\7(\2\2\u00ba\u00c6\5\30\r\t\u00bb\u00bc"+
		"\f\7\2\2\u00bc\u00bd\7)\2\2\u00bd\u00c6\5\30\r\b\u00be\u00bf\f\22\2\2"+
		"\u00bf\u00c0\7+\2\2\u00c0\u00c1\7,\2\2\u00c1\u00c6\5\32\16\2\u00c2\u00c3"+
		"\f\17\2\2\u00c3\u00c4\7\20\2\2\u00c4\u00c6\5\6\4\2\u00c5\u00af\3\2\2\2"+
		"\u00c5\u00b2\3\2\2\2\u00c5\u00b5\3\2\2\2\u00c5\u00b8\3\2\2\2\u00c5\u00bb"+
		"\3\2\2\2\u00c5\u00be\3\2\2\2\u00c5\u00c2\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7"+
		"\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\31\3\2\2\2\u00c9\u00c7\3\2\2"+
		"\2\u00ca\u00d5\7\30\2\2\u00cb\u00d0\5\30\r\2\u00cc\u00cd\7\33\2\2\u00cd"+
		"\u00cf\5\30\r\2\u00ce\u00cc\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3"+
		"\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3"+
		"\u00cb\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2"+
		"\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00d9\7\31\2\2\u00d9"+
		"\33\3\2\2\2\24\37%+\648>IUZm{\u0081\u0088\u00ad\u00c5\u00c7\u00d0\u00d5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}