package org.xixum.latex.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTexDslLexer extends Lexer {
    public static final int RULE_END=11;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_NUMBER=6;
    public static final int RULE_INT=8;
    public static final int RULE_TEXT=5;
    public static final int RULE_SYMBOL=7;
    public static final int T__20=20;

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

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
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
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
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
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
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
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
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
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
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
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTexDsl.g:16:7: ( '\\\\begin{' )
            // InternalTexDsl.g:16:9: '\\\\begin{'
            {
            match("\\begin{"); 


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
            // InternalTexDsl.g:17:7: ( '\\\\end{' )
            // InternalTexDsl.g:17:9: '\\\\end{'
            {
            match("\\end{"); 


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
            // InternalTexDsl.g:18:7: ( '$' )
            // InternalTexDsl.g:18:9: '$'
            {
            match('$'); 

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
            // InternalTexDsl.g:19:7: ( '$$' )
            // InternalTexDsl.g:19:9: '$$'
            {
            match("$$"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "RULE_NUMBER"
    public final void mRULE_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTexDsl.g:780:13: ( RULE_INT ( '.' RULE_INT )? )
            // InternalTexDsl.g:780:15: RULE_INT ( '.' RULE_INT )?
            {
            mRULE_INT(); 
            // InternalTexDsl.g:780:24: ( '.' RULE_INT )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='.') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalTexDsl.g:780:25: '.' RULE_INT
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

    // $ANTLR start "RULE_SYMBOL"
    public final void mRULE_SYMBOL() throws RecognitionException {
        try {
            int _type = RULE_SYMBOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTexDsl.g:782:13: ( ( '+' | '-' | '=' | '/' | '*' | '^' | '_' | '<' | '>' | '&' | '%' | '#' ) )
            // InternalTexDsl.g:782:15: ( '+' | '-' | '=' | '/' | '*' | '^' | '_' | '<' | '>' | '&' | '%' | '#' )
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

    // $ANTLR start "RULE_TEXT"
    public final void mRULE_TEXT() throws RecognitionException {
        try {
            int _type = RULE_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTexDsl.g:784:11: ( (~ ( ( '\\\\' | '$' | '{' | '}' | '[' | ']' | '^' | '_' | ' ' | '\\t' | '\\r' | '\\n' ) ) )+ )
            // InternalTexDsl.g:784:13: (~ ( ( '\\\\' | '$' | '{' | '}' | '[' | ']' | '^' | '_' | ' ' | '\\t' | '\\r' | '\\n' ) ) )+
            {
            // InternalTexDsl.g:784:13: (~ ( ( '\\\\' | '$' | '{' | '}' | '[' | ']' | '^' | '_' | ' ' | '\\t' | '\\r' | '\\n' ) ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='\b')||(LA2_0>='\u000B' && LA2_0<='\f')||(LA2_0>='\u000E' && LA2_0<='\u001F')||(LA2_0>='!' && LA2_0<='#')||(LA2_0>='%' && LA2_0<='Z')||(LA2_0>='`' && LA2_0<='z')||LA2_0=='|'||(LA2_0>='~' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTexDsl.g:784:13: ~ ( ( '\\\\' | '$' | '{' | '}' | '[' | ']' | '^' | '_' | ' ' | '\\t' | '\\r' | '\\n' ) )
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
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TEXT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTexDsl.g:786:17: ( '%' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalTexDsl.g:786:19: '%' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('%'); 
            // InternalTexDsl.g:786:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='\f')||(LA3_0>='\u000E' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTexDsl.g:786:23: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop3;
                }
            } while (true);

            // InternalTexDsl.g:786:39: ( ( '\\r' )? '\\n' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\n'||LA5_0=='\r') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalTexDsl.g:786:40: ( '\\r' )? '\\n'
                    {
                    // InternalTexDsl.g:786:40: ( '\\r' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='\r') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalTexDsl.g:786:40: '\\r'
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
            // InternalTexDsl.g:788:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalTexDsl.g:788:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalTexDsl.g:788:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\t' && LA6_0<='\n')||LA6_0=='\r'||LA6_0==' ') ) {
                    alt6=1;
                }


                switch (alt6) {
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
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            // InternalTexDsl.g:790:19: ( ( '0' .. '9' )+ )
            // InternalTexDsl.g:790:21: ( '0' .. '9' )+
            {
            // InternalTexDsl.g:790:21: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalTexDsl.g:790:22: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
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
            // InternalTexDsl.g:792:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalTexDsl.g:792:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalTexDsl.g:792:11: ( '^' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='^') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTexDsl.g:792:11: '^'
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

            // InternalTexDsl.g:792:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')||(LA9_0>='A' && LA9_0<='Z')||LA9_0=='_'||(LA9_0>='a' && LA9_0<='z')) ) {
                    alt9=1;
                }


                switch (alt9) {
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
            	    break loop9;
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

    // $ANTLR start "RULE_END"
    public final void mRULE_END() throws RecognitionException {
        try {
            int _type = RULE_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTexDsl.g:794:10: ( EOF )
            // InternalTexDsl.g:794:12: EOF
            {
            match(EOF); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_END"

    public void mTokens() throws RecognitionException {
        // InternalTexDsl.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | RULE_NUMBER | RULE_SYMBOL | RULE_TEXT | RULE_SL_COMMENT | RULE_WS | RULE_ID | RULE_END )
        int alt10=16;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // InternalTexDsl.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalTexDsl.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalTexDsl.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalTexDsl.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalTexDsl.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalTexDsl.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalTexDsl.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalTexDsl.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalTexDsl.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalTexDsl.g:1:64: RULE_NUMBER
                {
                mRULE_NUMBER(); 

                }
                break;
            case 11 :
                // InternalTexDsl.g:1:76: RULE_SYMBOL
                {
                mRULE_SYMBOL(); 

                }
                break;
            case 12 :
                // InternalTexDsl.g:1:88: RULE_TEXT
                {
                mRULE_TEXT(); 

                }
                break;
            case 13 :
                // InternalTexDsl.g:1:98: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 14 :
                // InternalTexDsl.g:1:114: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 15 :
                // InternalTexDsl.g:1:122: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 16 :
                // InternalTexDsl.g:1:130: RULE_END
                {
                mRULE_END(); 

                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\1\17\1\22\4\uffff\1\24\1\25\2\27\1\16\1\27\1\uffff\1\27\10\uffff\1\16\1\uffff\1\16\2\uffff\1\16\1\25";
    static final String DFA10_eofS =
        "\35\uffff";
    static final String DFA10_minS =
        "\1\0\1\142\4\uffff\1\44\2\0\1\101\1\60\1\0\1\uffff\1\60\10\uffff\1\60\1\uffff\1\0\2\uffff\1\60\1\0";
    static final String DFA10_maxS =
        "\1\uffff\1\145\4\uffff\1\44\2\uffff\2\172\1\uffff\1\uffff\1\172\10\uffff\1\71\1\uffff\1\uffff\2\uffff\1\172\1\uffff";
    static final String DFA10_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\6\uffff\1\16\1\uffff\1\14\1\20\1\6\1\7\1\1\1\11\1\10\1\12\1\uffff\1\13\1\uffff\1\15\1\17\2\uffff";
    static final String DFA10_specialS =
        "\1\2\6\uffff\1\5\1\3\2\uffff\1\1\14\uffff\1\0\3\uffff\1\4}>";
    static final String[] DFA10_transitionS = DFA10_transitionS_.DFA10_transitionS;
    private static final class DFA10_transitionS_ {
        static final String[] DFA10_transitionS = {
                "\11\16\2\14\2\16\1\14\22\16\1\14\2\16\1\13\1\6\1\10\1\13\3\16\2\13\1\16\1\13\1\16\1\13\12\7\2\16\3\13\2\16\32\12\1\2\1\1\1\3\1\11\1\15\1\16\32\12\1\4\1\16\1\5\uff82\16",
                "\1\20\2\uffff\1\21",
                "",
                "",
                "",
                "",
                "\1\23",
                "\11\16\2\uffff\2\16\1\uffff\22\16\1\uffff\3\16\1\uffff\11\16\1\26\1\16\12\7\41\16\5\uffff\33\16\1\uffff\1\16\1\uffff\uff82\16",
                "\11\30\2\31\2\30\1\31\22\30\1\31\3\30\1\31\66\30\5\31\33\30\1\31\1\30\1\31\uff82\30",
                "\32\32\4\uffff\1\32\1\uffff\32\32",
                "\12\33\7\uffff\32\33\4\uffff\1\32\1\uffff\32\33",
                "\11\16\2\uffff\2\16\1\uffff\22\16\1\uffff\3\16\1\uffff\66\16\5\uffff\33\16\1\uffff\1\16\1\uffff\uff82\16",
                "",
                "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "\12\34",
                "",
                "\11\30\2\31\2\30\1\31\22\30\1\31\3\30\1\31\66\30\5\31\33\30\1\31\1\30\1\31\uff82\30",
                "",
                "",
                "\12\33\7\uffff\32\33\4\uffff\1\32\1\uffff\32\33",
                "\11\16\2\uffff\2\16\1\uffff\22\16\1\uffff\3\16\1\uffff\13\16\12\34\41\16\5\uffff\33\16\1\uffff\1\16\1\uffff\uff82\16"
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
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | RULE_NUMBER | RULE_SYMBOL | RULE_TEXT | RULE_SL_COMMENT | RULE_WS | RULE_ID | RULE_END );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_24 = input.LA(1);

                        s = -1;
                        if ( ((LA10_24>='\t' && LA10_24<='\n')||LA10_24=='\r'||LA10_24==' '||LA10_24=='$'||(LA10_24>='[' && LA10_24<='_')||LA10_24=='{'||LA10_24=='}') ) {s = 25;}

                        else if ( ((LA10_24>='\u0000' && LA10_24<='\b')||(LA10_24>='\u000B' && LA10_24<='\f')||(LA10_24>='\u000E' && LA10_24<='\u001F')||(LA10_24>='!' && LA10_24<='#')||(LA10_24>='%' && LA10_24<='Z')||(LA10_24>='`' && LA10_24<='z')||LA10_24=='|'||(LA10_24>='~' && LA10_24<='\uFFFF')) ) {s = 24;}

                        else s = 14;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA10_11 = input.LA(1);

                        s = -1;
                        if ( ((LA10_11>='\u0000' && LA10_11<='\b')||(LA10_11>='\u000B' && LA10_11<='\f')||(LA10_11>='\u000E' && LA10_11<='\u001F')||(LA10_11>='!' && LA10_11<='#')||(LA10_11>='%' && LA10_11<='Z')||(LA10_11>='`' && LA10_11<='z')||LA10_11=='|'||(LA10_11>='~' && LA10_11<='\uFFFF')) ) {s = 14;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA10_0 = input.LA(1);

                        s = -1;
                        if ( (LA10_0=='\\') ) {s = 1;}

                        else if ( (LA10_0=='[') ) {s = 2;}

                        else if ( (LA10_0==']') ) {s = 3;}

                        else if ( (LA10_0=='{') ) {s = 4;}

                        else if ( (LA10_0=='}') ) {s = 5;}

                        else if ( (LA10_0=='$') ) {s = 6;}

                        else if ( ((LA10_0>='0' && LA10_0<='9')) ) {s = 7;}

                        else if ( (LA10_0=='%') ) {s = 8;}

                        else if ( (LA10_0=='^') ) {s = 9;}

                        else if ( ((LA10_0>='A' && LA10_0<='Z')||(LA10_0>='a' && LA10_0<='z')) ) {s = 10;}

                        else if ( (LA10_0=='#'||LA10_0=='&'||(LA10_0>='*' && LA10_0<='+')||LA10_0=='-'||LA10_0=='/'||(LA10_0>='<' && LA10_0<='>')) ) {s = 11;}

                        else if ( ((LA10_0>='\t' && LA10_0<='\n')||LA10_0=='\r'||LA10_0==' ') ) {s = 12;}

                        else if ( (LA10_0=='_') ) {s = 13;}

                        else if ( ((LA10_0>='\u0000' && LA10_0<='\b')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\u001F')||(LA10_0>='!' && LA10_0<='\"')||(LA10_0>='\'' && LA10_0<=')')||LA10_0==','||LA10_0=='.'||(LA10_0>=':' && LA10_0<=';')||(LA10_0>='?' && LA10_0<='@')||LA10_0=='`'||LA10_0=='|'||(LA10_0>='~' && LA10_0<='\uFFFF')) ) {s = 14;}

                        else s = 15;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA10_8 = input.LA(1);

                        s = -1;
                        if ( ((LA10_8>='\u0000' && LA10_8<='\b')||(LA10_8>='\u000B' && LA10_8<='\f')||(LA10_8>='\u000E' && LA10_8<='\u001F')||(LA10_8>='!' && LA10_8<='#')||(LA10_8>='%' && LA10_8<='Z')||(LA10_8>='`' && LA10_8<='z')||LA10_8=='|'||(LA10_8>='~' && LA10_8<='\uFFFF')) ) {s = 24;}

                        else if ( ((LA10_8>='\t' && LA10_8<='\n')||LA10_8=='\r'||LA10_8==' '||LA10_8=='$'||(LA10_8>='[' && LA10_8<='_')||LA10_8=='{'||LA10_8=='}') ) {s = 25;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA10_28 = input.LA(1);

                        s = -1;
                        if ( ((LA10_28>='0' && LA10_28<='9')) ) {s = 28;}

                        else if ( ((LA10_28>='\u0000' && LA10_28<='\b')||(LA10_28>='\u000B' && LA10_28<='\f')||(LA10_28>='\u000E' && LA10_28<='\u001F')||(LA10_28>='!' && LA10_28<='#')||(LA10_28>='%' && LA10_28<='/')||(LA10_28>=':' && LA10_28<='Z')||(LA10_28>='`' && LA10_28<='z')||LA10_28=='|'||(LA10_28>='~' && LA10_28<='\uFFFF')) ) {s = 14;}

                        else s = 21;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA10_7 = input.LA(1);

                        s = -1;
                        if ( (LA10_7=='.') ) {s = 22;}

                        else if ( ((LA10_7>='0' && LA10_7<='9')) ) {s = 7;}

                        else if ( ((LA10_7>='\u0000' && LA10_7<='\b')||(LA10_7>='\u000B' && LA10_7<='\f')||(LA10_7>='\u000E' && LA10_7<='\u001F')||(LA10_7>='!' && LA10_7<='#')||(LA10_7>='%' && LA10_7<='-')||LA10_7=='/'||(LA10_7>=':' && LA10_7<='Z')||(LA10_7>='`' && LA10_7<='z')||LA10_7=='|'||(LA10_7>='~' && LA10_7<='\uFFFF')) ) {s = 14;}

                        else s = 21;

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