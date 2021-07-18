import java.util.ArrayList;
import java.lang.Character;

import Antlr4.Term;

enum Set {

    FIRST (0),
    FOLLOW (1),
    ALPHABET (2),
    CORE (3);

    private final int value;

    Set(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}

class Grammar {
    
    public ArrayList<Production> productions;
    public ArrayList<Terminal> terminals;
    public ArrayList<NonTerminal> nonTerminals;
    public NonTerminal first;

    public int depth;
    public double productionLength;
    public double terminalRatio;
    public double terminalUsageRatio;
    public int extraProductions;

    public Grammar() {
        productions = new ArrayList<Production>();
        terminals = new ArrayList<Terminal>();
        nonTerminals = new ArrayList<NonTerminal>();
    }
    
    public Grammar copyGrammar() {
        Grammar copy = new Grammar();
        
        for (NonTerminal nt: nonTerminals) {
            copy.addNonTerminal(nt.copy());
        }

        for (Terminal t: terminals) {
            copy.addTerminal(t.copy());
        }

        for (Production p: productions) {
            copy.addProduction(p.copy(copy));
        }

        copy.first = copy.getNonTerminal(first.literal);

        return copy;
    }

    public NonTerminal getNonTerminal(String t) {
        NonTerminal nt = new NonTerminal(t);
        int index = nonTerminals.indexOf(nt);
        if (index != -1) {
            return nonTerminals.get(index);
        } return null;
    }

    public Terminal getTerminal(String t) {
        int index = -1;
        for (Terminal te: terminals) {
            if (te.literal.equals(t)) index = te.index;
        }
        if (index != -1) {
            return terminals.get(index);
        } return null;
    }

    public void addProduction(Production p) {
        p.index = productions.size();
        productions.add(p);
    }

    public void removeProductionDep(Production p) {
        for (Symbol s: p.rules) {
            if (s.getType() == 0) {
                NonTerminal nt = (NonTerminal) s;
                nt.removeDependency(p.nt);
            }
        }

        this.productions.remove(p);
    }

    public void addProductionDep(int index, Production p) {
        for (Symbol s: p.rules) {
            if (s.getType() == 0) {
                NonTerminal nt = (NonTerminal) s;
                nt.addDependency(p.nt);
            }
        }
        this.productions.add(index, p);
    }

    public void addTerminal(Terminal t) {
        t.index = terminals.size();
        terminals.add(t);
    }

    public void addNonTerminal(NonTerminal nt) {
        nt.index = nonTerminals.size();
        nonTerminals.add(nt);
    }

    public void metrics() {
        System.out.println("Non-Terminals: " + nonTerminals.size());
        System.out.println("Terminals: " + terminals.size());
        System.out.println("Productions: " + productions.size());
        System.out.println("Terminal Ratio: " + terminalRatio);
        System.out.println("Productions Length: " + productionLength);
        System.out.println("Extra Productions: " + extraProductions);
    }

    public void depth() {
        System.out.println("Depth: " + depth);
    }

    public void nullable() {
        System.out.println("Non-terminals = ");
        for (NonTerminal nt: nonTerminals) {
            System.out.println(nt + " : " + nt.nullable);
        }
    }

    public void recursion() {
        System.out.println("Left-Recursive = ");
        for (NonTerminal nt: nonTerminals) {
            if (nt.lrecursive) System.out.print(nt + ", ");
        }
        System.out.println("\n");  

        System.out.println("Right-Recursive = ");
        for (NonTerminal nt: nonTerminals) {
            if (nt.rrecursive) System.out.print(nt + ", ");
        }
        System.out.println("\n");  

        System.out.println("Recursive = ");
        for (NonTerminal nt: nonTerminals) {
            if (nt.recursive) System.out.print(nt + ", ");
        }
        System.out.println();  
    }

    public void relDepth() {
        System.out.println("Terminal Depths");
        for (Terminal t: terminals) {
            System.out.println(t +": " + t.depth);
        }
    }

    public void setPrint(Set s) {
        System.out.println(s + " = ");
        for (NonTerminal nt: nonTerminals) {
            System.out.print(nt + " : ");
            for (Symbol t: nt.getSet(s)) {
                System.out.print(t + ", ");
            }
            System.out.println();
        }
    }

    public void printGrammar() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        String s = "Non-terminals = " + nonTerminals.get(0);
        for (int i = 1; i < nonTerminals.size(); i++) {
            s += ", " + nonTerminals.get(i);
        }
        s += "\n";

        s += "Terminals = " + terminals.get(0);
        for (int i = 1; i < terminals.size(); i++) {
            s += ", " + terminals.get(i);
        }
        s += "\n";

        s += productions.size() + "\n";
        for (Production p: first.productions) {
            s += p + "\n";
        }
        for (Production p: productions) {
            if (p.nt == first) continue;
            s += p + "\n";
        }
        return s;
    }
}

class Production {

    public NonTerminal nt;
    public ArrayList<Symbol> rules;
    public int index;

    public Production(NonTerminal nt) {
        this.nt = nt;
        this.rules = new ArrayList<>();
        nt.addProduction(this);
    }

    public Production copy(Grammar g) {
        Production p = new Production(g.getNonTerminal(nt.literal));
        for (Symbol s: rules) {
            if (s.getType() == 0) {
                NonTerminal nt = g.getNonTerminal(((NonTerminal) s).literal);
                p.addRule(nt);
            } else {
                Terminal t = g.getTerminal(((Terminal) s).literal);
                p.addRule(t);
            }
        }

        return p;
    }

