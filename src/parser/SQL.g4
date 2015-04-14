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
    | setStmt ';';


dropSchema: 'DROP' ('DATABASE' | 'SCHEMA') ('IF' 'EXISTS')? idName;

createSchema: 'CREATE' ('DATABASE' | 'SCHEMA') ('IF' 'NOT' 'EXISTS')? idName
    createSpecification*;

createSpecification:
    'DEFAULT'? 'CHARACTER' 'SET' '='? charsetName
  | 'DEFAULT'? 'COLLATE' '='? collateName
  | 'COMMENT' '=' tableComment;

tableComment: STRING;

setStmt: 'SET' (setOption ',')* setOption;

setOption: '@'* NAME '=' (setDefaultValue | ('@'* NAME));
setDefaultValue: defaultValue;
useStmt: 'USE' idName;
dropTable: 'DROP' 'TEMPORARY'? 'TABLE' ('IF' 'EXISTS')?
    dropTableName (',' dropTableName)*  ('RESTRICT' | 'CASCADE')?;

dropTableName:idName;

createTable: 'CREATE' 'TEMPORARY'? 'TABLE' ('IF' 'NOT' 'EXISTS')? tableName
           '(' (createDefinition ',')* createDefinition ')' tableOptions;

tableName: idName;

createDefinition: columnName columnDefinition #fieldStmt
    | ('CONSTRAINT' constraintName?)? 'PRIMARY' 'KEY' '(' (indexColName ',')* indexColName ')' #primaryKeyStmt
    | ('INDEX'|'KEY') constraintName? '(' (indexColName ',')* indexColName ')' #indexStmt
    | ('CONSTRAINT' constraintName?)? 'UNIQUE' ('INDEX'|'KEY')?
        constraintTable? '(' (indexColName ',')* indexColName ')' #uniqueStmt
    | ('CONSTRAINT' constraintName?)? 'FOREIGN' 'KEY'
        constraintTable? '(' (indexColName ',')* indexColName ')' referenceDefinition #foreignStmt
    ;

columnName:idName;
constraintName:idName;
constraintTable:idName;

columnDefinition:
    dataType (defaultNull|defaultNotNull)? ('DEFAULT' columnDefaultValue)?
      autoIncrement? (('UNIQUE' 'KEY'?) | ('PRIMARY'? 'KEY'))?
      ('COMMENT' fieldComment)?;

autoIncrement: 'AUTO_INCREMENT';
columnDefaultValue: defaultValue;
defaultNull: 'NULL';
defaultNotNull: 'NOT' 'NULL';
fieldComment: STRING;

referenceDefinition:
      'REFERENCES' referenceTable '(' (indexColName ',')* indexColName ')'
      ('ON' 'DELETE' referenceOption)?
      ('ON' 'UPDATE' referenceOption)?;

referenceTable:idName;

indexColName:
    idName Type=('ASC' | 'DESC')?;

dataType:
    'BIT' ( '(' INT ')' )? #typeBitStmt
  | 'TINYINT' ( '(' INT ')' )? 'UNSIGNED'? 'ZEROFILL'? #typeTinyIntStmt
  | 'SMALLINT' ( '(' INT ')' )? 'UNSIGNED'? 'ZEROFILL'? #typeSmallIntStmt
  | 'MEDIUMINT' ( '(' INT ')' )? 'UNSIGNED'? 'ZEROFILL'? #typeMediumIntStmt
  | 'INT' ( '(' INT ')' )? 'UNSIGNED'? 'ZEROFILL'? #typeIntStmt
  | 'INTEGER' ( '(' INT ')' )? 'UNSIGNED'? 'ZEROFILL'? #typeIntegerStmt
  | 'BIGINT' ( '(' INT ')' )? 'UNSIGNED'? 'ZEROFILL'? #typeBigIntStmt
  | 'REAL'( '(' INT ',' INT  ')' )? 'UNSIGNED'? 'ZEROFILL'? #typeRealStmt
  | 'DOUBLE'( '(' INT ',' INT  ')' )? 'UNSIGNED'? 'ZEROFILL'? #typeDoubleStmt
  | 'FLOAT' ( '(' INT ',' INT  ')' )? 'UNSIGNED'? 'ZEROFILL'? #typeFloatStmt
  | 'DECIMAL'( '(' INT (',' INT)?  ')' )? 'UNSIGNED'? 'ZEROFILL'? #typeDecimalStmt
  | 'NUMERIC'( '(' INT (',' INT)?  ')' )? 'UNSIGNED'? 'ZEROFILL'? #typeNumericStmt
  | 'DATE' #typeDateStmt
  | 'TIME' #typeTimeStmt
  | 'TIMESTAMP' #typeTimeStampStmt
  | 'DATETIME' #typeDateTimeStmt
  | 'YEAR' #typeYearStmt
  | 'CHAR' ( '(' INT ')' )?
      ('CHARACTER' 'SET' charsetName)? ('COLLATE' collateName)? #typeCharStmt
  | 'VARCHAR' '(' INT ')'
      ('CHARACTER' 'SET' charsetName)? ('COLLATE' collateName)? #typeVarCharStmt
  | 'BINARY' ( '(' INT ')' )? #typeBinaryStmt
  | 'VARBINARY' '(' INT ')' #typeVarBinaryStmt
  | 'TINYBLOB' #typeTinyBlobStmt
  | 'BLOB' #typeBlobStmt
  | 'MEDIUMBLOB' #typeMediumBlobStmt
  | 'LONGBLOB' #typeLongBlobStmt
  | 'TINYTEXT' 'BINARY'?
      ('CHARACTER' 'SET' charsetName)? ('COLLATE' collateName)? #typeTinyTextStmt
  | 'TEXT' 'BINARY'?
      ('CHARACTER' 'SET' charsetName)? ('COLLATE' collateName)? #typeTextStmt
  | 'MEDIUMTEXT' 'BINARY'?
      ('CHARACTER' 'SET' charsetName)? ('COLLATE' collateName)? #typeMediumTextStmt
  | 'LONGTEXT' 'BINARY'?
      ('CHARACTER' 'SET' charsetName)? ('COLLATE' collateName)? #typeLongTextStmt
  | 'ENUM' '(' (stringItem ',')* stringItem ')'
      ('CHARACTER' 'SET' charsetName)? ('COLLATE' collateName)? #typeEnumStmt
  | 'SET' '(' (stringItem ',')* stringItem ')'
      ('CHARACTER' 'SET' charsetName)? ('COLLATE' collateName)? #typeSetStmt;

stringItem: STRING;
charsetName: idName;
collateName: idName;

referenceOption:
   'RESTRICT' | 'CASCADE' | ('SET' 'NULL') | ('NO' 'ACTION');

defaultValue: INT | STRING | FLOAT | 'NULL';
tableOptions: option*;

option: NAME '=' NAME | createSpecification;

idName: '`' NAME '`'
      | '\'' NAME '\''
      | '"' NAME '"'
      | NAME;

NAME: [A-Za-z_][0-9A-Za-z_]*;
INT: [0-9]+;
FLOAT: [0-9]* '.' [0-9]+;
STRING: ('\'' (~('\'' | '\\') | '\\' ('\'' | '"' | '\\' | 'r' | 'n' | 't'))* '\'') | ('"' (~('"' | '\\') | '\\' ('\'' | '"' | '\\' | 'r' | 'n'))* '"');


/* comentários, espaços e final de linha */
COMMENT: '/*' .*? '*/' -> skip;
SINGLE_COMMENT: '--' ~[\r\n]* -> skip;
WS: [\t\r\n ]+ -> skip;