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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_TEXT", "RULE_NUMBER", "RULE_SYMBOL", "RULE_SL_COMMENT", "RULE_INT", "RULE_WS", "'\\\\'", "'['", "']'", "'{'", "'}'", "'$'", "'$$'"
    };
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

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_SYMBOL)||(LA1_0>=11 && LA1_0<=12)||LA1_0==14||(LA1_0>=16 && LA1_0<=17)) ) {
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
    // InternalTexDsl.g:113:1: ruleElement returns [EObject current=null] : (this_Command_0= ruleCommand | this_TextContent_1= ruleTextContent | this_MathExpression_2= ruleMathExpression ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Command_0 = null;

        EObject this_TextContent_1 = null;

        EObject this_MathExpression_2 = null;



        	enterRule();

        try {
            // InternalTexDsl.g:119:2: ( (this_Command_0= ruleCommand | this_TextContent_1= ruleTextContent | this_MathExpression_2= ruleMathExpression ) )
            // InternalTexDsl.g:120:2: (this_Command_0= ruleCommand | this_TextContent_1= ruleTextContent | this_MathExpression_2= ruleMathExpression )
            {
            // InternalTexDsl.g:120:2: (this_Command_0= ruleCommand | this_TextContent_1= ruleTextContent | this_MathExpression_2= ruleMathExpression )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case RULE_ID:
            case RULE_TEXT:
            case RULE_NUMBER:
            case RULE_SYMBOL:
            case 12:
            case 14:
                {
                alt2=2;
                }
                break;
            case 16:
            case 17:
                {
                alt2=3;
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
                    // InternalTexDsl.g:133:3: this_TextContent_1= ruleTextContent
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getElementAccess().getTextContentParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TextContent_1=ruleTextContent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TextContent_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalTexDsl.g:145:3: this_MathExpression_2= ruleMathExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getElementAccess().getMathExpressionParserRuleCall_2());
                      		
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
    // InternalTexDsl.g:160:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalTexDsl.g:160:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalTexDsl.g:161:2: iv_ruleCommand= ruleCommand EOF
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
    // InternalTexDsl.g:167:1: ruleCommand returns [EObject current=null] : (otherlv_0= '\\\\' ( (lv_command_1_0= RULE_ID ) ) ( (lv_optionalArgs_2_0= ruleOptionalArgument ) )* ( (lv_mandatoryArgs_3_0= ruleMandatoryArgument ) )* ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_command_1_0=null;
        EObject lv_optionalArgs_2_0 = null;

        EObject lv_mandatoryArgs_3_0 = null;



        	enterRule();

        try {
            // InternalTexDsl.g:173:2: ( (otherlv_0= '\\\\' ( (lv_command_1_0= RULE_ID ) ) ( (lv_optionalArgs_2_0= ruleOptionalArgument ) )* ( (lv_mandatoryArgs_3_0= ruleMandatoryArgument ) )* ) )
            // InternalTexDsl.g:174:2: (otherlv_0= '\\\\' ( (lv_command_1_0= RULE_ID ) ) ( (lv_optionalArgs_2_0= ruleOptionalArgument ) )* ( (lv_mandatoryArgs_3_0= ruleMandatoryArgument ) )* )
            {
            // InternalTexDsl.g:174:2: (otherlv_0= '\\\\' ( (lv_command_1_0= RULE_ID ) ) ( (lv_optionalArgs_2_0= ruleOptionalArgument ) )* ( (lv_mandatoryArgs_3_0= ruleMandatoryArgument ) )* )
            // InternalTexDsl.g:175:3: otherlv_0= '\\\\' ( (lv_command_1_0= RULE_ID ) ) ( (lv_optionalArgs_2_0= ruleOptionalArgument ) )* ( (lv_mandatoryArgs_3_0= ruleMandatoryArgument ) )*
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getCommandAccess().getBackslashKeyword_0());
              		
            }
            // InternalTexDsl.g:179:3: ( (lv_command_1_0= RULE_ID ) )
            // InternalTexDsl.g:180:4: (lv_command_1_0= RULE_ID )
            {
            // InternalTexDsl.g:180:4: (lv_command_1_0= RULE_ID )
            // InternalTexDsl.g:181:5: lv_command_1_0= RULE_ID
            {
            lv_command_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_command_1_0, grammarAccess.getCommandAccess().getCommandIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getCommandRule());
              					}
              					setWithLastConsumed(
              						current,
              						"command",
              						lv_command_1_0,
              						"org.xixum.latex.TexDsl.ID");
              				
            }

            }


            }

            // InternalTexDsl.g:197:3: ( (lv_optionalArgs_2_0= ruleOptionalArgument ) )*
            loop3:
            do {
                int alt3=2;
                alt3 = dfa3.predict(input);
                switch (alt3) {
            	case 1 :
            	    // InternalTexDsl.g:198:4: (lv_optionalArgs_2_0= ruleOptionalArgument )
            	    {
            	    // InternalTexDsl.g:198:4: (lv_optionalArgs_2_0= ruleOptionalArgument )
            	    // InternalTexDsl.g:199:5: lv_optionalArgs_2_0= ruleOptionalArgument
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

            // InternalTexDsl.g:216:3: ( (lv_mandatoryArgs_3_0= ruleMandatoryArgument ) )*
            loop4:
            do {
                int alt4=2;
                alt4 = dfa4.predict(input);
                switch (alt4) {
            	case 1 :
            	    // InternalTexDsl.g:217:4: (lv_mandatoryArgs_3_0= ruleMandatoryArgument )
            	    {
            	    // InternalTexDsl.g:217:4: (lv_mandatoryArgs_3_0= ruleMandatoryArgument )
            	    // InternalTexDsl.g:218:5: lv_mandatoryArgs_3_0= ruleMandatoryArgument
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getCommandAccess().getMandatoryArgsMandatoryArgumentParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_5);
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
    // InternalTexDsl.g:239:1: entryRuleOptionalArgument returns [EObject current=null] : iv_ruleOptionalArgument= ruleOptionalArgument EOF ;
    public final EObject entryRuleOptionalArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionalArgument = null;


        try {
            // InternalTexDsl.g:239:57: (iv_ruleOptionalArgument= ruleOptionalArgument EOF )
            // InternalTexDsl.g:240:2: iv_ruleOptionalArgument= ruleOptionalArgument EOF
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
    // InternalTexDsl.g:246:1: ruleOptionalArgument returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_content_2_0= ruleArgumentContent ) )* otherlv_3= ']' ) ;
    public final EObject ruleOptionalArgument() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalTexDsl.g:252:2: ( ( () otherlv_1= '[' ( (lv_content_2_0= ruleArgumentContent ) )* otherlv_3= ']' ) )
            // InternalTexDsl.g:253:2: ( () otherlv_1= '[' ( (lv_content_2_0= ruleArgumentContent ) )* otherlv_3= ']' )
            {
            // InternalTexDsl.g:253:2: ( () otherlv_1= '[' ( (lv_content_2_0= ruleArgumentContent ) )* otherlv_3= ']' )
            // InternalTexDsl.g:254:3: () otherlv_1= '[' ( (lv_content_2_0= ruleArgumentContent ) )* otherlv_3= ']'
            {
            // InternalTexDsl.g:254:3: ()
            // InternalTexDsl.g:255:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getOptionalArgumentAccess().getOptionalArgumentAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getOptionalArgumentAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalTexDsl.g:268:3: ( (lv_content_2_0= ruleArgumentContent ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_SYMBOL)||(LA5_0>=11 && LA5_0<=12)||LA5_0==14||(LA5_0>=16 && LA5_0<=17)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTexDsl.g:269:4: (lv_content_2_0= ruleArgumentContent )
            	    {
            	    // InternalTexDsl.g:269:4: (lv_content_2_0= ruleArgumentContent )
            	    // InternalTexDsl.g:270:5: lv_content_2_0= ruleArgumentContent
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getOptionalArgumentAccess().getContentArgumentContentParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    lv_content_2_0=ruleArgumentContent();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getOptionalArgumentRule());
            	      					}
            	      					add(
            	      						current,
            	      						"content",
            	      						lv_content_2_0,
            	      						"org.xixum.latex.TexDsl.ArgumentContent");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getOptionalArgumentAccess().getRightSquareBracketKeyword_3());
              		
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
    // InternalTexDsl.g:295:1: entryRuleMandatoryArgument returns [EObject current=null] : iv_ruleMandatoryArgument= ruleMandatoryArgument EOF ;
    public final EObject entryRuleMandatoryArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMandatoryArgument = null;


        try {
            // InternalTexDsl.g:295:58: (iv_ruleMandatoryArgument= ruleMandatoryArgument EOF )
            // InternalTexDsl.g:296:2: iv_ruleMandatoryArgument= ruleMandatoryArgument EOF
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
    // InternalTexDsl.g:302:1: ruleMandatoryArgument returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_content_2_0= ruleArgumentContent ) )* otherlv_3= '}' ) ;
    public final EObject ruleMandatoryArgument() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalTexDsl.g:308:2: ( ( () otherlv_1= '{' ( (lv_content_2_0= ruleArgumentContent ) )* otherlv_3= '}' ) )
            // InternalTexDsl.g:309:2: ( () otherlv_1= '{' ( (lv_content_2_0= ruleArgumentContent ) )* otherlv_3= '}' )
            {
            // InternalTexDsl.g:309:2: ( () otherlv_1= '{' ( (lv_content_2_0= ruleArgumentContent ) )* otherlv_3= '}' )
            // InternalTexDsl.g:310:3: () otherlv_1= '{' ( (lv_content_2_0= ruleArgumentContent ) )* otherlv_3= '}'
            {
            // InternalTexDsl.g:310:3: ()
            // InternalTexDsl.g:311:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getMandatoryArgumentAccess().getMandatoryArgumentAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMandatoryArgumentAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalTexDsl.g:324:3: ( (lv_content_2_0= ruleArgumentContent ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_SYMBOL)||(LA6_0>=11 && LA6_0<=12)||LA6_0==14||(LA6_0>=16 && LA6_0<=17)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalTexDsl.g:325:4: (lv_content_2_0= ruleArgumentContent )
            	    {
            	    // InternalTexDsl.g:325:4: (lv_content_2_0= ruleArgumentContent )
            	    // InternalTexDsl.g:326:5: lv_content_2_0= ruleArgumentContent
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getMandatoryArgumentAccess().getContentArgumentContentParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_7);
            	    lv_content_2_0=ruleArgumentContent();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getMandatoryArgumentRule());
            	      					}
            	      					add(
            	      						current,
            	      						"content",
            	      						lv_content_2_0,
            	      						"org.xixum.latex.TexDsl.ArgumentContent");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getMandatoryArgumentAccess().getRightCurlyBracketKeyword_3());
              		
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


    // $ANTLR start "entryRuleArgumentContent"
    // InternalTexDsl.g:351:1: entryRuleArgumentContent returns [EObject current=null] : iv_ruleArgumentContent= ruleArgumentContent EOF ;
    public final EObject entryRuleArgumentContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgumentContent = null;


        try {
            // InternalTexDsl.g:351:56: (iv_ruleArgumentContent= ruleArgumentContent EOF )
            // InternalTexDsl.g:352:2: iv_ruleArgumentContent= ruleArgumentContent EOF
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
    // InternalTexDsl.g:358:1: ruleArgumentContent returns [EObject current=null] : (this_TextContent_0= ruleTextContent | this_Command_1= ruleCommand | this_MathExpression_2= ruleMathExpression ) ;
    public final EObject ruleArgumentContent() throws RecognitionException {
        EObject current = null;

        EObject this_TextContent_0 = null;

        EObject this_Command_1 = null;

        EObject this_MathExpression_2 = null;



        	enterRule();

        try {
            // InternalTexDsl.g:364:2: ( (this_TextContent_0= ruleTextContent | this_Command_1= ruleCommand | this_MathExpression_2= ruleMathExpression ) )
            // InternalTexDsl.g:365:2: (this_TextContent_0= ruleTextContent | this_Command_1= ruleCommand | this_MathExpression_2= ruleMathExpression )
            {
            // InternalTexDsl.g:365:2: (this_TextContent_0= ruleTextContent | this_Command_1= ruleCommand | this_MathExpression_2= ruleMathExpression )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_TEXT:
            case RULE_NUMBER:
            case RULE_SYMBOL:
            case 12:
            case 14:
                {
                alt7=1;
                }
                break;
            case 11:
                {
                alt7=2;
                }
                break;
            case 16:
            case 17:
                {
                alt7=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalTexDsl.g:366:3: this_TextContent_0= ruleTextContent
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
                    // InternalTexDsl.g:378:3: this_Command_1= ruleCommand
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
                    // InternalTexDsl.g:390:3: this_MathExpression_2= ruleMathExpression
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


    // $ANTLR start "entryRuleTextContainer"
    // InternalTexDsl.g:405:1: entryRuleTextContainer returns [EObject current=null] : iv_ruleTextContainer= ruleTextContainer EOF ;
    public final EObject entryRuleTextContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextContainer = null;


        try {
            // InternalTexDsl.g:405:54: (iv_ruleTextContainer= ruleTextContainer EOF )
            // InternalTexDsl.g:406:2: iv_ruleTextContainer= ruleTextContainer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTextContainerRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTextContainer=ruleTextContainer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTextContainer; 
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
    // $ANTLR end "entryRuleTextContainer"


    // $ANTLR start "ruleTextContainer"
    // InternalTexDsl.g:412:1: ruleTextContainer returns [EObject current=null] : ( (lv_text_0_0= RULE_TEXT ) )+ ;
    public final EObject ruleTextContainer() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;


        	enterRule();

        try {
            // InternalTexDsl.g:418:2: ( ( (lv_text_0_0= RULE_TEXT ) )+ )
            // InternalTexDsl.g:419:2: ( (lv_text_0_0= RULE_TEXT ) )+
            {
            // InternalTexDsl.g:419:2: ( (lv_text_0_0= RULE_TEXT ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_TEXT) ) {
                    int LA8_2 = input.LA(2);

                    if ( (synpred10_InternalTexDsl()) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // InternalTexDsl.g:420:3: (lv_text_0_0= RULE_TEXT )
            	    {
            	    // InternalTexDsl.g:420:3: (lv_text_0_0= RULE_TEXT )
            	    // InternalTexDsl.g:421:4: lv_text_0_0= RULE_TEXT
            	    {
            	    lv_text_0_0=(Token)match(input,RULE_TEXT,FollowSets000.FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(lv_text_0_0, grammarAccess.getTextContainerAccess().getTextTEXTTerminalRuleCall_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElement(grammarAccess.getTextContainerRule());
            	      				}
            	      				addWithLastConsumed(
            	      					current,
            	      					"text",
            	      					lv_text_0_0,
            	      					"org.xixum.latex.TexDsl.TEXT");
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
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
    // $ANTLR end "ruleTextContainer"


    // $ANTLR start "entryRuleTextContent"
    // InternalTexDsl.g:440:1: entryRuleTextContent returns [EObject current=null] : iv_ruleTextContent= ruleTextContent EOF ;
    public final EObject entryRuleTextContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextContent = null;


        try {
            // InternalTexDsl.g:440:52: (iv_ruleTextContent= ruleTextContent EOF )
            // InternalTexDsl.g:441:2: iv_ruleTextContent= ruleTextContent EOF
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
    // InternalTexDsl.g:447:1: ruleTextContent returns [EObject current=null] : (this_Identifiers_0= ruleIdentifiers | this_TextContainer_1= ruleTextContainer | this_Operators_2= ruleOperators | this_Numbers_3= ruleNumbers | this_OptionalArgument_4= ruleOptionalArgument | this_MandatoryArgument_5= ruleMandatoryArgument ) ;
    public final EObject ruleTextContent() throws RecognitionException {
        EObject current = null;

        EObject this_Identifiers_0 = null;

        EObject this_TextContainer_1 = null;

        EObject this_Operators_2 = null;

        EObject this_Numbers_3 = null;

        EObject this_OptionalArgument_4 = null;

        EObject this_MandatoryArgument_5 = null;



        	enterRule();

        try {
            // InternalTexDsl.g:453:2: ( (this_Identifiers_0= ruleIdentifiers | this_TextContainer_1= ruleTextContainer | this_Operators_2= ruleOperators | this_Numbers_3= ruleNumbers | this_OptionalArgument_4= ruleOptionalArgument | this_MandatoryArgument_5= ruleMandatoryArgument ) )
            // InternalTexDsl.g:454:2: (this_Identifiers_0= ruleIdentifiers | this_TextContainer_1= ruleTextContainer | this_Operators_2= ruleOperators | this_Numbers_3= ruleNumbers | this_OptionalArgument_4= ruleOptionalArgument | this_MandatoryArgument_5= ruleMandatoryArgument )
            {
            // InternalTexDsl.g:454:2: (this_Identifiers_0= ruleIdentifiers | this_TextContainer_1= ruleTextContainer | this_Operators_2= ruleOperators | this_Numbers_3= ruleNumbers | this_OptionalArgument_4= ruleOptionalArgument | this_MandatoryArgument_5= ruleMandatoryArgument )
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
            case 12:
                {
                alt9=5;
                }
                break;
            case 14:
                {
                alt9=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalTexDsl.g:455:3: this_Identifiers_0= ruleIdentifiers
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTextContentAccess().getIdentifiersParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Identifiers_0=ruleIdentifiers();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Identifiers_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalTexDsl.g:467:3: this_TextContainer_1= ruleTextContainer
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTextContentAccess().getTextContainerParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TextContainer_1=ruleTextContainer();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TextContainer_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalTexDsl.g:479:3: this_Operators_2= ruleOperators
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTextContentAccess().getOperatorsParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Operators_2=ruleOperators();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Operators_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalTexDsl.g:491:3: this_Numbers_3= ruleNumbers
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTextContentAccess().getNumbersParserRuleCall_3());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Numbers_3=ruleNumbers();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Numbers_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalTexDsl.g:503:3: this_OptionalArgument_4= ruleOptionalArgument
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTextContentAccess().getOptionalArgumentParserRuleCall_4());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_OptionalArgument_4=ruleOptionalArgument();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_OptionalArgument_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalTexDsl.g:515:3: this_MandatoryArgument_5= ruleMandatoryArgument
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTextContentAccess().getMandatoryArgumentParserRuleCall_5());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_MandatoryArgument_5=ruleMandatoryArgument();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MandatoryArgument_5;
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
    // $ANTLR end "ruleTextContent"


    // $ANTLR start "entryRuleIdentifiers"
    // InternalTexDsl.g:530:1: entryRuleIdentifiers returns [EObject current=null] : iv_ruleIdentifiers= ruleIdentifiers EOF ;
    public final EObject entryRuleIdentifiers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdentifiers = null;


        try {
            // InternalTexDsl.g:530:52: (iv_ruleIdentifiers= ruleIdentifiers EOF )
            // InternalTexDsl.g:531:2: iv_ruleIdentifiers= ruleIdentifiers EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdentifiersRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleIdentifiers=ruleIdentifiers();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdentifiers; 
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
    // $ANTLR end "entryRuleIdentifiers"


    // $ANTLR start "ruleIdentifiers"
    // InternalTexDsl.g:537:1: ruleIdentifiers returns [EObject current=null] : ( (lv_id_0_0= RULE_ID ) ) ;
    public final EObject ruleIdentifiers() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;


        	enterRule();

        try {
            // InternalTexDsl.g:543:2: ( ( (lv_id_0_0= RULE_ID ) ) )
            // InternalTexDsl.g:544:2: ( (lv_id_0_0= RULE_ID ) )
            {
            // InternalTexDsl.g:544:2: ( (lv_id_0_0= RULE_ID ) )
            // InternalTexDsl.g:545:3: (lv_id_0_0= RULE_ID )
            {
            // InternalTexDsl.g:545:3: (lv_id_0_0= RULE_ID )
            // InternalTexDsl.g:546:4: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_id_0_0, grammarAccess.getIdentifiersAccess().getIdIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getIdentifiersRule());
              				}
              				setWithLastConsumed(
              					current,
              					"id",
              					lv_id_0_0,
              					"org.xixum.latex.TexDsl.ID");
              			
            }

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
    // $ANTLR end "ruleIdentifiers"


    // $ANTLR start "entryRuleNumbers"
    // InternalTexDsl.g:565:1: entryRuleNumbers returns [EObject current=null] : iv_ruleNumbers= ruleNumbers EOF ;
    public final EObject entryRuleNumbers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumbers = null;


        try {
            // InternalTexDsl.g:565:48: (iv_ruleNumbers= ruleNumbers EOF )
            // InternalTexDsl.g:566:2: iv_ruleNumbers= ruleNumbers EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumbersRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNumbers=ruleNumbers();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumbers; 
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
    // $ANTLR end "entryRuleNumbers"


    // $ANTLR start "ruleNumbers"
    // InternalTexDsl.g:572:1: ruleNumbers returns [EObject current=null] : ( (lv_num_0_0= RULE_NUMBER ) ) ;
    public final EObject ruleNumbers() throws RecognitionException {
        EObject current = null;

        Token lv_num_0_0=null;


        	enterRule();

        try {
            // InternalTexDsl.g:578:2: ( ( (lv_num_0_0= RULE_NUMBER ) ) )
            // InternalTexDsl.g:579:2: ( (lv_num_0_0= RULE_NUMBER ) )
            {
            // InternalTexDsl.g:579:2: ( (lv_num_0_0= RULE_NUMBER ) )
            // InternalTexDsl.g:580:3: (lv_num_0_0= RULE_NUMBER )
            {
            // InternalTexDsl.g:580:3: (lv_num_0_0= RULE_NUMBER )
            // InternalTexDsl.g:581:4: lv_num_0_0= RULE_NUMBER
            {
            lv_num_0_0=(Token)match(input,RULE_NUMBER,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_num_0_0, grammarAccess.getNumbersAccess().getNumNUMBERTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getNumbersRule());
              				}
              				setWithLastConsumed(
              					current,
              					"num",
              					lv_num_0_0,
              					"org.xixum.latex.TexDsl.NUMBER");
              			
            }

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
    // $ANTLR end "ruleNumbers"


    // $ANTLR start "entryRuleOperators"
    // InternalTexDsl.g:600:1: entryRuleOperators returns [EObject current=null] : iv_ruleOperators= ruleOperators EOF ;
    public final EObject entryRuleOperators() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperators = null;


        try {
            // InternalTexDsl.g:600:50: (iv_ruleOperators= ruleOperators EOF )
            // InternalTexDsl.g:601:2: iv_ruleOperators= ruleOperators EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperatorsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleOperators=ruleOperators();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperators; 
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
    // $ANTLR end "entryRuleOperators"


    // $ANTLR start "ruleOperators"
    // InternalTexDsl.g:607:1: ruleOperators returns [EObject current=null] : ( (lv_op_0_0= RULE_SYMBOL ) )+ ;
    public final EObject ruleOperators() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_0=null;


        	enterRule();

        try {
            // InternalTexDsl.g:613:2: ( ( (lv_op_0_0= RULE_SYMBOL ) )+ )
            // InternalTexDsl.g:614:2: ( (lv_op_0_0= RULE_SYMBOL ) )+
            {
            // InternalTexDsl.g:614:2: ( (lv_op_0_0= RULE_SYMBOL ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_SYMBOL) ) {
                    int LA10_2 = input.LA(2);

                    if ( (synpred16_InternalTexDsl()) ) {
                        alt10=1;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // InternalTexDsl.g:615:3: (lv_op_0_0= RULE_SYMBOL )
            	    {
            	    // InternalTexDsl.g:615:3: (lv_op_0_0= RULE_SYMBOL )
            	    // InternalTexDsl.g:616:4: lv_op_0_0= RULE_SYMBOL
            	    {
            	    lv_op_0_0=(Token)match(input,RULE_SYMBOL,FollowSets000.FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(lv_op_0_0, grammarAccess.getOperatorsAccess().getOpSYMBOLTerminalRuleCall_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElement(grammarAccess.getOperatorsRule());
            	      				}
            	      				addWithLastConsumed(
            	      					current,
            	      					"op",
            	      					lv_op_0_0,
            	      					"org.xixum.latex.TexDsl.SYMBOL");
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
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
    // $ANTLR end "ruleOperators"


    // $ANTLR start "entryRuleMathExpression"
    // InternalTexDsl.g:635:1: entryRuleMathExpression returns [EObject current=null] : iv_ruleMathExpression= ruleMathExpression EOF ;
    public final EObject entryRuleMathExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathExpression = null;


        try {
            // InternalTexDsl.g:635:55: (iv_ruleMathExpression= ruleMathExpression EOF )
            // InternalTexDsl.g:636:2: iv_ruleMathExpression= ruleMathExpression EOF
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
    // InternalTexDsl.g:642:1: ruleMathExpression returns [EObject current=null] : (this_InlineMath_0= ruleInlineMath | this_DisplayMath_1= ruleDisplayMath ) ;
    public final EObject ruleMathExpression() throws RecognitionException {
        EObject current = null;

        EObject this_InlineMath_0 = null;

        EObject this_DisplayMath_1 = null;



        	enterRule();

        try {
            // InternalTexDsl.g:648:2: ( (this_InlineMath_0= ruleInlineMath | this_DisplayMath_1= ruleDisplayMath ) )
            // InternalTexDsl.g:649:2: (this_InlineMath_0= ruleInlineMath | this_DisplayMath_1= ruleDisplayMath )
            {
            // InternalTexDsl.g:649:2: (this_InlineMath_0= ruleInlineMath | this_DisplayMath_1= ruleDisplayMath )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==16) ) {
                alt11=1;
            }
            else if ( (LA11_0==17) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalTexDsl.g:650:3: this_InlineMath_0= ruleInlineMath
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
                    // InternalTexDsl.g:662:3: this_DisplayMath_1= ruleDisplayMath
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
    // InternalTexDsl.g:677:1: entryRuleInlineMath returns [EObject current=null] : iv_ruleInlineMath= ruleInlineMath EOF ;
    public final EObject entryRuleInlineMath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInlineMath = null;


        try {
            // InternalTexDsl.g:677:51: (iv_ruleInlineMath= ruleInlineMath EOF )
            // InternalTexDsl.g:678:2: iv_ruleInlineMath= ruleInlineMath EOF
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
    // InternalTexDsl.g:684:1: ruleInlineMath returns [EObject current=null] : ( () otherlv_1= '$' ( (lv_content_2_0= ruleMathContent ) )* otherlv_3= '$' ) ;
    public final EObject ruleInlineMath() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalTexDsl.g:690:2: ( ( () otherlv_1= '$' ( (lv_content_2_0= ruleMathContent ) )* otherlv_3= '$' ) )
            // InternalTexDsl.g:691:2: ( () otherlv_1= '$' ( (lv_content_2_0= ruleMathContent ) )* otherlv_3= '$' )
            {
            // InternalTexDsl.g:691:2: ( () otherlv_1= '$' ( (lv_content_2_0= ruleMathContent ) )* otherlv_3= '$' )
            // InternalTexDsl.g:692:3: () otherlv_1= '$' ( (lv_content_2_0= ruleMathContent ) )* otherlv_3= '$'
            {
            // InternalTexDsl.g:692:3: ()
            // InternalTexDsl.g:693:4: 
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

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getInlineMathAccess().getDollarSignKeyword_1());
              		
            }
            // InternalTexDsl.g:706:3: ( (lv_content_2_0= ruleMathContent ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_SYMBOL)||(LA12_0>=11 && LA12_0<=12)||LA12_0==14) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalTexDsl.g:707:4: (lv_content_2_0= ruleMathContent )
            	    {
            	    // InternalTexDsl.g:707:4: (lv_content_2_0= ruleMathContent )
            	    // InternalTexDsl.g:708:5: lv_content_2_0= ruleMathContent
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getInlineMathAccess().getContentMathContentParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_10);
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
            	    break loop12;
                }
            } while (true);

            otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalTexDsl.g:733:1: entryRuleDisplayMath returns [EObject current=null] : iv_ruleDisplayMath= ruleDisplayMath EOF ;
    public final EObject entryRuleDisplayMath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisplayMath = null;


        try {
            // InternalTexDsl.g:733:52: (iv_ruleDisplayMath= ruleDisplayMath EOF )
            // InternalTexDsl.g:734:2: iv_ruleDisplayMath= ruleDisplayMath EOF
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
    // InternalTexDsl.g:740:1: ruleDisplayMath returns [EObject current=null] : ( () otherlv_1= '$$' ( (lv_content_2_0= ruleMathContent ) )* otherlv_3= '$$' ) ;
    public final EObject ruleDisplayMath() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalTexDsl.g:746:2: ( ( () otherlv_1= '$$' ( (lv_content_2_0= ruleMathContent ) )* otherlv_3= '$$' ) )
            // InternalTexDsl.g:747:2: ( () otherlv_1= '$$' ( (lv_content_2_0= ruleMathContent ) )* otherlv_3= '$$' )
            {
            // InternalTexDsl.g:747:2: ( () otherlv_1= '$$' ( (lv_content_2_0= ruleMathContent ) )* otherlv_3= '$$' )
            // InternalTexDsl.g:748:3: () otherlv_1= '$$' ( (lv_content_2_0= ruleMathContent ) )* otherlv_3= '$$'
            {
            // InternalTexDsl.g:748:3: ()
            // InternalTexDsl.g:749:4: 
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

            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDisplayMathAccess().getDollarSignDollarSignKeyword_1());
              		
            }
            // InternalTexDsl.g:762:3: ( (lv_content_2_0= ruleMathContent ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_ID && LA13_0<=RULE_SYMBOL)||(LA13_0>=11 && LA13_0<=12)||LA13_0==14) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalTexDsl.g:763:4: (lv_content_2_0= ruleMathContent )
            	    {
            	    // InternalTexDsl.g:763:4: (lv_content_2_0= ruleMathContent )
            	    // InternalTexDsl.g:764:5: lv_content_2_0= ruleMathContent
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDisplayMathAccess().getContentMathContentParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_11);
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
            	    break loop13;
                }
            } while (true);

            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalTexDsl.g:789:1: entryRuleMathContent returns [EObject current=null] : iv_ruleMathContent= ruleMathContent EOF ;
    public final EObject entryRuleMathContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathContent = null;


        try {
            // InternalTexDsl.g:789:52: (iv_ruleMathContent= ruleMathContent EOF )
            // InternalTexDsl.g:790:2: iv_ruleMathContent= ruleMathContent EOF
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
    // InternalTexDsl.g:796:1: ruleMathContent returns [EObject current=null] : (this_Command_0= ruleCommand | this_TextContent_1= ruleTextContent | this_Numbers_2= ruleNumbers | this_Operators_3= ruleOperators ) ;
    public final EObject ruleMathContent() throws RecognitionException {
        EObject current = null;

        EObject this_Command_0 = null;

        EObject this_TextContent_1 = null;

        EObject this_Numbers_2 = null;

        EObject this_Operators_3 = null;



        	enterRule();

        try {
            // InternalTexDsl.g:802:2: ( (this_Command_0= ruleCommand | this_TextContent_1= ruleTextContent | this_Numbers_2= ruleNumbers | this_Operators_3= ruleOperators ) )
            // InternalTexDsl.g:803:2: (this_Command_0= ruleCommand | this_TextContent_1= ruleTextContent | this_Numbers_2= ruleNumbers | this_Operators_3= ruleOperators )
            {
            // InternalTexDsl.g:803:2: (this_Command_0= ruleCommand | this_TextContent_1= ruleTextContent | this_Numbers_2= ruleNumbers | this_Operators_3= ruleOperators )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt14=1;
                }
                break;
            case RULE_ID:
            case RULE_TEXT:
            case 12:
            case 14:
                {
                alt14=2;
                }
                break;
            case RULE_SYMBOL:
                {
                int LA14_3 = input.LA(2);

                if ( (synpred21_InternalTexDsl()) ) {
                    alt14=2;
                }
                else if ( (true) ) {
                    alt14=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_NUMBER:
                {
                int LA14_4 = input.LA(2);

                if ( (synpred21_InternalTexDsl()) ) {
                    alt14=2;
                }
                else if ( (synpred22_InternalTexDsl()) ) {
                    alt14=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalTexDsl.g:804:3: this_Command_0= ruleCommand
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
                    // InternalTexDsl.g:816:3: this_TextContent_1= ruleTextContent
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMathContentAccess().getTextContentParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TextContent_1=ruleTextContent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TextContent_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalTexDsl.g:828:3: this_Numbers_2= ruleNumbers
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMathContentAccess().getNumbersParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Numbers_2=ruleNumbers();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Numbers_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalTexDsl.g:840:3: this_Operators_3= ruleOperators
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMathContentAccess().getOperatorsParserRuleCall_3());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Operators_3=ruleOperators();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Operators_3;
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
    // $ANTLR end "ruleMathContent"

    // $ANTLR start synpred4_InternalTexDsl
    public final void synpred4_InternalTexDsl_fragment() throws RecognitionException {   
        EObject lv_optionalArgs_2_0 = null;


        // InternalTexDsl.g:198:4: ( (lv_optionalArgs_2_0= ruleOptionalArgument ) )
        // InternalTexDsl.g:198:4: (lv_optionalArgs_2_0= ruleOptionalArgument )
        {
        // InternalTexDsl.g:198:4: (lv_optionalArgs_2_0= ruleOptionalArgument )
        // InternalTexDsl.g:199:5: lv_optionalArgs_2_0= ruleOptionalArgument
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getCommandAccess().getOptionalArgsOptionalArgumentParserRuleCall_2_0());
          				
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_optionalArgs_2_0=ruleOptionalArgument();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred4_InternalTexDsl

    // $ANTLR start synpred5_InternalTexDsl
    public final void synpred5_InternalTexDsl_fragment() throws RecognitionException {   
        EObject lv_mandatoryArgs_3_0 = null;


        // InternalTexDsl.g:217:4: ( (lv_mandatoryArgs_3_0= ruleMandatoryArgument ) )
        // InternalTexDsl.g:217:4: (lv_mandatoryArgs_3_0= ruleMandatoryArgument )
        {
        // InternalTexDsl.g:217:4: (lv_mandatoryArgs_3_0= ruleMandatoryArgument )
        // InternalTexDsl.g:218:5: lv_mandatoryArgs_3_0= ruleMandatoryArgument
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getCommandAccess().getMandatoryArgsMandatoryArgumentParserRuleCall_3_0());
          				
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_mandatoryArgs_3_0=ruleMandatoryArgument();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalTexDsl

    // $ANTLR start synpred10_InternalTexDsl
    public final void synpred10_InternalTexDsl_fragment() throws RecognitionException {   
        Token lv_text_0_0=null;

        // InternalTexDsl.g:420:3: ( (lv_text_0_0= RULE_TEXT ) )
        // InternalTexDsl.g:420:3: (lv_text_0_0= RULE_TEXT )
        {
        // InternalTexDsl.g:420:3: (lv_text_0_0= RULE_TEXT )
        // InternalTexDsl.g:421:4: lv_text_0_0= RULE_TEXT
        {
        lv_text_0_0=(Token)match(input,RULE_TEXT,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred10_InternalTexDsl

    // $ANTLR start synpred16_InternalTexDsl
    public final void synpred16_InternalTexDsl_fragment() throws RecognitionException {   
        Token lv_op_0_0=null;

        // InternalTexDsl.g:615:3: ( (lv_op_0_0= RULE_SYMBOL ) )
        // InternalTexDsl.g:615:3: (lv_op_0_0= RULE_SYMBOL )
        {
        // InternalTexDsl.g:615:3: (lv_op_0_0= RULE_SYMBOL )
        // InternalTexDsl.g:616:4: lv_op_0_0= RULE_SYMBOL
        {
        lv_op_0_0=(Token)match(input,RULE_SYMBOL,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred16_InternalTexDsl

    // $ANTLR start synpred21_InternalTexDsl
    public final void synpred21_InternalTexDsl_fragment() throws RecognitionException {   
        EObject this_TextContent_1 = null;


        // InternalTexDsl.g:816:3: (this_TextContent_1= ruleTextContent )
        // InternalTexDsl.g:816:3: this_TextContent_1= ruleTextContent
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_TextContent_1=ruleTextContent();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred21_InternalTexDsl

    // $ANTLR start synpred22_InternalTexDsl
    public final void synpred22_InternalTexDsl_fragment() throws RecognitionException {   
        EObject this_Numbers_2 = null;


        // InternalTexDsl.g:828:3: (this_Numbers_2= ruleNumbers )
        // InternalTexDsl.g:828:3: this_Numbers_2= ruleNumbers
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_Numbers_2=ruleNumbers();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalTexDsl

    // Delegated rules

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
    public final boolean synpred21_InternalTexDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalTexDsl_fragment(); // can never throw exception
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
    public final boolean synpred22_InternalTexDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalTexDsl_fragment(); // can never throw exception
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


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\16\uffff";
    static final String dfa_2s = "\1\1\15\uffff";
    static final String dfa_3s = "\1\4\7\uffff\1\0\5\uffff";
    static final String dfa_4s = "\1\21\7\uffff\1\0\5\uffff";
    static final String dfa_5s = "\1\uffff\1\2\13\uffff\1\1";
    static final String dfa_6s = "\10\uffff\1\0\5\uffff}>";
    static final String[] dfa_7s = {
            "\4\1\3\uffff\1\1\1\10\5\1",
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

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 197:3: ( (lv_optionalArgs_2_0= ruleOptionalArgument ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA3_8 = input.LA(1);

                         
                        int index3_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalTexDsl()) ) {s = 13;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index3_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 3, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String[] dfa_8s = {
            "\4\1\3\uffff\3\1\1\10\3\1",
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

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_8;
        }
        public String getDescription() {
            return "()* loopback of 216:3: ( (lv_mandatoryArgs_3_0= ruleMandatoryArgument ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA4_8 = input.LA(1);

                         
                        int index4_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalTexDsl()) ) {s = 13;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index4_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 4, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000000358F2L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000050F2L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000378F0L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000003D8F0L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000022L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000082L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000158F0L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000258F0L});
    }


}