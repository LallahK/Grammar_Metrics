# Grammar Metrics
## Abdullah Karbanee - 21865728

This Tool allows one to parse and derive analytical details about different Context-Free Grammars. It uses the formats outlined by different parser generating tools, converts these grammar specefications into a general format, and thereafter performs the analysis of the grammar.

# Detail

This tool supports analysing grammars in formats speceficied by the Antlr, CUP and JavaCC parser generators. Each of the code necessary to analyse and conver the grammars from each of these respective formats are found in the `Antlr4`, `CUP` and `JavaCC` subdirectories, respectively. 

# Compilation

The `compile.sh` bashscript compiles the parsers in the different formats. It is assumed that all necessary dependencies are in the `/usr/local/lib` folder. However, one should change the classpath of the different dependencies to where they are on your computer. The bash script will generate all necessary classes, but will not run any user input. It can be executed as follows:
```
chmod +x compile.sh
./compile.sh
```
The `run.sh` bashscript uses the compiled classes to allow for the full conversion of user specified grammars, and the full analysis of them. This script will compile the main class, execute the program, and then clean the directory of classes. It must be run after `compile.sh` and can be executed as follows:
```
chmod +x run.sh
./run.sh <input_file>
```

# Analysis Commands

The following is a list of analysis, as well as a brief description as to what analysis is done:
|  Command  |  Description |
|-----------|--------------|
| Nullable  | Computes which non terminals in the grammar can be expanded to the empty string |
| First     | Computes which terminal symbols may be found immediately when expanding a non-terminal |
| Follow    | Computes which terminal symbols may follow immediatetly after the expansion of a non-terminal |
| Alphabet  | Computes which terminal symbols may occur in the expansion of a non-terminal symbol |
| Core      | Computes which terminal symbols must occur in the expansion of a non-terminal symbol |
| Depth     | Computes the maximum number of expansions necessary to expand the start symbol, without expanding the same non-terminal twice |
| Recursion | Computes which non-terminal symbols are left-recursive, right-recursive, or indirectly recursive |
| Terminals | Computes the maximum number of expansions necessary to have the terminal symbol occur in the sentence, withpout expanding the same non-terminal twice |

# Contact Details

21865728@sun.ac.za