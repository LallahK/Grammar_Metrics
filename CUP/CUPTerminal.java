package CUP;

import java.util.ArrayList;

public class CUPTerminal extends CUPAtom {

    public CUPTerminal(String literal) {
        this.literal = literal;
    }

    public String literal;

    @Override
    public int getType() {
        return 1;
    }

}

class CUPAtom {
    public int getType() { return 0; };
}

class CUPAtomList {
    public ArrayList<CUPAtom> list;

    public CUPAtomList() {
        this.list = new ArrayList<>();
    }

    public void add(CUPAtom a) {
        this.list.add(a);
    }

    public void addList(CUPAtomList list) {
        for (CUPAtom a: list.list) {
            this.add(a);
        }
    } 
}
