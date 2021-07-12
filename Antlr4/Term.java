package Antlr4;

import java.util.ArrayList;

public class Term {

    public static class Production {

        private NonTerminal LHS;
        private Alternate RHS;

        public Production(NonTerminal LHS, Alternate RHS) {
            this.LHS = LHS;
            this.RHS = RHS;
        }

        public Alternate getRHS() { return this.RHS; }
        public NonTerminal getLHS() { return this.LHS; }

        @Override
        public String toString() {
            return LHS.toString() + " -> " + RHS.toString();
        }

    }

    public static class Alternate {

        private ArrayList<Concat> concats;

        public Alternate(ArrayList<Concat> concats) {
            this.concats = concats;
        }

        public int getConcatCount() { return this.concats.size(); }
        public Concat getConcat(int i) { return this.concats.get(i); }

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

    public static class Concat {

        private ArrayList<Atom> terms;

        public Concat(ArrayList<Atom> terms) {
            this.terms = terms;
        }

        public int getTermCount() { return this.terms.size(); }
        public Atom getTerm(int i) { return this.terms.get(i); }

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

    abstract public static class Atom {
        public int option = 0;

        abstract public int getType();

        public void setOption(int option) {
            this.option = option;
        }

        public int getOption() {
            return option;
        }
    }

    public static class Terminal extends Atom {
        
        public String literal;

        public Terminal(String val) {
            this.literal = val;
        }

        public int getType() { return 1; }

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

        @Override
        public int hashCode() {
            return literal.hashCode();
        }

    }

    public static class NonTerminal extends Atom  {

        public String literal;

        public NonTerminal(String literal) {
            this.literal = literal;
        }

        public int getType() { return 2; }

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

        @Override
        public int hashCode() {
            return literal.hashCode();
        }

    }

    public static class Group extends Atom  {

        public Alternate group;

        public Group(Alternate group) {
            this.group = group;
        }

        public int getType() { return 3; }
        
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