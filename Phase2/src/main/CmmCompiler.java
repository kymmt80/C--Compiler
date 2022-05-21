package main;

import main.visitor.name.ASTTreePrinter;
import parsers.*;
import main.ast.nodes.Program;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class CmmCompiler {
    public void compile(CharStream textStream) {
        CmmLexer cmmLexer = new CmmLexer(textStream);
        CommonTokenStream tokenStream = new CommonTokenStream(cmmLexer);
        CmmParser cmmParser = new CmmParser(tokenStream);

        Program program = cmmParser.cmm().cmmProgram;


        System.out.println("Printing errors If we have errors.");
        // we need to check The "error visitors" for printing error lines
        // we count errors using variable, if it was === 0 then we print next part

        System.out.println("No error so we need print solution");
        ASTTreePrinter astTreePrinter = new ASTTreePrinter();
        program.accept(astTreePrinter);
        System.out.println("End of printing solution");

        //todo
    }
}
