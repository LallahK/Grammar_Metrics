package Antlr4;

import java.io.*;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.TokenStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import Antlr4.Term.*;

public abstract class ParserData extends Parser  {

    private ArrayList<Production> productions;
    // private HashMap<String, Terminal> terminals;
    // private HashMap<String, NonTerminal> nonTerminals;

    public ParserData(TokenStream input) {
        super(input);
        productions = new ArrayList<Production>();
        // terminals = new HashMap<String, Terminal>();
        // nonTerminals = new HashMap<String, NonTerminal>();
    }

    public void addProduction(String key, Production p) {
        productions.add(p);
    }

    public void printGrammar() {
        System.out.println("Productions: ");
        for (Production p: productions) {
            System.out.println(p);
        }
    }

    public ArrayList<Production> getProductions() { return this.productions; }

}
