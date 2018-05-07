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
		RULE_stmt = 8, RULE_localVar = 9, RULE_blockStmt = 10, RULE_retn = 11, 
		RULE_expr = 12, RULE_argsList = 13;
	public static final String[] ruleNames = {
		"program", "classDefn", "type", "member", "field", "method", "formalList", 
		"formal", "stmt", "localVar", "blockStmt", "retn", "expr", "argsList"
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
			setState(29); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(28);
				classDefn();
				}
				}
				setState(31); 
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
		public org.antlr.symtab.ClassSymbol symbol;
		public ClassDefnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDefn; }
	 
		public ClassDefnContext() { }
		public void copyFrom(ClassDefnContext ctx) {
			super.copyFrom(ctx);
			this.scope = ctx.scope;
			this.symbol = ctx.symbol;
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
			setState(33);
			match(CLASS);
			setState(34);
			((ClassContext)_localctx).className = match(ID);
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(35);
				match(EXTENDS);
				setState(36);
				((ClassContext)_localctx).superclassName = match(ID);
				}
			}

			setState(39);
			match(LBRACE);
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << INT) | (1L << BOOLEAN) | (1L << ID))) != 0)) {
				{
				{
				setState(40);
				member();
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(46);
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
		public org.antlr.symtab.Type typeSymbol;
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
			this.typeSymbol = ctx.typeSymbol;
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
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				_localctx = new TypeVoidContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				match(VOID);
				}
				break;
			case INT:
				_localctx = new TypeIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				match(INT);
				}
				break;
			case BOOLEAN:
				_localctx = new TypeBoolContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
				match(BOOLEAN);
				}
				break;
			case ID:
				_localctx = new TypeIDContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(51);
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
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new MemberFieldContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				field();
				}
				break;
			case 2:
				_localctx = new MemberMethodContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
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
		public org.antlr.symtab.FieldSymbol symbol;
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
	 
		public FieldContext() { }
		public void copyFrom(FieldContext ctx) {
			super.copyFrom(ctx);
			this.symbol = ctx.symbol;
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
			setState(58);
			type();
			setState(59);
			((FieldDeclOrInstContext)_localctx).fieldName = match(ID);
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(60);
				match(ASSIGN);
				setState(61);
				expr(0);
				}
			}

			setState(64);
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
		public org.antlr.symtab.MethodSymbol symbol;
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
	 
		public MethodContext() { }
		public void copyFrom(MethodContext ctx) {
			super.copyFrom(ctx);
			this.scope = ctx.scope;
			this.symbol = ctx.symbol;
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
			setState(66);
			type();
			setState(67);
			match(ID);
			setState(68);
			formalList();
			setState(69);
			match(LBRACE);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << SUPER) | (1L << IF) | (1L << WHILE) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << VOID) | (1L << INT) | (1L << BOOLEAN) | (1L << LBRACE) | (1L << LPAREN) | (1L << MINUS) | (1L << NOT) | (1L << ID) | (1L << INT_CONST) | (1L << STR_CONST))) != 0)) {
				{
				{
				setState(70);
				stmt();
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
			retn();
			setState(77);
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
			setState(79);
			match(LPAREN);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << INT) | (1L << BOOLEAN) | (1L << ID))) != 0)) {
				{
				{
				setState(80);
				formal();
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(81);
					match(COMMA);
					setState(82);
					formal();
					}
					}
					setState(87);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
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
		public org.antlr.symtab.ParameterSymbol symbol;
		public FormalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal; }
	 
		public FormalContext() { }
		public void copyFrom(FormalContext ctx) {
			super.copyFrom(ctx);
			this.symbol = ctx.symbol;
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
			setState(95);
			type();
			setState(96);
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
	public static class StmtLocalVarContext extends StmtContext {
		public LocalVarContext localVar() {
			return getRuleContext(LocalVarContext.class,0);
		}
		public StmtLocalVarContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).enterStmtLocalVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).exitStmtLocalVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BantamJavaVisitor ) return ((BantamJavaVisitor<? extends T>)visitor).visitStmtLocalVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stmt);
		try {
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new StmtExprSemiContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				expr(0);
				setState(99);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new StmtBlockContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				blockStmt();
				}
				break;
			case 3:
				_localctx = new StmtIfContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(102);
				match(IF);
				setState(103);
				match(LPAREN);
				setState(104);
				expr(0);
				setState(105);
				match(RPAREN);
				setState(106);
				stmt();
				setState(109);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(107);
					match(ELSE);
					setState(108);
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
				setState(111);
				match(WHILE);
				setState(112);
				match(LPAREN);
				setState(113);
				expr(0);
				setState(114);
				match(RPAREN);
				setState(115);
				stmt();
				}
				break;
			case 5:
				_localctx = new StmtLocalVarContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(117);
				localVar();
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

	public static class LocalVarContext extends ParserRuleContext {
		public org.antlr.symtab.VariableSymbol symbol;
		public LocalVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVar; }
	 
		public LocalVarContext() { }
		public void copyFrom(LocalVarContext ctx) {
			super.copyFrom(ctx);
			this.symbol = ctx.symbol;
		}
	}
	public static class StmtLocalVarDeclContext extends LocalVarContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(BantamJavaParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(BantamJavaParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(BantamJavaParser.SEMI, 0); }
		public StmtLocalVarDeclContext(LocalVarContext ctx) { copyFrom(ctx); }
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

	public final LocalVarContext localVar() throws RecognitionException {
		LocalVarContext _localctx = new LocalVarContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_localVar);
		try {
			_localctx = new StmtLocalVarDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
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
		enterRule(_localctx, 20, RULE_blockStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(LBRACE);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << SUPER) | (1L << IF) | (1L << WHILE) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << VOID) | (1L << INT) | (1L << BOOLEAN) | (1L << LBRACE) | (1L << LPAREN) | (1L << MINUS) | (1L << NOT) | (1L << ID) | (1L << INT_CONST) | (1L << STR_CONST))) != 0)) {
				{
				{
				setState(127);
				stmt();
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(133);
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
		enterRule(_localctx, 22, RULE_retn);
		int _la;
		try {
			_localctx = new ReturnContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(RETURN);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << SUPER) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << LPAREN) | (1L << MINUS) | (1L << NOT) | (1L << ID) | (1L << INT_CONST) | (1L << STR_CONST))) != 0)) {
				{
				setState(136);
				expr(0);
				}
			}

			setState(139);
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
		public int height;
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
			this.exprType = ctx.exprType;
			this.height = ctx.height;
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
		public TerminalNode LPAREN() { return getToken(BantamJavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(BantamJavaParser.RPAREN, 0); }
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
		public Token operator;
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				_localctx = new ExprVarAssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(142);
				match(ID);
				setState(143);
				match(ASSIGN);
				setState(144);
				expr(19);
				}
				break;
			case 2:
				{
				_localctx = new ExprIDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(145);
				match(ID);
				}
				break;
			case 3:
				{
				_localctx = new ExprMethodCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(146);
				match(ID);
				setState(147);
				argsList();
				}
				break;
			case 4:
				{
				_localctx = new ExprFieldAssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(148);
				_la = _input.LA(1);
				if ( !(_la==THIS || _la==SUPER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(149);
				match(DOT);
				setState(150);
				match(ID);
				setState(151);
				match(ASSIGN);
				setState(152);
				expr(15);
				}
				break;
			case 5:
				{
				_localctx = new ExprNewContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(153);
				match(NEW);
				setState(154);
				match(ID);
				setState(155);
				match(LPAREN);
				setState(156);
				match(RPAREN);
				}
				break;
			case 6:
				{
				_localctx = new ExprTypeConversionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(157);
				match(LPAREN);
				setState(158);
				type();
				setState(159);
				match(RPAREN);
				setState(160);
				match(LPAREN);
				setState(161);
				expr(0);
				setState(162);
				match(RPAREN);
				}
				break;
			case 7:
				{
				_localctx = new ExprNegationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(164);
				match(MINUS);
				setState(165);
				expr(11);
				}
				break;
			case 8:
				{
				_localctx = new ExprNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(166);
				match(NOT);
				setState(167);
				expr(7);
				}
				break;
			case 9:
				{
				_localctx = new ExprParenthesizedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(168);
				match(LPAREN);
				setState(169);
				expr(0);
				setState(170);
				match(RPAREN);
				}
				break;
			case 10:
				{
				_localctx = new ExprIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(172);
				match(INT_CONST);
				}
				break;
			case 11:
				{
				_localctx = new ExprBoolLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(173);
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
				setState(174);
				match(STR_CONST);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(201);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(199);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExprMulDivModContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(177);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(178);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << DIVIDE) | (1L << MODULUS))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(179);
						expr(11);
						}
						break;
					case 2:
						{
						_localctx = new ExprAddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(180);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(181);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(182);
						expr(10);
						}
						break;
					case 3:
						{
						_localctx = new ExprRelationalContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(183);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(184);
						((ExprRelationalContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NE) | (1L << LE) | (1L << GE) | (1L << LT) | (1L << GT))) != 0)) ) {
							((ExprRelationalContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(185);
						expr(9);
						}
						break;
					case 4:
						{
						_localctx = new ExprAndContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(186);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(187);
						match(AND);
						setState(188);
						expr(7);
						}
						break;
					case 5:
						{
						_localctx = new ExprOrContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(189);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(190);
						match(OR);
						setState(191);
						expr(6);
						}
						break;
					case 6:
						{
						_localctx = new ExprDotMethodCallContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(192);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(193);
						match(DOT);
						setState(194);
						match(ID);
						setState(195);
						argsList();
						}
						break;
					case 7:
						{
						_localctx = new ExprInstanceofContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(196);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(197);
						match(INSTANCEOF);
						setState(198);
						type();
						}
						break;
					}
					} 
				}
				setState(203);
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
		enterRule(_localctx, 26, RULE_argsList);
		int _la;
		try {
			_localctx = new LstOfArgsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(LPAREN);
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << SUPER) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << LPAREN) | (1L << MINUS) | (1L << NOT) | (1L << ID) | (1L << INT_CONST) | (1L << STR_CONST))) != 0)) {
				{
				{
				setState(205);
				expr(0);
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(206);
					match(COMMA);
					setState(207);
					expr(0);
					}
					}
					setState(212);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(218);
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
		case 12:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u00df\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\6\2 \n\2\r\2\16\2!\3\3\3"+
		"\3\3\3\3\3\5\3(\n\3\3\3\3\3\7\3,\n\3\f\3\16\3/\13\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\5\4\67\n\4\3\5\3\5\5\5;\n\5\3\6\3\6\3\6\3\6\5\6A\n\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\7\7J\n\7\f\7\16\7M\13\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\7\bV\n\b\f\b\16\bY\13\b\7\b[\n\b\f\b\16\b^\13\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\np\n\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\5\ny\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\7\f\u0083\n"+
		"\f\f\f\16\f\u0086\13\f\3\f\3\f\3\r\3\r\5\r\u008c\n\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u00b2\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\7\16\u00ca\n\16\f\16\16\16\u00cd\13\16\3\17\3\17\3\17\3\17\7\17"+
		"\u00d3\n\17\f\17\16\17\u00d6\13\17\7\17\u00d8\n\17\f\17\16\17\u00db\13"+
		"\17\3\17\3\17\3\17\2\3\32\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\7\3"+
		"\2\t\n\3\2\21\22\3\2\36 \3\2\34\35\3\2!&\2\u00f6\2\37\3\2\2\2\4#\3\2\2"+
		"\2\6\66\3\2\2\2\b:\3\2\2\2\n<\3\2\2\2\fD\3\2\2\2\16Q\3\2\2\2\20a\3\2\2"+
		"\2\22x\3\2\2\2\24z\3\2\2\2\26\u0080\3\2\2\2\30\u0089\3\2\2\2\32\u00b1"+
		"\3\2\2\2\34\u00ce\3\2\2\2\36 \5\4\3\2\37\36\3\2\2\2 !\3\2\2\2!\37\3\2"+
		"\2\2!\"\3\2\2\2\"\3\3\2\2\2#$\7\7\2\2$\'\7,\2\2%&\7\b\2\2&(\7,\2\2\'%"+
		"\3\2\2\2\'(\3\2\2\2()\3\2\2\2)-\7\26\2\2*,\5\b\5\2+*\3\2\2\2,/\3\2\2\2"+
		"-+\3\2\2\2-.\3\2\2\2.\60\3\2\2\2/-\3\2\2\2\60\61\7\27\2\2\61\5\3\2\2\2"+
		"\62\67\7\23\2\2\63\67\7\24\2\2\64\67\7\25\2\2\65\67\7,\2\2\66\62\3\2\2"+
		"\2\66\63\3\2\2\2\66\64\3\2\2\2\66\65\3\2\2\2\67\7\3\2\2\28;\5\n\6\29;"+
		"\5\f\7\2:8\3\2\2\2:9\3\2\2\2;\t\3\2\2\2<=\5\6\4\2=@\7,\2\2>?\7*\2\2?A"+
		"\5\32\16\2@>\3\2\2\2@A\3\2\2\2AB\3\2\2\2BC\7\32\2\2C\13\3\2\2\2DE\5\6"+
		"\4\2EF\7,\2\2FG\5\16\b\2GK\7\26\2\2HJ\5\22\n\2IH\3\2\2\2JM\3\2\2\2KI\3"+
		"\2\2\2KL\3\2\2\2LN\3\2\2\2MK\3\2\2\2NO\5\30\r\2OP\7\27\2\2P\r\3\2\2\2"+
		"Q\\\7\30\2\2RW\5\20\t\2ST\7\33\2\2TV\5\20\t\2US\3\2\2\2VY\3\2\2\2WU\3"+
		"\2\2\2WX\3\2\2\2X[\3\2\2\2YW\3\2\2\2ZR\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\"+
		"]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_`\7\31\2\2`\17\3\2\2\2ab\5\6\4\2bc\7,\2"+
		"\2c\21\3\2\2\2de\5\32\16\2ef\7\32\2\2fy\3\2\2\2gy\5\26\f\2hi\7\f\2\2i"+
		"j\7\30\2\2jk\5\32\16\2kl\7\31\2\2lo\5\22\n\2mn\7\r\2\2np\5\22\n\2om\3"+
		"\2\2\2op\3\2\2\2py\3\2\2\2qr\7\16\2\2rs\7\30\2\2st\5\32\16\2tu\7\31\2"+
		"\2uv\5\22\n\2vy\3\2\2\2wy\5\24\13\2xd\3\2\2\2xg\3\2\2\2xh\3\2\2\2xq\3"+
		"\2\2\2xw\3\2\2\2y\23\3\2\2\2z{\5\6\4\2{|\7,\2\2|}\7*\2\2}~\5\32\16\2~"+
		"\177\7\32\2\2\177\25\3\2\2\2\u0080\u0084\7\26\2\2\u0081\u0083\5\22\n\2"+
		"\u0082\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085"+
		"\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088\7\27\2\2"+
		"\u0088\27\3\2\2\2\u0089\u008b\7\13\2\2\u008a\u008c\5\32\16\2\u008b\u008a"+
		"\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\7\32\2\2"+
		"\u008e\31\3\2\2\2\u008f\u0090\b\16\1\2\u0090\u0091\7,\2\2\u0091\u0092"+
		"\7*\2\2\u0092\u00b2\5\32\16\25\u0093\u00b2\7,\2\2\u0094\u0095\7,\2\2\u0095"+
		"\u00b2\5\34\17\2\u0096\u0097\t\2\2\2\u0097\u0098\7+\2\2\u0098\u0099\7"+
		",\2\2\u0099\u009a\7*\2\2\u009a\u00b2\5\32\16\21\u009b\u009c\7\17\2\2\u009c"+
		"\u009d\7,\2\2\u009d\u009e\7\30\2\2\u009e\u00b2\7\31\2\2\u009f\u00a0\7"+
		"\30\2\2\u00a0\u00a1\5\6\4\2\u00a1\u00a2\7\31\2\2\u00a2\u00a3\7\30\2\2"+
		"\u00a3\u00a4\5\32\16\2\u00a4\u00a5\7\31\2\2\u00a5\u00b2\3\2\2\2\u00a6"+
		"\u00a7\7\35\2\2\u00a7\u00b2\5\32\16\r\u00a8\u00a9\7\'\2\2\u00a9\u00b2"+
		"\5\32\16\t\u00aa\u00ab\7\30\2\2\u00ab\u00ac\5\32\16\2\u00ac\u00ad\7\31"+
		"\2\2\u00ad\u00b2\3\2\2\2\u00ae\u00b2\7-\2\2\u00af\u00b2\t\3\2\2\u00b0"+
		"\u00b2\7.\2\2\u00b1\u008f\3\2\2\2\u00b1\u0093\3\2\2\2\u00b1\u0094\3\2"+
		"\2\2\u00b1\u0096\3\2\2\2\u00b1\u009b\3\2\2\2\u00b1\u009f\3\2\2\2\u00b1"+
		"\u00a6\3\2\2\2\u00b1\u00a8\3\2\2\2\u00b1\u00aa\3\2\2\2\u00b1\u00ae\3\2"+
		"\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00cb\3\2\2\2\u00b3"+
		"\u00b4\f\f\2\2\u00b4\u00b5\t\4\2\2\u00b5\u00ca\5\32\16\r\u00b6\u00b7\f"+
		"\13\2\2\u00b7\u00b8\t\5\2\2\u00b8\u00ca\5\32\16\f\u00b9\u00ba\f\n\2\2"+
		"\u00ba\u00bb\t\6\2\2\u00bb\u00ca\5\32\16\13\u00bc\u00bd\f\b\2\2\u00bd"+
		"\u00be\7(\2\2\u00be\u00ca\5\32\16\t\u00bf\u00c0\f\7\2\2\u00c0\u00c1\7"+
		")\2\2\u00c1\u00ca\5\32\16\b\u00c2\u00c3\f\22\2\2\u00c3\u00c4\7+\2\2\u00c4"+
		"\u00c5\7,\2\2\u00c5\u00ca\5\34\17\2\u00c6\u00c7\f\17\2\2\u00c7\u00c8\7"+
		"\20\2\2\u00c8\u00ca\5\6\4\2\u00c9\u00b3\3\2\2\2\u00c9\u00b6\3\2\2\2\u00c9"+
		"\u00b9\3\2\2\2\u00c9\u00bc\3\2\2\2\u00c9\u00bf\3\2\2\2\u00c9\u00c2\3\2"+
		"\2\2\u00c9\u00c6\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc\33\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00d9\7\30\2"+
		"\2\u00cf\u00d4\5\32\16\2\u00d0\u00d1\7\33\2\2\u00d1\u00d3\5\32\16\2\u00d2"+
		"\u00d0\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2"+
		"\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00cf\3\2\2\2\u00d8"+
		"\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dc\3\2"+
		"\2\2\u00db\u00d9\3\2\2\2\u00dc\u00dd\7\31\2\2\u00dd\35\3\2\2\2\24!\'-"+
		"\66:@KW\\ox\u0084\u008b\u00b1\u00c9\u00cb\u00d4\u00d9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}