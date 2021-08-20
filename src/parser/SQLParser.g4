/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

parser grammar SQLParser;

options { tokenVocab=SQLLexer; }

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
  | K_JSON #typeJsonStmt
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

defaultValue: INT | STRING | FLOAT | BOOL | K_NULL;
tableOptions: option*;

option: NAME '=' NAME | createSpecification;

idName: ID
      | '\'' NAME '\''
      | '"' NAME '"'
      | NAME;
