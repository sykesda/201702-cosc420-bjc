// Generated from /Users/sykesda/IdeaProjects/2018/02/201702-cosc420-bjc/src/main/java/BantamJava.g4 by ANTLR 4.7
import org.antlr.symtab.*;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BantamJavaParser}.
 */
public interface BantamJavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BantamJavaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(BantamJavaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link BantamJavaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(BantamJavaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code class}
	 * labeled alternative in {@link BantamJavaParser#classDefn}.
	 * @param ctx the parse tree
	 */
	void enterClass(BantamJavaParser.ClassContext ctx);
	/**
	 * Exit a parse tree produced by the {@code class}
	 * labeled alternative in {@link BantamJavaParser#classDefn}.
	 * @param ctx the parse tree
	 */
	void exitClass(BantamJavaParser.ClassContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeVoid}
	 * labeled alternative in {@link BantamJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeVoid(BantamJavaParser.TypeVoidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeVoid}
	 * labeled alternative in {@link BantamJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeVoid(BantamJavaParser.TypeVoidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeInt}
	 * labeled alternative in {@link BantamJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeInt(BantamJavaParser.TypeIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeInt}
	 * labeled alternative in {@link BantamJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeInt(BantamJavaParser.TypeIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeBool}
	 * labeled alternative in {@link BantamJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeBool(BantamJavaParser.TypeBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeBool}
	 * labeled alternative in {@link BantamJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeBool(BantamJavaParser.TypeBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeID}
	 * labeled alternative in {@link BantamJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeID(BantamJavaParser.TypeIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeID}
	 * labeled alternative in {@link BantamJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeID(BantamJavaParser.TypeIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code memberField}
	 * labeled alternative in {@link BantamJavaParser#member}.
	 * @param ctx the parse tree
	 */
	void enterMemberField(BantamJavaParser.MemberFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code memberField}
	 * labeled alternative in {@link BantamJavaParser#member}.
	 * @param ctx the parse tree
	 */
	void exitMemberField(BantamJavaParser.MemberFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code memberMethod}
	 * labeled alternative in {@link BantamJavaParser#member}.
	 * @param ctx the parse tree
	 */
	void enterMemberMethod(BantamJavaParser.MemberMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code memberMethod}
	 * labeled alternative in {@link BantamJavaParser#member}.
	 * @param ctx the parse tree
	 */
	void exitMemberMethod(BantamJavaParser.MemberMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fieldDeclOrInst}
	 * labeled alternative in {@link BantamJavaParser#field}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclOrInst(BantamJavaParser.FieldDeclOrInstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fieldDeclOrInst}
	 * labeled alternative in {@link BantamJavaParser#field}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclOrInst(BantamJavaParser.FieldDeclOrInstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodDeclaration}
	 * labeled alternative in {@link BantamJavaParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(BantamJavaParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodDeclaration}
	 * labeled alternative in {@link BantamJavaParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(BantamJavaParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lstOfFormals}
	 * labeled alternative in {@link BantamJavaParser#formalList}.
	 * @param ctx the parse tree
	 */
	void enterLstOfFormals(BantamJavaParser.LstOfFormalsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lstOfFormals}
	 * labeled alternative in {@link BantamJavaParser#formalList}.
	 * @param ctx the parse tree
	 */
	void exitLstOfFormals(BantamJavaParser.LstOfFormalsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formalParameter}
	 * labeled alternative in {@link BantamJavaParser#formal}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(BantamJavaParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formalParameter}
	 * labeled alternative in {@link BantamJavaParser#formal}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(BantamJavaParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtExprSemi}
	 * labeled alternative in {@link BantamJavaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtExprSemi(BantamJavaParser.StmtExprSemiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtExprSemi}
	 * labeled alternative in {@link BantamJavaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtExprSemi(BantamJavaParser.StmtExprSemiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtBlock}
	 * labeled alternative in {@link BantamJavaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtBlock(BantamJavaParser.StmtBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtBlock}
	 * labeled alternative in {@link BantamJavaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtBlock(BantamJavaParser.StmtBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtIf}
	 * labeled alternative in {@link BantamJavaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtIf(BantamJavaParser.StmtIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtIf}
	 * labeled alternative in {@link BantamJavaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtIf(BantamJavaParser.StmtIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtWhile}
	 * labeled alternative in {@link BantamJavaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtWhile(BantamJavaParser.StmtWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtWhile}
	 * labeled alternative in {@link BantamJavaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtWhile(BantamJavaParser.StmtWhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtLocalVarDecl}
	 * labeled alternative in {@link BantamJavaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtLocalVarDecl(BantamJavaParser.StmtLocalVarDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtLocalVarDecl}
	 * labeled alternative in {@link BantamJavaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtLocalVarDecl(BantamJavaParser.StmtLocalVarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link BantamJavaParser#blockStmt}.
	 * @param ctx the parse tree
	 */
	void enterBlockStmt(BantamJavaParser.BlockStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link BantamJavaParser#blockStmt}.
	 * @param ctx the parse tree
	 */
	void exitBlockStmt(BantamJavaParser.BlockStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code return}
	 * labeled alternative in {@link BantamJavaParser#retn}.
	 * @param ctx the parse tree
	 */
	void enterReturn(BantamJavaParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code return}
	 * labeled alternative in {@link BantamJavaParser#retn}.
	 * @param ctx the parse tree
	 */
	void exitReturn(BantamJavaParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprInt}
	 * labeled alternative in {@link BantamJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprInt(BantamJavaParser.ExprIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprInt}
	 * labeled alternative in {@link BantamJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprInt(BantamJavaParser.ExprIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprMulDivMod}
	 * labeled alternative in {@link BantamJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMulDivMod(BantamJavaParser.ExprMulDivModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprMulDivMod}
	 * labeled alternative in {@link BantamJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMulDivMod(BantamJavaParser.ExprMulDivModContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprNot}
	 * labeled alternative in {@link BantamJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprNot(BantamJavaParser.ExprNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprNot}
	 * labeled alternative in {@link BantamJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprNot(BantamJavaParser.ExprNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprVarAssign}
	 * labeled alternative in {@link BantamJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprVarAssign(BantamJavaParser.ExprVarAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprVarAssign}
	 * labeled alternative in {@link BantamJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprVarAssign(BantamJavaParser.ExprVarAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprAddSub}
	 * labeled alternative in {@link BantamJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAddSub(BantamJavaParser.ExprAddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprAddSub}
	 * labeled alternative in {@link BantamJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAddSub(BantamJavaParser.ExprAddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expStrLiteral}
	 * labeled alternative in {@link BantamJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpStrLiteral(BantamJavaParser.ExpStrLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expStrLiteral}
	 * labeled alternative in {@link BantamJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpStrLiteral(BantamJavaParser.ExpStrLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprInstanceof}
	 * labeled alternative in {@link BantamJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprInstanceof(BantamJavaParser.ExprInstanceofContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprInstanceof}
	 * labeled alternative in {@link BantamJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprInstanceof(BantamJavaParser.ExprInstanceofContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprNew}
	 * labeled alternative in {@link BantamJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprNew(BantamJavaParser.ExprNewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprNew}
	 * labeled alternative in {@link BantamJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprNew(BantamJavaParser.ExprNewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprOr}
	 * labeled alternative in {@link BantamJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprOr(BantamJavaParser.ExprOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprOr}
	 * labeled alternative in {@link BantamJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprOr(BantamJavaParser.ExprOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprTypeConversion}
	 * labeled alternative in {@link BantamJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprTypeConversion(BantamJavaParser.ExprTypeConversionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprTypeConversion}
	 * labeled alternative in {@link BantamJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprTypeConversion(BantamJavaParser.ExprTypeConversionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprFieldAssign}
	 * labeled alternative in {@link BantamJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprFieldAssign(BantamJavaParser.ExprFieldAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprFieldAssign}
	 * labeled alternative in {@link BantamJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprFieldAssign(BantamJavaParser.ExprFieldAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprParenthesized}
	 * labeled alternative in {@link BantamJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprParenthesized(BantamJavaParser.ExprParenthesizedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprParenthesized}
	 * labeled alternative in {@link BantamJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprParenthesized(BantamJavaParser.ExprParenthesizedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprRelational}
	 * labeled alternative in {@link BantamJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprRelational(BantamJavaParser.ExprRelationalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprRelational}
	 * labeled alternative in {@link BantamJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprRelational(BantamJavaParser.ExprRelationalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprBoolLiteral}
	 * labeled alternative in {@link BantamJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprBoolLiteral(BantamJavaParser.ExprBoolLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprBoolLiteral}
	 * labeled alternative in {@link BantamJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprBoolLiteral(BantamJavaParser.ExprBoolLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprAnd}
	 * labeled alternative in {@link BantamJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAnd(BantamJavaParser.ExprAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprAnd}
	 * labeled alternative in {@link BantamJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAnd(BantamJavaParser.ExprAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprID}
	 * labeled alternative in {@link BantamJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprID(BantamJavaParser.ExprIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprID}
	 * labeled alternative in {@link BantamJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprID(BantamJavaParser.ExprIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprMethodCall}
	 * labeled alternative in {@link BantamJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMethodCall(BantamJavaParser.ExprMethodCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprMethodCall}
	 * labeled alternative in {@link BantamJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMethodCall(BantamJavaParser.ExprMethodCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprNegation}
	 * labeled alternative in {@link BantamJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprNegation(BantamJavaParser.ExprNegationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprNegation}
	 * labeled alternative in {@link BantamJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprNegation(BantamJavaParser.ExprNegationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprDotMethodCall}
	 * labeled alternative in {@link BantamJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprDotMethodCall(BantamJavaParser.ExprDotMethodCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprDotMethodCall}
	 * labeled alternative in {@link BantamJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprDotMethodCall(BantamJavaParser.ExprDotMethodCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lstOfArgs}
	 * labeled alternative in {@link BantamJavaParser#argsList}.
	 * @param ctx the parse tree
	 */
	void enterLstOfArgs(BantamJavaParser.LstOfArgsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lstOfArgs}
	 * labeled alternative in {@link BantamJavaParser#argsList}.
	 * @param ctx the parse tree
	 */
	void exitLstOfArgs(BantamJavaParser.LstOfArgsContext ctx);
}