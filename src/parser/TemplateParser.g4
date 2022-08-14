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
  | text
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
  | fieldExistsStmt
  | fieldEachStmt
  | fieldMatchStmt
  | fieldContainsStmt
  | descriptorIfStmt
  | descriptorEachStmt
  | descriptorMatchStmt
  | descriptorContainsStmt
  | indexIfStmt
  | indexEachStmt
  | uniqueIfStmt
  | uniqueEachStmt
  | primaryIfStmt
  | primaryEachStmt
  | constraintIfStmt
  | constraintEachStmt
  | foreignIfStmt
  | foreignEachStmt
  ;

/** Table */
tableIfStmt: OPEN K_TABLE '.' K_IF LPAR tableCondition RPAR CLOSE statement* tableElseStmt? OPEN K_TABLE '.' K_END CLOSE;
tableExistsStmt: OPEN K_TABLE '.' K_EXISTS LPAR tableCondition RPAR CLOSE statement* tableElseStmt? OPEN K_TABLE '.' K_END CLOSE;
tableEachStmt: OPEN K_TABLE '.' K_EACH ( LPAR tableCondition RPAR )? CLOSE statement* OPEN K_TABLE '.' K_END CLOSE;

tableElseIfStmt: OPEN K_TABLE '.' K_ELSE '.' K_IF LPAR tableCondition RPAR CLOSE statement*;
tableElseExistsStmt: OPEN K_TABLE '.' K_ELSE '.' K_EXISTS LPAR tableCondition RPAR CLOSE statement*;
tableElseEachStmt: OPEN K_TABLE '.' K_ELSE '.' K_EACH ( LPAR tableCondition RPAR )? CLOSE statement*;
tableElseEndStmt: OPEN K_TABLE '.' K_ELSE CLOSE statement*;

tableElseStmt: (tableElseCondEndStmt | tableElseEachStmt | tableElseEndStmt);
tableElseCondEndStmt: tableElseCondStmt+ (tableElseEachStmt | tableElseEndStmt)?;
tableElseCondStmt: tableElseIfStmt | tableElseExistsStmt;

/** Inherited */
inheritedIfStmt: OPEN K_INHERITED '.' K_IF LPAR tableCondition RPAR CLOSE statement* inheritedElseStmt? OPEN K_INHERITED '.' K_END CLOSE;
inheritedExistsStmt: OPEN K_INHERITED '.' K_EXISTS LPAR tableCondition RPAR CLOSE statement* inheritedElseStmt? OPEN K_INHERITED '.' K_END CLOSE;
inheritedEachStmt: OPEN K_INHERITED '.' K_EACH ( LPAR tableCondition RPAR )? CLOSE statement* OPEN K_INHERITED '.' K_END CLOSE;

inheritedElseIfStmt: OPEN K_INHERITED '.' K_ELSE '.' K_IF LPAR tableCondition RPAR CLOSE statement*;
inheritedElseExistsStmt: OPEN K_INHERITED '.' K_ELSE '.' K_EXISTS LPAR tableCondition RPAR CLOSE statement*;
inheritedElseEachStmt: OPEN K_INHERITED '.' K_ELSE '.' K_EACH ( LPAR tableCondition RPAR )? CLOSE statement*;
inheritedElseEndStmt: OPEN K_INHERITED '.' K_ELSE CLOSE statement*;

inheritedElseStmt: (inheritedElseCondEndStmt | inheritedElseEachStmt | inheritedElseEndStmt);
inheritedElseCondEndStmt: inheritedElseCondStmt+ (inheritedElseEachStmt | inheritedElseEndStmt)?;
inheritedElseCondStmt: inheritedElseIfStmt | inheritedElseExistsStmt;

/** Reference */
referenceIfStmt: OPEN K_REFERENCE '.' K_IF LPAR tableCondition RPAR CLOSE statement* referenceElseStmt? OPEN K_REFERENCE '.' K_END CLOSE;
referenceExistsStmt: OPEN K_REFERENCE '.' K_EXISTS LPAR tableCondition RPAR CLOSE statement* referenceElseStmt? OPEN K_REFERENCE '.' K_END CLOSE;
referenceEachStmt: OPEN K_REFERENCE '.' K_EACH ( LPAR tableCondition RPAR )? CLOSE statement* OPEN K_REFERENCE '.' K_END CLOSE;

