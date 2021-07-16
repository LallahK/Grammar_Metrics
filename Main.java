
import java.io.*;
import java.util.List;
import java.util.Scanner;

import org.antlr.v4.runtime.*;
// import org.antlr.v4.runtime.tree.*;
import Antlr4.*;
import CUP.*;
import JavaCC.JavaCCParser;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Main <file>");
            System.exit(0);
        }

        Grammar g = null;

        String extension = getFileExtension(args[0]);
        if (extension.equals("g4")) g = runAntlr("Input/" + args[0]);
        if (extension.equals("cup")) g = runCup("Input/" + args[0]);
        if (extension.equals("jj")) g = runJavaCC("Input/" + args[0]);

        if (g == null) {
            System.err.println("Invalid Grammar!");
            System.exit(0);
        }
        Analysis a = new Analysis(g);
        TestGen t = new TestGen(g, a);

        boolean finish = false;
        Scanner scanner = new Scanner(System.in);
        while (!finish) {
            System.out.println("\nEnter analysis command:");
            finish = command(a, g, t, scanner.nextLine());
        }

        scanner.close();
    }

    public static boolean command(Analysis a, Grammar g, TestGen t, String input) {
        if (input.equalsIgnoreCase("nullable")) {
            a.nullableSet();
            g.nullable();
        } 
        if (input.equalsIgnoreCase("first")) {
            a.firstSet();
            g.setPrint(Set.FIRST);
        } 
        if (input.equalsIgnoreCase("follow")) {
            a.followSet();
            g.setPrint(Set.FOLLOW);
        } 
        if (input.equalsIgnoreCase("alphabet")) {
            a.alphabetSet();
            g.setPrint(Set.ALPHABET);
        } 
        if (input.equalsIgnoreCase("core")) {
            a.coreSet();
            g.setPrint(Set.CORE);
        } 
        if (input.equalsIgnoreCase("depth")) {
            a.depth();
            g.depth();
        }
        if (input.equalsIgnoreCase("terminals")) {
            a.relDepth();
            g.relDepth();
        } 
        if (input.equalsIgnoreCase("recursion")) {
            System.out.println(g.nonTerminals.size());
            a.recursion();
            g.recursion();
        } 
        if (input.equalsIgnoreCase("metrics")) {
            a.metrics();
            g.metrics();
        }
        if (input.equalsIgnoreCase("gen")) {
            t.testcaseGen();
        } 
        if (input.equalsIgnoreCase("help")) {
            System.out.println("Command list:");
            System.out.println("\tnullable - print nullable set");
            System.out.println("\tfirst - print first set");
            System.out.println("\tfollow - print follow set");
            System.out.println("\talphabet - print the set of symbols that can occur when the non terminal occurs");
            System.out.println("\tcore - print the set of symbols in every word where the non terminal occurs");
            System.out.println("\tdepth - the length of the longest acyclic derivation of some word");
            System.out.println("\trecursion - print the left-recursive, right-recursive and indirectly recursive symbols");
            System.out.println("\tterminals - print the longest acyclic derviation needed to have the terminal occur in a word");
            System.out.println("\tmetrics - print sundry metric information");
            System.out.println("\tgen - generate testcases from grammar");
            System.out.println("\tprint - print the raw grammar");
            System.out.println("\thelp - display this message");
            System.out.println("\texit - close program");
        } 
        if (input.equalsIgnoreCase("print")) {
            g.printGrammar();
        } 
        if (input.equalsIgnoreCase("exit")) {
            return true;
        } 
        return false;
    }

    public static Grammar runAntlr(String file) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
            CharStream in = CharStreams.fromStream(fis);
            
            ANTLRv4Lexer lexer = new ANTLRv4Lexer(in);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            ANTLRv4Parser parser = new ANTLRv4Parser(tokens);

            parser.grammarSpec();

            Converter converter = new AntlrConverter(parser);
            return converter.convert();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Grammar runCup(String file) {
        try {
			cupParser p = new cupParser(new cupLexer(new FileReader(file)));
			CUPGrammar g = (CUPGrammar) p.parse().value;

            Converter converter = new CUPConverter(g);
            return converter.convert();
		} catch (Exception e) {
			e.printStackTrace();
            return null;
		}
    }

    public static Grammar runJavaCC(String file) {
        try {
            JavaCCParser p = new JavaCCParser(new FileInputStream(file));
            Converter converter = new JavaCCConverter(p.javacc_input());
            return converter.convert();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String getFileExtension(String fullName) {
        String fileName = new File(fullName).getName();
        int dotIndex = fileName.lastIndexOf('.');
        return (dotIndex == -1) ? "" : fileName.substring(dotIndex + 1);
    }
}