f = open("cupParser.cup", "r")

nts = []
ts = []

for line in f.readlines():
    raw = line.strip().split(" ")

    words = []
    for i in range(len(raw)):
        if raw[i] != "":
           words.append(raw[i]) 

    if len(words) > 1:
        if words[1] == "::=":
            nts.append(words[0])

f.close()
f = open("cupParser.cup", "r")

for line in f.readlines():
    raw = line.strip().split(" ")

    words = []
    for i in range(len(raw)):
        if raw[i] != "" and raw[i] != "|":
           words.append(raw[i]) 

    for i in range(2, len(words)):
        if words[i] not in nts and \
            words[i] not in ts:
            ts.append(words[i])

lits = [
    "package", 
    ";", 
    "import", 
    "action", 
    "code", 
    "\{:<INSERT LEXER>:\}", 
    "parser", 
    "init", 
    "with", 
    "scan", 
    "terminal", 
    ",", 
    "+", 
    "precedence", 
    "left", 
    "start",
    "::=", 
    "|", 
    "%prec", 
    ":", 
    ".", 
    "<ID>", 
    "*"
]

for i in range(len(ts)):
    print("terminal      {};".format(ts[i]))
    # print("\t{:20}\t {{ return symbol(sym.{}); }}".format("\"{}\"".format(lits[i]), ts[i]))
print()
for nt in nts:
    print("nonterminal   {};".format(nt))