/*
 * generated by Xtext 2.12.0
 */
lexer grammar InternalGoatComponentsLexer;

@header {
package com.sysma.goat.eclipse_plugin.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

Infrastructure : 'infrastructure';

Environment : 'environment';

Component : 'component';

Function : 'function';

Receiver : 'receiver';

Process : 'process';

Receive : 'receive';

Waitfor : 'waitfor';

Append : 'append';

Length : 'length';

Return : 'return';

False : 'false';

Print : 'print';

Spawn : 'spawn';

While : 'while';

Call : 'call';

Case : 'case';

Comp : 'comp';

Else : 'else';

Loop : 'loop';

Proc : 'proc';

Send : 'send';

True : 'true';

Pop : 'pop';

Set : 'set';

Var : 'var';

ExclamationMarkEqualsSign : '!=';

AmpersandAmpersand : '&&';

PlusSignPlusSign : '++';

ColonEqualsSign : ':=';

LessThanSignEqualsSign : '<=';

EqualsSignEqualsSign : '==';

GreaterThanSignEqualsSign : '>=';

If : 'if';

VerticalLineVerticalLine : '||';

ExclamationMark : '!';

PercentSign : '%';

LeftParenthesis : '(';

RightParenthesis : ')';

Asterisk : '*';

PlusSign : '+';

Comma : ',';

HyphenMinus : '-';

FullStop : '.';

Solidus : '/';

Colon : ':';

Semicolon : ';';

LessThanSign : '<';

EqualsSign : '=';

GreaterThanSign : '>';

CommercialAt : '@';

LeftSquareBracket : '[';

RightSquareBracket : ']';

LeftCurlyBracket : '{';

VerticalLine : '|';

RightCurlyBracket : '}';

RULE_TYPE : ('int'|'string'|'bool'|'tuple');

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