referenceElseIfStmt: OPEN K_REFERENCE '.' K_ELSE '.' K_IF LPAR tableCondition RPAR CLOSE statement*;
referenceElseExistsStmt: OPEN K_REFERENCE '.' K_ELSE '.' K_EXISTS LPAR tableCondition RPAR CLOSE statement*;
referenceElseEachStmt: OPEN K_REFERENCE '.' K_ELSE '.' K_EACH ( LPAR tableCondition RPAR )? CLOSE statement*;
referenceElseEndStmt: OPEN K_REFERENCE '.' K_ELSE CLOSE statement*;

referenceElseStmt: (referenceElseCondEndStmt | referenceElseEachStmt | referenceElseEndStmt);
referenceElseCondEndStmt: referenceElseCondStmt+ (referenceElseEachStmt | referenceElseEndStmt)?;
referenceElseCondStmt: referenceElseIfStmt | referenceElseExistsStmt;

/** Field */
fieldIfStmt: OPEN K_FIELD '.' K_IF LPAR fieldCondition RPAR CLOSE statement* fieldElseStmt? OPEN K_FIELD '.' K_END CLOSE;
fieldExistsStmt: OPEN K_FIELD '.' K_EXISTS LPAR fieldCondition RPAR CLOSE statement* fieldElseStmt? OPEN K_FIELD '.' K_END CLOSE;
fieldMatchStmt: OPEN K_FIELD '.' MATCH_OPEN regex MATCH_CLOSE CLOSE statement* fieldElseStmt? OPEN K_FIELD '.' K_END CLOSE;
fieldContainsStmt: OPEN K_FIELD '.' K_CONTAINS LPAR word RPAR CLOSE statement* fieldElseStmt? OPEN K_FIELD '.' K_END CLOSE;
fieldEachStmt: OPEN K_FIELD '.' K_EACH ( LPAR fieldCondition RPAR )? CLOSE statement* OPEN K_FIELD '.' K_END CLOSE;

fieldElseIfStmt: OPEN K_FIELD '.' K_ELSE '.' K_IF LPAR fieldCondition RPAR CLOSE statement*;
fieldElseExistsStmt: OPEN K_FIELD '.' K_ELSE '.' K_EXISTS LPAR fieldCondition RPAR CLOSE statement*;
fieldElseMatchStmt: OPEN K_FIELD '.' K_ELSE '.' MATCH_OPEN regex MATCH_CLOSE CLOSE statement*;
fieldElseContainsStmt: OPEN K_FIELD '.' K_ELSE '.' K_CONTAINS LPAR word RPAR CLOSE statement*;
fieldElseEachStmt: OPEN K_FIELD '.' K_ELSE '.' K_EACH ( LPAR fieldCondition RPAR )? CLOSE statement*;
fieldElseEndStmt: OPEN K_FIELD '.' K_ELSE CLOSE statement*;

fieldElseStmt: (fieldElseEachStmt | fieldElseEndStmt | fieldElseCondEndStmt);
fieldElseCondEndStmt: fieldElseCondStmt+ (fieldElseEachStmt | fieldElseEndStmt)?;
fieldElseCondStmt: fieldElseIfStmt | fieldElseExistsStmt | fieldElseMatchStmt | fieldElseContainsStmt;

/** Descriptor */
descriptorIfStmt: OPEN K_DESCRIPTOR '.' K_IF LPAR fieldCondition RPAR CLOSE statement* descriptorElseStmt? OPEN K_DESCRIPTOR '.' K_END CLOSE;
descriptorMatchStmt: OPEN K_DESCRIPTOR '.' MATCH_OPEN regex MATCH_CLOSE CLOSE statement* descriptorElseStmt? OPEN K_DESCRIPTOR '.' K_END CLOSE;
descriptorContainsStmt: OPEN K_DESCRIPTOR '.' K_CONTAINS LPAR word RPAR CLOSE statement* descriptorElseStmt? OPEN K_DESCRIPTOR '.' K_END CLOSE;
descriptorEachStmt: OPEN K_DESCRIPTOR '.' K_EACH ( LPAR fieldCondition RPAR )? CLOSE statement* OPEN K_DESCRIPTOR '.' K_END CLOSE;

