/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

lexer grammar SQLLexer;


BOOL: K_FALSE | K_TRUE;

K_DROP:  D R O P;
K_DATABASE: D A T A B A S E;
K_SCHEMA: S C H E M A;
K_IF: I F;
K_EXISTS: E X I S T S;
K_NOT: N O T;
K_DEFAULT: D E F A U L T;
K_CHARACTER: C H A R A C T E R;
K_SET: S E T;
K_COLLATE: C O L L A T E;
K_USE: U S E;
K_TEMPORARY: T E M P O R A R Y;
K_TABLE: T A B L E;
K_RESTRICT: R E S T R I C T;
K_CASCADE: C A S C A D E;
K_CONSTRAINT: C O N S T R A I N T;
K_PRIMARY: P R I M A R Y;
K_KEY: K E Y;
K_INDEX: I N D E X;
K_UNIQUE: U N I Q U E;
K_FULLTEXT: F U L L T E X T;
K_FOREIGN: F O R E I G N;
K_COMMENT: C O M M E N T;
K_AUTO_INCREMENT: A U T O'_'I N C R E M E N T;
K_NULL: N U L L;
K_CURRENT_TIMESTAMP: C U R R E N T'_'T I M E S T A M P;
K_REFERENCES: R E F E R E N C E S;
K_ON: O N;
K_DELETE: D E L E T E;
K_UPDATE: U P D A T E;
K_ASC: A S C;
K_DESC: D E S C;
K_BIT: B I T;
K_TINYINT: T I N Y I N T;
K_UNSIGNED: U N S I G N E D;
K_BINARY: B I N A R Y;
K_ZEROFILL: Z E R O F I L L;
K_SMALLINT: S M A L L I N T;
K_MEDIUMINT: M E D I U M I N T;
K_INT: I N T;
K_INTEGER: I N T E G E R;
K_BIGINT: B I G I N T;
K_REAL: R E A L;
K_DOUBLE: D O U B L E;
K_FLOAT: F L O A T;
K_DECIMAL: D E C I M A L;
K_NUMERIC: N U M E R I C;
K_BOOL: B O O L;
K_BOOLEAN: B O O L E A N;
K_DATE: D A T E;
K_TIME: T I M E;
K_TIMESTAMP: T I M E S T A M P;
K_DATETIME: D A T E T I M E;
K_YEAR: Y E A R;
K_CHAR: C H A R;
K_VARCHAR: V A R C H A R;
K_VARBINARY: V A R B I N A R Y;
K_TINYBLOB: T I N Y B L O B;
K_BLOB: B L O B;
K_MEDIUMBLOB: M E D I U M B L O B;
K_LONGBLOB: L O N G B L O B;
K_JSON: J S O N;
K_TINYTEXT: T I N Y T E X T;
K_TEXT: T E X T;
K_MEDIUMTEXT: M E D I U M T E X T;
K_LONGTEXT: L O N G T E X T;
K_ENUM: E N U M;
K_NO: N O;
K_ACTION: A C T I O N;
K_CREATE: C R E A T E;
K_FALSE: F A L S E;
K_TRUE: T R U E;

DOT: '.';
EQ: '=';
SINGLE_QUOTE: '\'';
DOUBLE_QUOTE: '"';
BACK_QUOTE: '`';
AT: '@';
COMMA: ',';
SEMICOLON: ';';

LPAR: '(';
RPAR: ')';

ID: '`' NAME '`';
NAME: [A-Za-z_][0-9A-Za-z_.]*;
INT: [0-9]+;
FLOAT: [0-9]* '.' [0-9]+;
STRING:
    ('\'' (~('\'' | '\\') | '\\' ('\'' | '"' | '\\' | 'r' | 'n' | 't'))* '\'')
    | ('"' (~('"' | '\\') | '\\' ('\'' | '"' | '\\' | 'r' | 'n'))* '"');

/* comments, spaces and line ending */
COMMENT: '/*' .*? ( '*/' | EOF ) -> skip;
SINGLE_COMMENT: '--' ~[\r\n]* -> skip;
WS: [\t\r\n ]+ -> skip;

fragment A : [aA];
fragment B : [bB];
fragment C : [cC];
fragment D : [dD];
fragment E : [eE];
fragment F : [fF];
fragment G : [gG];
fragment H : [hH];
fragment I : [iI];
fragment J : [jJ];
fragment K : [kK];
fragment L : [lL];
fragment M : [mM];
fragment N : [nN];
fragment O : [oO];
fragment P : [pP];
fragment Q : [qQ];
fragment R : [rR];
fragment S : [sS];
fragment T : [tT];
fragment U : [uU];
fragment V : [vV];
fragment W : [wW];
fragment X : [xX];
fragment Y : [yY];
fragment Z : [zZ];


