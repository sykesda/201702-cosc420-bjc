import java.util.HashMap;
import java.util.Map;
import org.antlr.v4.runtime.ParserRuleContext;

public class SemanticAnalyzer extends BantamJavaBaseVisitor<ParserRuleContext> {

    /**
     * Visit a parse tree produced by {@link BantamJavaParser#program}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override
    public ParserRuleContext visitProgram(BantamJavaParser.ProgramContext ctx) {
        return ctx;
    }

    /**
     * Visit a parse tree produced by the {@code class}
     * labeled alternative in {@link BantamJavaParser#classDefn}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ParserRuleContext visitClass(BantamJavaParser.ClassContext ctx) {
        return ctx;
    }

    /**
     * Visit a parse tree produced by the {@code typeVoid}
     * labeled alternative in {@link BantamJavaParser#type}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ParserRuleContext visitTypeVoid(BantamJavaParser.TypeVoidContext ctx) {
        return ctx;
    }

    /**
     * Visit a parse tree produced by the {@code typeInt}
     * labeled alternative in {@link BantamJavaParser#type}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ParserRuleContext visitTypeInt(BantamJavaParser.TypeIntContext ctx) {
        return ctx;
    }

    /**
     * Visit a parse tree produced by the {@code typeBool}
     * labeled alternative in {@link BantamJavaParser#type}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ParserRuleContext visitTypeBool(BantamJavaParser.TypeBoolContext ctx) {
        return ctx;
    }

    /**
     * Visit a parse tree produced by the {@code typeID}
     * labeled alternative in {@link BantamJavaParser#type}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ParserRuleContext visitTypeID(BantamJavaParser.TypeIDContext ctx) {
        return ctx;
    }

    /**
     * Visit a parse tree produced by the {@code memberField}
     * labeled alternative in {@link BantamJavaParser#member}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ParserRuleContext visitMemberField(BantamJavaParser.MemberFieldContext ctx) {
        return ctx;
    }

    /**
     * Visit a parse tree produced by the {@code memberMethod}
     * labeled alternative in {@link BantamJavaParser#member}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ParserRuleContext visitMemberMethod(BantamJavaParser.MemberMethodContext ctx) {
        return ctx;
    }

    /**
     * Visit a parse tree produced by the {@code fieldDeclOrInst}
     * labeled alternative in {@link BantamJavaParser#field}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ParserRuleContext visitFieldDeclOrInst(BantamJavaParser.FieldDeclOrInstContext ctx) {
        return ctx;
    }

    /**
     * Visit a parse tree produced by the {@code methodDeclaration}
     * labeled alternative in {@link BantamJavaParser#method}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ParserRuleContext visitMethodDeclaration(BantamJavaParser.MethodDeclarationContext ctx) {
        return ctx;
    }

    /**
     * Visit a parse tree produced by the {@code lstOfFormals}
     * labeled alternative in {@link BantamJavaParser#formalList}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ParserRuleContext visitLstOfFormals(BantamJavaParser.LstOfFormalsContext ctx) {
        return ctx;
    }

    /**
     * Visit a parse tree produced by the {@code typeWithID}
     * labeled alternative in {@link BantamJavaParser#formal}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ParserRuleContext visitTypeWithID(BantamJavaParser.TypeWithIDContext ctx) {
        return ctx;
    }

    /**
     * Visit a parse tree produced by the {@code stmtExprSemi}
     * labeled alternative in {@link BantamJavaParser#stmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ParserRuleContext visitStmtExprSemi(BantamJavaParser.StmtExprSemiContext ctx) {
        return ctx;
    }

    /**
     * Visit a parse tree produced by the {@code stmtBlock}
     * labeled alternative in {@link BantamJavaParser#stmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ParserRuleContext visitStmtBlock(BantamJavaParser.StmtBlockContext ctx) {
        return ctx;
    }

    /**
     * Visit a parse tree produced by the {@code stmtIf}
     * labeled alternative in {@link BantamJavaParser#stmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ParserRuleContext visitStmtIf(BantamJavaParser.StmtIfContext ctx) {
        return ctx;
    }

    /**
     * Visit a parse tree produced by the {@code stmtWhile}
     * labeled alternative in {@link BantamJavaParser#stmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ParserRuleContext visitStmtWhile(BantamJavaParser.StmtWhileContext ctx) {
        return ctx;
    }

    /**
     * Visit a parse tree produced by the {@code stmtLocalVarDecl}
     * labeled alternative in {@link BantamJavaParser#stmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ParserRuleContext visitStmtLocalVarDecl(BantamJavaParser.StmtLocalVarDeclContext ctx) {
        return ctx;
    }

    /**
     * Visit a parse tree produced by {@link BantamJavaParser#blockStmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ParserRuleContext visitBlockStmt(BantamJavaParser.BlockStmtContext ctx) {
        return ctx;
    }

    /**
     * Visit a parse tree produced by the {@code return}
     * labeled alternative in {@link BantamJavaParser#retn}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ParserRuleContext visitReturn(BantamJavaParser.ReturnContext ctx) {
        return ctx;
    }

    /**
     * Visit a parse tree produced by the {@code exprInt}
     * labeled alternative in {@link BantamJavaParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ParserRuleContext visitExprInt(BantamJavaParser.ExprIntContext ctx) {
        return ctx;
    }

    /**
     * Visit a parse tree produced by the {@code exprMulDivMod}
     * labeled alternative in {@link BantamJavaParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ParserRuleContext visitExprMulDivMod(BantamJavaParser.ExprMulDivModContext ctx) {
        return ctx;
    }

    /**
     * Visit a parse tree produced by the {@code exprNot}
     * labeled alternative in {@link BantamJavaParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ParserRuleContext visitExprNot(BantamJavaParser.ExprNotContext ctx) {
        return ctx;
    }

    /**
     * Visit a parse tree produced by the {@code exprVarAssign}
     * labeled alternative in {@link BantamJavaParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ParserRuleContext visitExprVarAssign(BantamJavaParser.ExprVarAssignContext ctx) {
        return ctx;
    }

    /**
     * Visit a parse tree produced by the {@code exprAddSub}
     * labeled alternative in {@link BantamJavaParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ParserRuleContext visitExprAddSub(BantamJavaParser.ExprAddSubContext ctx) {
        return ctx;
    }

    /**
     * Visit a parse tree produced by the {@code expStrLiteral}
     * labeled alternative in {@link BantamJavaParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ParserRuleContext visitExpStrLiteral(BantamJavaParser.ExpStrLiteralContext ctx) {
        return ctx;
    }

    /**
     * Visit a parse tree produced by the {@code exprInstanceof}
     * labeled alternative in {@link BantamJavaParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ParserRuleContext visitExprInstanceof(BantamJavaParser.ExprInstanceofContext ctx) {
        return ctx;
    }

    /**
     * Visit a parse tree produced by the {@code exprNew}
     * labeled alternative in {@link BantamJavaParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ParserRuleContext visitExprNew(BantamJavaParser.ExprNewContext ctx) {
        return ctx;
    }

    /**
     * Visit a parse tree produced by the {@code exprOr}
     * labeled alternative in {@link BantamJavaParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ParserRuleContext visitExprOr(BantamJavaParser.ExprOrContext ctx) {
        return ctx;
    }

    /**
     * Visit a parse tree produced by the {@code exprTypeConversion}
     * labeled alternative in {@link BantamJavaParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ParserRuleContext visitExprTypeConversion(BantamJavaParser.ExprTypeConversionContext ctx) {
        return ctx;
    }

    /**
     * Visit a parse tree produced by the {@code exprFieldAssign}
     * labeled alternative in {@link BantamJavaParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ParserRuleContext visitExprFieldAssign(BantamJavaParser.ExprFieldAssignContext ctx) {
        return ctx;
    }

    /**
     * Visit a parse tree produced by the {@code exprParenthesized}
     * labeled alternative in {@link BantamJavaParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ParserRuleContext visitExprParenthesized(BantamJavaParser.ExprParenthesizedContext ctx) {
        return ctx;
    }

    /**
     * Visit a parse tree produced by the {@code exprRelational}
     * labeled alternative in {@link BantamJavaParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ParserRuleContext visitExprRelational(BantamJavaParser.ExprRelationalContext ctx) {
        return ctx;
    }

    /**
     * Visit a parse tree produced by the {@code exprBoolLiteral}
     * labeled alternative in {@link BantamJavaParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ParserRuleContext visitExprBoolLiteral(BantamJavaParser.ExprBoolLiteralContext ctx) {
        return ctx;
    }

    /**
     * Visit a parse tree produced by the {@code exprAnd}
     * labeled alternative in {@link BantamJavaParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ParserRuleContext visitExprAnd(BantamJavaParser.ExprAndContext ctx) {
        return ctx;
    }

    /**
     * Visit a parse tree produced by the {@code exprID}
     * labeled alternative in {@link BantamJavaParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ParserRuleContext visitExprID(BantamJavaParser.ExprIDContext ctx) {
        return ctx;
    }

    /**
     * Visit a parse tree produced by the {@code exprMethodCall}
     * labeled alternative in {@link BantamJavaParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ParserRuleContext visitExprMethodCall(BantamJavaParser.ExprMethodCallContext ctx) {
        return ctx;
    }

    /**
     * Visit a parse tree produced by the {@code exprNegation}
     * labeled alternative in {@link BantamJavaParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ParserRuleContext visitExprNegation(BantamJavaParser.ExprNegationContext ctx) {
        return ctx;
    }

    /**
     * Visit a parse tree produced by the {@code exprDotMethodCall}
     * labeled alternative in {@link BantamJavaParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ParserRuleContext visitExprDotMethodCall(BantamJavaParser.ExprDotMethodCallContext ctx) {
        return ctx;
    }

    /**
     * Visit a parse tree produced by the {@code lstOfArgs}
     * labeled alternative in {@link BantamJavaParser#argsList}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ParserRuleContext visitLstOfArgs(BantamJavaParser.LstOfArgsContext ctx) {
        return ctx;
    }

}