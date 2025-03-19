package org.xixum.latex.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xixum.latex.services.TexDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
interface InternalTexDslParserSignatures {
     void entryRuleModel() throws RecognitionException;
     void ruleModel() throws RecognitionException;
     void entryRuleElement() throws RecognitionException;
     void ruleElement() throws RecognitionException;
     void entryRuleCommand() throws RecognitionException;
     void ruleCommand() throws RecognitionException;
     void entryRuleOptionalArgument() throws RecognitionException;
     void ruleOptionalArgument() throws RecognitionException;
     void entryRuleMandatoryArgument() throws RecognitionException;
     void ruleMandatoryArgument() throws RecognitionException;
     void entryRuleCodeblock() throws RecognitionException;
     void ruleCodeblock() throws RecognitionException;
     void entryRuleCodeblockContent() throws RecognitionException;
     void ruleCodeblockContent() throws RecognitionException;
     void entryRuleCodeblockElement() throws RecognitionException;
     void ruleCodeblockElement() throws RecognitionException;
     void entryRuleAnyToken() throws RecognitionException;
     void ruleAnyToken() throws RecognitionException;
     void entryRuleArgumentContent() throws RecognitionException;
     void ruleArgumentContent() throws RecognitionException;
     void entryRuleTextContainer() throws RecognitionException;
     void ruleTextContainer() throws RecognitionException;
     void entryRuleTextContent() throws RecognitionException;
     void ruleTextContent() throws RecognitionException;
     void entryRuleIdentifiers() throws RecognitionException;
     void ruleIdentifiers() throws RecognitionException;
     void entryRuleNumbers() throws RecognitionException;
     void ruleNumbers() throws RecognitionException;
     void entryRuleOperators() throws RecognitionException;
     void ruleOperators() throws RecognitionException;
     void entryRuleMathExpression() throws RecognitionException;
     void ruleMathExpression() throws RecognitionException;
     void entryRuleInlineMath() throws RecognitionException;
     void ruleInlineMath() throws RecognitionException;
     void entryRuleDisplayMath() throws RecognitionException;
     void ruleDisplayMath() throws RecognitionException;
     void entryRuleMathContent() throws RecognitionException;
     void ruleMathContent() throws RecognitionException;
     void rule__Element__Alternatives() throws RecognitionException;
     void rule__CodeblockElement__Alternatives() throws RecognitionException;
     void rule__AnyToken__Alternatives() throws RecognitionException;
     void rule__ArgumentContent__Alternatives() throws RecognitionException;
     void rule__TextContent__Alternatives() throws RecognitionException;
     void rule__MathExpression__Alternatives() throws RecognitionException;
     void rule__MathContent__Alternatives() throws RecognitionException;
     void rule__Command__Group__0() throws RecognitionException;
     void rule__Command__Group__0__Impl() throws RecognitionException;
     void rule__Command__Group__1() throws RecognitionException;
     void rule__Command__Group__1__Impl() throws RecognitionException;
     void rule__Command__Group__2() throws RecognitionException;
     void rule__Command__Group__2__Impl() throws RecognitionException;
     void rule__Command__Group__3() throws RecognitionException;
     void rule__Command__Group__3__Impl() throws RecognitionException;
     void rule__OptionalArgument__Group__0() throws RecognitionException;
     void rule__OptionalArgument__Group__0__Impl() throws RecognitionException;
     void rule__OptionalArgument__Group__1() throws RecognitionException;
     void rule__OptionalArgument__Group__1__Impl() throws RecognitionException;
     void rule__OptionalArgument__Group__2() throws RecognitionException;
     void rule__OptionalArgument__Group__2__Impl() throws RecognitionException;
     void rule__OptionalArgument__Group__3() throws RecognitionException;
     void rule__OptionalArgument__Group__3__Impl() throws RecognitionException;
     void rule__MandatoryArgument__Group__0() throws RecognitionException;
     void rule__MandatoryArgument__Group__0__Impl() throws RecognitionException;
     void rule__MandatoryArgument__Group__1() throws RecognitionException;
     void rule__MandatoryArgument__Group__1__Impl() throws RecognitionException;
     void rule__MandatoryArgument__Group__2() throws RecognitionException;
     void rule__MandatoryArgument__Group__2__Impl() throws RecognitionException;
     void rule__MandatoryArgument__Group__3() throws RecognitionException;
     void rule__MandatoryArgument__Group__3__Impl() throws RecognitionException;
     void rule__Codeblock__Group__0() throws RecognitionException;
     void rule__Codeblock__Group__0__Impl() throws RecognitionException;
     void rule__Codeblock__Group__1() throws RecognitionException;
     void rule__Codeblock__Group__1__Impl() throws RecognitionException;
     void rule__Codeblock__Group__2() throws RecognitionException;
     void rule__Codeblock__Group__2__Impl() throws RecognitionException;
     void rule__Codeblock__Group__3() throws RecognitionException;
     void rule__Codeblock__Group__3__Impl() throws RecognitionException;
     void rule__Codeblock__Group__4() throws RecognitionException;
     void rule__Codeblock__Group__4__Impl() throws RecognitionException;
     void rule__CodeblockContent__Group__0() throws RecognitionException;
     void rule__CodeblockContent__Group__0__Impl() throws RecognitionException;
     void rule__CodeblockContent__Group__1() throws RecognitionException;
     void rule__CodeblockContent__Group__1__Impl() throws RecognitionException;
     void rule__CodeblockElement__Group_0__0() throws RecognitionException;
     void rule__CodeblockElement__Group_0__0__Impl() throws RecognitionException;
     void rule__CodeblockElement__Group_0__1() throws RecognitionException;
     void rule__CodeblockElement__Group_0__1__Impl() throws RecognitionException;
     void rule__InlineMath__Group__0() throws RecognitionException;
     void rule__InlineMath__Group__0__Impl() throws RecognitionException;
     void rule__InlineMath__Group__1() throws RecognitionException;
     void rule__InlineMath__Group__1__Impl() throws RecognitionException;
     void rule__InlineMath__Group__2() throws RecognitionException;
     void rule__InlineMath__Group__2__Impl() throws RecognitionException;
     void rule__InlineMath__Group__3() throws RecognitionException;
     void rule__InlineMath__Group__3__Impl() throws RecognitionException;
     void rule__DisplayMath__Group__0() throws RecognitionException;
     void rule__DisplayMath__Group__0__Impl() throws RecognitionException;
     void rule__DisplayMath__Group__1() throws RecognitionException;
     void rule__DisplayMath__Group__1__Impl() throws RecognitionException;
     void rule__DisplayMath__Group__2() throws RecognitionException;
     void rule__DisplayMath__Group__2__Impl() throws RecognitionException;
     void rule__DisplayMath__Group__3() throws RecognitionException;
     void rule__DisplayMath__Group__3__Impl() throws RecognitionException;
     void rule__Model__ElementsAssignment() throws RecognitionException;
     void rule__Command__CommandAssignment_1() throws RecognitionException;
     void rule__Command__OptionalArgsAssignment_2() throws RecognitionException;
     void rule__Command__MandatoryArgsAssignment_3() throws RecognitionException;
     void rule__OptionalArgument__ContentAssignment_2() throws RecognitionException;
     void rule__MandatoryArgument__ContentAssignment_2() throws RecognitionException;
     void rule__Codeblock__ContentAssignment_2() throws RecognitionException;
     void rule__CodeblockContent__ElementsAssignment_1() throws RecognitionException;
     void rule__TextContainer__TextAssignment() throws RecognitionException;
     void rule__Identifiers__IdAssignment() throws RecognitionException;
     void rule__Numbers__NumAssignment() throws RecognitionException;
     void rule__Operators__OpAssignment() throws RecognitionException;
     void rule__InlineMath__ContentAssignment_2() throws RecognitionException;
     void rule__DisplayMath__ContentAssignment_2() throws RecognitionException;
     void synpred2_InternalTexDsl_fragment() throws RecognitionException;   
     void synpred3_InternalTexDsl_fragment() throws RecognitionException;   
     void synpred7_InternalTexDsl_fragment() throws RecognitionException;   
     void synpred16_InternalTexDsl_fragment() throws RecognitionException;   
     void synpred26_InternalTexDsl_fragment() throws RecognitionException;   
     void synpred27_InternalTexDsl_fragment() throws RecognitionException;   
     void synpred28_InternalTexDsl_fragment() throws RecognitionException;   
     void synpred29_InternalTexDsl_fragment() throws RecognitionException;   
}

@SuppressWarnings("all")
abstract class InternalTexDslParser1 extends AbstractInternalContentAssistParser implements InternalTexDslParserSignatures {

        InternalTexDslParser1(TokenStream input) {
            this(input, new RecognizerSharedState());
        }

        InternalTexDslParser1(TokenStream input, RecognizerSharedState state) {
            super(input, state);
        }

    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_TEXT", "RULE_SYMBOL", "RULE_NUMBER", "RULE_SQBO", "RULE_SQBC", "RULE_CUBO", "RULE_CUBC", "RULE_BS", "RULE_SL_COMMENT", "RULE_INT", "RULE_WS", "'begin{codeblock}'", "'end{codeblock}'", "'$'", "'$$'"
    };
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


    public String[] getTokenNames() { return InternalTexDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTexDsl.g"; }


    	protected TexDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(TexDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}




    // Delegated rules

    public final boolean synpred29_InternalTexDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalTexDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalTexDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalTexDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalTexDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalTexDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_InternalTexDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalTexDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalTexDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalTexDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalTexDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalTexDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalTexDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalTexDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_InternalTexDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalTexDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA12 dfa12 = new DFA12(this);
    protected DFA13 dfa13 = new DFA13(this);
    static final String dfa_1s = "\16\uffff";
    static final String dfa_2s = "\1\1\15\uffff";
    static final String dfa_3s = "\1\4\7\uffff\1\0\5\uffff";
    static final String dfa_4s = "\1\23\7\uffff\1\0\5\uffff";
    static final String dfa_5s = "\1\uffff\1\2\13\uffff\1\1";
    static final String dfa_6s = "\10\uffff\1\0\5\uffff}>";
    static final String[] dfa_7s = {
            "\4\1\1\10\4\1\5\uffff\2\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 865:2: ( rule__Command__OptionalArgsAssignment_2 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_8 = input.LA(1);

                         
                        int index12_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalTexDsl()) ) {s = 13;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index12_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String[] dfa_8s = {
            "\6\1\1\10\2\1\5\uffff\2\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            ""
    };
    static final short[][] dfa_8 = unpackEncodedStringArray(dfa_8s);

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_8;
        }
        public String getDescription() {
            return "()* loopback of 891:2: ( rule__Command__MandatoryArgsAssignment_3 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_8 = input.LA(1);

                         
                        int index13_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalTexDsl()) ) {s = 13;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    
    protected static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000000C15F2L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000022L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000042L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000005F0L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000102L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000005F2L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000C17F0L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000000C1DF0L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000001FF0L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000001FF2L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000000000415F0L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000000015F2L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000000815F0L});
    }


}

@SuppressWarnings("all")
abstract class InternalTexDslParser2 extends InternalTexDslParser1 {

        InternalTexDslParser2(TokenStream input) {
            this(input, new RecognizerSharedState());
        }

        InternalTexDslParser2(TokenStream input, RecognizerSharedState state) {
            super(input, state);
        }

