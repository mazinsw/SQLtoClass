/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar SQL;

script: stmt*;

stmt:  createSchema ';'
    | dropSchema ';'
    | createTable ';'
    | dropTable ';'
    | useStmt ';'
    | setStmt ';'
    | ';' ;


dropSchema: K_DROP (K_DATABASE | K_SCHEMA) (K_IF K_EXISTS)? idName;

createSchema: K_CREATE (K_DATABASE | K_SCHEMA) (K_IF K_NOT K_EXISTS)? idName
    createSpecification*;

createSpecification:
    K_DEFAULT? K_CHARACTER K_SET '='? charsetName
  | K_DEFAULT? K_COLLATE '='? collateName
  | K_COMMENT '=' tableComment;

tableComment: STRING;

setStmt: K_SET (setOption ',')* setOption;

setOption: '@'* NAME '=' (setDefaultValue | ('@'* NAME));
setDefaultValue: defaultValue;
useStmt: K_USE idName;
dropTable: K_DROP K_TEMPORARY? K_TABLE (K_IF K_EXISTS)?
    dropTableName (',' dropTableName)*  (K_RESTRICT | K_CASCADE)?;

dropTableName: idName;

createTable: K_CREATE K_TEMPORARY? K_TABLE (K_IF K_NOT K_EXISTS)? tableName
           '(' fieldList? ')' tableOptions;

tableName: idName;

fieldList: (createDefinition ',')* createDefinition;

createDefinition: columnName columnDefinition #fieldStmt
    | (K_CONSTRAINT constraintName?)? K_PRIMARY K_KEY '(' (indexColName ',')* indexColName ')' #primaryKeyStmt
    | (K_INDEX|K_KEY) constraintName? '(' (indexColName ',')* indexColName ')' #indexStmt
    | (K_CONSTRAINT constraintName?)? K_UNIQUE (K_INDEX|K_KEY)?
        constraintTable? '(' (indexColName ',')* indexColName ')' #uniqueStmt
    | (K_CONSTRAINT constraintName?)? K_FOREIGN K_KEY
        constraintTable? '(' (indexColName ',')* indexColName ')' referenceDefinition #foreignStmt
    ;

columnName: idName;
constraintName: idName;
constraintTable: idName;

columnDefinition:
    dataType (columnNull|columnNotNull)? (K_DEFAULT columnDefaultValue)?
      autoIncrement? ((K_UNIQUE K_KEY?) | (K_PRIMARY? K_KEY))?
      (K_COMMENT fieldComment)?;

autoIncrement: K_AUTO_INCREMENT;
columnDefaultValue: defaultValue;
columnNull: K_NULL;
columnNotNull: K_NOT K_NULL;
fieldComment: STRING;

referenceDefinition:
      K_REFERENCES referenceTable '(' (indexColName ',')* indexColName ')'
      (K_ON K_DELETE referenceDeleteOption)?
      (K_ON K_UPDATE referenceUpdateOption)?;

referenceDeleteOption: referenceOption;
referenceUpdateOption: referenceOption;

referenceTable: idName;

indexColName:
    idName Type=(K_ASC | K_DESC)?;

