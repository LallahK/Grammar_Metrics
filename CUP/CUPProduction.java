package CUP;

import java.util.ArrayList;

public class CUPProduction {
    
    public String LHS;
    public ArrayList<String> RHS;

    public CUPProduction(String lHS, ArrayList<String> rHS) {
        LHS = lHS;
        RHS = rHS;
    }

    @Override
    public String toString() {
        String s = LHS + " ->";
        for (String t: RHS) {
            s += " " + t;
        }
        return s;
    }
    
}

class CUPProductionList {

    public ArrayList<CUPProduc> productions;

    public CUPProductionList() {
        this.productions = new ArrayList<>();
    }

    public void add(CUPProduc p) {
        this.productions.add(p);
    }

}

class CUPProduc {

    public String LHS;
    public CUPAlternate RHS;

    public CUPProduc(String LHS, CUPAlternate RHS) {
        this.LHS = LHS;
        this.RHS = RHS;
    }

}

class CUPAlternate {

    public ArrayList<CUPConcat> concats;

    public CUPAlternate(CUPConcat c) {
        this.concats = new ArrayList<>();
        this.concats.add(c);
    }

    public void add(CUPConcat term) {
        this.concats.add(term);
    }

}

class CUPConcat {

    public ArrayList<String> terms;

    public CUPConcat() {
        this.terms = new ArrayList<>();
    }

    public void add(String term) {
        this.terms.add(term);
    }

} 
