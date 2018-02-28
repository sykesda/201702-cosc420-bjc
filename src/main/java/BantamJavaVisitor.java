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
	 * Visit a parse tree produced by {@link BantamJavaParser#classDefn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDefn(BantamJavaParser.ClassDefnContext ctx);
	/**
	 * Visit a parse tree produced by {@link BantamJavaParser#member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMember(BantamJavaParser.MemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link BantamJavaParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(BantamJavaParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link BantamJavaParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(BantamJavaParser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link BantamJavaParser#formalList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalList(BantamJavaParser.FormalListContext ctx);
	/**
	 * Visit a parse tree produced by {@link BantamJavaParser#formal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal(BantamJavaParser.FormalContext ctx);
	/**
	 * Visit a parse tree produced by {@link BantamJavaParser#stmtList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtList(BantamJavaParser.StmtListContext ctx);
	/**
	 * Visit a parse tree produced by {@link BantamJavaParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(BantamJavaParser.StmtContext ctx);
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