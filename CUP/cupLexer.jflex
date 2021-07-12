package CUP;

import java_cup.runtime.*;

%%

%class cupLexer
%public
%unicode
%cup
%line
%column

%{
    private Symbol symbol(int type) {
        return new Symbol(type, yyline, yycolumn);
    }
    private Symbol symbol(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
    }

    StringBuffer string = new StringBuffer();
%}


WhiteSpace = [\t\n ]

LET = [a-zA-Z_]
DIGIT = [0-9]
ID = {LET}({LET}|{DIGIT})*

%state COMMENT
%state LINECOMMENT
%state STRING

%%

<COMMENT> {
	"*/"					 { yybegin(YYINITIAL); }
	[^]						 { }
}

<LINECOMMENT> {
	\n 						 { yybegin(YYINITIAL); }
	[^]						 { }
}

<STRING> {
    ":}"              		 { yybegin(YYINITIAL);
                      		   return symbol(sym.CODE_STRING, string.toString()); 
                    		 }
    [^]			    		 { string.append( yytext() ); }
}

<YYINITIAL> {
	"{:"					 { string.setLength(0); 
							   yybegin(STRING); 
                    		 }
	"/*"					 { yybegin(COMMENT); }
	"//"					 { yybegin(LINECOMMENT); }
	"package"           	 { return symbol(sym.PACKAGE); }
	";"                 	 { return symbol(sym.SEMI); }
	"import"            	 { return symbol(sym.IMPORT); }
	"action"            	 { return symbol(sym.ACTION); }
	"code"              	 { return symbol(sym.CODE); }
	"parser"            	 { return symbol(sym.PARSER); }
	"init"              	 { return symbol(sym.INIT); }
	"with"              	 { return symbol(sym.WITH); }
	"scan"              	 { return symbol(sym.SCAN); }
	"terminal"          	 { return symbol(sym.TERMINAL); }
	"nonterminal"          	 { return symbol(sym.NONTERMINAL); }
	"nonassoc"          	 { return symbol(sym.NONASSOC); }
	","                 	 { return symbol(sym.COMMA); }
	"precedence"        	 { return symbol(sym.PRECEDENCE); }
	"left"              	 { return symbol(sym.LEFT); }
	"right"              	 { return symbol(sym.RIGHT); }
	"start"             	 { return symbol(sym.START); }
	"::="               	 { return symbol(sym.CC_EQUALS); }
	"|"                 	 { return symbol(sym.BAR); }
	"%prec"             	 { return symbol(sym.PERCENT_PREC); }
	":"                 	 { return symbol(sym.COLON); }
	"."                 	 { return symbol(sym.DOT); }
	"*"                 	 { return symbol(sym.STAR); }
	{ID}           			 { return symbol(sym.ID, new String(yytext())); }

	{WhiteSpace}    		 { }
    <<EOF>>         		 { return symbol(sym.EOF); }
}

[^]             			 { throw new Error("Illegal character <" + yytext() + "> at [" 
								+ yyline + ":" + yycolumn + "]"); }
