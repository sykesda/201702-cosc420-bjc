// Generated from C:/Users/cgwid/IdeaProjects/201702-cosc420-bjc/src/main/java\BantamJava.g4 by ANTLR 4.7
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
	 * Visit a parse tree produced by the {@code programStart}
	 * labeled alternative in {@link BantamJavaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramStart(BantamJavaParser.ProgramStartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code class}
	 * labeled alternative in {@link BantamJavaParser#classDefn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass(BantamJavaParser.ClassContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fieldMember}
	 * labeled alternative in {@link BantamJavaParser#member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldMember(BantamJavaParser.FieldMemberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodMember}
	 * labeled alternative in {@link BantamJavaParser#member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodMember(BantamJavaParser.MethodMemberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fieldDeclaration}
	 * labeled alternative in {@link BantamJavaParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(BantamJavaParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fieldInstantiation}
	 * labeled alternative in {@link BantamJavaParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldInstantiation(BantamJavaParser.FieldInstantiationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodWithReturn}
	 * labeled alternative in {@link BantamJavaParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodWithReturn(BantamJavaParser.MethodWithReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodNoReturn}
	 * labeled alternative in {@link BantamJavaParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodNoReturn(BantamJavaParser.MethodNoReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formalListEmpty}
	 * labeled alternative in {@link BantamJavaParser#formalList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalListEmpty(BantamJavaParser.FormalListEmptyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formalListPopulated}
	 * labeled alternative in {@link BantamJavaParser#formalList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalListPopulated(BantamJavaParser.FormalListPopulatedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formalWithTypeAndID}
	 * labeled alternative in {@link BantamJavaParser#formal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalWithTypeAndID(BantamJavaParser.FormalWithTypeAndIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listOfStatements}
	 * labeled alternative in {@link BantamJavaParser#stmtList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListOfStatements(BantamJavaParser.ListOfStatementsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementDeclaration}
	 * labeled alternative in {@link BantamJavaParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementDeclaration(BantamJavaParser.StatementDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link BantamJavaParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(BantamJavaParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifElseStatement}
	 * labeled alternative in {@link BantamJavaParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseStatement(BantamJavaParser.IfElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link BantamJavaParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(BantamJavaParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprStatement}
	 * labeled alternative in {@link BantamJavaParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStatement(BantamJavaParser.ExprStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockListStatement}
	 * labeled alternative in {@link BantamJavaParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockListStatement(BantamJavaParser.BlockListStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BantamJavaParser#blockList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockList(BantamJavaParser.BlockListContext ctx);
	/**
	 * Visit a parse tree produced by {@link BantamJavaParser#retn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetn(BantamJavaParser.RetnContext ctx);
	/**
	 * Visit a parse tree produced by {@link BantamJavaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(BantamJavaParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link BantamJavaParser#memberRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberRef(BantamJavaParser.MemberRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link BantamJavaParser#argsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgsList(BantamJavaParser.ArgsListContext ctx);
}