#!/bin/sh

export CLASSPATH=lib/antlr-4.8-complete.jar
java org.antlr.v4.Tool -o . -encoding UTF-8 -listener -no-visitor -package parser ./src/parser/SQL.g4
