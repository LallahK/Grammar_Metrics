package CUP;

import java.util.ArrayList;

public class CUPGrammar {
    public ArrayList<CUPTerminal> terminals;
    public ArrayList<CUPNonTerminal> nonterminals;
    public ArrayList<CUPProduction> productions;

    public CUPGrammar(CUPAtomList list, CUPProductionList plist) {
        this.terminals = new ArrayList<>();
        this.nonterminals = new ArrayList<>();
        this.productions = new ArrayList<>();
        seperate(list);
        getProductions(plist);
    }

    public void seperate(CUPAtomList list) {
        for (CUPAtom a: list.list) {
            if (a.getType() == 1) {
                terminals.add((CUPTerminal) a);
            } else if (a.getType() == 2) {
                nonterminals.add((CUPNonTerminal) a);
            }
        }
    }

    public void getProductions(CUPProductionList list) {
        for (CUPProduc p: list.productions) {
            for (CUPConcat c: p.RHS.concats) {
                productions.add(new CUPProduction(p.LHS, c.terms));
            }
        } 
    }

    public void printGrammar() {
        System.out.print("Terminals = ");
        for (CUPTerminal t: terminals) {
            System.out.print(" " + t);
        }
        System.out.println();
        System.out.print("Non-terminals = ");
        for (CUPNonTerminal t: nonterminals) {
            System.out.print(" " + t);
        }

        for (CUPProduction p: productions) {
            System.out.println(p);
        }
    }
}
