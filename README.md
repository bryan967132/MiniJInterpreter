# MiniJInterpreter
## Intérprete de Código: JavaCC
Versión minimizada de c++.  
Implementa patrón de diseño interpreter.

## VSCode Theme
![Window](Images/ScreenVSCodeTheme.png)

## GitHub Theme
![Window](Images/ScreenGitHubTheme.png)

## Eclipse Theme
![Window](Images/ScreenEclipseTheme.png)

## Gramática Libre del Contexto
```html
<INIT> ::= <INSTRUCTIONS> EOF

<INSTSGLOBAL> ::= <INSTGLOBAL>*

<INSTGLOBAL> ::=
    <CALLMAINFUNC> |
    <DECLFUNC>     

<CALLMAINFUNC> ::= 'main' <CALLFUNC> ';'

<CALLFUNC> ::= TK_id '(' <LISTARGS> ')'

<INITVAR> ::= <DATATYPE> <INITIDS> ';'

<INITIDS> ::= TK_id ('=' <EXP>)? (',' TK_id ('=' <EXP>)?)*

<DECLFUNC> ::=
    <DATATYPE>   TK_id '(' <LISTPARAMS> ')' <ENV> |
    'void' TK_id '(' <LISTPARAMS> ')' <ENV>

<LISTPARAMS> ::= (<DATATYPE> TK_id (',' <DATATYPE> TK_id)*)?

<IF> ::= 'if' '(' <EXP> ')' <ENV> ('else' (<IF> | <ENV>))?

<SWITCH> ::= 'switch' '(' <EXP> ')' <ENVS>

<ENVS> ::= '{' <CASESDEFAULT> '}'

<CASESDEFAULT> ::= (<CASES>)? (<DEFAULT>)?

<CASES> ::= (<CASE>)+

<CASE> ::= 'case' <EXP> ':' (<ENV> | <INSTRUCTIONS>)

<DEFAULT> ::= 'default' ':' (<ENV> | <INSTRUCTIONS>)

<FOR> ::= 'for' '(' <ARGSFOR> ')' <ENV>

<ARGSFOR> ::= (<INITIALIZEFOR>)? ';' (<EXP>)? ';' (<UPDATESFOR>)?

<INITIALIZEFOR> ::=
    <DATATYPE> <INITIDSFOR> |
    <REASIGNS>        

<INITIDSFOR> ::= TK_id '=' <EXP> (',' TK_id '=' <EXP>)*

<REASIGNS> ::= <ASSIGN> (',' <ASSIGN>)*

<UPDATESFOR> ::= <ASSIGN> (',' <ASSIGN>)*

<WHILE> ::= 'while' '(' <EXP> ')' <ENV>

<DOWHILE> ::= 'do' <ENV> 'while' '(' <EXP> ')' ';'

<ASSIGN> ::= TK_id (('=' | '+=' | '-=' | '*=' | '/=' | '%=') <EXP> | ('++' | '--'))

<IDPOS> ::= TK_id <VECTORPOS>?

<PRINT> ::= '<PRINT>' '(' <EXP>? ')' ';'

<ENV> ::= '{' <INSTRUCTIONS> '}'

<INSTRUCTIONS> ::= <INSTRUCTION>*

<INSTRUCTION> ::=
    <INITVAR>             |
    <IF>                  |
    <SWITCH>              |
    <FOR>                 |
    <WHILE>               |
    <DOWHILE>             |
    <ASSIGN>          ';' |
    <CALLFUNC>        ';' |
    <PRINT>               |
    'return' (<EXP>)? ';' |
    'continue'        ';' |
    'break'           ';' 

<DATATYPE> ::= <TYPE> <VECTORTYPE>?

<VECTORTYPE> ::= '[' <VECTORTYPE2>? ']'

<VECTORTYPE2> ::= '[' <VECTORTYPE>? ']'

<TYPE> ::=
    'String'  |
    'int'     |
    'boolean' |
    'char'    |
    'double'  

<EXP> ::= <opOr> ('?' <opOr> ':' <opOr>)?

<opOr> ::= <opAnd> ('||' <opAnd>)*

<opAnd> ::= <opEqu> ('&&' <opEqu>)*

<opEqu> ::= <opCmp> (('==' | '!=') <opCmp>)*

<opCmp> ::= <opAdd> (('<=' | '>=' |'<' | '>') <opAdd>)*

<opAdd> ::= <opMult> (('+' | '-') <opMult>)*

<opMult> ::= <unary> (('*' | '/' | '%') <unary>)*

<unary> ::=
    '-' <unary> |
    '!' <unary> |
    <primitive> 

<primitive> ::=
    <ACCESS>      |
    <CAST>        |
    <NATIVEFUNC>  |
    <VECTOR>      |
    TK_id         |
    TK_string     |
    TK_char       |
    TK_int        |
    TK_double     |
    'true'        |
    'false'       |
    '(' <EXP> ')' 

<ACCESS> ::= TK_id ('(' <LISTARGS> ')' | <VECTORPOS>? ('++' | '--')?)

<LISTARGS> ::= (<EXP> (',' <EXP>)*)?

<VECTORPOS> ::= '[' <EXP> ']' ('[' <EXP> ']')*

<CAST> ::= <TYPE> '(' <EXP> ')'

<NATIVEFUNC> ::=
    'round' '(' <EXP> (',' <EXP>)? ')' |
    'abs'   '(' <EXP> ')'              

<VECTOR> ::= '[' (<EXP> (',' <EXP>)*)? ']'
```

## Instalación JavaCC
* Descargar javacc: [JavaCC](https://javacc.github.io/javacc/)
* Buscar la carpeta ```./javacc/scripts``` y copiar la dirección.
* Pegar la dirección en las variables de entorno.
    * Buscar ```Path``` en variables del sistema.
    * Pegar la ruta copiada. ```./javacc/scripts```

## Generación de Parser
* Ejecutar el comando ```javacc Parser.jj``` en la ubicación del archivo con extensión .jj para generar el código del parser.

## Intérprete con JFlex y CUP
Usuario: [brandonT2002](https://github.com/brandonT2002)  
Repositorio: [MiniJ](https://github.com/brandonT2002/MiniJ)

## Intérprete de Pseudocódigo con JFlex y CUP
Usuario: [bryan967132](https://github.com/bryan967132)  
Repositorio: [PseudoParser](https://github.com/bryan967132/PseudoParser)

## Traductor a C3D con JFlex y CUP
Usuario: [bryan967132](https://github.com/bryan967132)  
Repositorio: [MiniJCompiler](https://github.com/bryan967132/MiniJCompiler)