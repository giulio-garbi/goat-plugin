package com.sysma.goat.eclipse_plugin.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGoatComponentsLexer extends Lexer {
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int RULE_TYPE=7;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalGoatComponentsLexer() {;} 
    public InternalGoatComponentsLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalGoatComponentsLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalGoatComponents.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponents.g:11:7: ( 'infrastructure' )
            // InternalGoatComponents.g:11:9: 'infrastructure'
            {
            match("infrastructure"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponents.g:12:7: ( '|' )
            // InternalGoatComponents.g:12:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponents.g:13:7: ( '+' )
            // InternalGoatComponents.g:13:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponents.g:14:7: ( 'receive' )
            // InternalGoatComponents.g:14:9: 'receive'
            {
            match("receive"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponents.g:15:7: ( '(' )
            // InternalGoatComponents.g:15:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponents.g:16:7: ( ')' )
            // InternalGoatComponents.g:16:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponents.g:17:7: ( '{' )
            // InternalGoatComponents.g:17:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponents.g:18:7: ( ',' )
            // InternalGoatComponents.g:18:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponents.g:19:7: ( '}' )
            // InternalGoatComponents.g:19:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponents.g:20:7: ( '.' )
            // InternalGoatComponents.g:20:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponents.g:21:7: ( 'send' )
            // InternalGoatComponents.g:21:9: 'send'
            {
            match("send"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponents.g:22:7: ( '@' )
            // InternalGoatComponents.g:22:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponents.g:23:7: ( 'sleep' )
            // InternalGoatComponents.g:23:9: 'sleep'
            {
            match("sleep"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponents.g:24:7: ( 'print' )
            // InternalGoatComponents.g:24:9: 'print'
            {
            match("print"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponents.g:25:7: ( 'else' )
            // InternalGoatComponents.g:25:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponents.g:26:7: ( 'if' )
            // InternalGoatComponents.g:26:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponents.g:27:7: ( '[' )
            // InternalGoatComponents.g:27:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponents.g:28:7: ( ':=' )
            // InternalGoatComponents.g:28:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponents.g:29:7: ( ']' )
            // InternalGoatComponents.g:29:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponents.g:30:7: ( 'wait' )
            // InternalGoatComponents.g:30:9: 'wait'
            {
            match("wait"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponents.g:31:7: ( 'until' )
            // InternalGoatComponents.g:31:9: 'until'
            {
            match("until"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponents.g:32:7: ( 'nil' )
            // InternalGoatComponents.g:32:9: 'nil'
            {
            match("nil"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponents.g:33:7: ( 'proc' )
            // InternalGoatComponents.g:33:9: 'proc'
            {
            match("proc"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponents.g:34:7: ( '=' )
            // InternalGoatComponents.g:34:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponents.g:35:7: ( 'true' )
            // InternalGoatComponents.g:35:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponents.g:36:7: ( 'false' )
            // InternalGoatComponents.g:36:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponents.g:37:7: ( 'component' )
            // InternalGoatComponents.g:37:9: 'component'
            {
            match("component"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponents.g:38:7: ( '||' )
            // InternalGoatComponents.g:38:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponents.g:39:7: ( '&&' )
            // InternalGoatComponents.g:39:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponents.g:40:7: ( '==' )
            // InternalGoatComponents.g:40:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponents.g:41:7: ( '!=' )
            // InternalGoatComponents.g:41:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponents.g:42:7: ( '>=' )
            // InternalGoatComponents.g:42:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponents.g:43:7: ( '<=' )
            // InternalGoatComponents.g:43:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponents.g:44:7: ( '>' )
            // InternalGoatComponents.g:44:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponents.g:45:7: ( '<' )
            // InternalGoatComponents.g:45:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponents.g:46:7: ( '-' )
            // InternalGoatComponents.g:46:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponents.g:47:7: ( '++' )
            // InternalGoatComponents.g:47:9: '++'
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponents.g:48:7: ( '*' )
            // InternalGoatComponents.g:48:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponents.g:49:7: ( '/' )
            // InternalGoatComponents.g:49:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponents.g:50:7: ( '!' )
            // InternalGoatComponents.g:50:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponents.g:51:7: ( 'this' )
            // InternalGoatComponents.g:51:9: 'this'
            {
            match("this"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponents.g:52:7: ( 'receiver' )
            // InternalGoatComponents.g:52:9: 'receiver'
            {
            match("receiver"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponents.g:53:7: ( 'function' )
            // InternalGoatComponents.g:53:9: 'function'
            {
            match("function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponents.g:54:7: ( 'var' )
            // InternalGoatComponents.g:54:9: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponents.g:55:7: ( 'return' )
            // InternalGoatComponents.g:55:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "RULE_TYPE"
    public final void mRULE_TYPE() throws RecognitionException {
        try {
            int _type = RULE_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoatComponents.g:3526:11: ( ( 'int' | 'string' | 'bool' ) )
            // InternalGoatComponents.g:3526:13: ( 'int' | 'string' | 'bool' )
            {
            // InternalGoatComponents.g:3526:13: ( 'int' | 'string' | 'bool' )
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
                    // InternalGoatComponents.g:3526:14: 'int'
                    {
                    match("int"); 


                    }
                    break;
                case 2 :
                    // InternalGoatComponents.g:3526:20: 'string'
                    {
                    match("string"); 


                    }
                    break;
                case 3 :
                    // InternalGoatComponents.g:3526:29: 'bool'
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
            // InternalGoatComponents.g:3528:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalGoatComponents.g:3528:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalGoatComponents.g:3528:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalGoatComponents.g:3528:11: '^'
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

            // InternalGoatComponents.g:3528:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGoatComponents.g:
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
            // InternalGoatComponents.g:3530:10: ( ( '0' .. '9' )+ )
            // InternalGoatComponents.g:3530:12: ( '0' .. '9' )+
            {
            // InternalGoatComponents.g:3530:12: ( '0' .. '9' )+
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
            	    // InternalGoatComponents.g:3530:13: '0' .. '9'
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
            // InternalGoatComponents.g:3532:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalGoatComponents.g:3532:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalGoatComponents.g:3532:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalGoatComponents.g:3532:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalGoatComponents.g:3532:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalGoatComponents.g:3532:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGoatComponents.g:3532:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalGoatComponents.g:3532:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalGoatComponents.g:3532:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalGoatComponents.g:3532:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGoatComponents.g:3532:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalGoatComponents.g:3534:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalGoatComponents.g:3534:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalGoatComponents.g:3534:24: ( options {greedy=false; } : . )*
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
            	    // InternalGoatComponents.g:3534:52: .
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
            // InternalGoatComponents.g:3536:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalGoatComponents.g:3536:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalGoatComponents.g:3536:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGoatComponents.g:3536:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalGoatComponents.g:3536:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalGoatComponents.g:3536:41: ( '\\r' )? '\\n'
                    {
                    // InternalGoatComponents.g:3536:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalGoatComponents.g:3536:41: '\\r'
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
            // InternalGoatComponents.g:3538:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalGoatComponents.g:3538:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalGoatComponents.g:3538:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // InternalGoatComponents.g:
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
            // InternalGoatComponents.g:3540:16: ( . )
            // InternalGoatComponents.g:3540:18: .
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
        // InternalGoatComponents.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | RULE_TYPE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=53;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalGoatComponents.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalGoatComponents.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalGoatComponents.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalGoatComponents.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalGoatComponents.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalGoatComponents.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalGoatComponents.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalGoatComponents.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalGoatComponents.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalGoatComponents.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalGoatComponents.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalGoatComponents.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalGoatComponents.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalGoatComponents.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalGoatComponents.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalGoatComponents.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // InternalGoatComponents.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // InternalGoatComponents.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // InternalGoatComponents.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // InternalGoatComponents.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // InternalGoatComponents.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // InternalGoatComponents.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // InternalGoatComponents.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // InternalGoatComponents.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // InternalGoatComponents.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // InternalGoatComponents.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // InternalGoatComponents.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // InternalGoatComponents.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // InternalGoatComponents.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // InternalGoatComponents.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // InternalGoatComponents.g:1:190: T__42
                {
                mT__42(); 

                }
                break;
            case 32 :
                // InternalGoatComponents.g:1:196: T__43
                {
                mT__43(); 

                }
                break;
            case 33 :
                // InternalGoatComponents.g:1:202: T__44
                {
                mT__44(); 

                }
                break;
            case 34 :
                // InternalGoatComponents.g:1:208: T__45
                {
                mT__45(); 

                }
                break;
            case 35 :
                // InternalGoatComponents.g:1:214: T__46
                {
                mT__46(); 

                }
                break;
            case 36 :
                // InternalGoatComponents.g:1:220: T__47
                {
                mT__47(); 

                }
                break;
            case 37 :
                // InternalGoatComponents.g:1:226: T__48
                {
                mT__48(); 

                }
                break;
            case 38 :
                // InternalGoatComponents.g:1:232: T__49
                {
                mT__49(); 

                }
                break;
            case 39 :
                // InternalGoatComponents.g:1:238: T__50
                {
                mT__50(); 

                }
                break;
            case 40 :
                // InternalGoatComponents.g:1:244: T__51
                {
                mT__51(); 

                }
                break;
            case 41 :
                // InternalGoatComponents.g:1:250: T__52
                {
                mT__52(); 

                }
                break;
            case 42 :
                // InternalGoatComponents.g:1:256: T__53
                {
                mT__53(); 

                }
                break;
            case 43 :
                // InternalGoatComponents.g:1:262: T__54
                {
                mT__54(); 

                }
                break;
            case 44 :
                // InternalGoatComponents.g:1:268: T__55
                {
                mT__55(); 

                }
                break;
            case 45 :
                // InternalGoatComponents.g:1:274: T__56
                {
                mT__56(); 

                }
                break;
            case 46 :
                // InternalGoatComponents.g:1:280: RULE_TYPE
                {
                mRULE_TYPE(); 

                }
                break;
            case 47 :
                // InternalGoatComponents.g:1:290: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 48 :
                // InternalGoatComponents.g:1:298: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 49 :
                // InternalGoatComponents.g:1:307: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 50 :
                // InternalGoatComponents.g:1:319: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 51 :
                // InternalGoatComponents.g:1:335: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 52 :
                // InternalGoatComponents.g:1:351: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 53 :
                // InternalGoatComponents.g:1:359: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\1\53\1\55\1\57\1\53\6\uffff\1\53\1\uffff\2\53\1\uffff\1\50\1\uffff\3\53\1\104\3\53\1\50\1\114\1\116\1\120\2\uffff\1\125\2\53\1\50\2\uffff\2\50\2\uffff\1\53\1\135\5\uffff\1\53\6\uffff\3\53\1\uffff\2\53\3\uffff\3\53\2\uffff\5\53\14\uffff\2\53\3\uffff\1\53\1\161\1\uffff\12\53\1\174\5\53\1\u0082\2\53\1\uffff\2\53\1\u0087\3\53\1\u008b\1\u008c\1\u008d\1\53\1\uffff\1\u008f\1\u0090\3\53\1\uffff\1\161\3\53\1\uffff\1\u0097\1\53\1\u0099\3\uffff\1\u009a\2\uffff\1\u009b\4\53\1\u00a0\1\uffff\1\161\3\uffff\3\53\1\u00a5\1\uffff\3\53\1\u00a9\1\uffff\1\u00aa\2\53\2\uffff\1\u00ad\1\53\1\uffff\3\53\1\u00b2\1\uffff";
    static final String DFA13_eofS =
        "\u00b3\uffff";
    static final String DFA13_minS =
        "\1\0\1\146\1\174\1\53\1\145\6\uffff\1\145\1\uffff\1\162\1\154\1\uffff\1\75\1\uffff\1\141\1\156\1\151\1\75\1\150\1\141\1\157\1\46\3\75\2\uffff\1\52\1\141\1\157\1\101\2\uffff\2\0\2\uffff\1\146\1\60\5\uffff\1\143\6\uffff\1\156\1\145\1\162\1\uffff\1\151\1\163\3\uffff\1\151\1\164\1\154\2\uffff\1\165\1\151\1\154\1\156\1\155\14\uffff\1\162\1\157\3\uffff\1\162\1\60\1\uffff\1\145\1\165\1\144\1\145\1\151\1\156\1\143\1\145\1\164\1\151\1\60\1\145\2\163\1\143\1\160\1\60\1\154\1\141\1\uffff\1\151\1\162\1\60\1\160\1\156\1\164\3\60\1\154\1\uffff\2\60\1\145\1\164\1\157\1\uffff\1\60\1\163\1\166\1\156\1\uffff\1\60\1\147\1\60\3\uffff\1\60\2\uffff\1\60\1\151\1\156\1\164\1\145\1\60\1\uffff\1\60\3\uffff\1\157\1\145\1\162\1\60\1\uffff\2\156\1\165\1\60\1\uffff\1\60\1\164\1\143\2\uffff\1\60\1\164\1\uffff\1\165\1\162\1\145\1\60\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\156\1\174\1\53\1\145\6\uffff\1\164\1\uffff\1\162\1\154\1\uffff\1\75\1\uffff\1\141\1\156\1\151\1\75\1\162\1\165\1\157\1\46\3\75\2\uffff\1\57\1\141\1\157\1\172\2\uffff\2\uffff\2\uffff\1\164\1\172\5\uffff\1\164\6\uffff\1\156\1\145\1\162\1\uffff\1\157\1\163\3\uffff\1\151\1\164\1\154\2\uffff\1\165\1\151\1\154\1\156\1\155\14\uffff\1\162\1\157\3\uffff\1\162\1\172\1\uffff\1\145\1\165\1\144\1\145\1\151\1\156\1\143\1\145\1\164\1\151\1\172\1\145\2\163\1\143\1\160\1\172\1\154\1\141\1\uffff\1\151\1\162\1\172\1\160\1\156\1\164\3\172\1\154\1\uffff\2\172\1\145\1\164\1\157\1\uffff\1\172\1\163\1\166\1\156\1\uffff\1\172\1\147\1\172\3\uffff\1\172\2\uffff\1\172\1\151\1\156\1\164\1\145\1\172\1\uffff\1\172\3\uffff\1\157\1\145\1\162\1\172\1\uffff\2\156\1\165\1\172\1\uffff\1\172\1\164\1\143\2\uffff\1\172\1\164\1\uffff\1\165\1\162\1\145\1\172\1\uffff";
    static final String DFA13_acceptS =
        "\5\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\uffff\1\14\2\uffff\1\21\1\uffff\1\23\13\uffff\1\44\1\46\4\uffff\1\57\1\60\2\uffff\1\64\1\65\2\uffff\1\57\1\34\1\2\1\45\1\3\1\uffff\1\5\1\6\1\7\1\10\1\11\1\12\3\uffff\1\14\2\uffff\1\21\1\22\1\23\3\uffff\1\36\1\30\5\uffff\1\35\1\37\1\50\1\40\1\42\1\41\1\43\1\44\1\46\1\62\1\63\1\47\2\uffff\1\60\1\61\1\64\2\uffff\1\20\23\uffff\1\56\12\uffff\1\26\5\uffff\1\54\4\uffff\1\13\3\uffff\1\27\1\17\1\24\1\uffff\1\31\1\51\6\uffff\1\15\1\uffff\1\16\1\25\1\32\4\uffff\1\55\4\uffff\1\4\3\uffff\1\52\1\53\2\uffff\1\33\4\uffff\1\1";
    static final String DFA13_specialS =
        "\1\0\44\uffff\1\2\1\1\u008c\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\50\2\47\2\50\1\47\22\50\1\47\1\32\1\45\3\50\1\31\1\46\1\5\1\6\1\36\1\3\1\10\1\35\1\12\1\37\12\44\1\20\1\50\1\34\1\25\1\33\1\50\1\14\32\43\1\17\1\50\1\21\1\42\1\43\1\50\1\43\1\41\1\30\1\43\1\16\1\27\2\43\1\1\4\43\1\24\1\43\1\15\1\43\1\4\1\13\1\26\1\23\1\40\1\22\3\43\1\7\1\2\1\11\uff82\50",
            "\1\52\7\uffff\1\51",
            "\1\54",
            "\1\56",
            "\1\60",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\67\6\uffff\1\70\7\uffff\1\71",
            "",
            "\1\73",
            "\1\74",
            "",
            "\1\76",
            "",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\106\11\uffff\1\105",
            "\1\107\23\uffff\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\115",
            "\1\117",
            "",
            "",
            "\1\123\4\uffff\1\124",
            "\1\126",
            "\1\127",
            "\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "\0\131",
            "\0\131",
            "",
            "",
            "\1\133\15\uffff\1\134",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "",
            "",
            "",
            "\1\136\20\uffff\1\137",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\140",
            "\1\141",
            "\1\142",
            "",
            "\1\143\5\uffff\1\144",
            "\1\145",
            "",
            "",
            "",
            "\1\146",
            "\1\147",
            "\1\150",
            "",
            "",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
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
            "\1\156",
            "\1\157",
            "",
            "",
            "",
            "\1\160",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0083",
            "\1\u0084",
            "",
            "\1\u0085",
            "\1\u0086",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u008e",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0098",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\21\53\1\u00a4\10\53",
            "",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00ab",
            "\1\u00ac",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00ae",
            "",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
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
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | RULE_TYPE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='i') ) {s = 1;}

                        else if ( (LA13_0=='|') ) {s = 2;}

                        else if ( (LA13_0=='+') ) {s = 3;}

                        else if ( (LA13_0=='r') ) {s = 4;}

                        else if ( (LA13_0=='(') ) {s = 5;}

                        else if ( (LA13_0==')') ) {s = 6;}

                        else if ( (LA13_0=='{') ) {s = 7;}

                        else if ( (LA13_0==',') ) {s = 8;}

                        else if ( (LA13_0=='}') ) {s = 9;}

                        else if ( (LA13_0=='.') ) {s = 10;}

                        else if ( (LA13_0=='s') ) {s = 11;}

                        else if ( (LA13_0=='@') ) {s = 12;}

                        else if ( (LA13_0=='p') ) {s = 13;}

                        else if ( (LA13_0=='e') ) {s = 14;}

                        else if ( (LA13_0=='[') ) {s = 15;}

                        else if ( (LA13_0==':') ) {s = 16;}

                        else if ( (LA13_0==']') ) {s = 17;}

                        else if ( (LA13_0=='w') ) {s = 18;}

                        else if ( (LA13_0=='u') ) {s = 19;}

                        else if ( (LA13_0=='n') ) {s = 20;}

                        else if ( (LA13_0=='=') ) {s = 21;}

                        else if ( (LA13_0=='t') ) {s = 22;}

                        else if ( (LA13_0=='f') ) {s = 23;}

                        else if ( (LA13_0=='c') ) {s = 24;}

                        else if ( (LA13_0=='&') ) {s = 25;}

                        else if ( (LA13_0=='!') ) {s = 26;}

                        else if ( (LA13_0=='>') ) {s = 27;}

                        else if ( (LA13_0=='<') ) {s = 28;}

                        else if ( (LA13_0=='-') ) {s = 29;}

                        else if ( (LA13_0=='*') ) {s = 30;}

                        else if ( (LA13_0=='/') ) {s = 31;}

                        else if ( (LA13_0=='v') ) {s = 32;}

                        else if ( (LA13_0=='b') ) {s = 33;}

                        else if ( (LA13_0=='^') ) {s = 34;}

                        else if ( ((LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||LA13_0=='a'||LA13_0=='d'||(LA13_0>='g' && LA13_0<='h')||(LA13_0>='j' && LA13_0<='m')||LA13_0=='o'||LA13_0=='q'||(LA13_0>='x' && LA13_0<='z')) ) {s = 35;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 36;}

                        else if ( (LA13_0=='\"') ) {s = 37;}

                        else if ( (LA13_0=='\'') ) {s = 38;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 39;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||(LA13_0>='#' && LA13_0<='%')||LA13_0==';'||LA13_0=='?'||LA13_0=='\\'||LA13_0=='`'||(LA13_0>='~' && LA13_0<='\uFFFF')) ) {s = 40;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_38 = input.LA(1);

                        s = -1;
                        if ( ((LA13_38>='\u0000' && LA13_38<='\uFFFF')) ) {s = 89;}

                        else s = 40;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_37 = input.LA(1);

                        s = -1;
                        if ( ((LA13_37>='\u0000' && LA13_37<='\uFFFF')) ) {s = 89;}

                        else s = 40;

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