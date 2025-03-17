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
    public static final int RULE_ALPHA=22;
    public static final int RULE_END=4;
    public static final int RULE_CUBO=11;
    public static final int RULE_AND=25;
    public static final int RULE_SL_COMMENT=19;
    public static final int RULE_EQ=17;
    public static final int RULE_SPACE=10;
    public static final int RULE_DOT=24;
    public static final int EOF=-1;
    public static final int RULE_NUMERIC=23;
    public static final int RULE_ID=6;
    public static final int RULE_WS=28;
    public static final int RULE_SQBO=14;
    public static final int RULE_ALPHA_NUMERIC=5;
    public static final int RULE_BO=8;
    public static final int RULE_SQBC=16;
    public static final int RULE_ANY_OTHER=29;
    public static final int RULE_ALPHAS=27;
    public static final int RULE_BS=7;
    public static final int RULE_KOMMA=15;
    public static final int RULE_PIPE=12;
    public static final int RULE_CUBC=13;
    public static final int RULE_ML_COMMENT=18;
    public static final int RULE_SYMBOL=20;
    public static final int RULE_ALPHAC=26;
    public static final int RULE_BC=9;
    public static final int RULE_SYMBOLS=21;

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

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTexDsl.g:784:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalTexDsl.g:784:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalTexDsl.g:784:24: ( options {greedy=false; } : . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='*') ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1=='/') ) {
                        alt1=2;
                    }
                    else if ( ((LA1_1>='\u0000' && LA1_1<='.')||(LA1_1>='0' && LA1_1<='\uFFFF')) ) {
                        alt1=1;
                    }


                }
                else if ( ((LA1_0>='\u0000' && LA1_0<=')')||(LA1_0>='+' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTexDsl.g:784:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
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
            // InternalTexDsl.g:786:17: ( '%' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalTexDsl.g:786:19: '%' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('%'); 
            // InternalTexDsl.g:786:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='\t')||(LA2_0>='\u000B' && LA2_0<='\f')||(LA2_0>='\u000E' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
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
            	    break loop2;
                }
            } while (true);

            // InternalTexDsl.g:786:39: ( ( '\\r' )? '\\n' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\n'||LA4_0=='\r') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalTexDsl.g:786:40: ( '\\r' )? '\\n'
                    {
                    // InternalTexDsl.g:786:40: ( '\\r' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='\r') ) {
                        alt3=1;
                    }
                    switch (alt3) {
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

    // $ANTLR start "RULE_BS"
    public final void mRULE_BS() throws RecognitionException {
        try {
            int _type = RULE_BS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTexDsl.g:788:9: ( '\\\\' )
            // InternalTexDsl.g:788:11: '\\\\'
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

    // $ANTLR start "RULE_SYMBOLS"
    public final void mRULE_SYMBOLS() throws RecognitionException {
        try {
            int _type = RULE_SYMBOLS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTexDsl.g:790:14: ( ( RULE_SYMBOL )+ )
            // InternalTexDsl.g:790:16: ( RULE_SYMBOL )+
            {
            // InternalTexDsl.g:790:16: ( RULE_SYMBOL )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='#'||LA5_0=='+'||LA5_0=='-'||LA5_0=='_'||LA5_0=='~') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTexDsl.g:790:16: RULE_SYMBOL
            	    {
            	    mRULE_SYMBOL(); 

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
    // $ANTLR end "RULE_SYMBOLS"

    // $ANTLR start "RULE_ALPHA_NUMERIC"
    public final void mRULE_ALPHA_NUMERIC() throws RecognitionException {
        try {
            int _type = RULE_ALPHA_NUMERIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTexDsl.g:792:20: ( ( RULE_ALPHA )+ ( ( RULE_NUMERIC )+ ( RULE_ALPHA )+ )* ( RULE_NUMERIC )* )
            // InternalTexDsl.g:792:22: ( RULE_ALPHA )+ ( ( RULE_NUMERIC )+ ( RULE_ALPHA )+ )* ( RULE_NUMERIC )*
            {
            // InternalTexDsl.g:792:22: ( RULE_ALPHA )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='A' && LA6_0<='Z')||(LA6_0>='a' && LA6_0<='z')||(LA6_0>='\u00C0' && LA6_0<='\u00DC')||(LA6_0>='\u00DF' && LA6_0<='\u00FC')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalTexDsl.g:792:22: RULE_ALPHA
            	    {
            	    mRULE_ALPHA(); 

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

            // InternalTexDsl.g:792:34: ( ( RULE_NUMERIC )+ ( RULE_ALPHA )+ )*
            loop9:
            do {
                int alt9=2;
                alt9 = dfa9.predict(input);
                switch (alt9) {
            	case 1 :
            	    // InternalTexDsl.g:792:35: ( RULE_NUMERIC )+ ( RULE_ALPHA )+
            	    {
            	    // InternalTexDsl.g:792:35: ( RULE_NUMERIC )+
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
            	    	    // InternalTexDsl.g:792:35: RULE_NUMERIC
            	    	    {
            	    	    mRULE_NUMERIC(); 

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

            	    // InternalTexDsl.g:792:49: ( RULE_ALPHA )+
            	    int cnt8=0;
            	    loop8:
            	    do {
            	        int alt8=2;
            	        int LA8_0 = input.LA(1);

            	        if ( ((LA8_0>='A' && LA8_0<='Z')||(LA8_0>='a' && LA8_0<='z')||(LA8_0>='\u00C0' && LA8_0<='\u00DC')||(LA8_0>='\u00DF' && LA8_0<='\u00FC')) ) {
            	            alt8=1;
            	        }


            	        switch (alt8) {
            	    	case 1 :
            	    	    // InternalTexDsl.g:792:49: RULE_ALPHA
            	    	    {
            	    	    mRULE_ALPHA(); 

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
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalTexDsl.g:792:63: ( RULE_NUMERIC )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalTexDsl.g:792:63: RULE_NUMERIC
            	    {
            	    mRULE_NUMERIC(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ALPHA_NUMERIC"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTexDsl.g:794:9: ( ( RULE_ALPHA | RULE_SYMBOL ) ( RULE_ALPHA | RULE_SYMBOL | RULE_NUMERIC | RULE_DOT | RULE_AND )* )
            // InternalTexDsl.g:794:11: ( RULE_ALPHA | RULE_SYMBOL ) ( RULE_ALPHA | RULE_SYMBOL | RULE_NUMERIC | RULE_DOT | RULE_AND )*
            {
            if ( input.LA(1)=='#'||input.LA(1)=='+'||input.LA(1)=='-'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='~'||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00DC')||(input.LA(1)>='\u00DF' && input.LA(1)<='\u00FC') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalTexDsl.g:794:36: ( RULE_ALPHA | RULE_SYMBOL | RULE_NUMERIC | RULE_DOT | RULE_AND )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='#'||LA11_0=='&'||LA11_0=='+'||(LA11_0>='-' && LA11_0<='.')||(LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='z')||LA11_0=='~'||(LA11_0>='\u00C0' && LA11_0<='\u00DC')||(LA11_0>='\u00DF' && LA11_0<='\u00FC')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalTexDsl.g:
            	    {
            	    if ( input.LA(1)=='#'||input.LA(1)=='&'||input.LA(1)=='+'||(input.LA(1)>='-' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='~'||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00DC')||(input.LA(1)>='\u00DF' && input.LA(1)<='\u00FC') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop11;
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

    // $ANTLR start "RULE_ALPHA"
    public final void mRULE_ALPHA() throws RecognitionException {
        try {
            // InternalTexDsl.g:796:21: ( ( RULE_ALPHAC | RULE_ALPHAS ) )
            // InternalTexDsl.g:796:23: ( RULE_ALPHAC | RULE_ALPHAS )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00DC')||(input.LA(1)>='\u00DF' && input.LA(1)<='\u00FC') ) {
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
            // InternalTexDsl.g:798:22: ( ( 'A' .. 'Z' | '\\u00C4' .. '\\u00DC' | '\\u00C0' .. '\\u00D9' | '\\u00C1' .. '\\u00DA' ) )
            // InternalTexDsl.g:798:24: ( 'A' .. 'Z' | '\\u00C4' .. '\\u00DC' | '\\u00C0' .. '\\u00D9' | '\\u00C1' .. '\\u00DA' )
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
            // InternalTexDsl.g:800:22: ( ( 'a' .. 'z' | '\\u00E4' .. '\\u00FC' | '\\u00DF' | '\\u00E0' .. '\\u00F9' | '\\u00E1' .. '\\u00FA' ) )
            // InternalTexDsl.g:800:24: ( 'a' .. 'z' | '\\u00E4' .. '\\u00FC' | '\\u00DF' | '\\u00E0' .. '\\u00F9' | '\\u00E1' .. '\\u00FA' )
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
            // InternalTexDsl.g:802:23: ( '0' .. '9' )
            // InternalTexDsl.g:802:25: '0' .. '9'
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
            // InternalTexDsl.g:804:11: ( '[' )
            // InternalTexDsl.g:804:13: '['
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
            // InternalTexDsl.g:806:11: ( ']' )
            // InternalTexDsl.g:806:13: ']'
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
            // InternalTexDsl.g:808:9: ( '(' )
            // InternalTexDsl.g:808:11: '('
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
            // InternalTexDsl.g:810:9: ( ')' )
            // InternalTexDsl.g:810:11: ')'
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
            // InternalTexDsl.g:812:11: ( '{' )
            // InternalTexDsl.g:812:13: '{'
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
            // InternalTexDsl.g:814:11: ( '}' )
            // InternalTexDsl.g:814:13: '}'
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
            // InternalTexDsl.g:816:12: ( ',' )
            // InternalTexDsl.g:816:14: ','
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
            // InternalTexDsl.g:818:9: ( '=' )
            // InternalTexDsl.g:818:11: '='
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
            // InternalTexDsl.g:820:19: ( '.' )
            // InternalTexDsl.g:820:21: '.'
            {
            match('.'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOT"

    // $ANTLR start "RULE_AND"
    public final void mRULE_AND() throws RecognitionException {
        try {
            // InternalTexDsl.g:822:19: ( '&' )
            // InternalTexDsl.g:822:21: '&'
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
            // InternalTexDsl.g:824:11: ( '|' )
            // InternalTexDsl.g:824:13: '|'
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

    // $ANTLR start "RULE_SPACE"
    public final void mRULE_SPACE() throws RecognitionException {
        try {
            int _type = RULE_SPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTexDsl.g:826:12: ( ' ' )
            // InternalTexDsl.g:826:14: ' '
            {
            match(' '); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SPACE"

    // $ANTLR start "RULE_SYMBOL"
    public final void mRULE_SYMBOL() throws RecognitionException {
        try {
            // InternalTexDsl.g:828:22: ( ( '-' | '_' | '+' | '#' | '~' ) )
            // InternalTexDsl.g:828:24: ( '-' | '_' | '+' | '#' | '~' )
            {
            if ( input.LA(1)=='#'||input.LA(1)=='+'||input.LA(1)=='-'||input.LA(1)=='_'||input.LA(1)=='~' ) {
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
    // $ANTLR end "RULE_SYMBOL"

    // $ANTLR start "RULE_END"
    public final void mRULE_END() throws RecognitionException {
        try {
            int _type = RULE_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTexDsl.g:830:10: ( EOF )
            // InternalTexDsl.g:830:12: EOF
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
            // InternalTexDsl.g:832:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalTexDsl.g:832:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalTexDsl.g:832:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalTexDsl.g:834:16: ( . )
            // InternalTexDsl.g:834:18: .
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
        // InternalTexDsl.g:1:8: ( RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_BS | RULE_SYMBOLS | RULE_ALPHA_NUMERIC | RULE_ID | RULE_SQBO | RULE_SQBC | RULE_BO | RULE_BC | RULE_CUBO | RULE_CUBC | RULE_KOMMA | RULE_EQ | RULE_PIPE | RULE_SPACE | RULE_END | RULE_WS | RULE_ANY_OTHER )
        int alt13=19;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalTexDsl.g:1:10: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 2 :
                // InternalTexDsl.g:1:26: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 3 :
                // InternalTexDsl.g:1:42: RULE_BS
                {
                mRULE_BS(); 

                }
                break;
            case 4 :
                // InternalTexDsl.g:1:50: RULE_SYMBOLS
                {
                mRULE_SYMBOLS(); 

                }
                break;
            case 5 :
                // InternalTexDsl.g:1:63: RULE_ALPHA_NUMERIC
                {
                mRULE_ALPHA_NUMERIC(); 

                }
                break;
            case 6 :
                // InternalTexDsl.g:1:82: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 7 :
                // InternalTexDsl.g:1:90: RULE_SQBO
                {
                mRULE_SQBO(); 

                }
                break;
            case 8 :
                // InternalTexDsl.g:1:100: RULE_SQBC
                {
                mRULE_SQBC(); 

                }
                break;
            case 9 :
                // InternalTexDsl.g:1:110: RULE_BO
                {
                mRULE_BO(); 

                }
                break;
            case 10 :
                // InternalTexDsl.g:1:118: RULE_BC
                {
                mRULE_BC(); 

                }
                break;
            case 11 :
                // InternalTexDsl.g:1:126: RULE_CUBO
                {
                mRULE_CUBO(); 

                }
                break;
            case 12 :
                // InternalTexDsl.g:1:136: RULE_CUBC
                {
                mRULE_CUBC(); 

                }
                break;
            case 13 :
                // InternalTexDsl.g:1:146: RULE_KOMMA
                {
                mRULE_KOMMA(); 

                }
                break;
            case 14 :
                // InternalTexDsl.g:1:157: RULE_EQ
                {
                mRULE_EQ(); 

                }
                break;
            case 15 :
                // InternalTexDsl.g:1:165: RULE_PIPE
                {
                mRULE_PIPE(); 

                }
                break;
            case 16 :
                // InternalTexDsl.g:1:175: RULE_SPACE
                {
                mRULE_SPACE(); 

                }
                break;
            case 17 :
                // InternalTexDsl.g:1:186: RULE_END
                {
                mRULE_END(); 

                }
                break;
            case 18 :
                // InternalTexDsl.g:1:195: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 19 :
                // InternalTexDsl.g:1:203: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA9_eotS =
        "\2\2\2\uffff";
    static final String DFA9_eofS =
        "\4\uffff";
    static final String DFA9_minS =
        "\2\60\2\uffff";
    static final String DFA9_maxS =
        "\1\71\1\u00fc\2\uffff";
    static final String DFA9_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA9_specialS =
        "\4\uffff}>";
    static final String[] DFA9_transitionS = {
            "\12\1",
            "\12\1\7\uffff\32\3\6\uffff\32\3\105\uffff\35\3\2\uffff\36\3",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "()* loopback of 792:34: ( ( RULE_NUMERIC )+ ( RULE_ALPHA )+ )*";
        }
    }
    static final String DFA13_eotS =
        "\1\20\1\22\2\uffff\1\27\1\32\11\uffff\1\45\6\uffff\1\27\2\uffff\1\32\1\uffff\1\32\13\uffff\1\32";
    static final String DFA13_eofS =
        "\50\uffff";
    static final String DFA13_minS =
        "\1\0\1\52\2\uffff\2\43\11\uffff\1\11\6\uffff\1\43\2\uffff\1\43\1\uffff\1\43\13\uffff\1\43";
    static final String DFA13_maxS =
        "\1\uffff\1\52\2\uffff\2\u00fc\11\uffff\1\40\6\uffff\1\u00fc\2\uffff\1\u00fc\1\uffff\1\u00fc\13\uffff\1\u00fc";
    static final String DFA13_acceptS =
        "\2\uffff\1\2\1\3\2\uffff\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\uffff\1\21\1\22\1\23\1\1\1\2\1\3\1\uffff\1\4\1\6\1\uffff\1\5\1\uffff\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\22\1\uffff";
    static final String DFA13_specialS =
        "\1\0\47\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\22\2\21\2\22\1\21\22\22\1\17\2\22\1\4\1\22\1\2\2\22\1\10\1\11\1\22\1\4\1\14\1\4\1\22\1\1\15\22\1\15\3\22\32\5\1\6\1\3\1\7\1\22\1\4\1\22\32\5\1\12\1\16\1\13\1\4\101\22\35\5\2\22\36\5\uff03\22",
            "\1\23",
            "",
            "",
            "\1\26\2\uffff\1\30\4\uffff\1\26\1\uffff\1\26\1\30\1\uffff\12\30\7\uffff\32\30\4\uffff\1\26\1\uffff\32\30\3\uffff\1\26\101\uffff\35\30\2\uffff\36\30",
            "\1\30\2\uffff\1\30\4\uffff\1\30\1\uffff\2\30\1\uffff\12\31\7\uffff\32\33\4\uffff\1\30\1\uffff\32\33\3\uffff\1\30\101\uffff\35\33\2\uffff\36\33",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\46\2\uffff\1\46\22\uffff\1\46",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\26\2\uffff\1\30\4\uffff\1\26\1\uffff\1\26\1\30\1\uffff\12\30\7\uffff\32\30\4\uffff\1\26\1\uffff\32\30\3\uffff\1\26\101\uffff\35\30\2\uffff\36\30",
            "",
            "",
            "\1\30\2\uffff\1\30\4\uffff\1\30\1\uffff\2\30\1\uffff\12\31\7\uffff\32\47\4\uffff\1\30\1\uffff\32\47\3\uffff\1\30\101\uffff\35\47\2\uffff\36\47",
            "",
            "\1\30\2\uffff\1\30\4\uffff\1\30\1\uffff\2\30\1\uffff\12\31\7\uffff\32\33\4\uffff\1\30\1\uffff\32\33\3\uffff\1\30\101\uffff\35\33\2\uffff\36\33",
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
            "\1\30\2\uffff\1\30\4\uffff\1\30\1\uffff\2\30\1\uffff\12\31\7\uffff\32\47\4\uffff\1\30\1\uffff\32\47\3\uffff\1\30\101\uffff\35\47\2\uffff\36\47"
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
            return "1:1: Tokens : ( RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_BS | RULE_SYMBOLS | RULE_ALPHA_NUMERIC | RULE_ID | RULE_SQBO | RULE_SQBC | RULE_BO | RULE_BC | RULE_CUBO | RULE_CUBC | RULE_KOMMA | RULE_EQ | RULE_PIPE | RULE_SPACE | RULE_END | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='/') ) {s = 1;}

                        else if ( (LA13_0=='%') ) {s = 2;}

                        else if ( (LA13_0=='\\') ) {s = 3;}

                        else if ( (LA13_0=='#'||LA13_0=='+'||LA13_0=='-'||LA13_0=='_'||LA13_0=='~') ) {s = 4;}

                        else if ( ((LA13_0>='A' && LA13_0<='Z')||(LA13_0>='a' && LA13_0<='z')||(LA13_0>='\u00C0' && LA13_0<='\u00DC')||(LA13_0>='\u00DF' && LA13_0<='\u00FC')) ) {s = 5;}

                        else if ( (LA13_0=='[') ) {s = 6;}

                        else if ( (LA13_0==']') ) {s = 7;}

                        else if ( (LA13_0=='(') ) {s = 8;}

                        else if ( (LA13_0==')') ) {s = 9;}

                        else if ( (LA13_0=='{') ) {s = 10;}

                        else if ( (LA13_0=='}') ) {s = 11;}

                        else if ( (LA13_0==',') ) {s = 12;}

                        else if ( (LA13_0=='=') ) {s = 13;}

                        else if ( (LA13_0=='|') ) {s = 14;}

                        else if ( (LA13_0==' ') ) {s = 15;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r') ) {s = 17;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||(LA13_0>='!' && LA13_0<='\"')||LA13_0=='$'||(LA13_0>='&' && LA13_0<='\'')||LA13_0=='*'||LA13_0=='.'||(LA13_0>='0' && LA13_0<='<')||(LA13_0>='>' && LA13_0<='@')||LA13_0=='^'||LA13_0=='`'||(LA13_0>='\u007F' && LA13_0<='\u00BF')||(LA13_0>='\u00DD' && LA13_0<='\u00DE')||(LA13_0>='\u00FD' && LA13_0<='\uFFFF')) ) {s = 18;}

                        else s = 16;

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