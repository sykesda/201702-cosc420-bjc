# Bantam_Java_Compiler

An ANTLR grammar file for Bantam Java.

This version includes a library for [ANTLR symtab](https://github.com/antlr/symtab).

## Parser

A listener builds a symbol table as the parse is completed

## Semantic Analyzer

A visitor ensures the program follows the
semantics of Bantam Java, including:

- type conformity in the following contexts:

    - assignment
    - `return` expression
    - method call:
        - number of arguments
        - compatible actual/formal parameter types
    - operations
        - `+`, `-`, etc. must have certain-typed operands
- a class can't have two fields with the same name
- a class can't have two methods with the same name
- two classes can't have the same name
