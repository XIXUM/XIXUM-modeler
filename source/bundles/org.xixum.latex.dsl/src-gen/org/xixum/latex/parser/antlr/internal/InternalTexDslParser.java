package org.xixum.latex.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xixum.latex.services.TexDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalTexDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_TEXT", "RULE_NUMBER", "RULE_SYMBOL", "RULE_INT", "RULE_SL_COMMENT", "RULE_WS", "RULE_END", "'\\\\'", "'['", "']'", "'{'", "'}'", "'\\\\begin{'", "'\\\\end{'", "'$'", "'$$'"
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_NUMBER=6;
    public static final int RULE_INT=8;
    public static final int RULE_TEXT=5;
    public static final int RULE_SYMBOL=7;
    public static final int T__20=20;

    // delegates
    // delegators


        public InternalTexDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTexDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTexDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTexDsl.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private TexDslGrammarAccess grammarAccess;

        public InternalTexDslParser(TokenStream input, TexDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected TexDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalTexDsl.g:70:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalTexDsl.g:70:46: (iv_ruleModel= ruleModel EOF )
            // InternalTexDsl.g:71:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalTexDsl.g:77:1: ruleModel returns [EObject current=null] : ( (lv_elements_0_0= ruleElement ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalTexDsl.g:83:2: ( ( (lv_elements_0_0= ruleElement ) )* )
            // InternalTexDsl.g:84:2: ( (lv_elements_0_0= ruleElement ) )*
            {
            // InternalTexDsl.g:84:2: ( (lv_elements_0_0= ruleElement ) )*
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
            	    // InternalTexDsl.g:85:3: (lv_elements_0_0= ruleElement )
            	    {
            	    // InternalTexDsl.g:85:3: (lv_elements_0_0= ruleElement )
            	    // InternalTexDsl.g:86:4: lv_elements_0_0= ruleElement
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getModelAccess().getElementsElementParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FollowSets000.FOLLOW_3);
            	    lv_elements_0_0=ruleElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElementForParent(grammarAccess.getModelRule());
            	      				}
            	      				add(
            	      					current,
            	      					"elements",
            	      					lv_elements_0_0,
            	      					"org.xixum.latex.TexDsl.Element");
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleElement"
    // InternalTexDsl.g:106:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalTexDsl.g:106:48: (iv_ruleElement= ruleElement EOF )
            // InternalTexDsl.g:107:2: iv_ruleElement= ruleElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalTexDsl.g:113:1: ruleElement returns [EObject current=null] : (this_Command_0= ruleCommand | this_Environment_1= ruleEnvironment | this_TextContent_2= ruleTextContent | this_MathExpression_3= ruleMathExpression ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Command_0 = null;

        EObject this_Environment_1 = null;

        EObject this_TextContent_2 = null;

        EObject this_MathExpression_3 = null;



        	enterRule();

        try {
            // InternalTexDsl.g:119:2: ( (this_Command_0= ruleCommand | this_Environment_1= ruleEnvironment | this_TextContent_2= ruleTextContent | this_MathExpression_3= ruleMathExpression ) )
            // InternalTexDsl.g:120:2: (this_Command_0= ruleCommand | this_Environment_1= ruleEnvironment | this_TextContent_2= ruleTextContent | this_MathExpression_3= ruleMathExpression )
            {
            // InternalTexDsl.g:120:2: (this_Command_0= ruleCommand | this_Environment_1= ruleEnvironment | this_TextContent_2= ruleTextContent | this_MathExpression_3= ruleMathExpression )
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
                    if (state.backtracking>0) {state.failed=true; return current;}
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
                    if (state.backtracking>0) {state.failed=true; return current;}
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
                    if (state.backtracking>0) {state.failed=true; return current;}
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
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 5, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalTexDsl.g:121:3: this_Command_0= ruleCommand
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getElementAccess().getCommandParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Command_0=ruleCommand();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Command_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalTexDsl.g:133:3: this_Environment_1= ruleEnvironment
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getElementAccess().getEnvironmentParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Environment_1=ruleEnvironment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Environment_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalTexDsl.g:145:3: this_TextContent_2= ruleTextContent
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getElementAccess().getTextContentParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TextContent_2=ruleTextContent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TextContent_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalTexDsl.g:157:3: this_MathExpression_3= ruleMathExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getElementAccess().getMathExpressionParserRuleCall_3());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_MathExpression_3=ruleMathExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MathExpression_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleCommand"
    // InternalTexDsl.g:172:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalTexDsl.g:172:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalTexDsl.g:173:2: iv_ruleCommand= ruleCommand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommandRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCommand=ruleCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommand; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalTexDsl.g:179:1: ruleCommand returns [EObject current=null] : (otherlv_0= '\\\\' ( (lv_name_1_0= RULE_ID ) ) ( (lv_optionalArgs_2_0= ruleOptionalArgument ) )* ( (lv_mandatoryArgs_3_0= ruleMandatoryArgument ) )* ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_optionalArgs_2_0 = null;

        EObject lv_mandatoryArgs_3_0 = null;



        	enterRule();

        try {
            // InternalTexDsl.g:185:2: ( (otherlv_0= '\\\\' ( (lv_name_1_0= RULE_ID ) ) ( (lv_optionalArgs_2_0= ruleOptionalArgument ) )* ( (lv_mandatoryArgs_3_0= ruleMandatoryArgument ) )* ) )
            // InternalTexDsl.g:186:2: (otherlv_0= '\\\\' ( (lv_name_1_0= RULE_ID ) ) ( (lv_optionalArgs_2_0= ruleOptionalArgument ) )* ( (lv_mandatoryArgs_3_0= ruleMandatoryArgument ) )* )
            {
            // InternalTexDsl.g:186:2: (otherlv_0= '\\\\' ( (lv_name_1_0= RULE_ID ) ) ( (lv_optionalArgs_2_0= ruleOptionalArgument ) )* ( (lv_mandatoryArgs_3_0= ruleMandatoryArgument ) )* )
            // InternalTexDsl.g:187:3: otherlv_0= '\\\\' ( (lv_name_1_0= RULE_ID ) ) ( (lv_optionalArgs_2_0= ruleOptionalArgument ) )* ( (lv_mandatoryArgs_3_0= ruleMandatoryArgument ) )*
            {
            otherlv_0=(Token)match(input,12,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getCommandAccess().getBackslashKeyword_0());
              		
            }
            // InternalTexDsl.g:191:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTexDsl.g:192:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTexDsl.g:192:4: (lv_name_1_0= RULE_ID )
            // InternalTexDsl.g:193:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getCommandAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getCommandRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.xixum.latex.TexDsl.ID");
              				
            }

            }


            }

            // InternalTexDsl.g:209:3: ( (lv_optionalArgs_2_0= ruleOptionalArgument ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTexDsl.g:210:4: (lv_optionalArgs_2_0= ruleOptionalArgument )
            	    {
            	    // InternalTexDsl.g:210:4: (lv_optionalArgs_2_0= ruleOptionalArgument )
            	    // InternalTexDsl.g:211:5: lv_optionalArgs_2_0= ruleOptionalArgument
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getCommandAccess().getOptionalArgsOptionalArgumentParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_optionalArgs_2_0=ruleOptionalArgument();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getCommandRule());
            	      					}
            	      					add(
            	      						current,
            	      						"optionalArgs",
            	      						lv_optionalArgs_2_0,
            	      						"org.xixum.latex.TexDsl.OptionalArgument");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalTexDsl.g:228:3: ( (lv_mandatoryArgs_3_0= ruleMandatoryArgument ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalTexDsl.g:229:4: (lv_mandatoryArgs_3_0= ruleMandatoryArgument )
            	    {
            	    // InternalTexDsl.g:229:4: (lv_mandatoryArgs_3_0= ruleMandatoryArgument )
            	    // InternalTexDsl.g:230:5: lv_mandatoryArgs_3_0= ruleMandatoryArgument
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getCommandAccess().getMandatoryArgsMandatoryArgumentParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    lv_mandatoryArgs_3_0=ruleMandatoryArgument();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getCommandRule());
            	      					}
            	      					add(
            	      						current,
            	      						"mandatoryArgs",
            	      						lv_mandatoryArgs_3_0,
            	      						"org.xixum.latex.TexDsl.MandatoryArgument");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleOptionalArgument"
    // InternalTexDsl.g:251:1: entryRuleOptionalArgument returns [EObject current=null] : iv_ruleOptionalArgument= ruleOptionalArgument EOF ;
    public final EObject entryRuleOptionalArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionalArgument = null;


        try {
            // InternalTexDsl.g:251:57: (iv_ruleOptionalArgument= ruleOptionalArgument EOF )
            // InternalTexDsl.g:252:2: iv_ruleOptionalArgument= ruleOptionalArgument EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOptionalArgumentRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleOptionalArgument=ruleOptionalArgument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOptionalArgument; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOptionalArgument"


    // $ANTLR start "ruleOptionalArgument"
    // InternalTexDsl.g:258:1: ruleOptionalArgument returns [EObject current=null] : (otherlv_0= '[' ( (lv_content_1_0= ruleArgumentContent ) )+ otherlv_2= ']' ) ;
    public final EObject ruleOptionalArgument() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_content_1_0 = null;



        	enterRule();

        try {
            // InternalTexDsl.g:264:2: ( (otherlv_0= '[' ( (lv_content_1_0= ruleArgumentContent ) )+ otherlv_2= ']' ) )
            // InternalTexDsl.g:265:2: (otherlv_0= '[' ( (lv_content_1_0= ruleArgumentContent ) )+ otherlv_2= ']' )
            {
            // InternalTexDsl.g:265:2: (otherlv_0= '[' ( (lv_content_1_0= ruleArgumentContent ) )+ otherlv_2= ']' )
            // InternalTexDsl.g:266:3: otherlv_0= '[' ( (lv_content_1_0= ruleArgumentContent ) )+ otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getOptionalArgumentAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalTexDsl.g:270:3: ( (lv_content_1_0= ruleArgumentContent ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    int LA5_1 = input.LA(2);

                    if ( (synpred7_InternalTexDsl()) ) {
                        alt5=1;
                    }


                }
                else if ( (LA5_0==RULE_TEXT||LA5_0==12||LA5_0==17||(LA5_0>=19 && LA5_0<=20)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTexDsl.g:271:4: (lv_content_1_0= ruleArgumentContent )
            	    {
            	    // InternalTexDsl.g:271:4: (lv_content_1_0= ruleArgumentContent )
            	    // InternalTexDsl.g:272:5: lv_content_1_0= ruleArgumentContent
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getOptionalArgumentAccess().getContentArgumentContentParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_8);
            	    lv_content_1_0=ruleArgumentContent();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getOptionalArgumentRule());
            	      					}
            	      					add(
            	      						current,
            	      						"content",
            	      						lv_content_1_0,
            	      						"org.xixum.latex.TexDsl.ArgumentContent");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getOptionalArgumentAccess().getRightSquareBracketKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOptionalArgument"


    // $ANTLR start "entryRuleMandatoryArgument"
    // InternalTexDsl.g:297:1: entryRuleMandatoryArgument returns [EObject current=null] : iv_ruleMandatoryArgument= ruleMandatoryArgument EOF ;
    public final EObject entryRuleMandatoryArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMandatoryArgument = null;


        try {
            // InternalTexDsl.g:297:58: (iv_ruleMandatoryArgument= ruleMandatoryArgument EOF )
            // InternalTexDsl.g:298:2: iv_ruleMandatoryArgument= ruleMandatoryArgument EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMandatoryArgumentRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMandatoryArgument=ruleMandatoryArgument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMandatoryArgument; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMandatoryArgument"


    // $ANTLR start "ruleMandatoryArgument"
    // InternalTexDsl.g:304:1: ruleMandatoryArgument returns [EObject current=null] : (otherlv_0= '{' ( (lv_content_1_0= ruleArgumentContent ) )+ otherlv_2= '}' ) ;
    public final EObject ruleMandatoryArgument() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_content_1_0 = null;



        	enterRule();

        try {
            // InternalTexDsl.g:310:2: ( (otherlv_0= '{' ( (lv_content_1_0= ruleArgumentContent ) )+ otherlv_2= '}' ) )
            // InternalTexDsl.g:311:2: (otherlv_0= '{' ( (lv_content_1_0= ruleArgumentContent ) )+ otherlv_2= '}' )
            {
            // InternalTexDsl.g:311:2: (otherlv_0= '{' ( (lv_content_1_0= ruleArgumentContent ) )+ otherlv_2= '}' )
            // InternalTexDsl.g:312:3: otherlv_0= '{' ( (lv_content_1_0= ruleArgumentContent ) )+ otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMandatoryArgumentAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalTexDsl.g:316:3: ( (lv_content_1_0= ruleArgumentContent ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    int LA6_1 = input.LA(2);

                    if ( (synpred8_InternalTexDsl()) ) {
                        alt6=1;
                    }


                }
                else if ( (LA6_0==RULE_TEXT||LA6_0==12||LA6_0==17||(LA6_0>=19 && LA6_0<=20)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalTexDsl.g:317:4: (lv_content_1_0= ruleArgumentContent )
            	    {
            	    // InternalTexDsl.g:317:4: (lv_content_1_0= ruleArgumentContent )
            	    // InternalTexDsl.g:318:5: lv_content_1_0= ruleArgumentContent
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getMandatoryArgumentAccess().getContentArgumentContentParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_9);
            	    lv_content_1_0=ruleArgumentContent();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getMandatoryArgumentRule());
            	      					}
            	      					add(
            	      						current,
            	      						"content",
            	      						lv_content_1_0,
            	      						"org.xixum.latex.TexDsl.ArgumentContent");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getMandatoryArgumentAccess().getRightCurlyBracketKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMandatoryArgument"


    // $ANTLR start "entryRuleEnvironment"
    // InternalTexDsl.g:343:1: entryRuleEnvironment returns [EObject current=null] : iv_ruleEnvironment= ruleEnvironment EOF ;
    public final EObject entryRuleEnvironment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironment = null;


        try {
            // InternalTexDsl.g:343:52: (iv_ruleEnvironment= ruleEnvironment EOF )
            // InternalTexDsl.g:344:2: iv_ruleEnvironment= ruleEnvironment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnvironmentRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEnvironment=ruleEnvironment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnvironment; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnvironment"


    // $ANTLR start "ruleEnvironment"
    // InternalTexDsl.g:350:1: ruleEnvironment returns [EObject current=null] : (otherlv_0= '\\\\begin{' ( (lv_type_1_0= RULE_ID ) ) otherlv_2= '}' ( (lv_content_3_0= ruleElement ) )* otherlv_4= '\\\\end{' ( (lv_endType_5_0= RULE_ID ) ) otherlv_6= '}' ) ;
    public final EObject ruleEnvironment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_type_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_endType_5_0=null;
        Token otherlv_6=null;
        EObject lv_content_3_0 = null;



        	enterRule();

        try {
            // InternalTexDsl.g:356:2: ( (otherlv_0= '\\\\begin{' ( (lv_type_1_0= RULE_ID ) ) otherlv_2= '}' ( (lv_content_3_0= ruleElement ) )* otherlv_4= '\\\\end{' ( (lv_endType_5_0= RULE_ID ) ) otherlv_6= '}' ) )
            // InternalTexDsl.g:357:2: (otherlv_0= '\\\\begin{' ( (lv_type_1_0= RULE_ID ) ) otherlv_2= '}' ( (lv_content_3_0= ruleElement ) )* otherlv_4= '\\\\end{' ( (lv_endType_5_0= RULE_ID ) ) otherlv_6= '}' )
            {
            // InternalTexDsl.g:357:2: (otherlv_0= '\\\\begin{' ( (lv_type_1_0= RULE_ID ) ) otherlv_2= '}' ( (lv_content_3_0= ruleElement ) )* otherlv_4= '\\\\end{' ( (lv_endType_5_0= RULE_ID ) ) otherlv_6= '}' )
            // InternalTexDsl.g:358:3: otherlv_0= '\\\\begin{' ( (lv_type_1_0= RULE_ID ) ) otherlv_2= '}' ( (lv_content_3_0= ruleElement ) )* otherlv_4= '\\\\end{' ( (lv_endType_5_0= RULE_ID ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEnvironmentAccess().getBeginKeyword_0());
              		
            }
            // InternalTexDsl.g:362:3: ( (lv_type_1_0= RULE_ID ) )
            // InternalTexDsl.g:363:4: (lv_type_1_0= RULE_ID )
            {
            // InternalTexDsl.g:363:4: (lv_type_1_0= RULE_ID )
            // InternalTexDsl.g:364:5: lv_type_1_0= RULE_ID
            {
            lv_type_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_type_1_0, grammarAccess.getEnvironmentAccess().getTypeIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getEnvironmentRule());
              					}
              					setWithLastConsumed(
              						current,
              						"type",
              						lv_type_1_0,
              						"org.xixum.latex.TexDsl.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_2());
              		
            }
            // InternalTexDsl.g:384:3: ( (lv_content_3_0= ruleElement ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    int LA7_1 = input.LA(2);

                    if ( (synpred9_InternalTexDsl()) ) {
                        alt7=1;
                    }


                }
                else if ( (LA7_0==RULE_TEXT||LA7_0==12||LA7_0==17||(LA7_0>=19 && LA7_0<=20)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalTexDsl.g:385:4: (lv_content_3_0= ruleElement )
            	    {
            	    // InternalTexDsl.g:385:4: (lv_content_3_0= ruleElement )
            	    // InternalTexDsl.g:386:5: lv_content_3_0= ruleElement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getEnvironmentAccess().getContentElementParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_11);
            	    lv_content_3_0=ruleElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getEnvironmentRule());
            	      					}
            	      					add(
            	      						current,
            	      						"content",
            	      						lv_content_3_0,
            	      						"org.xixum.latex.TexDsl.Element");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getEnvironmentAccess().getEndKeyword_4());
              		
            }
            // InternalTexDsl.g:407:3: ( (lv_endType_5_0= RULE_ID ) )
            // InternalTexDsl.g:408:4: (lv_endType_5_0= RULE_ID )
            {
            // InternalTexDsl.g:408:4: (lv_endType_5_0= RULE_ID )
            // InternalTexDsl.g:409:5: lv_endType_5_0= RULE_ID
            {
            lv_endType_5_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_endType_5_0, grammarAccess.getEnvironmentAccess().getEndTypeIDTerminalRuleCall_5_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getEnvironmentRule());
              					}
              					setWithLastConsumed(
              						current,
              						"endType",
              						lv_endType_5_0,
              						"org.xixum.latex.TexDsl.ID");
              				
            }

            }


            }

            otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnvironment"


    // $ANTLR start "entryRuleArgumentContent"
    // InternalTexDsl.g:433:1: entryRuleArgumentContent returns [EObject current=null] : iv_ruleArgumentContent= ruleArgumentContent EOF ;
    public final EObject entryRuleArgumentContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgumentContent = null;


        try {
            // InternalTexDsl.g:433:56: (iv_ruleArgumentContent= ruleArgumentContent EOF )
            // InternalTexDsl.g:434:2: iv_ruleArgumentContent= ruleArgumentContent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArgumentContentRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleArgumentContent=ruleArgumentContent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArgumentContent; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArgumentContent"


    // $ANTLR start "ruleArgumentContent"
    // InternalTexDsl.g:440:1: ruleArgumentContent returns [EObject current=null] : (this_TextContent_0= ruleTextContent | this_Command_1= ruleCommand | this_MathExpression_2= ruleMathExpression | this_Environment_3= ruleEnvironment ) ;
    public final EObject ruleArgumentContent() throws RecognitionException {
        EObject current = null;

        EObject this_TextContent_0 = null;

        EObject this_Command_1 = null;

        EObject this_MathExpression_2 = null;

        EObject this_Environment_3 = null;



        	enterRule();

        try {
            // InternalTexDsl.g:446:2: ( (this_TextContent_0= ruleTextContent | this_Command_1= ruleCommand | this_MathExpression_2= ruleMathExpression | this_Environment_3= ruleEnvironment ) )
            // InternalTexDsl.g:447:2: (this_TextContent_0= ruleTextContent | this_Command_1= ruleCommand | this_MathExpression_2= ruleMathExpression | this_Environment_3= ruleEnvironment )
            {
            // InternalTexDsl.g:447:2: (this_TextContent_0= ruleTextContent | this_Command_1= ruleCommand | this_MathExpression_2= ruleMathExpression | this_Environment_3= ruleEnvironment )
            int alt8=4;
            switch ( input.LA(1) ) {
            case EOF:
            case RULE_TEXT:
            case 14:
            case 16:
                {
                alt8=1;
                }
                break;
            case 12:
                {
                int LA8_2 = input.LA(2);

                if ( (synpred10_InternalTexDsl()) ) {
                    alt8=1;
                }
                else if ( (synpred11_InternalTexDsl()) ) {
                    alt8=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;
                }
                }
                break;
            case 19:
                {
                int LA8_3 = input.LA(2);

                if ( (synpred10_InternalTexDsl()) ) {
                    alt8=1;
                }
                else if ( (synpred12_InternalTexDsl()) ) {
                    alt8=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 3, input);

                    throw nvae;
                }
                }
                break;
            case 20:
                {
                int LA8_4 = input.LA(2);

                if ( (synpred10_InternalTexDsl()) ) {
                    alt8=1;
                }
                else if ( (synpred12_InternalTexDsl()) ) {
                    alt8=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 4, input);

                    throw nvae;
                }
                }
                break;
            case 17:
                {
                int LA8_5 = input.LA(2);

                if ( (synpred10_InternalTexDsl()) ) {
                    alt8=1;
                }
                else if ( (true) ) {
                    alt8=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 5, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalTexDsl.g:448:3: this_TextContent_0= ruleTextContent
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getArgumentContentAccess().getTextContentParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TextContent_0=ruleTextContent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TextContent_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalTexDsl.g:460:3: this_Command_1= ruleCommand
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getArgumentContentAccess().getCommandParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Command_1=ruleCommand();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Command_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalTexDsl.g:472:3: this_MathExpression_2= ruleMathExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getArgumentContentAccess().getMathExpressionParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_MathExpression_2=ruleMathExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MathExpression_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalTexDsl.g:484:3: this_Environment_3= ruleEnvironment
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getArgumentContentAccess().getEnvironmentParserRuleCall_3());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Environment_3=ruleEnvironment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Environment_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArgumentContent"


    // $ANTLR start "entryRuleTextContent"
    // InternalTexDsl.g:499:1: entryRuleTextContent returns [EObject current=null] : iv_ruleTextContent= ruleTextContent EOF ;
    public final EObject entryRuleTextContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextContent = null;


        try {
            // InternalTexDsl.g:499:52: (iv_ruleTextContent= ruleTextContent EOF )
            // InternalTexDsl.g:500:2: iv_ruleTextContent= ruleTextContent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTextContentRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTextContent=ruleTextContent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTextContent; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTextContent"


    // $ANTLR start "ruleTextContent"
    // InternalTexDsl.g:506:1: ruleTextContent returns [EObject current=null] : ( () ( (lv_text_1_0= RULE_TEXT ) )* ) ;
    public final EObject ruleTextContent() throws RecognitionException {
        EObject current = null;

        Token lv_text_1_0=null;


        	enterRule();

        try {
            // InternalTexDsl.g:512:2: ( ( () ( (lv_text_1_0= RULE_TEXT ) )* ) )
            // InternalTexDsl.g:513:2: ( () ( (lv_text_1_0= RULE_TEXT ) )* )
            {
            // InternalTexDsl.g:513:2: ( () ( (lv_text_1_0= RULE_TEXT ) )* )
            // InternalTexDsl.g:514:3: () ( (lv_text_1_0= RULE_TEXT ) )*
            {
            // InternalTexDsl.g:514:3: ()
            // InternalTexDsl.g:515:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getTextContentAccess().getTextContentAction_0(),
              					current);
              			
            }

            }

            // InternalTexDsl.g:524:3: ( (lv_text_1_0= RULE_TEXT ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_TEXT) ) {
                    int LA9_2 = input.LA(2);

                    if ( (synpred13_InternalTexDsl()) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // InternalTexDsl.g:525:4: (lv_text_1_0= RULE_TEXT )
            	    {
            	    // InternalTexDsl.g:525:4: (lv_text_1_0= RULE_TEXT )
            	    // InternalTexDsl.g:526:5: lv_text_1_0= RULE_TEXT
            	    {
            	    lv_text_1_0=(Token)match(input,RULE_TEXT,FollowSets000.FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(lv_text_1_0, grammarAccess.getTextContentAccess().getTextTEXTTerminalRuleCall_1_0());
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElement(grammarAccess.getTextContentRule());
            	      					}
            	      					addWithLastConsumed(
            	      						current,
            	      						"text",
            	      						lv_text_1_0,
            	      						"org.xixum.latex.TexDsl.TEXT");
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTextContent"


    // $ANTLR start "entryRuleMathExpression"
    // InternalTexDsl.g:546:1: entryRuleMathExpression returns [EObject current=null] : iv_ruleMathExpression= ruleMathExpression EOF ;
    public final EObject entryRuleMathExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathExpression = null;


        try {
            // InternalTexDsl.g:546:55: (iv_ruleMathExpression= ruleMathExpression EOF )
            // InternalTexDsl.g:547:2: iv_ruleMathExpression= ruleMathExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMathExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMathExpression=ruleMathExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMathExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMathExpression"


    // $ANTLR start "ruleMathExpression"
    // InternalTexDsl.g:553:1: ruleMathExpression returns [EObject current=null] : (this_InlineMath_0= ruleInlineMath | this_DisplayMath_1= ruleDisplayMath ) ;
    public final EObject ruleMathExpression() throws RecognitionException {
        EObject current = null;

        EObject this_InlineMath_0 = null;

        EObject this_DisplayMath_1 = null;



        	enterRule();

        try {
            // InternalTexDsl.g:559:2: ( (this_InlineMath_0= ruleInlineMath | this_DisplayMath_1= ruleDisplayMath ) )
            // InternalTexDsl.g:560:2: (this_InlineMath_0= ruleInlineMath | this_DisplayMath_1= ruleDisplayMath )
            {
            // InternalTexDsl.g:560:2: (this_InlineMath_0= ruleInlineMath | this_DisplayMath_1= ruleDisplayMath )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            else if ( (LA10_0==20) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalTexDsl.g:561:3: this_InlineMath_0= ruleInlineMath
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMathExpressionAccess().getInlineMathParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_InlineMath_0=ruleInlineMath();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_InlineMath_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalTexDsl.g:573:3: this_DisplayMath_1= ruleDisplayMath
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMathExpressionAccess().getDisplayMathParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_DisplayMath_1=ruleDisplayMath();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DisplayMath_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMathExpression"


    // $ANTLR start "entryRuleInlineMath"
    // InternalTexDsl.g:588:1: entryRuleInlineMath returns [EObject current=null] : iv_ruleInlineMath= ruleInlineMath EOF ;
    public final EObject entryRuleInlineMath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInlineMath = null;


        try {
            // InternalTexDsl.g:588:51: (iv_ruleInlineMath= ruleInlineMath EOF )
            // InternalTexDsl.g:589:2: iv_ruleInlineMath= ruleInlineMath EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInlineMathRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleInlineMath=ruleInlineMath();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInlineMath; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInlineMath"


    // $ANTLR start "ruleInlineMath"
    // InternalTexDsl.g:595:1: ruleInlineMath returns [EObject current=null] : ( () otherlv_1= '$' ( (lv_content_2_0= ruleMathContent ) )* otherlv_3= '$' ) ;
    public final EObject ruleInlineMath() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalTexDsl.g:601:2: ( ( () otherlv_1= '$' ( (lv_content_2_0= ruleMathContent ) )* otherlv_3= '$' ) )
            // InternalTexDsl.g:602:2: ( () otherlv_1= '$' ( (lv_content_2_0= ruleMathContent ) )* otherlv_3= '$' )
            {
            // InternalTexDsl.g:602:2: ( () otherlv_1= '$' ( (lv_content_2_0= ruleMathContent ) )* otherlv_3= '$' )
            // InternalTexDsl.g:603:3: () otherlv_1= '$' ( (lv_content_2_0= ruleMathContent ) )* otherlv_3= '$'
            {
            // InternalTexDsl.g:603:3: ()
            // InternalTexDsl.g:604:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getInlineMathAccess().getInlineMathAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getInlineMathAccess().getDollarSignKeyword_1());
              		
            }
            // InternalTexDsl.g:617:3: ( (lv_content_2_0= ruleMathContent ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_TEXT && LA11_0<=RULE_SYMBOL)||LA11_0==12) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalTexDsl.g:618:4: (lv_content_2_0= ruleMathContent )
            	    {
            	    // InternalTexDsl.g:618:4: (lv_content_2_0= ruleMathContent )
            	    // InternalTexDsl.g:619:5: lv_content_2_0= ruleMathContent
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getInlineMathAccess().getContentMathContentParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_13);
            	    lv_content_2_0=ruleMathContent();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getInlineMathRule());
            	      					}
            	      					add(
            	      						current,
            	      						"content",
            	      						lv_content_2_0,
            	      						"org.xixum.latex.TexDsl.MathContent");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getInlineMathAccess().getDollarSignKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInlineMath"


    // $ANTLR start "entryRuleDisplayMath"
    // InternalTexDsl.g:644:1: entryRuleDisplayMath returns [EObject current=null] : iv_ruleDisplayMath= ruleDisplayMath EOF ;
    public final EObject entryRuleDisplayMath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisplayMath = null;


        try {
            // InternalTexDsl.g:644:52: (iv_ruleDisplayMath= ruleDisplayMath EOF )
            // InternalTexDsl.g:645:2: iv_ruleDisplayMath= ruleDisplayMath EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDisplayMathRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDisplayMath=ruleDisplayMath();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDisplayMath; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDisplayMath"


    // $ANTLR start "ruleDisplayMath"
    // InternalTexDsl.g:651:1: ruleDisplayMath returns [EObject current=null] : ( () otherlv_1= '$$' ( (lv_content_2_0= ruleMathContent ) )* otherlv_3= '$$' ) ;
    public final EObject ruleDisplayMath() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalTexDsl.g:657:2: ( ( () otherlv_1= '$$' ( (lv_content_2_0= ruleMathContent ) )* otherlv_3= '$$' ) )
            // InternalTexDsl.g:658:2: ( () otherlv_1= '$$' ( (lv_content_2_0= ruleMathContent ) )* otherlv_3= '$$' )
            {
            // InternalTexDsl.g:658:2: ( () otherlv_1= '$$' ( (lv_content_2_0= ruleMathContent ) )* otherlv_3= '$$' )
            // InternalTexDsl.g:659:3: () otherlv_1= '$$' ( (lv_content_2_0= ruleMathContent ) )* otherlv_3= '$$'
            {
            // InternalTexDsl.g:659:3: ()
            // InternalTexDsl.g:660:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDisplayMathAccess().getDisplayMathAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDisplayMathAccess().getDollarSignDollarSignKeyword_1());
              		
            }
            // InternalTexDsl.g:673:3: ( (lv_content_2_0= ruleMathContent ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_TEXT && LA12_0<=RULE_SYMBOL)||LA12_0==12) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalTexDsl.g:674:4: (lv_content_2_0= ruleMathContent )
            	    {
            	    // InternalTexDsl.g:674:4: (lv_content_2_0= ruleMathContent )
            	    // InternalTexDsl.g:675:5: lv_content_2_0= ruleMathContent
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDisplayMathAccess().getContentMathContentParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_14);
            	    lv_content_2_0=ruleMathContent();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDisplayMathRule());
            	      					}
            	      					add(
            	      						current,
            	      						"content",
            	      						lv_content_2_0,
            	      						"org.xixum.latex.TexDsl.MathContent");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDisplayMathAccess().getDollarSignDollarSignKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDisplayMath"


    // $ANTLR start "entryRuleMathContent"
    // InternalTexDsl.g:700:1: entryRuleMathContent returns [EObject current=null] : iv_ruleMathContent= ruleMathContent EOF ;
    public final EObject entryRuleMathContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathContent = null;


        try {
            // InternalTexDsl.g:700:52: (iv_ruleMathContent= ruleMathContent EOF )
            // InternalTexDsl.g:701:2: iv_ruleMathContent= ruleMathContent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMathContentRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMathContent=ruleMathContent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMathContent; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMathContent"


    // $ANTLR start "ruleMathContent"
    // InternalTexDsl.g:707:1: ruleMathContent returns [EObject current=null] : (this_Command_0= ruleCommand | ( () this_TEXT_2= RULE_TEXT ) | ( () this_NUMBER_4= RULE_NUMBER ) | ( () this_SYMBOL_6= RULE_SYMBOL ) ) ;
    public final EObject ruleMathContent() throws RecognitionException {
        EObject current = null;

        Token this_TEXT_2=null;
        Token this_NUMBER_4=null;
        Token this_SYMBOL_6=null;
        EObject this_Command_0 = null;



        	enterRule();

        try {
            // InternalTexDsl.g:713:2: ( (this_Command_0= ruleCommand | ( () this_TEXT_2= RULE_TEXT ) | ( () this_NUMBER_4= RULE_NUMBER ) | ( () this_SYMBOL_6= RULE_SYMBOL ) ) )
            // InternalTexDsl.g:714:2: (this_Command_0= ruleCommand | ( () this_TEXT_2= RULE_TEXT ) | ( () this_NUMBER_4= RULE_NUMBER ) | ( () this_SYMBOL_6= RULE_SYMBOL ) )
            {
            // InternalTexDsl.g:714:2: (this_Command_0= ruleCommand | ( () this_TEXT_2= RULE_TEXT ) | ( () this_NUMBER_4= RULE_NUMBER ) | ( () this_SYMBOL_6= RULE_SYMBOL ) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt13=1;
                }
                break;
            case RULE_TEXT:
                {
                alt13=2;
                }
                break;
            case RULE_NUMBER:
                {
                alt13=3;
                }
                break;
            case RULE_SYMBOL:
                {
                alt13=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalTexDsl.g:715:3: this_Command_0= ruleCommand
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMathContentAccess().getCommandParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Command_0=ruleCommand();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Command_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalTexDsl.g:727:3: ( () this_TEXT_2= RULE_TEXT )
                    {
                    // InternalTexDsl.g:727:3: ( () this_TEXT_2= RULE_TEXT )
                    // InternalTexDsl.g:728:4: () this_TEXT_2= RULE_TEXT
                    {
                    // InternalTexDsl.g:728:4: ()
                    // InternalTexDsl.g:729:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getMathContentAccess().getMathContentAction_1_0(),
                      						current);
                      				
                    }

                    }

                    this_TEXT_2=(Token)match(input,RULE_TEXT,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_TEXT_2, grammarAccess.getMathContentAccess().getTEXTTerminalRuleCall_1_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTexDsl.g:744:3: ( () this_NUMBER_4= RULE_NUMBER )
                    {
                    // InternalTexDsl.g:744:3: ( () this_NUMBER_4= RULE_NUMBER )
                    // InternalTexDsl.g:745:4: () this_NUMBER_4= RULE_NUMBER
                    {
                    // InternalTexDsl.g:745:4: ()
                    // InternalTexDsl.g:746:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getMathContentAccess().getMathContentAction_2_0(),
                      						current);
                      				
                    }

                    }

                    this_NUMBER_4=(Token)match(input,RULE_NUMBER,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_NUMBER_4, grammarAccess.getMathContentAccess().getNUMBERTerminalRuleCall_2_1());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalTexDsl.g:761:3: ( () this_SYMBOL_6= RULE_SYMBOL )
                    {
                    // InternalTexDsl.g:761:3: ( () this_SYMBOL_6= RULE_SYMBOL )
                    // InternalTexDsl.g:762:4: () this_SYMBOL_6= RULE_SYMBOL
                    {
                    // InternalTexDsl.g:762:4: ()
                    // InternalTexDsl.g:763:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getMathContentAccess().getMathContentAction_3_0(),
                      						current);
                      				
                    }

                    }

                    this_SYMBOL_6=(Token)match(input,RULE_SYMBOL,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_SYMBOL_6, grammarAccess.getMathContentAccess().getSYMBOLTerminalRuleCall_3_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMathContent"

    // $ANTLR start synpred1_InternalTexDsl
    public final void synpred1_InternalTexDsl_fragment() throws RecognitionException {   
        EObject lv_elements_0_0 = null;


        // InternalTexDsl.g:85:3: ( (lv_elements_0_0= ruleElement ) )
        // InternalTexDsl.g:85:3: (lv_elements_0_0= ruleElement )
        {
        // InternalTexDsl.g:85:3: (lv_elements_0_0= ruleElement )
        // InternalTexDsl.g:86:4: lv_elements_0_0= ruleElement
        {
        if ( state.backtracking==0 ) {

          				newCompositeNode(grammarAccess.getModelAccess().getElementsElementParserRuleCall_0());
          			
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_elements_0_0=ruleElement();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalTexDsl

    // $ANTLR start synpred2_InternalTexDsl
    public final void synpred2_InternalTexDsl_fragment() throws RecognitionException {   
        EObject this_Command_0 = null;


        // InternalTexDsl.g:121:3: (this_Command_0= ruleCommand )
        // InternalTexDsl.g:121:3: this_Command_0= ruleCommand
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_Command_0=ruleCommand();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalTexDsl

    // $ANTLR start synpred3_InternalTexDsl
    public final void synpred3_InternalTexDsl_fragment() throws RecognitionException {   
        EObject this_Environment_1 = null;


        // InternalTexDsl.g:133:3: (this_Environment_1= ruleEnvironment )
        // InternalTexDsl.g:133:3: this_Environment_1= ruleEnvironment
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_Environment_1=ruleEnvironment();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalTexDsl

    // $ANTLR start synpred4_InternalTexDsl
    public final void synpred4_InternalTexDsl_fragment() throws RecognitionException {   
        EObject this_TextContent_2 = null;


        // InternalTexDsl.g:145:3: (this_TextContent_2= ruleTextContent )
        // InternalTexDsl.g:145:3: this_TextContent_2= ruleTextContent
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_TextContent_2=ruleTextContent();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_InternalTexDsl

    // $ANTLR start synpred7_InternalTexDsl
    public final void synpred7_InternalTexDsl_fragment() throws RecognitionException {   
        EObject lv_content_1_0 = null;


        // InternalTexDsl.g:271:4: ( (lv_content_1_0= ruleArgumentContent ) )
        // InternalTexDsl.g:271:4: (lv_content_1_0= ruleArgumentContent )
        {
        // InternalTexDsl.g:271:4: (lv_content_1_0= ruleArgumentContent )
        // InternalTexDsl.g:272:5: lv_content_1_0= ruleArgumentContent
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getOptionalArgumentAccess().getContentArgumentContentParserRuleCall_1_0());
          				
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_content_1_0=ruleArgumentContent();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred7_InternalTexDsl

    // $ANTLR start synpred8_InternalTexDsl
    public final void synpred8_InternalTexDsl_fragment() throws RecognitionException {   
        EObject lv_content_1_0 = null;


        // InternalTexDsl.g:317:4: ( (lv_content_1_0= ruleArgumentContent ) )
        // InternalTexDsl.g:317:4: (lv_content_1_0= ruleArgumentContent )
        {
        // InternalTexDsl.g:317:4: (lv_content_1_0= ruleArgumentContent )
        // InternalTexDsl.g:318:5: lv_content_1_0= ruleArgumentContent
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getMandatoryArgumentAccess().getContentArgumentContentParserRuleCall_1_0());
          				
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_content_1_0=ruleArgumentContent();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred8_InternalTexDsl

    // $ANTLR start synpred9_InternalTexDsl
    public final void synpred9_InternalTexDsl_fragment() throws RecognitionException {   
        EObject lv_content_3_0 = null;


        // InternalTexDsl.g:385:4: ( (lv_content_3_0= ruleElement ) )
        // InternalTexDsl.g:385:4: (lv_content_3_0= ruleElement )
        {
        // InternalTexDsl.g:385:4: (lv_content_3_0= ruleElement )
        // InternalTexDsl.g:386:5: lv_content_3_0= ruleElement
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getEnvironmentAccess().getContentElementParserRuleCall_3_0());
          				
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_content_3_0=ruleElement();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred9_InternalTexDsl

    // $ANTLR start synpred10_InternalTexDsl
    public final void synpred10_InternalTexDsl_fragment() throws RecognitionException {   
        EObject this_TextContent_0 = null;


        // InternalTexDsl.g:448:3: (this_TextContent_0= ruleTextContent )
        // InternalTexDsl.g:448:3: this_TextContent_0= ruleTextContent
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_TextContent_0=ruleTextContent();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred10_InternalTexDsl

    // $ANTLR start synpred11_InternalTexDsl
    public final void synpred11_InternalTexDsl_fragment() throws RecognitionException {   
        EObject this_Command_1 = null;


        // InternalTexDsl.g:460:3: (this_Command_1= ruleCommand )
        // InternalTexDsl.g:460:3: this_Command_1= ruleCommand
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_Command_1=ruleCommand();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred11_InternalTexDsl

    // $ANTLR start synpred12_InternalTexDsl
    public final void synpred12_InternalTexDsl_fragment() throws RecognitionException {   
        EObject this_MathExpression_2 = null;


        // InternalTexDsl.g:472:3: (this_MathExpression_2= ruleMathExpression )
        // InternalTexDsl.g:472:3: this_MathExpression_2= ruleMathExpression
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_MathExpression_2=ruleMathExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred12_InternalTexDsl

    // $ANTLR start synpred13_InternalTexDsl
    public final void synpred13_InternalTexDsl_fragment() throws RecognitionException {   
        Token lv_text_1_0=null;

        // InternalTexDsl.g:525:4: ( (lv_text_1_0= RULE_TEXT ) )
        // InternalTexDsl.g:525:4: (lv_text_1_0= RULE_TEXT )
        {
        // InternalTexDsl.g:525:4: (lv_text_1_0= RULE_TEXT )
        // InternalTexDsl.g:526:5: lv_text_1_0= RULE_TEXT
        {
        lv_text_1_0=(Token)match(input,RULE_TEXT,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalTexDsl

    // Delegated rules

    public final boolean synpred8_InternalTexDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalTexDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalTexDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalTexDsl_fragment(); // can never throw exception
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
    public final boolean synpred12_InternalTexDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalTexDsl_fragment(); // can never throw exception
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
    public final boolean synpred9_InternalTexDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalTexDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalTexDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalTexDsl_fragment(); // can never throw exception
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
    public final boolean synpred10_InternalTexDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalTexDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000001A1022L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000A002L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000001A1020L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000001A5020L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000001B1020L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000001E1020L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000022L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000000810E0L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000001010E0L});
    }


}