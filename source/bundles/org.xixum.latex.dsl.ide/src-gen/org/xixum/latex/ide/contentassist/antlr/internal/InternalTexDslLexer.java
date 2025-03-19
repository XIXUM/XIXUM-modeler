package org.xixum.latex.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTexDslLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_NUMBER=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=9;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int RULE_TEXT=5;
    public static final int RULE_SYMBOL=7;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators

    public InternalTexDslLexer() {;} 
    public InternalTexDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalTexDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalTexDsl.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTexDsl.g:11:7: ( '\\\\' )
            // InternalTexDsl.g:11:9: '\\\\'
            {
            match('\\'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTexDsl.g:12:7: ( '[' )
            // InternalTexDsl.g:12:9: '['
            {
            match('['); 

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
            // InternalTexDsl.g:13:7: ( ']' )
            // InternalTexDsl.g:13:9: ']'
            {
            match(']'); 

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
            // InternalTexDsl.g:14:7: ( '{' )
            // InternalTexDsl.g:14:9: '{'
            {
            match('{'); 

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
            // InternalTexDsl.g:15:7: ( '}' )
            // InternalTexDsl.g:15:9: '}'
            {
            match('}'); 

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
            // InternalTexDsl.g:16:7: ( '$' )
            // InternalTexDsl.g:16:9: '$'
            {
            match('$'); 

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
            // InternalTexDsl.g:17:7: ( '$$' )
            // InternalTexDsl.g:17:9: '$$'
            {
            match("$$"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "RULE_SYMBOL"
    public final void mRULE_SYMBOL() throws RecognitionException {
        try {
            int _type = RULE_SYMBOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTexDsl.g:1315:13: ( ( '+' | '-' | '=' | '/' | '*' | '^' | '_' | '<' | '>' | '&' | '%' | '#' ) )
            // InternalTexDsl.g:1315:15: ( '+' | '-' | '=' | '/' | '*' | '^' | '_' | '<' | '>' | '&' | '%' | '#' )
            {
            if ( input.LA(1)=='#'||(input.LA(1)>='%' && input.LA(1)<='&')||(input.LA(1)>='*' && input.LA(1)<='+')||input.LA(1)=='-'||input.LA(1)=='/'||(input.LA(1)>='<' && input.LA(1)<='>')||(input.LA(1)>='^' && input.LA(1)<='_') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SYMBOL"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTexDsl.g:1317:17: ( '%' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalTexDsl.g:1317:19: '%' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('%'); 
            // InternalTexDsl.g:1317:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTexDsl.g:1317:23: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop1;
                }
            } while (true);

            // InternalTexDsl.g:1317:39: ( ( '\\r' )? '\\n' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\n'||LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalTexDsl.g:1317:40: ( '\\r' )? '\\n'
                    {
                    // InternalTexDsl.g:1317:40: ( '\\r' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='\r') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalTexDsl.g:1317:40: '\\r'
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

    // $ANTLR start "RULE_NUMBER"
    public final void mRULE_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTexDsl.g:1319:13: ( RULE_INT ( '.' RULE_INT )? )
            // InternalTexDsl.g:1319:15: RULE_INT ( '.' RULE_INT )?
            {
            mRULE_INT(); 
            // InternalTexDsl.g:1319:24: ( '.' RULE_INT )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='.') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalTexDsl.g:1319:25: '.' RULE_INT
                    {
                    match('.'); 
                    mRULE_INT(); 

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
    // $ANTLR end "RULE_NUMBER"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            // InternalTexDsl.g:1321:19: ( ( '0' .. '9' )+ )
            // InternalTexDsl.g:1321:21: ( '0' .. '9' )+
            {
            // InternalTexDsl.g:1321:21: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTexDsl.g:1321:22: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTexDsl.g:1323:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalTexDsl.g:1323:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalTexDsl.g:1323:11: ( '^' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='^') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalTexDsl.g:1323:11: '^'
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

            // InternalTexDsl.g:1323:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='Z')||LA7_0=='_'||(LA7_0>='a' && LA7_0<='z')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalTexDsl.g:
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
            	    break loop7;
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

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTexDsl.g:1325:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalTexDsl.g:1325:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalTexDsl.g:1325:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\t' && LA8_0<='\n')||LA8_0=='\r'||LA8_0==' ') ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalTexDsl.g:
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
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_TEXT"
    public final void mRULE_TEXT() throws RecognitionException {
        try {
            int _type = RULE_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTexDsl.g:1327:11: ( (~ ( ( '\\\\' | '$' | '{' | '}' | '[' | ']' | '^' | '_' | ' ' | '\\t' | '\\r' | '\\n' ) ) )+ )
            // InternalTexDsl.g:1327:13: (~ ( ( '\\\\' | '$' | '{' | '}' | '[' | ']' | '^' | '_' | ' ' | '\\t' | '\\r' | '\\n' ) ) )+
            {
            // InternalTexDsl.g:1327:13: (~ ( ( '\\\\' | '$' | '{' | '}' | '[' | ']' | '^' | '_' | ' ' | '\\t' | '\\r' | '\\n' ) ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\b')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\u001F')||(LA9_0>='!' && LA9_0<='#')||(LA9_0>='%' && LA9_0<='Z')||(LA9_0>='`' && LA9_0<='z')||LA9_0=='|'||(LA9_0>='~' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalTexDsl.g:1327:13: ~ ( ( '\\\\' | '$' | '{' | '}' | '[' | ']' | '^' | '_' | ' ' | '\\t' | '\\r' | '\\n' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<='#')||(input.LA(1)>='%' && input.LA(1)<='Z')||(input.LA(1)>='`' && input.LA(1)<='z')||input.LA(1)=='|'||(input.LA(1)>='~' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TEXT"

    public void mTokens() throws RecognitionException {
        // InternalTexDsl.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | RULE_SYMBOL | RULE_SL_COMMENT | RULE_NUMBER | RULE_ID | RULE_WS | RULE_TEXT )
        int alt10=13;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // InternalTexDsl.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // InternalTexDsl.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // InternalTexDsl.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // InternalTexDsl.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // InternalTexDsl.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // InternalTexDsl.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // InternalTexDsl.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // InternalTexDsl.g:1:52: RULE_SYMBOL
                {
                mRULE_SYMBOL(); 

                }
                break;
            case 9 :
                // InternalTexDsl.g:1:64: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 10 :
                // InternalTexDsl.g:1:80: RULE_NUMBER
                {
                mRULE_NUMBER(); 

                }
                break;
            case 11 :
                // InternalTexDsl.g:1:92: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 12 :
                // InternalTexDsl.g:1:100: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 13 :
                // InternalTexDsl.g:1:108: RULE_TEXT
                {
                mRULE_TEXT(); 

                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\6\uffff\1\20\2\21\1\25\2\21\1\24\5\uffff\1\23\3\uffff\1\16\1\24\1\25";
    static final String DFA10_eofS =
        "\31\uffff";
    static final String DFA10_minS =
        "\1\0\5\uffff\1\44\1\0\1\101\1\0\1\60\2\0\5\uffff\1\0\3\uffff\1\60\2\0";
    static final String DFA10_maxS =
        "\1\uffff\5\uffff\1\44\1\uffff\1\172\1\uffff\1\172\2\uffff\5\uffff\1\uffff\3\uffff\1\71\2\uffff";
    static final String DFA10_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\7\uffff\1\14\1\15\1\7\1\6\1\10\1\uffff\1\11\1\13\1\12\3\uffff";
    static final String DFA10_specialS =
        "\1\0\6\uffff\1\5\1\uffff\1\4\1\uffff\1\2\1\3\5\uffff\1\6\4\uffff\1\7\1\1}>";
    static final String[] DFA10_transitionS = DFA10_transitionS_.DFA10_transitionS;
    private static final class DFA10_transitionS_ {
        static final String[] DFA10_transitionS = {
                "\11\16\2\15\2\16\1\15\22\16\1\15\2\16\1\13\1\6\1\7\1\13\3\16\2\13\1\16\1\13\1\16\1\13\12\11\2\16\3\13\2\16\32\14\1\2\1\1\1\3\1\10\1\12\1\16\32\14\1\4\1\16\1\5\uff82\16",
                "",
                "",
                "",
                "",
                "",
                "\1\17",
                "\11\22\2\23\2\22\1\23\22\22\1\23\3\22\1\23\66\22\5\23\33\22\1\23\1\22\1\23\uff82\22",
                "\32\24\4\uffff\1\24\1\uffff\32\24",
                "\11\16\2\uffff\2\16\1\uffff\22\16\1\uffff\3\16\1\uffff\11\16\1\26\1\16\12\11\41\16\5\uffff\33\16\1\uffff\1\16\1\uffff\uff82\16",
                "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
                "\11\16\2\uffff\2\16\1\uffff\22\16\1\uffff\3\16\1\uffff\66\16\5\uffff\33\16\1\uffff\1\16\1\uffff\uff82\16",
                "\11\16\2\uffff\2\16\1\uffff\22\16\1\uffff\3\16\1\uffff\13\16\12\27\7\16\32\27\5\uffff\1\16\32\27\1\uffff\1\16\1\uffff\uff82\16",
                "",
                "",
                "",
                "",
                "",
                "\11\22\2\uffff\2\22\1\uffff\22\22\1\uffff\3\22\1\uffff\66\22\5\uffff\33\22\1\uffff\1\22\1\uffff\uff82\22",
                "",
                "",
                "",
                "\12\30",
                "\11\16\2\uffff\2\16\1\uffff\22\16\1\uffff\3\16\1\uffff\13\16\12\27\7\16\32\27\5\uffff\1\16\32\27\1\uffff\1\16\1\uffff\uff82\16",
                "\11\16\2\uffff\2\16\1\uffff\22\16\1\uffff\3\16\1\uffff\13\16\12\30\41\16\5\uffff\33\16\1\uffff\1\16\1\uffff\uff82\16"
        };
    }

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    static class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | RULE_SYMBOL | RULE_SL_COMMENT | RULE_NUMBER | RULE_ID | RULE_WS | RULE_TEXT );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_0 = input.LA(1);

                        s = -1;
                        if ( (LA10_0=='\\') ) {s = 1;}

                        else if ( (LA10_0=='[') ) {s = 2;}

                        else if ( (LA10_0==']') ) {s = 3;}

                        else if ( (LA10_0=='{') ) {s = 4;}

                        else if ( (LA10_0=='}') ) {s = 5;}

                        else if ( (LA10_0=='$') ) {s = 6;}

                        else if ( (LA10_0=='%') ) {s = 7;}

                        else if ( (LA10_0=='^') ) {s = 8;}

                        else if ( ((LA10_0>='0' && LA10_0<='9')) ) {s = 9;}

                        else if ( (LA10_0=='_') ) {s = 10;}

                        else if ( (LA10_0=='#'||LA10_0=='&'||(LA10_0>='*' && LA10_0<='+')||LA10_0=='-'||LA10_0=='/'||(LA10_0>='<' && LA10_0<='>')) ) {s = 11;}

                        else if ( ((LA10_0>='A' && LA10_0<='Z')||(LA10_0>='a' && LA10_0<='z')) ) {s = 12;}

                        else if ( ((LA10_0>='\t' && LA10_0<='\n')||LA10_0=='\r'||LA10_0==' ') ) {s = 13;}

                        else if ( ((LA10_0>='\u0000' && LA10_0<='\b')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\u001F')||(LA10_0>='!' && LA10_0<='\"')||(LA10_0>='\'' && LA10_0<=')')||LA10_0==','||LA10_0=='.'||(LA10_0>=':' && LA10_0<=';')||(LA10_0>='?' && LA10_0<='@')||LA10_0=='`'||LA10_0=='|'||(LA10_0>='~' && LA10_0<='\uFFFF')) ) {s = 14;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA10_24 = input.LA(1);

                        s = -1;
                        if ( ((LA10_24>='0' && LA10_24<='9')) ) {s = 24;}

                        else if ( ((LA10_24>='\u0000' && LA10_24<='\b')||(LA10_24>='\u000B' && LA10_24<='\f')||(LA10_24>='\u000E' && LA10_24<='\u001F')||(LA10_24>='!' && LA10_24<='#')||(LA10_24>='%' && LA10_24<='/')||(LA10_24>=':' && LA10_24<='Z')||(LA10_24>='`' && LA10_24<='z')||LA10_24=='|'||(LA10_24>='~' && LA10_24<='\uFFFF')) ) {s = 14;}

                        else s = 21;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA10_11 = input.LA(1);

                        s = -1;
                        if ( ((LA10_11>='\u0000' && LA10_11<='\b')||(LA10_11>='\u000B' && LA10_11<='\f')||(LA10_11>='\u000E' && LA10_11<='\u001F')||(LA10_11>='!' && LA10_11<='#')||(LA10_11>='%' && LA10_11<='Z')||(LA10_11>='`' && LA10_11<='z')||LA10_11=='|'||(LA10_11>='~' && LA10_11<='\uFFFF')) ) {s = 14;}

                        else s = 17;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA10_12 = input.LA(1);

                        s = -1;
                        if ( ((LA10_12>='0' && LA10_12<='9')||(LA10_12>='A' && LA10_12<='Z')||(LA10_12>='a' && LA10_12<='z')) ) {s = 23;}

                        else if ( ((LA10_12>='\u0000' && LA10_12<='\b')||(LA10_12>='\u000B' && LA10_12<='\f')||(LA10_12>='\u000E' && LA10_12<='\u001F')||(LA10_12>='!' && LA10_12<='#')||(LA10_12>='%' && LA10_12<='/')||(LA10_12>=':' && LA10_12<='@')||LA10_12=='`'||LA10_12=='|'||(LA10_12>='~' && LA10_12<='\uFFFF')) ) {s = 14;}

                        else s = 20;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA10_9 = input.LA(1);

                        s = -1;
                        if ( (LA10_9=='.') ) {s = 22;}

                        else if ( ((LA10_9>='0' && LA10_9<='9')) ) {s = 9;}

                        else if ( ((LA10_9>='\u0000' && LA10_9<='\b')||(LA10_9>='\u000B' && LA10_9<='\f')||(LA10_9>='\u000E' && LA10_9<='\u001F')||(LA10_9>='!' && LA10_9<='#')||(LA10_9>='%' && LA10_9<='-')||LA10_9=='/'||(LA10_9>=':' && LA10_9<='Z')||(LA10_9>='`' && LA10_9<='z')||LA10_9=='|'||(LA10_9>='~' && LA10_9<='\uFFFF')) ) {s = 14;}

                        else s = 21;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA10_7 = input.LA(1);

                        s = -1;
                        if ( ((LA10_7>='\u0000' && LA10_7<='\b')||(LA10_7>='\u000B' && LA10_7<='\f')||(LA10_7>='\u000E' && LA10_7<='\u001F')||(LA10_7>='!' && LA10_7<='#')||(LA10_7>='%' && LA10_7<='Z')||(LA10_7>='`' && LA10_7<='z')||LA10_7=='|'||(LA10_7>='~' && LA10_7<='\uFFFF')) ) {s = 18;}

                        else if ( ((LA10_7>='\t' && LA10_7<='\n')||LA10_7=='\r'||LA10_7==' '||LA10_7=='$'||(LA10_7>='[' && LA10_7<='_')||LA10_7=='{'||LA10_7=='}') ) {s = 19;}

                        else s = 17;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA10_18 = input.LA(1);

                        s = -1;
                        if ( ((LA10_18>='\u0000' && LA10_18<='\b')||(LA10_18>='\u000B' && LA10_18<='\f')||(LA10_18>='\u000E' && LA10_18<='\u001F')||(LA10_18>='!' && LA10_18<='#')||(LA10_18>='%' && LA10_18<='Z')||(LA10_18>='`' && LA10_18<='z')||LA10_18=='|'||(LA10_18>='~' && LA10_18<='\uFFFF')) ) {s = 18;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA10_23 = input.LA(1);

                        s = -1;
                        if ( ((LA10_23>='0' && LA10_23<='9')||(LA10_23>='A' && LA10_23<='Z')||(LA10_23>='a' && LA10_23<='z')) ) {s = 23;}

                        else if ( ((LA10_23>='\u0000' && LA10_23<='\b')||(LA10_23>='\u000B' && LA10_23<='\f')||(LA10_23>='\u000E' && LA10_23<='\u001F')||(LA10_23>='!' && LA10_23<='#')||(LA10_23>='%' && LA10_23<='/')||(LA10_23>=':' && LA10_23<='@')||LA10_23=='`'||LA10_23=='|'||(LA10_23>='~' && LA10_23<='\uFFFF')) ) {s = 14;}

                        else s = 20;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 10, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}