descriptorElseIfStmt: OPEN K_DESCRIPTOR '.' K_ELSE '.' K_IF LPAR fieldCondition RPAR CLOSE statement*;
descriptorElseMatchStmt: OPEN K_DESCRIPTOR '.' K_ELSE '.' MATCH_OPEN regex MATCH_CLOSE CLOSE statement*;
descriptorElseContainsStmt: OPEN K_DESCRIPTOR '.' K_ELSE '.' K_CONTAINS LPAR word RPAR CLOSE statement*;
descriptorElseEachStmt: OPEN K_DESCRIPTOR '.' K_ELSE '.' K_EACH ( LPAR fieldCondition RPAR )? CLOSE statement*;
descriptorElseEndStmt: OPEN K_DESCRIPTOR '.' K_ELSE CLOSE statement*;

descriptorElseStmt: (descriptorElseCondEndStmt | descriptorElseEachStmt | descriptorElseEndStmt);
descriptorElseCondEndStmt: descriptorElseCondStmt+ (descriptorElseEachStmt | descriptorElseEndStmt)?;
descriptorElseCondStmt: descriptorElseIfStmt | descriptorElseMatchStmt | descriptorElseContainsStmt;

/** Index */
indexIfStmt: OPEN K_INDEX '.' K_IF LPAR indexCondition RPAR CLOSE statement* indexElseStmt? OPEN K_INDEX '.' K_END CLOSE;
indexEachStmt: OPEN K_INDEX '.' K_EACH ( LPAR indexCondition RPAR )? CLOSE statement* OPEN K_INDEX '.' K_END CLOSE;

indexElseIfStmt: OPEN K_INDEX '.' K_ELSE '.' K_IF LPAR indexCondition RPAR CLOSE statement*;
indexElseEachStmt: OPEN K_INDEX '.' K_ELSE '.' K_EACH ( LPAR indexCondition RPAR )? CLOSE statement*;
indexElseEndStmt: OPEN K_INDEX '.' K_ELSE CLOSE statement*;

indexElseStmt: (indexElseCondEndStmt | indexElseEachStmt | indexElseEndStmt);
indexElseCondEndStmt: indexElseIfStmt+ (indexElseEachStmt | indexElseEndStmt)?;

/** Unique */
uniqueIfStmt: OPEN K_UNIQUE '.' K_IF LPAR indexCondition RPAR CLOSE statement* uniqueElseStmt? OPEN K_UNIQUE '.' K_END CLOSE;
uniqueEachStmt: OPEN K_UNIQUE '.' K_EACH ( LPAR indexCondition RPAR )? CLOSE statement* OPEN K_UNIQUE '.' K_END CLOSE;

uniqueElseIfStmt: OPEN K_UNIQUE '.' K_ELSE '.' K_IF LPAR indexCondition RPAR CLOSE statement*;
uniqueElseEachStmt: OPEN K_UNIQUE '.' K_ELSE '.' K_EACH ( LPAR indexCondition RPAR )? CLOSE statement*;
uniqueElseEndStmt: OPEN K_UNIQUE '.' K_ELSE CLOSE statement*;

uniqueElseStmt: (uniqueElseCondEndStmt | uniqueElseEachStmt | uniqueElseEndStmt);
uniqueElseCondEndStmt: uniqueElseIfStmt+ (uniqueElseEachStmt | uniqueElseEndStmt)?;

/** Primary */
primaryIfStmt: OPEN K_PRIMARY '.' K_IF LPAR indexCondition RPAR CLOSE statement* primaryElseStmt? OPEN K_PRIMARY '.' K_END CLOSE;
primaryEachStmt: OPEN K_PRIMARY '.' K_EACH ( LPAR indexCondition RPAR )? CLOSE statement* OPEN K_PRIMARY '.' K_END CLOSE;

