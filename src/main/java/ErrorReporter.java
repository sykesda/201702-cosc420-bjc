import org.antlr.v4.runtime.ParserRuleContext;



public class ErrorReporter {
    private int infoCount = 0;
    private int warningCount = 0;
    private int errorCount = 0;

    /**
     * Emit an information message
     *
     * @param ctx the parse tree
     * @return void. Prints a message to the standard error stream
     */
    void infoMessage(ParserRuleContext ctx, String message) {
        System.err.print("[");
        System.err.print(ctx.getStart().getLine());
        System.err.print("] INFO: ");
        System.err.println(message);
        ++infoCount;
    }

    /**
     * Emit a warning message
     *
     * @param ctx the parse tree
     * @return void. Prints a message to the standard error stream
     */
    void warningMessage(ParserRuleContext ctx, String message) {
        System.err.print("[");
        System.err.print(ctx.getStart().getLine());
        System.err.print("] WARNING: ");
        System.err.println(message);
        ++warningCount;
    }

    /**
     * Emit an error message
     *
     * @param ctx the parse tree
     * @return void. Prints a message to the standard error stream
     */
    void errorMessage(ParserRuleContext ctx, String message) {
        System.err.print("[");
        System.err.print(ctx.getStart().getLine());
        System.err.print("] ERROR: ");
        System.err.println(message);
        ++errorCount;
    }

    /**
     * Emit a fatal error message
     *
     * @param ctx the parse tree
     * @return void. Prints a message to the standard error stream and
     * terminates execution with status 1
     */
    void fatalMessage(ParserRuleContext ctx, String message) {
        System.err.print("[");
        System.err.print(ctx.getStart().getLine());
        System.err.print("] FATAL ERROR: ");
        System.err.println(message);
        System.exit(1);
    }

    /**
     * Get the number of error messages
     *
     * @return the number of error messages
     */
    int getErrorCount() {
        return errorCount;
    }


}
