// Generated from /Users/sykesda/IdeaProjects/2018/02/201702-cosc420-bjc/src/main/java/BantamJava.g4 by ANTLR 4.7
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
		public TerminalNode CLASS() { return getToken(BantamJavaParser.CLASS, 0); }
		public List<TerminalNode> ID() { return getTokens(BantamJavaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(BantamJavaParser.ID, i);
		}
		public TerminalNode LBRACE() { return getToken(BantamJavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(BantamJavaParser.RBRACE, 0); }
		public TerminalNode EXTENDS() { return getToken(BantamJavaParser.EXTENDS, 0); }
		public List<MemberContext> member() {
			return getRuleContexts(MemberContext.class);
		}
		public MemberContext member(int i) {
			return getRuleContext(MemberContext.class,i);
		}
		public ClassContext(ClassDefnContext ctx) { copyFrom(ctx); }
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
			match(ID);
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(31);
				match(EXTENDS);
				setState(32);
				match(ID);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BantamJavaVisitor ) return ((BantamJavaVisitor<? extends T>)visitor).visitTypeInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeIDContext extends TypeContext {
		public TerminalNode ID() { return getToken(BantamJavaParser.ID, 0); }
		public TypeIDContext(TypeContext ctx) { copyFrom(ctx); }
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BantamJavaVisitor ) return ((BantamJavaVisitor<? extends T>)visitor).visitTypeBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeVoidContext extends TypeContext {
		public TerminalNode VOID() { return getToken(BantamJavaParser.VOID, 0); }
		public TypeVoidContext(TypeContext ctx) { copyFrom(ctx); }
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BantamJavaVisitor ) return ((BantamJavaVisitor<? extends T>)visitor).visitStmtLocalVarDecl(this);
			else return visitor.visitChildren(this);
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
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public StmtIfContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BantamJavaVisitor ) return ((BantamJavaVisitor<? extends T>)visitor).visitStmtIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtIfElseContext extends StmtContext {
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
		public StmtIfElseContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BantamJavaVisitor ) return ((BantamJavaVisitor<? extends T>)visitor).visitStmtIfElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stmt);
		int _la;
		try {
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
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
				_localctx = new StmtIfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				match(IF);
				setState(98);
				match(LPAREN);
				setState(99);
				expr(0);
				setState(100);
				match(RPAREN);
				setState(101);
				stmt();
				}
				break;
			case 3:
				_localctx = new StmtIfElseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(103);
				match(IF);
				setState(104);
				match(LPAREN);
				setState(105);
				expr(0);
				setState(106);
				match(RPAREN);
				setState(107);
				stmt();
				setState(108);
				match(ELSE);
				setState(109);
				stmt();
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
				_localctx = new StmtLocalVarDeclContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(117);
				type();
				setState(118);
				match(ID);
				setState(119);
				match(ASSIGN);
				setState(120);
				expr(0);
				setState(121);
				match(SEMI);
				}
				break;
			case 6:
				_localctx = new StmtBlockContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(123);
				match(LBRACE);
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << VOID) | (1L << INT) | (1L << BOOLEAN) | (1L << LBRACE) | (1L << LPAREN) | (1L << MINUS) | (1L << NOT) | (1L << ID) | (1L << INT_CONST) | (1L << STR_CONST))) != 0)) {
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
			setState(133);
			match(RETURN);
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << LPAREN) | (1L << MINUS) | (1L << NOT) | (1L << ID) | (1L << INT_CONST) | (1L << STR_CONST))) != 0)) {
				{
				setState(134);
				expr(0);
				}
			}

			setState(137);
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
		public TerminalNode ID() { return getToken(BantamJavaParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(BantamJavaParser.ASSIGN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode NEW() { return getToken(BantamJavaParser.NEW, 0); }
		public ArgsListContext argsList() {
			return getRuleContext(ArgsListContext.class,0);
		}
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
		public TerminalNode MINUS() { return getToken(BantamJavaParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(BantamJavaParser.NOT, 0); }
		public TerminalNode INT_CONST() { return getToken(BantamJavaParser.INT_CONST, 0); }
		public TerminalNode TRUE() { return getToken(BantamJavaParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(BantamJavaParser.FALSE, 0); }
		public TerminalNode STR_CONST() { return getToken(BantamJavaParser.STR_CONST, 0); }
		public TerminalNode DOT() { return getToken(BantamJavaParser.DOT, 0); }
		public TerminalNode TIMES() { return getToken(BantamJavaParser.TIMES, 0); }
		public TerminalNode DIVIDE() { return getToken(BantamJavaParser.DIVIDE, 0); }
		public TerminalNode MODULUS() { return getToken(BantamJavaParser.MODULUS, 0); }
		public TerminalNode PLUS() { return getToken(BantamJavaParser.PLUS, 0); }
		public TerminalNode EQ() { return getToken(BantamJavaParser.EQ, 0); }
		public TerminalNode NE() { return getToken(BantamJavaParser.NE, 0); }
		public TerminalNode LT() { return getToken(BantamJavaParser.LT, 0); }
		public TerminalNode LE() { return getToken(BantamJavaParser.LE, 0); }
		public TerminalNode GT() { return getToken(BantamJavaParser.GT, 0); }
		public TerminalNode GE() { return getToken(BantamJavaParser.GE, 0); }
		public TerminalNode AND() { return getToken(BantamJavaParser.AND, 0); }
		public TerminalNode OR() { return getToken(BantamJavaParser.OR, 0); }
		public TerminalNode INSTANCEOF() { return getToken(BantamJavaParser.INSTANCEOF, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BantamJavaVisitor ) return ((BantamJavaVisitor<? extends T>)visitor).visitExpr(this);
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
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(140);
				match(ID);
				setState(141);
				match(ASSIGN);
				setState(142);
				expr(18);
				}
				break;
			case 2:
				{
				setState(143);
				match(ID);
				}
				break;
			case 3:
				{
				setState(144);
				match(NEW);
				setState(145);
				match(ID);
				setState(146);
				argsList();
				}
				break;
			case 4:
				{
				setState(147);
				match(LPAREN);
				setState(148);
				type();
				setState(149);
				match(RPAREN);
				setState(150);
				match(LPAREN);
				setState(151);
				expr(0);
				setState(152);
				match(RPAREN);
				}
				break;
			case 5:
				{
				setState(154);
				match(MINUS);
				setState(155);
				expr(11);
				}
				break;
			case 6:
				{
				setState(156);
				match(NOT);
				setState(157);
				expr(7);
				}
				break;
			case 7:
				{
				setState(158);
				match(LPAREN);
				setState(159);
				expr(0);
				setState(160);
				match(RPAREN);
				}
				break;
			case 8:
				{
				setState(162);
				match(INT_CONST);
				}
				break;
			case 9:
				{
				setState(163);
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
			case 10:
				{
				setState(164);
				match(STR_CONST);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(198);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(196);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(167);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(168);
						match(DOT);
						setState(169);
						match(ID);
						setState(170);
						match(ASSIGN);
						setState(171);
						expr(16);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(172);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(173);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << DIVIDE) | (1L << MODULUS))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(174);
						expr(11);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(175);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(176);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(177);
						expr(10);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(178);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(179);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NE) | (1L << LE) | (1L << GE) | (1L << LT) | (1L << GT))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(180);
						expr(9);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(181);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(182);
						match(AND);
						setState(183);
						expr(7);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(184);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(185);
						match(OR);
						setState(186);
						expr(6);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(187);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(188);
						match(DOT);
						setState(189);
						match(ID);
						setState(191);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
						case 1:
							{
							setState(190);
							argsList();
							}
							break;
						}
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(193);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(194);
						match(INSTANCEOF);
						setState(195);
						type();
						}
						break;
					}
					} 
				}
				setState(200);
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
			setState(201);
			match(LPAREN);
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << LPAREN) | (1L << MINUS) | (1L << NOT) | (1L << ID) | (1L << INT_CONST) | (1L << STR_CONST))) != 0)) {
				{
				{
				setState(202);
				expr(0);
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(203);
					match(COMMA);
					setState(204);
					expr(0);
					}
					}
					setState(209);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(215);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u00dc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\6\2\34\n\2\r\2\16\2\35\3\3\3\3\3\3\3\3\5\3$\n"+
		"\3\3\3\3\3\7\3(\n\3\f\3\16\3+\13\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4\63\n\4"+
		"\3\5\3\5\5\5\67\n\5\3\6\3\6\3\6\3\6\5\6=\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\7\7F\n\7\f\7\16\7I\13\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\7\bR\n\b\f\b\16"+
		"\bU\13\b\7\bW\n\b\f\b\16\bZ\13\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0080\n\n\f\n\16\n\u0083\13\n"+
		"\3\n\5\n\u0086\n\n\3\13\3\13\5\13\u008a\n\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\5\f\u00a8\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00c2\n"+
		"\f\3\f\3\f\3\f\7\f\u00c7\n\f\f\f\16\f\u00ca\13\f\3\r\3\r\3\r\3\r\7\r\u00d0"+
		"\n\r\f\r\16\r\u00d3\13\r\7\r\u00d5\n\r\f\r\16\r\u00d8\13\r\3\r\3\r\3\r"+
		"\2\3\26\16\2\4\6\b\n\f\16\20\22\24\26\30\2\6\3\2\17\20\3\2\34\36\3\2\32"+
		"\33\3\2\37$\2\u00f5\2\33\3\2\2\2\4\37\3\2\2\2\6\62\3\2\2\2\b\66\3\2\2"+
		"\2\n8\3\2\2\2\f@\3\2\2\2\16M\3\2\2\2\20]\3\2\2\2\22\u0085\3\2\2\2\24\u0087"+
		"\3\2\2\2\26\u00a7\3\2\2\2\30\u00cb\3\2\2\2\32\34\5\4\3\2\33\32\3\2\2\2"+
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
		"\\\17\3\2\2\2]^\5\6\4\2^_\7*\2\2_\21\3\2\2\2`a\5\26\f\2ab\7\30\2\2b\u0086"+
		"\3\2\2\2cd\7\n\2\2de\7\26\2\2ef\5\26\f\2fg\7\27\2\2gh\5\22\n\2h\u0086"+
		"\3\2\2\2ij\7\n\2\2jk\7\26\2\2kl\5\26\f\2lm\7\27\2\2mn\5\22\n\2no\7\13"+
		"\2\2op\5\22\n\2p\u0086\3\2\2\2qr\7\f\2\2rs\7\26\2\2st\5\26\f\2tu\7\27"+
		"\2\2uv\5\22\n\2v\u0086\3\2\2\2wx\5\6\4\2xy\7*\2\2yz\7(\2\2z{\5\26\f\2"+
		"{|\7\30\2\2|\u0086\3\2\2\2}\u0081\7\24\2\2~\u0080\5\22\n\2\177~\3\2\2"+
		"\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084"+
		"\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0086\7\25\2\2\u0085`\3\2\2\2\u0085"+
		"c\3\2\2\2\u0085i\3\2\2\2\u0085q\3\2\2\2\u0085w\3\2\2\2\u0085}\3\2\2\2"+
		"\u0086\23\3\2\2\2\u0087\u0089\7\t\2\2\u0088\u008a\5\26\f\2\u0089\u0088"+
		"\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\7\30\2\2"+
		"\u008c\25\3\2\2\2\u008d\u008e\b\f\1\2\u008e\u008f\7*\2\2\u008f\u0090\7"+
		"(\2\2\u0090\u00a8\5\26\f\24\u0091\u00a8\7*\2\2\u0092\u0093\7\r\2\2\u0093"+
		"\u0094\7*\2\2\u0094\u00a8\5\30\r\2\u0095\u0096\7\26\2\2\u0096\u0097\5"+
		"\6\4\2\u0097\u0098\7\27\2\2\u0098\u0099\7\26\2\2\u0099\u009a\5\26\f\2"+
		"\u009a\u009b\7\27\2\2\u009b\u00a8\3\2\2\2\u009c\u009d\7\33\2\2\u009d\u00a8"+
		"\5\26\f\r\u009e\u009f\7%\2\2\u009f\u00a8\5\26\f\t\u00a0\u00a1\7\26\2\2"+
		"\u00a1\u00a2\5\26\f\2\u00a2\u00a3\7\27\2\2\u00a3\u00a8\3\2\2\2\u00a4\u00a8"+
		"\7+\2\2\u00a5\u00a8\t\2\2\2\u00a6\u00a8\7,\2\2\u00a7\u008d\3\2\2\2\u00a7"+
		"\u0091\3\2\2\2\u00a7\u0092\3\2\2\2\u00a7\u0095\3\2\2\2\u00a7\u009c\3\2"+
		"\2\2\u00a7\u009e\3\2\2\2\u00a7\u00a0\3\2\2\2\u00a7\u00a4\3\2\2\2\u00a7"+
		"\u00a5\3\2\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00c8\3\2\2\2\u00a9\u00aa\f\21"+
		"\2\2\u00aa\u00ab\7)\2\2\u00ab\u00ac\7*\2\2\u00ac\u00ad\7(\2\2\u00ad\u00c7"+
		"\5\26\f\22\u00ae\u00af\f\f\2\2\u00af\u00b0\t\3\2\2\u00b0\u00c7\5\26\f"+
		"\r\u00b1\u00b2\f\13\2\2\u00b2\u00b3\t\4\2\2\u00b3\u00c7\5\26\f\f\u00b4"+
		"\u00b5\f\n\2\2\u00b5\u00b6\t\5\2\2\u00b6\u00c7\5\26\f\13\u00b7\u00b8\f"+
		"\b\2\2\u00b8\u00b9\7&\2\2\u00b9\u00c7\5\26\f\t\u00ba\u00bb\f\7\2\2\u00bb"+
		"\u00bc\7\'\2\2\u00bc\u00c7\5\26\f\b\u00bd\u00be\f\22\2\2\u00be\u00bf\7"+
		")\2\2\u00bf\u00c1\7*\2\2\u00c0\u00c2\5\30\r\2\u00c1\u00c0\3\2\2\2\u00c1"+
		"\u00c2\3\2\2\2\u00c2\u00c7\3\2\2\2\u00c3\u00c4\f\17\2\2\u00c4\u00c5\7"+
		"\16\2\2\u00c5\u00c7\5\6\4\2\u00c6\u00a9\3\2\2\2\u00c6\u00ae\3\2\2\2\u00c6"+
		"\u00b1\3\2\2\2\u00c6\u00b4\3\2\2\2\u00c6\u00b7\3\2\2\2\u00c6\u00ba\3\2"+
		"\2\2\u00c6\u00bd\3\2\2\2\u00c6\u00c3\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8"+
		"\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\27\3\2\2\2\u00ca\u00c8\3\2\2"+
		"\2\u00cb\u00d6\7\26\2\2\u00cc\u00d1\5\26\f\2\u00cd\u00ce\7\31\2\2\u00ce"+
		"\u00d0\5\26\f\2\u00cf\u00cd\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3"+
		"\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4"+
		"\u00cc\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2"+
		"\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00da\7\27\2\2\u00da"+
		"\31\3\2\2\2\24\35#)\62\66<GSX\u0081\u0085\u0089\u00a7\u00c1\u00c6\u00c8"+
		"\u00d1\u00d6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}