primaryElseIfStmt: OPEN K_PRIMARY '.' K_ELSE '.' K_IF LPAR indexCondition RPAR CLOSE statement*;
primaryElseEachStmt: OPEN K_PRIMARY '.' K_ELSE '.' K_EACH ( LPAR indexCondition RPAR )? CLOSE statement*;
primaryElseEndStmt: OPEN K_PRIMARY '.' K_ELSE CLOSE statement*;

primaryElseStmt: (primaryElseCondEndStmt | primaryElseEachStmt | primaryElseEndStmt);
primaryElseCondEndStmt: primaryElseIfStmt+ (primaryElseEachStmt | primaryElseEndStmt)?;

/** Constraint */
constraintIfStmt: OPEN K_CONSTRAINT '.' K_IF LPAR constraintCondition RPAR CLOSE statement* constraintElseStmt? OPEN K_CONSTRAINT '.' K_END CLOSE;
constraintEachStmt: OPEN K_CONSTRAINT '.' K_EACH ( LPAR constraintCondition RPAR )? CLOSE statement* OPEN K_CONSTRAINT '.' K_END CLOSE;

constraintElseIfStmt: OPEN K_CONSTRAINT '.' K_ELSE '.' K_IF LPAR indexCondition RPAR CLOSE statement*;
constraintElseEachStmt: OPEN K_CONSTRAINT '.' K_ELSE '.' K_EACH ( LPAR indexCondition RPAR )? CLOSE statement*;
constraintElseEndStmt: OPEN K_CONSTRAINT '.' K_ELSE CLOSE statement*;

constraintElseStmt: (constraintElseCondEndStmt | constraintElseEachStmt | constraintElseEndStmt);
constraintElseCondEndStmt: constraintElseIfStmt+ (constraintElseEachStmt | constraintElseEndStmt)?;

/** Foreign */
foreignIfStmt: OPEN K_FOREIGN '.' K_IF LPAR fieldCondition RPAR CLOSE statement* foreignElseStmt? OPEN K_FOREIGN '.' K_END CLOSE;
foreignEachStmt: OPEN K_FOREIGN '.' K_EACH ( LPAR fieldCondition RPAR )? CLOSE statement* OPEN K_FOREIGN '.' K_END CLOSE;

foreignElseIfStmt: OPEN K_FOREIGN '.' K_ELSE '.' K_IF LPAR indexCondition RPAR CLOSE statement*;
foreignElseEachStmt: OPEN K_FOREIGN '.' K_ELSE '.' K_EACH ( LPAR indexCondition RPAR )? CLOSE statement*;
foreignElseEndStmt: OPEN K_FOREIGN '.' K_ELSE CLOSE statement*;

foreignElseStmt: (foreignElseCondEndStmt | foreignElseEachStmt | foreignElseEndStmt);
foreignElseCondEndStmt: foreignElseIfStmt+ (foreignElseEachStmt | foreignElseEndStmt)?;

/** Constants */
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
  | K_ON
  | K_DELETE
  | K_UPDATE
  | K_INSERT
  | K_NOID
  ;

indexNameStmt: OPEN K_INDEX '.' K_NAME CLOSE;

uniqueNameStmt: OPEN K_UNIQUE '.' K_NAME CLOSE;

primaryNameStmt: OPEN K_PRIMARY '.' K_NAME CLOSE;

constraintNameStmt: OPEN K_CONSTRAINT '.' K_NAME CLOSE;

foreignNameStmt: OPEN K_FOREIGN '.' K_NAME CLOSE;

text: TEXT;

tableLevel: K_TABLE | K_INHERITED | K_REFERENCE;

fieldLevel: K_FIELD | K_DESCRIPTOR | K_OPTION | K_IMAGE;

regex: REGEX;
word: WORD;

tableCondition: condition;
fieldCondition: condition;
indexCondition: condition;
constraintCondition: condition;
condition: expression ('|' expression)*;
expression: attribute | property | type | word;

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
  | K_FEW_FIELDS
  | K_FIRST
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