    public void addRule(Symbol t) {
        if (t.getType() == 0) {
            NonTerminal n = (NonTerminal) t;
            n.addDependency(nt);
        } else {
            Terminal e = (Terminal) t;
            e.addProduction(this);
        }
        rules.add(t);
    }

    @Override
    public String toString() {
        String s = nt.toString() + "->";
        if (rules.size() > 0) {
            s += rules.get(0).toString();
            for (int i = 1; i < rules.size(); i++) {
                s += " " + rules.get(i).toString();
            }
        } else {
            s += "#";
        }
        return s;
    }

}

class Symbol {
    public ArrayList<Production> productions;
    
    public int getType() { return 0; }
    public boolean isNullable() { return false; }

    public String literal;
}

class NonTerminal extends Symbol {

    public int index;

    private static int terms;
    public int groups;

    public ArrayList<NonTerminal> dependency;
    public boolean derivable = false;
    public boolean oldDerivable = false;

    private ArrayList<ArrayList<Symbol>> sets;
    public ArrayList<Terminal> follow;
    public ArrayList<Terminal> first;
    public ArrayList<Terminal> alphabet;
    public ArrayList<Terminal> core;
    public boolean nullable;
    public boolean lrecursive;
    public boolean rrecursive;
    public boolean recursive;

    public NonTerminal(String literal) {
        this.literal = literal;
        this.groups = 0;

        this.dependency = new ArrayList<>();

        this.productions = new ArrayList<Production>();
        this.nullable = false;
        this.first = new ArrayList<Terminal>();
        this.follow = new ArrayList<Terminal>();
        this.alphabet = new ArrayList<Terminal>();
        this.core = new ArrayList<Terminal>();

        this.lrecursive = false;
        this.rrecursive = false;
        this.recursive = false;

        this.sets = new ArrayList<ArrayList<Symbol>>();
        for (int i = 0; i < Set.values().length; i++) {
            this.sets.add(new ArrayList<Symbol>());
        }
    }

    public NonTerminal copy() {
        NonTerminal nt = new NonTerminal(literal);

        return nt;
    }

    public void addDependency(NonTerminal nt) {
        if (dependency.indexOf(nt) == -1) this.dependency.add(nt);
    }

    public void removeDependency(NonTerminal nt) {
        for (Production p: nt.productions) {
            for (Symbol s: p.rules) {
                if (s.getType() == 0) if (s.equals(nt)) return;
            }
        }
        this.dependency.remove(nt);
    }

    public void addProduction(Production p) {
        if (productions.indexOf(p) == -1) this.productions.add(p);
    }

    public ArrayList<Symbol> getSet(Set set) {
        return sets.get(set.getValue());
    }

    public boolean isSet(Symbol t, Set set) {
        int index = set.getValue();
        ArrayList<Symbol> terms = this.sets.get(index);

        for (Symbol s: terms) {
            if (s.literal.equals(t.literal)) return true;
        }

        return false;
    }

    public void addSet(Symbol t, Set set) {
        int index = set.getValue();
        ArrayList<Symbol> terms = this.sets.get(index);

        terms.add(t);
    }

    public boolean mergeSet(NonTerminal o, Set from, Set to) {
        boolean change = false;
        int index = from.getValue();
        ArrayList<Symbol> terms = o.sets.get(index);

        for (Symbol t: terms) {
            if (!isSet(t, to)) {
                addSet(t, to);
                change = true;
            }
        }

        return change;
    }

    @Override
    public boolean isNullable() {
        return nullable;
    }

    @Override
    public int getType() {
        return 0;
    }

    @Override
    public String toString() {
        return literal;
    }

    @Override
    public boolean equals(Object obj) {
        NonTerminal t = (NonTerminal) obj;
        return t.literal.equals(literal);
    }

    public static NonTerminal newNT() {
        NonTerminal nt = new NonTerminal("NonTerminal" + terms);
        terms++;
        return nt;
    }

}

class Terminal extends Symbol {

    public int index;
    public int depth;

    private static int terms;
    public String print;

    public Terminal(String literal) {
        this.productions = new ArrayList<Production>();
        this.depth = 0;
        int len = literal.length();

        if (literal.substring(0, 1).equals("\'") &&
            literal.substring(len - 1, len).equals("\'")) {

            boolean word = true;
            for (int i = 1; i < len - 1; i++) {
                if (!Character.isLetter(literal.charAt(i))) word = false;
            }
             
            if (word) {
                this.print = literal.substring(1, len - 1).toUpperCase();
            } else {
                this.print = "TERM" + terms;
                terms++;
            }
        } else {
            this.print = literal;
        }
        this.literal = literal;
    }

    public void reset() { terms = 0; }

    public Terminal copy() {
        Terminal t = new Terminal(literal);
        t.print = print;

        return t;
    }

    public static Terminal newT() {
        Terminal t = new Terminal("TERM" + terms);
        terms++;
        t.literal = t.print;
        return t;
    }

    @Override
    public int getType() {
        return 1;
    }

    @Override
    public String toString() {
        return print;
    }

    @Override
    public boolean equals(Object obj) {
        Terminal t = (Terminal) obj;
        return t.literal.equals(literal);
    }

    public void addProduction(Production p) {
        if (productions.indexOf(p) == -1) this.productions.add(p);
    }

}