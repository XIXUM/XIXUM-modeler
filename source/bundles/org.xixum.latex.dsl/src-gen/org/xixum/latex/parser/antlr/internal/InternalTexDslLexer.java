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
    public static final int RULE_ALPHA=21;
    public static final int RULE_END=4;
    public static final int RULE_CUBO=15;
    public static final int RULE_AND=23;
    public static final int RULE_SL_COMMENT=20;
    public static final int RULE_EQ=19;
    public static final int RULE_D_QUOTE=27;
    public static final int RULE_SPACE=29;
    public static final int RULE_DOT=11;
    public static final int EOF=-1;
    public static final int RULE_EXCL=9;
    public static final int RULE_ID_COMM=12;
    public static final int RULE_NUMERIC=22;
    public static final int RULE_ID=5;
    public static final int RULE_WS=30;
    public static final int RULE_SQBO=13;
    public static final int RULE_S_QUOTE=28;
    public static final int RULE_BO=17;
    public static final int RULE_ANY_OTHER=6;
    public static final int RULE_SQBC=14;
    public static final int RULE_ALPHAS=26;
    public static final int RULE_BS=24;
    public static final int RULE_KOMMA=7;
    public static final int RULE_PIPE=8;
    public static final int RULE_CUBC=16;
    public static final int RULE_SYMBOL=10;
    public static final int RULE_ALPHAC=25;
    public static final int RULE_BC=18;

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

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTexDsl.g:747:17: ( '%' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalTexDsl.g:747:19: '%' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('%'); 
            // InternalTexDsl.g:747:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTexDsl.g:747:23: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalTexDsl.g:747:39: ( ( '\\r' )? '\\n' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\n'||LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalTexDsl.g:747:40: ( '\\r' )? '\\n'
                    {
                    // InternalTexDsl.g:747:40: ( '\\r' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='\r') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalTexDsl.g:747:40: '\\r'
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

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTexDsl.g:749:9: ( ( RULE_ALPHA | RULE_SYMBOL ) ( RULE_ALPHA | RULE_SYMBOL | RULE_NUMERIC | RULE_DOT | RULE_AND )* )
            // InternalTexDsl.g:749:11: ( RULE_ALPHA | RULE_SYMBOL ) ( RULE_ALPHA | RULE_SYMBOL | RULE_NUMERIC | RULE_DOT | RULE_AND )*
            {
            if ( (input.LA(1)>='\"' && input.LA(1)<='#')||input.LA(1)=='\''||input.LA(1)=='+'||input.LA(1)=='-'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='~'||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00DC')||(input.LA(1)>='\u00DF' && input.LA(1)<='\u00FC') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalTexDsl.g:749:36: ( RULE_ALPHA | RULE_SYMBOL | RULE_NUMERIC | RULE_DOT | RULE_AND )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\"' && LA4_0<='#')||(LA4_0>='&' && LA4_0<='\'')||LA4_0=='+'||(LA4_0>='-' && LA4_0<='.')||(LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')||LA4_0=='~'||(LA4_0>='\u00C0' && LA4_0<='\u00DC')||(LA4_0>='\u00DF' && LA4_0<='\u00FC')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalTexDsl.g:
            	    {
            	    if ( (input.LA(1)>='\"' && input.LA(1)<='#')||(input.LA(1)>='&' && input.LA(1)<='\'')||input.LA(1)=='+'||(input.LA(1)>='-' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='~'||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00DC')||(input.LA(1)>='\u00DF' && input.LA(1)<='\u00FC') ) {
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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_BS"
    public final void mRULE_BS() throws RecognitionException {
        try {
            // InternalTexDsl.g:751:18: ( '\\\\' )
            // InternalTexDsl.g:751:20: '\\\\'
            {
            match('\\'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_BS"

    // $ANTLR start "RULE_ID_COMM"
    public final void mRULE_ID_COMM() throws RecognitionException {
        try {
            int _type = RULE_ID_COMM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTexDsl.g:753:14: ( RULE_BS RULE_ID )
            // InternalTexDsl.g:753:16: RULE_BS RULE_ID
            {
            mRULE_BS(); 
            mRULE_ID(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID_COMM"

    // $ANTLR start "RULE_ALPHA"
    public final void mRULE_ALPHA() throws RecognitionException {
        try {
            // InternalTexDsl.g:755:21: ( ( RULE_ALPHAC | RULE_ALPHAS | RULE_D_QUOTE | RULE_S_QUOTE ) )
            // InternalTexDsl.g:755:23: ( RULE_ALPHAC | RULE_ALPHAS | RULE_D_QUOTE | RULE_S_QUOTE )
            {
            if ( input.LA(1)=='\"'||input.LA(1)=='\''||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00DC')||(input.LA(1)>='\u00DF' && input.LA(1)<='\u00FC') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ALPHA"

    // $ANTLR start "RULE_ALPHAC"
    public final void mRULE_ALPHAC() throws RecognitionException {
        try {
            // InternalTexDsl.g:757:22: ( ( 'A' .. 'Z' | '\\u00C4' .. '\\u00DC' | '\\u00C0' .. '\\u00D9' | '\\u00C1' .. '\\u00DA' ) )
            // InternalTexDsl.g:757:24: ( 'A' .. 'Z' | '\\u00C4' .. '\\u00DC' | '\\u00C0' .. '\\u00D9' | '\\u00C1' .. '\\u00DA' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00DC') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ALPHAC"

    // $ANTLR start "RULE_ALPHAS"
    public final void mRULE_ALPHAS() throws RecognitionException {
        try {
            // InternalTexDsl.g:759:22: ( ( 'a' .. 'z' | '\\u00E4' .. '\\u00FC' | '\\u00DF' | '\\u00E0' .. '\\u00F9' | '\\u00E1' .. '\\u00FA' ) )
            // InternalTexDsl.g:759:24: ( 'a' .. 'z' | '\\u00E4' .. '\\u00FC' | '\\u00DF' | '\\u00E0' .. '\\u00F9' | '\\u00E1' .. '\\u00FA' )
            {
            if ( (input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00DF' && input.LA(1)<='\u00FC') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ALPHAS"

    // $ANTLR start "RULE_NUMERIC"
    public final void mRULE_NUMERIC() throws RecognitionException {
        try {
            // InternalTexDsl.g:761:23: ( '0' .. '9' )
            // InternalTexDsl.g:761:25: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_NUMERIC"

    // $ANTLR start "RULE_SQBO"
    public final void mRULE_SQBO() throws RecognitionException {
        try {
            int _type = RULE_SQBO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTexDsl.g:763:11: ( '[' )
            // InternalTexDsl.g:763:13: '['
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
            // InternalTexDsl.g:765:11: ( ']' )
            // InternalTexDsl.g:765:13: ']'
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

    // $ANTLR start "RULE_BO"
    public final void mRULE_BO() throws RecognitionException {
        try {
            int _type = RULE_BO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTexDsl.g:767:9: ( '(' )
            // InternalTexDsl.g:767:11: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BO"

    // $ANTLR start "RULE_BC"
    public final void mRULE_BC() throws RecognitionException {
        try {
            int _type = RULE_BC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTexDsl.g:769:9: ( ')' )
            // InternalTexDsl.g:769:11: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BC"

    // $ANTLR start "RULE_CUBO"
    public final void mRULE_CUBO() throws RecognitionException {
        try {
            int _type = RULE_CUBO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTexDsl.g:771:11: ( '{' )
            // InternalTexDsl.g:771:13: '{'
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
            // InternalTexDsl.g:773:11: ( '}' )
            // InternalTexDsl.g:773:13: '}'
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

    // $ANTLR start "RULE_KOMMA"
    public final void mRULE_KOMMA() throws RecognitionException {
        try {
            int _type = RULE_KOMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTexDsl.g:775:12: ( ',' )
            // InternalTexDsl.g:775:14: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KOMMA"

    // $ANTLR start "RULE_EQ"
    public final void mRULE_EQ() throws RecognitionException {
        try {
            int _type = RULE_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTexDsl.g:777:9: ( '=' )
            // InternalTexDsl.g:777:11: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EQ"

    // $ANTLR start "RULE_DOT"
    public final void mRULE_DOT() throws RecognitionException {
        try {
            int _type = RULE_DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTexDsl.g:779:10: ( '.' )
            // InternalTexDsl.g:779:12: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOT"

    // $ANTLR start "RULE_AND"
    public final void mRULE_AND() throws RecognitionException {
        try {
            // InternalTexDsl.g:781:19: ( '&' )
            // InternalTexDsl.g:781:21: '&'
            {
            match('&'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_AND"

    // $ANTLR start "RULE_PIPE"
    public final void mRULE_PIPE() throws RecognitionException {
        try {
            int _type = RULE_PIPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTexDsl.g:783:11: ( '|' )
            // InternalTexDsl.g:783:13: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PIPE"

    // $ANTLR start "RULE_EXCL"
    public final void mRULE_EXCL() throws RecognitionException {
        try {
            int _type = RULE_EXCL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTexDsl.g:785:11: ( '!' )
            // InternalTexDsl.g:785:13: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXCL"

    // $ANTLR start "RULE_SPACE"
    public final void mRULE_SPACE() throws RecognitionException {
        try {
            // InternalTexDsl.g:787:21: ( ' ' )
            // InternalTexDsl.g:787:23: ' '
            {
            match(' '); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_SPACE"

    // $ANTLR start "RULE_SYMBOL"
    public final void mRULE_SYMBOL() throws RecognitionException {
        try {
            int _type = RULE_SYMBOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTexDsl.g:789:13: ( ( '-' | '_' | '+' | '#' | '~' ) )
            // InternalTexDsl.g:789:15: ( '-' | '_' | '+' | '#' | '~' )
            {
            if ( input.LA(1)=='#'||input.LA(1)=='+'||input.LA(1)=='-'||input.LA(1)=='_'||input.LA(1)=='~' ) {
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

    // $ANTLR start "RULE_D_QUOTE"
    public final void mRULE_D_QUOTE() throws RecognitionException {
        try {
            // InternalTexDsl.g:791:23: ( '\"' )
            // InternalTexDsl.g:791:25: '\"'
            {
            match('\"'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_D_QUOTE"

    // $ANTLR start "RULE_S_QUOTE"
    public final void mRULE_S_QUOTE() throws RecognitionException {
        try {
            // InternalTexDsl.g:793:23: ( '\\'' )
            // InternalTexDsl.g:793:25: '\\''
            {
            match('\''); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_S_QUOTE"

    // $ANTLR start "RULE_END"
    public final void mRULE_END() throws RecognitionException {
        try {
            int _type = RULE_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTexDsl.g:795:10: ( EOF )
            // InternalTexDsl.g:795:12: EOF
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

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTexDsl.g:797:9: ( ( RULE_SPACE | '\\t' | '\\r' | '\\n' )+ )
            // InternalTexDsl.g:797:11: ( RULE_SPACE | '\\t' | '\\r' | '\\n' )+
            {
            // InternalTexDsl.g:797:11: ( RULE_SPACE | '\\t' | '\\r' | '\\n' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\t' && LA5_0<='\n')||LA5_0=='\r'||LA5_0==' ') ) {
                    alt5=1;
                }


                switch (alt5) {
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
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
            // InternalTexDsl.g:799:16: ( . )
            // InternalTexDsl.g:799:18: .
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
        // InternalTexDsl.g:1:8: ( RULE_SL_COMMENT | RULE_ID | RULE_ID_COMM | RULE_SQBO | RULE_SQBC | RULE_BO | RULE_BC | RULE_CUBO | RULE_CUBC | RULE_KOMMA | RULE_EQ | RULE_DOT | RULE_PIPE | RULE_EXCL | RULE_SYMBOL | RULE_END | RULE_WS | RULE_ANY_OTHER )
        int alt6=18;
        alt6 = dfa6.predict(input);
        switch (alt6) {
            case 1 :
                // InternalTexDsl.g:1:10: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 2 :
                // InternalTexDsl.g:1:26: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 3 :
                // InternalTexDsl.g:1:34: RULE_ID_COMM
                {
                mRULE_ID_COMM(); 

                }
                break;
            case 4 :
                // InternalTexDsl.g:1:47: RULE_SQBO
                {
                mRULE_SQBO(); 

                }
                break;
            case 5 :
                // InternalTexDsl.g:1:57: RULE_SQBC
                {
                mRULE_SQBC(); 

                }
                break;
            case 6 :
                // InternalTexDsl.g:1:67: RULE_BO
                {
                mRULE_BO(); 

                }
                break;
            case 7 :
                // InternalTexDsl.g:1:75: RULE_BC
                {
                mRULE_BC(); 

                }
                break;
            case 8 :
                // InternalTexDsl.g:1:83: RULE_CUBO
                {
                mRULE_CUBO(); 

                }
                break;
            case 9 :
                // InternalTexDsl.g:1:93: RULE_CUBC
                {
                mRULE_CUBC(); 

                }
                break;
            case 10 :
                // InternalTexDsl.g:1:103: RULE_KOMMA
                {
                mRULE_KOMMA(); 

                }
                break;
            case 11 :
                // InternalTexDsl.g:1:114: RULE_EQ
                {
                mRULE_EQ(); 

                }
                break;
            case 12 :
                // InternalTexDsl.g:1:122: RULE_DOT
                {
                mRULE_DOT(); 

                }
                break;
            case 13 :
                // InternalTexDsl.g:1:131: RULE_PIPE
                {
                mRULE_PIPE(); 

                }
                break;
            case 14 :
                // InternalTexDsl.g:1:141: RULE_EXCL
                {
                mRULE_EXCL(); 

                }
                break;
            case 15 :
                // InternalTexDsl.g:1:151: RULE_SYMBOL
                {
                mRULE_SYMBOL(); 

                }
                break;
            case 16 :
                // InternalTexDsl.g:1:163: RULE_END
                {
                mRULE_END(); 

                }
                break;
            case 17 :
                // InternalTexDsl.g:1:172: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 18 :
                // InternalTexDsl.g:1:180: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\1\20\2\uffff\1\22\36\uffff";
    static final String DFA6_eofS =
        "\42\uffff";
    static final String DFA6_minS =
        "\1\0\2\uffff\1\42\36\uffff";
    static final String DFA6_maxS =
        "\1\uffff\2\uffff\1\u00fc\36\uffff";
    static final String DFA6_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\2\1\20\1\21\1\22\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\21";
    static final String DFA6_specialS =
        "\1\0\41\uffff}>";
    static final String[] DFA6_transitionS = {
            "\11\22\2\21\2\22\1\21\22\22\1\21\1\16\1\17\1\2\1\22\1\1\1\22\1\17\1\6\1\7\1\22\1\2\1\12\1\2\1\14\16\22\1\13\3\22\32\17\1\4\1\3\1\5\1\22\1\2\1\22\32\17\1\10\1\15\1\11\1\2\101\22\35\17\2\22\36\17\uff03\22",
            "",
            "",
            "\2\25\3\uffff\1\25\3\uffff\1\25\1\uffff\1\25\23\uffff\32\25\4\uffff\1\25\1\uffff\32\25\3\uffff\1\25\101\uffff\35\25\2\uffff\36\25",
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
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( RULE_SL_COMMENT | RULE_ID | RULE_ID_COMM | RULE_SQBO | RULE_SQBC | RULE_BO | RULE_BC | RULE_CUBO | RULE_CUBC | RULE_KOMMA | RULE_EQ | RULE_DOT | RULE_PIPE | RULE_EXCL | RULE_SYMBOL | RULE_END | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA6_0 = input.LA(1);

                        s = -1;
                        if ( (LA6_0=='%') ) {s = 1;}

                        else if ( (LA6_0=='#'||LA6_0=='+'||LA6_0=='-'||LA6_0=='_'||LA6_0=='~') ) {s = 2;}

                        else if ( (LA6_0=='\\') ) {s = 3;}

                        else if ( (LA6_0=='[') ) {s = 4;}

                        else if ( (LA6_0==']') ) {s = 5;}

                        else if ( (LA6_0=='(') ) {s = 6;}

                        else if ( (LA6_0==')') ) {s = 7;}

                        else if ( (LA6_0=='{') ) {s = 8;}

                        else if ( (LA6_0=='}') ) {s = 9;}

                        else if ( (LA6_0==',') ) {s = 10;}

                        else if ( (LA6_0=='=') ) {s = 11;}

                        else if ( (LA6_0=='.') ) {s = 12;}

                        else if ( (LA6_0=='|') ) {s = 13;}

                        else if ( (LA6_0=='!') ) {s = 14;}

                        else if ( (LA6_0=='\"'||LA6_0=='\''||(LA6_0>='A' && LA6_0<='Z')||(LA6_0>='a' && LA6_0<='z')||(LA6_0>='\u00C0' && LA6_0<='\u00DC')||(LA6_0>='\u00DF' && LA6_0<='\u00FC')) ) {s = 15;}

                        else if ( ((LA6_0>='\t' && LA6_0<='\n')||LA6_0=='\r'||LA6_0==' ') ) {s = 17;}

                        else if ( ((LA6_0>='\u0000' && LA6_0<='\b')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='\u001F')||LA6_0=='$'||LA6_0=='&'||LA6_0=='*'||(LA6_0>='/' && LA6_0<='<')||(LA6_0>='>' && LA6_0<='@')||LA6_0=='^'||LA6_0=='`'||(LA6_0>='\u007F' && LA6_0<='\u00BF')||(LA6_0>='\u00DD' && LA6_0<='\u00DE')||(LA6_0>='\u00FD' && LA6_0<='\uFFFF')) ) {s = 18;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 6, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}