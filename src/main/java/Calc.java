import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.InputStream;


/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
 ***/
public class Calc {
    public static void main(String[] args) throws Exception {
        // Create an input stream of characters for the lexer.
        String inputFile = null;
        if (args.length > 0) {
            inputFile = args[0];
        }
        InputStream is = System.in;
        if (inputFile != null) {
            is = new FileInputStream(inputFile);
        }
        CharStream input = CharStreams.fromStream(is);

        // Create the lexer and parser objects and a token stream "pipe" between them
        ExprLexer lexer = new ExprLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExprParser parser = new ExprParser(tokens);

        // Launch the parser
        ParseTree tree = parser.prog(); // parse; start at prog <label id="code.tour.main.6"/>

        EvalVisitor eval = new EvalVisitor();
        eval.visit(tree);

        // Print the parse tree
//        System.out.println(tree.toStringTree(parser)); // print tree as text <label id="code.tour.main.7"/>
    }
}
