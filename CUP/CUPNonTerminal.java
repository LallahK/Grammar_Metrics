package CUP;

public class CUPNonTerminal extends CUPAtom {
    
    public CUPNonTerminal(String literal) {
        this.literal = literal;
    }

    public String literal;

    @Override
    public int getType() {
        return 2;
    }

}
