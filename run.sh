# Usage run.sh <finalname>

export CLASSPATH=".:/usr/local/lib/antlr-4.8-complete.jar:$CLASSPATH"
export CLASSPATH=".:/usr/local/lib/java-cup-11b-runtime.jar:$CLASSPATH"
export CLASSPATH=".:/usr/local/lib/java-cup-11b.jar:$CLASSPATH"

javac Main.java
java Main $1 $2

rm *.class