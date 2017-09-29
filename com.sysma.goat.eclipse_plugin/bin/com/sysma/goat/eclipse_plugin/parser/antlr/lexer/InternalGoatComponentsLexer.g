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

Component : 'component';

Function : 'function';

Receiver : 'receiver';

Receive : 'receive';

Return : 'return';

False : 'false';

Print : 'print';

Sleep : 'sleep';

Until : 'until';

Else : 'else';

Proc : 'proc';

Send : 'send';

This : 'this';

True : 'true';

Wait : 'wait';

Nil : 'nil';

Var : 'var';

ExclamationMarkEqualsSign : '!=';

AmpersandAmpersand : '&&';

PlusSignPlusSign : '++';

ColonEqualsSign : ':=';

LessThanSignEqualsSign : '<=';

EqualsSignEqualsSign : '==';

GreaterThanSignEqualsSign : '>=';

At : 'at';

If : 'if';

VerticalLineVerticalLine : '||';

ExclamationMark : '!';

LeftParenthesis : '(';

RightParenthesis : ')';

Asterisk : '*';

PlusSign : '+';

Comma : ',';

HyphenMinus : '-';

FullStop : '.';

Solidus : '/';

LessThanSign : '<';

EqualsSign : '=';

GreaterThanSign : '>';

CommercialAt : '@';

LeftSquareBracket : '[';

RightSquareBracket : ']';

LeftCurlyBracket : '{';

VerticalLine : '|';

RightCurlyBracket : '}';

RULE_TYPE : ('int'|'string'|'bool');

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
