import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Analysis {

    Grammar grammar;
    
    public Analysis(Grammar grammar) {
        this.grammar = grammar;
        this.strip();
    }

    private void strip() {
        boolean removed = false;
        int size = grammar.nonTerminals.size();
        boolean[] visited = new boolean[size];
        NonTerminal nt;
        int count = 0;

        for (int i = 0; i < size; i++) visited[i] = false;

        visit(grammar.first, visited);

        System.out.println();

        for (int i = 1; i < size; i++) {
            if (!visited[i]) {
                nt = grammar.nonTerminals.get(i - count);
                for (Production p: nt.productions) {
                    grammar.productions.remove(p);
                }
                grammar.nonTerminals.remove(nt);
                removed = true;
                count++;
            }
        }

        if (removed) {
            for (int i = 0; i < grammar.nonTerminals.size(); i++) {
                nt = grammar.nonTerminals.get(i);
                nt.index = i;
            }

            for (int i = 0; i < grammar.productions.size(); i++) {
                grammar.productions.get(i).index = i;
            }
        }
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

    public void nullableSet() {
        boolean change = true;

        while (change) {
            change = false;
            for (NonTerminal nt: grammar.nonTerminals) {
                if (nt.isNullable()) continue;
                for (Production p: nt.productions) {
                    if (p.rules.size() == 0) {
                        nt.nullable = true;
                        change = true;
                        break;
                    }
                    boolean nullable = true;
                    for (Symbol s: p.rules) {
                        if (!s.isNullable()) {
                            nullable = false;
                            break;
                        }
                    }
                    if (nullable) {
                        nt.nullable = true;
                        change = true;
                    }
                }
            }
        }
    }

    public void firstSet() {
        boolean change = true;

        while (change) {
            change = false;
            for (NonTerminal nt: grammar.nonTerminals) {
                for (Production p: nt.productions) {
                    for (Symbol s: p.rules) {
                        if (s.getType() == 0) {
                            NonTerminal t = (NonTerminal) s;

                            if (nt.mergeSet(t, Set.FIRST, Set.FIRST)) change = true;
                            if (!t.isNullable()) break;
                        } else if (s.getType() == 1) {
                            if (!nt.isSet(s, Set.FIRST)) {
                                nt.addSet(s, Set.FIRST);
                                change = true;
                            }
                            break;
                        }
                    }
                }
            }
        }
    }

    public void followSet() {
        boolean change = true;

        while (change) {
            change = false;
            for (NonTerminal nt: grammar.nonTerminals) {
                for (Production p: nt.productions) {
                    for (int i = 0; i < p.rules.size(); i++) {
                        Symbol s = p.rules.get(i);
                        if (s.getType() == 0) {
                            NonTerminal n = (NonTerminal) s;

                            for (int j = i + 1; j < p.rules.size(); j++) {
                                Symbol o = p.rules.get(j);
                                if (o.getType() == 0) {
                                    NonTerminal t = (NonTerminal) o;

                                    if (n.mergeSet(t, Set.FIRST, Set.FOLLOW)) change = true;
                                    if (t.isNullable()) break;
                                } else if (o.getType() == 1) {
                                    if (!n.isSet(o, Set.FOLLOW)) {
                                        n.addSet(o, Set.FOLLOW);
                                        change = true;
                                    }
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void alphabetSet() {
        boolean change = true;

        while (change) {
            change = false;
            for (NonTerminal nt: grammar.nonTerminals) {
                for (Production p: nt.productions) {
                    for (Symbol s: p.rules) {
                        if (s.getType() == 0) {
                            NonTerminal t = (NonTerminal) s;

                            if (nt.mergeSet(t, Set.ALPHABET, Set.ALPHABET)) {
                                change = true;
                            }
                        } else if (s.getType() == 1) {
                            if (!nt.isSet(s, Set.ALPHABET)) {
                                nt.addSet(s, Set.ALPHABET);
                                change = true;
                            }
                        }
                    }
                }
            }
        }
    }

    public void coreSet() {
        boolean change = true;

        while (change) {
            change = false;
            for (NonTerminal nt: grammar.nonTerminals) {
                for (Production p: nt.productions) {
                    for (Symbol s: p.rules) {
                        if (s.getType() == 0) {
                            NonTerminal t = (NonTerminal) s;
                            if (t.isNullable()) continue;

                            if (nt.mergeSet(t, Set.CORE, Set.CORE)) {
                                change = true;
                            }
                        } else if (s.getType() == 1) {
                            if (!nt.isSet(s, Set.CORE)) {
                                nt.addSet(s, Set.CORE);
                                change = true;
                            }
                        }
                    }
                }
            }
        }
    }

    public void derivableSet() {
        boolean change = true;

        while (change) {
            change = false;
            for (Production p: grammar.productions) {
                NonTerminal nt = p.nt;

                if (!nt.derivable && isDerivable(p)) {
                    nt.derivable = true;
                    change = true;
                }
            }
        }
    }

    private boolean isDerivable(Production p) {
        for (Symbol s: p.rules) {
            if (s.getType() == 0) {
                NonTerminal t = (NonTerminal) s;
                if (!t.derivable) return false;
            }
        }

        return true;
    }

    public void depth() {
        System.out.println(grammar.first);
        Stack<Symbol> stack = new Stack<Symbol>();

        stack.push(grammar.first);
        grammar.depth = findDepth(stack, grammar.first, 0, 0);
    }

    public int findDepth(Stack<Symbol> stack, NonTerminal t, int max, int depth) {
        int localDepth = depth;

        for (Production p: t.productions) {
            for (Symbol s: p.rules) {
                if (s.getType() == 1) continue;

                if (stack.search(s) == -1) {
                    stack.push(s);
                    int local = findDepth(stack, (NonTerminal) s, max, depth + 1);
                    stack.pop();

                    if (localDepth < local) localDepth = local;
                }
            }
        }

        return localDepth;
    }

    public void recursion() {
        int size = grammar.nonTerminals.size();
        boolean[][] dists = new boolean[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                dists[i][j] = false;
            }
        }

        for (Production p: grammar.productions) {
            NonTerminal a = p.nt;
            for (Symbol s: p.rules) {
                if (s.getType() == 0) {
                    NonTerminal b = (NonTerminal) s;
                    dists[a.index][b.index] = true;
                }
            }
            
            int len = p.rules.size();
            if (len == 0) continue;

            Symbol start = p.rules.get(0);
            if (start.getType() == 0) {
                NonTerminal nt = (NonTerminal) start;
                if (nt == a) a.lrecursive = true;
            }

            Symbol end = p.rules.get(len - 1);
            if (end.getType() == 0) {
                NonTerminal nt = (NonTerminal) end;
                if (nt == a) a.rrecursive = true;
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

        for (int i = 0; i < size; i++) {
            if (dists[i][i]) grammar.nonTerminals.get(i).recursive = true;
        }
    }

    public void relDepth() {
        int size = grammar.nonTerminals.size();
        boolean[][] dists = new boolean[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                dists[i][j] = false;
            }
        }

        for (Production p: grammar.productions) {
            NonTerminal a = p.nt;
            for (Symbol s: p.rules) {
                if (s.getType() == 0) {
                    NonTerminal b = (NonTerminal) s;
                    dists[a.index][b.index] = true;
                }
            }
        }

        int[] bests = djikstra(dists, size);
        
        for (Production p: grammar.productions) {
            NonTerminal a = p.nt;
            for (Symbol s: p.rules) {
                if (s.getType() == 1) {
                    Terminal b = (Terminal) s;
                    if (b.depth < bests[a.index]) {
                        b.depth = bests[a.index];
                    }
                }
            } 
        }
    }

    private int[] djikstra(boolean[][] graph, int len) {
        int size = grammar.nonTerminals.size();
        int[] dist = new int[size];
        for (int i = 0; i < size; i++) dist[i] = size + 1;
        ArrayList<NonTerminal> nts = new ArrayList<>();

        for (NonTerminal nt: grammar.nonTerminals) nts.add(nt);

        dist[grammar.first.index] = 0;

        while (nts.size() > 0) {
            NonTerminal nt = min(dist, nts);
            nts.remove(nt);

            for (NonTerminal n: nts) {
                if (graph[nt.index][n.index]) {
                    int alt = dist[nt.index] + 1;
                    if (alt < dist[n.index]) {
                        dist[n.index] = alt;
                    }
                }
            }
        }  
        
        return dist;
    }

    private NonTerminal min(int [] dist, ArrayList<NonTerminal> nts) {
        NonTerminal n = nts.get(0);

        for (NonTerminal nt: nts) {
            if (dist[n.index] > dist[nt.index]) {
                n = nt;
            }
        }

        return n;
    }

    public void metrics() {
        double avgLength = 0;
        int extras = 0;
        double ntCount = 0;
        double tCount = 0;

        for (Production p: grammar.productions) {
            avgLength += p.rules.size();
            for (Symbol s: p.rules) {
                if (s.getType() == 0) ntCount += 1;
                else tCount += 1;
            }
        }

        grammar.productionLength = avgLength / grammar.productions.size();
        grammar.terminalRatio = (grammar.terminals.size() * 1.0) / grammar.nonTerminals.size();
        grammar.terminalUsageRatio = tCount / (tCount + ntCount);

        for (NonTerminal nt: grammar.nonTerminals) {
            extras += (nt.productions.size() - 1);
        }

        grammar.extraProductions = extras;
    }

}
