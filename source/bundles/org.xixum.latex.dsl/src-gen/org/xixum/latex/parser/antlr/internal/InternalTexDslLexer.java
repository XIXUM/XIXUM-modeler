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
    public static final int RULE_ALPHA=18;
    public static final int RULE_END=4;
    public static final int RULE_CUBO=11;
    public static final int RULE_STRING=27;
    public static final int RULE_AND=21;
    public static final int RULE_SL_COMMENT=15;
    public static final int RULE_EQ=13;
    public static final int RULE_DOT=20;
    public static final int EOF=-1;
    public static final int RULE_NUMERIC=19;
    public static final int RULE_ID=6;
    public static final int RULE_WS=28;
    public static final int RULE_SQBO=8;
    public static final int RULE_ALPHA_NUMERIC=5;
    public static final int RULE_BO=24;
    public static final int RULE_SQBC=10;
    public static final int RULE_ANY_OTHER=29;
    public static final int RULE_ALPHAS=23;
    public static final int RULE_BS=7;
    public static final int RULE_KOMMA=9;
    public static final int RULE_INT=26;
    public static final int RULE_CUBC=12;
    public static final int RULE_ML_COMMENT=14;
    public static final int RULE_SYMBOL=16;
    public static final int RULE_ALPHAC=22;
    public static final int RULE_SYMBOLS=17;
    public static final int RULE_BC=25;

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
            // InternalTexDsl.g:518:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalTexDsl.g:518:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalTexDsl.g:518:24: ( options {greedy=false; } : . )*
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
            	    // InternalTexDsl.g:518:52: .
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
            // InternalTexDsl.g:520:17: ( '%' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalTexDsl.g:520:19: '%' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('%'); 
            // InternalTexDsl.g:520:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='\t')||(LA2_0>='\u000B' && LA2_0<='\f')||(LA2_0>='\u000E' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTexDsl.g:520:23: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalTexDsl.g:520:39: ( ( '\\r' )? '\\n' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\n'||LA4_0=='\r') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalTexDsl.g:520:40: ( '\\r' )? '\\n'
                    {
                    // InternalTexDsl.g:520:40: ( '\\r' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='\r') ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalTexDsl.g:520:40: '\\r'
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
            // InternalTexDsl.g:522:9: ( '\\\\' )
            // InternalTexDsl.g:522:11: '\\\\'
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
            // InternalTexDsl.g:524:14: ( ( RULE_SYMBOL )+ )
            // InternalTexDsl.g:524:16: ( RULE_SYMBOL )+
            {
            // InternalTexDsl.g:524:16: ( RULE_SYMBOL )+
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
            	    // InternalTexDsl.g:524:16: RULE_SYMBOL
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
            // InternalTexDsl.g:526:20: ( ( RULE_ALPHA )+ ( ( RULE_NUMERIC )+ ( RULE_ALPHA )+ )* ( RULE_NUMERIC )* )
            // InternalTexDsl.g:526:22: ( RULE_ALPHA )+ ( ( RULE_NUMERIC )+ ( RULE_ALPHA )+ )* ( RULE_NUMERIC )*
            {
            // InternalTexDsl.g:526:22: ( RULE_ALPHA )+
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
            	    // InternalTexDsl.g:526:22: RULE_ALPHA
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

            // InternalTexDsl.g:526:34: ( ( RULE_NUMERIC )+ ( RULE_ALPHA )+ )*
            loop9:
            do {
                int alt9=2;
                alt9 = dfa9.predict(input);
                switch (alt9) {
            	case 1 :
            	    // InternalTexDsl.g:526:35: ( RULE_NUMERIC )+ ( RULE_ALPHA )+
            	    {
            	    // InternalTexDsl.g:526:35: ( RULE_NUMERIC )+
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
            	    	    // InternalTexDsl.g:526:35: RULE_NUMERIC
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

            	    // InternalTexDsl.g:526:49: ( RULE_ALPHA )+
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
            	    	    // InternalTexDsl.g:526:49: RULE_ALPHA
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

            // InternalTexDsl.g:526:63: ( RULE_NUMERIC )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalTexDsl.g:526:63: RULE_NUMERIC
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
            // InternalTexDsl.g:528:9: ( ( RULE_ALPHA | RULE_SYMBOL ) ( RULE_ALPHA | RULE_SYMBOL | RULE_NUMERIC | RULE_DOT | RULE_AND )* )
            // InternalTexDsl.g:528:11: ( RULE_ALPHA | RULE_SYMBOL ) ( RULE_ALPHA | RULE_SYMBOL | RULE_NUMERIC | RULE_DOT | RULE_AND )*
            {
            if ( input.LA(1)=='#'||input.LA(1)=='+'||input.LA(1)=='-'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='~'||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00DC')||(input.LA(1)>='\u00DF' && input.LA(1)<='\u00FC') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalTexDsl.g:528:36: ( RULE_ALPHA | RULE_SYMBOL | RULE_NUMERIC | RULE_DOT | RULE_AND )*
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
            // InternalTexDsl.g:530:21: ( ( RULE_ALPHAC | RULE_ALPHAS ) )
            // InternalTexDsl.g:530:23: ( RULE_ALPHAC | RULE_ALPHAS )
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
            // InternalTexDsl.g:532:22: ( ( 'A' .. 'Z' | '\\u00C4' .. '\\u00DC' | '\\u00C0' .. '\\u00D9' | '\\u00C1' .. '\\u00DA' ) )
            // InternalTexDsl.g:532:24: ( 'A' .. 'Z' | '\\u00C4' .. '\\u00DC' | '\\u00C0' .. '\\u00D9' | '\\u00C1' .. '\\u00DA' )
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
            // InternalTexDsl.g:534:22: ( ( 'a' .. 'z' | '\\u00E4' .. '\\u00FC' | '\\u00DF' | '\\u00E0' .. '\\u00F9' | '\\u00E1' .. '\\u00FA' ) )
            // InternalTexDsl.g:534:24: ( 'a' .. 'z' | '\\u00E4' .. '\\u00FC' | '\\u00DF' | '\\u00E0' .. '\\u00F9' | '\\u00E1' .. '\\u00FA' )
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
            // InternalTexDsl.g:536:23: ( '0' .. '9' )
            // InternalTexDsl.g:536:25: '0' .. '9'
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
            // InternalTexDsl.g:538:11: ( '[' )
            // InternalTexDsl.g:538:13: '['
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
            // InternalTexDsl.g:540:11: ( ']' )
            // InternalTexDsl.g:540:13: ']'
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
            // InternalTexDsl.g:542:9: ( '(' )
            // InternalTexDsl.g:542:11: '('
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
            // InternalTexDsl.g:544:9: ( ')' )
            // InternalTexDsl.g:544:11: ')'
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
            // InternalTexDsl.g:546:11: ( '{' )
            // InternalTexDsl.g:546:13: '{'
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
            // InternalTexDsl.g:548:11: ( '}' )
            // InternalTexDsl.g:548:13: '}'
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
            // InternalTexDsl.g:550:12: ( ',' )
            // InternalTexDsl.g:550:14: ','
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
            // InternalTexDsl.g:552:9: ( '=' )
            // InternalTexDsl.g:552:11: '='
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
            // InternalTexDsl.g:554:19: ( '.' )
            // InternalTexDsl.g:554:21: '.'
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
            // InternalTexDsl.g:556:19: ( '&' )
            // InternalTexDsl.g:556:21: '&'
            {
            match('&'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_AND"

    // $ANTLR start "RULE_SYMBOL"
    public final void mRULE_SYMBOL() throws RecognitionException {
        try {
            // InternalTexDsl.g:558:22: ( ( '-' | '_' | '+' | '#' | '~' ) )
            // InternalTexDsl.g:558:24: ( '-' | '_' | '+' | '#' | '~' )
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
            // InternalTexDsl.g:560:10: ( EOF )
            // InternalTexDsl.g:560:12: EOF
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

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTexDsl.g:562:10: ( ( '0' .. '9' )+ )
            // InternalTexDsl.g:562:12: ( '0' .. '9' )+
            {
            // InternalTexDsl.g:562:12: ( '0' .. '9' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalTexDsl.g:562:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTexDsl.g:564:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalTexDsl.g:564:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalTexDsl.g:564:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\"') ) {
                alt15=1;
            }
            else if ( (LA15_0=='\'') ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalTexDsl.g:564:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalTexDsl.g:564:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop13:
                    do {
                        int alt13=3;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0=='\\') ) {
                            alt13=1;
                        }
                        else if ( ((LA13_0>='\u0000' && LA13_0<='!')||(LA13_0>='#' && LA13_0<='[')||(LA13_0>=']' && LA13_0<='\uFFFF')) ) {
                            alt13=2;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalTexDsl.g:564:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalTexDsl.g:564:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop13;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalTexDsl.g:564:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalTexDsl.g:564:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop14:
                    do {
                        int alt14=3;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0=='\\') ) {
                            alt14=1;
                        }
                        else if ( ((LA14_0>='\u0000' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='[')||(LA14_0>=']' && LA14_0<='\uFFFF')) ) {
                            alt14=2;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalTexDsl.g:564:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalTexDsl.g:564:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop14;
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

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTexDsl.g:566:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalTexDsl.g:566:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalTexDsl.g:566:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {
                    alt16=1;
                }


                switch (alt16) {
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
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
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
            // InternalTexDsl.g:568:16: ( . )
            // InternalTexDsl.g:568:18: .
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
        // InternalTexDsl.g:1:8: ( RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_BS | RULE_SYMBOLS | RULE_ALPHA_NUMERIC | RULE_ID | RULE_SQBO | RULE_SQBC | RULE_BO | RULE_BC | RULE_CUBO | RULE_CUBC | RULE_KOMMA | RULE_EQ | RULE_END | RULE_INT | RULE_STRING | RULE_WS | RULE_ANY_OTHER )
        int alt17=19;
        alt17 = dfa17.predict(input);
        switch (alt17) {
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
                // InternalTexDsl.g:1:165: RULE_END
                {
                mRULE_END(); 

                }
                break;
            case 16 :
                // InternalTexDsl.g:1:174: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 17 :
                // InternalTexDsl.g:1:183: RULE_STRING
                {
                mRULE_STRING(); 

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
    protected DFA17 dfa17 = new DFA17(this);
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
            return "()* loopback of 526:34: ( ( RULE_NUMERIC )+ ( RULE_ALPHA )+ )*";
        }
    }
    static final String DFA17_eotS =
        "\1\16\1\23\2\uffff\1\27\1\32\12\uffff\2\23\6\uffff\1\27\2\uffff\2\32\13\uffff\1\32";
    static final String DFA17_eofS =
        "\51\uffff";
    static final String DFA17_minS =
        "\1\0\1\52\2\uffff\2\43\12\uffff\2\0\6\uffff\1\43\2\uffff\2\43\13\uffff\1\43";
    static final String DFA17_maxS =
        "\1\uffff\1\52\2\uffff\2\u00fc\12\uffff\2\uffff\6\uffff\1\u00fc\2\uffff\2\u00fc\13\uffff\1\u00fc";
    static final String DFA17_acceptS =
        "\2\uffff\1\2\1\3\2\uffff\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\2\uffff\1\22\1\23\1\1\1\2\1\3\1\4\1\uffff\1\6\1\5\2\uffff\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\20\1\21\1\22\1\uffff";
    static final String DFA17_specialS =
        "\1\1\17\uffff\1\0\1\2\27\uffff}>";
    static final String[] DFA17_transitionS = {
            "\11\23\2\22\2\23\1\22\22\23\1\22\1\23\1\20\1\4\1\23\1\2\1\23\1\21\1\10\1\11\1\23\1\4\1\14\1\4\1\23\1\1\12\17\3\23\1\15\3\23\32\5\1\6\1\3\1\7\1\23\1\4\1\23\32\5\1\12\1\23\1\13\1\4\101\23\35\5\2\23\36\5\uff03\23",
            "\1\24",
            "",
            "",
            "\1\30\2\uffff\1\31\4\uffff\1\30\1\uffff\1\30\1\31\1\uffff\12\31\7\uffff\32\31\4\uffff\1\30\1\uffff\32\31\3\uffff\1\30\101\uffff\35\31\2\uffff\36\31",
            "\1\31\2\uffff\1\31\4\uffff\1\31\1\uffff\2\31\1\uffff\12\33\7\uffff\32\34\4\uffff\1\31\1\uffff\32\34\3\uffff\1\31\101\uffff\35\34\2\uffff\36\34",
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
            "\0\46",
            "\0\46",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\30\2\uffff\1\31\4\uffff\1\30\1\uffff\1\30\1\31\1\uffff\12\31\7\uffff\32\31\4\uffff\1\30\1\uffff\32\31\3\uffff\1\30\101\uffff\35\31\2\uffff\36\31",
            "",
            "",
            "\1\31\2\uffff\1\31\4\uffff\1\31\1\uffff\2\31\1\uffff\12\33\7\uffff\32\50\4\uffff\1\31\1\uffff\32\50\3\uffff\1\31\101\uffff\35\50\2\uffff\36\50",
            "\1\31\2\uffff\1\31\4\uffff\1\31\1\uffff\2\31\1\uffff\12\33\7\uffff\32\34\4\uffff\1\31\1\uffff\32\34\3\uffff\1\31\101\uffff\35\34\2\uffff\36\34",
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
            "\1\31\2\uffff\1\31\4\uffff\1\31\1\uffff\2\31\1\uffff\12\33\7\uffff\32\50\4\uffff\1\31\1\uffff\32\50\3\uffff\1\31\101\uffff\35\50\2\uffff\36\50"
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_BS | RULE_SYMBOLS | RULE_ALPHA_NUMERIC | RULE_ID | RULE_SQBO | RULE_SQBC | RULE_BO | RULE_BC | RULE_CUBO | RULE_CUBC | RULE_KOMMA | RULE_EQ | RULE_END | RULE_INT | RULE_STRING | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_16 = input.LA(1);

                        s = -1;
                        if ( ((LA17_16>='\u0000' && LA17_16<='\uFFFF')) ) {s = 38;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_0 = input.LA(1);

                        s = -1;
                        if ( (LA17_0=='/') ) {s = 1;}

                        else if ( (LA17_0=='%') ) {s = 2;}

                        else if ( (LA17_0=='\\') ) {s = 3;}

                        else if ( (LA17_0=='#'||LA17_0=='+'||LA17_0=='-'||LA17_0=='_'||LA17_0=='~') ) {s = 4;}

                        else if ( ((LA17_0>='A' && LA17_0<='Z')||(LA17_0>='a' && LA17_0<='z')||(LA17_0>='\u00C0' && LA17_0<='\u00DC')||(LA17_0>='\u00DF' && LA17_0<='\u00FC')) ) {s = 5;}

                        else if ( (LA17_0=='[') ) {s = 6;}

                        else if ( (LA17_0==']') ) {s = 7;}

                        else if ( (LA17_0=='(') ) {s = 8;}

                        else if ( (LA17_0==')') ) {s = 9;}

                        else if ( (LA17_0=='{') ) {s = 10;}

                        else if ( (LA17_0=='}') ) {s = 11;}

                        else if ( (LA17_0==',') ) {s = 12;}

                        else if ( (LA17_0=='=') ) {s = 13;}

                        else if ( ((LA17_0>='0' && LA17_0<='9')) ) {s = 15;}

                        else if ( (LA17_0=='\"') ) {s = 16;}

                        else if ( (LA17_0=='\'') ) {s = 17;}

                        else if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {s = 18;}

                        else if ( ((LA17_0>='\u0000' && LA17_0<='\b')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\u001F')||LA17_0=='!'||LA17_0=='$'||LA17_0=='&'||LA17_0=='*'||LA17_0=='.'||(LA17_0>=':' && LA17_0<='<')||(LA17_0>='>' && LA17_0<='@')||LA17_0=='^'||LA17_0=='`'||LA17_0=='|'||(LA17_0>='\u007F' && LA17_0<='\u00BF')||(LA17_0>='\u00DD' && LA17_0<='\u00DE')||(LA17_0>='\u00FD' && LA17_0<='\uFFFF')) ) {s = 19;}

                        else s = 14;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_17 = input.LA(1);

                        s = -1;
                        if ( ((LA17_17>='\u0000' && LA17_17<='\uFFFF')) ) {s = 38;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}