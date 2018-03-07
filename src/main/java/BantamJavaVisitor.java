// Generated from /Users/sykesda/IdeaProjects/2018/02/201702-cosc420-bjc/src/main/java/BantamJava.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BantamJavaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BantamJavaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BantamJavaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(BantamJavaParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code class}
	 * labeled alternative in {@link BantamJavaParser#classDefn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass(BantamJavaParser.ClassContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeVoid}
	 * labeled alternative in {@link BantamJavaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeVoid(BantamJavaParser.TypeVoidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeInt}
	 * labeled alternative in {@link BantamJavaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeInt(BantamJavaParser.TypeIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeBool}
	 * labeled alternative in {@link BantamJavaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBool(BantamJavaParser.TypeBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeID}
	 * labeled alternative in {@link BantamJavaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeID(BantamJavaParser.TypeIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code memberField}
	 * labeled alternative in {@link BantamJavaParser#member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberField(BantamJavaParser.MemberFieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code memberMethod}
	 * labeled alternative in {@link BantamJavaParser#member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberMethod(BantamJavaParser.MemberMethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fieldDeclOrInst}
	 * labeled alternative in {@link BantamJavaParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclOrInst(BantamJavaParser.FieldDeclOrInstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodDeclaration}
	 * labeled alternative in {@link BantamJavaParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(BantamJavaParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lstOfFormals}
	 * labeled alternative in {@link BantamJavaParser#formalList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLstOfFormals(BantamJavaParser.LstOfFormalsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeWithID}
	 * labeled alternative in {@link BantamJavaParser#formal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeWithID(BantamJavaParser.TypeWithIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtExprSemi}
	 * labeled alternative in {@link BantamJavaParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtExprSemi(BantamJavaParser.StmtExprSemiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtIf}
	 * labeled alternative in {@link BantamJavaParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtIf(BantamJavaParser.StmtIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtIfElse}
	 * labeled alternative in {@link BantamJavaParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtIfElse(BantamJavaParser.StmtIfElseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtWhile}
	 * labeled alternative in {@link BantamJavaParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtWhile(BantamJavaParser.StmtWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtLocalVarDecl}
	 * labeled alternative in {@link BantamJavaParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtLocalVarDecl(BantamJavaParser.StmtLocalVarDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtBlock}
	 * labeled alternative in {@link BantamJavaParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtBlock(BantamJavaParser.StmtBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code return}
	 * labeled alternative in {@link BantamJavaParser#retn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(BantamJavaParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link BantamJavaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(BantamJavaParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lstOfArgs}
	 * labeled alternative in {@link BantamJavaParser#argsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLstOfArgs(BantamJavaParser.LstOfArgsContext ctx);
}