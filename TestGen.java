import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TestGen {
    
    private Grammar grammar;
    private Analysis analysis;
    private ArrayList<Operation> operations;
    private String fileName;

    private int majority;
    private double usageRatio;
    private double ratio;
    private double proLen;
    private double extraPro;


    private Random random;

    public TestGen(Grammar grammar, Analysis analysis) {
        this.grammar = grammar;
        this.analysis = analysis;
        this.operations = new ArrayList<>();
        this.random = new Random();
    }

    public void testcaseGen() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nEnter file name:");
        fileName = scanner.nextLine();
        System.out.println("Enter majority operation:");
        String line = scanner.nextLine();

        if (line.equals("all")) majority = 0;
        else if (line.equals("insert")) majority = 1;
        else if (line.equals("edit")) majority = 2;
        else if (line.equals("remove")) majority = 3;
        else {
            System.out.println("\nERROR: Select operation: all | insert | edit | remove");
            return;
        }

        analysis.metrics();
        ratio = grammar.terminalRatio;
        proLen = grammar.productionLength;
        extraPro = grammar.extraProductions;
        usageRatio = grammar.terminalUsageRatio;

        generate(10);
    }

    public void testcaseGen(String fileName, String majority) {
        int pos = fileName.lastIndexOf(".");
        if (pos > 0) {
            this.fileName = fileName.substring(0, pos);
        } else this.fileName = fileName;

        initGen(majority);
    }

    public void initGen(String line) {
        if (line.equals("all")) majority = 0;
        else if (line.equals("insert")) majority = 1;
        else if (line.equals("edit")) majority = 2;
        else if (line.equals("remove")) majority = 3;
        else {
            System.out.println("\nERROR: Select operation: all | insert | edit | remove");
            return;
        }

        analysis.metrics();
        ratio = grammar.terminalRatio;
        proLen = grammar.productionLength;
        extraPro = grammar.extraProductions;
        usageRatio = grammar.terminalUsageRatio;

        String[] folders = new String[] { "XSmall", "Small", "Medium", "Large", "XLarge" };

        int count = 10;
        String g = grammar.toString();

        for (int i = 0; i < 5; i++) {
            count += 10 * ((int) Math.pow(2, i - 2));
            generate(count);
            write(line, folders[i], g);
        }

        validGrammar();
    } 

    private void write(String majority, String folder, String g) {
        try {
            File f = new File(new File("TestCases"), majority);
            f.mkdir();
            
            f = new File(f, folder);
            f.mkdir();

            f = new File(f, fileName + ".cfg");
            f.createNewFile();

            FileWriter fw = new FileWriter(f);

            fw.write(g + "\n");
            fw.write(operations.size() + "\n");
            for (Operation op: operations) {
                fw.write(op.toString() + "\n");
            }

            fw.close();
        } catch (Exception e) {
            System.out.println("Could not write to " + folder + "/" + fileName + ".cfg");
            System.out.println(e);
        }
    }

    private void generate(int count) {
        double[] ratios = new double[] {1, 1, 1};
        int sum = 3;

        if (majority > 0) {
            ratios[majority - 1] = 3;
            sum = 5;
        }
        for (int i = 0; i < 3; i++) ratios[i] /= sum;

        reachable();

        for (int i = 0; i < count; i++) {
            analysis.metrics();

            int choice = roulette(ratios);
            switch (choice) {
                case 0: genInsert();
                    break;
                case 1: genEdit();
                    break;
                case 2: genRemove();
                    break;
                default:
                    break;
            }
        }
    }

    private void genInsert() {
        double choice = random.nextDouble();

        if (choice < 0.15) {
            insertList();
        } else if (choice < 0.35) {
            insertOption();
        } else if (choice < 0.85) {
            insertOld();
        } else {
            insertNew();
        }
    }

    private void insertList() {
        NonTerminal nt = nextNT();
        Terminal t;
        Production p = newProductionNTandT(nt, 1, null);

        t = nextT();
        t.addProduction(p);
        p.addRule(nextT());
        p.addRule(nt);

        operations.add(new Operation(p));

        if (hasTerminating(nt)) return;

        p = newProductionT(nt, 0);
        operations.add(new Operation(p));
    }

    private void insertOption() {
        NonTerminal nt = nextNT();
        Production p = newProductionNTandT(nt, 0, null);

        operations.add(new Operation(p));

        if (hasTerminating(nt)) return;

        p = newProductionT(nt, 0);
        operations.add(new Operation(p));
    }

    private void insertOld() {
        NonTerminal nt = nextNT();
        Production p = newProductionNTandT(nt, 0, null);
        
        operations.add(new Operation(p));
    }

    private void insertNew() {
        NonTerminal nt = NonTerminal.newNT();
        NonTerminal n = nextNT();
        grammar.addNonTerminal(nt);

        Production p = newProductionNTandT(nt, 0, null);
        operations.add(new Operation(p));

        p = newProductionNTandT(n, 1, nt);

        operations.add(new Operation(p));
    }

    private void genEdit() {
        double choice = random.nextDouble();

        if (choice < 0.15) {
            analysis.recursion();
            editUnRecursion();
        } else if (choice < 0.3) {
            editRecursion();
        } else if (choice < 0.75) {
            editSemi((int) (proLen / 3));
        } else {
            editSemi(0);
        }
    }

    private void editUnRecursion() {
        ArrayList<NonTerminal> recursive = new ArrayList<>();
        for (NonTerminal nt: grammar.nonTerminals) {
            if (nt.rrecursive || nt.lrecursive) recursive.add(nt);
        } 

        if (recursive.size() <= 0) return;

        int index = random.nextInt(recursive.size());
        NonTerminal nt = recursive.get(index);

        Production rec = null;
        Symbol s = null;
        for (Production p: nt.productions) {
            if (p.rules.size() == 0) continue;

            if (nt.lrecursive) s = p.rules.get(0); 
            else s = p.rules.get(p.rules.size() - 1);
            
            if (s.getType() == 0) if (s.equals(nt)) rec = p;
        }

        if (nt.lrecursive) {
            rec.rules.remove(0);
        }
        else {
            rec.rules.remove(rec.rules.size() - 1);
        }

        operations.add(new Operation(rec.index + 1, rec));
    }

    private void editRecursion() {
        ArrayList<NonTerminal> recursive = new ArrayList<>();
        for (NonTerminal nt: grammar.nonTerminals) {
            if (!nt.rrecursive && !nt.lrecursive) recursive.add(nt);
        } 

        if (recursive.size() <= 0) return;

        int index = random.nextInt(recursive.size());
        NonTerminal nt = recursive.get(index);
        index = random.nextInt(nt.productions.size());
        Production p = nt.productions.get(index);

        if (random.nextDouble() < 0.5) p.addRule(nt);
        else {
            nt.addDependency(nt);
            p.rules.add(0, nt);
        }

        operations.add(new Operation(p.index + 1, p));
    }

    private void editSemi(int effect) {
        int index = random.nextInt(grammar.productions.size());
        Production p = grammar.productions.get(index);

        ArrayList<Integer> candidates = new ArrayList<>();
        for (int i = 0; i < p.rules.size(); i++) {
            Symbol s = p.rules.get(i);
            if (s.getType() == 0) {
                NonTerminal nt = (NonTerminal) s;
                if (nt.dependency.size() > 1 && !(nt.lrecursive || nt.rrecursive)) candidates.add(i);
            } else {
                candidates.add(i);
            }
        }

        boolean edited = false;

        if (candidates.size() != 0) {
            int size = candidates.size();
            double[] ratios = new double[size];
            ArrayList<Integer> indices = new ArrayList<>();

            for (int i = 0; i < size; i++) ratios[i] = (1.0 / size);

            while (continueBuild(indices.size() + effect)) {
                indices.add(roulette(ratios));
            }

            for (Integer indice: indices) {
                index = candidates.get(indice.intValue());
                Symbol n = nextSymbol();

                if (n.getType() == 0) {
                    NonTerminal nt  = (NonTerminal) n;
                    nt.addDependency(p.nt);
                }

                n = p.rules.set(index, n);
            
                if (n.getType() == 0) {
                    NonTerminal nt  = (NonTerminal) n;
                    nt.removeDependency(p.nt);
                }

                edited = true;
            }
        }

        if (!edited) {
            index = random.nextInt(p.rules.size() + 1);
            Symbol s = nextSymbol();
            if (s.getType() == 0) ((NonTerminal) s).addDependency(p.nt);
            if (p.rules.size() == index) p.rules.add(s);
            else p.rules.add(index, s);
        }

        operations.add(new Operation(p.index + 1, p));
    }

    private void genRemove() {
        boolean[][] reachable = reachable();
        int size = grammar.nonTerminals.size();
        for (int i = 1; i < size; i++) {
            if (!reachable[0][i]) {
                NonTerminal n = grammar.nonTerminals.get(i);
                int bound = n.productions.size();
                Production p = n.productions.get(random.nextInt(bound));

                deleteProduction(p);

                operations.add(new Operation(p.index + 1));
                return;
            }
        }

        analysis.derivableSet();

        ArrayList<Production> candidates = new ArrayList<>();
        ArrayList<Production> delete = new ArrayList<>();

        for (NonTerminal nt: grammar.nonTerminals) {
            if (nt.equals(grammar.first)) continue;
            if (nt.productions.size() > 1) {
                for (Production p: nt.productions) candidates.add(p);
            }
        }

        for (Production p: candidates) {
            grammar.removeProductionDep(p);
            p.nt.productions.remove(p);

            if (deletable(p)) {
                delete.add(p);
            }

            p.nt.productions.add(p);
            grammar.addProductionDep(p.index, p);
        }

        if (delete.size() <= 0) return;

        int index = random.nextInt(delete.size());
        Production d = delete.get(index);

        deleteProduction(d);

        operations.add(new Operation(d.index + 1));
    }

    private void deleteProduction(Production p) {
        grammar.productions.remove(p);
        p.nt.productions.remove(p);
        for (Symbol s: p.rules) {
            if (s.getType() == 1) {
                Terminal t = (Terminal) s;
                t.productions.remove(p);
            } else {
                NonTerminal nt = (NonTerminal) s;
                nt.removeDependency(p.nt);
            }
        }

        for (Production pr: p.nt.productions) {
            for (Symbol s: pr.rules) {
                if (s.getType() == 0) {
                    NonTerminal nt = (NonTerminal) s;
                    nt.addDependency(p.nt);
                }
            }
        }

        for (int i = 0; i < grammar.productions.size(); i++) {
            grammar.productions.get(i).index = i;
        }

        if (p.nt.productions.size() == 0) {
            grammar.nonTerminals.remove(p.nt);
            for (int i = 0; i < grammar.nonTerminals.size(); i++) {
                grammar.nonTerminals.get(i).index = i;
            }

        }
    }

    private boolean deletable(Production p) {
        int size = grammar.nonTerminals.size();
        boolean[] visited = new boolean[size];

        visit(grammar.first, visited);

        for (int i = 1; i < size; i++) {
            if (!visited[i]) return false;
        }

        for (NonTerminal nt: grammar.nonTerminals) nt.oldDerivable = nt.derivable;

        if (!removeDerivable(p)) return false;

        for (NonTerminal nt: grammar.nonTerminals) nt.derivable = nt.oldDerivable;

        return true;
    }

    private void visit(NonTerminal nt, boolean[] visited) {
        visited[nt.index] = true;

        for (Production p: nt.productions) {
            for (Symbol s: p.rules) {
                if (s.getType() == 0) {
                    NonTerminal n = (NonTerminal) s;
                    if (!visited[n.index]) visit(n, visited);
                }
            }
        }
    }

    private boolean removeDerivable(Production p) {
        NonTerminal nt = p.nt;

        if (isDerivable(nt)) return true;

        rippleNonDerivable(nt);
        rippleDerivable(nt);

        for (NonTerminal n: grammar.nonTerminals) {
            if (!n.derivable) return false;
        }

        return true;
    }

    private void rippleNonDerivable(NonTerminal nt) {
        for (NonTerminal n: nt.dependency) {
            if (!n.derivable) continue;

            n.derivable = false;

            if (isDerivable(n)) {
                n.derivable = true;
                continue;
            }

            rippleNonDerivable(n);
        }
    }

    private void rippleDerivable(NonTerminal nt) {
        for (NonTerminal n: nt.dependency) {
            boolean derivable = n.derivable;
            boolean nderivable = isDerivable(n);

            if (derivable ^ nderivable) {
                n.derivable = nderivable;
                rippleDerivable(n);
            }
        }
    }

    private boolean isDerivable(NonTerminal nt) {
        for (Production p: nt.productions) {
            boolean derivable = true;
            for (Symbol s: p.rules) {
                if (s.getType() == 0) {
                    NonTerminal t = (NonTerminal) s;
                    if (!t.derivable) {
                        derivable = false;
                        break;
                    }
                }
            }

            if (!derivable) return false;
        }

        return true;
    }

    private boolean[][] reachable() {
        int size = grammar.nonTerminals.size() + 1;
        boolean[][] dists = new boolean[size][size];
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                dists[i][j] = false;
            }
        }

        for (Production p: grammar.productions) {
            NonTerminal a = p.nt;
            boolean complete = true;

            for (Symbol s: p.rules) {
                if (s.getType() == 0) {
                    NonTerminal b = (NonTerminal) s;
                    dists[a.index][b.index] = true;
                    complete = false;
                }
            }

            if (p.rules.size() == 0 || complete) {
                dists[a.index][size - 1] = true;
            }
        }

        for (int k = 0; k < size; k++) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (dists[i][k] && dists[k][j]) {
                        dists[i][j] = true;
                    }
                }
            }
        }

        return dists;
    }

    private Production newProductionNTandT(NonTerminal nt, int index, NonTerminal force) {
        Production p = new Production(nt);
        int count = 0;
        boolean inserted = force == null ? true : false;

        while (continueBuild(index)) {
            index++;
            count++;
        }

        for (int i = 0; i < count; i++) {
            Symbol s = nextSymbol();
            if (s.getType() == 0 && s.equals(nt)) continue;

            if (s.getType() == 1) ((Terminal) s).addProduction(p);
            p.addRule(s);
            if (!inserted) {
                double f = (i + 1.0) / count;
                if (random.nextDouble() < f) {
                    p.addRule(force);
                    inserted = true;
                }
            }
        }
        if (!inserted) p.addRule(force);

        grammar.addProduction(p);

        return p;
    }

    private Production newProductionT(NonTerminal nt, int index) {
        Production p = new Production(nt);

        while (continueBuild(index)) {
            index++;
            Terminal t = nextT();
            t.addProduction(p);
            p.addRule(t);
        }

        grammar.addProduction(p);

        return p;
    }

    private int roulette(double[] ratios) {
        double r = random.nextDouble();
        int index = -1;
        double sum = 0;

        while (sum < r) {
            index++;
            sum += ratios[index];
        }

        return index;
    }

    private boolean hasTerminating(NonTerminal nt) {
        boolean terminating = false;
        for (Production p: nt.productions) {
            if (p.rules.size() == 0) return true;
            
            terminating = true;
            for (Symbol s: p.rules) {
                if (s.getType() == 0) {
                    terminating = false;
                    break;
                }
            }
            if (terminating) return true;
        }

        return false;
    }

    private NonTerminal nextNT() {
        int bound = grammar.nonTerminals.size() - 1;
        if (bound == 0) return grammar.first;

        int index = random.nextInt(bound);
        return grammar.nonTerminals.get(index);
    }

    private Terminal nextT() {
        if (random.nextDouble() < 0.3) {
            Terminal t = Terminal.newT();
            grammar.addTerminal(t);
            return t;
        } else {
            int bound = grammar.terminals.size();
            int index = random.nextInt(bound);
            return grammar.terminals.get(index);
        }
    }

    private Symbol nextSymbol() {
        if (random.nextDouble() < usageRatio) {
            return nextT();
        } else {
            return nextNT();
        }
    }

    private boolean continueBuild(int index) {
        double f = Math.exp(-1 * (1 / proLen) * index);
        return random.nextDouble() < f;
    }

    private boolean validGrammar() {
        boolean[][] reachable = reachable();
        int size = grammar.nonTerminals.size();

        for (int i = 1; i < size; i++) {
            if (!reachable[0][i] || !reachable[size - 1][i]) {
                return false;
            }
        }

        return true;
    }

}

class Operation {

    public String operation;
    public int opType;

    public int index;
    public Production production;

    public Operation(Production production) {
        this.production = production;
        this.operation = "insert";
        this.opType = 1;
    }

    public Operation(int index, Production production) {
        this.index = index;
        this.production = production;
        this.operation = "edit";
        this.opType = 2;
    }

    public Operation(int index) {
        this.index = index;
        this.operation = "remove";
        this.opType = 3;
    }

    @Override
    public String toString() {
        String s = operation + " ";
        switch (opType) {
            case 1: s += production;
                break;
            case 2: s += index + " " + production;
                break;
            case 3: s += index;
                break;
            default:
                break;
        }
        return s;
    }

}