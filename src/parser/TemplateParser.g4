/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

parser grammar TemplateParser;

options { tokenVocab=TemplateLexer; }

template: statement* EOF;

statement:
    block
  | constant
  | TEXT
  ;

block:
    tableIfStmt
  | tableExistsStmt
  | tableEachStmt
  | inheritedIfStmt
  | inheritedExistsStmt
  | inheritedEachStmt
  | referenceIfStmt
  | referenceExistsStmt
  | referenceEachStmt
  | fieldIfStmt
  | fieldEachStmt
  | fieldMatchStmt
  | fieldContainsStmt
  | descriptorIfStmt
  | descriptorEachStmt
  | descriptorMatchStmt
  | descriptorContainsStmt
  | indexEachStmt
  | uniqueEachStmt
  | primaryEachStmt
  | constraintEachStmt
  | foreignEachStmt
  ;

tableIfStmt: OPEN K_TABLE '.' K_IF '(' condition ')' CLOSE statement* OPEN K_TABLE '.' K_END CLOSE;
tableExistsStmt: OPEN K_TABLE '.' K_EXISTS '(' condition ')' CLOSE statement* OPEN K_TABLE '.' K_END CLOSE;
tableEachStmt: OPEN K_TABLE '.' K_EACH ( '(' condition ')' )? CLOSE statement* OPEN K_TABLE '.' K_END CLOSE;

inheritedIfStmt: OPEN K_INHERITED '.' K_IF '(' condition ')' CLOSE statement* OPEN K_INHERITED '.' K_END CLOSE;
inheritedExistsStmt: OPEN K_INHERITED '.' K_EXISTS '(' condition ')' CLOSE statement* OPEN K_INHERITED '.' K_END CLOSE;
inheritedEachStmt: OPEN K_INHERITED '.' K_EACH ( '(' condition ')' )? CLOSE statement* OPEN K_INHERITED '.' K_END CLOSE;

referenceIfStmt: OPEN K_REFERENCE '.' K_IF '(' condition ')' CLOSE statement* OPEN K_REFERENCE '.' K_END CLOSE;
referenceExistsStmt: OPEN K_REFERENCE '.' K_EXISTS '(' condition ')' CLOSE statement* OPEN K_REFERENCE '.' K_END CLOSE;
referenceEachStmt: OPEN K_REFERENCE '.' K_EACH ( '(' condition ')' )? CLOSE statement* OPEN K_REFERENCE '.' K_END CLOSE;

fieldIfStmt: OPEN K_FIELD '.' K_IF '(' condition ')' CLOSE statement* OPEN K_FIELD '.' K_END CLOSE;
fieldEachStmt: OPEN K_FIELD '.' K_EACH ( '(' condition ')' )? CLOSE statement* OPEN K_FIELD '.' K_END CLOSE;
fieldMatchStmt: OPEN K_FIELD '.' K_MATCH '(' regex ')' CLOSE statement* OPEN K_FIELD '.' K_END CLOSE;
fieldContainsStmt: OPEN K_FIELD '.' K_CONTAINS '(' word ')' CLOSE statement* OPEN K_FIELD '.' K_END CLOSE;

descriptorIfStmt: OPEN K_DESCRIPTOR '.' K_IF '(' condition ')' CLOSE statement* OPEN K_DESCRIPTOR '.' K_END CLOSE;
descriptorEachStmt: OPEN K_DESCRIPTOR '.' K_EACH ( '(' condition ')' )? CLOSE statement* OPEN K_DESCRIPTOR '.' K_END CLOSE;
descriptorMatchStmt: OPEN K_DESCRIPTOR '.' K_MATCH '(' regex ')' CLOSE statement* OPEN K_DESCRIPTOR '.' K_END CLOSE;
descriptorContainsStmt: OPEN K_DESCRIPTOR '.' K_CONTAINS '(' word ')' CLOSE statement* OPEN K_DESCRIPTOR '.' K_END CLOSE;

