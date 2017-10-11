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
    public static final int Var=24;
    public static final int True=22;
    public static final int Process=8;
    public static final int False=12;
    public static final int LessThanSign=46;
    public static final int Comp=17;
    public static final int Send=21;
    public static final int Print=13;
    public static final int PercentSign=35;
    public static final int LeftParenthesis=36;
    public static final int Spawn=14;
    public static final int RightSquareBracket=51;
    public static final int ExclamationMark=34;
    public static final int GreaterThanSign=48;
    public static final int RULE_ID=56;
    public static final int RightParenthesis=37;
    public static final int Receiver=7;
    public static final int ColonEqualsSign=28;
    public static final int GreaterThanSignEqualsSign=31;
    public static final int EqualsSignEqualsSign=30;
    public static final int RULE_TYPE=55;
    public static final int VerticalLine=53;
    public static final int PlusSign=39;
    public static final int RULE_INT=57;
    public static final int RULE_ML_COMMENT=59;
    public static final int LeftSquareBracket=50;
    public static final int If=32;
    public static final int Set=23;
    public static final int VerticalLineVerticalLine=33;
    public static final int RULE_STRING=58;
    public static final int Case=16;
    public static final int RULE_SL_COMMENT=60;
    public static final int Proc=20;
    public static final int Function=6;
    public static final int Comma=40;
    public static final int EqualsSign=47;
    public static final int HyphenMinus=41;
    public static final int AmpersandAmpersand=26;
    public static final int Waitfor=10;
    public static final int Infrastructure=4;
    public static final int LessThanSignEqualsSign=29;
    public static final int Solidus=43;
    public static final int Colon=44;
    public static final int RightCurlyBracket=54;
    public static final int Component=5;
    public static final int EOF=-1;
    public static final int Asterisk=38;
    public static final int Loop=19;
    public static final int Call=15;
    public static final int FullStop=42;
    public static final int Return=11;
    public static final int RULE_WS=61;
    public static final int LeftCurlyBracket=52;
    public static final int RULE_ANY_OTHER=62;
    public static final int CommercialAt=49;
    public static final int Semicolon=45;
    public static final int PlusSignPlusSign=27;
    public static final int Receive=9;
    public static final int Else=18;
    public static final int ExclamationMarkEqualsSign=25;

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

    // $ANTLR start "Infrastructure"
    public final void mInfrastructure() throws RecognitionException {
        try {
            int _type = Infrastructure;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:14:16: ( 'infrastructure' )
            // InternalGoatComponentsLexer.g:14:18: 'infrastructure'
            {
            match("infrastructure"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Infrastructure"

    // $ANTLR start "Component"
    public final void mComponent() throws RecognitionException {
        try {
            int _type = Component;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:16:11: ( 'component' )
            // InternalGoatComponentsLexer.g:16:13: 'component'
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
            // InternalGoatComponentsLexer.g:18:10: ( 'function' )
            // InternalGoatComponentsLexer.g:18:12: 'function'
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
            // InternalGoatComponentsLexer.g:20:10: ( 'receiver' )
            // InternalGoatComponentsLexer.g:20:12: 'receiver'
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

    // $ANTLR start "Process"
    public final void mProcess() throws RecognitionException {
        try {
            int _type = Process;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:22:9: ( 'process' )
            // InternalGoatComponentsLexer.g:22:11: 'process'
            {
            match("process"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Process"

    // $ANTLR start "Receive"
    public final void mReceive() throws RecognitionException {
        try {
            int _type = Receive;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:24:9: ( 'receive' )
            // InternalGoatComponentsLexer.g:24:11: 'receive'
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

    // $ANTLR start "Waitfor"
    public final void mWaitfor() throws RecognitionException {
        try {
            int _type = Waitfor;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:26:9: ( 'waitfor' )
            // InternalGoatComponentsLexer.g:26:11: 'waitfor'
            {
            match("waitfor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Waitfor"

    // $ANTLR start "Return"
    public final void mReturn() throws RecognitionException {
        try {
            int _type = Return;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:28:8: ( 'return' )
            // InternalGoatComponentsLexer.g:28:10: 'return'
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
            // InternalGoatComponentsLexer.g:30:7: ( 'false' )
            // InternalGoatComponentsLexer.g:30:9: 'false'
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
            // InternalGoatComponentsLexer.g:32:7: ( 'print' )
            // InternalGoatComponentsLexer.g:32:9: 'print'
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

    // $ANTLR start "Spawn"
    public final void mSpawn() throws RecognitionException {
        try {
            int _type = Spawn;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:34:7: ( 'spawn' )
            // InternalGoatComponentsLexer.g:34:9: 'spawn'
            {
            match("spawn"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Spawn"

    // $ANTLR start "Call"
    public final void mCall() throws RecognitionException {
        try {
            int _type = Call;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:36:6: ( 'call' )
            // InternalGoatComponentsLexer.g:36:8: 'call'
            {
            match("call"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Call"

    // $ANTLR start "Case"
    public final void mCase() throws RecognitionException {
        try {
            int _type = Case;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:38:6: ( 'case' )
            // InternalGoatComponentsLexer.g:38:8: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Case"

    // $ANTLR start "Comp"
    public final void mComp() throws RecognitionException {
        try {
            int _type = Comp;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:40:6: ( 'comp' )
            // InternalGoatComponentsLexer.g:40:8: 'comp'
            {
            match("comp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Comp"

    // $ANTLR start "Else"
    public final void mElse() throws RecognitionException {
        try {
            int _type = Else;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:42:6: ( 'else' )
            // InternalGoatComponentsLexer.g:42:8: 'else'
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

    // $ANTLR start "Loop"
    public final void mLoop() throws RecognitionException {
        try {
            int _type = Loop;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:44:6: ( 'loop' )
            // InternalGoatComponentsLexer.g:44:8: 'loop'
            {
            match("loop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Loop"

    // $ANTLR start "Proc"
    public final void mProc() throws RecognitionException {
        try {
            int _type = Proc;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:46:6: ( 'proc' )
            // InternalGoatComponentsLexer.g:46:8: 'proc'
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
            // InternalGoatComponentsLexer.g:48:6: ( 'send' )
            // InternalGoatComponentsLexer.g:48:8: 'send'
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

    // $ANTLR start "True"
    public final void mTrue() throws RecognitionException {
        try {
            int _type = True;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:50:6: ( 'true' )
            // InternalGoatComponentsLexer.g:50:8: 'true'
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

    // $ANTLR start "Set"
    public final void mSet() throws RecognitionException {
        try {
            int _type = Set;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:52:5: ( 'set' )
            // InternalGoatComponentsLexer.g:52:7: 'set'
            {
            match("set"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Set"

    // $ANTLR start "Var"
    public final void mVar() throws RecognitionException {
        try {
            int _type = Var;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:54:5: ( 'var' )
            // InternalGoatComponentsLexer.g:54:7: 'var'
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
            // InternalGoatComponentsLexer.g:56:27: ( '!=' )
            // InternalGoatComponentsLexer.g:56:29: '!='
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
            // InternalGoatComponentsLexer.g:58:20: ( '&&' )
            // InternalGoatComponentsLexer.g:58:22: '&&'
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
            // InternalGoatComponentsLexer.g:60:18: ( '++' )
            // InternalGoatComponentsLexer.g:60:20: '++'
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
            // InternalGoatComponentsLexer.g:62:17: ( ':=' )
            // InternalGoatComponentsLexer.g:62:19: ':='
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
            // InternalGoatComponentsLexer.g:64:24: ( '<=' )
            // InternalGoatComponentsLexer.g:64:26: '<='
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
            // InternalGoatComponentsLexer.g:66:22: ( '==' )
            // InternalGoatComponentsLexer.g:66:24: '=='
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
            // InternalGoatComponentsLexer.g:68:27: ( '>=' )
            // InternalGoatComponentsLexer.g:68:29: '>='
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

    // $ANTLR start "If"
    public final void mIf() throws RecognitionException {
        try {
            int _type = If;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:70:4: ( 'if' )
            // InternalGoatComponentsLexer.g:70:6: 'if'
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
            // InternalGoatComponentsLexer.g:72:26: ( '||' )
            // InternalGoatComponentsLexer.g:72:28: '||'
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
            // InternalGoatComponentsLexer.g:74:17: ( '!' )
            // InternalGoatComponentsLexer.g:74:19: '!'
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

    // $ANTLR start "PercentSign"
    public final void mPercentSign() throws RecognitionException {
        try {
            int _type = PercentSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:76:13: ( '%' )
            // InternalGoatComponentsLexer.g:76:15: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PercentSign"

    // $ANTLR start "LeftParenthesis"
    public final void mLeftParenthesis() throws RecognitionException {
        try {
            int _type = LeftParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:78:17: ( '(' )
            // InternalGoatComponentsLexer.g:78:19: '('
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
            // InternalGoatComponentsLexer.g:80:18: ( ')' )
            // InternalGoatComponentsLexer.g:80:20: ')'
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
            // InternalGoatComponentsLexer.g:82:10: ( '*' )
            // InternalGoatComponentsLexer.g:82:12: '*'
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
            // InternalGoatComponentsLexer.g:84:10: ( '+' )
            // InternalGoatComponentsLexer.g:84:12: '+'
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
            // InternalGoatComponentsLexer.g:86:7: ( ',' )
            // InternalGoatComponentsLexer.g:86:9: ','
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
            // InternalGoatComponentsLexer.g:88:13: ( '-' )
            // InternalGoatComponentsLexer.g:88:15: '-'
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
            // InternalGoatComponentsLexer.g:90:10: ( '.' )
            // InternalGoatComponentsLexer.g:90:12: '.'
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
            // InternalGoatComponentsLexer.g:92:9: ( '/' )
            // InternalGoatComponentsLexer.g:92:11: '/'
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

    // $ANTLR start "Colon"
    public final void mColon() throws RecognitionException {
        try {
            int _type = Colon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:94:7: ( ':' )
            // InternalGoatComponentsLexer.g:94:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Colon"

    // $ANTLR start "Semicolon"
    public final void mSemicolon() throws RecognitionException {
        try {
            int _type = Semicolon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:96:11: ( ';' )
            // InternalGoatComponentsLexer.g:96:13: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Semicolon"

    // $ANTLR start "LessThanSign"
    public final void mLessThanSign() throws RecognitionException {
        try {
            int _type = LessThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponentsLexer.g:98:14: ( '<' )
            // InternalGoatComponentsLexer.g:98:16: '<'
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
            // InternalGoatComponentsLexer.g:100:12: ( '=' )
            // InternalGoatComponentsLexer.g:100:14: '='
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
            // InternalGoatComponentsLexer.g:102:17: ( '>' )
            // InternalGoatComponentsLexer.g:102:19: '>'
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
            // InternalGoatComponentsLexer.g:104:14: ( '@' )
            // InternalGoatComponentsLexer.g:104:16: '@'
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
            // InternalGoatComponentsLexer.g:106:19: ( '[' )
            // InternalGoatComponentsLexer.g:106:21: '['
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
            // InternalGoatComponentsLexer.g:108:20: ( ']' )
            // InternalGoatComponentsLexer.g:108:22: ']'
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
            // InternalGoatComponentsLexer.g:110:18: ( '{' )
            // InternalGoatComponentsLexer.g:110:20: '{'
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
            // InternalGoatComponentsLexer.g:112:14: ( '|' )
            // InternalGoatComponentsLexer.g:112:16: '|'
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
            // InternalGoatComponentsLexer.g:114:19: ( '}' )
            // InternalGoatComponentsLexer.g:114:21: '}'
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
            // InternalGoatComponentsLexer.g:116:11: ( ( 'int' | 'string' | 'bool' ) )
            // InternalGoatComponentsLexer.g:116:13: ( 'int' | 'string' | 'bool' )
            {
            // InternalGoatComponentsLexer.g:116:13: ( 'int' | 'string' | 'bool' )
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
                    // InternalGoatComponentsLexer.g:116:14: 'int'
                    {
                    match("int"); 


                    }
                    break;
                case 2 :
                    // InternalGoatComponentsLexer.g:116:20: 'string'
                    {
                    match("string"); 


                    }
                    break;
                case 3 :
                    // InternalGoatComponentsLexer.g:116:29: 'bool'
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
            // InternalGoatComponentsLexer.g:118:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalGoatComponentsLexer.g:118:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalGoatComponentsLexer.g:118:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalGoatComponentsLexer.g:118:11: '^'
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

            // InternalGoatComponentsLexer.g:118:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // InternalGoatComponentsLexer.g:120:10: ( ( '0' .. '9' )+ )
            // InternalGoatComponentsLexer.g:120:12: ( '0' .. '9' )+
            {
            // InternalGoatComponentsLexer.g:120:12: ( '0' .. '9' )+
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
            	    // InternalGoatComponentsLexer.g:120:13: '0' .. '9'
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
            // InternalGoatComponentsLexer.g:122:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalGoatComponentsLexer.g:122:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalGoatComponentsLexer.g:122:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalGoatComponentsLexer.g:122:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalGoatComponentsLexer.g:122:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalGoatComponentsLexer.g:122:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGoatComponentsLexer.g:122:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalGoatComponentsLexer.g:122:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalGoatComponentsLexer.g:122:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalGoatComponentsLexer.g:122:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGoatComponentsLexer.g:122:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalGoatComponentsLexer.g:124:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalGoatComponentsLexer.g:124:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalGoatComponentsLexer.g:124:24: ( options {greedy=false; } : . )*
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
            	    // InternalGoatComponentsLexer.g:124:52: .
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
            // InternalGoatComponentsLexer.g:126:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalGoatComponentsLexer.g:126:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalGoatComponentsLexer.g:126:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGoatComponentsLexer.g:126:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalGoatComponentsLexer.g:126:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalGoatComponentsLexer.g:126:41: ( '\\r' )? '\\n'
                    {
                    // InternalGoatComponentsLexer.g:126:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalGoatComponentsLexer.g:126:41: '\\r'
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
            // InternalGoatComponentsLexer.g:128:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalGoatComponentsLexer.g:128:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalGoatComponentsLexer.g:128:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalGoatComponentsLexer.g:130:16: ( . )
            // InternalGoatComponentsLexer.g:130:18: .
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
        // InternalGoatComponentsLexer.g:1:8: ( Infrastructure | Component | Function | Receiver | Process | Receive | Waitfor | Return | False | Print | Spawn | Call | Case | Comp | Else | Loop | Proc | Send | True | Set | Var | ExclamationMarkEqualsSign | AmpersandAmpersand | PlusSignPlusSign | ColonEqualsSign | LessThanSignEqualsSign | EqualsSignEqualsSign | GreaterThanSignEqualsSign | If | VerticalLineVerticalLine | ExclamationMark | PercentSign | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | FullStop | Solidus | Colon | Semicolon | LessThanSign | EqualsSign | GreaterThanSign | CommercialAt | LeftSquareBracket | RightSquareBracket | LeftCurlyBracket | VerticalLine | RightCurlyBracket | RULE_TYPE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=59;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalGoatComponentsLexer.g:1:10: Infrastructure
                {
                mInfrastructure(); 

                }
                break;
            case 2 :
                // InternalGoatComponentsLexer.g:1:25: Component
                {
                mComponent(); 

                }
                break;
            case 3 :
                // InternalGoatComponentsLexer.g:1:35: Function
                {
                mFunction(); 

                }
                break;
            case 4 :
                // InternalGoatComponentsLexer.g:1:44: Receiver
                {
                mReceiver(); 

                }
                break;
            case 5 :
                // InternalGoatComponentsLexer.g:1:53: Process
                {
                mProcess(); 

                }
                break;
            case 6 :
                // InternalGoatComponentsLexer.g:1:61: Receive
                {
                mReceive(); 

                }
                break;
            case 7 :
                // InternalGoatComponentsLexer.g:1:69: Waitfor
                {
                mWaitfor(); 

                }
                break;
            case 8 :
                // InternalGoatComponentsLexer.g:1:77: Return
                {
                mReturn(); 

                }
                break;
            case 9 :
                // InternalGoatComponentsLexer.g:1:84: False
                {
                mFalse(); 

                }
                break;
            case 10 :
                // InternalGoatComponentsLexer.g:1:90: Print
                {
                mPrint(); 

                }
                break;
            case 11 :
                // InternalGoatComponentsLexer.g:1:96: Spawn
                {
                mSpawn(); 

                }
                break;
            case 12 :
                // InternalGoatComponentsLexer.g:1:102: Call
                {
                mCall(); 

                }
                break;
            case 13 :
                // InternalGoatComponentsLexer.g:1:107: Case
                {
                mCase(); 

                }
                break;
            case 14 :
                // InternalGoatComponentsLexer.g:1:112: Comp
                {
                mComp(); 

                }
                break;
            case 15 :
                // InternalGoatComponentsLexer.g:1:117: Else
                {
                mElse(); 

                }
                break;
            case 16 :
                // InternalGoatComponentsLexer.g:1:122: Loop
                {
                mLoop(); 

                }
                break;
            case 17 :
                // InternalGoatComponentsLexer.g:1:127: Proc
                {
                mProc(); 

                }
                break;
            case 18 :
                // InternalGoatComponentsLexer.g:1:132: Send
                {
                mSend(); 

                }
                break;
            case 19 :
                // InternalGoatComponentsLexer.g:1:137: True
                {
                mTrue(); 

                }
                break;
            case 20 :
                // InternalGoatComponentsLexer.g:1:142: Set
                {
                mSet(); 

                }
                break;
            case 21 :
                // InternalGoatComponentsLexer.g:1:146: Var
                {
                mVar(); 

                }
                break;
            case 22 :
                // InternalGoatComponentsLexer.g:1:150: ExclamationMarkEqualsSign
                {
                mExclamationMarkEqualsSign(); 

                }
                break;
            case 23 :
                // InternalGoatComponentsLexer.g:1:176: AmpersandAmpersand
                {
                mAmpersandAmpersand(); 

                }
                break;
            case 24 :
                // InternalGoatComponentsLexer.g:1:195: PlusSignPlusSign
                {
                mPlusSignPlusSign(); 

                }
                break;
            case 25 :
                // InternalGoatComponentsLexer.g:1:212: ColonEqualsSign
                {
                mColonEqualsSign(); 

                }
                break;
            case 26 :
                // InternalGoatComponentsLexer.g:1:228: LessThanSignEqualsSign
                {
                mLessThanSignEqualsSign(); 

                }
                break;
            case 27 :
                // InternalGoatComponentsLexer.g:1:251: EqualsSignEqualsSign
                {
                mEqualsSignEqualsSign(); 

                }
                break;
            case 28 :
                // InternalGoatComponentsLexer.g:1:272: GreaterThanSignEqualsSign
                {
                mGreaterThanSignEqualsSign(); 

                }
                break;
            case 29 :
                // InternalGoatComponentsLexer.g:1:298: If
                {
                mIf(); 

                }
                break;
            case 30 :
                // InternalGoatComponentsLexer.g:1:301: VerticalLineVerticalLine
                {
                mVerticalLineVerticalLine(); 

                }
                break;
            case 31 :
                // InternalGoatComponentsLexer.g:1:326: ExclamationMark
                {
                mExclamationMark(); 

                }
                break;
            case 32 :
                // InternalGoatComponentsLexer.g:1:342: PercentSign
                {
                mPercentSign(); 

                }
                break;
            case 33 :
                // InternalGoatComponentsLexer.g:1:354: LeftParenthesis
                {
                mLeftParenthesis(); 

                }
                break;
            case 34 :
                // InternalGoatComponentsLexer.g:1:370: RightParenthesis
                {
                mRightParenthesis(); 

                }
                break;
            case 35 :
                // InternalGoatComponentsLexer.g:1:387: Asterisk
                {
                mAsterisk(); 

                }
                break;
            case 36 :
                // InternalGoatComponentsLexer.g:1:396: PlusSign
                {
                mPlusSign(); 

                }
                break;
            case 37 :
                // InternalGoatComponentsLexer.g:1:405: Comma
                {
                mComma(); 

                }
                break;
            case 38 :
                // InternalGoatComponentsLexer.g:1:411: HyphenMinus
                {
                mHyphenMinus(); 

                }
                break;
            case 39 :
                // InternalGoatComponentsLexer.g:1:423: FullStop
                {
                mFullStop(); 

                }
                break;
            case 40 :
                // InternalGoatComponentsLexer.g:1:432: Solidus
                {
                mSolidus(); 

                }
                break;
            case 41 :
                // InternalGoatComponentsLexer.g:1:440: Colon
                {
                mColon(); 

                }
                break;
            case 42 :
                // InternalGoatComponentsLexer.g:1:446: Semicolon
                {
                mSemicolon(); 

                }
                break;
            case 43 :
                // InternalGoatComponentsLexer.g:1:456: LessThanSign
                {
                mLessThanSign(); 

                }
                break;
            case 44 :
                // InternalGoatComponentsLexer.g:1:469: EqualsSign
                {
                mEqualsSign(); 

                }
                break;
            case 45 :
                // InternalGoatComponentsLexer.g:1:480: GreaterThanSign
                {
                mGreaterThanSign(); 

                }
                break;
            case 46 :
                // InternalGoatComponentsLexer.g:1:496: CommercialAt
                {
                mCommercialAt(); 

                }
                break;
            case 47 :
                // InternalGoatComponentsLexer.g:1:509: LeftSquareBracket
                {
                mLeftSquareBracket(); 

                }
                break;
            case 48 :
                // InternalGoatComponentsLexer.g:1:527: RightSquareBracket
                {
                mRightSquareBracket(); 

                }
                break;
            case 49 :
                // InternalGoatComponentsLexer.g:1:546: LeftCurlyBracket
                {
                mLeftCurlyBracket(); 

                }
                break;
            case 50 :
                // InternalGoatComponentsLexer.g:1:563: VerticalLine
                {
                mVerticalLine(); 

                }
                break;
            case 51 :
                // InternalGoatComponentsLexer.g:1:576: RightCurlyBracket
                {
                mRightCurlyBracket(); 

                }
                break;
            case 52 :
                // InternalGoatComponentsLexer.g:1:594: RULE_TYPE
                {
                mRULE_TYPE(); 

                }
                break;
            case 53 :
                // InternalGoatComponentsLexer.g:1:604: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 54 :
                // InternalGoatComponentsLexer.g:1:612: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 55 :
                // InternalGoatComponentsLexer.g:1:621: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 56 :
                // InternalGoatComponentsLexer.g:1:633: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 57 :
                // InternalGoatComponentsLexer.g:1:649: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 58 :
                // InternalGoatComponentsLexer.g:1:665: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 59 :
                // InternalGoatComponentsLexer.g:1:673: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\13\54\1\74\1\51\1\77\1\101\1\103\1\105\1\107\1\111\7\uffff\1\123\6\uffff\1\54\1\51\2\uffff\2\51\2\uffff\1\54\1\140\1\uffff\16\54\37\uffff\1\54\3\uffff\1\54\1\165\1\uffff\14\54\1\u0082\4\54\1\u0087\2\54\1\uffff\1\u008b\1\u008c\1\u008d\4\54\1\u0093\3\54\1\u0097\1\uffff\1\54\1\u0099\1\u009a\1\u009b\1\uffff\1\165\2\54\3\uffff\1\54\1\u009f\3\54\1\uffff\1\u00a3\1\54\1\u00a5\1\uffff\1\54\3\uffff\3\54\1\uffff\1\54\1\u00ab\1\54\1\uffff\1\54\1\uffff\1\165\3\54\1\u00b2\1\uffff\1\u00b3\1\u00b4\2\54\1\u00b7\1\u00b8\3\uffff\1\54\1\u00ba\2\uffff\1\54\1\uffff\3\54\1\u00bf\1\uffff";
    static final String DFA13_eofS =
        "\u00c0\uffff";
    static final String DFA13_minS =
        "\1\0\1\146\2\141\1\145\1\162\1\141\1\145\1\154\1\157\1\162\1\141\1\75\1\46\1\53\4\75\1\174\7\uffff\1\52\6\uffff\1\157\1\101\2\uffff\2\0\2\uffff\1\146\1\60\1\uffff\1\155\1\154\1\156\1\154\1\143\2\151\1\141\1\156\1\162\1\163\1\157\1\165\1\162\37\uffff\1\157\3\uffff\1\162\1\60\1\uffff\1\160\1\154\1\145\1\143\1\163\1\145\1\165\1\143\1\156\1\164\1\167\1\144\1\60\1\151\1\145\1\160\1\145\1\60\1\154\1\141\1\uffff\3\60\1\164\1\145\1\151\1\162\1\60\1\164\1\146\1\156\1\60\1\uffff\1\156\3\60\1\uffff\1\60\1\163\1\156\3\uffff\1\151\1\60\1\166\1\156\1\163\1\uffff\1\60\1\157\1\60\1\uffff\1\147\3\uffff\1\164\1\145\1\157\1\uffff\1\145\1\60\1\163\1\uffff\1\162\1\uffff\1\60\1\162\2\156\1\60\1\uffff\2\60\1\165\1\164\2\60\3\uffff\1\143\1\60\2\uffff\1\164\1\uffff\1\165\1\162\1\145\1\60\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\156\1\157\1\165\1\145\1\162\1\141\1\164\1\154\1\157\1\162\1\141\1\75\1\46\1\53\4\75\1\174\7\uffff\1\57\6\uffff\1\157\1\172\2\uffff\2\uffff\2\uffff\1\164\1\172\1\uffff\1\155\1\163\1\156\1\154\1\164\1\157\1\151\1\141\1\164\1\162\1\163\1\157\1\165\1\162\37\uffff\1\157\3\uffff\1\162\1\172\1\uffff\1\160\1\154\1\145\1\143\1\163\1\145\1\165\1\143\1\156\1\164\1\167\1\144\1\172\1\151\1\145\1\160\1\145\1\172\1\154\1\141\1\uffff\3\172\1\164\1\145\1\151\1\162\1\172\1\164\1\146\1\156\1\172\1\uffff\1\156\3\172\1\uffff\1\172\1\163\1\156\3\uffff\1\151\1\172\1\166\1\156\1\163\1\uffff\1\172\1\157\1\172\1\uffff\1\147\3\uffff\1\164\1\145\1\157\1\uffff\1\145\1\172\1\163\1\uffff\1\162\1\uffff\1\172\1\162\2\156\1\172\1\uffff\2\172\1\165\1\164\2\172\3\uffff\1\143\1\172\2\uffff\1\164\1\uffff\1\165\1\162\1\145\1\172\1\uffff";
    static final String DFA13_acceptS =
        "\24\uffff\1\40\1\41\1\42\1\43\1\45\1\46\1\47\1\uffff\1\52\1\56\1\57\1\60\1\61\1\63\2\uffff\1\65\1\66\2\uffff\1\72\1\73\2\uffff\1\65\16\uffff\1\26\1\37\1\27\1\30\1\44\1\31\1\51\1\32\1\53\1\33\1\54\1\34\1\55\1\36\1\62\1\40\1\41\1\42\1\43\1\45\1\46\1\47\1\70\1\71\1\50\1\52\1\56\1\57\1\60\1\61\1\63\1\uffff\1\66\1\67\1\72\2\uffff\1\35\24\uffff\1\64\14\uffff\1\24\4\uffff\1\25\3\uffff\1\16\1\14\1\15\5\uffff\1\21\3\uffff\1\22\1\uffff\1\17\1\20\1\23\3\uffff\1\11\3\uffff\1\12\1\uffff\1\13\5\uffff\1\10\6\uffff\1\6\1\5\1\7\2\uffff\1\3\1\4\1\uffff\1\2\4\uffff\1\1";
    static final String DFA13_specialS =
        "\1\1\45\uffff\1\0\1\2\u0098\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\51\2\50\2\51\1\50\22\51\1\50\1\14\1\46\2\51\1\24\1\15\1\47\1\25\1\26\1\27\1\16\1\30\1\31\1\32\1\33\12\45\1\17\1\34\1\20\1\21\1\22\1\51\1\35\32\44\1\36\1\51\1\37\1\43\1\44\1\51\1\44\1\42\1\2\1\44\1\10\1\3\2\44\1\1\2\44\1\11\3\44\1\5\1\44\1\4\1\7\1\12\1\44\1\13\1\6\3\44\1\40\1\23\1\41\uff82\51",
            "\1\53\7\uffff\1\52",
            "\1\56\15\uffff\1\55",
            "\1\60\23\uffff\1\57",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\65\12\uffff\1\64\3\uffff\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\75",
            "\1\76",
            "\1\100",
            "\1\102",
            "\1\104",
            "\1\106",
            "\1\110",
            "",
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
            "",
            "\1\132",
            "\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "",
            "\0\134",
            "\0\134",
            "",
            "",
            "\1\136\15\uffff\1\137",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "\1\141",
            "\1\142\6\uffff\1\143",
            "\1\144",
            "\1\145",
            "\1\146\20\uffff\1\147",
            "\1\151\5\uffff\1\150",
            "\1\152",
            "\1\153",
            "\1\154\5\uffff\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
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
            "\1\163",
            "",
            "",
            "",
            "\1\164",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
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
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0088",
            "\1\u0089",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\16\54\1\u008a\13\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\4\54\1\u0092\25\54",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "\1\u0098",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u009c",
            "\1\u009d",
            "",
            "",
            "",
            "\1\u009e",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00a4",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "\1\u00a6",
            "",
            "",
            "",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "",
            "\1\u00aa",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00ac",
            "",
            "\1\u00ad",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\21\54\1\u00b1\10\54",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00b5",
            "\1\u00b6",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "",
            "",
            "\1\u00b9",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "",
            "\1\u00bb",
            "",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
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
            return "1:1: Tokens : ( Infrastructure | Component | Function | Receiver | Process | Receive | Waitfor | Return | False | Print | Spawn | Call | Case | Comp | Else | Loop | Proc | Send | True | Set | Var | ExclamationMarkEqualsSign | AmpersandAmpersand | PlusSignPlusSign | ColonEqualsSign | LessThanSignEqualsSign | EqualsSignEqualsSign | GreaterThanSignEqualsSign | If | VerticalLineVerticalLine | ExclamationMark | PercentSign | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | FullStop | Solidus | Colon | Semicolon | LessThanSign | EqualsSign | GreaterThanSign | CommercialAt | LeftSquareBracket | RightSquareBracket | LeftCurlyBracket | VerticalLine | RightCurlyBracket | RULE_TYPE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_38 = input.LA(1);

                        s = -1;
                        if ( ((LA13_38>='\u0000' && LA13_38<='\uFFFF')) ) {s = 92;}

                        else s = 41;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='i') ) {s = 1;}

                        else if ( (LA13_0=='c') ) {s = 2;}

                        else if ( (LA13_0=='f') ) {s = 3;}

                        else if ( (LA13_0=='r') ) {s = 4;}

                        else if ( (LA13_0=='p') ) {s = 5;}

                        else if ( (LA13_0=='w') ) {s = 6;}

                        else if ( (LA13_0=='s') ) {s = 7;}

                        else if ( (LA13_0=='e') ) {s = 8;}

                        else if ( (LA13_0=='l') ) {s = 9;}

                        else if ( (LA13_0=='t') ) {s = 10;}

                        else if ( (LA13_0=='v') ) {s = 11;}

                        else if ( (LA13_0=='!') ) {s = 12;}

                        else if ( (LA13_0=='&') ) {s = 13;}

                        else if ( (LA13_0=='+') ) {s = 14;}

                        else if ( (LA13_0==':') ) {s = 15;}

                        else if ( (LA13_0=='<') ) {s = 16;}

                        else if ( (LA13_0=='=') ) {s = 17;}

                        else if ( (LA13_0=='>') ) {s = 18;}

                        else if ( (LA13_0=='|') ) {s = 19;}

                        else if ( (LA13_0=='%') ) {s = 20;}

                        else if ( (LA13_0=='(') ) {s = 21;}

                        else if ( (LA13_0==')') ) {s = 22;}

                        else if ( (LA13_0=='*') ) {s = 23;}

                        else if ( (LA13_0==',') ) {s = 24;}

                        else if ( (LA13_0=='-') ) {s = 25;}

                        else if ( (LA13_0=='.') ) {s = 26;}

                        else if ( (LA13_0=='/') ) {s = 27;}

                        else if ( (LA13_0==';') ) {s = 28;}

                        else if ( (LA13_0=='@') ) {s = 29;}

                        else if ( (LA13_0=='[') ) {s = 30;}

                        else if ( (LA13_0==']') ) {s = 31;}

                        else if ( (LA13_0=='{') ) {s = 32;}

                        else if ( (LA13_0=='}') ) {s = 33;}

                        else if ( (LA13_0=='b') ) {s = 34;}

                        else if ( (LA13_0=='^') ) {s = 35;}

                        else if ( ((LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||LA13_0=='a'||LA13_0=='d'||(LA13_0>='g' && LA13_0<='h')||(LA13_0>='j' && LA13_0<='k')||(LA13_0>='m' && LA13_0<='o')||LA13_0=='q'||LA13_0=='u'||(LA13_0>='x' && LA13_0<='z')) ) {s = 36;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 37;}

                        else if ( (LA13_0=='\"') ) {s = 38;}

                        else if ( (LA13_0=='\'') ) {s = 39;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 40;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||(LA13_0>='#' && LA13_0<='$')||LA13_0=='?'||LA13_0=='\\'||LA13_0=='`'||(LA13_0>='~' && LA13_0<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_39 = input.LA(1);

                        s = -1;
                        if ( ((LA13_39>='\u0000' && LA13_39<='\uFFFF')) ) {s = 92;}

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