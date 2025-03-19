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
     void entryRuleEnvironment() throws RecognitionException;
     void ruleEnvironment() throws RecognitionException;
     void entryRuleArgumentContent() throws RecognitionException;
     void ruleArgumentContent() throws RecognitionException;
     void entryRuleTextContent() throws RecognitionException;
     void ruleTextContent() throws RecognitionException;
     void entryRuleMathExpression() throws RecognitionException;
     void ruleMathExpression() throws RecognitionException;
     void entryRuleInlineMath() throws RecognitionException;
     void ruleInlineMath() throws RecognitionException;
     void entryRuleDisplayMath() throws RecognitionException;
     void ruleDisplayMath() throws RecognitionException;
     void entryRuleMathContent() throws RecognitionException;
     void ruleMathContent() throws RecognitionException;
     void rule__Element__Alternatives() throws RecognitionException;
     void rule__ArgumentContent__Alternatives() throws RecognitionException;
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
     void rule__MandatoryArgument__Group__0() throws RecognitionException;
     void rule__MandatoryArgument__Group__0__Impl() throws RecognitionException;
     void rule__MandatoryArgument__Group__1() throws RecognitionException;
     void rule__MandatoryArgument__Group__1__Impl() throws RecognitionException;
     void rule__MandatoryArgument__Group__2() throws RecognitionException;
     void rule__MandatoryArgument__Group__2__Impl() throws RecognitionException;
     void rule__Environment__Group__0() throws RecognitionException;
     void rule__Environment__Group__0__Impl() throws RecognitionException;
     void rule__Environment__Group__1() throws RecognitionException;
     void rule__Environment__Group__1__Impl() throws RecognitionException;
     void rule__Environment__Group__2() throws RecognitionException;
     void rule__Environment__Group__2__Impl() throws RecognitionException;
     void rule__Environment__Group__3() throws RecognitionException;
     void rule__Environment__Group__3__Impl() throws RecognitionException;
     void rule__Environment__Group__4() throws RecognitionException;
     void rule__Environment__Group__4__Impl() throws RecognitionException;
     void rule__Environment__Group__5() throws RecognitionException;
     void rule__Environment__Group__5__Impl() throws RecognitionException;
     void rule__Environment__Group__6() throws RecognitionException;
     void rule__Environment__Group__6__Impl() throws RecognitionException;
     void rule__TextContent__Group__0() throws RecognitionException;
     void rule__TextContent__Group__0__Impl() throws RecognitionException;
     void rule__TextContent__Group__1() throws RecognitionException;
     void rule__TextContent__Group__1__Impl() throws RecognitionException;
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
     void rule__MathContent__Group_1__0() throws RecognitionException;
     void rule__MathContent__Group_1__0__Impl() throws RecognitionException;
     void rule__MathContent__Group_1__1() throws RecognitionException;
     void rule__MathContent__Group_1__1__Impl() throws RecognitionException;
     void rule__MathContent__Group_2__0() throws RecognitionException;
     void rule__MathContent__Group_2__0__Impl() throws RecognitionException;
     void rule__MathContent__Group_2__1() throws RecognitionException;
     void rule__MathContent__Group_2__1__Impl() throws RecognitionException;
     void rule__MathContent__Group_3__0() throws RecognitionException;
     void rule__MathContent__Group_3__0__Impl() throws RecognitionException;
     void rule__MathContent__Group_3__1() throws RecognitionException;
     void rule__MathContent__Group_3__1__Impl() throws RecognitionException;
     void rule__Model__ElementsAssignment() throws RecognitionException;
     void rule__Command__NameAssignment_1() throws RecognitionException;
     void rule__Command__OptionalArgsAssignment_2() throws RecognitionException;
     void rule__Command__MandatoryArgsAssignment_3() throws RecognitionException;
     void rule__OptionalArgument__ContentAssignment_1() throws RecognitionException;
     void rule__MandatoryArgument__ContentAssignment_1() throws RecognitionException;
     void rule__Environment__TypeAssignment_1() throws RecognitionException;
     void rule__Environment__ContentAssignment_3() throws RecognitionException;
     void rule__Environment__EndTypeAssignment_5() throws RecognitionException;
     void rule__TextContent__TextAssignment_1() throws RecognitionException;
     void rule__InlineMath__ContentAssignment_2() throws RecognitionException;
     void rule__DisplayMath__ContentAssignment_2() throws RecognitionException;
     void synpred1_InternalTexDsl_fragment() throws RecognitionException;   
     void synpred2_InternalTexDsl_fragment() throws RecognitionException;   
     void synpred3_InternalTexDsl_fragment() throws RecognitionException;   
     void synpred4_InternalTexDsl_fragment() throws RecognitionException;   
     void synpred5_InternalTexDsl_fragment() throws RecognitionException;   
     void synpred6_InternalTexDsl_fragment() throws RecognitionException;   
     void synpred7_InternalTexDsl_fragment() throws RecognitionException;   
     void synpred14_InternalTexDsl_fragment() throws RecognitionException;   
     void synpred15_InternalTexDsl_fragment() throws RecognitionException;   
     void synpred16_InternalTexDsl_fragment() throws RecognitionException;   
     void synpred17_InternalTexDsl_fragment() throws RecognitionException;   
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_TEXT", "RULE_NUMBER", "RULE_SYMBOL", "RULE_ID", "RULE_INT", "RULE_SL_COMMENT", "RULE_WS", "RULE_END", "'\\\\'", "'['", "']'", "'{'", "'}'", "'\\\\begin{'", "'\\\\end{'", "'$'", "'$$'"
    };
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
    public static final int RULE_ID=7;
    public static final int RULE_WS=10;
    public static final int RULE_NUMBER=5;
    public static final int RULE_INT=8;
    public static final int RULE_TEXT=4;
    public static final int RULE_SYMBOL=6;
    public static final int T__20=20;


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
    public final boolean synpred15_InternalTexDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalTexDsl_fragment(); // can never throw exception
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
    public final boolean synpred17_InternalTexDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalTexDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalTexDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalTexDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalTexDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalTexDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalTexDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalTexDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalTexDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalTexDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalTexDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalTexDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    
    protected static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000001A1012L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000001A1010L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000001E1010L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000081070L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000001072L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000101070L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000001070L});
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

                if ( (LA1_0==EOF) ) {
                    int LA1_1 = input.LA(2);

                    if ( (synpred1_InternalTexDsl()) ) {
                        alt1=1;
                    }


                }
                else if ( (LA1_0==RULE_TEXT||LA1_0==12||LA1_0==17||(LA1_0>=19 && LA1_0<=20)) ) {
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


    // $ANTLR start "entryRuleEnvironment"
    // InternalTexDsl.g:179:1: entryRuleEnvironment : ruleEnvironment EOF ;
    public final void entryRuleEnvironment() throws RecognitionException {
        try {
            // InternalTexDsl.g:180:1: ( ruleEnvironment EOF )
            // InternalTexDsl.g:181:1: ruleEnvironment EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvironmentRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEnvironment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvironmentRule()); 
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
    // $ANTLR end "entryRuleEnvironment"


    // $ANTLR start "ruleEnvironment"
    // InternalTexDsl.g:188:1: ruleEnvironment : ( ( rule__Environment__Group__0 ) ) ;
    public final void ruleEnvironment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:192:2: ( ( ( rule__Environment__Group__0 ) ) )
            // InternalTexDsl.g:193:2: ( ( rule__Environment__Group__0 ) )
            {
            // InternalTexDsl.g:193:2: ( ( rule__Environment__Group__0 ) )
            // InternalTexDsl.g:194:3: ( rule__Environment__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvironmentAccess().getGroup()); 
            }
            // InternalTexDsl.g:195:3: ( rule__Environment__Group__0 )
            // InternalTexDsl.g:195:4: rule__Environment__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Environment__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvironmentAccess().getGroup()); 
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
    // $ANTLR end "ruleEnvironment"


    // $ANTLR start "entryRuleArgumentContent"
    // InternalTexDsl.g:204:1: entryRuleArgumentContent : ruleArgumentContent EOF ;
    public final void entryRuleArgumentContent() throws RecognitionException {
        try {
            // InternalTexDsl.g:205:1: ( ruleArgumentContent EOF )
            // InternalTexDsl.g:206:1: ruleArgumentContent EOF
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
    // InternalTexDsl.g:213:1: ruleArgumentContent : ( ( rule__ArgumentContent__Alternatives ) ) ;
    public final void ruleArgumentContent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:217:2: ( ( ( rule__ArgumentContent__Alternatives ) ) )
            // InternalTexDsl.g:218:2: ( ( rule__ArgumentContent__Alternatives ) )
            {
            // InternalTexDsl.g:218:2: ( ( rule__ArgumentContent__Alternatives ) )
            // InternalTexDsl.g:219:3: ( rule__ArgumentContent__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArgumentContentAccess().getAlternatives()); 
            }
            // InternalTexDsl.g:220:3: ( rule__ArgumentContent__Alternatives )
            // InternalTexDsl.g:220:4: rule__ArgumentContent__Alternatives
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


    // $ANTLR start "entryRuleTextContent"
    // InternalTexDsl.g:229:1: entryRuleTextContent : ruleTextContent EOF ;
    public final void entryRuleTextContent() throws RecognitionException {
        try {
            // InternalTexDsl.g:230:1: ( ruleTextContent EOF )
            // InternalTexDsl.g:231:1: ruleTextContent EOF
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
    // InternalTexDsl.g:238:1: ruleTextContent : ( ( rule__TextContent__Group__0 ) ) ;
    public final void ruleTextContent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:242:2: ( ( ( rule__TextContent__Group__0 ) ) )
            // InternalTexDsl.g:243:2: ( ( rule__TextContent__Group__0 ) )
            {
            // InternalTexDsl.g:243:2: ( ( rule__TextContent__Group__0 ) )
            // InternalTexDsl.g:244:3: ( rule__TextContent__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextContentAccess().getGroup()); 
            }
            // InternalTexDsl.g:245:3: ( rule__TextContent__Group__0 )
            // InternalTexDsl.g:245:4: rule__TextContent__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TextContent__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextContentAccess().getGroup()); 
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


    // $ANTLR start "entryRuleMathExpression"
    // InternalTexDsl.g:254:1: entryRuleMathExpression : ruleMathExpression EOF ;
    public final void entryRuleMathExpression() throws RecognitionException {
        try {
            // InternalTexDsl.g:255:1: ( ruleMathExpression EOF )
            // InternalTexDsl.g:256:1: ruleMathExpression EOF
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
    // InternalTexDsl.g:263:1: ruleMathExpression : ( ( rule__MathExpression__Alternatives ) ) ;
    public final void ruleMathExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:267:2: ( ( ( rule__MathExpression__Alternatives ) ) )
            // InternalTexDsl.g:268:2: ( ( rule__MathExpression__Alternatives ) )
            {
            // InternalTexDsl.g:268:2: ( ( rule__MathExpression__Alternatives ) )
            // InternalTexDsl.g:269:3: ( rule__MathExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMathExpressionAccess().getAlternatives()); 
            }
            // InternalTexDsl.g:270:3: ( rule__MathExpression__Alternatives )
            // InternalTexDsl.g:270:4: rule__MathExpression__Alternatives
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
    // InternalTexDsl.g:279:1: entryRuleInlineMath : ruleInlineMath EOF ;
    public final void entryRuleInlineMath() throws RecognitionException {
        try {
            // InternalTexDsl.g:280:1: ( ruleInlineMath EOF )
            // InternalTexDsl.g:281:1: ruleInlineMath EOF
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
    // InternalTexDsl.g:288:1: ruleInlineMath : ( ( rule__InlineMath__Group__0 ) ) ;
    public final void ruleInlineMath() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:292:2: ( ( ( rule__InlineMath__Group__0 ) ) )
            // InternalTexDsl.g:293:2: ( ( rule__InlineMath__Group__0 ) )
            {
            // InternalTexDsl.g:293:2: ( ( rule__InlineMath__Group__0 ) )
            // InternalTexDsl.g:294:3: ( rule__InlineMath__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInlineMathAccess().getGroup()); 
            }
            // InternalTexDsl.g:295:3: ( rule__InlineMath__Group__0 )
            // InternalTexDsl.g:295:4: rule__InlineMath__Group__0
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
    // InternalTexDsl.g:304:1: entryRuleDisplayMath : ruleDisplayMath EOF ;
    public final void entryRuleDisplayMath() throws RecognitionException {
        try {
            // InternalTexDsl.g:305:1: ( ruleDisplayMath EOF )
            // InternalTexDsl.g:306:1: ruleDisplayMath EOF
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
    // InternalTexDsl.g:313:1: ruleDisplayMath : ( ( rule__DisplayMath__Group__0 ) ) ;
    public final void ruleDisplayMath() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:317:2: ( ( ( rule__DisplayMath__Group__0 ) ) )
            // InternalTexDsl.g:318:2: ( ( rule__DisplayMath__Group__0 ) )
            {
            // InternalTexDsl.g:318:2: ( ( rule__DisplayMath__Group__0 ) )
            // InternalTexDsl.g:319:3: ( rule__DisplayMath__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisplayMathAccess().getGroup()); 
            }
            // InternalTexDsl.g:320:3: ( rule__DisplayMath__Group__0 )
            // InternalTexDsl.g:320:4: rule__DisplayMath__Group__0
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
    // InternalTexDsl.g:329:1: entryRuleMathContent : ruleMathContent EOF ;
    public final void entryRuleMathContent() throws RecognitionException {
        try {
            // InternalTexDsl.g:330:1: ( ruleMathContent EOF )
            // InternalTexDsl.g:331:1: ruleMathContent EOF
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
    // InternalTexDsl.g:338:1: ruleMathContent : ( ( rule__MathContent__Alternatives ) ) ;
    public final void ruleMathContent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:342:2: ( ( ( rule__MathContent__Alternatives ) ) )
            // InternalTexDsl.g:343:2: ( ( rule__MathContent__Alternatives ) )
            {
            // InternalTexDsl.g:343:2: ( ( rule__MathContent__Alternatives ) )
            // InternalTexDsl.g:344:3: ( rule__MathContent__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMathContentAccess().getAlternatives()); 
            }
            // InternalTexDsl.g:345:3: ( rule__MathContent__Alternatives )
            // InternalTexDsl.g:345:4: rule__MathContent__Alternatives
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
    // InternalTexDsl.g:353:1: rule__Element__Alternatives : ( ( ruleCommand ) | ( ruleEnvironment ) | ( ruleTextContent ) | ( ruleMathExpression ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:357:1: ( ( ruleCommand ) | ( ruleEnvironment ) | ( ruleTextContent ) | ( ruleMathExpression ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 12:
                {
                int LA2_1 = input.LA(2);

                if ( (synpred2_InternalTexDsl()) ) {
                    alt2=1;
                }
                else if ( (synpred4_InternalTexDsl()) ) {
                    alt2=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case 17:
                {
                int LA2_2 = input.LA(2);

                if ( (synpred3_InternalTexDsl()) ) {
                    alt2=2;
                }
                else if ( (synpred4_InternalTexDsl()) ) {
                    alt2=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
                }
                break;
            case EOF:
            case RULE_TEXT:
            case 18:
                {
                alt2=3;
                }
                break;
            case 19:
                {
                int LA2_4 = input.LA(2);

                if ( (synpred4_InternalTexDsl()) ) {
                    alt2=3;
                }
                else if ( (true) ) {
                    alt2=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 4, input);

                    throw nvae;
                }
                }
                break;
            case 20:
                {
                int LA2_5 = input.LA(2);

                if ( (synpred4_InternalTexDsl()) ) {
                    alt2=3;
                }
                else if ( (true) ) {
                    alt2=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 5, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalTexDsl.g:358:2: ( ruleCommand )
                    {
                    // InternalTexDsl.g:358:2: ( ruleCommand )
                    // InternalTexDsl.g:359:3: ruleCommand
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
                    // InternalTexDsl.g:364:2: ( ruleEnvironment )
                    {
                    // InternalTexDsl.g:364:2: ( ruleEnvironment )
                    // InternalTexDsl.g:365:3: ruleEnvironment
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementAccess().getEnvironmentParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleEnvironment();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElementAccess().getEnvironmentParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTexDsl.g:370:2: ( ruleTextContent )
                    {
                    // InternalTexDsl.g:370:2: ( ruleTextContent )
                    // InternalTexDsl.g:371:3: ruleTextContent
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementAccess().getTextContentParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleTextContent();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElementAccess().getTextContentParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalTexDsl.g:376:2: ( ruleMathExpression )
                    {
                    // InternalTexDsl.g:376:2: ( ruleMathExpression )
                    // InternalTexDsl.g:377:3: ruleMathExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementAccess().getMathExpressionParserRuleCall_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleMathExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElementAccess().getMathExpressionParserRuleCall_3()); 
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


    // $ANTLR start "rule__ArgumentContent__Alternatives"
    // InternalTexDsl.g:386:1: rule__ArgumentContent__Alternatives : ( ( ruleTextContent ) | ( ruleCommand ) | ( ruleMathExpression ) | ( ruleEnvironment ) );
    public final void rule__ArgumentContent__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:390:1: ( ( ruleTextContent ) | ( ruleCommand ) | ( ruleMathExpression ) | ( ruleEnvironment ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case EOF:
            case RULE_TEXT:
            case 14:
            case 16:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                int LA3_2 = input.LA(2);

                if ( (synpred5_InternalTexDsl()) ) {
                    alt3=1;
                }
                else if ( (synpred6_InternalTexDsl()) ) {
                    alt3=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case 19:
                {
                int LA3_3 = input.LA(2);

                if ( (synpred5_InternalTexDsl()) ) {
                    alt3=1;
                }
                else if ( (synpred7_InternalTexDsl()) ) {
                    alt3=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 3, input);

                    throw nvae;
                }
                }
                break;
            case 20:
                {
                int LA3_4 = input.LA(2);

                if ( (synpred5_InternalTexDsl()) ) {
                    alt3=1;
                }
                else if ( (synpred7_InternalTexDsl()) ) {
                    alt3=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 4, input);

                    throw nvae;
                }
                }
                break;
            case 17:
                {
                int LA3_5 = input.LA(2);

                if ( (synpred5_InternalTexDsl()) ) {
                    alt3=1;
                }
                else if ( (true) ) {
                    alt3=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 5, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalTexDsl.g:391:2: ( ruleTextContent )
                    {
                    // InternalTexDsl.g:391:2: ( ruleTextContent )
                    // InternalTexDsl.g:392:3: ruleTextContent
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
                    // InternalTexDsl.g:397:2: ( ruleCommand )
                    {
                    // InternalTexDsl.g:397:2: ( ruleCommand )
                    // InternalTexDsl.g:398:3: ruleCommand
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
                    // InternalTexDsl.g:403:2: ( ruleMathExpression )
                    {
                    // InternalTexDsl.g:403:2: ( ruleMathExpression )
                    // InternalTexDsl.g:404:3: ruleMathExpression
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
                case 4 :
                    // InternalTexDsl.g:409:2: ( ruleEnvironment )
                    {
                    // InternalTexDsl.g:409:2: ( ruleEnvironment )
                    // InternalTexDsl.g:410:3: ruleEnvironment
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getArgumentContentAccess().getEnvironmentParserRuleCall_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleEnvironment();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getArgumentContentAccess().getEnvironmentParserRuleCall_3()); 
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


    // $ANTLR start "rule__MathExpression__Alternatives"
    // InternalTexDsl.g:419:1: rule__MathExpression__Alternatives : ( ( ruleInlineMath ) | ( ruleDisplayMath ) );
    public final void rule__MathExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:423:1: ( ( ruleInlineMath ) | ( ruleDisplayMath ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            else if ( (LA4_0==20) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalTexDsl.g:424:2: ( ruleInlineMath )
                    {
                    // InternalTexDsl.g:424:2: ( ruleInlineMath )
                    // InternalTexDsl.g:425:3: ruleInlineMath
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
                    // InternalTexDsl.g:430:2: ( ruleDisplayMath )
                    {
                    // InternalTexDsl.g:430:2: ( ruleDisplayMath )
                    // InternalTexDsl.g:431:3: ruleDisplayMath
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
    // InternalTexDsl.g:440:1: rule__MathContent__Alternatives : ( ( ruleCommand ) | ( ( rule__MathContent__Group_1__0 ) ) | ( ( rule__MathContent__Group_2__0 ) ) | ( ( rule__MathContent__Group_3__0 ) ) );
    public final void rule__MathContent__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:444:1: ( ( ruleCommand ) | ( ( rule__MathContent__Group_1__0 ) ) | ( ( rule__MathContent__Group_2__0 ) ) | ( ( rule__MathContent__Group_3__0 ) ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt5=1;
                }
                break;
            case RULE_TEXT:
                {
                alt5=2;
                }
                break;
            case RULE_NUMBER:
                {
                alt5=3;
                }
                break;
            case RULE_SYMBOL:
                {
                alt5=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalTexDsl.g:445:2: ( ruleCommand )
                    {
                    // InternalTexDsl.g:445:2: ( ruleCommand )
                    // InternalTexDsl.g:446:3: ruleCommand
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
                    // InternalTexDsl.g:451:2: ( ( rule__MathContent__Group_1__0 ) )
                    {
                    // InternalTexDsl.g:451:2: ( ( rule__MathContent__Group_1__0 ) )
                    // InternalTexDsl.g:452:3: ( rule__MathContent__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMathContentAccess().getGroup_1()); 
                    }
                    // InternalTexDsl.g:453:3: ( rule__MathContent__Group_1__0 )
                    // InternalTexDsl.g:453:4: rule__MathContent__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__MathContent__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMathContentAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTexDsl.g:457:2: ( ( rule__MathContent__Group_2__0 ) )
                    {
                    // InternalTexDsl.g:457:2: ( ( rule__MathContent__Group_2__0 ) )
                    // InternalTexDsl.g:458:3: ( rule__MathContent__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMathContentAccess().getGroup_2()); 
                    }
                    // InternalTexDsl.g:459:3: ( rule__MathContent__Group_2__0 )
                    // InternalTexDsl.g:459:4: rule__MathContent__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__MathContent__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMathContentAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalTexDsl.g:463:2: ( ( rule__MathContent__Group_3__0 ) )
                    {
                    // InternalTexDsl.g:463:2: ( ( rule__MathContent__Group_3__0 ) )
                    // InternalTexDsl.g:464:3: ( rule__MathContent__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMathContentAccess().getGroup_3()); 
                    }
                    // InternalTexDsl.g:465:3: ( rule__MathContent__Group_3__0 )
                    // InternalTexDsl.g:465:4: rule__MathContent__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__MathContent__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMathContentAccess().getGroup_3()); 
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
    // InternalTexDsl.g:473:1: rule__Command__Group__0 : rule__Command__Group__0__Impl rule__Command__Group__1 ;
    public final void rule__Command__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:477:1: ( rule__Command__Group__0__Impl rule__Command__Group__1 )
            // InternalTexDsl.g:478:2: rule__Command__Group__0__Impl rule__Command__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_4);
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
    // InternalTexDsl.g:485:1: rule__Command__Group__0__Impl : ( '\\\\' ) ;
    public final void rule__Command__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:489:1: ( ( '\\\\' ) )
            // InternalTexDsl.g:490:1: ( '\\\\' )
            {
            // InternalTexDsl.g:490:1: ( '\\\\' )
            // InternalTexDsl.g:491:2: '\\\\'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getBackslashKeyword_0()); 
            }
            match(input,12,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getBackslashKeyword_0()); 
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
    // InternalTexDsl.g:500:1: rule__Command__Group__1 : rule__Command__Group__1__Impl rule__Command__Group__2 ;
    public final void rule__Command__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:504:1: ( rule__Command__Group__1__Impl rule__Command__Group__2 )
            // InternalTexDsl.g:505:2: rule__Command__Group__1__Impl rule__Command__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_5);
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
    // InternalTexDsl.g:512:1: rule__Command__Group__1__Impl : ( ( rule__Command__NameAssignment_1 ) ) ;
    public final void rule__Command__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:516:1: ( ( ( rule__Command__NameAssignment_1 ) ) )
            // InternalTexDsl.g:517:1: ( ( rule__Command__NameAssignment_1 ) )
            {
            // InternalTexDsl.g:517:1: ( ( rule__Command__NameAssignment_1 ) )
            // InternalTexDsl.g:518:2: ( rule__Command__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getNameAssignment_1()); 
            }
            // InternalTexDsl.g:519:2: ( rule__Command__NameAssignment_1 )
            // InternalTexDsl.g:519:3: rule__Command__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Command__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getNameAssignment_1()); 
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
    // InternalTexDsl.g:527:1: rule__Command__Group__2 : rule__Command__Group__2__Impl rule__Command__Group__3 ;
    public final void rule__Command__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:531:1: ( rule__Command__Group__2__Impl rule__Command__Group__3 )
            // InternalTexDsl.g:532:2: rule__Command__Group__2__Impl rule__Command__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
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
    // InternalTexDsl.g:539:1: rule__Command__Group__2__Impl : ( ( rule__Command__OptionalArgsAssignment_2 )* ) ;
    public final void rule__Command__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:543:1: ( ( ( rule__Command__OptionalArgsAssignment_2 )* ) )
            // InternalTexDsl.g:544:1: ( ( rule__Command__OptionalArgsAssignment_2 )* )
            {
            // InternalTexDsl.g:544:1: ( ( rule__Command__OptionalArgsAssignment_2 )* )
            // InternalTexDsl.g:545:2: ( rule__Command__OptionalArgsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getOptionalArgsAssignment_2()); 
            }
            // InternalTexDsl.g:546:2: ( rule__Command__OptionalArgsAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==13) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalTexDsl.g:546:3: rule__Command__OptionalArgsAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    rule__Command__OptionalArgsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalTexDsl.g:554:1: rule__Command__Group__3 : rule__Command__Group__3__Impl ;
    public final void rule__Command__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:558:1: ( rule__Command__Group__3__Impl )
            // InternalTexDsl.g:559:2: rule__Command__Group__3__Impl
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
    // InternalTexDsl.g:565:1: rule__Command__Group__3__Impl : ( ( rule__Command__MandatoryArgsAssignment_3 )* ) ;
    public final void rule__Command__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:569:1: ( ( ( rule__Command__MandatoryArgsAssignment_3 )* ) )
            // InternalTexDsl.g:570:1: ( ( rule__Command__MandatoryArgsAssignment_3 )* )
            {
            // InternalTexDsl.g:570:1: ( ( rule__Command__MandatoryArgsAssignment_3 )* )
            // InternalTexDsl.g:571:2: ( rule__Command__MandatoryArgsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getMandatoryArgsAssignment_3()); 
            }
            // InternalTexDsl.g:572:2: ( rule__Command__MandatoryArgsAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalTexDsl.g:572:3: rule__Command__MandatoryArgsAssignment_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_7);
            	    rule__Command__MandatoryArgsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalTexDsl.g:581:1: rule__OptionalArgument__Group__0 : rule__OptionalArgument__Group__0__Impl rule__OptionalArgument__Group__1 ;
    public final void rule__OptionalArgument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:585:1: ( rule__OptionalArgument__Group__0__Impl rule__OptionalArgument__Group__1 )
            // InternalTexDsl.g:586:2: rule__OptionalArgument__Group__0__Impl rule__OptionalArgument__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
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
    // InternalTexDsl.g:593:1: rule__OptionalArgument__Group__0__Impl : ( '[' ) ;
    public final void rule__OptionalArgument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:597:1: ( ( '[' ) )
            // InternalTexDsl.g:598:1: ( '[' )
            {
            // InternalTexDsl.g:598:1: ( '[' )
            // InternalTexDsl.g:599:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionalArgumentAccess().getLeftSquareBracketKeyword_0()); 
            }
            match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOptionalArgumentAccess().getLeftSquareBracketKeyword_0()); 
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
    // $ANTLR end "rule__OptionalArgument__Group__0__Impl"


    // $ANTLR start "rule__OptionalArgument__Group__1"
    // InternalTexDsl.g:608:1: rule__OptionalArgument__Group__1 : rule__OptionalArgument__Group__1__Impl rule__OptionalArgument__Group__2 ;
    public final void rule__OptionalArgument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:612:1: ( rule__OptionalArgument__Group__1__Impl rule__OptionalArgument__Group__2 )
            // InternalTexDsl.g:613:2: rule__OptionalArgument__Group__1__Impl rule__OptionalArgument__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_9);
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
    // InternalTexDsl.g:620:1: rule__OptionalArgument__Group__1__Impl : ( ( ( rule__OptionalArgument__ContentAssignment_1 ) ) ( ( rule__OptionalArgument__ContentAssignment_1 )* ) ) ;
    public final void rule__OptionalArgument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:624:1: ( ( ( ( rule__OptionalArgument__ContentAssignment_1 ) ) ( ( rule__OptionalArgument__ContentAssignment_1 )* ) ) )
            // InternalTexDsl.g:625:1: ( ( ( rule__OptionalArgument__ContentAssignment_1 ) ) ( ( rule__OptionalArgument__ContentAssignment_1 )* ) )
            {
            // InternalTexDsl.g:625:1: ( ( ( rule__OptionalArgument__ContentAssignment_1 ) ) ( ( rule__OptionalArgument__ContentAssignment_1 )* ) )
            // InternalTexDsl.g:626:2: ( ( rule__OptionalArgument__ContentAssignment_1 ) ) ( ( rule__OptionalArgument__ContentAssignment_1 )* )
            {
            // InternalTexDsl.g:626:2: ( ( rule__OptionalArgument__ContentAssignment_1 ) )
            // InternalTexDsl.g:627:3: ( rule__OptionalArgument__ContentAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionalArgumentAccess().getContentAssignment_1()); 
            }
            // InternalTexDsl.g:628:3: ( rule__OptionalArgument__ContentAssignment_1 )
            // InternalTexDsl.g:628:4: rule__OptionalArgument__ContentAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__OptionalArgument__ContentAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOptionalArgumentAccess().getContentAssignment_1()); 
            }

            }

            // InternalTexDsl.g:631:2: ( ( rule__OptionalArgument__ContentAssignment_1 )* )
            // InternalTexDsl.g:632:3: ( rule__OptionalArgument__ContentAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionalArgumentAccess().getContentAssignment_1()); 
            }
            // InternalTexDsl.g:633:3: ( rule__OptionalArgument__ContentAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==14) ) {
                    int LA8_1 = input.LA(2);

                    if ( (synpred14_InternalTexDsl()) ) {
                        alt8=1;
                    }


                }
                else if ( (LA8_0==RULE_TEXT||LA8_0==12||LA8_0==17||(LA8_0>=19 && LA8_0<=20)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalTexDsl.g:633:4: rule__OptionalArgument__ContentAssignment_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_3);
            	    rule__OptionalArgument__ContentAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOptionalArgumentAccess().getContentAssignment_1()); 
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
    // $ANTLR end "rule__OptionalArgument__Group__1__Impl"


    // $ANTLR start "rule__OptionalArgument__Group__2"
    // InternalTexDsl.g:642:1: rule__OptionalArgument__Group__2 : rule__OptionalArgument__Group__2__Impl ;
    public final void rule__OptionalArgument__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:646:1: ( rule__OptionalArgument__Group__2__Impl )
            // InternalTexDsl.g:647:2: rule__OptionalArgument__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OptionalArgument__Group__2__Impl();

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
    // InternalTexDsl.g:653:1: rule__OptionalArgument__Group__2__Impl : ( ']' ) ;
    public final void rule__OptionalArgument__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:657:1: ( ( ']' ) )
            // InternalTexDsl.g:658:1: ( ']' )
            {
            // InternalTexDsl.g:658:1: ( ']' )
            // InternalTexDsl.g:659:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionalArgumentAccess().getRightSquareBracketKeyword_2()); 
            }
            match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOptionalArgumentAccess().getRightSquareBracketKeyword_2()); 
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


    // $ANTLR start "rule__MandatoryArgument__Group__0"
    // InternalTexDsl.g:669:1: rule__MandatoryArgument__Group__0 : rule__MandatoryArgument__Group__0__Impl rule__MandatoryArgument__Group__1 ;
    public final void rule__MandatoryArgument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:673:1: ( rule__MandatoryArgument__Group__0__Impl rule__MandatoryArgument__Group__1 )
            // InternalTexDsl.g:674:2: rule__MandatoryArgument__Group__0__Impl rule__MandatoryArgument__Group__1
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
    // InternalTexDsl.g:681:1: rule__MandatoryArgument__Group__0__Impl : ( '{' ) ;
    public final void rule__MandatoryArgument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:685:1: ( ( '{' ) )
            // InternalTexDsl.g:686:1: ( '{' )
            {
            // InternalTexDsl.g:686:1: ( '{' )
            // InternalTexDsl.g:687:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMandatoryArgumentAccess().getLeftCurlyBracketKeyword_0()); 
            }
            match(input,15,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMandatoryArgumentAccess().getLeftCurlyBracketKeyword_0()); 
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
    // $ANTLR end "rule__MandatoryArgument__Group__0__Impl"


    // $ANTLR start "rule__MandatoryArgument__Group__1"
    // InternalTexDsl.g:696:1: rule__MandatoryArgument__Group__1 : rule__MandatoryArgument__Group__1__Impl rule__MandatoryArgument__Group__2 ;
    public final void rule__MandatoryArgument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:700:1: ( rule__MandatoryArgument__Group__1__Impl rule__MandatoryArgument__Group__2 )
            // InternalTexDsl.g:701:2: rule__MandatoryArgument__Group__1__Impl rule__MandatoryArgument__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_10);
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
    // InternalTexDsl.g:708:1: rule__MandatoryArgument__Group__1__Impl : ( ( ( rule__MandatoryArgument__ContentAssignment_1 ) ) ( ( rule__MandatoryArgument__ContentAssignment_1 )* ) ) ;
    public final void rule__MandatoryArgument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:712:1: ( ( ( ( rule__MandatoryArgument__ContentAssignment_1 ) ) ( ( rule__MandatoryArgument__ContentAssignment_1 )* ) ) )
            // InternalTexDsl.g:713:1: ( ( ( rule__MandatoryArgument__ContentAssignment_1 ) ) ( ( rule__MandatoryArgument__ContentAssignment_1 )* ) )
            {
            // InternalTexDsl.g:713:1: ( ( ( rule__MandatoryArgument__ContentAssignment_1 ) ) ( ( rule__MandatoryArgument__ContentAssignment_1 )* ) )
            // InternalTexDsl.g:714:2: ( ( rule__MandatoryArgument__ContentAssignment_1 ) ) ( ( rule__MandatoryArgument__ContentAssignment_1 )* )
            {
            // InternalTexDsl.g:714:2: ( ( rule__MandatoryArgument__ContentAssignment_1 ) )
            // InternalTexDsl.g:715:3: ( rule__MandatoryArgument__ContentAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMandatoryArgumentAccess().getContentAssignment_1()); 
            }
            // InternalTexDsl.g:716:3: ( rule__MandatoryArgument__ContentAssignment_1 )
            // InternalTexDsl.g:716:4: rule__MandatoryArgument__ContentAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__MandatoryArgument__ContentAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMandatoryArgumentAccess().getContentAssignment_1()); 
            }

            }

            // InternalTexDsl.g:719:2: ( ( rule__MandatoryArgument__ContentAssignment_1 )* )
            // InternalTexDsl.g:720:3: ( rule__MandatoryArgument__ContentAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMandatoryArgumentAccess().getContentAssignment_1()); 
            }
            // InternalTexDsl.g:721:3: ( rule__MandatoryArgument__ContentAssignment_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==16) ) {
                    int LA9_1 = input.LA(2);

                    if ( (synpred15_InternalTexDsl()) ) {
                        alt9=1;
                    }


                }
                else if ( (LA9_0==RULE_TEXT||LA9_0==12||LA9_0==17||(LA9_0>=19 && LA9_0<=20)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalTexDsl.g:721:4: rule__MandatoryArgument__ContentAssignment_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_3);
            	    rule__MandatoryArgument__ContentAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMandatoryArgumentAccess().getContentAssignment_1()); 
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
    // $ANTLR end "rule__MandatoryArgument__Group__1__Impl"


    // $ANTLR start "rule__MandatoryArgument__Group__2"
    // InternalTexDsl.g:730:1: rule__MandatoryArgument__Group__2 : rule__MandatoryArgument__Group__2__Impl ;
    public final void rule__MandatoryArgument__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:734:1: ( rule__MandatoryArgument__Group__2__Impl )
            // InternalTexDsl.g:735:2: rule__MandatoryArgument__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MandatoryArgument__Group__2__Impl();

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
    // InternalTexDsl.g:741:1: rule__MandatoryArgument__Group__2__Impl : ( '}' ) ;
    public final void rule__MandatoryArgument__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:745:1: ( ( '}' ) )
            // InternalTexDsl.g:746:1: ( '}' )
            {
            // InternalTexDsl.g:746:1: ( '}' )
            // InternalTexDsl.g:747:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMandatoryArgumentAccess().getRightCurlyBracketKeyword_2()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMandatoryArgumentAccess().getRightCurlyBracketKeyword_2()); 
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


    // $ANTLR start "rule__Environment__Group__0"
    // InternalTexDsl.g:757:1: rule__Environment__Group__0 : rule__Environment__Group__0__Impl rule__Environment__Group__1 ;
    public final void rule__Environment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:761:1: ( rule__Environment__Group__0__Impl rule__Environment__Group__1 )
            // InternalTexDsl.g:762:2: rule__Environment__Group__0__Impl rule__Environment__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__Environment__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Environment__Group__1();

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
    // $ANTLR end "rule__Environment__Group__0"


    // $ANTLR start "rule__Environment__Group__0__Impl"
    // InternalTexDsl.g:769:1: rule__Environment__Group__0__Impl : ( '\\\\begin{' ) ;
    public final void rule__Environment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:773:1: ( ( '\\\\begin{' ) )
            // InternalTexDsl.g:774:1: ( '\\\\begin{' )
            {
            // InternalTexDsl.g:774:1: ( '\\\\begin{' )
            // InternalTexDsl.g:775:2: '\\\\begin{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvironmentAccess().getBeginKeyword_0()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvironmentAccess().getBeginKeyword_0()); 
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
    // $ANTLR end "rule__Environment__Group__0__Impl"


    // $ANTLR start "rule__Environment__Group__1"
    // InternalTexDsl.g:784:1: rule__Environment__Group__1 : rule__Environment__Group__1__Impl rule__Environment__Group__2 ;
    public final void rule__Environment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:788:1: ( rule__Environment__Group__1__Impl rule__Environment__Group__2 )
            // InternalTexDsl.g:789:2: rule__Environment__Group__1__Impl rule__Environment__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__Environment__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Environment__Group__2();

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
    // $ANTLR end "rule__Environment__Group__1"


    // $ANTLR start "rule__Environment__Group__1__Impl"
    // InternalTexDsl.g:796:1: rule__Environment__Group__1__Impl : ( ( rule__Environment__TypeAssignment_1 ) ) ;
    public final void rule__Environment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:800:1: ( ( ( rule__Environment__TypeAssignment_1 ) ) )
            // InternalTexDsl.g:801:1: ( ( rule__Environment__TypeAssignment_1 ) )
            {
            // InternalTexDsl.g:801:1: ( ( rule__Environment__TypeAssignment_1 ) )
            // InternalTexDsl.g:802:2: ( rule__Environment__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvironmentAccess().getTypeAssignment_1()); 
            }
            // InternalTexDsl.g:803:2: ( rule__Environment__TypeAssignment_1 )
            // InternalTexDsl.g:803:3: rule__Environment__TypeAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Environment__TypeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvironmentAccess().getTypeAssignment_1()); 
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
    // $ANTLR end "rule__Environment__Group__1__Impl"


    // $ANTLR start "rule__Environment__Group__2"
    // InternalTexDsl.g:811:1: rule__Environment__Group__2 : rule__Environment__Group__2__Impl rule__Environment__Group__3 ;
    public final void rule__Environment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:815:1: ( rule__Environment__Group__2__Impl rule__Environment__Group__3 )
            // InternalTexDsl.g:816:2: rule__Environment__Group__2__Impl rule__Environment__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__Environment__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Environment__Group__3();

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
    // $ANTLR end "rule__Environment__Group__2"


    // $ANTLR start "rule__Environment__Group__2__Impl"
    // InternalTexDsl.g:823:1: rule__Environment__Group__2__Impl : ( '}' ) ;
    public final void rule__Environment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:827:1: ( ( '}' ) )
            // InternalTexDsl.g:828:1: ( '}' )
            {
            // InternalTexDsl.g:828:1: ( '}' )
            // InternalTexDsl.g:829:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_2()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_2()); 
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
    // $ANTLR end "rule__Environment__Group__2__Impl"


    // $ANTLR start "rule__Environment__Group__3"
    // InternalTexDsl.g:838:1: rule__Environment__Group__3 : rule__Environment__Group__3__Impl rule__Environment__Group__4 ;
    public final void rule__Environment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:842:1: ( rule__Environment__Group__3__Impl rule__Environment__Group__4 )
            // InternalTexDsl.g:843:2: rule__Environment__Group__3__Impl rule__Environment__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__Environment__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Environment__Group__4();

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
    // $ANTLR end "rule__Environment__Group__3"


    // $ANTLR start "rule__Environment__Group__3__Impl"
    // InternalTexDsl.g:850:1: rule__Environment__Group__3__Impl : ( ( rule__Environment__ContentAssignment_3 )* ) ;
    public final void rule__Environment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:854:1: ( ( ( rule__Environment__ContentAssignment_3 )* ) )
            // InternalTexDsl.g:855:1: ( ( rule__Environment__ContentAssignment_3 )* )
            {
            // InternalTexDsl.g:855:1: ( ( rule__Environment__ContentAssignment_3 )* )
            // InternalTexDsl.g:856:2: ( rule__Environment__ContentAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvironmentAccess().getContentAssignment_3()); 
            }
            // InternalTexDsl.g:857:2: ( rule__Environment__ContentAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==18) ) {
                    int LA10_1 = input.LA(2);

                    if ( (synpred16_InternalTexDsl()) ) {
                        alt10=1;
                    }


                }
                else if ( (LA10_0==RULE_TEXT||LA10_0==12||LA10_0==17||(LA10_0>=19 && LA10_0<=20)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalTexDsl.g:857:3: rule__Environment__ContentAssignment_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_3);
            	    rule__Environment__ContentAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvironmentAccess().getContentAssignment_3()); 
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
    // $ANTLR end "rule__Environment__Group__3__Impl"


    // $ANTLR start "rule__Environment__Group__4"
    // InternalTexDsl.g:865:1: rule__Environment__Group__4 : rule__Environment__Group__4__Impl rule__Environment__Group__5 ;
    public final void rule__Environment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:869:1: ( rule__Environment__Group__4__Impl rule__Environment__Group__5 )
            // InternalTexDsl.g:870:2: rule__Environment__Group__4__Impl rule__Environment__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__Environment__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Environment__Group__5();

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
    // $ANTLR end "rule__Environment__Group__4"


    // $ANTLR start "rule__Environment__Group__4__Impl"
    // InternalTexDsl.g:877:1: rule__Environment__Group__4__Impl : ( '\\\\end{' ) ;
    public final void rule__Environment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:881:1: ( ( '\\\\end{' ) )
            // InternalTexDsl.g:882:1: ( '\\\\end{' )
            {
            // InternalTexDsl.g:882:1: ( '\\\\end{' )
            // InternalTexDsl.g:883:2: '\\\\end{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvironmentAccess().getEndKeyword_4()); 
            }
            match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvironmentAccess().getEndKeyword_4()); 
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
    // $ANTLR end "rule__Environment__Group__4__Impl"


    // $ANTLR start "rule__Environment__Group__5"
    // InternalTexDsl.g:892:1: rule__Environment__Group__5 : rule__Environment__Group__5__Impl rule__Environment__Group__6 ;
    public final void rule__Environment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:896:1: ( rule__Environment__Group__5__Impl rule__Environment__Group__6 )
            // InternalTexDsl.g:897:2: rule__Environment__Group__5__Impl rule__Environment__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__Environment__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Environment__Group__6();

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
    // $ANTLR end "rule__Environment__Group__5"


    // $ANTLR start "rule__Environment__Group__5__Impl"
    // InternalTexDsl.g:904:1: rule__Environment__Group__5__Impl : ( ( rule__Environment__EndTypeAssignment_5 ) ) ;
    public final void rule__Environment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:908:1: ( ( ( rule__Environment__EndTypeAssignment_5 ) ) )
            // InternalTexDsl.g:909:1: ( ( rule__Environment__EndTypeAssignment_5 ) )
            {
            // InternalTexDsl.g:909:1: ( ( rule__Environment__EndTypeAssignment_5 ) )
            // InternalTexDsl.g:910:2: ( rule__Environment__EndTypeAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvironmentAccess().getEndTypeAssignment_5()); 
            }
            // InternalTexDsl.g:911:2: ( rule__Environment__EndTypeAssignment_5 )
            // InternalTexDsl.g:911:3: rule__Environment__EndTypeAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Environment__EndTypeAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvironmentAccess().getEndTypeAssignment_5()); 
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
    // $ANTLR end "rule__Environment__Group__5__Impl"


    // $ANTLR start "rule__Environment__Group__6"
    // InternalTexDsl.g:919:1: rule__Environment__Group__6 : rule__Environment__Group__6__Impl ;
    public final void rule__Environment__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:923:1: ( rule__Environment__Group__6__Impl )
            // InternalTexDsl.g:924:2: rule__Environment__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Environment__Group__6__Impl();

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
    // $ANTLR end "rule__Environment__Group__6"


    // $ANTLR start "rule__Environment__Group__6__Impl"
    // InternalTexDsl.g:930:1: rule__Environment__Group__6__Impl : ( '}' ) ;
    public final void rule__Environment__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:934:1: ( ( '}' ) )
            // InternalTexDsl.g:935:1: ( '}' )
            {
            // InternalTexDsl.g:935:1: ( '}' )
            // InternalTexDsl.g:936:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_6()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_6()); 
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
    // $ANTLR end "rule__Environment__Group__6__Impl"


    // $ANTLR start "rule__TextContent__Group__0"
    // InternalTexDsl.g:946:1: rule__TextContent__Group__0 : rule__TextContent__Group__0__Impl rule__TextContent__Group__1 ;
    public final void rule__TextContent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:950:1: ( rule__TextContent__Group__0__Impl rule__TextContent__Group__1 )
            // InternalTexDsl.g:951:2: rule__TextContent__Group__0__Impl rule__TextContent__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__TextContent__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TextContent__Group__1();

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
    // $ANTLR end "rule__TextContent__Group__0"


    // $ANTLR start "rule__TextContent__Group__0__Impl"
    // InternalTexDsl.g:958:1: rule__TextContent__Group__0__Impl : ( () ) ;
    public final void rule__TextContent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:962:1: ( ( () ) )
            // InternalTexDsl.g:963:1: ( () )
            {
            // InternalTexDsl.g:963:1: ( () )
            // InternalTexDsl.g:964:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextContentAccess().getTextContentAction_0()); 
            }
            // InternalTexDsl.g:965:2: ()
            // InternalTexDsl.g:965:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextContentAccess().getTextContentAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextContent__Group__0__Impl"


    // $ANTLR start "rule__TextContent__Group__1"
    // InternalTexDsl.g:973:1: rule__TextContent__Group__1 : rule__TextContent__Group__1__Impl ;
    public final void rule__TextContent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:977:1: ( rule__TextContent__Group__1__Impl )
            // InternalTexDsl.g:978:2: rule__TextContent__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TextContent__Group__1__Impl();

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
    // $ANTLR end "rule__TextContent__Group__1"


    // $ANTLR start "rule__TextContent__Group__1__Impl"
    // InternalTexDsl.g:984:1: rule__TextContent__Group__1__Impl : ( ( rule__TextContent__TextAssignment_1 )* ) ;
    public final void rule__TextContent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:988:1: ( ( ( rule__TextContent__TextAssignment_1 )* ) )
            // InternalTexDsl.g:989:1: ( ( rule__TextContent__TextAssignment_1 )* )
            {
            // InternalTexDsl.g:989:1: ( ( rule__TextContent__TextAssignment_1 )* )
            // InternalTexDsl.g:990:2: ( rule__TextContent__TextAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextContentAccess().getTextAssignment_1()); 
            }
            // InternalTexDsl.g:991:2: ( rule__TextContent__TextAssignment_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_TEXT) ) {
                    int LA11_2 = input.LA(2);

                    if ( (synpred17_InternalTexDsl()) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // InternalTexDsl.g:991:3: rule__TextContent__TextAssignment_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_13);
            	    rule__TextContent__TextAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextContentAccess().getTextAssignment_1()); 
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
    // $ANTLR end "rule__TextContent__Group__1__Impl"


    // $ANTLR start "rule__InlineMath__Group__0"
    // InternalTexDsl.g:1000:1: rule__InlineMath__Group__0 : rule__InlineMath__Group__0__Impl rule__InlineMath__Group__1 ;
    public final void rule__InlineMath__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1004:1: ( rule__InlineMath__Group__0__Impl rule__InlineMath__Group__1 )
            // InternalTexDsl.g:1005:2: rule__InlineMath__Group__0__Impl rule__InlineMath__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_14);
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
    // InternalTexDsl.g:1012:1: rule__InlineMath__Group__0__Impl : ( () ) ;
    public final void rule__InlineMath__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1016:1: ( ( () ) )
            // InternalTexDsl.g:1017:1: ( () )
            {
            // InternalTexDsl.g:1017:1: ( () )
            // InternalTexDsl.g:1018:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInlineMathAccess().getInlineMathAction_0()); 
            }
            // InternalTexDsl.g:1019:2: ()
            // InternalTexDsl.g:1019:3: 
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
    // InternalTexDsl.g:1027:1: rule__InlineMath__Group__1 : rule__InlineMath__Group__1__Impl rule__InlineMath__Group__2 ;
    public final void rule__InlineMath__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1031:1: ( rule__InlineMath__Group__1__Impl rule__InlineMath__Group__2 )
            // InternalTexDsl.g:1032:2: rule__InlineMath__Group__1__Impl rule__InlineMath__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_15);
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
    // InternalTexDsl.g:1039:1: rule__InlineMath__Group__1__Impl : ( '$' ) ;
    public final void rule__InlineMath__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1043:1: ( ( '$' ) )
            // InternalTexDsl.g:1044:1: ( '$' )
            {
            // InternalTexDsl.g:1044:1: ( '$' )
            // InternalTexDsl.g:1045:2: '$'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInlineMathAccess().getDollarSignKeyword_1()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalTexDsl.g:1054:1: rule__InlineMath__Group__2 : rule__InlineMath__Group__2__Impl rule__InlineMath__Group__3 ;
    public final void rule__InlineMath__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1058:1: ( rule__InlineMath__Group__2__Impl rule__InlineMath__Group__3 )
            // InternalTexDsl.g:1059:2: rule__InlineMath__Group__2__Impl rule__InlineMath__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_15);
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
    // InternalTexDsl.g:1066:1: rule__InlineMath__Group__2__Impl : ( ( rule__InlineMath__ContentAssignment_2 )* ) ;
    public final void rule__InlineMath__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1070:1: ( ( ( rule__InlineMath__ContentAssignment_2 )* ) )
            // InternalTexDsl.g:1071:1: ( ( rule__InlineMath__ContentAssignment_2 )* )
            {
            // InternalTexDsl.g:1071:1: ( ( rule__InlineMath__ContentAssignment_2 )* )
            // InternalTexDsl.g:1072:2: ( rule__InlineMath__ContentAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInlineMathAccess().getContentAssignment_2()); 
            }
            // InternalTexDsl.g:1073:2: ( rule__InlineMath__ContentAssignment_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_TEXT && LA12_0<=RULE_SYMBOL)||LA12_0==12) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalTexDsl.g:1073:3: rule__InlineMath__ContentAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_16);
            	    rule__InlineMath__ContentAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalTexDsl.g:1081:1: rule__InlineMath__Group__3 : rule__InlineMath__Group__3__Impl ;
    public final void rule__InlineMath__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1085:1: ( rule__InlineMath__Group__3__Impl )
            // InternalTexDsl.g:1086:2: rule__InlineMath__Group__3__Impl
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
    // InternalTexDsl.g:1092:1: rule__InlineMath__Group__3__Impl : ( '$' ) ;
    public final void rule__InlineMath__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1096:1: ( ( '$' ) )
            // InternalTexDsl.g:1097:1: ( '$' )
            {
            // InternalTexDsl.g:1097:1: ( '$' )
            // InternalTexDsl.g:1098:2: '$'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInlineMathAccess().getDollarSignKeyword_3()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalTexDsl.g:1108:1: rule__DisplayMath__Group__0 : rule__DisplayMath__Group__0__Impl rule__DisplayMath__Group__1 ;
    public final void rule__DisplayMath__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1112:1: ( rule__DisplayMath__Group__0__Impl rule__DisplayMath__Group__1 )
            // InternalTexDsl.g:1113:2: rule__DisplayMath__Group__0__Impl rule__DisplayMath__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
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
    // InternalTexDsl.g:1120:1: rule__DisplayMath__Group__0__Impl : ( () ) ;
    public final void rule__DisplayMath__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1124:1: ( ( () ) )
            // InternalTexDsl.g:1125:1: ( () )
            {
            // InternalTexDsl.g:1125:1: ( () )
            // InternalTexDsl.g:1126:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisplayMathAccess().getDisplayMathAction_0()); 
            }
            // InternalTexDsl.g:1127:2: ()
            // InternalTexDsl.g:1127:3: 
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
    // InternalTexDsl.g:1135:1: rule__DisplayMath__Group__1 : rule__DisplayMath__Group__1__Impl rule__DisplayMath__Group__2 ;
    public final void rule__DisplayMath__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1139:1: ( rule__DisplayMath__Group__1__Impl rule__DisplayMath__Group__2 )
            // InternalTexDsl.g:1140:2: rule__DisplayMath__Group__1__Impl rule__DisplayMath__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_17);
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
    // InternalTexDsl.g:1147:1: rule__DisplayMath__Group__1__Impl : ( '$$' ) ;
    public final void rule__DisplayMath__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1151:1: ( ( '$$' ) )
            // InternalTexDsl.g:1152:1: ( '$$' )
            {
            // InternalTexDsl.g:1152:1: ( '$$' )
            // InternalTexDsl.g:1153:2: '$$'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisplayMathAccess().getDollarSignDollarSignKeyword_1()); 
            }
            match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalTexDsl.g:1162:1: rule__DisplayMath__Group__2 : rule__DisplayMath__Group__2__Impl rule__DisplayMath__Group__3 ;
    public final void rule__DisplayMath__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1166:1: ( rule__DisplayMath__Group__2__Impl rule__DisplayMath__Group__3 )
            // InternalTexDsl.g:1167:2: rule__DisplayMath__Group__2__Impl rule__DisplayMath__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_17);
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


    // $ANTLR start "rule__DisplayMath__Group__2__Impl"
    // InternalTexDsl.g:1174:1: rule__DisplayMath__Group__2__Impl : ( ( rule__DisplayMath__ContentAssignment_2 )* ) ;
    public final void rule__DisplayMath__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1178:1: ( ( ( rule__DisplayMath__ContentAssignment_2 )* ) )
            // InternalTexDsl.g:1179:1: ( ( rule__DisplayMath__ContentAssignment_2 )* )
            {
            // InternalTexDsl.g:1179:1: ( ( rule__DisplayMath__ContentAssignment_2 )* )
            // InternalTexDsl.g:1180:2: ( rule__DisplayMath__ContentAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisplayMathAccess().getContentAssignment_2()); 
            }
            // InternalTexDsl.g:1181:2: ( rule__DisplayMath__ContentAssignment_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_TEXT && LA13_0<=RULE_SYMBOL)||LA13_0==12) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalTexDsl.g:1181:3: rule__DisplayMath__ContentAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_16);
            	    rule__DisplayMath__ContentAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalTexDsl.g:1189:1: rule__DisplayMath__Group__3 : rule__DisplayMath__Group__3__Impl ;
    public final void rule__DisplayMath__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1193:1: ( rule__DisplayMath__Group__3__Impl )
            // InternalTexDsl.g:1194:2: rule__DisplayMath__Group__3__Impl
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
    // InternalTexDsl.g:1200:1: rule__DisplayMath__Group__3__Impl : ( '$$' ) ;
    public final void rule__DisplayMath__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1204:1: ( ( '$$' ) )
            // InternalTexDsl.g:1205:1: ( '$$' )
            {
            // InternalTexDsl.g:1205:1: ( '$$' )
            // InternalTexDsl.g:1206:2: '$$'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisplayMathAccess().getDollarSignDollarSignKeyword_3()); 
            }
            match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__MathContent__Group_1__0"
    // InternalTexDsl.g:1216:1: rule__MathContent__Group_1__0 : rule__MathContent__Group_1__0__Impl rule__MathContent__Group_1__1 ;
    public final void rule__MathContent__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1220:1: ( rule__MathContent__Group_1__0__Impl rule__MathContent__Group_1__1 )
            // InternalTexDsl.g:1221:2: rule__MathContent__Group_1__0__Impl rule__MathContent__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__MathContent__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MathContent__Group_1__1();

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
    // $ANTLR end "rule__MathContent__Group_1__0"


    // $ANTLR start "rule__MathContent__Group_1__0__Impl"
    // InternalTexDsl.g:1228:1: rule__MathContent__Group_1__0__Impl : ( () ) ;
    public final void rule__MathContent__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1232:1: ( ( () ) )
            // InternalTexDsl.g:1233:1: ( () )
            {
            // InternalTexDsl.g:1233:1: ( () )
            // InternalTexDsl.g:1234:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMathContentAccess().getMathContentAction_1_0()); 
            }
            // InternalTexDsl.g:1235:2: ()
            // InternalTexDsl.g:1235:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMathContentAccess().getMathContentAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathContent__Group_1__0__Impl"


    // $ANTLR start "rule__MathContent__Group_1__1"
    // InternalTexDsl.g:1243:1: rule__MathContent__Group_1__1 : rule__MathContent__Group_1__1__Impl ;
    public final void rule__MathContent__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1247:1: ( rule__MathContent__Group_1__1__Impl )
            // InternalTexDsl.g:1248:2: rule__MathContent__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MathContent__Group_1__1__Impl();

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
    // $ANTLR end "rule__MathContent__Group_1__1"


    // $ANTLR start "rule__MathContent__Group_1__1__Impl"
    // InternalTexDsl.g:1254:1: rule__MathContent__Group_1__1__Impl : ( RULE_TEXT ) ;
    public final void rule__MathContent__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1258:1: ( ( RULE_TEXT ) )
            // InternalTexDsl.g:1259:1: ( RULE_TEXT )
            {
            // InternalTexDsl.g:1259:1: ( RULE_TEXT )
            // InternalTexDsl.g:1260:2: RULE_TEXT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMathContentAccess().getTEXTTerminalRuleCall_1_1()); 
            }
            match(input,RULE_TEXT,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMathContentAccess().getTEXTTerminalRuleCall_1_1()); 
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
    // $ANTLR end "rule__MathContent__Group_1__1__Impl"


    // $ANTLR start "rule__MathContent__Group_2__0"
    // InternalTexDsl.g:1270:1: rule__MathContent__Group_2__0 : rule__MathContent__Group_2__0__Impl rule__MathContent__Group_2__1 ;
    public final void rule__MathContent__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1274:1: ( rule__MathContent__Group_2__0__Impl rule__MathContent__Group_2__1 )
            // InternalTexDsl.g:1275:2: rule__MathContent__Group_2__0__Impl rule__MathContent__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__MathContent__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MathContent__Group_2__1();

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
    // $ANTLR end "rule__MathContent__Group_2__0"


    // $ANTLR start "rule__MathContent__Group_2__0__Impl"
    // InternalTexDsl.g:1282:1: rule__MathContent__Group_2__0__Impl : ( () ) ;
    public final void rule__MathContent__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1286:1: ( ( () ) )
            // InternalTexDsl.g:1287:1: ( () )
            {
            // InternalTexDsl.g:1287:1: ( () )
            // InternalTexDsl.g:1288:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMathContentAccess().getMathContentAction_2_0()); 
            }
            // InternalTexDsl.g:1289:2: ()
            // InternalTexDsl.g:1289:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMathContentAccess().getMathContentAction_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathContent__Group_2__0__Impl"


    // $ANTLR start "rule__MathContent__Group_2__1"
    // InternalTexDsl.g:1297:1: rule__MathContent__Group_2__1 : rule__MathContent__Group_2__1__Impl ;
    public final void rule__MathContent__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1301:1: ( rule__MathContent__Group_2__1__Impl )
            // InternalTexDsl.g:1302:2: rule__MathContent__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MathContent__Group_2__1__Impl();

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
    // $ANTLR end "rule__MathContent__Group_2__1"


    // $ANTLR start "rule__MathContent__Group_2__1__Impl"
    // InternalTexDsl.g:1308:1: rule__MathContent__Group_2__1__Impl : ( RULE_NUMBER ) ;
    public final void rule__MathContent__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1312:1: ( ( RULE_NUMBER ) )
            // InternalTexDsl.g:1313:1: ( RULE_NUMBER )
            {
            // InternalTexDsl.g:1313:1: ( RULE_NUMBER )
            // InternalTexDsl.g:1314:2: RULE_NUMBER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMathContentAccess().getNUMBERTerminalRuleCall_2_1()); 
            }
            match(input,RULE_NUMBER,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMathContentAccess().getNUMBERTerminalRuleCall_2_1()); 
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
    // $ANTLR end "rule__MathContent__Group_2__1__Impl"


    // $ANTLR start "rule__MathContent__Group_3__0"
    // InternalTexDsl.g:1324:1: rule__MathContent__Group_3__0 : rule__MathContent__Group_3__0__Impl rule__MathContent__Group_3__1 ;
    public final void rule__MathContent__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1328:1: ( rule__MathContent__Group_3__0__Impl rule__MathContent__Group_3__1 )
            // InternalTexDsl.g:1329:2: rule__MathContent__Group_3__0__Impl rule__MathContent__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__MathContent__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MathContent__Group_3__1();

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
    // $ANTLR end "rule__MathContent__Group_3__0"


    // $ANTLR start "rule__MathContent__Group_3__0__Impl"
    // InternalTexDsl.g:1336:1: rule__MathContent__Group_3__0__Impl : ( () ) ;
    public final void rule__MathContent__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1340:1: ( ( () ) )
            // InternalTexDsl.g:1341:1: ( () )
            {
            // InternalTexDsl.g:1341:1: ( () )
            // InternalTexDsl.g:1342:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMathContentAccess().getMathContentAction_3_0()); 
            }
            // InternalTexDsl.g:1343:2: ()
            // InternalTexDsl.g:1343:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMathContentAccess().getMathContentAction_3_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathContent__Group_3__0__Impl"


    // $ANTLR start "rule__MathContent__Group_3__1"
    // InternalTexDsl.g:1351:1: rule__MathContent__Group_3__1 : rule__MathContent__Group_3__1__Impl ;
    public final void rule__MathContent__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1355:1: ( rule__MathContent__Group_3__1__Impl )
            // InternalTexDsl.g:1356:2: rule__MathContent__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MathContent__Group_3__1__Impl();

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
    // $ANTLR end "rule__MathContent__Group_3__1"


    // $ANTLR start "rule__MathContent__Group_3__1__Impl"
    // InternalTexDsl.g:1362:1: rule__MathContent__Group_3__1__Impl : ( RULE_SYMBOL ) ;
    public final void rule__MathContent__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1366:1: ( ( RULE_SYMBOL ) )
            // InternalTexDsl.g:1367:1: ( RULE_SYMBOL )
            {
            // InternalTexDsl.g:1367:1: ( RULE_SYMBOL )
            // InternalTexDsl.g:1368:2: RULE_SYMBOL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMathContentAccess().getSYMBOLTerminalRuleCall_3_1()); 
            }
            match(input,RULE_SYMBOL,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMathContentAccess().getSYMBOLTerminalRuleCall_3_1()); 
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
    // $ANTLR end "rule__MathContent__Group_3__1__Impl"


    // $ANTLR start "rule__Model__ElementsAssignment"
    // InternalTexDsl.g:1378:1: rule__Model__ElementsAssignment : ( ruleElement ) ;
    public final void rule__Model__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1382:1: ( ( ruleElement ) )
            // InternalTexDsl.g:1383:2: ( ruleElement )
            {
            // InternalTexDsl.g:1383:2: ( ruleElement )
            // InternalTexDsl.g:1384:3: ruleElement
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


    // $ANTLR start "rule__Command__NameAssignment_1"
    // InternalTexDsl.g:1393:1: rule__Command__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Command__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1397:1: ( ( RULE_ID ) )
            // InternalTexDsl.g:1398:2: ( RULE_ID )
            {
            // InternalTexDsl.g:1398:2: ( RULE_ID )
            // InternalTexDsl.g:1399:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Command__NameAssignment_1"


    // $ANTLR start "rule__Command__OptionalArgsAssignment_2"
    // InternalTexDsl.g:1408:1: rule__Command__OptionalArgsAssignment_2 : ( ruleOptionalArgument ) ;
    public final void rule__Command__OptionalArgsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1412:1: ( ( ruleOptionalArgument ) )
            // InternalTexDsl.g:1413:2: ( ruleOptionalArgument )
            {
            // InternalTexDsl.g:1413:2: ( ruleOptionalArgument )
            // InternalTexDsl.g:1414:3: ruleOptionalArgument
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
    // InternalTexDsl.g:1423:1: rule__Command__MandatoryArgsAssignment_3 : ( ruleMandatoryArgument ) ;
    public final void rule__Command__MandatoryArgsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1427:1: ( ( ruleMandatoryArgument ) )
            // InternalTexDsl.g:1428:2: ( ruleMandatoryArgument )
            {
            // InternalTexDsl.g:1428:2: ( ruleMandatoryArgument )
            // InternalTexDsl.g:1429:3: ruleMandatoryArgument
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


    // $ANTLR start "rule__OptionalArgument__ContentAssignment_1"
    // InternalTexDsl.g:1438:1: rule__OptionalArgument__ContentAssignment_1 : ( ruleArgumentContent ) ;
    public final void rule__OptionalArgument__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1442:1: ( ( ruleArgumentContent ) )
            // InternalTexDsl.g:1443:2: ( ruleArgumentContent )
            {
            // InternalTexDsl.g:1443:2: ( ruleArgumentContent )
            // InternalTexDsl.g:1444:3: ruleArgumentContent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionalArgumentAccess().getContentArgumentContentParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleArgumentContent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOptionalArgumentAccess().getContentArgumentContentParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__OptionalArgument__ContentAssignment_1"


    // $ANTLR start "rule__MandatoryArgument__ContentAssignment_1"
    // InternalTexDsl.g:1453:1: rule__MandatoryArgument__ContentAssignment_1 : ( ruleArgumentContent ) ;
    public final void rule__MandatoryArgument__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1457:1: ( ( ruleArgumentContent ) )
            // InternalTexDsl.g:1458:2: ( ruleArgumentContent )
            {
            // InternalTexDsl.g:1458:2: ( ruleArgumentContent )
            // InternalTexDsl.g:1459:3: ruleArgumentContent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMandatoryArgumentAccess().getContentArgumentContentParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleArgumentContent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMandatoryArgumentAccess().getContentArgumentContentParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__MandatoryArgument__ContentAssignment_1"

}

@SuppressWarnings("all")
abstract class InternalTexDslParser3 extends InternalTexDslParser2 {

        InternalTexDslParser3(TokenStream input) {
            this(input, new RecognizerSharedState());
        }

        InternalTexDslParser3(TokenStream input, RecognizerSharedState state) {
            super(input, state);
        }

    // $ANTLR start "rule__Environment__TypeAssignment_1"
    // InternalTexDsl.g:1468:1: rule__Environment__TypeAssignment_1 : ( RULE_ID ) ;
    public final void rule__Environment__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1472:1: ( ( RULE_ID ) )
            // InternalTexDsl.g:1473:2: ( RULE_ID )
            {
            // InternalTexDsl.g:1473:2: ( RULE_ID )
            // InternalTexDsl.g:1474:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvironmentAccess().getTypeIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvironmentAccess().getTypeIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Environment__TypeAssignment_1"


    // $ANTLR start "rule__Environment__ContentAssignment_3"
    // InternalTexDsl.g:1483:1: rule__Environment__ContentAssignment_3 : ( ruleElement ) ;
    public final void rule__Environment__ContentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1487:1: ( ( ruleElement ) )
            // InternalTexDsl.g:1488:2: ( ruleElement )
            {
            // InternalTexDsl.g:1488:2: ( ruleElement )
            // InternalTexDsl.g:1489:3: ruleElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvironmentAccess().getContentElementParserRuleCall_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvironmentAccess().getContentElementParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__Environment__ContentAssignment_3"


    // $ANTLR start "rule__Environment__EndTypeAssignment_5"
    // InternalTexDsl.g:1498:1: rule__Environment__EndTypeAssignment_5 : ( RULE_ID ) ;
    public final void rule__Environment__EndTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1502:1: ( ( RULE_ID ) )
            // InternalTexDsl.g:1503:2: ( RULE_ID )
            {
            // InternalTexDsl.g:1503:2: ( RULE_ID )
            // InternalTexDsl.g:1504:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvironmentAccess().getEndTypeIDTerminalRuleCall_5_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvironmentAccess().getEndTypeIDTerminalRuleCall_5_0()); 
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
    // $ANTLR end "rule__Environment__EndTypeAssignment_5"


    // $ANTLR start "rule__TextContent__TextAssignment_1"
    // InternalTexDsl.g:1513:1: rule__TextContent__TextAssignment_1 : ( RULE_TEXT ) ;
    public final void rule__TextContent__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1517:1: ( ( RULE_TEXT ) )
            // InternalTexDsl.g:1518:2: ( RULE_TEXT )
            {
            // InternalTexDsl.g:1518:2: ( RULE_TEXT )
            // InternalTexDsl.g:1519:3: RULE_TEXT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextContentAccess().getTextTEXTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_TEXT,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextContentAccess().getTextTEXTTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__TextContent__TextAssignment_1"


    // $ANTLR start "rule__InlineMath__ContentAssignment_2"
    // InternalTexDsl.g:1528:1: rule__InlineMath__ContentAssignment_2 : ( ruleMathContent ) ;
    public final void rule__InlineMath__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1532:1: ( ( ruleMathContent ) )
            // InternalTexDsl.g:1533:2: ( ruleMathContent )
            {
            // InternalTexDsl.g:1533:2: ( ruleMathContent )
            // InternalTexDsl.g:1534:3: ruleMathContent
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
    // InternalTexDsl.g:1543:1: rule__DisplayMath__ContentAssignment_2 : ( ruleMathContent ) ;
    public final void rule__DisplayMath__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1547:1: ( ( ruleMathContent ) )
            // InternalTexDsl.g:1548:2: ( ruleMathContent )
            {
            // InternalTexDsl.g:1548:2: ( ruleMathContent )
            // InternalTexDsl.g:1549:3: ruleMathContent
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

    // $ANTLR start synpred1_InternalTexDsl
    public final void synpred1_InternalTexDsl_fragment() throws RecognitionException {   
        // InternalTexDsl.g:70:4: ( rule__Model__ElementsAssignment )
        // InternalTexDsl.g:70:4: rule__Model__ElementsAssignment
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__Model__ElementsAssignment();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalTexDsl

    // $ANTLR start synpred2_InternalTexDsl
    public final void synpred2_InternalTexDsl_fragment() throws RecognitionException {   
        // InternalTexDsl.g:358:2: ( ( ruleCommand ) )
        // InternalTexDsl.g:358:2: ( ruleCommand )
        {
        // InternalTexDsl.g:358:2: ( ruleCommand )
        // InternalTexDsl.g:359:3: ruleCommand
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getElementAccess().getCommandParserRuleCall_0()); 
        }
        pushFollow(FollowSets000.FOLLOW_2);
        ruleCommand();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalTexDsl

    // $ANTLR start synpred3_InternalTexDsl
    public final void synpred3_InternalTexDsl_fragment() throws RecognitionException {   
        // InternalTexDsl.g:364:2: ( ( ruleEnvironment ) )
        // InternalTexDsl.g:364:2: ( ruleEnvironment )
        {
        // InternalTexDsl.g:364:2: ( ruleEnvironment )
        // InternalTexDsl.g:365:3: ruleEnvironment
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getElementAccess().getEnvironmentParserRuleCall_1()); 
        }
        pushFollow(FollowSets000.FOLLOW_2);
        ruleEnvironment();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalTexDsl

    // $ANTLR start synpred4_InternalTexDsl
    public final void synpred4_InternalTexDsl_fragment() throws RecognitionException {   
        // InternalTexDsl.g:370:2: ( ( ruleTextContent ) )
        // InternalTexDsl.g:370:2: ( ruleTextContent )
        {
        // InternalTexDsl.g:370:2: ( ruleTextContent )
        // InternalTexDsl.g:371:3: ruleTextContent
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getElementAccess().getTextContentParserRuleCall_2()); 
        }
        pushFollow(FollowSets000.FOLLOW_2);
        ruleTextContent();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred4_InternalTexDsl

    // $ANTLR start synpred5_InternalTexDsl
    public final void synpred5_InternalTexDsl_fragment() throws RecognitionException {   
        // InternalTexDsl.g:391:2: ( ( ruleTextContent ) )
        // InternalTexDsl.g:391:2: ( ruleTextContent )
        {
        // InternalTexDsl.g:391:2: ( ruleTextContent )
        // InternalTexDsl.g:392:3: ruleTextContent
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getArgumentContentAccess().getTextContentParserRuleCall_0()); 
        }
        pushFollow(FollowSets000.FOLLOW_2);
        ruleTextContent();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalTexDsl

    // $ANTLR start synpred6_InternalTexDsl
    public final void synpred6_InternalTexDsl_fragment() throws RecognitionException {   
        // InternalTexDsl.g:397:2: ( ( ruleCommand ) )
        // InternalTexDsl.g:397:2: ( ruleCommand )
        {
        // InternalTexDsl.g:397:2: ( ruleCommand )
        // InternalTexDsl.g:398:3: ruleCommand
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getArgumentContentAccess().getCommandParserRuleCall_1()); 
        }
        pushFollow(FollowSets000.FOLLOW_2);
        ruleCommand();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred6_InternalTexDsl

    // $ANTLR start synpred7_InternalTexDsl
    public final void synpred7_InternalTexDsl_fragment() throws RecognitionException {   
        // InternalTexDsl.g:403:2: ( ( ruleMathExpression ) )
        // InternalTexDsl.g:403:2: ( ruleMathExpression )
        {
        // InternalTexDsl.g:403:2: ( ruleMathExpression )
        // InternalTexDsl.g:404:3: ruleMathExpression
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getArgumentContentAccess().getMathExpressionParserRuleCall_2()); 
        }
        pushFollow(FollowSets000.FOLLOW_2);
        ruleMathExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred7_InternalTexDsl

    // $ANTLR start synpred14_InternalTexDsl
    public final void synpred14_InternalTexDsl_fragment() throws RecognitionException {   
        // InternalTexDsl.g:633:4: ( rule__OptionalArgument__ContentAssignment_1 )
        // InternalTexDsl.g:633:4: rule__OptionalArgument__ContentAssignment_1
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__OptionalArgument__ContentAssignment_1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_InternalTexDsl

    // $ANTLR start synpred15_InternalTexDsl
    public final void synpred15_InternalTexDsl_fragment() throws RecognitionException {   
        // InternalTexDsl.g:721:4: ( rule__MandatoryArgument__ContentAssignment_1 )
        // InternalTexDsl.g:721:4: rule__MandatoryArgument__ContentAssignment_1
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__MandatoryArgument__ContentAssignment_1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred15_InternalTexDsl

    // $ANTLR start synpred16_InternalTexDsl
    public final void synpred16_InternalTexDsl_fragment() throws RecognitionException {   
        // InternalTexDsl.g:857:3: ( rule__Environment__ContentAssignment_3 )
        // InternalTexDsl.g:857:3: rule__Environment__ContentAssignment_3
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__Environment__ContentAssignment_3();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_InternalTexDsl

    // $ANTLR start synpred17_InternalTexDsl
    public final void synpred17_InternalTexDsl_fragment() throws RecognitionException {   
        // InternalTexDsl.g:991:3: ( rule__TextContent__TextAssignment_1 )
        // InternalTexDsl.g:991:3: rule__TextContent__TextAssignment_1
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__TextContent__TextAssignment_1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred17_InternalTexDsl

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
