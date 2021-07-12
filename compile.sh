export CLASSPATH=".:/usr/local/lib/antlr-4.8-complete.jar:$CLASSPATH"
export CLASSPATH=".:/usr/local/lib/java-cup-11b-runtime.jar:$CLASSPATH"
export CLASSPATH=".:/usr/local/lib/java-cup-11b.jar:$CLASSPATH"
export CLASSPATH=".:/usr/local/lib/javacc.jar:$CLASSPATH"
alias antlr4='java -Xmx500M -cp "/usr/local/lib/antlr-4.8-complete.jar:$CLASSPATH" org.antlr.v4.Tool'

cd Antlr4
antlr4 -lib ./ -o ./ -package Antlr4 ANTLRv4Parser.g4
javac *.java
cd ..

cd CUP
jflex cupLexer.jflex
java -jar /usr/local/lib/java-cup-11b.jar -parser cupParser cupParser.cup
javac -cp /usr/local/lib/java-cup-11b.jar:. *.java
cd ..

cd JavaCC
java javacc javacc.jj
javac *.java
cd ..

# javac Main.java
# java Main $1 $2

# rm CUP/*.class
# rm Antlr4/*.class
# rm *.class