@echo off

SET CLASSPATH=.;%~dp0\lib\antlr-4.5.3-complete.jar;%CLASSPATH%
java org.antlr.v4.Tool -o . -encoding UTF-8 -listener -no-visitor -package parser .\src\parser\SQL.g4
