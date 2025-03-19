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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BS", "RULE_ID", "RULE_SQBO", "RULE_SQBC", "RULE_CUBO", "RULE_CUBC", "RULE_TEXT", "RULE_SYMBOL", "RULE_NUMBER", "RULE_SL_COMMENT", "RULE_INT", "RULE_WS", "'begin{codeblock}'", "'end{codeblock}'", "'$'", "'$$'"
    };
    public static final int RULE_CUBO=8;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=15;
    public static final int RULE_SQBO=6;
    public static final int RULE_SQBC=7;
    public static final int RULE_NUMBER=12;
    public static final int RULE_BS=4;
    public static final int RULE_INT=14;
    public static final int RULE_CUBC=9;
    public static final int RULE_TEXT=10;
    public static final int RULE_SYMBOL=11;

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

                if ( ((LA1_0>=RULE_BS && LA1_0<=RULE_SQBO)||LA1_0==RULE_CUBO||(LA1_0>=RULE_TEXT && LA1_0<=RULE_NUMBER)||(LA1_0>=18 && LA1_0<=19)) ) {
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
    // InternalTexDsl.g:113:1: ruleElement returns [EObject current=null] : (this_Command_0= ruleCommand | this_TextContent_1= ruleTextContent | this_MathExpression_2= ruleMathExpression | this_Codeblock_3= ruleCodeblock ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Command_0 = null;

        EObject this_TextContent_1 = null;

        EObject this_MathExpression_2 = null;

        EObject this_Codeblock_3 = null;



        	enterRule();

        try {
            // InternalTexDsl.g:119:2: ( (this_Command_0= ruleCommand | this_TextContent_1= ruleTextContent | this_MathExpression_2= ruleMathExpression | this_Codeblock_3= ruleCodeblock ) )
            // InternalTexDsl.g:120:2: (this_Command_0= ruleCommand | this_TextContent_1= ruleTextContent | this_MathExpression_2= ruleMathExpression | this_Codeblock_3= ruleCodeblock )
            {
            // InternalTexDsl.g:120:2: (this_Command_0= ruleCommand | this_TextContent_1= ruleTextContent | this_MathExpression_2= ruleMathExpression | this_Codeblock_3= ruleCodeblock )
            int alt2=4;
            switch ( input.LA(1) ) {
            case RULE_BS:
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==16) ) {
                    alt2=4;
                }
                else if ( (LA2_1==RULE_ID) ) {
                    alt2=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
            case RULE_SQBO:
            case RULE_CUBO:
            case RULE_TEXT:
            case RULE_SYMBOL:
            case RULE_NUMBER:
                {
                alt2=2;
                }
                break;
            case 18:
            case 19:
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
                case 4 :
                    // InternalTexDsl.g:157:3: this_Codeblock_3= ruleCodeblock
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getElementAccess().getCodeblockParserRuleCall_3());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Codeblock_3=ruleCodeblock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Codeblock_3;
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
    // InternalTexDsl.g:179:1: ruleCommand returns [EObject current=null] : ( ( ( RULE_BS )=>this_BS_0= RULE_BS ) ( (lv_command_1_0= RULE_ID ) ) ( (lv_optionalArgs_2_0= ruleOptionalArgument ) )* ( (lv_mandatoryArgs_3_0= ruleMandatoryArgument ) )* ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token this_BS_0=null;
        Token lv_command_1_0=null;
        EObject lv_optionalArgs_2_0 = null;

        EObject lv_mandatoryArgs_3_0 = null;



        	enterRule();

        try {
            // InternalTexDsl.g:185:2: ( ( ( ( RULE_BS )=>this_BS_0= RULE_BS ) ( (lv_command_1_0= RULE_ID ) ) ( (lv_optionalArgs_2_0= ruleOptionalArgument ) )* ( (lv_mandatoryArgs_3_0= ruleMandatoryArgument ) )* ) )
            // InternalTexDsl.g:186:2: ( ( ( RULE_BS )=>this_BS_0= RULE_BS ) ( (lv_command_1_0= RULE_ID ) ) ( (lv_optionalArgs_2_0= ruleOptionalArgument ) )* ( (lv_mandatoryArgs_3_0= ruleMandatoryArgument ) )* )
            {
            // InternalTexDsl.g:186:2: ( ( ( RULE_BS )=>this_BS_0= RULE_BS ) ( (lv_command_1_0= RULE_ID ) ) ( (lv_optionalArgs_2_0= ruleOptionalArgument ) )* ( (lv_mandatoryArgs_3_0= ruleMandatoryArgument ) )* )
            // InternalTexDsl.g:187:3: ( ( RULE_BS )=>this_BS_0= RULE_BS ) ( (lv_command_1_0= RULE_ID ) ) ( (lv_optionalArgs_2_0= ruleOptionalArgument ) )* ( (lv_mandatoryArgs_3_0= ruleMandatoryArgument ) )*
            {
            // InternalTexDsl.g:187:3: ( ( RULE_BS )=>this_BS_0= RULE_BS )
            // InternalTexDsl.g:188:4: ( RULE_BS )=>this_BS_0= RULE_BS
            {
            this_BS_0=(Token)match(input,RULE_BS,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(this_BS_0, grammarAccess.getCommandAccess().getBSTerminalRuleCall_0());
              			
            }

            }

            // InternalTexDsl.g:194:3: ( (lv_command_1_0= RULE_ID ) )
            // InternalTexDsl.g:195:4: (lv_command_1_0= RULE_ID )
            {
            // InternalTexDsl.g:195:4: (lv_command_1_0= RULE_ID )
            // InternalTexDsl.g:196:5: lv_command_1_0= RULE_ID
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

            // InternalTexDsl.g:212:3: ( (lv_optionalArgs_2_0= ruleOptionalArgument ) )*
            loop3:
            do {
                int alt3=2;
                alt3 = dfa3.predict(input);
                switch (alt3) {
            	case 1 :
            	    // InternalTexDsl.g:213:4: (lv_optionalArgs_2_0= ruleOptionalArgument )
            	    {
            	    // InternalTexDsl.g:213:4: (lv_optionalArgs_2_0= ruleOptionalArgument )
            	    // InternalTexDsl.g:214:5: lv_optionalArgs_2_0= ruleOptionalArgument
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

            // InternalTexDsl.g:231:3: ( (lv_mandatoryArgs_3_0= ruleMandatoryArgument ) )*
            loop4:
            do {
                int alt4=2;
                alt4 = dfa4.predict(input);
                switch (alt4) {
            	case 1 :
            	    // InternalTexDsl.g:232:4: (lv_mandatoryArgs_3_0= ruleMandatoryArgument )
            	    {
            	    // InternalTexDsl.g:232:4: (lv_mandatoryArgs_3_0= ruleMandatoryArgument )
            	    // InternalTexDsl.g:233:5: lv_mandatoryArgs_3_0= ruleMandatoryArgument
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
    // InternalTexDsl.g:254:1: entryRuleOptionalArgument returns [EObject current=null] : iv_ruleOptionalArgument= ruleOptionalArgument EOF ;
    public final EObject entryRuleOptionalArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionalArgument = null;


        try {
            // InternalTexDsl.g:254:57: (iv_ruleOptionalArgument= ruleOptionalArgument EOF )
            // InternalTexDsl.g:255:2: iv_ruleOptionalArgument= ruleOptionalArgument EOF
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
    // InternalTexDsl.g:261:1: ruleOptionalArgument returns [EObject current=null] : ( () this_SQBO_1= RULE_SQBO ( (lv_content_2_0= ruleArgumentContent ) )* this_SQBC_3= RULE_SQBC ) ;
    public final EObject ruleOptionalArgument() throws RecognitionException {
        EObject current = null;

        Token this_SQBO_1=null;
        Token this_SQBC_3=null;
        EObject lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalTexDsl.g:267:2: ( ( () this_SQBO_1= RULE_SQBO ( (lv_content_2_0= ruleArgumentContent ) )* this_SQBC_3= RULE_SQBC ) )
            // InternalTexDsl.g:268:2: ( () this_SQBO_1= RULE_SQBO ( (lv_content_2_0= ruleArgumentContent ) )* this_SQBC_3= RULE_SQBC )
            {
            // InternalTexDsl.g:268:2: ( () this_SQBO_1= RULE_SQBO ( (lv_content_2_0= ruleArgumentContent ) )* this_SQBC_3= RULE_SQBC )
            // InternalTexDsl.g:269:3: () this_SQBO_1= RULE_SQBO ( (lv_content_2_0= ruleArgumentContent ) )* this_SQBC_3= RULE_SQBC
            {
            // InternalTexDsl.g:269:3: ()
            // InternalTexDsl.g:270:4: 
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

            this_SQBO_1=(Token)match(input,RULE_SQBO,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_SQBO_1, grammarAccess.getOptionalArgumentAccess().getSQBOTerminalRuleCall_1());
              		
            }
            // InternalTexDsl.g:283:3: ( (lv_content_2_0= ruleArgumentContent ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_BS && LA5_0<=RULE_SQBO)||LA5_0==RULE_CUBO||(LA5_0>=RULE_TEXT && LA5_0<=RULE_NUMBER)||(LA5_0>=18 && LA5_0<=19)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTexDsl.g:284:4: (lv_content_2_0= ruleArgumentContent )
            	    {
            	    // InternalTexDsl.g:284:4: (lv_content_2_0= ruleArgumentContent )
            	    // InternalTexDsl.g:285:5: lv_content_2_0= ruleArgumentContent
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

            this_SQBC_3=(Token)match(input,RULE_SQBC,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_SQBC_3, grammarAccess.getOptionalArgumentAccess().getSQBCTerminalRuleCall_3());
              		
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
    // InternalTexDsl.g:310:1: entryRuleMandatoryArgument returns [EObject current=null] : iv_ruleMandatoryArgument= ruleMandatoryArgument EOF ;
    public final EObject entryRuleMandatoryArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMandatoryArgument = null;


        try {
            // InternalTexDsl.g:310:58: (iv_ruleMandatoryArgument= ruleMandatoryArgument EOF )
            // InternalTexDsl.g:311:2: iv_ruleMandatoryArgument= ruleMandatoryArgument EOF
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
    // InternalTexDsl.g:317:1: ruleMandatoryArgument returns [EObject current=null] : ( () this_CUBO_1= RULE_CUBO ( (lv_content_2_0= ruleArgumentContent ) )* this_CUBC_3= RULE_CUBC ) ;
    public final EObject ruleMandatoryArgument() throws RecognitionException {
        EObject current = null;

        Token this_CUBO_1=null;
        Token this_CUBC_3=null;
        EObject lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalTexDsl.g:323:2: ( ( () this_CUBO_1= RULE_CUBO ( (lv_content_2_0= ruleArgumentContent ) )* this_CUBC_3= RULE_CUBC ) )
            // InternalTexDsl.g:324:2: ( () this_CUBO_1= RULE_CUBO ( (lv_content_2_0= ruleArgumentContent ) )* this_CUBC_3= RULE_CUBC )
            {
            // InternalTexDsl.g:324:2: ( () this_CUBO_1= RULE_CUBO ( (lv_content_2_0= ruleArgumentContent ) )* this_CUBC_3= RULE_CUBC )
            // InternalTexDsl.g:325:3: () this_CUBO_1= RULE_CUBO ( (lv_content_2_0= ruleArgumentContent ) )* this_CUBC_3= RULE_CUBC
            {
            // InternalTexDsl.g:325:3: ()
            // InternalTexDsl.g:326:4: 
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

            this_CUBO_1=(Token)match(input,RULE_CUBO,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_CUBO_1, grammarAccess.getMandatoryArgumentAccess().getCUBOTerminalRuleCall_1());
              		
            }
            // InternalTexDsl.g:339:3: ( (lv_content_2_0= ruleArgumentContent ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_BS && LA6_0<=RULE_SQBO)||LA6_0==RULE_CUBO||(LA6_0>=RULE_TEXT && LA6_0<=RULE_NUMBER)||(LA6_0>=18 && LA6_0<=19)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalTexDsl.g:340:4: (lv_content_2_0= ruleArgumentContent )
            	    {
            	    // InternalTexDsl.g:340:4: (lv_content_2_0= ruleArgumentContent )
            	    // InternalTexDsl.g:341:5: lv_content_2_0= ruleArgumentContent
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

            this_CUBC_3=(Token)match(input,RULE_CUBC,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_CUBC_3, grammarAccess.getMandatoryArgumentAccess().getCUBCTerminalRuleCall_3());
              		
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


    // $ANTLR start "entryRuleCodeblock"
    // InternalTexDsl.g:366:1: entryRuleCodeblock returns [EObject current=null] : iv_ruleCodeblock= ruleCodeblock EOF ;
    public final EObject entryRuleCodeblock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCodeblock = null;


        try {
            // InternalTexDsl.g:366:50: (iv_ruleCodeblock= ruleCodeblock EOF )
            // InternalTexDsl.g:367:2: iv_ruleCodeblock= ruleCodeblock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCodeblockRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCodeblock=ruleCodeblock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCodeblock; 
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
    // $ANTLR end "entryRuleCodeblock"


    // $ANTLR start "ruleCodeblock"
    // InternalTexDsl.g:373:1: ruleCodeblock returns [EObject current=null] : (this_BS_0= RULE_BS ( ( 'begin{codeblock}' )=>otherlv_1= 'begin{codeblock}' ) ( (lv_content_2_0= ruleCodeblockContent ) ) this_BS_3= RULE_BS ( ( 'end{codeblock}' )=>otherlv_4= 'end{codeblock}' ) ) ;
    public final EObject ruleCodeblock() throws RecognitionException {
        EObject current = null;

        Token this_BS_0=null;
        Token otherlv_1=null;
        Token this_BS_3=null;
        Token otherlv_4=null;
        EObject lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalTexDsl.g:379:2: ( (this_BS_0= RULE_BS ( ( 'begin{codeblock}' )=>otherlv_1= 'begin{codeblock}' ) ( (lv_content_2_0= ruleCodeblockContent ) ) this_BS_3= RULE_BS ( ( 'end{codeblock}' )=>otherlv_4= 'end{codeblock}' ) ) )
            // InternalTexDsl.g:380:2: (this_BS_0= RULE_BS ( ( 'begin{codeblock}' )=>otherlv_1= 'begin{codeblock}' ) ( (lv_content_2_0= ruleCodeblockContent ) ) this_BS_3= RULE_BS ( ( 'end{codeblock}' )=>otherlv_4= 'end{codeblock}' ) )
            {
            // InternalTexDsl.g:380:2: (this_BS_0= RULE_BS ( ( 'begin{codeblock}' )=>otherlv_1= 'begin{codeblock}' ) ( (lv_content_2_0= ruleCodeblockContent ) ) this_BS_3= RULE_BS ( ( 'end{codeblock}' )=>otherlv_4= 'end{codeblock}' ) )
            // InternalTexDsl.g:381:3: this_BS_0= RULE_BS ( ( 'begin{codeblock}' )=>otherlv_1= 'begin{codeblock}' ) ( (lv_content_2_0= ruleCodeblockContent ) ) this_BS_3= RULE_BS ( ( 'end{codeblock}' )=>otherlv_4= 'end{codeblock}' )
            {
            this_BS_0=(Token)match(input,RULE_BS,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_BS_0, grammarAccess.getCodeblockAccess().getBSTerminalRuleCall_0());
              		
            }
            // InternalTexDsl.g:385:3: ( ( 'begin{codeblock}' )=>otherlv_1= 'begin{codeblock}' )
            // InternalTexDsl.g:386:4: ( 'begin{codeblock}' )=>otherlv_1= 'begin{codeblock}'
            {
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_1, grammarAccess.getCodeblockAccess().getBeginCodeblockKeyword_1());
              			
            }

            }

            // InternalTexDsl.g:392:3: ( (lv_content_2_0= ruleCodeblockContent ) )
            // InternalTexDsl.g:393:4: (lv_content_2_0= ruleCodeblockContent )
            {
            // InternalTexDsl.g:393:4: (lv_content_2_0= ruleCodeblockContent )
            // InternalTexDsl.g:394:5: lv_content_2_0= ruleCodeblockContent
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCodeblockAccess().getContentCodeblockContentParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_10);
            lv_content_2_0=ruleCodeblockContent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCodeblockRule());
              					}
              					set(
              						current,
              						"content",
              						lv_content_2_0,
              						"org.xixum.latex.TexDsl.CodeblockContent");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            this_BS_3=(Token)match(input,RULE_BS,FollowSets000.FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_BS_3, grammarAccess.getCodeblockAccess().getBSTerminalRuleCall_3());
              		
            }
            // InternalTexDsl.g:415:3: ( ( 'end{codeblock}' )=>otherlv_4= 'end{codeblock}' )
            // InternalTexDsl.g:416:4: ( 'end{codeblock}' )=>otherlv_4= 'end{codeblock}'
            {
            otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_4, grammarAccess.getCodeblockAccess().getEndCodeblockKeyword_4());
              			
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
    // $ANTLR end "ruleCodeblock"


    // $ANTLR start "entryRuleCodeblockContent"
    // InternalTexDsl.g:426:1: entryRuleCodeblockContent returns [EObject current=null] : iv_ruleCodeblockContent= ruleCodeblockContent EOF ;
    public final EObject entryRuleCodeblockContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCodeblockContent = null;


        try {
            // InternalTexDsl.g:426:57: (iv_ruleCodeblockContent= ruleCodeblockContent EOF )
            // InternalTexDsl.g:427:2: iv_ruleCodeblockContent= ruleCodeblockContent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCodeblockContentRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCodeblockContent=ruleCodeblockContent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCodeblockContent; 
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
    // $ANTLR end "entryRuleCodeblockContent"


    // $ANTLR start "ruleCodeblockContent"
    // InternalTexDsl.g:433:1: ruleCodeblockContent returns [EObject current=null] : ( () ( (lv_elements_1_0= ruleCodeblockElement ) )* ) ;
    public final EObject ruleCodeblockContent() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_1_0 = null;



        	enterRule();

        try {
            // InternalTexDsl.g:439:2: ( ( () ( (lv_elements_1_0= ruleCodeblockElement ) )* ) )
            // InternalTexDsl.g:440:2: ( () ( (lv_elements_1_0= ruleCodeblockElement ) )* )
            {
            // InternalTexDsl.g:440:2: ( () ( (lv_elements_1_0= ruleCodeblockElement ) )* )
            // InternalTexDsl.g:441:3: () ( (lv_elements_1_0= ruleCodeblockElement ) )*
            {
            // InternalTexDsl.g:441:3: ()
            // InternalTexDsl.g:442:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getCodeblockContentAccess().getCodeblockContentAction_0(),
              					current);
              			
            }

            }

            // InternalTexDsl.g:451:3: ( (lv_elements_1_0= ruleCodeblockElement ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_BS) ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1==EOF||(LA7_1>=RULE_BS && LA7_1<=RULE_NUMBER)) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_NUMBER)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalTexDsl.g:452:4: (lv_elements_1_0= ruleCodeblockElement )
            	    {
            	    // InternalTexDsl.g:452:4: (lv_elements_1_0= ruleCodeblockElement )
            	    // InternalTexDsl.g:453:5: lv_elements_1_0= ruleCodeblockElement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getCodeblockContentAccess().getElementsCodeblockElementParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_12);
            	    lv_elements_1_0=ruleCodeblockElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getCodeblockContentRule());
            	      					}
            	      					add(
            	      						current,
            	      						"elements",
            	      						lv_elements_1_0,
            	      						"org.xixum.latex.TexDsl.CodeblockElement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // $ANTLR end "ruleCodeblockContent"


    // $ANTLR start "entryRuleCodeblockElement"
    // InternalTexDsl.g:474:1: entryRuleCodeblockElement returns [EObject current=null] : iv_ruleCodeblockElement= ruleCodeblockElement EOF ;
    public final EObject entryRuleCodeblockElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCodeblockElement = null;


        try {
            // InternalTexDsl.g:474:57: (iv_ruleCodeblockElement= ruleCodeblockElement EOF )
            // InternalTexDsl.g:475:2: iv_ruleCodeblockElement= ruleCodeblockElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCodeblockElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCodeblockElement=ruleCodeblockElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCodeblockElement; 
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
    // $ANTLR end "entryRuleCodeblockElement"


    // $ANTLR start "ruleCodeblockElement"
    // InternalTexDsl.g:481:1: ruleCodeblockElement returns [EObject current=null] : ( ( () ruleAnyToken ) | this_Command_2= ruleCommand ) ;
    public final EObject ruleCodeblockElement() throws RecognitionException {
        EObject current = null;

        EObject this_Command_2 = null;



        	enterRule();

        try {
            // InternalTexDsl.g:487:2: ( ( ( () ruleAnyToken ) | this_Command_2= ruleCommand ) )
            // InternalTexDsl.g:488:2: ( ( () ruleAnyToken ) | this_Command_2= ruleCommand )
            {
            // InternalTexDsl.g:488:2: ( ( () ruleAnyToken ) | this_Command_2= ruleCommand )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_NUMBER)) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_BS) ) {
                int LA8_2 = input.LA(2);

                if ( (LA8_2==EOF||LA8_2==RULE_BS||(LA8_2>=RULE_SQBO && LA8_2<=RULE_NUMBER)) ) {
                    alt8=1;
                }
                else if ( (LA8_2==RULE_ID) ) {
                    int LA8_3 = input.LA(3);

                    if ( (synpred13_InternalTexDsl()) ) {
                        alt8=1;
                    }
                    else if ( (true) ) {
                        alt8=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalTexDsl.g:489:3: ( () ruleAnyToken )
                    {
                    // InternalTexDsl.g:489:3: ( () ruleAnyToken )
                    // InternalTexDsl.g:490:4: () ruleAnyToken
                    {
                    // InternalTexDsl.g:490:4: ()
                    // InternalTexDsl.g:491:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getCodeblockElementAccess().getCodeblockElementAction_0_0(),
                      						current);
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getCodeblockElementAccess().getAnyTokenParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleAnyToken();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTexDsl.g:512:3: this_Command_2= ruleCommand
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCodeblockElementAccess().getCommandParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Command_2=ruleCommand();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Command_2;
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
    // $ANTLR end "ruleCodeblockElement"


    // $ANTLR start "entryRuleAnyToken"
    // InternalTexDsl.g:527:1: entryRuleAnyToken returns [String current=null] : iv_ruleAnyToken= ruleAnyToken EOF ;
    public final String entryRuleAnyToken() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAnyToken = null;


        try {
            // InternalTexDsl.g:527:48: (iv_ruleAnyToken= ruleAnyToken EOF )
            // InternalTexDsl.g:528:2: iv_ruleAnyToken= ruleAnyToken EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnyTokenRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAnyToken=ruleAnyToken();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnyToken.getText(); 
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
    // $ANTLR end "entryRuleAnyToken"


    // $ANTLR start "ruleAnyToken"
    // InternalTexDsl.g:534:1: ruleAnyToken returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_TEXT_1= RULE_TEXT | this_SYMBOL_2= RULE_SYMBOL | this_NUMBER_3= RULE_NUMBER | this_SQBO_4= RULE_SQBO | this_SQBC_5= RULE_SQBC | this_CUBO_6= RULE_CUBO | this_CUBC_7= RULE_CUBC | (this_BS_8= RULE_BS )+ ) ;
    public final AntlrDatatypeRuleToken ruleAnyToken() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_TEXT_1=null;
        Token this_SYMBOL_2=null;
        Token this_NUMBER_3=null;
        Token this_SQBO_4=null;
        Token this_SQBC_5=null;
        Token this_CUBO_6=null;
        Token this_CUBC_7=null;
        Token this_BS_8=null;


        	enterRule();

        try {
            // InternalTexDsl.g:540:2: ( (this_ID_0= RULE_ID | this_TEXT_1= RULE_TEXT | this_SYMBOL_2= RULE_SYMBOL | this_NUMBER_3= RULE_NUMBER | this_SQBO_4= RULE_SQBO | this_SQBC_5= RULE_SQBC | this_CUBO_6= RULE_CUBO | this_CUBC_7= RULE_CUBC | (this_BS_8= RULE_BS )+ ) )
            // InternalTexDsl.g:541:2: (this_ID_0= RULE_ID | this_TEXT_1= RULE_TEXT | this_SYMBOL_2= RULE_SYMBOL | this_NUMBER_3= RULE_NUMBER | this_SQBO_4= RULE_SQBO | this_SQBC_5= RULE_SQBC | this_CUBO_6= RULE_CUBO | this_CUBC_7= RULE_CUBC | (this_BS_8= RULE_BS )+ )
            {
            // InternalTexDsl.g:541:2: (this_ID_0= RULE_ID | this_TEXT_1= RULE_TEXT | this_SYMBOL_2= RULE_SYMBOL | this_NUMBER_3= RULE_NUMBER | this_SQBO_4= RULE_SQBO | this_SQBC_5= RULE_SQBC | this_CUBO_6= RULE_CUBO | this_CUBC_7= RULE_CUBC | (this_BS_8= RULE_BS )+ )
            int alt10=9;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt10=1;
                }
                break;
            case RULE_TEXT:
                {
                alt10=2;
                }
                break;
            case RULE_SYMBOL:
                {
                alt10=3;
                }
                break;
            case RULE_NUMBER:
                {
                alt10=4;
                }
                break;
            case RULE_SQBO:
                {
                alt10=5;
                }
                break;
            case RULE_SQBC:
                {
                alt10=6;
                }
                break;
            case RULE_CUBO:
                {
                alt10=7;
                }
                break;
            case RULE_CUBC:
                {
                alt10=8;
                }
                break;
            case RULE_BS:
                {
                alt10=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalTexDsl.g:542:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ID_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ID_0, grammarAccess.getAnyTokenAccess().getIDTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalTexDsl.g:550:3: this_TEXT_1= RULE_TEXT
                    {
                    this_TEXT_1=(Token)match(input,RULE_TEXT,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_TEXT_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_TEXT_1, grammarAccess.getAnyTokenAccess().getTEXTTerminalRuleCall_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalTexDsl.g:558:3: this_SYMBOL_2= RULE_SYMBOL
                    {
                    this_SYMBOL_2=(Token)match(input,RULE_SYMBOL,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_SYMBOL_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_SYMBOL_2, grammarAccess.getAnyTokenAccess().getSYMBOLTerminalRuleCall_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalTexDsl.g:566:3: this_NUMBER_3= RULE_NUMBER
                    {
                    this_NUMBER_3=(Token)match(input,RULE_NUMBER,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_NUMBER_3);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_NUMBER_3, grammarAccess.getAnyTokenAccess().getNUMBERTerminalRuleCall_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalTexDsl.g:574:3: this_SQBO_4= RULE_SQBO
                    {
                    this_SQBO_4=(Token)match(input,RULE_SQBO,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_SQBO_4);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_SQBO_4, grammarAccess.getAnyTokenAccess().getSQBOTerminalRuleCall_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalTexDsl.g:582:3: this_SQBC_5= RULE_SQBC
                    {
                    this_SQBC_5=(Token)match(input,RULE_SQBC,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_SQBC_5);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_SQBC_5, grammarAccess.getAnyTokenAccess().getSQBCTerminalRuleCall_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalTexDsl.g:590:3: this_CUBO_6= RULE_CUBO
                    {
                    this_CUBO_6=(Token)match(input,RULE_CUBO,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_CUBO_6);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_CUBO_6, grammarAccess.getAnyTokenAccess().getCUBOTerminalRuleCall_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalTexDsl.g:598:3: this_CUBC_7= RULE_CUBC
                    {
                    this_CUBC_7=(Token)match(input,RULE_CUBC,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_CUBC_7);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_CUBC_7, grammarAccess.getAnyTokenAccess().getCUBCTerminalRuleCall_7());
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalTexDsl.g:606:3: (this_BS_8= RULE_BS )+
                    {
                    // InternalTexDsl.g:606:3: (this_BS_8= RULE_BS )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_BS) ) {
                            int LA9_1 = input.LA(2);

                            if ( (synpred22_InternalTexDsl()) ) {
                                alt9=1;
                            }


                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalTexDsl.g:607:4: this_BS_8= RULE_BS
                    	    {
                    	    this_BS_8=(Token)match(input,RULE_BS,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      				current.merge(this_BS_8);
                    	      			
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      				newLeafNode(this_BS_8, grammarAccess.getAnyTokenAccess().getBSTerminalRuleCall_8());
                    	      			
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);


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
    // $ANTLR end "ruleAnyToken"


    // $ANTLR start "entryRuleArgumentContent"
    // InternalTexDsl.g:619:1: entryRuleArgumentContent returns [EObject current=null] : iv_ruleArgumentContent= ruleArgumentContent EOF ;
    public final EObject entryRuleArgumentContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgumentContent = null;


        try {
            // InternalTexDsl.g:619:56: (iv_ruleArgumentContent= ruleArgumentContent EOF )
            // InternalTexDsl.g:620:2: iv_ruleArgumentContent= ruleArgumentContent EOF
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
    // InternalTexDsl.g:626:1: ruleArgumentContent returns [EObject current=null] : (this_TextContent_0= ruleTextContent | this_Command_1= ruleCommand | this_MathExpression_2= ruleMathExpression ) ;
    public final EObject ruleArgumentContent() throws RecognitionException {
        EObject current = null;

        EObject this_TextContent_0 = null;

        EObject this_Command_1 = null;

        EObject this_MathExpression_2 = null;



        	enterRule();

        try {
            // InternalTexDsl.g:632:2: ( (this_TextContent_0= ruleTextContent | this_Command_1= ruleCommand | this_MathExpression_2= ruleMathExpression ) )
            // InternalTexDsl.g:633:2: (this_TextContent_0= ruleTextContent | this_Command_1= ruleCommand | this_MathExpression_2= ruleMathExpression )
            {
            // InternalTexDsl.g:633:2: (this_TextContent_0= ruleTextContent | this_Command_1= ruleCommand | this_MathExpression_2= ruleMathExpression )
            int alt11=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_SQBO:
            case RULE_CUBO:
            case RULE_TEXT:
            case RULE_SYMBOL:
            case RULE_NUMBER:
                {
                alt11=1;
                }
                break;
            case RULE_BS:
                {
                alt11=2;
                }
                break;
            case 18:
            case 19:
                {
                alt11=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalTexDsl.g:634:3: this_TextContent_0= ruleTextContent
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
                    // InternalTexDsl.g:646:3: this_Command_1= ruleCommand
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
                    // InternalTexDsl.g:658:3: this_MathExpression_2= ruleMathExpression
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
    // InternalTexDsl.g:673:1: entryRuleTextContainer returns [EObject current=null] : iv_ruleTextContainer= ruleTextContainer EOF ;
    public final EObject entryRuleTextContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextContainer = null;


        try {
            // InternalTexDsl.g:673:54: (iv_ruleTextContainer= ruleTextContainer EOF )
            // InternalTexDsl.g:674:2: iv_ruleTextContainer= ruleTextContainer EOF
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
    // InternalTexDsl.g:680:1: ruleTextContainer returns [EObject current=null] : ( (lv_text_0_0= RULE_TEXT ) )+ ;
    public final EObject ruleTextContainer() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;


        	enterRule();

        try {
            // InternalTexDsl.g:686:2: ( ( (lv_text_0_0= RULE_TEXT ) )+ )
            // InternalTexDsl.g:687:2: ( (lv_text_0_0= RULE_TEXT ) )+
            {
            // InternalTexDsl.g:687:2: ( (lv_text_0_0= RULE_TEXT ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_TEXT) ) {
                    int LA12_2 = input.LA(2);

                    if ( (synpred25_InternalTexDsl()) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // InternalTexDsl.g:688:3: (lv_text_0_0= RULE_TEXT )
            	    {
            	    // InternalTexDsl.g:688:3: (lv_text_0_0= RULE_TEXT )
            	    // InternalTexDsl.g:689:4: lv_text_0_0= RULE_TEXT
            	    {
            	    lv_text_0_0=(Token)match(input,RULE_TEXT,FollowSets000.FOLLOW_14); if (state.failed) return current;
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
            	    if ( cnt12 >= 1 ) break loop12;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
    // InternalTexDsl.g:708:1: entryRuleTextContent returns [EObject current=null] : iv_ruleTextContent= ruleTextContent EOF ;
    public final EObject entryRuleTextContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextContent = null;


        try {
            // InternalTexDsl.g:708:52: (iv_ruleTextContent= ruleTextContent EOF )
            // InternalTexDsl.g:709:2: iv_ruleTextContent= ruleTextContent EOF
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
    // InternalTexDsl.g:715:1: ruleTextContent returns [EObject current=null] : (this_Identifiers_0= ruleIdentifiers | this_TextContainer_1= ruleTextContainer | this_Operators_2= ruleOperators | this_Numbers_3= ruleNumbers | this_OptionalArgument_4= ruleOptionalArgument | this_MandatoryArgument_5= ruleMandatoryArgument ) ;
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
            // InternalTexDsl.g:721:2: ( (this_Identifiers_0= ruleIdentifiers | this_TextContainer_1= ruleTextContainer | this_Operators_2= ruleOperators | this_Numbers_3= ruleNumbers | this_OptionalArgument_4= ruleOptionalArgument | this_MandatoryArgument_5= ruleMandatoryArgument ) )
            // InternalTexDsl.g:722:2: (this_Identifiers_0= ruleIdentifiers | this_TextContainer_1= ruleTextContainer | this_Operators_2= ruleOperators | this_Numbers_3= ruleNumbers | this_OptionalArgument_4= ruleOptionalArgument | this_MandatoryArgument_5= ruleMandatoryArgument )
            {
            // InternalTexDsl.g:722:2: (this_Identifiers_0= ruleIdentifiers | this_TextContainer_1= ruleTextContainer | this_Operators_2= ruleOperators | this_Numbers_3= ruleNumbers | this_OptionalArgument_4= ruleOptionalArgument | this_MandatoryArgument_5= ruleMandatoryArgument )
            int alt13=6;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt13=1;
                }
                break;
            case RULE_TEXT:
                {
                alt13=2;
                }
                break;
            case RULE_SYMBOL:
                {
                alt13=3;
                }
                break;
            case RULE_NUMBER:
                {
                alt13=4;
                }
                break;
            case RULE_SQBO:
                {
                alt13=5;
                }
                break;
            case RULE_CUBO:
                {
                alt13=6;
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
                    // InternalTexDsl.g:723:3: this_Identifiers_0= ruleIdentifiers
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
                    // InternalTexDsl.g:735:3: this_TextContainer_1= ruleTextContainer
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
                    // InternalTexDsl.g:747:3: this_Operators_2= ruleOperators
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
                    // InternalTexDsl.g:759:3: this_Numbers_3= ruleNumbers
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
                    // InternalTexDsl.g:771:3: this_OptionalArgument_4= ruleOptionalArgument
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
                    // InternalTexDsl.g:783:3: this_MandatoryArgument_5= ruleMandatoryArgument
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
    // InternalTexDsl.g:798:1: entryRuleIdentifiers returns [EObject current=null] : iv_ruleIdentifiers= ruleIdentifiers EOF ;
    public final EObject entryRuleIdentifiers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdentifiers = null;


        try {
            // InternalTexDsl.g:798:52: (iv_ruleIdentifiers= ruleIdentifiers EOF )
            // InternalTexDsl.g:799:2: iv_ruleIdentifiers= ruleIdentifiers EOF
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
    // InternalTexDsl.g:805:1: ruleIdentifiers returns [EObject current=null] : ( (lv_id_0_0= RULE_ID ) ) ;
    public final EObject ruleIdentifiers() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;


        	enterRule();

        try {
            // InternalTexDsl.g:811:2: ( ( (lv_id_0_0= RULE_ID ) ) )
            // InternalTexDsl.g:812:2: ( (lv_id_0_0= RULE_ID ) )
            {
            // InternalTexDsl.g:812:2: ( (lv_id_0_0= RULE_ID ) )
            // InternalTexDsl.g:813:3: (lv_id_0_0= RULE_ID )
            {
            // InternalTexDsl.g:813:3: (lv_id_0_0= RULE_ID )
            // InternalTexDsl.g:814:4: lv_id_0_0= RULE_ID
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
    // InternalTexDsl.g:833:1: entryRuleNumbers returns [EObject current=null] : iv_ruleNumbers= ruleNumbers EOF ;
    public final EObject entryRuleNumbers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumbers = null;


        try {
            // InternalTexDsl.g:833:48: (iv_ruleNumbers= ruleNumbers EOF )
            // InternalTexDsl.g:834:2: iv_ruleNumbers= ruleNumbers EOF
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
    // InternalTexDsl.g:840:1: ruleNumbers returns [EObject current=null] : ( (lv_num_0_0= RULE_NUMBER ) ) ;
    public final EObject ruleNumbers() throws RecognitionException {
        EObject current = null;

        Token lv_num_0_0=null;


        	enterRule();

        try {
            // InternalTexDsl.g:846:2: ( ( (lv_num_0_0= RULE_NUMBER ) ) )
            // InternalTexDsl.g:847:2: ( (lv_num_0_0= RULE_NUMBER ) )
            {
            // InternalTexDsl.g:847:2: ( (lv_num_0_0= RULE_NUMBER ) )
            // InternalTexDsl.g:848:3: (lv_num_0_0= RULE_NUMBER )
            {
            // InternalTexDsl.g:848:3: (lv_num_0_0= RULE_NUMBER )
            // InternalTexDsl.g:849:4: lv_num_0_0= RULE_NUMBER
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
    // InternalTexDsl.g:868:1: entryRuleOperators returns [EObject current=null] : iv_ruleOperators= ruleOperators EOF ;
    public final EObject entryRuleOperators() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperators = null;


        try {
            // InternalTexDsl.g:868:50: (iv_ruleOperators= ruleOperators EOF )
            // InternalTexDsl.g:869:2: iv_ruleOperators= ruleOperators EOF
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
    // InternalTexDsl.g:875:1: ruleOperators returns [EObject current=null] : ( (lv_op_0_0= RULE_SYMBOL ) )+ ;
    public final EObject ruleOperators() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_0=null;


        	enterRule();

        try {
            // InternalTexDsl.g:881:2: ( ( (lv_op_0_0= RULE_SYMBOL ) )+ )
            // InternalTexDsl.g:882:2: ( (lv_op_0_0= RULE_SYMBOL ) )+
            {
            // InternalTexDsl.g:882:2: ( (lv_op_0_0= RULE_SYMBOL ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_SYMBOL) ) {
                    int LA14_2 = input.LA(2);

                    if ( (synpred31_InternalTexDsl()) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // InternalTexDsl.g:883:3: (lv_op_0_0= RULE_SYMBOL )
            	    {
            	    // InternalTexDsl.g:883:3: (lv_op_0_0= RULE_SYMBOL )
            	    // InternalTexDsl.g:884:4: lv_op_0_0= RULE_SYMBOL
            	    {
            	    lv_op_0_0=(Token)match(input,RULE_SYMBOL,FollowSets000.FOLLOW_15); if (state.failed) return current;
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
            	    if ( cnt14 >= 1 ) break loop14;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
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
    // InternalTexDsl.g:903:1: entryRuleMathExpression returns [EObject current=null] : iv_ruleMathExpression= ruleMathExpression EOF ;
    public final EObject entryRuleMathExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathExpression = null;


        try {
            // InternalTexDsl.g:903:55: (iv_ruleMathExpression= ruleMathExpression EOF )
            // InternalTexDsl.g:904:2: iv_ruleMathExpression= ruleMathExpression EOF
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
    // InternalTexDsl.g:910:1: ruleMathExpression returns [EObject current=null] : (this_InlineMath_0= ruleInlineMath | this_DisplayMath_1= ruleDisplayMath ) ;
    public final EObject ruleMathExpression() throws RecognitionException {
        EObject current = null;

        EObject this_InlineMath_0 = null;

        EObject this_DisplayMath_1 = null;



        	enterRule();

        try {
            // InternalTexDsl.g:916:2: ( (this_InlineMath_0= ruleInlineMath | this_DisplayMath_1= ruleDisplayMath ) )
            // InternalTexDsl.g:917:2: (this_InlineMath_0= ruleInlineMath | this_DisplayMath_1= ruleDisplayMath )
            {
            // InternalTexDsl.g:917:2: (this_InlineMath_0= ruleInlineMath | this_DisplayMath_1= ruleDisplayMath )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==18) ) {
                alt15=1;
            }
            else if ( (LA15_0==19) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalTexDsl.g:918:3: this_InlineMath_0= ruleInlineMath
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
                    // InternalTexDsl.g:930:3: this_DisplayMath_1= ruleDisplayMath
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
    // InternalTexDsl.g:945:1: entryRuleInlineMath returns [EObject current=null] : iv_ruleInlineMath= ruleInlineMath EOF ;
    public final EObject entryRuleInlineMath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInlineMath = null;


        try {
            // InternalTexDsl.g:945:51: (iv_ruleInlineMath= ruleInlineMath EOF )
            // InternalTexDsl.g:946:2: iv_ruleInlineMath= ruleInlineMath EOF
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
    // InternalTexDsl.g:952:1: ruleInlineMath returns [EObject current=null] : ( () otherlv_1= '$' ( (lv_content_2_0= ruleMathContent ) )* otherlv_3= '$' ) ;
    public final EObject ruleInlineMath() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalTexDsl.g:958:2: ( ( () otherlv_1= '$' ( (lv_content_2_0= ruleMathContent ) )* otherlv_3= '$' ) )
            // InternalTexDsl.g:959:2: ( () otherlv_1= '$' ( (lv_content_2_0= ruleMathContent ) )* otherlv_3= '$' )
            {
            // InternalTexDsl.g:959:2: ( () otherlv_1= '$' ( (lv_content_2_0= ruleMathContent ) )* otherlv_3= '$' )
            // InternalTexDsl.g:960:3: () otherlv_1= '$' ( (lv_content_2_0= ruleMathContent ) )* otherlv_3= '$'
            {
            // InternalTexDsl.g:960:3: ()
            // InternalTexDsl.g:961:4: 
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

            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getInlineMathAccess().getDollarSignKeyword_1());
              		
            }
            // InternalTexDsl.g:974:3: ( (lv_content_2_0= ruleMathContent ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_BS && LA16_0<=RULE_SQBO)||LA16_0==RULE_CUBO||(LA16_0>=RULE_TEXT && LA16_0<=RULE_NUMBER)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalTexDsl.g:975:4: (lv_content_2_0= ruleMathContent )
            	    {
            	    // InternalTexDsl.g:975:4: (lv_content_2_0= ruleMathContent )
            	    // InternalTexDsl.g:976:5: lv_content_2_0= ruleMathContent
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getInlineMathAccess().getContentMathContentParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_16);
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
            	    break loop16;
                }
            } while (true);

            otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalTexDsl.g:1001:1: entryRuleDisplayMath returns [EObject current=null] : iv_ruleDisplayMath= ruleDisplayMath EOF ;
    public final EObject entryRuleDisplayMath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisplayMath = null;


        try {
            // InternalTexDsl.g:1001:52: (iv_ruleDisplayMath= ruleDisplayMath EOF )
            // InternalTexDsl.g:1002:2: iv_ruleDisplayMath= ruleDisplayMath EOF
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
    // InternalTexDsl.g:1008:1: ruleDisplayMath returns [EObject current=null] : ( () otherlv_1= '$$' ( (lv_content_2_0= ruleMathContent ) )* otherlv_3= '$$' ) ;
    public final EObject ruleDisplayMath() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalTexDsl.g:1014:2: ( ( () otherlv_1= '$$' ( (lv_content_2_0= ruleMathContent ) )* otherlv_3= '$$' ) )
            // InternalTexDsl.g:1015:2: ( () otherlv_1= '$$' ( (lv_content_2_0= ruleMathContent ) )* otherlv_3= '$$' )
            {
            // InternalTexDsl.g:1015:2: ( () otherlv_1= '$$' ( (lv_content_2_0= ruleMathContent ) )* otherlv_3= '$$' )
            // InternalTexDsl.g:1016:3: () otherlv_1= '$$' ( (lv_content_2_0= ruleMathContent ) )* otherlv_3= '$$'
            {
            // InternalTexDsl.g:1016:3: ()
            // InternalTexDsl.g:1017:4: 
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

            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDisplayMathAccess().getDollarSignDollarSignKeyword_1());
              		
            }
            // InternalTexDsl.g:1030:3: ( (lv_content_2_0= ruleMathContent ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_BS && LA17_0<=RULE_SQBO)||LA17_0==RULE_CUBO||(LA17_0>=RULE_TEXT && LA17_0<=RULE_NUMBER)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalTexDsl.g:1031:4: (lv_content_2_0= ruleMathContent )
            	    {
            	    // InternalTexDsl.g:1031:4: (lv_content_2_0= ruleMathContent )
            	    // InternalTexDsl.g:1032:5: lv_content_2_0= ruleMathContent
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDisplayMathAccess().getContentMathContentParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_17);
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
            	    break loop17;
                }
            } while (true);

            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalTexDsl.g:1057:1: entryRuleMathContent returns [EObject current=null] : iv_ruleMathContent= ruleMathContent EOF ;
    public final EObject entryRuleMathContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathContent = null;


        try {
            // InternalTexDsl.g:1057:52: (iv_ruleMathContent= ruleMathContent EOF )
            // InternalTexDsl.g:1058:2: iv_ruleMathContent= ruleMathContent EOF
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
    // InternalTexDsl.g:1064:1: ruleMathContent returns [EObject current=null] : (this_Command_0= ruleCommand | this_TextContent_1= ruleTextContent | this_Numbers_2= ruleNumbers | this_Operators_3= ruleOperators ) ;
    public final EObject ruleMathContent() throws RecognitionException {
        EObject current = null;

        EObject this_Command_0 = null;

        EObject this_TextContent_1 = null;

        EObject this_Numbers_2 = null;

        EObject this_Operators_3 = null;



        	enterRule();

        try {
            // InternalTexDsl.g:1070:2: ( (this_Command_0= ruleCommand | this_TextContent_1= ruleTextContent | this_Numbers_2= ruleNumbers | this_Operators_3= ruleOperators ) )
            // InternalTexDsl.g:1071:2: (this_Command_0= ruleCommand | this_TextContent_1= ruleTextContent | this_Numbers_2= ruleNumbers | this_Operators_3= ruleOperators )
            {
            // InternalTexDsl.g:1071:2: (this_Command_0= ruleCommand | this_TextContent_1= ruleTextContent | this_Numbers_2= ruleNumbers | this_Operators_3= ruleOperators )
            int alt18=4;
            switch ( input.LA(1) ) {
            case RULE_BS:
                {
                alt18=1;
                }
                break;
            case RULE_ID:
            case RULE_SQBO:
            case RULE_CUBO:
            case RULE_TEXT:
                {
                alt18=2;
                }
                break;
            case RULE_SYMBOL:
                {
                int LA18_3 = input.LA(2);

                if ( (synpred36_InternalTexDsl()) ) {
                    alt18=2;
                }
                else if ( (true) ) {
                    alt18=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_NUMBER:
                {
                int LA18_4 = input.LA(2);

                if ( (synpred36_InternalTexDsl()) ) {
                    alt18=2;
                }
                else if ( (synpred37_InternalTexDsl()) ) {
                    alt18=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalTexDsl.g:1072:3: this_Command_0= ruleCommand
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
                    // InternalTexDsl.g:1084:3: this_TextContent_1= ruleTextContent
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
                    // InternalTexDsl.g:1096:3: this_Numbers_2= ruleNumbers
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
                    // InternalTexDsl.g:1108:3: this_Operators_3= ruleOperators
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

    // $ANTLR start synpred6_InternalTexDsl
    public final void synpred6_InternalTexDsl_fragment() throws RecognitionException {   
        EObject lv_optionalArgs_2_0 = null;


        // InternalTexDsl.g:213:4: ( (lv_optionalArgs_2_0= ruleOptionalArgument ) )
        // InternalTexDsl.g:213:4: (lv_optionalArgs_2_0= ruleOptionalArgument )
        {
        // InternalTexDsl.g:213:4: (lv_optionalArgs_2_0= ruleOptionalArgument )
        // InternalTexDsl.g:214:5: lv_optionalArgs_2_0= ruleOptionalArgument
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
    // $ANTLR end synpred6_InternalTexDsl

    // $ANTLR start synpred7_InternalTexDsl
    public final void synpred7_InternalTexDsl_fragment() throws RecognitionException {   
        EObject lv_mandatoryArgs_3_0 = null;


        // InternalTexDsl.g:232:4: ( (lv_mandatoryArgs_3_0= ruleMandatoryArgument ) )
        // InternalTexDsl.g:232:4: (lv_mandatoryArgs_3_0= ruleMandatoryArgument )
        {
        // InternalTexDsl.g:232:4: (lv_mandatoryArgs_3_0= ruleMandatoryArgument )
        // InternalTexDsl.g:233:5: lv_mandatoryArgs_3_0= ruleMandatoryArgument
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
    // $ANTLR end synpred7_InternalTexDsl

    // $ANTLR start synpred13_InternalTexDsl
    public final void synpred13_InternalTexDsl_fragment() throws RecognitionException {   
        // InternalTexDsl.g:489:3: ( ( () ruleAnyToken ) )
        // InternalTexDsl.g:489:3: ( () ruleAnyToken )
        {
        // InternalTexDsl.g:489:3: ( () ruleAnyToken )
        // InternalTexDsl.g:490:4: () ruleAnyToken
        {
        // InternalTexDsl.g:490:4: ()
        // InternalTexDsl.g:491:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        pushFollow(FollowSets000.FOLLOW_2);
        ruleAnyToken();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalTexDsl

    // $ANTLR start synpred22_InternalTexDsl
    public final void synpred22_InternalTexDsl_fragment() throws RecognitionException {   
        Token this_BS_8=null;

        // InternalTexDsl.g:607:4: (this_BS_8= RULE_BS )
        // InternalTexDsl.g:607:4: this_BS_8= RULE_BS
        {
        this_BS_8=(Token)match(input,RULE_BS,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalTexDsl

    // $ANTLR start synpred25_InternalTexDsl
    public final void synpred25_InternalTexDsl_fragment() throws RecognitionException {   
        Token lv_text_0_0=null;

        // InternalTexDsl.g:688:3: ( (lv_text_0_0= RULE_TEXT ) )
        // InternalTexDsl.g:688:3: (lv_text_0_0= RULE_TEXT )
        {
        // InternalTexDsl.g:688:3: (lv_text_0_0= RULE_TEXT )
        // InternalTexDsl.g:689:4: lv_text_0_0= RULE_TEXT
        {
        lv_text_0_0=(Token)match(input,RULE_TEXT,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred25_InternalTexDsl

    // $ANTLR start synpred31_InternalTexDsl
    public final void synpred31_InternalTexDsl_fragment() throws RecognitionException {   
        Token lv_op_0_0=null;

        // InternalTexDsl.g:883:3: ( (lv_op_0_0= RULE_SYMBOL ) )
        // InternalTexDsl.g:883:3: (lv_op_0_0= RULE_SYMBOL )
        {
        // InternalTexDsl.g:883:3: (lv_op_0_0= RULE_SYMBOL )
        // InternalTexDsl.g:884:4: lv_op_0_0= RULE_SYMBOL
        {
        lv_op_0_0=(Token)match(input,RULE_SYMBOL,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred31_InternalTexDsl

    // $ANTLR start synpred36_InternalTexDsl
    public final void synpred36_InternalTexDsl_fragment() throws RecognitionException {   
        EObject this_TextContent_1 = null;


        // InternalTexDsl.g:1084:3: (this_TextContent_1= ruleTextContent )
        // InternalTexDsl.g:1084:3: this_TextContent_1= ruleTextContent
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
    // $ANTLR end synpred36_InternalTexDsl

    // $ANTLR start synpred37_InternalTexDsl
    public final void synpred37_InternalTexDsl_fragment() throws RecognitionException {   
        EObject this_Numbers_2 = null;


        // InternalTexDsl.g:1096:3: (this_Numbers_2= ruleNumbers )
        // InternalTexDsl.g:1096:3: this_Numbers_2= ruleNumbers
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
    // $ANTLR end synpred37_InternalTexDsl

    // Delegated rules

    public final boolean synpred36_InternalTexDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred36_InternalTexDsl_fragment(); // can never throw exception
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
    public final boolean synpred31_InternalTexDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_InternalTexDsl_fragment(); // can never throw exception
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
    public final boolean synpred25_InternalTexDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalTexDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_InternalTexDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_InternalTexDsl_fragment(); // can never throw exception
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
    static final String dfa_4s = "\1\23\7\uffff\1\0\5\uffff";
    static final String dfa_5s = "\1\uffff\1\2\13\uffff\1\1";
    static final String dfa_6s = "\10\uffff\1\0\5\uffff}>";
    static final String[] dfa_7s = {
            "\2\1\1\10\6\1\5\uffff\2\1",
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
            return "()* loopback of 212:3: ( (lv_optionalArgs_2_0= ruleOptionalArgument ) )*";
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
                        if ( (synpred6_InternalTexDsl()) ) {s = 13;}

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
            return "()* loopback of 231:3: ( (lv_mandatoryArgs_3_0= ruleMandatoryArgument ) )*";
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
                        if ( (synpred7_InternalTexDsl()) ) {s = 13;}

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
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000000C1D72L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001D62L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000C1DF0L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000C1F70L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000001FF0L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000001FF2L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000402L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000041D70L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000081D70L});
    }


}