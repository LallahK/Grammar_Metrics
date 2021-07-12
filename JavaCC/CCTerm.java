package JavaCC;

import java.util.ArrayList;

public class CCTerm {

    public static class CCProduction {

        private String LHS;
        private CCAlternate RHS;

        public CCProduction(String LHS, CCAlternate RHS) {
            this.LHS = LHS;
            this.RHS = RHS;
        }

        public CCAlternate getRHS() { return this.RHS; }
        public String getLHS() { return this.LHS; }

        @Override
        public String toString() {
            return LHS.toString() + " -> " + RHS.toString();
        }

    }

    public static class CCAlternate {

        private ArrayList<CCConcat> concats;

        public CCAlternate() {
            this.concats = new ArrayList<>();
        }

        public void add(CCConcat a) {
            this.concats.add(a);
        }

        public int getConcatCount() { return this.concats.size(); }
        public CCConcat getConcat(int i) { return this.concats.get(i); }

        @Override
        public String toString() {
            String s = "";
            if (concats.size() > 0) {
                s = concats.get(0).toString();
                for (int i = 1; i < concats.size(); i++) {
                    s += " | " + concats.get(i).toString();
                }
            }

            return s;
        }

    }

    public static class CCConcat {

        private ArrayList<CCAtom> terms;

        public CCConcat() {
            this.terms = new ArrayList<>();
        }

        public void add(CCAtom a) {
            this.terms.add(a);
        }

        public int getTermCount() { return this.terms.size(); }
        public CCAtom getTerm(int i) { return this.terms.get(i); }

        @Override
        public String toString() {
            String s = "";
            if (terms.size() > 0) {
                s = terms.get(0).toString();
                for (int i = 1; i < terms.size(); i++) {
                    s += " " + terms.get(i).toString();
                }
            }

            return s;
        }

    }

    abstract public static class CCAtom {
        public int option = 0;

        abstract public int getType();

        public void setOption(int option) {
            this.option = option;
        }

        public int getOption() {
            return option;
        }
    }

    public static class CCTerminal extends CCAtom {

        public String literal;

        public CCTerminal(String literal) {
            int len = literal.length();
            if (literal.substring(0, 1).equals("\"") &&
                literal.substring(len - 1, len).equals("\"")) {
                this.literal = literal.substring(1, len - 1);
            } else this.literal = literal;
        }

        @Override
        public int getType() {
            return 1;
        }

        @Override
        public String toString() {
            String s = literal;
            switch (option) {
                case 1: s += "?";
                    break;
                case 2: s += "*";
                    break;
                case 3: s += "+";
                    break;
                default:
                    break;
            }
            return s;
        }

    }

    public static class CCGroup extends CCAtom  {

        public CCAlternate group;

        public CCGroup(CCAlternate group) {
            this.group = group;
        }

        public int getType() { return 2; }
        
        @Override
        public String toString() {
            String s = "(" + group.toString() + ")";
            switch (option) {
                case 1: s += "?";
                    break;
                case 2: s += "*";
                    break;
                case 3: s += "+";
                    break;
                default:
                    break;
            }
            return s;
        }

        @Override
        public int hashCode() {
            return group.hashCode();
        }
    }

}