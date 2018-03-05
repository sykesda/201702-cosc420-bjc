// Generated from C:/Users/cgwid/IdeaProjects/201702-cosc420-bjc/src/main/java\BantamJava.g4 by ANTLR 4.7
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
		SPACE=1, NEWLINE=2, STRING_CONST_DELIM=3, BADID=4, CLASS=5, EXTENDS=6, 
		RETURN=7, IF=8, ELSE=9, WHILE=10, NEW=11, INSTANCEOF=12, LBRACE=13, RBRACE=14, 
		LPAREN=15, RPAREN=16, SEMI=17, COMMA=18, PLUS=19, MINUS=20, TIMES=21, 
		DIVIDE=22, MODULUS=23, EQ=24, NE=25, LEQ=26, GEQ=27, LT=28, GT=29, NOT=30, 
		AND=31, OR=32, ASSIGN=33, DOT=34, TRUE=35, FALSE=36, ID=37, BOOLEAN_CONST=38, 
		INT_CONST=39, STRING_CONST=40, ML_COMMENT=41, SL_COMMENT=42;
	public static final int
		RULE_program = 0, RULE_classDefn = 1, RULE_member = 2, RULE_field = 3, 
		RULE_method = 4, RULE_formalList = 5, RULE_formal = 6, RULE_stmtList = 7, 
		RULE_stmt = 8, RULE_blockList = 9, RULE_retn = 10, RULE_expr = 11, RULE_memberRef = 12, 
		RULE_argsList = 13;
	public static final String[] ruleNames = {
		"program", "classDefn", "member", "field", "method", "formalList", "formal", 
		"stmtList", "stmt", "blockList", "retn", "expr", "memberRef", "argsList"
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
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	 
		public ProgramContext() { }
		public void copyFrom(ProgramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProgramStartContext extends ProgramContext {
		public List<ClassDefnContext> classDefn() {
			return getRuleContexts(ClassDefnContext.class);
		}
		public ClassDefnContext classDefn(int i) {
			return getRuleContext(ClassDefnContext.class,i);
		}
		public ProgramStartContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).enterProgramStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).exitProgramStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BantamJavaVisitor ) return ((BantamJavaVisitor<? extends T>)visitor).visitProgramStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			_localctx = new ProgramStartContext(_localctx);
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
		public TerminalNode ID() { return getToken(BantamJavaParser.ID, 0); }
		public TerminalNode LBRACE() { return getToken(BantamJavaParser.LBRACE, 0); }
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
			match(ID);
			setState(35);
			match(LBRACE);
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
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
	public static class MethodMemberContext extends MemberContext {
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public MethodMemberContext(MemberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).enterMethodMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).exitMethodMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BantamJavaVisitor ) return ((BantamJavaVisitor<? extends T>)visitor).visitMethodMember(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FieldMemberContext extends MemberContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public FieldMemberContext(MemberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).enterFieldMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).exitFieldMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BantamJavaVisitor ) return ((BantamJavaVisitor<? extends T>)visitor).visitFieldMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberContext member() throws RecognitionException {
		MemberContext _localctx = new MemberContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_member);
		try {
			setState(44);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new FieldMemberContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				field();
				}
				break;
			case 2:
				_localctx = new MethodMemberContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
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
	public static class FieldDeclarationContext extends FieldContext {
		public List<TerminalNode> ID() { return getTokens(BantamJavaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(BantamJavaParser.ID, i);
		}
		public TerminalNode SEMI() { return getToken(BantamJavaParser.SEMI, 0); }
		public FieldDeclarationContext(FieldContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).exitFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BantamJavaVisitor ) return ((BantamJavaVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FieldInstantiationContext extends FieldContext {
		public List<TerminalNode> ID() { return getTokens(BantamJavaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(BantamJavaParser.ID, i);
		}
		public TerminalNode ASSIGN() { return getToken(BantamJavaParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(BantamJavaParser.SEMI, 0); }
		public FieldInstantiationContext(FieldContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).enterFieldInstantiation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).exitFieldInstantiation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BantamJavaVisitor ) return ((BantamJavaVisitor<? extends T>)visitor).visitFieldInstantiation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_field);
		try {
			setState(55);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new FieldDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				match(ID);
				setState(47);
				match(ID);
				setState(48);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new FieldInstantiationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				match(ID);
				setState(50);
				match(ID);
				setState(51);
				match(ASSIGN);
				setState(52);
				expr(0);
				setState(53);
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
	public static class MethodWithReturnContext extends MethodContext {
		public List<TerminalNode> ID() { return getTokens(BantamJavaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(BantamJavaParser.ID, i);
		}
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
		public MethodWithReturnContext(MethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).enterMethodWithReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).exitMethodWithReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BantamJavaVisitor ) return ((BantamJavaVisitor<? extends T>)visitor).visitMethodWithReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MethodNoReturnContext extends MethodContext {
		public List<TerminalNode> ID() { return getTokens(BantamJavaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(BantamJavaParser.ID, i);
		}
		public FormalListContext formalList() {
			return getRuleContext(FormalListContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(BantamJavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(BantamJavaParser.RBRACE, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public MethodNoReturnContext(MethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).enterMethodNoReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).exitMethodNoReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BantamJavaVisitor ) return ((BantamJavaVisitor<? extends T>)visitor).visitMethodNoReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_method);
		int _la;
		try {
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new MethodWithReturnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				match(ID);
				setState(58);
				match(ID);
				setState(59);
				formalList();
				setState(60);
				match(LBRACE);
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << NEW) | (1L << LBRACE) | (1L << LPAREN) | (1L << MINUS) | (1L << NOT) | (1L << ID) | (1L << BOOLEAN_CONST) | (1L << INT_CONST) | (1L << STRING_CONST))) != 0)) {
					{
					{
					setState(61);
					stmt();
					}
					}
					setState(66);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(67);
				retn();
				setState(68);
				match(RBRACE);
				}
				break;
			case 2:
				_localctx = new MethodNoReturnContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				match(ID);
				setState(71);
				match(ID);
				setState(72);
				formalList();
				setState(73);
				match(LBRACE);
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << NEW) | (1L << LBRACE) | (1L << LPAREN) | (1L << MINUS) | (1L << NOT) | (1L << ID) | (1L << BOOLEAN_CONST) | (1L << INT_CONST) | (1L << STRING_CONST))) != 0)) {
					{
					{
					setState(74);
					stmt();
					}
					}
					setState(79);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(80);
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
	public static class FormalListEmptyContext extends FormalListContext {
		public TerminalNode LPAREN() { return getToken(BantamJavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(BantamJavaParser.RPAREN, 0); }
		public FormalListEmptyContext(FormalListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).enterFormalListEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).exitFormalListEmpty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BantamJavaVisitor ) return ((BantamJavaVisitor<? extends T>)visitor).visitFormalListEmpty(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FormalListPopulatedContext extends FormalListContext {
		public TerminalNode LPAREN() { return getToken(BantamJavaParser.LPAREN, 0); }
		public List<FormalContext> formal() {
			return getRuleContexts(FormalContext.class);
		}
		public FormalContext formal(int i) {
			return getRuleContext(FormalContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(BantamJavaParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(BantamJavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BantamJavaParser.COMMA, i);
		}
		public FormalListPopulatedContext(FormalListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).enterFormalListPopulated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).exitFormalListPopulated(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BantamJavaVisitor ) return ((BantamJavaVisitor<? extends T>)visitor).visitFormalListPopulated(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalListContext formalList() throws RecognitionException {
		FormalListContext _localctx = new FormalListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_formalList);
		int _la;
		try {
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new FormalListEmptyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				match(LPAREN);
				setState(85);
				match(RPAREN);
				}
				break;
			case 2:
				_localctx = new FormalListPopulatedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				match(LPAREN);
				setState(87);
				formal();
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(88);
					match(COMMA);
					setState(89);
					formal();
					}
					}
					setState(94);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(95);
				match(RPAREN);
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
	public static class FormalWithTypeAndIDContext extends FormalContext {
		public List<TerminalNode> ID() { return getTokens(BantamJavaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(BantamJavaParser.ID, i);
		}
		public FormalWithTypeAndIDContext(FormalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).enterFormalWithTypeAndID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).exitFormalWithTypeAndID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BantamJavaVisitor ) return ((BantamJavaVisitor<? extends T>)visitor).visitFormalWithTypeAndID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalContext formal() throws RecognitionException {
		FormalContext _localctx = new FormalContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_formal);
		try {
			_localctx = new FormalWithTypeAndIDContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(ID);
			setState(100);
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

	public static class StmtListContext extends ParserRuleContext {
		public StmtListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtList; }
	 
		public StmtListContext() { }
		public void copyFrom(StmtListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ListOfStatementsContext extends StmtListContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ListOfStatementsContext(StmtListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).enterListOfStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).exitListOfStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BantamJavaVisitor ) return ((BantamJavaVisitor<? extends T>)visitor).visitListOfStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtListContext stmtList() throws RecognitionException {
		StmtListContext _localctx = new StmtListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stmtList);
		int _la;
		try {
			_localctx = new ListOfStatementsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(103); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(102);
				stmt();
				}
				}
				setState(105); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << NEW) | (1L << LBRACE) | (1L << LPAREN) | (1L << MINUS) | (1L << NOT) | (1L << ID) | (1L << BOOLEAN_CONST) | (1L << INT_CONST) | (1L << STRING_CONST))) != 0) );
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
	public static class WhileStatementContext extends StmtContext {
		public TerminalNode WHILE() { return getToken(BantamJavaParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(BantamJavaParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(BantamJavaParser.RPAREN, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public WhileStatementContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BantamJavaVisitor ) return ((BantamJavaVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementDeclarationContext extends StmtContext {
		public List<TerminalNode> ID() { return getTokens(BantamJavaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(BantamJavaParser.ID, i);
		}
		public TerminalNode ASSIGN() { return getToken(BantamJavaParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(BantamJavaParser.SEMI, 0); }
		public StatementDeclarationContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).enterStatementDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).exitStatementDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BantamJavaVisitor ) return ((BantamJavaVisitor<? extends T>)visitor).visitStatementDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfElseStatementContext extends StmtContext {
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
		public IfElseStatementContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).enterIfElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).exitIfElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BantamJavaVisitor ) return ((BantamJavaVisitor<? extends T>)visitor).visitIfElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprStatementContext extends StmtContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(BantamJavaParser.SEMI, 0); }
		public ExprStatementContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).enterExprStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).exitExprStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BantamJavaVisitor ) return ((BantamJavaVisitor<? extends T>)visitor).visitExprStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockListStatementContext extends StmtContext {
		public BlockListContext blockList() {
			return getRuleContext(BlockListContext.class,0);
		}
		public BlockListStatementContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).enterBlockListStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).exitBlockListStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BantamJavaVisitor ) return ((BantamJavaVisitor<? extends T>)visitor).visitBlockListStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfStatementContext extends StmtContext {
		public TerminalNode IF() { return getToken(BantamJavaParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(BantamJavaParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(BantamJavaParser.RPAREN, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public IfStatementContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BantamJavaVisitor ) return ((BantamJavaVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stmt);
		try {
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new StatementDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				match(ID);
				setState(108);
				match(ID);
				setState(109);
				match(ASSIGN);
				setState(110);
				expr(0);
				setState(111);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				match(IF);
				setState(114);
				match(LPAREN);
				setState(115);
				expr(0);
				setState(116);
				match(RPAREN);
				setState(117);
				stmt();
				}
				break;
			case 3:
				_localctx = new IfElseStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				match(IF);
				setState(120);
				match(LPAREN);
				setState(121);
				expr(0);
				setState(122);
				match(RPAREN);
				setState(123);
				stmt();
				setState(124);
				match(ELSE);
				setState(125);
				stmt();
				}
				break;
			case 4:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(127);
				match(WHILE);
				setState(128);
				match(LPAREN);
				setState(129);
				expr(0);
				setState(130);
				match(RPAREN);
				setState(131);
				stmt();
				}
				break;
			case 5:
				_localctx = new ExprStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(133);
				expr(0);
				setState(134);
				match(SEMI);
				}
				break;
			case 6:
				_localctx = new BlockListStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(136);
				blockList();
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

	public static class BlockListContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(BantamJavaParser.LBRACE, 0); }
		public StmtListContext stmtList() {
			return getRuleContext(StmtListContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(BantamJavaParser.RBRACE, 0); }
		public BlockListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).enterBlockList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).exitBlockList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BantamJavaVisitor ) return ((BantamJavaVisitor<? extends T>)visitor).visitBlockList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockListContext blockList() throws RecognitionException {
		BlockListContext _localctx = new BlockListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_blockList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(LBRACE);
			setState(140);
			stmtList();
			setState(141);
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
		public TerminalNode RETURN() { return getToken(BantamJavaParser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(BantamJavaParser.SEMI, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RetnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).enterRetn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).exitRetn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BantamJavaVisitor ) return ((BantamJavaVisitor<? extends T>)visitor).visitRetn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetnContext retn() throws RecognitionException {
		RetnContext _localctx = new RetnContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_retn);
		try {
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				match(RETURN);
				setState(144);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				match(RETURN);
				setState(146);
				expr(0);
				setState(147);
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BantamJavaParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(BantamJavaParser.ASSIGN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MemberRefContext memberRef() {
			return getRuleContext(MemberRefContext.class,0);
		}
		public TerminalNode NEW() { return getToken(BantamJavaParser.NEW, 0); }
		public ArgsListContext argsList() {
			return getRuleContext(ArgsListContext.class,0);
		}
		public List<TerminalNode> LPAREN() { return getTokens(BantamJavaParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(BantamJavaParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(BantamJavaParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(BantamJavaParser.RPAREN, i);
		}
		public TerminalNode MINUS() { return getToken(BantamJavaParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(BantamJavaParser.NOT, 0); }
		public TerminalNode INT_CONST() { return getToken(BantamJavaParser.INT_CONST, 0); }
		public TerminalNode BOOLEAN_CONST() { return getToken(BantamJavaParser.BOOLEAN_CONST, 0); }
		public TerminalNode STRING_CONST() { return getToken(BantamJavaParser.STRING_CONST, 0); }
		public TerminalNode TIMES() { return getToken(BantamJavaParser.TIMES, 0); }
		public TerminalNode DIVIDE() { return getToken(BantamJavaParser.DIVIDE, 0); }
		public TerminalNode MODULUS() { return getToken(BantamJavaParser.MODULUS, 0); }
		public TerminalNode PLUS() { return getToken(BantamJavaParser.PLUS, 0); }
		public TerminalNode AND() { return getToken(BantamJavaParser.AND, 0); }
		public TerminalNode OR() { return getToken(BantamJavaParser.OR, 0); }
		public TerminalNode EQ() { return getToken(BantamJavaParser.EQ, 0); }
		public TerminalNode NE() { return getToken(BantamJavaParser.NE, 0); }
		public TerminalNode LT() { return getToken(BantamJavaParser.LT, 0); }
		public TerminalNode LEQ() { return getToken(BantamJavaParser.LEQ, 0); }
		public TerminalNode GT() { return getToken(BantamJavaParser.GT, 0); }
		public TerminalNode GEQ() { return getToken(BantamJavaParser.GEQ, 0); }
		public TerminalNode DOT() { return getToken(BantamJavaParser.DOT, 0); }
		public TerminalNode INSTANCEOF() { return getToken(BantamJavaParser.INSTANCEOF, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).exitExpr(this);
		}
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(152);
				match(ID);
				}
				break;
			case 2:
				{
				setState(153);
				match(ID);
				setState(154);
				match(ASSIGN);
				setState(155);
				expr(19);
				}
				break;
			case 3:
				{
				setState(156);
				memberRef();
				}
				break;
			case 4:
				{
				setState(157);
				match(NEW);
				setState(158);
				match(ID);
				setState(159);
				argsList();
				}
				break;
			case 5:
				{
				setState(160);
				match(NEW);
				setState(161);
				match(ID);
				setState(162);
				match(LPAREN);
				setState(163);
				match(RPAREN);
				}
				break;
			case 6:
				{
				setState(164);
				match(LPAREN);
				setState(165);
				match(ID);
				setState(166);
				match(RPAREN);
				setState(167);
				match(LPAREN);
				setState(168);
				expr(0);
				setState(169);
				match(RPAREN);
				}
				break;
			case 7:
				{
				setState(171);
				match(MINUS);
				setState(172);
				expr(12);
				}
				break;
			case 8:
				{
				setState(173);
				match(NOT);
				setState(174);
				expr(9);
				}
				break;
			case 9:
				{
				setState(175);
				match(LPAREN);
				setState(176);
				expr(0);
				setState(177);
				match(RPAREN);
				}
				break;
			case 10:
				{
				setState(179);
				match(LPAREN);
				setState(180);
				match(ID);
				setState(181);
				match(RPAREN);
				}
				break;
			case 11:
				{
				setState(182);
				match(INT_CONST);
				}
				break;
			case 12:
				{
				setState(183);
				match(BOOLEAN_CONST);
				}
				break;
			case 13:
				{
				setState(184);
				match(STRING_CONST);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(209);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(187);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(188);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << DIVIDE) | (1L << MODULUS))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(189);
						expr(12);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(190);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(191);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(192);
						expr(11);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(193);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(194);
						match(AND);
						setState(195);
						expr(9);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(196);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(197);
						match(OR);
						setState(198);
						expr(8);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(199);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(200);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NE) | (1L << LEQ) | (1L << GEQ) | (1L << LT) | (1L << GT))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(201);
						expr(7);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(202);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(203);
						match(DOT);
						setState(204);
						match(ID);
						setState(205);
						argsList();
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(206);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(207);
						match(INSTANCEOF);
						setState(208);
						match(ID);
						}
						break;
					}
					} 
				}
				setState(213);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class MemberRefContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(BantamJavaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(BantamJavaParser.ID, i);
		}
		public TerminalNode DOT() { return getToken(BantamJavaParser.DOT, 0); }
		public ArgsListContext argsList() {
			return getRuleContext(ArgsListContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(BantamJavaParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MemberRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).enterMemberRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).exitMemberRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BantamJavaVisitor ) return ((BantamJavaVisitor<? extends T>)visitor).visitMemberRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberRefContext memberRef() throws RecognitionException {
		MemberRefContext _localctx = new MemberRefContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_memberRef);
		try {
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				match(ID);
				setState(215);
				match(DOT);
				setState(216);
				match(ID);
				setState(217);
				argsList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				match(ID);
				setState(219);
				match(DOT);
				setState(220);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
				match(ID);
				setState(222);
				match(DOT);
				setState(223);
				match(ID);
				setState(224);
				match(ASSIGN);
				setState(225);
				expr(0);
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

	public static class ArgsListContext extends ParserRuleContext {
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
		public ArgsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argsList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).enterArgsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BantamJavaListener ) ((BantamJavaListener)listener).exitArgsList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BantamJavaVisitor ) return ((BantamJavaVisitor<? extends T>)visitor).visitArgsList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsListContext argsList() throws RecognitionException {
		ArgsListContext _localctx = new ArgsListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_argsList);
		int _la;
		try {
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				match(LPAREN);
				setState(229);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				match(LPAREN);
				setState(231);
				expr(0);
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(232);
					match(COMMA);
					setState(233);
					expr(0);
					}
					}
					setState(238);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(239);
				match(RPAREN);
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
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 17);
		case 6:
			return precpred(_ctx, 14);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u00f6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\6\2 \n\2\r\2\16\2!\3\3\3\3"+
		"\3\3\3\3\7\3(\n\3\f\3\16\3+\13\3\3\4\3\4\5\4/\n\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\5\5:\n\5\3\6\3\6\3\6\3\6\3\6\7\6A\n\6\f\6\16\6D\13\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6N\n\6\f\6\16\6Q\13\6\3\6\3\6\5\6U"+
		"\n\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7]\n\7\f\7\16\7`\13\7\3\7\3\7\5\7d\n\7"+
		"\3\b\3\b\3\b\3\t\6\tj\n\t\r\t\16\tk\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\5\n\u008c\n\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\5\f\u0098\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\5\r\u00bc\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00d4\n\r\f\r\16\r"+
		"\u00d7\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\5\16\u00e5\n\16\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00ed\n\17\f\17\16"+
		"\17\u00f0\13\17\3\17\3\17\5\17\u00f4\n\17\3\17\2\3\30\20\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\2\5\3\2\27\31\3\2\25\26\3\2\32\37\2\u010e\2\37\3"+
		"\2\2\2\4#\3\2\2\2\6.\3\2\2\2\b9\3\2\2\2\nT\3\2\2\2\fc\3\2\2\2\16e\3\2"+
		"\2\2\20i\3\2\2\2\22\u008b\3\2\2\2\24\u008d\3\2\2\2\26\u0097\3\2\2\2\30"+
		"\u00bb\3\2\2\2\32\u00e4\3\2\2\2\34\u00f3\3\2\2\2\36 \5\4\3\2\37\36\3\2"+
		"\2\2 !\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"\3\3\2\2\2#$\7\7\2\2$%\7\'\2\2"+
		"%)\7\17\2\2&(\5\6\4\2\'&\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*\5\3\2"+
		"\2\2+)\3\2\2\2,/\5\b\5\2-/\5\n\6\2.,\3\2\2\2.-\3\2\2\2/\7\3\2\2\2\60\61"+
		"\7\'\2\2\61\62\7\'\2\2\62:\7\23\2\2\63\64\7\'\2\2\64\65\7\'\2\2\65\66"+
		"\7#\2\2\66\67\5\30\r\2\678\7\23\2\28:\3\2\2\29\60\3\2\2\29\63\3\2\2\2"+
		":\t\3\2\2\2;<\7\'\2\2<=\7\'\2\2=>\5\f\7\2>B\7\17\2\2?A\5\22\n\2@?\3\2"+
		"\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2CE\3\2\2\2DB\3\2\2\2EF\5\26\f\2FG\7"+
		"\20\2\2GU\3\2\2\2HI\7\'\2\2IJ\7\'\2\2JK\5\f\7\2KO\7\17\2\2LN\5\22\n\2"+
		"ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PR\3\2\2\2QO\3\2\2\2RS\7\20\2"+
		"\2SU\3\2\2\2T;\3\2\2\2TH\3\2\2\2U\13\3\2\2\2VW\7\21\2\2Wd\7\22\2\2XY\7"+
		"\21\2\2Y^\5\16\b\2Z[\7\24\2\2[]\5\16\b\2\\Z\3\2\2\2]`\3\2\2\2^\\\3\2\2"+
		"\2^_\3\2\2\2_a\3\2\2\2`^\3\2\2\2ab\7\22\2\2bd\3\2\2\2cV\3\2\2\2cX\3\2"+
		"\2\2d\r\3\2\2\2ef\7\'\2\2fg\7\'\2\2g\17\3\2\2\2hj\5\22\n\2ih\3\2\2\2j"+
		"k\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\21\3\2\2\2mn\7\'\2\2no\7\'\2\2op\7#\2\2"+
		"pq\5\30\r\2qr\7\23\2\2r\u008c\3\2\2\2st\7\n\2\2tu\7\21\2\2uv\5\30\r\2"+
		"vw\7\22\2\2wx\5\22\n\2x\u008c\3\2\2\2yz\7\n\2\2z{\7\21\2\2{|\5\30\r\2"+
		"|}\7\22\2\2}~\5\22\n\2~\177\7\13\2\2\177\u0080\5\22\n\2\u0080\u008c\3"+
		"\2\2\2\u0081\u0082\7\f\2\2\u0082\u0083\7\21\2\2\u0083\u0084\5\30\r\2\u0084"+
		"\u0085\7\22\2\2\u0085\u0086\5\22\n\2\u0086\u008c\3\2\2\2\u0087\u0088\5"+
		"\30\r\2\u0088\u0089\7\23\2\2\u0089\u008c\3\2\2\2\u008a\u008c\5\24\13\2"+
		"\u008bm\3\2\2\2\u008bs\3\2\2\2\u008by\3\2\2\2\u008b\u0081\3\2\2\2\u008b"+
		"\u0087\3\2\2\2\u008b\u008a\3\2\2\2\u008c\23\3\2\2\2\u008d\u008e\7\17\2"+
		"\2\u008e\u008f\5\20\t\2\u008f\u0090\7\20\2\2\u0090\25\3\2\2\2\u0091\u0092"+
		"\7\t\2\2\u0092\u0098\7\23\2\2\u0093\u0094\7\t\2\2\u0094\u0095\5\30\r\2"+
		"\u0095\u0096\7\23\2\2\u0096\u0098\3\2\2\2\u0097\u0091\3\2\2\2\u0097\u0093"+
		"\3\2\2\2\u0098\27\3\2\2\2\u0099\u009a\b\r\1\2\u009a\u00bc\7\'\2\2\u009b"+
		"\u009c\7\'\2\2\u009c\u009d\7#\2\2\u009d\u00bc\5\30\r\25\u009e\u00bc\5"+
		"\32\16\2\u009f\u00a0\7\r\2\2\u00a0\u00a1\7\'\2\2\u00a1\u00bc\5\34\17\2"+
		"\u00a2\u00a3\7\r\2\2\u00a3\u00a4\7\'\2\2\u00a4\u00a5\7\21\2\2\u00a5\u00bc"+
		"\7\22\2\2\u00a6\u00a7\7\21\2\2\u00a7\u00a8\7\'\2\2\u00a8\u00a9\7\22\2"+
		"\2\u00a9\u00aa\7\21\2\2\u00aa\u00ab\5\30\r\2\u00ab\u00ac\7\22\2\2\u00ac"+
		"\u00bc\3\2\2\2\u00ad\u00ae\7\26\2\2\u00ae\u00bc\5\30\r\16\u00af\u00b0"+
		"\7 \2\2\u00b0\u00bc\5\30\r\13\u00b1\u00b2\7\21\2\2\u00b2\u00b3\5\30\r"+
		"\2\u00b3\u00b4\7\22\2\2\u00b4\u00bc\3\2\2\2\u00b5\u00b6\7\21\2\2\u00b6"+
		"\u00b7\7\'\2\2\u00b7\u00bc\7\22\2\2\u00b8\u00bc\7)\2\2\u00b9\u00bc\7("+
		"\2\2\u00ba\u00bc\7*\2\2\u00bb\u0099\3\2\2\2\u00bb\u009b\3\2\2\2\u00bb"+
		"\u009e\3\2\2\2\u00bb\u009f\3\2\2\2\u00bb\u00a2\3\2\2\2\u00bb\u00a6\3\2"+
		"\2\2\u00bb\u00ad\3\2\2\2\u00bb\u00af\3\2\2\2\u00bb\u00b1\3\2\2\2\u00bb"+
		"\u00b5\3\2\2\2\u00bb\u00b8\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00ba\3\2"+
		"\2\2\u00bc\u00d5\3\2\2\2\u00bd\u00be\f\r\2\2\u00be\u00bf\t\2\2\2\u00bf"+
		"\u00d4\5\30\r\16\u00c0\u00c1\f\f\2\2\u00c1\u00c2\t\3\2\2\u00c2\u00d4\5"+
		"\30\r\r\u00c3\u00c4\f\n\2\2\u00c4\u00c5\7!\2\2\u00c5\u00d4\5\30\r\13\u00c6"+
		"\u00c7\f\t\2\2\u00c7\u00c8\7\"\2\2\u00c8\u00d4\5\30\r\n\u00c9\u00ca\f"+
		"\b\2\2\u00ca\u00cb\t\4\2\2\u00cb\u00d4\5\30\r\t\u00cc\u00cd\f\23\2\2\u00cd"+
		"\u00ce\7$\2\2\u00ce\u00cf\7\'\2\2\u00cf\u00d4\5\34\17\2\u00d0\u00d1\f"+
		"\20\2\2\u00d1\u00d2\7\16\2\2\u00d2\u00d4\7\'\2\2\u00d3\u00bd\3\2\2\2\u00d3"+
		"\u00c0\3\2\2\2\u00d3\u00c3\3\2\2\2\u00d3\u00c6\3\2\2\2\u00d3\u00c9\3\2"+
		"\2\2\u00d3\u00cc\3\2\2\2\u00d3\u00d0\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5"+
		"\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\31\3\2\2\2\u00d7\u00d5\3\2\2"+
		"\2\u00d8\u00d9\7\'\2\2\u00d9\u00da\7$\2\2\u00da\u00db\7\'\2\2\u00db\u00e5"+
		"\5\34\17\2\u00dc\u00dd\7\'\2\2\u00dd\u00de\7$\2\2\u00de\u00e5\7\'\2\2"+
		"\u00df\u00e0\7\'\2\2\u00e0\u00e1\7$\2\2\u00e1\u00e2\7\'\2\2\u00e2\u00e3"+
		"\7#\2\2\u00e3\u00e5\5\30\r\2\u00e4\u00d8\3\2\2\2\u00e4\u00dc\3\2\2\2\u00e4"+
		"\u00df\3\2\2\2\u00e5\33\3\2\2\2\u00e6\u00e7\7\21\2\2\u00e7\u00f4\7\22"+
		"\2\2\u00e8\u00e9\7\21\2\2\u00e9\u00ee\5\30\r\2\u00ea\u00eb\7\24\2\2\u00eb"+
		"\u00ed\5\30\r\2\u00ec\u00ea\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3"+
		"\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1"+
		"\u00f2\7\22\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00e6\3\2\2\2\u00f3\u00e8\3"+
		"\2\2\2\u00f4\35\3\2\2\2\24!).9BOT^ck\u008b\u0097\u00bb\u00d3\u00d5\u00e4"+
		"\u00ee\u00f3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}