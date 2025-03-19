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
    public static final int RULE_CUBO=10;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=15;
    public static final int RULE_SQBO=8;
    public static final int RULE_SQBC=9;
    public static final int RULE_NUMBER=7;
    public static final int RULE_BS=12;
    public static final int RULE_INT=14;
    public static final int RULE_CUBC=11;
    public static final int RULE_TEXT=5;
    public static final int RULE_SYMBOL=6;

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

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTexDsl.g:11:7: ( 'begin{codeblock}' )
            // InternalTexDsl.g:11:9: 'begin{codeblock}'
            {
            match("begin{codeblock}"); 


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
            // InternalTexDsl.g:12:7: ( 'end{codeblock}' )
            // InternalTexDsl.g:12:9: 'end{codeblock}'
            {
            match("end{codeblock}"); 


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
            // InternalTexDsl.g:13:7: ( '$' )
            // InternalTexDsl.g:13:9: '$'
            {
            match('$'); 

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
            // InternalTexDsl.g:14:7: ( '$$' )
            // InternalTexDsl.g:14:9: '$$'
            {
            match("$$"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "RULE_BS"
    public final void mRULE_BS() throws RecognitionException {
        try {
            int _type = RULE_BS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTexDsl.g:1785:9: ( '\\\\' )
            // InternalTexDsl.g:1785:11: '\\\\'
            {
            match('\\'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BS"

    // $ANTLR start "RULE_SYMBOL"
    public final void mRULE_SYMBOL() throws RecognitionException {
        try {
            int _type = RULE_SYMBOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTexDsl.g:1787:13: ( ( '+' | '-' | '=' | '/' | '*' | '^' | '_' | '<' | '>' | '&' | '%' | '#' ) )
            // InternalTexDsl.g:1787:15: ( '+' | '-' | '=' | '/' | '*' | '^' | '_' | '<' | '>' | '&' | '%' | '#' )
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
            // InternalTexDsl.g:1789:17: ( '%' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalTexDsl.g:1789:19: '%' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('%'); 
            // InternalTexDsl.g:1789:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTexDsl.g:1789:23: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalTexDsl.g:1789:39: ( ( '\\r' )? '\\n' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\n'||LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalTexDsl.g:1789:40: ( '\\r' )? '\\n'
                    {
                    // InternalTexDsl.g:1789:40: ( '\\r' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='\r') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalTexDsl.g:1789:40: '\\r'
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

    // $ANTLR start "RULE_SQBO"
    public final void mRULE_SQBO() throws RecognitionException {
        try {
            int _type = RULE_SQBO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTexDsl.g:1791:11: ( '[' )
            // InternalTexDsl.g:1791:13: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SQBO"

    // $ANTLR start "RULE_SQBC"
    public final void mRULE_SQBC() throws RecognitionException {
        try {
            int _type = RULE_SQBC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTexDsl.g:1793:11: ( ']' )
            // InternalTexDsl.g:1793:13: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SQBC"

    // $ANTLR start "RULE_CUBO"
    public final void mRULE_CUBO() throws RecognitionException {
        try {
            int _type = RULE_CUBO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTexDsl.g:1795:11: ( '{' )
            // InternalTexDsl.g:1795:13: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CUBO"

    // $ANTLR start "RULE_CUBC"
    public final void mRULE_CUBC() throws RecognitionException {
        try {
            int _type = RULE_CUBC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTexDsl.g:1797:11: ( '}' )
            // InternalTexDsl.g:1797:13: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CUBC"

    // $ANTLR start "RULE_NUMBER"
    public final void mRULE_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTexDsl.g:1799:13: ( RULE_INT ( '.' RULE_INT )? )
            // InternalTexDsl.g:1799:15: RULE_INT ( '.' RULE_INT )?
            {
            mRULE_INT(); 
            // InternalTexDsl.g:1799:24: ( '.' RULE_INT )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='.') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalTexDsl.g:1799:25: '.' RULE_INT
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
            // InternalTexDsl.g:1801:19: ( ( '0' .. '9' )+ )
            // InternalTexDsl.g:1801:21: ( '0' .. '9' )+
            {
            // InternalTexDsl.g:1801:21: ( '0' .. '9' )+
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
            	    // InternalTexDsl.g:1801:22: '0' .. '9'
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
            // InternalTexDsl.g:1803:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalTexDsl.g:1803:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalTexDsl.g:1803:11: ( '^' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='^') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalTexDsl.g:1803:11: '^'
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

            // InternalTexDsl.g:1803:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // InternalTexDsl.g:1805:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalTexDsl.g:1805:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalTexDsl.g:1805:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalTexDsl.g:1807:11: ( (~ ( ( '\\\\' | '$' | '{' | '}' | '[' | ']' | '^' | '_' | ' ' | '\\t' | '\\r' | '\\n' ) ) )+ )
            // InternalTexDsl.g:1807:13: (~ ( ( '\\\\' | '$' | '{' | '}' | '[' | ']' | '^' | '_' | ' ' | '\\t' | '\\r' | '\\n' ) ) )+
            {
            // InternalTexDsl.g:1807:13: (~ ( ( '\\\\' | '$' | '{' | '}' | '[' | ']' | '^' | '_' | ' ' | '\\t' | '\\r' | '\\n' ) ) )+
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
            	    // InternalTexDsl.g:1807:13: ~ ( ( '\\\\' | '$' | '{' | '}' | '[' | ']' | '^' | '_' | ' ' | '\\t' | '\\r' | '\\n' ) )
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
        // InternalTexDsl.g:1:8: ( T__16 | T__17 | T__18 | T__19 | RULE_BS | RULE_SYMBOL | RULE_SL_COMMENT | RULE_SQBO | RULE_SQBC | RULE_CUBO | RULE_CUBC | RULE_NUMBER | RULE_ID | RULE_WS | RULE_TEXT )
        int alt10=15;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // InternalTexDsl.g:1:10: T__16
                {
                mT__16(); 

                }
                break;
            case 2 :
                // InternalTexDsl.g:1:16: T__17
                {
                mT__17(); 

                }
                break;
            case 3 :
                // InternalTexDsl.g:1:22: T__18
                {
                mT__18(); 

                }
                break;
            case 4 :
                // InternalTexDsl.g:1:28: T__19
                {
                mT__19(); 

                }
                break;
            case 5 :
                // InternalTexDsl.g:1:34: RULE_BS
                {
                mRULE_BS(); 

                }
                break;
            case 6 :
                // InternalTexDsl.g:1:42: RULE_SYMBOL
                {
                mRULE_SYMBOL(); 

                }
                break;
            case 7 :
                // InternalTexDsl.g:1:54: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 8 :
                // InternalTexDsl.g:1:70: RULE_SQBO
                {
                mRULE_SQBO(); 

                }
                break;
            case 9 :
                // InternalTexDsl.g:1:80: RULE_SQBC
                {
                mRULE_SQBC(); 

                }
                break;
            case 10 :
                // InternalTexDsl.g:1:90: RULE_CUBO
                {
                mRULE_CUBO(); 

                }
                break;
            case 11 :
                // InternalTexDsl.g:1:100: RULE_CUBC
                {
                mRULE_CUBC(); 

                }
                break;
            case 12 :
                // InternalTexDsl.g:1:110: RULE_NUMBER
                {
                mRULE_NUMBER(); 

                }
                break;
            case 13 :
                // InternalTexDsl.g:1:122: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 14 :
                // InternalTexDsl.g:1:130: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 15 :
                // InternalTexDsl.g:1:138: RULE_TEXT
                {
                mRULE_TEXT(); 

                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\1\uffff\2\23\1\26\1\uffff\2\27\4\uffff\1\32\2\27\1\23\2\uffff\2\23\1\uffff\1\23\3\uffff\1\31\2\uffff\1\20\2\23\1\32\1\23\1\uffff\1\23\1\uffff";
    static final String DFA10_eofS =
        "\43\uffff";
    static final String DFA10_minS =
        "\3\0\1\44\1\uffff\1\0\1\101\4\uffff\1\0\1\60\2\0\2\uffff\2\0\1\uffff\1\0\3\uffff\1\0\2\uffff\1\60\4\0\1\uffff\1\0\1\uffff";
    static final String DFA10_maxS =
        "\3\uffff\1\44\1\uffff\1\uffff\1\172\4\uffff\1\uffff\1\172\2\uffff\2\uffff\2\uffff\1\uffff\1\uffff\3\uffff\1\uffff\2\uffff\1\71\4\uffff\1\uffff\1\uffff\1\uffff";
    static final String DFA10_acceptS =
        "\4\uffff\1\5\2\uffff\1\10\1\11\1\12\1\13\4\uffff\1\16\1\17\2\uffff\1\15\1\uffff\1\4\1\3\1\6\1\uffff\1\7\1\14\5\uffff\1\2\1\uffff\1\1";
    static final String DFA10_specialS =
        "\1\5\1\3\1\11\2\uffff\1\2\5\uffff\1\17\1\uffff\1\13\1\14\2\uffff\1\4\1\0\1\uffff\1\15\3\uffff\1\1\3\uffff\1\6\1\16\1\12\1\7\1\uffff\1\10\1\uffff}>";
    static final String[] DFA10_transitionS = DFA10_transitionS_.DFA10_transitionS;
    private static final class DFA10_transitionS_ {
        static final String[] DFA10_transitionS = {
                "\11\20\2\17\2\20\1\17\22\20\1\17\2\20\1\15\1\3\1\5\1\15\3\20\2\15\1\20\1\15\1\20\1\15\12\13\2\20\3\15\2\20\32\16\1\7\1\4\1\10\1\6\1\14\1\20\1\16\1\1\2\16\1\2\25\16\1\11\1\20\1\12\uff82\20",
                "\11\20\2\uffff\2\20\1\uffff\22\20\1\uffff\3\20\1\uffff\13\20\12\22\7\20\32\22\5\uffff\1\20\4\22\1\21\25\22\1\uffff\1\20\1\uffff\uff82\20",
                "\11\20\2\uffff\2\20\1\uffff\22\20\1\uffff\3\20\1\uffff\13\20\12\22\7\20\32\22\5\uffff\1\20\15\22\1\24\14\22\1\uffff\1\20\1\uffff\uff82\20",
                "\1\25",
                "",
                "\11\30\2\31\2\30\1\31\22\30\1\31\3\30\1\31\66\30\5\31\33\30\1\31\1\30\1\31\uff82\30",
                "\32\23\4\uffff\1\23\1\uffff\32\23",
                "",
                "",
                "",
                "",
                "\11\20\2\uffff\2\20\1\uffff\22\20\1\uffff\3\20\1\uffff\11\20\1\33\1\20\12\13\41\20\5\uffff\33\20\1\uffff\1\20\1\uffff\uff82\20",
                "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
                "\11\20\2\uffff\2\20\1\uffff\22\20\1\uffff\3\20\1\uffff\66\20\5\uffff\33\20\1\uffff\1\20\1\uffff\uff82\20",
                "\11\20\2\uffff\2\20\1\uffff\22\20\1\uffff\3\20\1\uffff\13\20\12\22\7\20\32\22\5\uffff\1\20\32\22\1\uffff\1\20\1\uffff\uff82\20",
                "",
                "",
                "\11\20\2\uffff\2\20\1\uffff\22\20\1\uffff\3\20\1\uffff\13\20\12\22\7\20\32\22\5\uffff\1\20\6\22\1\34\23\22\1\uffff\1\20\1\uffff\uff82\20",
                "\11\20\2\uffff\2\20\1\uffff\22\20\1\uffff\3\20\1\uffff\13\20\12\22\7\20\32\22\5\uffff\1\20\32\22\1\uffff\1\20\1\uffff\uff82\20",
                "",
                "\11\20\2\uffff\2\20\1\uffff\22\20\1\uffff\3\20\1\uffff\13\20\12\22\7\20\32\22\5\uffff\1\20\3\22\1\35\26\22\1\uffff\1\20\1\uffff\uff82\20",
                "",
                "",
                "",
                "\11\30\2\uffff\2\30\1\uffff\22\30\1\uffff\3\30\1\uffff\66\30\5\uffff\33\30\1\uffff\1\30\1\uffff\uff82\30",
                "",
                "",
                "\12\36",
                "\11\20\2\uffff\2\20\1\uffff\22\20\1\uffff\3\20\1\uffff\13\20\12\22\7\20\32\22\5\uffff\1\20\10\22\1\37\21\22\1\uffff\1\20\1\uffff\uff82\20",
                "\11\20\2\uffff\2\20\1\uffff\22\20\1\uffff\3\20\1\uffff\13\20\12\22\7\20\32\22\5\uffff\1\20\32\22\1\40\1\20\1\uffff\uff82\20",
                "\11\20\2\uffff\2\20\1\uffff\22\20\1\uffff\3\20\1\uffff\13\20\12\36\41\20\5\uffff\33\20\1\uffff\1\20\1\uffff\uff82\20",
                "\11\20\2\uffff\2\20\1\uffff\22\20\1\uffff\3\20\1\uffff\13\20\12\22\7\20\32\22\5\uffff\1\20\15\22\1\41\14\22\1\uffff\1\20\1\uffff\uff82\20",
                "",
                "\11\20\2\uffff\2\20\1\uffff\22\20\1\uffff\3\20\1\uffff\13\20\12\22\7\20\32\22\5\uffff\1\20\32\22\1\42\1\20\1\uffff\uff82\20",
                ""
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
            return "1:1: Tokens : ( T__16 | T__17 | T__18 | T__19 | RULE_BS | RULE_SYMBOL | RULE_SL_COMMENT | RULE_SQBO | RULE_SQBC | RULE_CUBO | RULE_CUBC | RULE_NUMBER | RULE_ID | RULE_WS | RULE_TEXT );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_18 = input.LA(1);

                        s = -1;
                        if ( ((LA10_18>='0' && LA10_18<='9')||(LA10_18>='A' && LA10_18<='Z')||(LA10_18>='a' && LA10_18<='z')) ) {s = 18;}

                        else if ( ((LA10_18>='\u0000' && LA10_18<='\b')||(LA10_18>='\u000B' && LA10_18<='\f')||(LA10_18>='\u000E' && LA10_18<='\u001F')||(LA10_18>='!' && LA10_18<='#')||(LA10_18>='%' && LA10_18<='/')||(LA10_18>=':' && LA10_18<='@')||LA10_18=='`'||LA10_18=='|'||(LA10_18>='~' && LA10_18<='\uFFFF')) ) {s = 16;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA10_24 = input.LA(1);

                        s = -1;
                        if ( ((LA10_24>='\u0000' && LA10_24<='\b')||(LA10_24>='\u000B' && LA10_24<='\f')||(LA10_24>='\u000E' && LA10_24<='\u001F')||(LA10_24>='!' && LA10_24<='#')||(LA10_24>='%' && LA10_24<='Z')||(LA10_24>='`' && LA10_24<='z')||LA10_24=='|'||(LA10_24>='~' && LA10_24<='\uFFFF')) ) {s = 24;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA10_5 = input.LA(1);

                        s = -1;
                        if ( ((LA10_5>='\u0000' && LA10_5<='\b')||(LA10_5>='\u000B' && LA10_5<='\f')||(LA10_5>='\u000E' && LA10_5<='\u001F')||(LA10_5>='!' && LA10_5<='#')||(LA10_5>='%' && LA10_5<='Z')||(LA10_5>='`' && LA10_5<='z')||LA10_5=='|'||(LA10_5>='~' && LA10_5<='\uFFFF')) ) {s = 24;}

                        else if ( ((LA10_5>='\t' && LA10_5<='\n')||LA10_5=='\r'||LA10_5==' '||LA10_5=='$'||(LA10_5>='[' && LA10_5<='_')||LA10_5=='{'||LA10_5=='}') ) {s = 25;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA10_1 = input.LA(1);

                        s = -1;
                        if ( (LA10_1=='e') ) {s = 17;}

                        else if ( ((LA10_1>='0' && LA10_1<='9')||(LA10_1>='A' && LA10_1<='Z')||(LA10_1>='a' && LA10_1<='d')||(LA10_1>='f' && LA10_1<='z')) ) {s = 18;}

                        else if ( ((LA10_1>='\u0000' && LA10_1<='\b')||(LA10_1>='\u000B' && LA10_1<='\f')||(LA10_1>='\u000E' && LA10_1<='\u001F')||(LA10_1>='!' && LA10_1<='#')||(LA10_1>='%' && LA10_1<='/')||(LA10_1>=':' && LA10_1<='@')||LA10_1=='`'||LA10_1=='|'||(LA10_1>='~' && LA10_1<='\uFFFF')) ) {s = 16;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA10_17 = input.LA(1);

                        s = -1;
                        if ( (LA10_17=='g') ) {s = 28;}

                        else if ( ((LA10_17>='0' && LA10_17<='9')||(LA10_17>='A' && LA10_17<='Z')||(LA10_17>='a' && LA10_17<='f')||(LA10_17>='h' && LA10_17<='z')) ) {s = 18;}

                        else if ( ((LA10_17>='\u0000' && LA10_17<='\b')||(LA10_17>='\u000B' && LA10_17<='\f')||(LA10_17>='\u000E' && LA10_17<='\u001F')||(LA10_17>='!' && LA10_17<='#')||(LA10_17>='%' && LA10_17<='/')||(LA10_17>=':' && LA10_17<='@')||LA10_17=='`'||LA10_17=='|'||(LA10_17>='~' && LA10_17<='\uFFFF')) ) {s = 16;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA10_0 = input.LA(1);

                        s = -1;
                        if ( (LA10_0=='b') ) {s = 1;}

                        else if ( (LA10_0=='e') ) {s = 2;}

                        else if ( (LA10_0=='$') ) {s = 3;}

                        else if ( (LA10_0=='\\') ) {s = 4;}

                        else if ( (LA10_0=='%') ) {s = 5;}

                        else if ( (LA10_0=='^') ) {s = 6;}

                        else if ( (LA10_0=='[') ) {s = 7;}

                        else if ( (LA10_0==']') ) {s = 8;}

                        else if ( (LA10_0=='{') ) {s = 9;}

                        else if ( (LA10_0=='}') ) {s = 10;}

                        else if ( ((LA10_0>='0' && LA10_0<='9')) ) {s = 11;}

                        else if ( (LA10_0=='_') ) {s = 12;}

                        else if ( (LA10_0=='#'||LA10_0=='&'||(LA10_0>='*' && LA10_0<='+')||LA10_0=='-'||LA10_0=='/'||(LA10_0>='<' && LA10_0<='>')) ) {s = 13;}

                        else if ( ((LA10_0>='A' && LA10_0<='Z')||LA10_0=='a'||(LA10_0>='c' && LA10_0<='d')||(LA10_0>='f' && LA10_0<='z')) ) {s = 14;}

                        else if ( ((LA10_0>='\t' && LA10_0<='\n')||LA10_0=='\r'||LA10_0==' ') ) {s = 15;}

                        else if ( ((LA10_0>='\u0000' && LA10_0<='\b')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\u001F')||(LA10_0>='!' && LA10_0<='\"')||(LA10_0>='\'' && LA10_0<=')')||LA10_0==','||LA10_0=='.'||(LA10_0>=':' && LA10_0<=';')||(LA10_0>='?' && LA10_0<='@')||LA10_0=='`'||LA10_0=='|'||(LA10_0>='~' && LA10_0<='\uFFFF')) ) {s = 16;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA10_28 = input.LA(1);

                        s = -1;
                        if ( (LA10_28=='i') ) {s = 31;}

                        else if ( ((LA10_28>='0' && LA10_28<='9')||(LA10_28>='A' && LA10_28<='Z')||(LA10_28>='a' && LA10_28<='h')||(LA10_28>='j' && LA10_28<='z')) ) {s = 18;}

                        else if ( ((LA10_28>='\u0000' && LA10_28<='\b')||(LA10_28>='\u000B' && LA10_28<='\f')||(LA10_28>='\u000E' && LA10_28<='\u001F')||(LA10_28>='!' && LA10_28<='#')||(LA10_28>='%' && LA10_28<='/')||(LA10_28>=':' && LA10_28<='@')||LA10_28=='`'||LA10_28=='|'||(LA10_28>='~' && LA10_28<='\uFFFF')) ) {s = 16;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA10_31 = input.LA(1);

                        s = -1;
                        if ( (LA10_31=='n') ) {s = 33;}

                        else if ( ((LA10_31>='0' && LA10_31<='9')||(LA10_31>='A' && LA10_31<='Z')||(LA10_31>='a' && LA10_31<='m')||(LA10_31>='o' && LA10_31<='z')) ) {s = 18;}

                        else if ( ((LA10_31>='\u0000' && LA10_31<='\b')||(LA10_31>='\u000B' && LA10_31<='\f')||(LA10_31>='\u000E' && LA10_31<='\u001F')||(LA10_31>='!' && LA10_31<='#')||(LA10_31>='%' && LA10_31<='/')||(LA10_31>=':' && LA10_31<='@')||LA10_31=='`'||LA10_31=='|'||(LA10_31>='~' && LA10_31<='\uFFFF')) ) {s = 16;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA10_33 = input.LA(1);

                        s = -1;
                        if ( (LA10_33=='{') ) {s = 34;}

                        else if ( ((LA10_33>='0' && LA10_33<='9')||(LA10_33>='A' && LA10_33<='Z')||(LA10_33>='a' && LA10_33<='z')) ) {s = 18;}

                        else if ( ((LA10_33>='\u0000' && LA10_33<='\b')||(LA10_33>='\u000B' && LA10_33<='\f')||(LA10_33>='\u000E' && LA10_33<='\u001F')||(LA10_33>='!' && LA10_33<='#')||(LA10_33>='%' && LA10_33<='/')||(LA10_33>=':' && LA10_33<='@')||LA10_33=='`'||LA10_33=='|'||(LA10_33>='~' && LA10_33<='\uFFFF')) ) {s = 16;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA10_2 = input.LA(1);

                        s = -1;
                        if ( (LA10_2=='n') ) {s = 20;}

                        else if ( ((LA10_2>='0' && LA10_2<='9')||(LA10_2>='A' && LA10_2<='Z')||(LA10_2>='a' && LA10_2<='m')||(LA10_2>='o' && LA10_2<='z')) ) {s = 18;}

                        else if ( ((LA10_2>='\u0000' && LA10_2<='\b')||(LA10_2>='\u000B' && LA10_2<='\f')||(LA10_2>='\u000E' && LA10_2<='\u001F')||(LA10_2>='!' && LA10_2<='#')||(LA10_2>='%' && LA10_2<='/')||(LA10_2>=':' && LA10_2<='@')||LA10_2=='`'||LA10_2=='|'||(LA10_2>='~' && LA10_2<='\uFFFF')) ) {s = 16;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA10_30 = input.LA(1);

                        s = -1;
                        if ( ((LA10_30>='0' && LA10_30<='9')) ) {s = 30;}

                        else if ( ((LA10_30>='\u0000' && LA10_30<='\b')||(LA10_30>='\u000B' && LA10_30<='\f')||(LA10_30>='\u000E' && LA10_30<='\u001F')||(LA10_30>='!' && LA10_30<='#')||(LA10_30>='%' && LA10_30<='/')||(LA10_30>=':' && LA10_30<='Z')||(LA10_30>='`' && LA10_30<='z')||LA10_30=='|'||(LA10_30>='~' && LA10_30<='\uFFFF')) ) {s = 16;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA10_13 = input.LA(1);

                        s = -1;
                        if ( ((LA10_13>='\u0000' && LA10_13<='\b')||(LA10_13>='\u000B' && LA10_13<='\f')||(LA10_13>='\u000E' && LA10_13<='\u001F')||(LA10_13>='!' && LA10_13<='#')||(LA10_13>='%' && LA10_13<='Z')||(LA10_13>='`' && LA10_13<='z')||LA10_13=='|'||(LA10_13>='~' && LA10_13<='\uFFFF')) ) {s = 16;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA10_14 = input.LA(1);

                        s = -1;
                        if ( ((LA10_14>='0' && LA10_14<='9')||(LA10_14>='A' && LA10_14<='Z')||(LA10_14>='a' && LA10_14<='z')) ) {s = 18;}

                        else if ( ((LA10_14>='\u0000' && LA10_14<='\b')||(LA10_14>='\u000B' && LA10_14<='\f')||(LA10_14>='\u000E' && LA10_14<='\u001F')||(LA10_14>='!' && LA10_14<='#')||(LA10_14>='%' && LA10_14<='/')||(LA10_14>=':' && LA10_14<='@')||LA10_14=='`'||LA10_14=='|'||(LA10_14>='~' && LA10_14<='\uFFFF')) ) {s = 16;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA10_20 = input.LA(1);

                        s = -1;
                        if ( (LA10_20=='d') ) {s = 29;}

                        else if ( ((LA10_20>='0' && LA10_20<='9')||(LA10_20>='A' && LA10_20<='Z')||(LA10_20>='a' && LA10_20<='c')||(LA10_20>='e' && LA10_20<='z')) ) {s = 18;}

                        else if ( ((LA10_20>='\u0000' && LA10_20<='\b')||(LA10_20>='\u000B' && LA10_20<='\f')||(LA10_20>='\u000E' && LA10_20<='\u001F')||(LA10_20>='!' && LA10_20<='#')||(LA10_20>='%' && LA10_20<='/')||(LA10_20>=':' && LA10_20<='@')||LA10_20=='`'||LA10_20=='|'||(LA10_20>='~' && LA10_20<='\uFFFF')) ) {s = 16;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA10_29 = input.LA(1);

                        s = -1;
                        if ( (LA10_29=='{') ) {s = 32;}

                        else if ( ((LA10_29>='0' && LA10_29<='9')||(LA10_29>='A' && LA10_29<='Z')||(LA10_29>='a' && LA10_29<='z')) ) {s = 18;}

                        else if ( ((LA10_29>='\u0000' && LA10_29<='\b')||(LA10_29>='\u000B' && LA10_29<='\f')||(LA10_29>='\u000E' && LA10_29<='\u001F')||(LA10_29>='!' && LA10_29<='#')||(LA10_29>='%' && LA10_29<='/')||(LA10_29>=':' && LA10_29<='@')||LA10_29=='`'||LA10_29=='|'||(LA10_29>='~' && LA10_29<='\uFFFF')) ) {s = 16;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA10_11 = input.LA(1);

                        s = -1;
                        if ( (LA10_11=='.') ) {s = 27;}

                        else if ( ((LA10_11>='0' && LA10_11<='9')) ) {s = 11;}

                        else if ( ((LA10_11>='\u0000' && LA10_11<='\b')||(LA10_11>='\u000B' && LA10_11<='\f')||(LA10_11>='\u000E' && LA10_11<='\u001F')||(LA10_11>='!' && LA10_11<='#')||(LA10_11>='%' && LA10_11<='-')||LA10_11=='/'||(LA10_11>=':' && LA10_11<='Z')||(LA10_11>='`' && LA10_11<='z')||LA10_11=='|'||(LA10_11>='~' && LA10_11<='\uFFFF')) ) {s = 16;}

                        else s = 26;

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