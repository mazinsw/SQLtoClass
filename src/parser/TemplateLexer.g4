/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

lexer grammar TemplateLexer;

OPEN: '[' -> pushMode(INSIDE) ;

K_ALL: A L L;
K_ARRAY: A R R A Y;
K_BIGINT: B I G I N T;
K_BLOB: B L O B;
K_BOOLEAN: B O O L E A N;
K_CHARS: C H A R S;
K_COMMENT: C O M M E N T;
K_CONSTRAINT: C O N S T R A I N T;
K_CONTAINS: C O N T A I N S;
K_COUNT: C O U N T;
K_CURRENCY: C U R R E N C Y;
K_DATE: D A T E;
K_DATETIME: D A T E T I M E;
K_DEFAULT: D E F A U L T;
K_DESCRIPTION: D E S C R I P T I O N;
K_DESCRIPTOR: D E S C R I P T O R;
K_DOUBLE: D O U B L E;
K_EACH: E A C H;
K_END: E N D;
K_ENUM: E N U M;
K_EXISTS: E X I S T S;
K_FIELD: F I E L D;
K_FLOAT: F L O A T;
K_FOLDER: F O L D E R;
K_FOREIGN: F O R E I G N;
K_GENDER: G E N D E R;
K_HEIGHT: H E I G H T;
K_HIGH: H I G H;
K_IF: I F;
K_IMAGE: I M A G E;
K_INDEX: I N D E X;
K_INFO: I N F O;
K_INHERITED: I N H E R I T E D;
K_INTEGER: I N T E G E R;
K_LENGTH: L E N G T H;
K_LETTER: L E T T E R;
K_LOW: L O W;
K_MASK: M A S K;
K_MASKED: M A S K E D;
K_MATCH: M A T C H;
K_NAME: N A M E;
K_NORM: N O R M;
K_NULL: N U L L;
K_NUMBER: N U M B E R;
K_OPTION: O P T I O N;
K_PACKAGE: P A C K A G E;
K_PATH: P A T H;
K_PLURAL: P L U R A L;
K_PRIMARY: P R I M A R Y;
K_RADIO: R A D I O;
K_REFERENCE: R E F E R E N C E;
K_REPEATED: R E P E A T E D;
K_SEARCHABLE: S E A R C H A B L E;
K_SINGULAR: S I N G U L A R;
K_SIZE: S I Z E;
K_STRING: S T R I N G;
K_STYLE: S T Y L E;
K_TABLE: T A B L E;
K_TEXT: T E X T;
K_TIME: T I M E;
K_UNIQUE: U N I Q U E;
K_UNIX: U N I X;
K_WIDTH: W I D T H;

TEXT: ~('[' | ']')+;

mode INSIDE;

CLOSE: ']' -> popMode ;

DOT: '.';

LPAR: '(';
RPAR: ')';

CHARS: [A-Za-z0-9_]+;
REGEXS: ~[()]+;

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
