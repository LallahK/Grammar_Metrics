grammar alan;

/**
 * <source> = "source" <id> {<funcdef>} <body>
 */
source
    : 'source' ID ( funcdef )* body
    ;

/**
 * <funcdef> = "function" <id> "(" [<type> <id> {"," <type> <id>}] ")" 
 * ["to" <type>] <body>
 */
funcdef
    : 'function' ID '(' ( type ID (',' type ID )* )? ')' ( 'to' type )? body
    ;

/**
 * <body> = "begin" {<vardef>} <statements> "end"
 */
body
    : 'begin' ( vardef )* statements 'end'
    ;

/**
 * <type> = ("boolean" | "integer") ["array"]
 */
type
    : ( 'boolean' | 'integer' ) ( 'array' )?
    ;

/**
 * <vardef> = <type> <id> {"," <id>} ";"
 */
vardef
    : type ID ( ',' ID )* ';'
    ;

/**
 * <statements> = "relax" | <statement> {";" <statement>}
 */
statements
    : 'relax' | statement ( ';' statement )*
    ;

/**
 * <statement> = <assign> | <call> | <if> | <input> | <leave> | <output> | <while>
 */
statement
    : assign | call | alan_if | input | leave | output | alan_while
    ;

/**
 * <assign> = <id> ["[" <simple> "]"] ":=" (<expr> | "array" <simple>)
 */
assign
    : ID ( '[' simple ']' )? ':=' ( expr | 'array' simple ) 
    ;

/**
 * <call> = "call" <id> "(" [<expr> {"," <expr>}] ")"
 */
call
    : 'call' ID '(' ( expr ( ',' expr )* )? ')'
    ;

/**
 * <if> = "if" <expr> "then" <statements> {"elsif" <expr> "then" <statements>}
 * ["else" <statements>] "end"
 */
alan_if
    : 'if' expr 'then' statements ( 'elsif' expr 'then' statements )* ( 'else' statements )? 'end'
    ;

/**
 * <input> = "get" <id> ["[" <simple> "]"]
 */
input
    : 'get' ID ( '[' simple ']' )?
    ;

/**
 * <leave> = "leave" [<expr>]
 */
leave
    : 'leave' ( expr )?
    ;

/**
 * <output> = "put" (<string> | <expr>) {"." (<string> | <expr>)}
 */
output
    : 'put' ( ALAN_STRING | expr ) ( '.' ( ALAN_STRING | expr ) )* 
    ;

/**
 * <while> = "while" <expr> "do" <statements> "end"
 */
alan_while
    : 'while' expr 'do' statements 'end'
    ;

/**
 * <expr> = <simple> [<relop> <simple>]
 */
expr
    : simple ( relop simple )?
    ;

/**
 * <relop> = "=" | ">=" | ">" | "<=" | "<" | "<>"
 */
relop
    : '=' | '>=' | '>' | '<=' | '<' | '<>'
    ;

/**
 * <simple> = ["-"] <term> {<addop> <term>}
 */
simple
    : ('-')? term ( addop term )*
    ;

/**
 * <addop> = "-" | "or" | "+"
 */
addop
    : '-' | 'or' | '+'
    ;

/**
 * <term> = <factor> {<mulop> <factor>}
 */
term
    : factor ( mulop factor )*
    ;

/**
 * <mulop> = "and" | "/" | "*" | "rem"
 */
mulop
    : 'and' | '/' | '*' | 'rem'
    ;

/**
 * <factor> = <id> ["[" simple "]" | "(" [<expr> {"," <expr>}] ")"] | <num> |
 * "(" <expr> ")" | "not" <factor> | "true" | "false"
 */
factor
    : ID ( '[' simple ']' | '(' ( expr ( ',' expr )* )? ')' )? | NUM | '(' expr ')' |
      'not' factor | 'true' | 'false'
    ;

/**
 * <string> = """ {<printable ASCII>} """
 */
ALAN_STRING
    : '"' ( PRINTABLE )* '"'
    ;

/**
 * <id> = <letter> {<letter> | <digit>}
 */
ID  
    : LETTER ( LETTER | DIGIT )* 
    ;

/**
 * <num> = <digit> {<digit>}
 */
NUM 
    : DIGIT ( DIGIT )* 
    ;

/**
 * <comment> = "{" . [comment] . "}"
 */
COMMENT
    : '{' ( COMMENT | . )*? '}' -> skip
    ;

fragment LETTER
    : ('a' .. 'z') | ('A' .. 'Z') | '_' 
    ;

fragment DIGIT   
    : ('0' .. '9') 
    ;

fragment PRINTABLE
    : ('\u0020' .. '\u007e')
    ;

WS      
    : [ \t\r\n]+ -> skip 
    ;