dataType:
    K_BIT ( '(' INT ')' )? #typeBitStmt
  | K_TINYINT ( '(' INT ')' )? K_UNSIGNED? K_ZEROFILL? #typeTinyIntStmt
  | K_SMALLINT ( '(' INT ')' )? K_UNSIGNED? K_ZEROFILL? #typeSmallIntStmt
  | K_MEDIUMINT ( '(' INT ')' )? K_UNSIGNED? K_ZEROFILL? #typeMediumIntStmt
  | K_INT ( '(' INT ')' )? K_UNSIGNED? K_ZEROFILL? #typeIntStmt
  | K_INTEGER ( '(' INT ')' )? K_UNSIGNED? K_ZEROFILL? #typeIntegerStmt
  | K_BIGINT ( '(' INT ')' )? K_UNSIGNED? K_ZEROFILL? #typeBigIntStmt
  | K_REAL( '(' INT ',' INT  ')' )? K_UNSIGNED? K_ZEROFILL? #typeRealStmt
  | K_DOUBLE( '(' INT ',' INT  ')' )? K_UNSIGNED? K_ZEROFILL? #typeDoubleStmt
  | K_FLOAT ( '(' INT ',' INT  ')' )? K_UNSIGNED? K_ZEROFILL? #typeFloatStmt
  | K_DECIMAL( '(' INT (',' INT)?  ')' )? K_UNSIGNED? K_ZEROFILL? #typeDecimalStmt
  | K_NUMERIC( '(' INT (',' INT)?  ')' )? K_UNSIGNED? K_ZEROFILL? #typeNumericStmt
  | (K_BOOL | K_BOOLEAN) #typeBooleanStmt
  | K_DATE #typeDateStmt
  | K_TIME #typeTimeStmt
  | K_TIMESTAMP #typeTimeStampStmt
  | K_DATETIME #typeDateTimeStmt
  | K_YEAR #typeYearStmt
  | K_CHAR ( '(' INT ')' )?
      (K_CHARACTER K_SET charsetName)? (K_COLLATE collateName)? #typeCharStmt
  | K_VARCHAR '(' INT ')'
      (K_CHARACTER K_SET charsetName)? (K_COLLATE collateName)? #typeVarCharStmt
  | K_BINARY ( '(' INT ')' )? #typeBinaryStmt
  | K_VARBINARY '(' INT ')' #typeVarBinaryStmt
  | K_TINYBLOB #typeTinyBlobStmt
  | K_BLOB #typeBlobStmt
  | K_MEDIUMBLOB #typeMediumBlobStmt
  | K_LONGBLOB #typeLongBlobStmt
  | K_TINYTEXT K_BINARY?
      (K_CHARACTER K_SET charsetName)? (K_COLLATE collateName)? #typeTinyTextStmt
  | K_TEXT K_BINARY?
      (K_CHARACTER K_SET charsetName)? (K_COLLATE collateName)? #typeTextStmt
  | K_MEDIUMTEXT K_BINARY?
      (K_CHARACTER K_SET charsetName)? (K_COLLATE collateName)? #typeMediumTextStmt
  | K_LONGTEXT K_BINARY?
      (K_CHARACTER K_SET charsetName)? (K_COLLATE collateName)? #typeLongTextStmt
  | K_ENUM '(' (stringItem ',')* stringItem ')'
      (K_CHARACTER K_SET charsetName)? (K_COLLATE collateName)? #typeEnumStmt
  | K_SET '(' (stringItem ',')* stringItem ')'
      (K_CHARACTER K_SET charsetName)? (K_COLLATE collateName)? #typeSetStmt;

stringItem: STRING;
charsetName: idName;
collateName: idName;

referenceOption:
   K_RESTRICT | K_CASCADE | (K_SET K_NULL) | (K_NO K_ACTION);

BOOL: K_FALSE | K_TRUE;

defaultValue: INT | STRING | FLOAT | BOOL | K_NULL;
tableOptions: option*;

option: NAME '=' NAME | createSpecification;

idName: '`' NAME '`'
      | '\'' NAME '\''
      | '"' NAME '"'
      | NAME;

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
K_FOREIGN: F O R E I G N;
K_COMMENT: C O M M E N T;
K_AUTO_INCREMENT: A U T O'_'I N C R E M E N T;
K_NULL: N U L L;
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

NAME: [A-Za-z_][0-9A-Za-z_.]*;
INT: [0-9]+;
FLOAT: [0-9]* '.' [0-9]+;
STRING: ('\'' (~('\'' | '\\') | '\\' ('\'' | '"' | '\\' | 'r' | 'n' | 't'))* '\'') | ('"' (~('"' | '\\') | '\\' ('\'' | '"' | '\\' | 'r' | 'n'))* '"');

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