indexEachStmt: OPEN K_INDEX '.' K_EACH ( '(' condition ')' )? CLOSE statement* OPEN K_INDEX '.' K_END CLOSE;

uniqueEachStmt: OPEN K_UNIQUE '.' K_EACH ( '(' condition ')' )? CLOSE statement* OPEN K_UNIQUE '.' K_END CLOSE;

primaryEachStmt: OPEN K_PRIMARY '.' K_EACH ( '(' condition ')' )? CLOSE statement* OPEN K_PRIMARY '.' K_END CLOSE;

constraintEachStmt: OPEN K_CONSTRAINT '.' K_EACH ( '(' condition ')' )? CLOSE statement* OPEN K_CONSTRAINT '.' K_END CLOSE;

foreignEachStmt: OPEN K_FOREIGN '.' K_EACH ( '(' condition ')' )? CLOSE statement* OPEN K_FOREIGN '.' K_END CLOSE;

constant:
    tableStmt
  | fieldStmt
  | indexNameStmt
  | uniqueNameStmt
  | primaryNameStmt
  | constraintNameStmt
  | foreignNameStmt
  ;

tableStmt: OPEN tableLevel tableProps* CLOSE;
tableProps: '.' tableProp;
tableProp:
    K_UNIX
  | K_PLURAL
  | K_NORM
  | K_DEFAULT
  | K_NAME
  | K_COMMENT
  | K_GENDER
  | K_CHARS
  | K_LETTER
  | K_PACKAGE
  | K_INHERITED
  | K_PATH
  | K_STYLE
  ;

fieldStmt: OPEN fieldLevel fieldProps* CLOSE;
fieldProps: '.' fieldProp;
fieldProp: 
    K_NAME
  | K_UNIX
  | K_NORM
  | K_SINGULAR
  | K_INFO
  | K_COMMENT
  | K_MASK
  | K_STYLE
  | K_GENDER
  | K_CHARS
  | K_LETTER
  | K_ARRAY
  | K_COUNT
  | K_INDEX
  | K_NUMBER
  | K_SIZE
  | K_LENGTH
  | K_OPTION
  | K_IMAGE
  | K_LOW
  | K_HIGH
  | K_WIDTH
  | K_HEIGHT
  | K_FOLDER
  | K_DEFAULT
  ;

indexNameStmt: OPEN K_INDEX '.' K_NAME CLOSE;

uniqueNameStmt: OPEN K_UNIQUE '.' K_NAME CLOSE;

primaryNameStmt: OPEN K_PRIMARY '.' K_NAME CLOSE;

constraintNameStmt: OPEN K_CONSTRAINT '.' K_NAME CLOSE;

foreignNameStmt: OPEN K_FOREIGN '.' K_NAME CLOSE;

tableLevel: K_TABLE | K_INHERITED | K_REFERENCE;

fieldLevel: K_FIELD | K_DESCRIPTOR | K_OPTION | K_IMAGE;

regex: REGEXS;
word: CHARS;
condition: attribute | property | type;

attribute:
    K_COMMENT
  | K_INHERITED
  | K_PACKAGE
  | K_PATH
  ;

property:
    K_ALL
  | K_REFERENCE
  | K_PRIMARY
  | K_REPEATED
  | K_NULL
  | K_DEFAULT
  | K_INFO
  | K_DESCRIPTOR
  | K_SEARCHABLE
  | K_DESCRIPTION
  | K_INDEX
  | K_CONSTRAINT
  | K_FOREIGN
  | K_UNIQUE
  | K_RADIO
  | K_MASKED
  | K_ARRAY
  | K_IMAGE
  | K_OPTION
  ;

type:
    K_INTEGER
  | K_BIGINT
  | K_STRING
  | K_TEXT
  | K_BOOLEAN
  | K_CURRENCY
  | K_DOUBLE
  | K_FLOAT
  | K_DATE
  | K_DATETIME
  | K_TIME
  | K_ENUM
  | K_BLOB
  ;