    // $ANTLR start "entryRuleModel"
    // InternalTexDsl.g:54:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalTexDsl.g:55:1: ( ruleModel EOF )
            // InternalTexDsl.g:56:1: ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalTexDsl.g:63:1: ruleModel : ( ( rule__Model__ElementsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:67:2: ( ( ( rule__Model__ElementsAssignment )* ) )
            // InternalTexDsl.g:68:2: ( ( rule__Model__ElementsAssignment )* )
            {
            // InternalTexDsl.g:68:2: ( ( rule__Model__ElementsAssignment )* )
            // InternalTexDsl.g:69:3: ( rule__Model__ElementsAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getElementsAssignment()); 
            }
            // InternalTexDsl.g:70:3: ( rule__Model__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_SQBO)||LA1_0==RULE_CUBO||LA1_0==RULE_BS||(LA1_0>=18 && LA1_0<=19)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTexDsl.g:70:4: rule__Model__ElementsAssignment
            	    {
            	    pushFollow(FollowSets000.FOLLOW_3);
            	    rule__Model__ElementsAssignment();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getElementsAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleElement"
    // InternalTexDsl.g:79:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalTexDsl.g:80:1: ( ruleElement EOF )
            // InternalTexDsl.g:81:1: ruleElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalTexDsl.g:88:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:92:2: ( ( ( rule__Element__Alternatives ) ) )
            // InternalTexDsl.g:93:2: ( ( rule__Element__Alternatives ) )
            {
            // InternalTexDsl.g:93:2: ( ( rule__Element__Alternatives ) )
            // InternalTexDsl.g:94:3: ( rule__Element__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementAccess().getAlternatives()); 
            }
            // InternalTexDsl.g:95:3: ( rule__Element__Alternatives )
            // InternalTexDsl.g:95:4: rule__Element__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Element__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleCommand"
    // InternalTexDsl.g:104:1: entryRuleCommand : ruleCommand EOF ;
    public final void entryRuleCommand() throws RecognitionException {
        try {
            // InternalTexDsl.g:105:1: ( ruleCommand EOF )
            // InternalTexDsl.g:106:1: ruleCommand EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleCommand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalTexDsl.g:113:1: ruleCommand : ( ( rule__Command__Group__0 ) ) ;
    public final void ruleCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:117:2: ( ( ( rule__Command__Group__0 ) ) )
            // InternalTexDsl.g:118:2: ( ( rule__Command__Group__0 ) )
            {
            // InternalTexDsl.g:118:2: ( ( rule__Command__Group__0 ) )
            // InternalTexDsl.g:119:3: ( rule__Command__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getGroup()); 
            }
            // InternalTexDsl.g:120:3: ( rule__Command__Group__0 )
            // InternalTexDsl.g:120:4: rule__Command__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Command__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleOptionalArgument"
    // InternalTexDsl.g:129:1: entryRuleOptionalArgument : ruleOptionalArgument EOF ;
    public final void entryRuleOptionalArgument() throws RecognitionException {
        try {
            // InternalTexDsl.g:130:1: ( ruleOptionalArgument EOF )
            // InternalTexDsl.g:131:1: ruleOptionalArgument EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionalArgumentRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleOptionalArgument();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOptionalArgumentRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOptionalArgument"


    // $ANTLR start "ruleOptionalArgument"
    // InternalTexDsl.g:138:1: ruleOptionalArgument : ( ( rule__OptionalArgument__Group__0 ) ) ;
    public final void ruleOptionalArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:142:2: ( ( ( rule__OptionalArgument__Group__0 ) ) )
            // InternalTexDsl.g:143:2: ( ( rule__OptionalArgument__Group__0 ) )
            {
            // InternalTexDsl.g:143:2: ( ( rule__OptionalArgument__Group__0 ) )
            // InternalTexDsl.g:144:3: ( rule__OptionalArgument__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionalArgumentAccess().getGroup()); 
            }
            // InternalTexDsl.g:145:3: ( rule__OptionalArgument__Group__0 )
            // InternalTexDsl.g:145:4: rule__OptionalArgument__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OptionalArgument__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOptionalArgumentAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOptionalArgument"


    // $ANTLR start "entryRuleMandatoryArgument"
    // InternalTexDsl.g:154:1: entryRuleMandatoryArgument : ruleMandatoryArgument EOF ;
    public final void entryRuleMandatoryArgument() throws RecognitionException {
        try {
            // InternalTexDsl.g:155:1: ( ruleMandatoryArgument EOF )
            // InternalTexDsl.g:156:1: ruleMandatoryArgument EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMandatoryArgumentRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleMandatoryArgument();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMandatoryArgumentRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMandatoryArgument"


    // $ANTLR start "ruleMandatoryArgument"
    // InternalTexDsl.g:163:1: ruleMandatoryArgument : ( ( rule__MandatoryArgument__Group__0 ) ) ;
    public final void ruleMandatoryArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:167:2: ( ( ( rule__MandatoryArgument__Group__0 ) ) )
            // InternalTexDsl.g:168:2: ( ( rule__MandatoryArgument__Group__0 ) )
            {
            // InternalTexDsl.g:168:2: ( ( rule__MandatoryArgument__Group__0 ) )
            // InternalTexDsl.g:169:3: ( rule__MandatoryArgument__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMandatoryArgumentAccess().getGroup()); 
            }
            // InternalTexDsl.g:170:3: ( rule__MandatoryArgument__Group__0 )
            // InternalTexDsl.g:170:4: rule__MandatoryArgument__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MandatoryArgument__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMandatoryArgumentAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMandatoryArgument"


    // $ANTLR start "entryRuleCodeblock"
    // InternalTexDsl.g:179:1: entryRuleCodeblock : ruleCodeblock EOF ;
    public final void entryRuleCodeblock() throws RecognitionException {
        try {
            // InternalTexDsl.g:180:1: ( ruleCodeblock EOF )
            // InternalTexDsl.g:181:1: ruleCodeblock EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCodeblockRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleCodeblock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCodeblockRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCodeblock"


    // $ANTLR start "ruleCodeblock"
    // InternalTexDsl.g:188:1: ruleCodeblock : ( ( rule__Codeblock__Group__0 ) ) ;
    public final void ruleCodeblock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:192:2: ( ( ( rule__Codeblock__Group__0 ) ) )
            // InternalTexDsl.g:193:2: ( ( rule__Codeblock__Group__0 ) )
            {
            // InternalTexDsl.g:193:2: ( ( rule__Codeblock__Group__0 ) )
            // InternalTexDsl.g:194:3: ( rule__Codeblock__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCodeblockAccess().getGroup()); 
            }
            // InternalTexDsl.g:195:3: ( rule__Codeblock__Group__0 )
            // InternalTexDsl.g:195:4: rule__Codeblock__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Codeblock__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCodeblockAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCodeblock"


    // $ANTLR start "entryRuleCodeblockContent"
    // InternalTexDsl.g:204:1: entryRuleCodeblockContent : ruleCodeblockContent EOF ;
    public final void entryRuleCodeblockContent() throws RecognitionException {
        try {
            // InternalTexDsl.g:205:1: ( ruleCodeblockContent EOF )
            // InternalTexDsl.g:206:1: ruleCodeblockContent EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCodeblockContentRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleCodeblockContent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCodeblockContentRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCodeblockContent"


    // $ANTLR start "ruleCodeblockContent"
    // InternalTexDsl.g:213:1: ruleCodeblockContent : ( ( rule__CodeblockContent__Group__0 ) ) ;
    public final void ruleCodeblockContent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:217:2: ( ( ( rule__CodeblockContent__Group__0 ) ) )
            // InternalTexDsl.g:218:2: ( ( rule__CodeblockContent__Group__0 ) )
            {
            // InternalTexDsl.g:218:2: ( ( rule__CodeblockContent__Group__0 ) )
            // InternalTexDsl.g:219:3: ( rule__CodeblockContent__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCodeblockContentAccess().getGroup()); 
            }
            // InternalTexDsl.g:220:3: ( rule__CodeblockContent__Group__0 )
            // InternalTexDsl.g:220:4: rule__CodeblockContent__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CodeblockContent__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCodeblockContentAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCodeblockContent"


    // $ANTLR start "entryRuleCodeblockElement"
    // InternalTexDsl.g:229:1: entryRuleCodeblockElement : ruleCodeblockElement EOF ;
    public final void entryRuleCodeblockElement() throws RecognitionException {
        try {
            // InternalTexDsl.g:230:1: ( ruleCodeblockElement EOF )
            // InternalTexDsl.g:231:1: ruleCodeblockElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCodeblockElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleCodeblockElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCodeblockElementRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCodeblockElement"


    // $ANTLR start "ruleCodeblockElement"
    // InternalTexDsl.g:238:1: ruleCodeblockElement : ( ( rule__CodeblockElement__Alternatives ) ) ;
    public final void ruleCodeblockElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:242:2: ( ( ( rule__CodeblockElement__Alternatives ) ) )
            // InternalTexDsl.g:243:2: ( ( rule__CodeblockElement__Alternatives ) )
            {
            // InternalTexDsl.g:243:2: ( ( rule__CodeblockElement__Alternatives ) )
            // InternalTexDsl.g:244:3: ( rule__CodeblockElement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCodeblockElementAccess().getAlternatives()); 
            }
            // InternalTexDsl.g:245:3: ( rule__CodeblockElement__Alternatives )
            // InternalTexDsl.g:245:4: rule__CodeblockElement__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CodeblockElement__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCodeblockElementAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCodeblockElement"


    // $ANTLR start "entryRuleAnyToken"
    // InternalTexDsl.g:254:1: entryRuleAnyToken : ruleAnyToken EOF ;
    public final void entryRuleAnyToken() throws RecognitionException {
        try {
            // InternalTexDsl.g:255:1: ( ruleAnyToken EOF )
            // InternalTexDsl.g:256:1: ruleAnyToken EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnyTokenRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAnyToken();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnyTokenRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAnyToken"


    // $ANTLR start "ruleAnyToken"
    // InternalTexDsl.g:263:1: ruleAnyToken : ( ( rule__AnyToken__Alternatives ) ) ;
    public final void ruleAnyToken() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:267:2: ( ( ( rule__AnyToken__Alternatives ) ) )
            // InternalTexDsl.g:268:2: ( ( rule__AnyToken__Alternatives ) )
            {
            // InternalTexDsl.g:268:2: ( ( rule__AnyToken__Alternatives ) )
            // InternalTexDsl.g:269:3: ( rule__AnyToken__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnyTokenAccess().getAlternatives()); 
            }
            // InternalTexDsl.g:270:3: ( rule__AnyToken__Alternatives )
            // InternalTexDsl.g:270:4: rule__AnyToken__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AnyToken__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnyTokenAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnyToken"


    // $ANTLR start "entryRuleArgumentContent"
    // InternalTexDsl.g:279:1: entryRuleArgumentContent : ruleArgumentContent EOF ;
    public final void entryRuleArgumentContent() throws RecognitionException {
        try {
            // InternalTexDsl.g:280:1: ( ruleArgumentContent EOF )
            // InternalTexDsl.g:281:1: ruleArgumentContent EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArgumentContentRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleArgumentContent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArgumentContentRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArgumentContent"


    // $ANTLR start "ruleArgumentContent"
    // InternalTexDsl.g:288:1: ruleArgumentContent : ( ( rule__ArgumentContent__Alternatives ) ) ;
    public final void ruleArgumentContent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:292:2: ( ( ( rule__ArgumentContent__Alternatives ) ) )
            // InternalTexDsl.g:293:2: ( ( rule__ArgumentContent__Alternatives ) )
            {
            // InternalTexDsl.g:293:2: ( ( rule__ArgumentContent__Alternatives ) )
            // InternalTexDsl.g:294:3: ( rule__ArgumentContent__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArgumentContentAccess().getAlternatives()); 
            }
            // InternalTexDsl.g:295:3: ( rule__ArgumentContent__Alternatives )
            // InternalTexDsl.g:295:4: rule__ArgumentContent__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ArgumentContent__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArgumentContentAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArgumentContent"


    // $ANTLR start "entryRuleTextContainer"
    // InternalTexDsl.g:304:1: entryRuleTextContainer : ruleTextContainer EOF ;
    public final void entryRuleTextContainer() throws RecognitionException {
        try {
            // InternalTexDsl.g:305:1: ( ruleTextContainer EOF )
            // InternalTexDsl.g:306:1: ruleTextContainer EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextContainerRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTextContainer();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextContainerRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTextContainer"


    // $ANTLR start "ruleTextContainer"
    // InternalTexDsl.g:313:1: ruleTextContainer : ( ( ( rule__TextContainer__TextAssignment ) ) ( ( rule__TextContainer__TextAssignment )* ) ) ;
    public final void ruleTextContainer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:317:2: ( ( ( ( rule__TextContainer__TextAssignment ) ) ( ( rule__TextContainer__TextAssignment )* ) ) )
            // InternalTexDsl.g:318:2: ( ( ( rule__TextContainer__TextAssignment ) ) ( ( rule__TextContainer__TextAssignment )* ) )
            {
            // InternalTexDsl.g:318:2: ( ( ( rule__TextContainer__TextAssignment ) ) ( ( rule__TextContainer__TextAssignment )* ) )
            // InternalTexDsl.g:319:3: ( ( rule__TextContainer__TextAssignment ) ) ( ( rule__TextContainer__TextAssignment )* )
            {
            // InternalTexDsl.g:319:3: ( ( rule__TextContainer__TextAssignment ) )
            // InternalTexDsl.g:320:4: ( rule__TextContainer__TextAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextContainerAccess().getTextAssignment()); 
            }
            // InternalTexDsl.g:321:4: ( rule__TextContainer__TextAssignment )
            // InternalTexDsl.g:321:5: rule__TextContainer__TextAssignment
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__TextContainer__TextAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextContainerAccess().getTextAssignment()); 
            }

            }

            // InternalTexDsl.g:324:3: ( ( rule__TextContainer__TextAssignment )* )
            // InternalTexDsl.g:325:4: ( rule__TextContainer__TextAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextContainerAccess().getTextAssignment()); 
            }
            // InternalTexDsl.g:326:4: ( rule__TextContainer__TextAssignment )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_TEXT) ) {
                    int LA2_2 = input.LA(2);

                    if ( (synpred2_InternalTexDsl()) ) {
                        alt2=1;
                    }


                }


                switch (alt2) {
            	case 1 :
            	    // InternalTexDsl.g:326:5: rule__TextContainer__TextAssignment
            	    {
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    rule__TextContainer__TextAssignment();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextContainerAccess().getTextAssignment()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTextContainer"


    // $ANTLR start "entryRuleTextContent"
    // InternalTexDsl.g:336:1: entryRuleTextContent : ruleTextContent EOF ;
    public final void entryRuleTextContent() throws RecognitionException {
        try {
            // InternalTexDsl.g:337:1: ( ruleTextContent EOF )
            // InternalTexDsl.g:338:1: ruleTextContent EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextContentRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTextContent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextContentRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTextContent"


    // $ANTLR start "ruleTextContent"
    // InternalTexDsl.g:345:1: ruleTextContent : ( ( rule__TextContent__Alternatives ) ) ;
    public final void ruleTextContent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:349:2: ( ( ( rule__TextContent__Alternatives ) ) )
            // InternalTexDsl.g:350:2: ( ( rule__TextContent__Alternatives ) )
            {
            // InternalTexDsl.g:350:2: ( ( rule__TextContent__Alternatives ) )
            // InternalTexDsl.g:351:3: ( rule__TextContent__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextContentAccess().getAlternatives()); 
            }
            // InternalTexDsl.g:352:3: ( rule__TextContent__Alternatives )
            // InternalTexDsl.g:352:4: rule__TextContent__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TextContent__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextContentAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTextContent"


    // $ANTLR start "entryRuleIdentifiers"
    // InternalTexDsl.g:361:1: entryRuleIdentifiers : ruleIdentifiers EOF ;
    public final void entryRuleIdentifiers() throws RecognitionException {
        try {
            // InternalTexDsl.g:362:1: ( ruleIdentifiers EOF )
            // InternalTexDsl.g:363:1: ruleIdentifiers EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifiersRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleIdentifiers();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentifiersRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIdentifiers"


    // $ANTLR start "ruleIdentifiers"
    // InternalTexDsl.g:370:1: ruleIdentifiers : ( ( rule__Identifiers__IdAssignment ) ) ;
    public final void ruleIdentifiers() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:374:2: ( ( ( rule__Identifiers__IdAssignment ) ) )
            // InternalTexDsl.g:375:2: ( ( rule__Identifiers__IdAssignment ) )
            {
            // InternalTexDsl.g:375:2: ( ( rule__Identifiers__IdAssignment ) )
            // InternalTexDsl.g:376:3: ( rule__Identifiers__IdAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifiersAccess().getIdAssignment()); 
            }
            // InternalTexDsl.g:377:3: ( rule__Identifiers__IdAssignment )
            // InternalTexDsl.g:377:4: rule__Identifiers__IdAssignment
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Identifiers__IdAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentifiersAccess().getIdAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIdentifiers"


    // $ANTLR start "entryRuleNumbers"
    // InternalTexDsl.g:386:1: entryRuleNumbers : ruleNumbers EOF ;
    public final void entryRuleNumbers() throws RecognitionException {
        try {
            // InternalTexDsl.g:387:1: ( ruleNumbers EOF )
            // InternalTexDsl.g:388:1: ruleNumbers EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumbersRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleNumbers();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumbersRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumbers"


    // $ANTLR start "ruleNumbers"
    // InternalTexDsl.g:395:1: ruleNumbers : ( ( rule__Numbers__NumAssignment ) ) ;
    public final void ruleNumbers() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:399:2: ( ( ( rule__Numbers__NumAssignment ) ) )
            // InternalTexDsl.g:400:2: ( ( rule__Numbers__NumAssignment ) )
            {
            // InternalTexDsl.g:400:2: ( ( rule__Numbers__NumAssignment ) )
            // InternalTexDsl.g:401:3: ( rule__Numbers__NumAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumbersAccess().getNumAssignment()); 
            }
            // InternalTexDsl.g:402:3: ( rule__Numbers__NumAssignment )
            // InternalTexDsl.g:402:4: rule__Numbers__NumAssignment
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Numbers__NumAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumbersAccess().getNumAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumbers"


    // $ANTLR start "entryRuleOperators"
    // InternalTexDsl.g:411:1: entryRuleOperators : ruleOperators EOF ;
    public final void entryRuleOperators() throws RecognitionException {
        try {
            // InternalTexDsl.g:412:1: ( ruleOperators EOF )
            // InternalTexDsl.g:413:1: ruleOperators EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleOperators();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorsRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperators"


    // $ANTLR start "ruleOperators"
    // InternalTexDsl.g:420:1: ruleOperators : ( ( ( rule__Operators__OpAssignment ) ) ( ( rule__Operators__OpAssignment )* ) ) ;
    public final void ruleOperators() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:424:2: ( ( ( ( rule__Operators__OpAssignment ) ) ( ( rule__Operators__OpAssignment )* ) ) )
            // InternalTexDsl.g:425:2: ( ( ( rule__Operators__OpAssignment ) ) ( ( rule__Operators__OpAssignment )* ) )
            {
            // InternalTexDsl.g:425:2: ( ( ( rule__Operators__OpAssignment ) ) ( ( rule__Operators__OpAssignment )* ) )
            // InternalTexDsl.g:426:3: ( ( rule__Operators__OpAssignment ) ) ( ( rule__Operators__OpAssignment )* )
            {
            // InternalTexDsl.g:426:3: ( ( rule__Operators__OpAssignment ) )
            // InternalTexDsl.g:427:4: ( rule__Operators__OpAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorsAccess().getOpAssignment()); 
            }
            // InternalTexDsl.g:428:4: ( rule__Operators__OpAssignment )
            // InternalTexDsl.g:428:5: rule__Operators__OpAssignment
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__Operators__OpAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorsAccess().getOpAssignment()); 
            }

            }

            // InternalTexDsl.g:431:3: ( ( rule__Operators__OpAssignment )* )
            // InternalTexDsl.g:432:4: ( rule__Operators__OpAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorsAccess().getOpAssignment()); 
            }
            // InternalTexDsl.g:433:4: ( rule__Operators__OpAssignment )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_SYMBOL) ) {
                    int LA3_2 = input.LA(2);

                    if ( (synpred3_InternalTexDsl()) ) {
                        alt3=1;
                    }


                }


                switch (alt3) {
            	case 1 :
            	    // InternalTexDsl.g:433:5: rule__Operators__OpAssignment
            	    {
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    rule__Operators__OpAssignment();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorsAccess().getOpAssignment()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperators"


    // $ANTLR start "entryRuleMathExpression"
    // InternalTexDsl.g:443:1: entryRuleMathExpression : ruleMathExpression EOF ;
    public final void entryRuleMathExpression() throws RecognitionException {
        try {
            // InternalTexDsl.g:444:1: ( ruleMathExpression EOF )
            // InternalTexDsl.g:445:1: ruleMathExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMathExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleMathExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMathExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMathExpression"


    // $ANTLR start "ruleMathExpression"
    // InternalTexDsl.g:452:1: ruleMathExpression : ( ( rule__MathExpression__Alternatives ) ) ;
    public final void ruleMathExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:456:2: ( ( ( rule__MathExpression__Alternatives ) ) )
            // InternalTexDsl.g:457:2: ( ( rule__MathExpression__Alternatives ) )
            {
            // InternalTexDsl.g:457:2: ( ( rule__MathExpression__Alternatives ) )
            // InternalTexDsl.g:458:3: ( rule__MathExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMathExpressionAccess().getAlternatives()); 
            }
            // InternalTexDsl.g:459:3: ( rule__MathExpression__Alternatives )
            // InternalTexDsl.g:459:4: rule__MathExpression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MathExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMathExpressionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMathExpression"


    // $ANTLR start "entryRuleInlineMath"
    // InternalTexDsl.g:468:1: entryRuleInlineMath : ruleInlineMath EOF ;
    public final void entryRuleInlineMath() throws RecognitionException {
        try {
            // InternalTexDsl.g:469:1: ( ruleInlineMath EOF )
            // InternalTexDsl.g:470:1: ruleInlineMath EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInlineMathRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleInlineMath();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInlineMathRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInlineMath"


    // $ANTLR start "ruleInlineMath"
    // InternalTexDsl.g:477:1: ruleInlineMath : ( ( rule__InlineMath__Group__0 ) ) ;
    public final void ruleInlineMath() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:481:2: ( ( ( rule__InlineMath__Group__0 ) ) )
            // InternalTexDsl.g:482:2: ( ( rule__InlineMath__Group__0 ) )
            {
            // InternalTexDsl.g:482:2: ( ( rule__InlineMath__Group__0 ) )
            // InternalTexDsl.g:483:3: ( rule__InlineMath__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInlineMathAccess().getGroup()); 
            }
            // InternalTexDsl.g:484:3: ( rule__InlineMath__Group__0 )
            // InternalTexDsl.g:484:4: rule__InlineMath__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InlineMath__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInlineMathAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInlineMath"


    // $ANTLR start "entryRuleDisplayMath"
    // InternalTexDsl.g:493:1: entryRuleDisplayMath : ruleDisplayMath EOF ;
    public final void entryRuleDisplayMath() throws RecognitionException {
        try {
            // InternalTexDsl.g:494:1: ( ruleDisplayMath EOF )
            // InternalTexDsl.g:495:1: ruleDisplayMath EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisplayMathRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleDisplayMath();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisplayMathRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDisplayMath"


    // $ANTLR start "ruleDisplayMath"
    // InternalTexDsl.g:502:1: ruleDisplayMath : ( ( rule__DisplayMath__Group__0 ) ) ;
    public final void ruleDisplayMath() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:506:2: ( ( ( rule__DisplayMath__Group__0 ) ) )
            // InternalTexDsl.g:507:2: ( ( rule__DisplayMath__Group__0 ) )
            {
            // InternalTexDsl.g:507:2: ( ( rule__DisplayMath__Group__0 ) )
            // InternalTexDsl.g:508:3: ( rule__DisplayMath__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisplayMathAccess().getGroup()); 
            }
            // InternalTexDsl.g:509:3: ( rule__DisplayMath__Group__0 )
            // InternalTexDsl.g:509:4: rule__DisplayMath__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DisplayMath__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisplayMathAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDisplayMath"


    // $ANTLR start "entryRuleMathContent"
    // InternalTexDsl.g:518:1: entryRuleMathContent : ruleMathContent EOF ;
    public final void entryRuleMathContent() throws RecognitionException {
        try {
            // InternalTexDsl.g:519:1: ( ruleMathContent EOF )
            // InternalTexDsl.g:520:1: ruleMathContent EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMathContentRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleMathContent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMathContentRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMathContent"


    // $ANTLR start "ruleMathContent"
    // InternalTexDsl.g:527:1: ruleMathContent : ( ( rule__MathContent__Alternatives ) ) ;
    public final void ruleMathContent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:531:2: ( ( ( rule__MathContent__Alternatives ) ) )
            // InternalTexDsl.g:532:2: ( ( rule__MathContent__Alternatives ) )
            {
            // InternalTexDsl.g:532:2: ( ( rule__MathContent__Alternatives ) )
            // InternalTexDsl.g:533:3: ( rule__MathContent__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMathContentAccess().getAlternatives()); 
            }
            // InternalTexDsl.g:534:3: ( rule__MathContent__Alternatives )
            // InternalTexDsl.g:534:4: rule__MathContent__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MathContent__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMathContentAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMathContent"


    // $ANTLR start "rule__Element__Alternatives"
    // InternalTexDsl.g:542:1: rule__Element__Alternatives : ( ( ruleCommand ) | ( ruleTextContent ) | ( ruleMathExpression ) | ( ruleCodeblock ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:546:1: ( ( ruleCommand ) | ( ruleTextContent ) | ( ruleMathExpression ) | ( ruleCodeblock ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case RULE_BS:
                {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==RULE_ID) ) {
                    alt4=1;
                }
                else if ( (LA4_1==16) ) {
                    alt4=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
            case RULE_TEXT:
            case RULE_SYMBOL:
            case RULE_NUMBER:
            case RULE_SQBO:
            case RULE_CUBO:
                {
                alt4=2;
                }
                break;
            case 18:
            case 19:
                {
                alt4=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalTexDsl.g:547:2: ( ruleCommand )
                    {
                    // InternalTexDsl.g:547:2: ( ruleCommand )
                    // InternalTexDsl.g:548:3: ruleCommand
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementAccess().getCommandParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleCommand();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElementAccess().getCommandParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTexDsl.g:553:2: ( ruleTextContent )
                    {
                    // InternalTexDsl.g:553:2: ( ruleTextContent )
                    // InternalTexDsl.g:554:3: ruleTextContent
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementAccess().getTextContentParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleTextContent();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElementAccess().getTextContentParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTexDsl.g:559:2: ( ruleMathExpression )
                    {
                    // InternalTexDsl.g:559:2: ( ruleMathExpression )
                    // InternalTexDsl.g:560:3: ruleMathExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementAccess().getMathExpressionParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleMathExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElementAccess().getMathExpressionParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalTexDsl.g:565:2: ( ruleCodeblock )
                    {
                    // InternalTexDsl.g:565:2: ( ruleCodeblock )
                    // InternalTexDsl.g:566:3: ruleCodeblock
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementAccess().getCodeblockParserRuleCall_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleCodeblock();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElementAccess().getCodeblockParserRuleCall_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Alternatives"


    // $ANTLR start "rule__CodeblockElement__Alternatives"
    // InternalTexDsl.g:575:1: rule__CodeblockElement__Alternatives : ( ( ( rule__CodeblockElement__Group_0__0 ) ) | ( ruleCommand ) );
    public final void rule__CodeblockElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:579:1: ( ( ( rule__CodeblockElement__Group_0__0 ) ) | ( ruleCommand ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_CUBC)) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_BS) ) {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==RULE_ID) ) {
                    int LA5_3 = input.LA(3);

                    if ( (synpred7_InternalTexDsl()) ) {
                        alt5=1;
                    }
                    else if ( (true) ) {
                        alt5=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA5_2==EOF||(LA5_2>=RULE_TEXT && LA5_2<=RULE_BS)) ) {
                    alt5=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalTexDsl.g:580:2: ( ( rule__CodeblockElement__Group_0__0 ) )
                    {
                    // InternalTexDsl.g:580:2: ( ( rule__CodeblockElement__Group_0__0 ) )
                    // InternalTexDsl.g:581:3: ( rule__CodeblockElement__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCodeblockElementAccess().getGroup_0()); 
                    }
                    // InternalTexDsl.g:582:3: ( rule__CodeblockElement__Group_0__0 )
                    // InternalTexDsl.g:582:4: rule__CodeblockElement__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__CodeblockElement__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCodeblockElementAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTexDsl.g:586:2: ( ruleCommand )
                    {
                    // InternalTexDsl.g:586:2: ( ruleCommand )
                    // InternalTexDsl.g:587:3: ruleCommand
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCodeblockElementAccess().getCommandParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleCommand();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCodeblockElementAccess().getCommandParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodeblockElement__Alternatives"


    // $ANTLR start "rule__AnyToken__Alternatives"
    // InternalTexDsl.g:596:1: rule__AnyToken__Alternatives : ( ( RULE_ID ) | ( RULE_TEXT ) | ( RULE_SYMBOL ) | ( RULE_NUMBER ) | ( RULE_SQBO ) | ( RULE_SQBC ) | ( RULE_CUBO ) | ( RULE_CUBC ) | ( ( ( RULE_BS ) ) ( ( RULE_BS )* ) ) );
    public final void rule__AnyToken__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:600:1: ( ( RULE_ID ) | ( RULE_TEXT ) | ( RULE_SYMBOL ) | ( RULE_NUMBER ) | ( RULE_SQBO ) | ( RULE_SQBC ) | ( RULE_CUBO ) | ( RULE_CUBC ) | ( ( ( RULE_BS ) ) ( ( RULE_BS )* ) ) )
            int alt7=9;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt7=1;
                }
                break;
            case RULE_TEXT:
                {
                alt7=2;
                }
                break;
            case RULE_SYMBOL:
                {
                alt7=3;
                }
                break;
            case RULE_NUMBER:
                {
                alt7=4;
                }
                break;
            case RULE_SQBO:
                {
                alt7=5;
                }
                break;
            case RULE_SQBC:
                {
                alt7=6;
                }
                break;
            case RULE_CUBO:
                {
                alt7=7;
                }
                break;
            case RULE_CUBC:
                {
                alt7=8;
                }
                break;
            case RULE_BS:
                {
                alt7=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalTexDsl.g:601:2: ( RULE_ID )
                    {
                    // InternalTexDsl.g:601:2: ( RULE_ID )
                    // InternalTexDsl.g:602:3: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnyTokenAccess().getIDTerminalRuleCall_0()); 
                    }
                    match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnyTokenAccess().getIDTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTexDsl.g:607:2: ( RULE_TEXT )
                    {
                    // InternalTexDsl.g:607:2: ( RULE_TEXT )
                    // InternalTexDsl.g:608:3: RULE_TEXT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnyTokenAccess().getTEXTTerminalRuleCall_1()); 
                    }
                    match(input,RULE_TEXT,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnyTokenAccess().getTEXTTerminalRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTexDsl.g:613:2: ( RULE_SYMBOL )
                    {
                    // InternalTexDsl.g:613:2: ( RULE_SYMBOL )
                    // InternalTexDsl.g:614:3: RULE_SYMBOL
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnyTokenAccess().getSYMBOLTerminalRuleCall_2()); 
                    }
                    match(input,RULE_SYMBOL,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnyTokenAccess().getSYMBOLTerminalRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalTexDsl.g:619:2: ( RULE_NUMBER )
                    {
                    // InternalTexDsl.g:619:2: ( RULE_NUMBER )
                    // InternalTexDsl.g:620:3: RULE_NUMBER
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnyTokenAccess().getNUMBERTerminalRuleCall_3()); 
                    }
                    match(input,RULE_NUMBER,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnyTokenAccess().getNUMBERTerminalRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalTexDsl.g:625:2: ( RULE_SQBO )
                    {
                    // InternalTexDsl.g:625:2: ( RULE_SQBO )
                    // InternalTexDsl.g:626:3: RULE_SQBO
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnyTokenAccess().getSQBOTerminalRuleCall_4()); 
                    }
                    match(input,RULE_SQBO,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnyTokenAccess().getSQBOTerminalRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalTexDsl.g:631:2: ( RULE_SQBC )
                    {
                    // InternalTexDsl.g:631:2: ( RULE_SQBC )
                    // InternalTexDsl.g:632:3: RULE_SQBC
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnyTokenAccess().getSQBCTerminalRuleCall_5()); 
                    }
                    match(input,RULE_SQBC,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnyTokenAccess().getSQBCTerminalRuleCall_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalTexDsl.g:637:2: ( RULE_CUBO )
                    {
                    // InternalTexDsl.g:637:2: ( RULE_CUBO )
                    // InternalTexDsl.g:638:3: RULE_CUBO
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnyTokenAccess().getCUBOTerminalRuleCall_6()); 
                    }
                    match(input,RULE_CUBO,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnyTokenAccess().getCUBOTerminalRuleCall_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalTexDsl.g:643:2: ( RULE_CUBC )
                    {
                    // InternalTexDsl.g:643:2: ( RULE_CUBC )
                    // InternalTexDsl.g:644:3: RULE_CUBC
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnyTokenAccess().getCUBCTerminalRuleCall_7()); 
                    }
                    match(input,RULE_CUBC,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnyTokenAccess().getCUBCTerminalRuleCall_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalTexDsl.g:649:2: ( ( ( RULE_BS ) ) ( ( RULE_BS )* ) )
                    {
                    // InternalTexDsl.g:649:2: ( ( ( RULE_BS ) ) ( ( RULE_BS )* ) )
                    // InternalTexDsl.g:650:3: ( ( RULE_BS ) ) ( ( RULE_BS )* )
                    {
                    // InternalTexDsl.g:650:3: ( ( RULE_BS ) )
                    // InternalTexDsl.g:651:4: ( RULE_BS )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnyTokenAccess().getBSTerminalRuleCall_8()); 
                    }
                    // InternalTexDsl.g:652:4: ( RULE_BS )
                    // InternalTexDsl.g:652:5: RULE_BS
                    {
                    match(input,RULE_BS,FollowSets000.FOLLOW_6); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnyTokenAccess().getBSTerminalRuleCall_8()); 
                    }

                    }

                    // InternalTexDsl.g:655:3: ( ( RULE_BS )* )
                    // InternalTexDsl.g:656:4: ( RULE_BS )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnyTokenAccess().getBSTerminalRuleCall_8()); 
                    }
                    // InternalTexDsl.g:657:4: ( RULE_BS )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_BS) ) {
                            int LA6_2 = input.LA(2);

                            if ( (synpred16_InternalTexDsl()) ) {
                                alt6=1;
                            }


                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalTexDsl.g:657:5: RULE_BS
                    	    {
                    	    match(input,RULE_BS,FollowSets000.FOLLOW_6); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnyTokenAccess().getBSTerminalRuleCall_8()); 
                    }

                    }


                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyToken__Alternatives"


    // $ANTLR start "rule__ArgumentContent__Alternatives"
    // InternalTexDsl.g:666:1: rule__ArgumentContent__Alternatives : ( ( ruleTextContent ) | ( ruleCommand ) | ( ruleMathExpression ) );
    public final void rule__ArgumentContent__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:670:1: ( ( ruleTextContent ) | ( ruleCommand ) | ( ruleMathExpression ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_TEXT:
            case RULE_SYMBOL:
            case RULE_NUMBER:
            case RULE_SQBO:
            case RULE_CUBO:
                {
                alt8=1;
                }
                break;
            case RULE_BS:
                {
                alt8=2;
                }
                break;
            case 18:
            case 19:
                {
                alt8=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalTexDsl.g:671:2: ( ruleTextContent )
                    {
                    // InternalTexDsl.g:671:2: ( ruleTextContent )
                    // InternalTexDsl.g:672:3: ruleTextContent
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getArgumentContentAccess().getTextContentParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleTextContent();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getArgumentContentAccess().getTextContentParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTexDsl.g:677:2: ( ruleCommand )
                    {
                    // InternalTexDsl.g:677:2: ( ruleCommand )
                    // InternalTexDsl.g:678:3: ruleCommand
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getArgumentContentAccess().getCommandParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleCommand();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getArgumentContentAccess().getCommandParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTexDsl.g:683:2: ( ruleMathExpression )
                    {
                    // InternalTexDsl.g:683:2: ( ruleMathExpression )
                    // InternalTexDsl.g:684:3: ruleMathExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getArgumentContentAccess().getMathExpressionParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleMathExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getArgumentContentAccess().getMathExpressionParserRuleCall_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgumentContent__Alternatives"


    // $ANTLR start "rule__TextContent__Alternatives"
    // InternalTexDsl.g:693:1: rule__TextContent__Alternatives : ( ( ruleIdentifiers ) | ( ruleTextContainer ) | ( ruleOperators ) | ( ruleNumbers ) | ( ruleOptionalArgument ) | ( ruleMandatoryArgument ) );
    public final void rule__TextContent__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:697:1: ( ( ruleIdentifiers ) | ( ruleTextContainer ) | ( ruleOperators ) | ( ruleNumbers ) | ( ruleOptionalArgument ) | ( ruleMandatoryArgument ) )
            int alt9=6;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt9=1;
                }
                break;
            case RULE_TEXT:
                {
                alt9=2;
                }
                break;
            case RULE_SYMBOL:
                {
                alt9=3;
                }
                break;
            case RULE_NUMBER:
                {
                alt9=4;
                }
                break;
            case RULE_SQBO:
                {
                alt9=5;
                }
                break;
            case RULE_CUBO:
                {
                alt9=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalTexDsl.g:698:2: ( ruleIdentifiers )
                    {
                    // InternalTexDsl.g:698:2: ( ruleIdentifiers )
                    // InternalTexDsl.g:699:3: ruleIdentifiers
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTextContentAccess().getIdentifiersParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleIdentifiers();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTextContentAccess().getIdentifiersParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTexDsl.g:704:2: ( ruleTextContainer )
                    {
                    // InternalTexDsl.g:704:2: ( ruleTextContainer )
                    // InternalTexDsl.g:705:3: ruleTextContainer
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTextContentAccess().getTextContainerParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleTextContainer();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTextContentAccess().getTextContainerParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTexDsl.g:710:2: ( ruleOperators )
                    {
                    // InternalTexDsl.g:710:2: ( ruleOperators )
                    // InternalTexDsl.g:711:3: ruleOperators
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTextContentAccess().getOperatorsParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleOperators();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTextContentAccess().getOperatorsParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalTexDsl.g:716:2: ( ruleNumbers )
                    {
                    // InternalTexDsl.g:716:2: ( ruleNumbers )
                    // InternalTexDsl.g:717:3: ruleNumbers
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTextContentAccess().getNumbersParserRuleCall_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleNumbers();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTextContentAccess().getNumbersParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalTexDsl.g:722:2: ( ruleOptionalArgument )
                    {
                    // InternalTexDsl.g:722:2: ( ruleOptionalArgument )
                    // InternalTexDsl.g:723:3: ruleOptionalArgument
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTextContentAccess().getOptionalArgumentParserRuleCall_4()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleOptionalArgument();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTextContentAccess().getOptionalArgumentParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalTexDsl.g:728:2: ( ruleMandatoryArgument )
                    {
                    // InternalTexDsl.g:728:2: ( ruleMandatoryArgument )
                    // InternalTexDsl.g:729:3: ruleMandatoryArgument
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTextContentAccess().getMandatoryArgumentParserRuleCall_5()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleMandatoryArgument();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTextContentAccess().getMandatoryArgumentParserRuleCall_5()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextContent__Alternatives"


    // $ANTLR start "rule__MathExpression__Alternatives"
    // InternalTexDsl.g:738:1: rule__MathExpression__Alternatives : ( ( ruleInlineMath ) | ( ruleDisplayMath ) );
    public final void rule__MathExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:742:1: ( ( ruleInlineMath ) | ( ruleDisplayMath ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            else if ( (LA10_0==19) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalTexDsl.g:743:2: ( ruleInlineMath )
                    {
                    // InternalTexDsl.g:743:2: ( ruleInlineMath )
                    // InternalTexDsl.g:744:3: ruleInlineMath
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMathExpressionAccess().getInlineMathParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleInlineMath();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMathExpressionAccess().getInlineMathParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTexDsl.g:749:2: ( ruleDisplayMath )
                    {
                    // InternalTexDsl.g:749:2: ( ruleDisplayMath )
                    // InternalTexDsl.g:750:3: ruleDisplayMath
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMathExpressionAccess().getDisplayMathParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleDisplayMath();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMathExpressionAccess().getDisplayMathParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathExpression__Alternatives"


    // $ANTLR start "rule__MathContent__Alternatives"
    // InternalTexDsl.g:759:1: rule__MathContent__Alternatives : ( ( ruleCommand ) | ( ruleTextContent ) | ( ruleNumbers ) | ( ruleOperators ) );
    public final void rule__MathContent__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:763:1: ( ( ruleCommand ) | ( ruleTextContent ) | ( ruleNumbers ) | ( ruleOperators ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case RULE_BS:
                {
                alt11=1;
                }
                break;
            case RULE_ID:
            case RULE_TEXT:
            case RULE_SQBO:
            case RULE_CUBO:
                {
                alt11=2;
                }
                break;
            case RULE_SYMBOL:
                {
                int LA11_3 = input.LA(2);

                if ( (synpred26_InternalTexDsl()) ) {
                    alt11=2;
                }
                else if ( (true) ) {
                    alt11=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_NUMBER:
                {
                int LA11_4 = input.LA(2);

                if ( (synpred26_InternalTexDsl()) ) {
                    alt11=2;
                }
                else if ( (synpred27_InternalTexDsl()) ) {
                    alt11=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalTexDsl.g:764:2: ( ruleCommand )
                    {
                    // InternalTexDsl.g:764:2: ( ruleCommand )
                    // InternalTexDsl.g:765:3: ruleCommand
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMathContentAccess().getCommandParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleCommand();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMathContentAccess().getCommandParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTexDsl.g:770:2: ( ruleTextContent )
                    {
                    // InternalTexDsl.g:770:2: ( ruleTextContent )
                    // InternalTexDsl.g:771:3: ruleTextContent
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMathContentAccess().getTextContentParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleTextContent();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMathContentAccess().getTextContentParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTexDsl.g:776:2: ( ruleNumbers )
                    {
                    // InternalTexDsl.g:776:2: ( ruleNumbers )
                    // InternalTexDsl.g:777:3: ruleNumbers
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMathContentAccess().getNumbersParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleNumbers();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMathContentAccess().getNumbersParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalTexDsl.g:782:2: ( ruleOperators )
                    {
                    // InternalTexDsl.g:782:2: ( ruleOperators )
                    // InternalTexDsl.g:783:3: ruleOperators
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMathContentAccess().getOperatorsParserRuleCall_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleOperators();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMathContentAccess().getOperatorsParserRuleCall_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathContent__Alternatives"


    // $ANTLR start "rule__Command__Group__0"
    // InternalTexDsl.g:792:1: rule__Command__Group__0 : rule__Command__Group__0__Impl rule__Command__Group__1 ;
    public final void rule__Command__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:796:1: ( rule__Command__Group__0__Impl rule__Command__Group__1 )
            // InternalTexDsl.g:797:2: rule__Command__Group__0__Impl rule__Command__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__Command__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Command__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group__0"


    // $ANTLR start "rule__Command__Group__0__Impl"
    // InternalTexDsl.g:804:1: rule__Command__Group__0__Impl : ( ( RULE_BS ) ) ;
    public final void rule__Command__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:808:1: ( ( ( RULE_BS ) ) )
            // InternalTexDsl.g:809:1: ( ( RULE_BS ) )
            {
            // InternalTexDsl.g:809:1: ( ( RULE_BS ) )
            // InternalTexDsl.g:810:2: ( RULE_BS )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getBSTerminalRuleCall_0()); 
            }
            // InternalTexDsl.g:811:2: ( RULE_BS )
            // InternalTexDsl.g:811:3: RULE_BS
            {
            match(input,RULE_BS,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getBSTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group__0__Impl"


    // $ANTLR start "rule__Command__Group__1"
    // InternalTexDsl.g:819:1: rule__Command__Group__1 : rule__Command__Group__1__Impl rule__Command__Group__2 ;
    public final void rule__Command__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:823:1: ( rule__Command__Group__1__Impl rule__Command__Group__2 )
            // InternalTexDsl.g:824:2: rule__Command__Group__1__Impl rule__Command__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__Command__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Command__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group__1"


    // $ANTLR start "rule__Command__Group__1__Impl"
    // InternalTexDsl.g:831:1: rule__Command__Group__1__Impl : ( ( rule__Command__CommandAssignment_1 ) ) ;
    public final void rule__Command__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:835:1: ( ( ( rule__Command__CommandAssignment_1 ) ) )
            // InternalTexDsl.g:836:1: ( ( rule__Command__CommandAssignment_1 ) )
            {
            // InternalTexDsl.g:836:1: ( ( rule__Command__CommandAssignment_1 ) )
            // InternalTexDsl.g:837:2: ( rule__Command__CommandAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getCommandAssignment_1()); 
            }
            // InternalTexDsl.g:838:2: ( rule__Command__CommandAssignment_1 )
            // InternalTexDsl.g:838:3: rule__Command__CommandAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Command__CommandAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getCommandAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group__1__Impl"


    // $ANTLR start "rule__Command__Group__2"
    // InternalTexDsl.g:846:1: rule__Command__Group__2 : rule__Command__Group__2__Impl rule__Command__Group__3 ;
    public final void rule__Command__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:850:1: ( rule__Command__Group__2__Impl rule__Command__Group__3 )
            // InternalTexDsl.g:851:2: rule__Command__Group__2__Impl rule__Command__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__Command__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Command__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group__2"


    // $ANTLR start "rule__Command__Group__2__Impl"
    // InternalTexDsl.g:858:1: rule__Command__Group__2__Impl : ( ( rule__Command__OptionalArgsAssignment_2 )* ) ;
    public final void rule__Command__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:862:1: ( ( ( rule__Command__OptionalArgsAssignment_2 )* ) )
            // InternalTexDsl.g:863:1: ( ( rule__Command__OptionalArgsAssignment_2 )* )
            {
            // InternalTexDsl.g:863:1: ( ( rule__Command__OptionalArgsAssignment_2 )* )
            // InternalTexDsl.g:864:2: ( rule__Command__OptionalArgsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getOptionalArgsAssignment_2()); 
            }
            // InternalTexDsl.g:865:2: ( rule__Command__OptionalArgsAssignment_2 )*
            loop12:
            do {
                int alt12=2;
                alt12 = dfa12.predict(input);
                switch (alt12) {
            	case 1 :
            	    // InternalTexDsl.g:865:3: rule__Command__OptionalArgsAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_9);
            	    rule__Command__OptionalArgsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getOptionalArgsAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group__2__Impl"


    // $ANTLR start "rule__Command__Group__3"
    // InternalTexDsl.g:873:1: rule__Command__Group__3 : rule__Command__Group__3__Impl ;
    public final void rule__Command__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:877:1: ( rule__Command__Group__3__Impl )
            // InternalTexDsl.g:878:2: rule__Command__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Command__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group__3"


    // $ANTLR start "rule__Command__Group__3__Impl"
    // InternalTexDsl.g:884:1: rule__Command__Group__3__Impl : ( ( rule__Command__MandatoryArgsAssignment_3 )* ) ;
    public final void rule__Command__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:888:1: ( ( ( rule__Command__MandatoryArgsAssignment_3 )* ) )
            // InternalTexDsl.g:889:1: ( ( rule__Command__MandatoryArgsAssignment_3 )* )
            {
            // InternalTexDsl.g:889:1: ( ( rule__Command__MandatoryArgsAssignment_3 )* )
            // InternalTexDsl.g:890:2: ( rule__Command__MandatoryArgsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getMandatoryArgsAssignment_3()); 
            }
            // InternalTexDsl.g:891:2: ( rule__Command__MandatoryArgsAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                alt13 = dfa13.predict(input);
                switch (alt13) {
            	case 1 :
            	    // InternalTexDsl.g:891:3: rule__Command__MandatoryArgsAssignment_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_10);
            	    rule__Command__MandatoryArgsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getMandatoryArgsAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group__3__Impl"


    // $ANTLR start "rule__OptionalArgument__Group__0"
    // InternalTexDsl.g:900:1: rule__OptionalArgument__Group__0 : rule__OptionalArgument__Group__0__Impl rule__OptionalArgument__Group__1 ;
    public final void rule__OptionalArgument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:904:1: ( rule__OptionalArgument__Group__0__Impl rule__OptionalArgument__Group__1 )
            // InternalTexDsl.g:905:2: rule__OptionalArgument__Group__0__Impl rule__OptionalArgument__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__OptionalArgument__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OptionalArgument__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionalArgument__Group__0"


    // $ANTLR start "rule__OptionalArgument__Group__0__Impl"
    // InternalTexDsl.g:912:1: rule__OptionalArgument__Group__0__Impl : ( () ) ;
    public final void rule__OptionalArgument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:916:1: ( ( () ) )
            // InternalTexDsl.g:917:1: ( () )
            {
            // InternalTexDsl.g:917:1: ( () )
            // InternalTexDsl.g:918:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionalArgumentAccess().getOptionalArgumentAction_0()); 
            }
            // InternalTexDsl.g:919:2: ()
            // InternalTexDsl.g:919:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOptionalArgumentAccess().getOptionalArgumentAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionalArgument__Group__0__Impl"


    // $ANTLR start "rule__OptionalArgument__Group__1"
    // InternalTexDsl.g:927:1: rule__OptionalArgument__Group__1 : rule__OptionalArgument__Group__1__Impl rule__OptionalArgument__Group__2 ;
    public final void rule__OptionalArgument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:931:1: ( rule__OptionalArgument__Group__1__Impl rule__OptionalArgument__Group__2 )
            // InternalTexDsl.g:932:2: rule__OptionalArgument__Group__1__Impl rule__OptionalArgument__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__OptionalArgument__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OptionalArgument__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionalArgument__Group__1"


    // $ANTLR start "rule__OptionalArgument__Group__1__Impl"
    // InternalTexDsl.g:939:1: rule__OptionalArgument__Group__1__Impl : ( RULE_SQBO ) ;
    public final void rule__OptionalArgument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:943:1: ( ( RULE_SQBO ) )
            // InternalTexDsl.g:944:1: ( RULE_SQBO )
            {
            // InternalTexDsl.g:944:1: ( RULE_SQBO )
            // InternalTexDsl.g:945:2: RULE_SQBO
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionalArgumentAccess().getSQBOTerminalRuleCall_1()); 
            }
            match(input,RULE_SQBO,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOptionalArgumentAccess().getSQBOTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionalArgument__Group__1__Impl"


    // $ANTLR start "rule__OptionalArgument__Group__2"
    // InternalTexDsl.g:954:1: rule__OptionalArgument__Group__2 : rule__OptionalArgument__Group__2__Impl rule__OptionalArgument__Group__3 ;
    public final void rule__OptionalArgument__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:958:1: ( rule__OptionalArgument__Group__2__Impl rule__OptionalArgument__Group__3 )
            // InternalTexDsl.g:959:2: rule__OptionalArgument__Group__2__Impl rule__OptionalArgument__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__OptionalArgument__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OptionalArgument__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionalArgument__Group__2"


    // $ANTLR start "rule__OptionalArgument__Group__2__Impl"
    // InternalTexDsl.g:966:1: rule__OptionalArgument__Group__2__Impl : ( ( rule__OptionalArgument__ContentAssignment_2 )* ) ;
    public final void rule__OptionalArgument__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:970:1: ( ( ( rule__OptionalArgument__ContentAssignment_2 )* ) )
            // InternalTexDsl.g:971:1: ( ( rule__OptionalArgument__ContentAssignment_2 )* )
            {
            // InternalTexDsl.g:971:1: ( ( rule__OptionalArgument__ContentAssignment_2 )* )
            // InternalTexDsl.g:972:2: ( rule__OptionalArgument__ContentAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionalArgumentAccess().getContentAssignment_2()); 
            }
            // InternalTexDsl.g:973:2: ( rule__OptionalArgument__ContentAssignment_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_SQBO)||LA14_0==RULE_CUBO||LA14_0==RULE_BS||(LA14_0>=18 && LA14_0<=19)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalTexDsl.g:973:3: rule__OptionalArgument__ContentAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_3);
            	    rule__OptionalArgument__ContentAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOptionalArgumentAccess().getContentAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionalArgument__Group__2__Impl"


    // $ANTLR start "rule__OptionalArgument__Group__3"
    // InternalTexDsl.g:981:1: rule__OptionalArgument__Group__3 : rule__OptionalArgument__Group__3__Impl ;
    public final void rule__OptionalArgument__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:985:1: ( rule__OptionalArgument__Group__3__Impl )
            // InternalTexDsl.g:986:2: rule__OptionalArgument__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OptionalArgument__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionalArgument__Group__3"


    // $ANTLR start "rule__OptionalArgument__Group__3__Impl"
    // InternalTexDsl.g:992:1: rule__OptionalArgument__Group__3__Impl : ( RULE_SQBC ) ;
    public final void rule__OptionalArgument__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:996:1: ( ( RULE_SQBC ) )
            // InternalTexDsl.g:997:1: ( RULE_SQBC )
            {
            // InternalTexDsl.g:997:1: ( RULE_SQBC )
            // InternalTexDsl.g:998:2: RULE_SQBC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionalArgumentAccess().getSQBCTerminalRuleCall_3()); 
            }
            match(input,RULE_SQBC,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOptionalArgumentAccess().getSQBCTerminalRuleCall_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionalArgument__Group__3__Impl"


    // $ANTLR start "rule__MandatoryArgument__Group__0"
    // InternalTexDsl.g:1008:1: rule__MandatoryArgument__Group__0 : rule__MandatoryArgument__Group__0__Impl rule__MandatoryArgument__Group__1 ;
    public final void rule__MandatoryArgument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1012:1: ( rule__MandatoryArgument__Group__0__Impl rule__MandatoryArgument__Group__1 )
            // InternalTexDsl.g:1013:2: rule__MandatoryArgument__Group__0__Impl rule__MandatoryArgument__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__MandatoryArgument__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MandatoryArgument__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MandatoryArgument__Group__0"


    // $ANTLR start "rule__MandatoryArgument__Group__0__Impl"
    // InternalTexDsl.g:1020:1: rule__MandatoryArgument__Group__0__Impl : ( () ) ;
    public final void rule__MandatoryArgument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1024:1: ( ( () ) )
            // InternalTexDsl.g:1025:1: ( () )
            {
            // InternalTexDsl.g:1025:1: ( () )
            // InternalTexDsl.g:1026:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMandatoryArgumentAccess().getMandatoryArgumentAction_0()); 
            }
            // InternalTexDsl.g:1027:2: ()
            // InternalTexDsl.g:1027:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMandatoryArgumentAccess().getMandatoryArgumentAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MandatoryArgument__Group__0__Impl"


    // $ANTLR start "rule__MandatoryArgument__Group__1"
    // InternalTexDsl.g:1035:1: rule__MandatoryArgument__Group__1 : rule__MandatoryArgument__Group__1__Impl rule__MandatoryArgument__Group__2 ;
    public final void rule__MandatoryArgument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1039:1: ( rule__MandatoryArgument__Group__1__Impl rule__MandatoryArgument__Group__2 )
            // InternalTexDsl.g:1040:2: rule__MandatoryArgument__Group__1__Impl rule__MandatoryArgument__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__MandatoryArgument__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MandatoryArgument__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MandatoryArgument__Group__1"


    // $ANTLR start "rule__MandatoryArgument__Group__1__Impl"
    // InternalTexDsl.g:1047:1: rule__MandatoryArgument__Group__1__Impl : ( RULE_CUBO ) ;
    public final void rule__MandatoryArgument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1051:1: ( ( RULE_CUBO ) )
            // InternalTexDsl.g:1052:1: ( RULE_CUBO )
            {
            // InternalTexDsl.g:1052:1: ( RULE_CUBO )
            // InternalTexDsl.g:1053:2: RULE_CUBO
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMandatoryArgumentAccess().getCUBOTerminalRuleCall_1()); 
            }
            match(input,RULE_CUBO,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMandatoryArgumentAccess().getCUBOTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MandatoryArgument__Group__1__Impl"


    // $ANTLR start "rule__MandatoryArgument__Group__2"
    // InternalTexDsl.g:1062:1: rule__MandatoryArgument__Group__2 : rule__MandatoryArgument__Group__2__Impl rule__MandatoryArgument__Group__3 ;
    public final void rule__MandatoryArgument__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1066:1: ( rule__MandatoryArgument__Group__2__Impl rule__MandatoryArgument__Group__3 )
            // InternalTexDsl.g:1067:2: rule__MandatoryArgument__Group__2__Impl rule__MandatoryArgument__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__MandatoryArgument__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MandatoryArgument__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MandatoryArgument__Group__2"


    // $ANTLR start "rule__MandatoryArgument__Group__2__Impl"
    // InternalTexDsl.g:1074:1: rule__MandatoryArgument__Group__2__Impl : ( ( rule__MandatoryArgument__ContentAssignment_2 )* ) ;
    public final void rule__MandatoryArgument__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1078:1: ( ( ( rule__MandatoryArgument__ContentAssignment_2 )* ) )
            // InternalTexDsl.g:1079:1: ( ( rule__MandatoryArgument__ContentAssignment_2 )* )
            {
            // InternalTexDsl.g:1079:1: ( ( rule__MandatoryArgument__ContentAssignment_2 )* )
            // InternalTexDsl.g:1080:2: ( rule__MandatoryArgument__ContentAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMandatoryArgumentAccess().getContentAssignment_2()); 
            }
            // InternalTexDsl.g:1081:2: ( rule__MandatoryArgument__ContentAssignment_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_SQBO)||LA15_0==RULE_CUBO||LA15_0==RULE_BS||(LA15_0>=18 && LA15_0<=19)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalTexDsl.g:1081:3: rule__MandatoryArgument__ContentAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_3);
            	    rule__MandatoryArgument__ContentAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMandatoryArgumentAccess().getContentAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MandatoryArgument__Group__2__Impl"


    // $ANTLR start "rule__MandatoryArgument__Group__3"
    // InternalTexDsl.g:1089:1: rule__MandatoryArgument__Group__3 : rule__MandatoryArgument__Group__3__Impl ;
    public final void rule__MandatoryArgument__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1093:1: ( rule__MandatoryArgument__Group__3__Impl )
            // InternalTexDsl.g:1094:2: rule__MandatoryArgument__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MandatoryArgument__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MandatoryArgument__Group__3"


    // $ANTLR start "rule__MandatoryArgument__Group__3__Impl"
    // InternalTexDsl.g:1100:1: rule__MandatoryArgument__Group__3__Impl : ( RULE_CUBC ) ;
    public final void rule__MandatoryArgument__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1104:1: ( ( RULE_CUBC ) )
            // InternalTexDsl.g:1105:1: ( RULE_CUBC )
            {
            // InternalTexDsl.g:1105:1: ( RULE_CUBC )
            // InternalTexDsl.g:1106:2: RULE_CUBC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMandatoryArgumentAccess().getCUBCTerminalRuleCall_3()); 
            }
            match(input,RULE_CUBC,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMandatoryArgumentAccess().getCUBCTerminalRuleCall_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MandatoryArgument__Group__3__Impl"


    // $ANTLR start "rule__Codeblock__Group__0"
    // InternalTexDsl.g:1116:1: rule__Codeblock__Group__0 : rule__Codeblock__Group__0__Impl rule__Codeblock__Group__1 ;
    public final void rule__Codeblock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1120:1: ( rule__Codeblock__Group__0__Impl rule__Codeblock__Group__1 )
            // InternalTexDsl.g:1121:2: rule__Codeblock__Group__0__Impl rule__Codeblock__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__Codeblock__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Codeblock__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Codeblock__Group__0"


    // $ANTLR start "rule__Codeblock__Group__0__Impl"
    // InternalTexDsl.g:1128:1: rule__Codeblock__Group__0__Impl : ( RULE_BS ) ;
    public final void rule__Codeblock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1132:1: ( ( RULE_BS ) )
            // InternalTexDsl.g:1133:1: ( RULE_BS )
            {
            // InternalTexDsl.g:1133:1: ( RULE_BS )
            // InternalTexDsl.g:1134:2: RULE_BS
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCodeblockAccess().getBSTerminalRuleCall_0()); 
            }
            match(input,RULE_BS,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCodeblockAccess().getBSTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Codeblock__Group__0__Impl"


    // $ANTLR start "rule__Codeblock__Group__1"
    // InternalTexDsl.g:1143:1: rule__Codeblock__Group__1 : rule__Codeblock__Group__1__Impl rule__Codeblock__Group__2 ;
    public final void rule__Codeblock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1147:1: ( rule__Codeblock__Group__1__Impl rule__Codeblock__Group__2 )
            // InternalTexDsl.g:1148:2: rule__Codeblock__Group__1__Impl rule__Codeblock__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__Codeblock__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Codeblock__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Codeblock__Group__1"


    // $ANTLR start "rule__Codeblock__Group__1__Impl"
    // InternalTexDsl.g:1155:1: rule__Codeblock__Group__1__Impl : ( ( 'begin{codeblock}' ) ) ;
    public final void rule__Codeblock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1159:1: ( ( ( 'begin{codeblock}' ) ) )
            // InternalTexDsl.g:1160:1: ( ( 'begin{codeblock}' ) )
            {
            // InternalTexDsl.g:1160:1: ( ( 'begin{codeblock}' ) )
            // InternalTexDsl.g:1161:2: ( 'begin{codeblock}' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCodeblockAccess().getBeginCodeblockKeyword_1()); 
            }
            // InternalTexDsl.g:1162:2: ( 'begin{codeblock}' )
            // InternalTexDsl.g:1162:3: 'begin{codeblock}'
            {
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCodeblockAccess().getBeginCodeblockKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Codeblock__Group__1__Impl"


    // $ANTLR start "rule__Codeblock__Group__2"
    // InternalTexDsl.g:1170:1: rule__Codeblock__Group__2 : rule__Codeblock__Group__2__Impl rule__Codeblock__Group__3 ;
    public final void rule__Codeblock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1174:1: ( rule__Codeblock__Group__2__Impl rule__Codeblock__Group__3 )
            // InternalTexDsl.g:1175:2: rule__Codeblock__Group__2__Impl rule__Codeblock__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__Codeblock__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Codeblock__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Codeblock__Group__2"


    // $ANTLR start "rule__Codeblock__Group__2__Impl"
    // InternalTexDsl.g:1182:1: rule__Codeblock__Group__2__Impl : ( ( rule__Codeblock__ContentAssignment_2 ) ) ;
    public final void rule__Codeblock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1186:1: ( ( ( rule__Codeblock__ContentAssignment_2 ) ) )
            // InternalTexDsl.g:1187:1: ( ( rule__Codeblock__ContentAssignment_2 ) )
            {
            // InternalTexDsl.g:1187:1: ( ( rule__Codeblock__ContentAssignment_2 ) )
            // InternalTexDsl.g:1188:2: ( rule__Codeblock__ContentAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCodeblockAccess().getContentAssignment_2()); 
            }
            // InternalTexDsl.g:1189:2: ( rule__Codeblock__ContentAssignment_2 )
            // InternalTexDsl.g:1189:3: rule__Codeblock__ContentAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Codeblock__ContentAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCodeblockAccess().getContentAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Codeblock__Group__2__Impl"


    // $ANTLR start "rule__Codeblock__Group__3"
    // InternalTexDsl.g:1197:1: rule__Codeblock__Group__3 : rule__Codeblock__Group__3__Impl rule__Codeblock__Group__4 ;
    public final void rule__Codeblock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1201:1: ( rule__Codeblock__Group__3__Impl rule__Codeblock__Group__4 )
            // InternalTexDsl.g:1202:2: rule__Codeblock__Group__3__Impl rule__Codeblock__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__Codeblock__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Codeblock__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Codeblock__Group__3"


    // $ANTLR start "rule__Codeblock__Group__3__Impl"
    // InternalTexDsl.g:1209:1: rule__Codeblock__Group__3__Impl : ( RULE_BS ) ;
    public final void rule__Codeblock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1213:1: ( ( RULE_BS ) )
            // InternalTexDsl.g:1214:1: ( RULE_BS )
            {
            // InternalTexDsl.g:1214:1: ( RULE_BS )
            // InternalTexDsl.g:1215:2: RULE_BS
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCodeblockAccess().getBSTerminalRuleCall_3()); 
            }
            match(input,RULE_BS,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCodeblockAccess().getBSTerminalRuleCall_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Codeblock__Group__3__Impl"


    // $ANTLR start "rule__Codeblock__Group__4"
    // InternalTexDsl.g:1224:1: rule__Codeblock__Group__4 : rule__Codeblock__Group__4__Impl ;
    public final void rule__Codeblock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1228:1: ( rule__Codeblock__Group__4__Impl )
            // InternalTexDsl.g:1229:2: rule__Codeblock__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Codeblock__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Codeblock__Group__4"


    // $ANTLR start "rule__Codeblock__Group__4__Impl"
    // InternalTexDsl.g:1235:1: rule__Codeblock__Group__4__Impl : ( ( 'end{codeblock}' ) ) ;
    public final void rule__Codeblock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1239:1: ( ( ( 'end{codeblock}' ) ) )
            // InternalTexDsl.g:1240:1: ( ( 'end{codeblock}' ) )
            {
            // InternalTexDsl.g:1240:1: ( ( 'end{codeblock}' ) )
            // InternalTexDsl.g:1241:2: ( 'end{codeblock}' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCodeblockAccess().getEndCodeblockKeyword_4()); 
            }
            // InternalTexDsl.g:1242:2: ( 'end{codeblock}' )
            // InternalTexDsl.g:1242:3: 'end{codeblock}'
            {
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCodeblockAccess().getEndCodeblockKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Codeblock__Group__4__Impl"


    // $ANTLR start "rule__CodeblockContent__Group__0"
    // InternalTexDsl.g:1251:1: rule__CodeblockContent__Group__0 : rule__CodeblockContent__Group__0__Impl rule__CodeblockContent__Group__1 ;
    public final void rule__CodeblockContent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1255:1: ( rule__CodeblockContent__Group__0__Impl rule__CodeblockContent__Group__1 )
            // InternalTexDsl.g:1256:2: rule__CodeblockContent__Group__0__Impl rule__CodeblockContent__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__CodeblockContent__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CodeblockContent__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodeblockContent__Group__0"


    // $ANTLR start "rule__CodeblockContent__Group__0__Impl"
    // InternalTexDsl.g:1263:1: rule__CodeblockContent__Group__0__Impl : ( () ) ;
    public final void rule__CodeblockContent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1267:1: ( ( () ) )
            // InternalTexDsl.g:1268:1: ( () )
            {
            // InternalTexDsl.g:1268:1: ( () )
            // InternalTexDsl.g:1269:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCodeblockContentAccess().getCodeblockContentAction_0()); 
            }
            // InternalTexDsl.g:1270:2: ()
            // InternalTexDsl.g:1270:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCodeblockContentAccess().getCodeblockContentAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodeblockContent__Group__0__Impl"


    // $ANTLR start "rule__CodeblockContent__Group__1"
    // InternalTexDsl.g:1278:1: rule__CodeblockContent__Group__1 : rule__CodeblockContent__Group__1__Impl ;
    public final void rule__CodeblockContent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1282:1: ( rule__CodeblockContent__Group__1__Impl )
            // InternalTexDsl.g:1283:2: rule__CodeblockContent__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CodeblockContent__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodeblockContent__Group__1"


    // $ANTLR start "rule__CodeblockContent__Group__1__Impl"
    // InternalTexDsl.g:1289:1: rule__CodeblockContent__Group__1__Impl : ( ( rule__CodeblockContent__ElementsAssignment_1 )* ) ;
    public final void rule__CodeblockContent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1293:1: ( ( ( rule__CodeblockContent__ElementsAssignment_1 )* ) )
            // InternalTexDsl.g:1294:1: ( ( rule__CodeblockContent__ElementsAssignment_1 )* )
            {
            // InternalTexDsl.g:1294:1: ( ( rule__CodeblockContent__ElementsAssignment_1 )* )
            // InternalTexDsl.g:1295:2: ( rule__CodeblockContent__ElementsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCodeblockContentAccess().getElementsAssignment_1()); 
            }
            // InternalTexDsl.g:1296:2: ( rule__CodeblockContent__ElementsAssignment_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_BS) ) {
                    int LA16_2 = input.LA(2);

                    if ( (LA16_2==EOF||(LA16_2>=RULE_ID && LA16_2<=RULE_BS)) ) {
                        alt16=1;
                    }


                }
                else if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_CUBC)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalTexDsl.g:1296:3: rule__CodeblockContent__ElementsAssignment_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_18);
            	    rule__CodeblockContent__ElementsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCodeblockContentAccess().getElementsAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodeblockContent__Group__1__Impl"


    // $ANTLR start "rule__CodeblockElement__Group_0__0"
    // InternalTexDsl.g:1305:1: rule__CodeblockElement__Group_0__0 : rule__CodeblockElement__Group_0__0__Impl rule__CodeblockElement__Group_0__1 ;
    public final void rule__CodeblockElement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1309:1: ( rule__CodeblockElement__Group_0__0__Impl rule__CodeblockElement__Group_0__1 )
            // InternalTexDsl.g:1310:2: rule__CodeblockElement__Group_0__0__Impl rule__CodeblockElement__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__CodeblockElement__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CodeblockElement__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodeblockElement__Group_0__0"


    // $ANTLR start "rule__CodeblockElement__Group_0__0__Impl"
    // InternalTexDsl.g:1317:1: rule__CodeblockElement__Group_0__0__Impl : ( () ) ;
    public final void rule__CodeblockElement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1321:1: ( ( () ) )
            // InternalTexDsl.g:1322:1: ( () )
            {
            // InternalTexDsl.g:1322:1: ( () )
            // InternalTexDsl.g:1323:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCodeblockElementAccess().getCodeblockElementAction_0_0()); 
            }
            // InternalTexDsl.g:1324:2: ()
            // InternalTexDsl.g:1324:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCodeblockElementAccess().getCodeblockElementAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodeblockElement__Group_0__0__Impl"


    // $ANTLR start "rule__CodeblockElement__Group_0__1"
    // InternalTexDsl.g:1332:1: rule__CodeblockElement__Group_0__1 : rule__CodeblockElement__Group_0__1__Impl ;
    public final void rule__CodeblockElement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1336:1: ( rule__CodeblockElement__Group_0__1__Impl )
            // InternalTexDsl.g:1337:2: rule__CodeblockElement__Group_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CodeblockElement__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodeblockElement__Group_0__1"


    // $ANTLR start "rule__CodeblockElement__Group_0__1__Impl"
    // InternalTexDsl.g:1343:1: rule__CodeblockElement__Group_0__1__Impl : ( ruleAnyToken ) ;
    public final void rule__CodeblockElement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1347:1: ( ( ruleAnyToken ) )
            // InternalTexDsl.g:1348:1: ( ruleAnyToken )
            {
            // InternalTexDsl.g:1348:1: ( ruleAnyToken )
            // InternalTexDsl.g:1349:2: ruleAnyToken
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCodeblockElementAccess().getAnyTokenParserRuleCall_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAnyToken();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCodeblockElementAccess().getAnyTokenParserRuleCall_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodeblockElement__Group_0__1__Impl"


    // $ANTLR start "rule__InlineMath__Group__0"
    // InternalTexDsl.g:1359:1: rule__InlineMath__Group__0 : rule__InlineMath__Group__0__Impl rule__InlineMath__Group__1 ;
    public final void rule__InlineMath__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1363:1: ( rule__InlineMath__Group__0__Impl rule__InlineMath__Group__1 )
            // InternalTexDsl.g:1364:2: rule__InlineMath__Group__0__Impl rule__InlineMath__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__InlineMath__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InlineMath__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InlineMath__Group__0"


    // $ANTLR start "rule__InlineMath__Group__0__Impl"
    // InternalTexDsl.g:1371:1: rule__InlineMath__Group__0__Impl : ( () ) ;
    public final void rule__InlineMath__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1375:1: ( ( () ) )
            // InternalTexDsl.g:1376:1: ( () )
            {
            // InternalTexDsl.g:1376:1: ( () )
            // InternalTexDsl.g:1377:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInlineMathAccess().getInlineMathAction_0()); 
            }
            // InternalTexDsl.g:1378:2: ()
            // InternalTexDsl.g:1378:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInlineMathAccess().getInlineMathAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InlineMath__Group__0__Impl"


    // $ANTLR start "rule__InlineMath__Group__1"
    // InternalTexDsl.g:1386:1: rule__InlineMath__Group__1 : rule__InlineMath__Group__1__Impl rule__InlineMath__Group__2 ;
    public final void rule__InlineMath__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1390:1: ( rule__InlineMath__Group__1__Impl rule__InlineMath__Group__2 )
            // InternalTexDsl.g:1391:2: rule__InlineMath__Group__1__Impl rule__InlineMath__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__InlineMath__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InlineMath__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InlineMath__Group__1"


    // $ANTLR start "rule__InlineMath__Group__1__Impl"
    // InternalTexDsl.g:1398:1: rule__InlineMath__Group__1__Impl : ( '$' ) ;
    public final void rule__InlineMath__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1402:1: ( ( '$' ) )
            // InternalTexDsl.g:1403:1: ( '$' )
            {
            // InternalTexDsl.g:1403:1: ( '$' )
            // InternalTexDsl.g:1404:2: '$'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInlineMathAccess().getDollarSignKeyword_1()); 
            }
            match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInlineMathAccess().getDollarSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InlineMath__Group__1__Impl"


    // $ANTLR start "rule__InlineMath__Group__2"
    // InternalTexDsl.g:1413:1: rule__InlineMath__Group__2 : rule__InlineMath__Group__2__Impl rule__InlineMath__Group__3 ;
    public final void rule__InlineMath__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1417:1: ( rule__InlineMath__Group__2__Impl rule__InlineMath__Group__3 )
            // InternalTexDsl.g:1418:2: rule__InlineMath__Group__2__Impl rule__InlineMath__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__InlineMath__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InlineMath__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InlineMath__Group__2"


    // $ANTLR start "rule__InlineMath__Group__2__Impl"
    // InternalTexDsl.g:1425:1: rule__InlineMath__Group__2__Impl : ( ( rule__InlineMath__ContentAssignment_2 )* ) ;
    public final void rule__InlineMath__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1429:1: ( ( ( rule__InlineMath__ContentAssignment_2 )* ) )
            // InternalTexDsl.g:1430:1: ( ( rule__InlineMath__ContentAssignment_2 )* )
            {
            // InternalTexDsl.g:1430:1: ( ( rule__InlineMath__ContentAssignment_2 )* )
            // InternalTexDsl.g:1431:2: ( rule__InlineMath__ContentAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInlineMathAccess().getContentAssignment_2()); 
            }
            // InternalTexDsl.g:1432:2: ( rule__InlineMath__ContentAssignment_2 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_ID && LA17_0<=RULE_SQBO)||LA17_0==RULE_CUBO||LA17_0==RULE_BS) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalTexDsl.g:1432:3: rule__InlineMath__ContentAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_21);
            	    rule__InlineMath__ContentAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInlineMathAccess().getContentAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InlineMath__Group__2__Impl"


    // $ANTLR start "rule__InlineMath__Group__3"
    // InternalTexDsl.g:1440:1: rule__InlineMath__Group__3 : rule__InlineMath__Group__3__Impl ;
    public final void rule__InlineMath__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1444:1: ( rule__InlineMath__Group__3__Impl )
            // InternalTexDsl.g:1445:2: rule__InlineMath__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InlineMath__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InlineMath__Group__3"


    // $ANTLR start "rule__InlineMath__Group__3__Impl"
    // InternalTexDsl.g:1451:1: rule__InlineMath__Group__3__Impl : ( '$' ) ;
    public final void rule__InlineMath__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1455:1: ( ( '$' ) )
            // InternalTexDsl.g:1456:1: ( '$' )
            {
            // InternalTexDsl.g:1456:1: ( '$' )
            // InternalTexDsl.g:1457:2: '$'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInlineMathAccess().getDollarSignKeyword_3()); 
            }
            match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInlineMathAccess().getDollarSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InlineMath__Group__3__Impl"


    // $ANTLR start "rule__DisplayMath__Group__0"
    // InternalTexDsl.g:1467:1: rule__DisplayMath__Group__0 : rule__DisplayMath__Group__0__Impl rule__DisplayMath__Group__1 ;
    public final void rule__DisplayMath__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1471:1: ( rule__DisplayMath__Group__0__Impl rule__DisplayMath__Group__1 )
            // InternalTexDsl.g:1472:2: rule__DisplayMath__Group__0__Impl rule__DisplayMath__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__DisplayMath__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DisplayMath__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DisplayMath__Group__0"


    // $ANTLR start "rule__DisplayMath__Group__0__Impl"
    // InternalTexDsl.g:1479:1: rule__DisplayMath__Group__0__Impl : ( () ) ;
    public final void rule__DisplayMath__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1483:1: ( ( () ) )
            // InternalTexDsl.g:1484:1: ( () )
            {
            // InternalTexDsl.g:1484:1: ( () )
            // InternalTexDsl.g:1485:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisplayMathAccess().getDisplayMathAction_0()); 
            }
            // InternalTexDsl.g:1486:2: ()
            // InternalTexDsl.g:1486:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisplayMathAccess().getDisplayMathAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DisplayMath__Group__0__Impl"


    // $ANTLR start "rule__DisplayMath__Group__1"
    // InternalTexDsl.g:1494:1: rule__DisplayMath__Group__1 : rule__DisplayMath__Group__1__Impl rule__DisplayMath__Group__2 ;
    public final void rule__DisplayMath__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1498:1: ( rule__DisplayMath__Group__1__Impl rule__DisplayMath__Group__2 )
            // InternalTexDsl.g:1499:2: rule__DisplayMath__Group__1__Impl rule__DisplayMath__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__DisplayMath__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DisplayMath__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DisplayMath__Group__1"


    // $ANTLR start "rule__DisplayMath__Group__1__Impl"
    // InternalTexDsl.g:1506:1: rule__DisplayMath__Group__1__Impl : ( '$$' ) ;
    public final void rule__DisplayMath__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1510:1: ( ( '$$' ) )
            // InternalTexDsl.g:1511:1: ( '$$' )
            {
            // InternalTexDsl.g:1511:1: ( '$$' )
            // InternalTexDsl.g:1512:2: '$$'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisplayMathAccess().getDollarSignDollarSignKeyword_1()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisplayMathAccess().getDollarSignDollarSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DisplayMath__Group__1__Impl"


    // $ANTLR start "rule__DisplayMath__Group__2"
    // InternalTexDsl.g:1521:1: rule__DisplayMath__Group__2 : rule__DisplayMath__Group__2__Impl rule__DisplayMath__Group__3 ;
    public final void rule__DisplayMath__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1525:1: ( rule__DisplayMath__Group__2__Impl rule__DisplayMath__Group__3 )
            // InternalTexDsl.g:1526:2: rule__DisplayMath__Group__2__Impl rule__DisplayMath__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__DisplayMath__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DisplayMath__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DisplayMath__Group__2"

}

@SuppressWarnings("all")
abstract class InternalTexDslParser3 extends InternalTexDslParser2 {

        InternalTexDslParser3(TokenStream input) {
            this(input, new RecognizerSharedState());
        }

        InternalTexDslParser3(TokenStream input, RecognizerSharedState state) {
            super(input, state);
        }

    // $ANTLR start "rule__DisplayMath__Group__2__Impl"
    // InternalTexDsl.g:1533:1: rule__DisplayMath__Group__2__Impl : ( ( rule__DisplayMath__ContentAssignment_2 )* ) ;
    public final void rule__DisplayMath__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1537:1: ( ( ( rule__DisplayMath__ContentAssignment_2 )* ) )
            // InternalTexDsl.g:1538:1: ( ( rule__DisplayMath__ContentAssignment_2 )* )
            {
            // InternalTexDsl.g:1538:1: ( ( rule__DisplayMath__ContentAssignment_2 )* )
            // InternalTexDsl.g:1539:2: ( rule__DisplayMath__ContentAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisplayMathAccess().getContentAssignment_2()); 
            }
            // InternalTexDsl.g:1540:2: ( rule__DisplayMath__ContentAssignment_2 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RULE_ID && LA18_0<=RULE_SQBO)||LA18_0==RULE_CUBO||LA18_0==RULE_BS) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalTexDsl.g:1540:3: rule__DisplayMath__ContentAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_21);
            	    rule__DisplayMath__ContentAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisplayMathAccess().getContentAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DisplayMath__Group__2__Impl"


    // $ANTLR start "rule__DisplayMath__Group__3"
    // InternalTexDsl.g:1548:1: rule__DisplayMath__Group__3 : rule__DisplayMath__Group__3__Impl ;
    public final void rule__DisplayMath__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1552:1: ( rule__DisplayMath__Group__3__Impl )
            // InternalTexDsl.g:1553:2: rule__DisplayMath__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DisplayMath__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DisplayMath__Group__3"


    // $ANTLR start "rule__DisplayMath__Group__3__Impl"
    // InternalTexDsl.g:1559:1: rule__DisplayMath__Group__3__Impl : ( '$$' ) ;
    public final void rule__DisplayMath__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1563:1: ( ( '$$' ) )
            // InternalTexDsl.g:1564:1: ( '$$' )
            {
            // InternalTexDsl.g:1564:1: ( '$$' )
            // InternalTexDsl.g:1565:2: '$$'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisplayMathAccess().getDollarSignDollarSignKeyword_3()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisplayMathAccess().getDollarSignDollarSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DisplayMath__Group__3__Impl"


    // $ANTLR start "rule__Model__ElementsAssignment"
    // InternalTexDsl.g:1575:1: rule__Model__ElementsAssignment : ( ruleElement ) ;
    public final void rule__Model__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1579:1: ( ( ruleElement ) )
            // InternalTexDsl.g:1580:2: ( ruleElement )
            {
            // InternalTexDsl.g:1580:2: ( ruleElement )
            // InternalTexDsl.g:1581:3: ruleElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getElementsElementParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getElementsElementParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ElementsAssignment"


    // $ANTLR start "rule__Command__CommandAssignment_1"
    // InternalTexDsl.g:1590:1: rule__Command__CommandAssignment_1 : ( RULE_ID ) ;
    public final void rule__Command__CommandAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1594:1: ( ( RULE_ID ) )
            // InternalTexDsl.g:1595:2: ( RULE_ID )
            {
            // InternalTexDsl.g:1595:2: ( RULE_ID )
            // InternalTexDsl.g:1596:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getCommandIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getCommandIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__CommandAssignment_1"


    // $ANTLR start "rule__Command__OptionalArgsAssignment_2"
    // InternalTexDsl.g:1605:1: rule__Command__OptionalArgsAssignment_2 : ( ruleOptionalArgument ) ;
    public final void rule__Command__OptionalArgsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1609:1: ( ( ruleOptionalArgument ) )
            // InternalTexDsl.g:1610:2: ( ruleOptionalArgument )
            {
            // InternalTexDsl.g:1610:2: ( ruleOptionalArgument )
            // InternalTexDsl.g:1611:3: ruleOptionalArgument
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getOptionalArgsOptionalArgumentParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleOptionalArgument();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getOptionalArgsOptionalArgumentParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__OptionalArgsAssignment_2"


    // $ANTLR start "rule__Command__MandatoryArgsAssignment_3"
    // InternalTexDsl.g:1620:1: rule__Command__MandatoryArgsAssignment_3 : ( ruleMandatoryArgument ) ;
    public final void rule__Command__MandatoryArgsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1624:1: ( ( ruleMandatoryArgument ) )
            // InternalTexDsl.g:1625:2: ( ruleMandatoryArgument )
            {
            // InternalTexDsl.g:1625:2: ( ruleMandatoryArgument )
            // InternalTexDsl.g:1626:3: ruleMandatoryArgument
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getMandatoryArgsMandatoryArgumentParserRuleCall_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleMandatoryArgument();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getMandatoryArgsMandatoryArgumentParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__MandatoryArgsAssignment_3"


    // $ANTLR start "rule__OptionalArgument__ContentAssignment_2"
    // InternalTexDsl.g:1635:1: rule__OptionalArgument__ContentAssignment_2 : ( ruleArgumentContent ) ;
    public final void rule__OptionalArgument__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1639:1: ( ( ruleArgumentContent ) )
            // InternalTexDsl.g:1640:2: ( ruleArgumentContent )
            {
            // InternalTexDsl.g:1640:2: ( ruleArgumentContent )
            // InternalTexDsl.g:1641:3: ruleArgumentContent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionalArgumentAccess().getContentArgumentContentParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleArgumentContent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOptionalArgumentAccess().getContentArgumentContentParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionalArgument__ContentAssignment_2"


    // $ANTLR start "rule__MandatoryArgument__ContentAssignment_2"
    // InternalTexDsl.g:1650:1: rule__MandatoryArgument__ContentAssignment_2 : ( ruleArgumentContent ) ;
    public final void rule__MandatoryArgument__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1654:1: ( ( ruleArgumentContent ) )
            // InternalTexDsl.g:1655:2: ( ruleArgumentContent )
            {
            // InternalTexDsl.g:1655:2: ( ruleArgumentContent )
            // InternalTexDsl.g:1656:3: ruleArgumentContent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMandatoryArgumentAccess().getContentArgumentContentParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleArgumentContent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMandatoryArgumentAccess().getContentArgumentContentParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MandatoryArgument__ContentAssignment_2"


    // $ANTLR start "rule__Codeblock__ContentAssignment_2"
    // InternalTexDsl.g:1665:1: rule__Codeblock__ContentAssignment_2 : ( ruleCodeblockContent ) ;
    public final void rule__Codeblock__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1669:1: ( ( ruleCodeblockContent ) )
            // InternalTexDsl.g:1670:2: ( ruleCodeblockContent )
            {
            // InternalTexDsl.g:1670:2: ( ruleCodeblockContent )
            // InternalTexDsl.g:1671:3: ruleCodeblockContent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCodeblockAccess().getContentCodeblockContentParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleCodeblockContent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCodeblockAccess().getContentCodeblockContentParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Codeblock__ContentAssignment_2"


    // $ANTLR start "rule__CodeblockContent__ElementsAssignment_1"
    // InternalTexDsl.g:1680:1: rule__CodeblockContent__ElementsAssignment_1 : ( ruleCodeblockElement ) ;
    public final void rule__CodeblockContent__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1684:1: ( ( ruleCodeblockElement ) )
            // InternalTexDsl.g:1685:2: ( ruleCodeblockElement )
            {
            // InternalTexDsl.g:1685:2: ( ruleCodeblockElement )
            // InternalTexDsl.g:1686:3: ruleCodeblockElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCodeblockContentAccess().getElementsCodeblockElementParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleCodeblockElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCodeblockContentAccess().getElementsCodeblockElementParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodeblockContent__ElementsAssignment_1"


    // $ANTLR start "rule__TextContainer__TextAssignment"
    // InternalTexDsl.g:1695:1: rule__TextContainer__TextAssignment : ( RULE_TEXT ) ;
    public final void rule__TextContainer__TextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1699:1: ( ( RULE_TEXT ) )
            // InternalTexDsl.g:1700:2: ( RULE_TEXT )
            {
            // InternalTexDsl.g:1700:2: ( RULE_TEXT )
            // InternalTexDsl.g:1701:3: RULE_TEXT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextContainerAccess().getTextTEXTTerminalRuleCall_0()); 
            }
            match(input,RULE_TEXT,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextContainerAccess().getTextTEXTTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextContainer__TextAssignment"


    // $ANTLR start "rule__Identifiers__IdAssignment"
    // InternalTexDsl.g:1710:1: rule__Identifiers__IdAssignment : ( RULE_ID ) ;
    public final void rule__Identifiers__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1714:1: ( ( RULE_ID ) )
            // InternalTexDsl.g:1715:2: ( RULE_ID )
            {
            // InternalTexDsl.g:1715:2: ( RULE_ID )
            // InternalTexDsl.g:1716:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifiersAccess().getIdIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentifiersAccess().getIdIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifiers__IdAssignment"


    // $ANTLR start "rule__Numbers__NumAssignment"
    // InternalTexDsl.g:1725:1: rule__Numbers__NumAssignment : ( RULE_NUMBER ) ;
    public final void rule__Numbers__NumAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1729:1: ( ( RULE_NUMBER ) )
            // InternalTexDsl.g:1730:2: ( RULE_NUMBER )
            {
            // InternalTexDsl.g:1730:2: ( RULE_NUMBER )
            // InternalTexDsl.g:1731:3: RULE_NUMBER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumbersAccess().getNumNUMBERTerminalRuleCall_0()); 
            }
            match(input,RULE_NUMBER,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumbersAccess().getNumNUMBERTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Numbers__NumAssignment"


    // $ANTLR start "rule__Operators__OpAssignment"
    // InternalTexDsl.g:1740:1: rule__Operators__OpAssignment : ( RULE_SYMBOL ) ;
    public final void rule__Operators__OpAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1744:1: ( ( RULE_SYMBOL ) )
            // InternalTexDsl.g:1745:2: ( RULE_SYMBOL )
            {
            // InternalTexDsl.g:1745:2: ( RULE_SYMBOL )
            // InternalTexDsl.g:1746:3: RULE_SYMBOL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorsAccess().getOpSYMBOLTerminalRuleCall_0()); 
            }
            match(input,RULE_SYMBOL,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorsAccess().getOpSYMBOLTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operators__OpAssignment"


    // $ANTLR start "rule__InlineMath__ContentAssignment_2"
    // InternalTexDsl.g:1755:1: rule__InlineMath__ContentAssignment_2 : ( ruleMathContent ) ;
    public final void rule__InlineMath__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1759:1: ( ( ruleMathContent ) )
            // InternalTexDsl.g:1760:2: ( ruleMathContent )
            {
            // InternalTexDsl.g:1760:2: ( ruleMathContent )
            // InternalTexDsl.g:1761:3: ruleMathContent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInlineMathAccess().getContentMathContentParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleMathContent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInlineMathAccess().getContentMathContentParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InlineMath__ContentAssignment_2"


    // $ANTLR start "rule__DisplayMath__ContentAssignment_2"
    // InternalTexDsl.g:1770:1: rule__DisplayMath__ContentAssignment_2 : ( ruleMathContent ) ;
    public final void rule__DisplayMath__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1774:1: ( ( ruleMathContent ) )
            // InternalTexDsl.g:1775:2: ( ruleMathContent )
            {
            // InternalTexDsl.g:1775:2: ( ruleMathContent )
            // InternalTexDsl.g:1776:3: ruleMathContent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisplayMathAccess().getContentMathContentParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleMathContent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisplayMathAccess().getContentMathContentParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DisplayMath__ContentAssignment_2"

    // $ANTLR start synpred2_InternalTexDsl
    public final void synpred2_InternalTexDsl_fragment() throws RecognitionException {   
        // InternalTexDsl.g:326:5: ( rule__TextContainer__TextAssignment )
        // InternalTexDsl.g:326:5: rule__TextContainer__TextAssignment
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__TextContainer__TextAssignment();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalTexDsl

    // $ANTLR start synpred3_InternalTexDsl
    public final void synpred3_InternalTexDsl_fragment() throws RecognitionException {   
        // InternalTexDsl.g:433:5: ( rule__Operators__OpAssignment )
        // InternalTexDsl.g:433:5: rule__Operators__OpAssignment
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__Operators__OpAssignment();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalTexDsl

    // $ANTLR start synpred7_InternalTexDsl
    public final void synpred7_InternalTexDsl_fragment() throws RecognitionException {   
        // InternalTexDsl.g:580:2: ( ( ( rule__CodeblockElement__Group_0__0 ) ) )
        // InternalTexDsl.g:580:2: ( ( rule__CodeblockElement__Group_0__0 ) )
        {
        // InternalTexDsl.g:580:2: ( ( rule__CodeblockElement__Group_0__0 ) )
        // InternalTexDsl.g:581:3: ( rule__CodeblockElement__Group_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getCodeblockElementAccess().getGroup_0()); 
        }
        // InternalTexDsl.g:582:3: ( rule__CodeblockElement__Group_0__0 )
        // InternalTexDsl.g:582:4: rule__CodeblockElement__Group_0__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__CodeblockElement__Group_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred7_InternalTexDsl

    // $ANTLR start synpred16_InternalTexDsl
    public final void synpred16_InternalTexDsl_fragment() throws RecognitionException {   
        // InternalTexDsl.g:657:5: ( RULE_BS )
        // InternalTexDsl.g:657:5: RULE_BS
        {
        match(input,RULE_BS,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_InternalTexDsl

    // $ANTLR start synpred26_InternalTexDsl
    public final void synpred26_InternalTexDsl_fragment() throws RecognitionException {   
        // InternalTexDsl.g:770:2: ( ( ruleTextContent ) )
        // InternalTexDsl.g:770:2: ( ruleTextContent )
        {
        // InternalTexDsl.g:770:2: ( ruleTextContent )
        // InternalTexDsl.g:771:3: ruleTextContent
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getMathContentAccess().getTextContentParserRuleCall_1()); 
        }
        pushFollow(FollowSets000.FOLLOW_2);
        ruleTextContent();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred26_InternalTexDsl

    // $ANTLR start synpred27_InternalTexDsl
    public final void synpred27_InternalTexDsl_fragment() throws RecognitionException {   
        // InternalTexDsl.g:776:2: ( ( ruleNumbers ) )
        // InternalTexDsl.g:776:2: ( ruleNumbers )
        {
        // InternalTexDsl.g:776:2: ( ruleNumbers )
        // InternalTexDsl.g:777:3: ruleNumbers
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getMathContentAccess().getNumbersParserRuleCall_2()); 
        }
        pushFollow(FollowSets000.FOLLOW_2);
        ruleNumbers();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred27_InternalTexDsl

    // $ANTLR start synpred28_InternalTexDsl
    public final void synpred28_InternalTexDsl_fragment() throws RecognitionException {   
        // InternalTexDsl.g:865:3: ( rule__Command__OptionalArgsAssignment_2 )
        // InternalTexDsl.g:865:3: rule__Command__OptionalArgsAssignment_2
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__Command__OptionalArgsAssignment_2();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_InternalTexDsl

    // $ANTLR start synpred29_InternalTexDsl
    public final void synpred29_InternalTexDsl_fragment() throws RecognitionException {   
        // InternalTexDsl.g:891:3: ( rule__Command__MandatoryArgsAssignment_3 )
        // InternalTexDsl.g:891:3: rule__Command__MandatoryArgsAssignment_3
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__Command__MandatoryArgsAssignment_3();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_InternalTexDsl

}

@SuppressWarnings("all")
public class InternalTexDslParser extends InternalTexDslParser3 {



        public InternalTexDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTexDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        


}
