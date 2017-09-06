package com.sysma.goat.eclipse_plugin.ide.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGoatComponentsLexer extends Lexer {
    public static final int Elif=10;
    public static final int Var=15;
    public static final int True=14;
    public static final int False=8;
    public static final int LessThanSign=31;
    public static final int LeftParenthesis=25;
    public static final int This=13;
    public static final int RightSquareBracket=36;
    public static final int ExclamationMark=24;
    public static final int GreaterThanSign=33;
    public static final int RULE_ID=40;
    public static final int RightParenthesis=26;
    public static final int Receiver=6;
    public static final int ColonEqualsSign=18;
    public static final int GreaterThanSignEqualsSign=20;
    public static final int DigitZero=30;
    public static final int VerticalLine=38;
    public static final int PlusSign=27;
    public static final int RULE_INT=41;
    public static final int RULE_ML_COMMENT=43;
    public static final int LeftSquareBracket=35;
    public static final int If=22;
    public static final int VerticalLineVerticalLine=23;
    public static final int RULE_STRING=42;
    public static final int RULE_SL_COMMENT=44;
    public static final int Proc=12;
    public static final int Function=5;
    public static final int Comma=28;
    public static final int EqualsSign=32;
    public static final int At=21;
    public static final int AmpersandAmpersand=17;
    public static final int LessThanSignEqualsSign=19;
    public static final int RightCurlyBracket=39;
    public static final int Component=4;
    public static final int EOF=-1;
    public static final int FullStop=29;
    public static final int Return=7;
    public static final int RULE_WS=45;
    public static final int LeftCurlyBracket=37;
    public static final int RULE_ANY_OTHER=46;
    public static final int CommercialAt=34;
    public static final int Sleep=9;
    public static final int Else=11;
    public static final int ExclamationMarkEqualsSign=16;

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

    // $ANTLR start "Return"
    public final void mReturn() throws RecognitionException {
        try {
            int _type = Return;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:20:8: ( 'return' )
            // InternalGoatComponentsLexer.g:20:10: 'return'
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
            // InternalGoatComponentsLexer.g:22:7: ( 'false' )
            // InternalGoatComponentsLexer.g:22:9: 'false'
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

    // $ANTLR start "Sleep"
    public final void mSleep() throws RecognitionException {
        try {
            int _type = Sleep;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:24:7: ( 'sleep' )
            // InternalGoatComponentsLexer.g:24:9: 'sleep'
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

    // $ANTLR start "Elif"
    public final void mElif() throws RecognitionException {
        try {
            int _type = Elif;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:26:6: ( 'elif' )
            // InternalGoatComponentsLexer.g:26:8: 'elif'
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
            // InternalGoatComponentsLexer.g:28:6: ( 'else' )
            // InternalGoatComponentsLexer.g:28:8: 'else'
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
            // InternalGoatComponentsLexer.g:30:6: ( 'proc' )
            // InternalGoatComponentsLexer.g:30:8: 'proc'
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

    // $ANTLR start "This"
    public final void mThis() throws RecognitionException {
        try {
            int _type = This;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:32:6: ( 'this' )
            // InternalGoatComponentsLexer.g:32:8: 'this'
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
            // InternalGoatComponentsLexer.g:34:6: ( 'true' )
            // InternalGoatComponentsLexer.g:34:8: 'true'
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

    // $ANTLR start "Var"
    public final void mVar() throws RecognitionException {
        try {
            int _type = Var;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:36:5: ( 'var' )
            // InternalGoatComponentsLexer.g:36:7: 'var'
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
            // InternalGoatComponentsLexer.g:38:27: ( '!=' )
            // InternalGoatComponentsLexer.g:38:29: '!='
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
            // InternalGoatComponentsLexer.g:40:20: ( '&&' )
            // InternalGoatComponentsLexer.g:40:22: '&&'
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

    // $ANTLR start "ColonEqualsSign"
    public final void mColonEqualsSign() throws RecognitionException {
        try {
            int _type = ColonEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:42:17: ( ':=' )
            // InternalGoatComponentsLexer.g:42:19: ':='
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
            // InternalGoatComponentsLexer.g:44:24: ( '<=' )
            // InternalGoatComponentsLexer.g:44:26: '<='
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

    // $ANTLR start "GreaterThanSignEqualsSign"
    public final void mGreaterThanSignEqualsSign() throws RecognitionException {
        try {
            int _type = GreaterThanSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:46:27: ( '>=' )
            // InternalGoatComponentsLexer.g:46:29: '>='
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
            // InternalGoatComponentsLexer.g:48:4: ( 'at' )
            // InternalGoatComponentsLexer.g:48:6: 'at'
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
            // InternalGoatComponentsLexer.g:50:4: ( 'if' )
            // InternalGoatComponentsLexer.g:50:6: 'if'
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
            // InternalGoatComponentsLexer.g:52:26: ( '||' )
            // InternalGoatComponentsLexer.g:52:28: '||'
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
            // InternalGoatComponentsLexer.g:54:17: ( '!' )
            // InternalGoatComponentsLexer.g:54:19: '!'
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
            // InternalGoatComponentsLexer.g:56:17: ( '(' )
            // InternalGoatComponentsLexer.g:56:19: '('
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
            // InternalGoatComponentsLexer.g:58:18: ( ')' )
            // InternalGoatComponentsLexer.g:58:20: ')'
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

    // $ANTLR start "PlusSign"
    public final void mPlusSign() throws RecognitionException {
        try {
            int _type = PlusSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:60:10: ( '+' )
            // InternalGoatComponentsLexer.g:60:12: '+'
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
            // InternalGoatComponentsLexer.g:62:7: ( ',' )
            // InternalGoatComponentsLexer.g:62:9: ','
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

    // $ANTLR start "FullStop"
    public final void mFullStop() throws RecognitionException {
        try {
            int _type = FullStop;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:64:10: ( '.' )
            // InternalGoatComponentsLexer.g:64:12: '.'
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

    // $ANTLR start "DigitZero"
    public final void mDigitZero() throws RecognitionException {
        try {
            int _type = DigitZero;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:66:11: ( '0' )
            // InternalGoatComponentsLexer.g:66:13: '0'
            {
            match('0'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DigitZero"

    // $ANTLR start "LessThanSign"
    public final void mLessThanSign() throws RecognitionException {
        try {
            int _type = LessThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:68:14: ( '<' )
            // InternalGoatComponentsLexer.g:68:16: '<'
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
            // InternalGoatComponentsLexer.g:70:12: ( '=' )
            // InternalGoatComponentsLexer.g:70:14: '='
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
            // InternalGoatComponentsLexer.g:72:17: ( '>' )
            // InternalGoatComponentsLexer.g:72:19: '>'
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
            // InternalGoatComponentsLexer.g:74:14: ( '@' )
            // InternalGoatComponentsLexer.g:74:16: '@'
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
            // InternalGoatComponentsLexer.g:76:19: ( '[' )
            // InternalGoatComponentsLexer.g:76:21: '['
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
            // InternalGoatComponentsLexer.g:78:20: ( ']' )
            // InternalGoatComponentsLexer.g:78:22: ']'
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
            // InternalGoatComponentsLexer.g:80:18: ( '{' )
            // InternalGoatComponentsLexer.g:80:20: '{'
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
            // InternalGoatComponentsLexer.g:82:14: ( '|' )
            // InternalGoatComponentsLexer.g:82:16: '|'
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
            // InternalGoatComponentsLexer.g:84:19: ( '}' )
            // InternalGoatComponentsLexer.g:84:21: '}'
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

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:86:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalGoatComponentsLexer.g:86:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalGoatComponentsLexer.g:86:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalGoatComponentsLexer.g:86:11: '^'
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

            // InternalGoatComponentsLexer.g:86:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
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
            	    break loop2;
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
            // InternalGoatComponentsLexer.g:88:10: ( ( '0' .. '9' )+ )
            // InternalGoatComponentsLexer.g:88:12: ( '0' .. '9' )+
            {
            // InternalGoatComponentsLexer.g:88:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGoatComponentsLexer.g:88:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
            // InternalGoatComponentsLexer.g:90:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalGoatComponentsLexer.g:90:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalGoatComponentsLexer.g:90:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalGoatComponentsLexer.g:90:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalGoatComponentsLexer.g:90:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalGoatComponentsLexer.g:90:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGoatComponentsLexer.g:90:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalGoatComponentsLexer.g:90:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalGoatComponentsLexer.g:90:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalGoatComponentsLexer.g:90:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGoatComponentsLexer.g:90:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop5;
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
            // InternalGoatComponentsLexer.g:92:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalGoatComponentsLexer.g:92:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalGoatComponentsLexer.g:92:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGoatComponentsLexer.g:92:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
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
            // InternalGoatComponentsLexer.g:94:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalGoatComponentsLexer.g:94:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalGoatComponentsLexer.g:94:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGoatComponentsLexer.g:94:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop8;
                }
            } while (true);

            // InternalGoatComponentsLexer.g:94:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGoatComponentsLexer.g:94:41: ( '\\r' )? '\\n'
                    {
                    // InternalGoatComponentsLexer.g:94:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalGoatComponentsLexer.g:94:41: '\\r'
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
            // InternalGoatComponentsLexer.g:96:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalGoatComponentsLexer.g:96:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalGoatComponentsLexer.g:96:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
            // InternalGoatComponentsLexer.g:98:16: ( . )
            // InternalGoatComponentsLexer.g:98:18: .
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
        // InternalGoatComponentsLexer.g:1:8: ( Component | Function | Receiver | Return | False | Sleep | Elif | Else | Proc | This | True | Var | ExclamationMarkEqualsSign | AmpersandAmpersand | ColonEqualsSign | LessThanSignEqualsSign | GreaterThanSignEqualsSign | At | If | VerticalLineVerticalLine | ExclamationMark | LeftParenthesis | RightParenthesis | PlusSign | Comma | FullStop | DigitZero | LessThanSign | EqualsSign | GreaterThanSign | CommercialAt | LeftSquareBracket | RightSquareBracket | LeftCurlyBracket | VerticalLine | RightCurlyBracket | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=43;
        alt12 = dfa12.predict(input);
        switch (alt12) {
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
                // InternalGoatComponentsLexer.g:1:38: Return
                {
                mReturn(); 

                }
                break;
            case 5 :
                // InternalGoatComponentsLexer.g:1:45: False
                {
                mFalse(); 

                }
                break;
            case 6 :
                // InternalGoatComponentsLexer.g:1:51: Sleep
                {
                mSleep(); 

                }
                break;
            case 7 :
                // InternalGoatComponentsLexer.g:1:57: Elif
                {
                mElif(); 

                }
                break;
            case 8 :
                // InternalGoatComponentsLexer.g:1:62: Else
                {
                mElse(); 

                }
                break;
            case 9 :
                // InternalGoatComponentsLexer.g:1:67: Proc
                {
                mProc(); 

                }
                break;
            case 10 :
                // InternalGoatComponentsLexer.g:1:72: This
                {
                mThis(); 

                }
                break;
            case 11 :
                // InternalGoatComponentsLexer.g:1:77: True
                {
                mTrue(); 

                }
                break;
            case 12 :
                // InternalGoatComponentsLexer.g:1:82: Var
                {
                mVar(); 

                }
                break;
            case 13 :
                // InternalGoatComponentsLexer.g:1:86: ExclamationMarkEqualsSign
                {
                mExclamationMarkEqualsSign(); 

                }
                break;
            case 14 :
                // InternalGoatComponentsLexer.g:1:112: AmpersandAmpersand
                {
                mAmpersandAmpersand(); 

                }
                break;
            case 15 :
                // InternalGoatComponentsLexer.g:1:131: ColonEqualsSign
                {
                mColonEqualsSign(); 

                }
                break;
            case 16 :
                // InternalGoatComponentsLexer.g:1:147: LessThanSignEqualsSign
                {
                mLessThanSignEqualsSign(); 

                }
                break;
            case 17 :
                // InternalGoatComponentsLexer.g:1:170: GreaterThanSignEqualsSign
                {
                mGreaterThanSignEqualsSign(); 

                }
                break;
            case 18 :
                // InternalGoatComponentsLexer.g:1:196: At
                {
                mAt(); 

                }
                break;
            case 19 :
                // InternalGoatComponentsLexer.g:1:199: If
                {
                mIf(); 

                }
                break;
            case 20 :
                // InternalGoatComponentsLexer.g:1:202: VerticalLineVerticalLine
                {
                mVerticalLineVerticalLine(); 

                }
                break;
            case 21 :
                // InternalGoatComponentsLexer.g:1:227: ExclamationMark
                {
                mExclamationMark(); 

                }
                break;
            case 22 :
                // InternalGoatComponentsLexer.g:1:243: LeftParenthesis
                {
                mLeftParenthesis(); 

                }
                break;
            case 23 :
                // InternalGoatComponentsLexer.g:1:259: RightParenthesis
                {
                mRightParenthesis(); 

                }
                break;
            case 24 :
                // InternalGoatComponentsLexer.g:1:276: PlusSign
                {
                mPlusSign(); 

                }
                break;
            case 25 :
                // InternalGoatComponentsLexer.g:1:285: Comma
                {
                mComma(); 

                }
                break;
            case 26 :
                // InternalGoatComponentsLexer.g:1:291: FullStop
                {
                mFullStop(); 

                }
                break;
            case 27 :
                // InternalGoatComponentsLexer.g:1:300: DigitZero
                {
                mDigitZero(); 

                }
                break;
            case 28 :
                // InternalGoatComponentsLexer.g:1:310: LessThanSign
                {
                mLessThanSign(); 

                }
                break;
            case 29 :
                // InternalGoatComponentsLexer.g:1:323: EqualsSign
                {
                mEqualsSign(); 

                }
                break;
            case 30 :
                // InternalGoatComponentsLexer.g:1:334: GreaterThanSign
                {
                mGreaterThanSign(); 

                }
                break;
            case 31 :
                // InternalGoatComponentsLexer.g:1:350: CommercialAt
                {
                mCommercialAt(); 

                }
                break;
            case 32 :
                // InternalGoatComponentsLexer.g:1:363: LeftSquareBracket
                {
                mLeftSquareBracket(); 

                }
                break;
            case 33 :
                // InternalGoatComponentsLexer.g:1:381: RightSquareBracket
                {
                mRightSquareBracket(); 

                }
                break;
            case 34 :
                // InternalGoatComponentsLexer.g:1:400: LeftCurlyBracket
                {
                mLeftCurlyBracket(); 

                }
                break;
            case 35 :
                // InternalGoatComponentsLexer.g:1:417: VerticalLine
                {
                mVerticalLine(); 

                }
                break;
            case 36 :
                // InternalGoatComponentsLexer.g:1:430: RightCurlyBracket
                {
                mRightCurlyBracket(); 

                }
                break;
            case 37 :
                // InternalGoatComponentsLexer.g:1:448: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 38 :
                // InternalGoatComponentsLexer.g:1:456: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 39 :
                // InternalGoatComponentsLexer.g:1:465: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 40 :
                // InternalGoatComponentsLexer.g:1:477: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 41 :
                // InternalGoatComponentsLexer.g:1:493: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 42 :
                // InternalGoatComponentsLexer.g:1:509: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 43 :
                // InternalGoatComponentsLexer.g:1:517: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\10\46\1\61\2\44\1\65\1\67\2\46\1\73\5\uffff\1\101\6\uffff\1\44\2\uffff\3\44\2\uffff\1\46\1\uffff\11\46\10\uffff\1\131\1\132\23\uffff\13\46\1\146\2\uffff\6\46\1\155\1\156\1\157\1\160\1\161\1\uffff\2\46\1\164\2\46\1\167\5\uffff\2\46\1\uffff\1\46\1\173\1\uffff\3\46\1\uffff\1\46\1\u0080\1\u0081\1\u0082\3\uffff";
    static final String DFA12_eofS =
        "\u0083\uffff";
    static final String DFA12_minS =
        "\1\0\1\157\1\141\1\145\2\154\1\162\1\150\1\141\1\75\1\46\3\75\1\164\1\146\1\174\5\uffff\1\60\6\uffff\1\101\2\uffff\2\0\1\52\2\uffff\1\155\1\uffff\1\156\1\154\1\143\1\145\1\151\1\157\1\151\1\165\1\162\10\uffff\2\60\23\uffff\1\160\1\143\1\163\1\145\1\165\1\145\1\146\1\145\1\143\1\163\1\145\1\60\2\uffff\1\157\1\164\1\145\1\151\1\162\1\160\5\60\1\uffff\1\156\1\151\1\60\1\166\1\156\1\60\5\uffff\1\145\1\157\1\uffff\1\145\1\60\1\uffff\2\156\1\162\1\uffff\1\164\3\60\3\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\157\1\165\1\145\2\154\2\162\1\141\1\75\1\46\3\75\1\164\1\146\1\174\5\uffff\1\71\6\uffff\1\172\2\uffff\2\uffff\1\57\2\uffff\1\155\1\uffff\1\156\1\154\1\164\1\145\1\163\1\157\1\151\1\165\1\162\10\uffff\2\172\23\uffff\1\160\1\143\1\163\1\145\1\165\1\145\1\146\1\145\1\143\1\163\1\145\1\172\2\uffff\1\157\1\164\1\145\1\151\1\162\1\160\5\172\1\uffff\1\156\1\151\1\172\1\166\1\156\1\172\5\uffff\1\145\1\157\1\uffff\1\145\1\172\1\uffff\2\156\1\162\1\uffff\1\164\3\172\3\uffff";
    static final String DFA12_acceptS =
        "\21\uffff\1\26\1\27\1\30\1\31\1\32\1\uffff\1\35\1\37\1\40\1\41\1\42\1\44\1\uffff\1\45\1\46\3\uffff\1\52\1\53\1\uffff\1\45\11\uffff\1\15\1\25\1\16\1\17\1\20\1\34\1\21\1\36\2\uffff\1\24\1\43\1\26\1\27\1\30\1\31\1\32\1\33\1\46\1\35\1\37\1\40\1\41\1\42\1\44\1\47\1\50\1\51\1\52\14\uffff\1\22\1\23\13\uffff\1\14\6\uffff\1\7\1\10\1\11\1\12\1\13\2\uffff\1\5\2\uffff\1\6\3\uffff\1\4\4\uffff\1\2\1\3\1\1";
    static final String DFA12_specialS =
        "\1\2\37\uffff\1\1\1\0\141\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\44\2\43\2\44\1\43\22\44\1\43\1\11\1\40\3\44\1\12\1\41\1\21\1\22\1\44\1\23\1\24\1\44\1\25\1\42\1\26\11\37\1\13\1\44\1\14\1\27\1\15\1\44\1\30\32\36\1\31\1\44\1\32\1\35\1\36\1\44\1\16\1\36\1\1\1\36\1\5\1\2\2\36\1\17\6\36\1\6\1\36\1\3\1\4\1\7\1\36\1\10\4\36\1\33\1\20\1\34\uff82\44",
            "\1\45",
            "\1\50\23\uffff\1\47",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55\11\uffff\1\56",
            "\1\57",
            "\1\60",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\66",
            "\1\70",
            "\1\71",
            "\1\72",
            "",
            "",
            "",
            "",
            "",
            "\12\102",
            "",
            "",
            "",
            "",
            "",
            "",
            "\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "\0\111",
            "\0\111",
            "\1\112\4\uffff\1\113",
            "",
            "",
            "\1\115",
            "",
            "\1\116",
            "\1\117",
            "\1\120\20\uffff\1\121",
            "\1\122",
            "\1\123\11\uffff\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
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
            "",
            "",
            "",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\162",
            "\1\163",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\165",
            "\1\166",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "",
            "",
            "",
            "\1\170",
            "\1\171",
            "",
            "\1\172",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\174",
            "\1\175",
            "\1\176",
            "",
            "\1\177",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( Component | Function | Receiver | Return | False | Sleep | Elif | Else | Proc | This | True | Var | ExclamationMarkEqualsSign | AmpersandAmpersand | ColonEqualsSign | LessThanSignEqualsSign | GreaterThanSignEqualsSign | At | If | VerticalLineVerticalLine | ExclamationMark | LeftParenthesis | RightParenthesis | PlusSign | Comma | FullStop | DigitZero | LessThanSign | EqualsSign | GreaterThanSign | CommercialAt | LeftSquareBracket | RightSquareBracket | LeftCurlyBracket | VerticalLine | RightCurlyBracket | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_33 = input.LA(1);

                        s = -1;
                        if ( ((LA12_33>='\u0000' && LA12_33<='\uFFFF')) ) {s = 73;}

                        else s = 36;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_32 = input.LA(1);

                        s = -1;
                        if ( ((LA12_32>='\u0000' && LA12_32<='\uFFFF')) ) {s = 73;}

                        else s = 36;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='c') ) {s = 1;}

                        else if ( (LA12_0=='f') ) {s = 2;}

                        else if ( (LA12_0=='r') ) {s = 3;}

                        else if ( (LA12_0=='s') ) {s = 4;}

                        else if ( (LA12_0=='e') ) {s = 5;}

                        else if ( (LA12_0=='p') ) {s = 6;}

                        else if ( (LA12_0=='t') ) {s = 7;}

                        else if ( (LA12_0=='v') ) {s = 8;}

                        else if ( (LA12_0=='!') ) {s = 9;}

                        else if ( (LA12_0=='&') ) {s = 10;}

                        else if ( (LA12_0==':') ) {s = 11;}

                        else if ( (LA12_0=='<') ) {s = 12;}

                        else if ( (LA12_0=='>') ) {s = 13;}

                        else if ( (LA12_0=='a') ) {s = 14;}

                        else if ( (LA12_0=='i') ) {s = 15;}

                        else if ( (LA12_0=='|') ) {s = 16;}

                        else if ( (LA12_0=='(') ) {s = 17;}

                        else if ( (LA12_0==')') ) {s = 18;}

                        else if ( (LA12_0=='+') ) {s = 19;}

                        else if ( (LA12_0==',') ) {s = 20;}

                        else if ( (LA12_0=='.') ) {s = 21;}

                        else if ( (LA12_0=='0') ) {s = 22;}

                        else if ( (LA12_0=='=') ) {s = 23;}

                        else if ( (LA12_0=='@') ) {s = 24;}

                        else if ( (LA12_0=='[') ) {s = 25;}

                        else if ( (LA12_0==']') ) {s = 26;}

                        else if ( (LA12_0=='{') ) {s = 27;}

                        else if ( (LA12_0=='}') ) {s = 28;}

                        else if ( (LA12_0=='^') ) {s = 29;}

                        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='b'||LA12_0=='d'||(LA12_0>='g' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='o')||LA12_0=='q'||LA12_0=='u'||(LA12_0>='w' && LA12_0<='z')) ) {s = 30;}

                        else if ( ((LA12_0>='1' && LA12_0<='9')) ) {s = 31;}

                        else if ( (LA12_0=='\"') ) {s = 32;}

                        else if ( (LA12_0=='\'') ) {s = 33;}

                        else if ( (LA12_0=='/') ) {s = 34;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 35;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||(LA12_0>='#' && LA12_0<='%')||LA12_0=='*'||LA12_0=='-'||LA12_0==';'||LA12_0=='?'||LA12_0=='\\'||LA12_0=='`'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 36;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}