package com.sysma.goat.eclipse_plugin.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGoatComponentsLexer extends Lexer {
    public static final int Elif=13;
    public static final int Var=21;
    public static final int True=18;
    public static final int False=9;
    public static final int LessThanSign=41;
    public static final int Send=16;
    public static final int Print=10;
    public static final int LeftParenthesis=33;
    public static final int This=17;
    public static final int RightSquareBracket=46;
    public static final int ExclamationMark=32;
    public static final int GreaterThanSign=43;
    public static final int RULE_ID=51;
    public static final int RightParenthesis=34;
    public static final int Receiver=6;
    public static final int ColonEqualsSign=25;
    public static final int GreaterThanSignEqualsSign=28;
    public static final int EqualsSignEqualsSign=27;
    public static final int RULE_TYPE=50;
    public static final int VerticalLine=48;
    public static final int PlusSign=36;
    public static final int RULE_INT=52;
    public static final int RULE_ML_COMMENT=54;
    public static final int LeftSquareBracket=45;
    public static final int Wait=19;
    public static final int If=30;
    public static final int VerticalLineVerticalLine=31;
    public static final int RULE_STRING=53;
    public static final int RULE_SL_COMMENT=55;
    public static final int Proc=15;
    public static final int Function=5;
    public static final int Comma=37;
    public static final int EqualsSign=42;
    public static final int HyphenMinus=38;
    public static final int At=29;
    public static final int AmpersandAmpersand=23;
    public static final int LessThanSignEqualsSign=26;
    public static final int Solidus=40;
    public static final int RightCurlyBracket=49;
    public static final int Component=4;
    public static final int EOF=-1;
    public static final int Asterisk=35;
    public static final int Until=12;
    public static final int FullStop=39;
    public static final int Return=8;
    public static final int RULE_WS=56;
    public static final int LeftCurlyBracket=47;
    public static final int RULE_ANY_OTHER=57;
    public static final int CommercialAt=44;
    public static final int Nil=20;
    public static final int Sleep=11;
    public static final int PlusSignPlusSign=24;
    public static final int Receive=7;
    public static final int Else=14;
    public static final int ExclamationMarkEqualsSign=22;

    // delegates
    // delegators

    public InternalGoatComponentsLexer() {;} 
    public InternalGoatComponentsLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalGoatComponentsLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalGoatComponentsLexer.g"; }

    // $ANTLR start "Component"
    public final void mComponent() throws RecognitionException {
        try {
            int _type = Component;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:14:11: ( 'component' )
            // InternalGoatComponentsLexer.g:14:13: 'component'
            {
            match("component"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Component"

    // $ANTLR start "Function"
    public final void mFunction() throws RecognitionException {
        try {
            int _type = Function;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:16:10: ( 'function' )
            // InternalGoatComponentsLexer.g:16:12: 'function'
            {
            match("function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Function"

    // $ANTLR start "Receiver"
    public final void mReceiver() throws RecognitionException {
        try {
            int _type = Receiver;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:18:10: ( 'receiver' )
            // InternalGoatComponentsLexer.g:18:12: 'receiver'
            {
            match("receiver"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Receiver"

    // $ANTLR start "Receive"
    public final void mReceive() throws RecognitionException {
        try {
            int _type = Receive;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:20:9: ( 'receive' )
            // InternalGoatComponentsLexer.g:20:11: 'receive'
            {
            match("receive"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Receive"

    // $ANTLR start "Return"
    public final void mReturn() throws RecognitionException {
        try {
            int _type = Return;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:22:8: ( 'return' )
            // InternalGoatComponentsLexer.g:22:10: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Return"

    // $ANTLR start "False"
    public final void mFalse() throws RecognitionException {
        try {
            int _type = False;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:24:7: ( 'false' )
            // InternalGoatComponentsLexer.g:24:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "False"

    // $ANTLR start "Print"
    public final void mPrint() throws RecognitionException {
        try {
            int _type = Print;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:26:7: ( 'print' )
            // InternalGoatComponentsLexer.g:26:9: 'print'
            {
            match("print"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Print"

    // $ANTLR start "Sleep"
    public final void mSleep() throws RecognitionException {
        try {
            int _type = Sleep;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:28:7: ( 'sleep' )
            // InternalGoatComponentsLexer.g:28:9: 'sleep'
            {
            match("sleep"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Sleep"

    // $ANTLR start "Until"
    public final void mUntil() throws RecognitionException {
        try {
            int _type = Until;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:30:7: ( 'until' )
            // InternalGoatComponentsLexer.g:30:9: 'until'
            {
            match("until"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Until"

    // $ANTLR start "Elif"
    public final void mElif() throws RecognitionException {
        try {
            int _type = Elif;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:32:6: ( 'elif' )
            // InternalGoatComponentsLexer.g:32:8: 'elif'
            {
            match("elif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Elif"

    // $ANTLR start "Else"
    public final void mElse() throws RecognitionException {
        try {
            int _type = Else;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:34:6: ( 'else' )
            // InternalGoatComponentsLexer.g:34:8: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Else"

    // $ANTLR start "Proc"
    public final void mProc() throws RecognitionException {
        try {
            int _type = Proc;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:36:6: ( 'proc' )
            // InternalGoatComponentsLexer.g:36:8: 'proc'
            {
            match("proc"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Proc"

    // $ANTLR start "Send"
    public final void mSend() throws RecognitionException {
        try {
            int _type = Send;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:38:6: ( 'send' )
            // InternalGoatComponentsLexer.g:38:8: 'send'
            {
            match("send"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Send"

    // $ANTLR start "This"
    public final void mThis() throws RecognitionException {
        try {
            int _type = This;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:40:6: ( 'this' )
            // InternalGoatComponentsLexer.g:40:8: 'this'
            {
            match("this"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "This"

    // $ANTLR start "True"
    public final void mTrue() throws RecognitionException {
        try {
            int _type = True;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:42:6: ( 'true' )
            // InternalGoatComponentsLexer.g:42:8: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "True"

    // $ANTLR start "Wait"
    public final void mWait() throws RecognitionException {
        try {
            int _type = Wait;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:44:6: ( 'wait' )
            // InternalGoatComponentsLexer.g:44:8: 'wait'
            {
            match("wait"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Wait"

    // $ANTLR start "Nil"
    public final void mNil() throws RecognitionException {
        try {
            int _type = Nil;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:46:5: ( 'nil' )
            // InternalGoatComponentsLexer.g:46:7: 'nil'
            {
            match("nil"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Nil"

    // $ANTLR start "Var"
    public final void mVar() throws RecognitionException {
        try {
            int _type = Var;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:48:5: ( 'var' )
            // InternalGoatComponentsLexer.g:48:7: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Var"

    // $ANTLR start "ExclamationMarkEqualsSign"
    public final void mExclamationMarkEqualsSign() throws RecognitionException {
        try {
            int _type = ExclamationMarkEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:50:27: ( '!=' )
            // InternalGoatComponentsLexer.g:50:29: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ExclamationMarkEqualsSign"

    // $ANTLR start "AmpersandAmpersand"
    public final void mAmpersandAmpersand() throws RecognitionException {
        try {
            int _type = AmpersandAmpersand;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:52:20: ( '&&' )
            // InternalGoatComponentsLexer.g:52:22: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AmpersandAmpersand"

    // $ANTLR start "PlusSignPlusSign"
    public final void mPlusSignPlusSign() throws RecognitionException {
        try {
            int _type = PlusSignPlusSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:54:18: ( '++' )
            // InternalGoatComponentsLexer.g:54:20: '++'
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PlusSignPlusSign"

    // $ANTLR start "ColonEqualsSign"
    public final void mColonEqualsSign() throws RecognitionException {
        try {
            int _type = ColonEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:56:17: ( ':=' )
            // InternalGoatComponentsLexer.g:56:19: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ColonEqualsSign"

    // $ANTLR start "LessThanSignEqualsSign"
    public final void mLessThanSignEqualsSign() throws RecognitionException {
        try {
            int _type = LessThanSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:58:24: ( '<=' )
            // InternalGoatComponentsLexer.g:58:26: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LessThanSignEqualsSign"

    // $ANTLR start "EqualsSignEqualsSign"
    public final void mEqualsSignEqualsSign() throws RecognitionException {
        try {
            int _type = EqualsSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:60:22: ( '==' )
            // InternalGoatComponentsLexer.g:60:24: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EqualsSignEqualsSign"

    // $ANTLR start "GreaterThanSignEqualsSign"
    public final void mGreaterThanSignEqualsSign() throws RecognitionException {
        try {
            int _type = GreaterThanSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:62:27: ( '>=' )
            // InternalGoatComponentsLexer.g:62:29: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GreaterThanSignEqualsSign"

    // $ANTLR start "At"
    public final void mAt() throws RecognitionException {
        try {
            int _type = At;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:64:4: ( 'at' )
            // InternalGoatComponentsLexer.g:64:6: 'at'
            {
            match("at"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "At"

    // $ANTLR start "If"
    public final void mIf() throws RecognitionException {
        try {
            int _type = If;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:66:4: ( 'if' )
            // InternalGoatComponentsLexer.g:66:6: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "If"

    // $ANTLR start "VerticalLineVerticalLine"
    public final void mVerticalLineVerticalLine() throws RecognitionException {
        try {
            int _type = VerticalLineVerticalLine;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:68:26: ( '||' )
            // InternalGoatComponentsLexer.g:68:28: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VerticalLineVerticalLine"

    // $ANTLR start "ExclamationMark"
    public final void mExclamationMark() throws RecognitionException {
        try {
            int _type = ExclamationMark;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:70:17: ( '!' )
            // InternalGoatComponentsLexer.g:70:19: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ExclamationMark"

    // $ANTLR start "LeftParenthesis"
    public final void mLeftParenthesis() throws RecognitionException {
        try {
            int _type = LeftParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:72:17: ( '(' )
            // InternalGoatComponentsLexer.g:72:19: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftParenthesis"

    // $ANTLR start "RightParenthesis"
    public final void mRightParenthesis() throws RecognitionException {
        try {
            int _type = RightParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:74:18: ( ')' )
            // InternalGoatComponentsLexer.g:74:20: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightParenthesis"

    // $ANTLR start "Asterisk"
    public final void mAsterisk() throws RecognitionException {
        try {
            int _type = Asterisk;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:76:10: ( '*' )
            // InternalGoatComponentsLexer.g:76:12: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Asterisk"

    // $ANTLR start "PlusSign"
    public final void mPlusSign() throws RecognitionException {
        try {
            int _type = PlusSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:78:10: ( '+' )
            // InternalGoatComponentsLexer.g:78:12: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PlusSign"

    // $ANTLR start "Comma"
    public final void mComma() throws RecognitionException {
        try {
            int _type = Comma;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:80:7: ( ',' )
            // InternalGoatComponentsLexer.g:80:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Comma"

    // $ANTLR start "HyphenMinus"
    public final void mHyphenMinus() throws RecognitionException {
        try {
            int _type = HyphenMinus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:82:13: ( '-' )
            // InternalGoatComponentsLexer.g:82:15: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HyphenMinus"

    // $ANTLR start "FullStop"
    public final void mFullStop() throws RecognitionException {
        try {
            int _type = FullStop;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:84:10: ( '.' )
            // InternalGoatComponentsLexer.g:84:12: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FullStop"

    // $ANTLR start "Solidus"
    public final void mSolidus() throws RecognitionException {
        try {
            int _type = Solidus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:86:9: ( '/' )
            // InternalGoatComponentsLexer.g:86:11: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Solidus"

    // $ANTLR start "LessThanSign"
    public final void mLessThanSign() throws RecognitionException {
        try {
            int _type = LessThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:88:14: ( '<' )
            // InternalGoatComponentsLexer.g:88:16: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LessThanSign"

    // $ANTLR start "EqualsSign"
    public final void mEqualsSign() throws RecognitionException {
        try {
            int _type = EqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:90:12: ( '=' )
            // InternalGoatComponentsLexer.g:90:14: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EqualsSign"

    // $ANTLR start "GreaterThanSign"
    public final void mGreaterThanSign() throws RecognitionException {
        try {
            int _type = GreaterThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:92:17: ( '>' )
            // InternalGoatComponentsLexer.g:92:19: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GreaterThanSign"

    // $ANTLR start "CommercialAt"
    public final void mCommercialAt() throws RecognitionException {
        try {
            int _type = CommercialAt;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:94:14: ( '@' )
            // InternalGoatComponentsLexer.g:94:16: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CommercialAt"

    // $ANTLR start "LeftSquareBracket"
    public final void mLeftSquareBracket() throws RecognitionException {
        try {
            int _type = LeftSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:96:19: ( '[' )
            // InternalGoatComponentsLexer.g:96:21: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftSquareBracket"

    // $ANTLR start "RightSquareBracket"
    public final void mRightSquareBracket() throws RecognitionException {
        try {
            int _type = RightSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:98:20: ( ']' )
            // InternalGoatComponentsLexer.g:98:22: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightSquareBracket"

    // $ANTLR start "LeftCurlyBracket"
    public final void mLeftCurlyBracket() throws RecognitionException {
        try {
            int _type = LeftCurlyBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:100:18: ( '{' )
            // InternalGoatComponentsLexer.g:100:20: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftCurlyBracket"

    // $ANTLR start "VerticalLine"
    public final void mVerticalLine() throws RecognitionException {
        try {
            int _type = VerticalLine;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:102:14: ( '|' )
            // InternalGoatComponentsLexer.g:102:16: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VerticalLine"

    // $ANTLR start "RightCurlyBracket"
    public final void mRightCurlyBracket() throws RecognitionException {
        try {
            int _type = RightCurlyBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:104:19: ( '}' )
            // InternalGoatComponentsLexer.g:104:21: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightCurlyBracket"

    // $ANTLR start "RULE_TYPE"
    public final void mRULE_TYPE() throws RecognitionException {
        try {
            int _type = RULE_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:106:11: ( ( 'int' | 'string' | 'bool' ) )
            // InternalGoatComponentsLexer.g:106:13: ( 'int' | 'string' | 'bool' )
            {
            // InternalGoatComponentsLexer.g:106:13: ( 'int' | 'string' | 'bool' )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 'i':
                {
                alt1=1;
                }
                break;
            case 's':
                {
                alt1=2;
                }
                break;
            case 'b':
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalGoatComponentsLexer.g:106:14: 'int'
                    {
                    match("int"); 


                    }
                    break;
                case 2 :
                    // InternalGoatComponentsLexer.g:106:20: 'string'
                    {
                    match("string"); 


                    }
                    break;
                case 3 :
                    // InternalGoatComponentsLexer.g:106:29: 'bool'
                    {
                    match("bool"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TYPE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:108:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalGoatComponentsLexer.g:108:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalGoatComponentsLexer.g:108:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalGoatComponentsLexer.g:108:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalGoatComponentsLexer.g:108:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGoatComponentsLexer.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:110:10: ( ( '0' .. '9' )+ )
            // InternalGoatComponentsLexer.g:110:12: ( '0' .. '9' )+
            {
            // InternalGoatComponentsLexer.g:110:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGoatComponentsLexer.g:110:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:112:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalGoatComponentsLexer.g:112:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalGoatComponentsLexer.g:112:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalGoatComponentsLexer.g:112:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalGoatComponentsLexer.g:112:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalGoatComponentsLexer.g:112:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGoatComponentsLexer.g:112:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalGoatComponentsLexer.g:112:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalGoatComponentsLexer.g:112:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalGoatComponentsLexer.g:112:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGoatComponentsLexer.g:112:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:114:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalGoatComponentsLexer.g:114:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalGoatComponentsLexer.g:114:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGoatComponentsLexer.g:114:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:116:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalGoatComponentsLexer.g:116:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalGoatComponentsLexer.g:116:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGoatComponentsLexer.g:116:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalGoatComponentsLexer.g:116:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalGoatComponentsLexer.g:116:41: ( '\\r' )? '\\n'
                    {
                    // InternalGoatComponentsLexer.g:116:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalGoatComponentsLexer.g:116:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:118:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalGoatComponentsLexer.g:118:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalGoatComponentsLexer.g:118:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalGoatComponentsLexer.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:120:16: ( . )
            // InternalGoatComponentsLexer.g:120:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalGoatComponentsLexer.g:1:8: ( Component | Function | Receiver | Receive | Return | False | Print | Sleep | Until | Elif | Else | Proc | Send | This | True | Wait | Nil | Var | ExclamationMarkEqualsSign | AmpersandAmpersand | PlusSignPlusSign | ColonEqualsSign | LessThanSignEqualsSign | EqualsSignEqualsSign | GreaterThanSignEqualsSign | At | If | VerticalLineVerticalLine | ExclamationMark | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | FullStop | Solidus | LessThanSign | EqualsSign | GreaterThanSign | CommercialAt | LeftSquareBracket | RightSquareBracket | LeftCurlyBracket | VerticalLine | RightCurlyBracket | RULE_TYPE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=54;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalGoatComponentsLexer.g:1:10: Component
                {
                mComponent(); 

                }
                break;
            case 2 :
                // InternalGoatComponentsLexer.g:1:20: Function
                {
                mFunction(); 

                }
                break;
            case 3 :
                // InternalGoatComponentsLexer.g:1:29: Receiver
                {
                mReceiver(); 

                }
                break;
            case 4 :
                // InternalGoatComponentsLexer.g:1:38: Receive
                {
                mReceive(); 

                }
                break;
            case 5 :
                // InternalGoatComponentsLexer.g:1:46: Return
                {
                mReturn(); 

                }
                break;
            case 6 :
                // InternalGoatComponentsLexer.g:1:53: False
                {
                mFalse(); 

                }
                break;
            case 7 :
                // InternalGoatComponentsLexer.g:1:59: Print
                {
                mPrint(); 

                }
                break;
            case 8 :
                // InternalGoatComponentsLexer.g:1:65: Sleep
                {
                mSleep(); 

                }
                break;
            case 9 :
                // InternalGoatComponentsLexer.g:1:71: Until
                {
                mUntil(); 

                }
                break;
            case 10 :
                // InternalGoatComponentsLexer.g:1:77: Elif
                {
                mElif(); 

                }
                break;
            case 11 :
                // InternalGoatComponentsLexer.g:1:82: Else
                {
                mElse(); 

                }
                break;
            case 12 :
                // InternalGoatComponentsLexer.g:1:87: Proc
                {
                mProc(); 

                }
                break;
            case 13 :
                // InternalGoatComponentsLexer.g:1:92: Send
                {
                mSend(); 

                }
                break;
            case 14 :
                // InternalGoatComponentsLexer.g:1:97: This
                {
                mThis(); 

                }
                break;
            case 15 :
                // InternalGoatComponentsLexer.g:1:102: True
                {
                mTrue(); 

                }
                break;
            case 16 :
                // InternalGoatComponentsLexer.g:1:107: Wait
                {
                mWait(); 

                }
                break;
            case 17 :
                // InternalGoatComponentsLexer.g:1:112: Nil
                {
                mNil(); 

                }
                break;
            case 18 :
                // InternalGoatComponentsLexer.g:1:116: Var
                {
                mVar(); 

                }
                break;
            case 19 :
                // InternalGoatComponentsLexer.g:1:120: ExclamationMarkEqualsSign
                {
                mExclamationMarkEqualsSign(); 

                }
                break;
            case 20 :
                // InternalGoatComponentsLexer.g:1:146: AmpersandAmpersand
                {
                mAmpersandAmpersand(); 

                }
                break;
            case 21 :
                // InternalGoatComponentsLexer.g:1:165: PlusSignPlusSign
                {
                mPlusSignPlusSign(); 

                }
                break;
            case 22 :
                // InternalGoatComponentsLexer.g:1:182: ColonEqualsSign
                {
                mColonEqualsSign(); 

                }
                break;
            case 23 :
                // InternalGoatComponentsLexer.g:1:198: LessThanSignEqualsSign
                {
                mLessThanSignEqualsSign(); 

                }
                break;
            case 24 :
                // InternalGoatComponentsLexer.g:1:221: EqualsSignEqualsSign
                {
                mEqualsSignEqualsSign(); 

                }
                break;
            case 25 :
                // InternalGoatComponentsLexer.g:1:242: GreaterThanSignEqualsSign
                {
                mGreaterThanSignEqualsSign(); 

                }
                break;
            case 26 :
                // InternalGoatComponentsLexer.g:1:268: At
                {
                mAt(); 

                }
                break;
            case 27 :
                // InternalGoatComponentsLexer.g:1:271: If
                {
                mIf(); 

                }
                break;
            case 28 :
                // InternalGoatComponentsLexer.g:1:274: VerticalLineVerticalLine
                {
                mVerticalLineVerticalLine(); 

                }
                break;
            case 29 :
                // InternalGoatComponentsLexer.g:1:299: ExclamationMark
                {
                mExclamationMark(); 

                }
                break;
            case 30 :
                // InternalGoatComponentsLexer.g:1:315: LeftParenthesis
                {
                mLeftParenthesis(); 

                }
                break;
            case 31 :
                // InternalGoatComponentsLexer.g:1:331: RightParenthesis
                {
                mRightParenthesis(); 

                }
                break;
            case 32 :
                // InternalGoatComponentsLexer.g:1:348: Asterisk
                {
                mAsterisk(); 

                }
                break;
            case 33 :
                // InternalGoatComponentsLexer.g:1:357: PlusSign
                {
                mPlusSign(); 

                }
                break;
            case 34 :
                // InternalGoatComponentsLexer.g:1:366: Comma
                {
                mComma(); 

                }
                break;
            case 35 :
                // InternalGoatComponentsLexer.g:1:372: HyphenMinus
                {
                mHyphenMinus(); 

                }
                break;
            case 36 :
                // InternalGoatComponentsLexer.g:1:384: FullStop
                {
                mFullStop(); 

                }
                break;
            case 37 :
                // InternalGoatComponentsLexer.g:1:393: Solidus
                {
                mSolidus(); 

                }
                break;
            case 38 :
                // InternalGoatComponentsLexer.g:1:401: LessThanSign
                {
                mLessThanSign(); 

                }
                break;
            case 39 :
                // InternalGoatComponentsLexer.g:1:414: EqualsSign
                {
                mEqualsSign(); 

                }
                break;
            case 40 :
                // InternalGoatComponentsLexer.g:1:425: GreaterThanSign
                {
                mGreaterThanSign(); 

                }
                break;
            case 41 :
                // InternalGoatComponentsLexer.g:1:441: CommercialAt
                {
                mCommercialAt(); 

                }
                break;
            case 42 :
                // InternalGoatComponentsLexer.g:1:454: LeftSquareBracket
                {
                mLeftSquareBracket(); 

                }
                break;
            case 43 :
                // InternalGoatComponentsLexer.g:1:472: RightSquareBracket
                {
                mRightSquareBracket(); 

                }
                break;
            case 44 :
                // InternalGoatComponentsLexer.g:1:491: LeftCurlyBracket
                {
                mLeftCurlyBracket(); 

                }
                break;
            case 45 :
                // InternalGoatComponentsLexer.g:1:508: VerticalLine
                {
                mVerticalLine(); 

                }
                break;
            case 46 :
                // InternalGoatComponentsLexer.g:1:521: RightCurlyBracket
                {
                mRightCurlyBracket(); 

                }
                break;
            case 47 :
                // InternalGoatComponentsLexer.g:1:539: RULE_TYPE
                {
                mRULE_TYPE(); 

                }
                break;
            case 48 :
                // InternalGoatComponentsLexer.g:1:549: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 49 :
                // InternalGoatComponentsLexer.g:1:557: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 50 :
                // InternalGoatComponentsLexer.g:1:566: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 51 :
                // InternalGoatComponentsLexer.g:1:578: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 52 :
                // InternalGoatComponentsLexer.g:1:594: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 53 :
                // InternalGoatComponentsLexer.g:1:610: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 54 :
                // InternalGoatComponentsLexer.g:1:618: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\13\53\1\73\1\51\1\76\1\51\1\101\1\103\1\105\2\53\1\112\6\uffff\1\123\5\uffff\1\53\1\51\2\uffff\2\51\2\uffff\1\53\1\uffff\16\53\14\uffff\1\157\1\160\1\53\20\uffff\1\53\3\uffff\20\53\1\u0083\1\u0084\2\uffff\1\u0085\7\53\1\u008d\1\53\1\u008f\2\53\1\u0092\1\u0093\1\u0094\1\u0095\1\u0096\3\uffff\1\u0085\2\53\1\u0099\2\53\1\u009c\1\uffff\1\u009d\1\uffff\1\53\1\u009f\5\uffff\2\53\1\uffff\1\53\1\u00a3\2\uffff\1\u0085\1\uffff\2\53\1\u00a7\1\uffff\1\53\1\u00a9\1\u00aa\1\uffff\1\u00ab\3\uffff";
    static final String DFA13_eofS =
        "\u00ac\uffff";
    static final String DFA13_minS =
        "\1\0\1\157\1\141\1\145\1\162\1\145\1\156\1\154\1\150\1\141\1\151\1\141\1\75\1\46\1\53\4\75\1\164\1\146\1\174\6\uffff\1\52\5\uffff\1\157\1\101\2\uffff\2\0\2\uffff\1\155\1\uffff\1\156\1\154\1\143\1\151\1\145\1\156\1\162\1\164\2\151\1\165\1\151\1\154\1\162\14\uffff\2\60\1\164\20\uffff\1\157\3\uffff\1\160\1\143\1\163\1\145\1\165\1\156\1\143\1\145\1\144\2\151\1\146\1\145\1\163\1\145\1\164\2\60\2\uffff\1\60\1\154\1\157\1\164\1\145\1\151\1\162\1\164\1\60\1\160\1\60\1\156\1\154\5\60\3\uffff\1\60\1\156\1\151\1\60\1\166\1\156\1\60\1\uffff\1\60\1\uffff\1\147\1\60\5\uffff\1\145\1\157\1\uffff\1\145\1\60\2\uffff\1\60\1\uffff\2\156\1\60\1\uffff\1\164\2\60\1\uffff\1\60\3\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\157\1\165\1\145\1\162\1\164\1\156\1\154\1\162\1\141\1\151\1\141\1\75\1\46\1\53\4\75\1\164\1\156\1\174\6\uffff\1\57\5\uffff\1\157\1\172\2\uffff\2\uffff\2\uffff\1\155\1\uffff\1\156\1\154\1\164\1\157\1\145\1\156\1\162\1\164\1\163\1\151\1\165\1\151\1\154\1\162\14\uffff\2\172\1\164\20\uffff\1\157\3\uffff\1\160\1\143\1\163\1\145\1\165\1\156\1\143\1\145\1\144\2\151\1\146\1\145\1\163\1\145\1\164\2\172\2\uffff\1\172\1\154\1\157\1\164\1\145\1\151\1\162\1\164\1\172\1\160\1\172\1\156\1\154\5\172\3\uffff\1\172\1\156\1\151\1\172\1\166\1\156\1\172\1\uffff\1\172\1\uffff\1\147\1\172\5\uffff\1\145\1\157\1\uffff\1\145\1\172\2\uffff\1\172\1\uffff\2\156\1\172\1\uffff\1\164\2\172\1\uffff\1\172\3\uffff";
    static final String DFA13_acceptS =
        "\26\uffff\1\36\1\37\1\40\1\42\1\43\1\44\1\uffff\1\51\1\52\1\53\1\54\1\56\2\uffff\1\60\1\61\2\uffff\1\65\1\66\1\uffff\1\60\16\uffff\1\23\1\35\1\24\1\25\1\41\1\26\1\27\1\46\1\30\1\47\1\31\1\50\3\uffff\1\34\1\55\1\36\1\37\1\40\1\42\1\43\1\44\1\63\1\64\1\45\1\51\1\52\1\53\1\54\1\56\1\uffff\1\61\1\62\1\65\22\uffff\1\32\1\33\22\uffff\1\21\1\22\1\57\7\uffff\1\14\1\uffff\1\15\2\uffff\1\12\1\13\1\16\1\17\1\20\2\uffff\1\6\2\uffff\1\7\1\10\1\uffff\1\11\3\uffff\1\5\3\uffff\1\4\1\uffff\1\2\1\3\1\1";
    static final String DFA13_specialS =
        "\1\0\45\uffff\1\2\1\1\u0084\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\51\2\50\2\51\1\50\22\51\1\50\1\14\1\46\3\51\1\15\1\47\1\26\1\27\1\30\1\16\1\31\1\32\1\33\1\34\12\45\1\17\1\51\1\20\1\21\1\22\1\51\1\35\32\44\1\36\1\51\1\37\1\43\1\44\1\51\1\23\1\42\1\1\1\44\1\7\1\2\2\44\1\24\4\44\1\12\1\44\1\4\1\44\1\3\1\5\1\10\1\6\1\13\1\11\3\44\1\40\1\25\1\41\uff82\51",
            "\1\52",
            "\1\55\23\uffff\1\54",
            "\1\56",
            "\1\57",
            "\1\61\6\uffff\1\60\7\uffff\1\62",
            "\1\63",
            "\1\64",
            "\1\65\11\uffff\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\74",
            "\1\75",
            "\1\77",
            "\1\100",
            "\1\102",
            "\1\104",
            "\1\106",
            "\1\107\7\uffff\1\110",
            "\1\111",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\121\4\uffff\1\122",
            "",
            "",
            "",
            "",
            "",
            "\1\131",
            "\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "\0\133",
            "\0\133",
            "",
            "",
            "\1\135",
            "",
            "\1\136",
            "\1\137",
            "\1\140\20\uffff\1\141",
            "\1\142\5\uffff\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150\11\uffff\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\161",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\162",
            "",
            "",
            "",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u008e",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0090",
            "\1\u0091",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0097",
            "\1\u0098",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u009a",
            "\1\u009b",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\u009e",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "",
            "",
            "",
            "\1\u00a0",
            "\1\u00a1",
            "",
            "\1\u00a2",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\u00a4",
            "\1\u00a5",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\21\53\1\u00a6\10\53",
            "",
            "\1\u00a8",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( Component | Function | Receiver | Receive | Return | False | Print | Sleep | Until | Elif | Else | Proc | Send | This | True | Wait | Nil | Var | ExclamationMarkEqualsSign | AmpersandAmpersand | PlusSignPlusSign | ColonEqualsSign | LessThanSignEqualsSign | EqualsSignEqualsSign | GreaterThanSignEqualsSign | At | If | VerticalLineVerticalLine | ExclamationMark | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | FullStop | Solidus | LessThanSign | EqualsSign | GreaterThanSign | CommercialAt | LeftSquareBracket | RightSquareBracket | LeftCurlyBracket | VerticalLine | RightCurlyBracket | RULE_TYPE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='c') ) {s = 1;}

                        else if ( (LA13_0=='f') ) {s = 2;}

                        else if ( (LA13_0=='r') ) {s = 3;}

                        else if ( (LA13_0=='p') ) {s = 4;}

                        else if ( (LA13_0=='s') ) {s = 5;}

                        else if ( (LA13_0=='u') ) {s = 6;}

                        else if ( (LA13_0=='e') ) {s = 7;}

                        else if ( (LA13_0=='t') ) {s = 8;}

                        else if ( (LA13_0=='w') ) {s = 9;}

                        else if ( (LA13_0=='n') ) {s = 10;}

                        else if ( (LA13_0=='v') ) {s = 11;}

                        else if ( (LA13_0=='!') ) {s = 12;}

                        else if ( (LA13_0=='&') ) {s = 13;}

                        else if ( (LA13_0=='+') ) {s = 14;}

                        else if ( (LA13_0==':') ) {s = 15;}

                        else if ( (LA13_0=='<') ) {s = 16;}

                        else if ( (LA13_0=='=') ) {s = 17;}

                        else if ( (LA13_0=='>') ) {s = 18;}

                        else if ( (LA13_0=='a') ) {s = 19;}

                        else if ( (LA13_0=='i') ) {s = 20;}

                        else if ( (LA13_0=='|') ) {s = 21;}

                        else if ( (LA13_0=='(') ) {s = 22;}

                        else if ( (LA13_0==')') ) {s = 23;}

                        else if ( (LA13_0=='*') ) {s = 24;}

                        else if ( (LA13_0==',') ) {s = 25;}

                        else if ( (LA13_0=='-') ) {s = 26;}

                        else if ( (LA13_0=='.') ) {s = 27;}

                        else if ( (LA13_0=='/') ) {s = 28;}

                        else if ( (LA13_0=='@') ) {s = 29;}

                        else if ( (LA13_0=='[') ) {s = 30;}

                        else if ( (LA13_0==']') ) {s = 31;}

                        else if ( (LA13_0=='{') ) {s = 32;}

                        else if ( (LA13_0=='}') ) {s = 33;}

                        else if ( (LA13_0=='b') ) {s = 34;}

                        else if ( (LA13_0=='^') ) {s = 35;}

                        else if ( ((LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||LA13_0=='d'||(LA13_0>='g' && LA13_0<='h')||(LA13_0>='j' && LA13_0<='m')||LA13_0=='o'||LA13_0=='q'||(LA13_0>='x' && LA13_0<='z')) ) {s = 36;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 37;}

                        else if ( (LA13_0=='\"') ) {s = 38;}

                        else if ( (LA13_0=='\'') ) {s = 39;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 40;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||(LA13_0>='#' && LA13_0<='%')||LA13_0==';'||LA13_0=='?'||LA13_0=='\\'||LA13_0=='`'||(LA13_0>='~' && LA13_0<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_39 = input.LA(1);

                        s = -1;
                        if ( ((LA13_39>='\u0000' && LA13_39<='\uFFFF')) ) {s = 91;}

                        else s = 41;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_38 = input.LA(1);

                        s = -1;
                        if ( ((LA13_38>='\u0000' && LA13_38<='\uFFFF')) ) {s = 91;}

                        else s = 41;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}