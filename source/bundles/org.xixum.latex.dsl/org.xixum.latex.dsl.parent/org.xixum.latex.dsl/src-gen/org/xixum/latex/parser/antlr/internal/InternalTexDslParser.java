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

@SuppressWarnings("all")
public class InternalTexDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_END", "RULE_ALPHA_NUMERIC", "RULE_ID", "RULE_BS", "RULE_SQBO", "RULE_KOMMA", "RULE_SQBC", "RULE_CUBO", "RULE_CUBC", "RULE_EQ", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_SYMBOL", "RULE_SYMBOLS", "RULE_ALPHA", "RULE_NUMERIC", "RULE_ALPHAC", "RULE_ALPHAS", "RULE_BO", "RULE_BC", "RULE_INT", "RULE_STRING", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_ALPHA=18;
    public static final int RULE_END=4;
    public static final int RULE_CUBO=11;
    public static final int RULE_STRING=25;
    public static final int RULE_SL_COMMENT=15;
    public static final int RULE_EQ=13;
    public static final int EOF=-1;
    public static final int RULE_NUMERIC=19;
    public static final int RULE_ID=6;
    public static final int RULE_WS=26;
    public static final int RULE_SQBO=8;
    public static final int RULE_ALPHA_NUMERIC=5;
    public static final int RULE_BO=22;
    public static final int RULE_SQBC=10;
    public static final int RULE_ANY_OTHER=27;
    public static final int RULE_ALPHAS=21;
    public static final int RULE_BS=7;
    public static final int RULE_KOMMA=9;
    public static final int RULE_INT=24;
    public static final int RULE_CUBC=12;
    public static final int RULE_ML_COMMENT=14;
    public static final int RULE_SYMBOL=16;
    public static final int RULE_ALPHAC=20;
    public static final int RULE_SYMBOLS=17;
    public static final int RULE_BC=23;

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
    // InternalTexDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalTexDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalTexDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalTexDsl.g:71:1: ruleModel returns [EObject current=null] : ( (lv_document_0_0= ruleDocument ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_document_0_0 = null;



        	enterRule();

        try {
            // InternalTexDsl.g:77:2: ( ( (lv_document_0_0= ruleDocument ) ) )
            // InternalTexDsl.g:78:2: ( (lv_document_0_0= ruleDocument ) )
            {
            // InternalTexDsl.g:78:2: ( (lv_document_0_0= ruleDocument ) )
            // InternalTexDsl.g:79:3: (lv_document_0_0= ruleDocument )
            {
            // InternalTexDsl.g:79:3: (lv_document_0_0= ruleDocument )
            // InternalTexDsl.g:80:4: lv_document_0_0= ruleDocument
            {

            				newCompositeNode(grammarAccess.getModelAccess().getDocumentDocumentParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_document_0_0=ruleDocument();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getModelRule());
            				}
            				add(
            					current,
            					"document",
            					lv_document_0_0,
            					"org.xixum.latex.TexDsl.Document");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleDocument"
    // InternalTexDsl.g:100:1: entryRuleDocument returns [EObject current=null] : iv_ruleDocument= ruleDocument EOF ;
    public final EObject entryRuleDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocument = null;


        try {
            // InternalTexDsl.g:100:49: (iv_ruleDocument= ruleDocument EOF )
            // InternalTexDsl.g:101:2: iv_ruleDocument= ruleDocument EOF
            {
             newCompositeNode(grammarAccess.getDocumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDocument=ruleDocument();

            state._fsp--;

             current =iv_ruleDocument; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDocument"


    // $ANTLR start "ruleDocument"
    // InternalTexDsl.g:107:1: ruleDocument returns [EObject current=null] : ( ( ( (lv_elements_0_1= ruleToken | lv_elements_0_2= ruleCommand ) ) )+ | ( () this_END_2= RULE_END ) ) ;
    public final EObject ruleDocument() throws RecognitionException {
        EObject current = null;

        Token this_END_2=null;
        EObject lv_elements_0_1 = null;

        EObject lv_elements_0_2 = null;



        	enterRule();

        try {
            // InternalTexDsl.g:113:2: ( ( ( ( (lv_elements_0_1= ruleToken | lv_elements_0_2= ruleCommand ) ) )+ | ( () this_END_2= RULE_END ) ) )
            // InternalTexDsl.g:114:2: ( ( ( (lv_elements_0_1= ruleToken | lv_elements_0_2= ruleCommand ) ) )+ | ( () this_END_2= RULE_END ) )
            {
            // InternalTexDsl.g:114:2: ( ( ( (lv_elements_0_1= ruleToken | lv_elements_0_2= ruleCommand ) ) )+ | ( () this_END_2= RULE_END ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ALPHA_NUMERIC||LA3_0==RULE_BS) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_END) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalTexDsl.g:115:3: ( ( (lv_elements_0_1= ruleToken | lv_elements_0_2= ruleCommand ) ) )+
                    {
                    // InternalTexDsl.g:115:3: ( ( (lv_elements_0_1= ruleToken | lv_elements_0_2= ruleCommand ) ) )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==RULE_ALPHA_NUMERIC||LA2_0==RULE_BS) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalTexDsl.g:116:4: ( (lv_elements_0_1= ruleToken | lv_elements_0_2= ruleCommand ) )
                    	    {
                    	    // InternalTexDsl.g:116:4: ( (lv_elements_0_1= ruleToken | lv_elements_0_2= ruleCommand ) )
                    	    // InternalTexDsl.g:117:5: (lv_elements_0_1= ruleToken | lv_elements_0_2= ruleCommand )
                    	    {
                    	    // InternalTexDsl.g:117:5: (lv_elements_0_1= ruleToken | lv_elements_0_2= ruleCommand )
                    	    int alt1=2;
                    	    int LA1_0 = input.LA(1);

                    	    if ( (LA1_0==RULE_ALPHA_NUMERIC) ) {
                    	        alt1=1;
                    	    }
                    	    else if ( (LA1_0==RULE_BS) ) {
                    	        alt1=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 1, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt1) {
                    	        case 1 :
                    	            // InternalTexDsl.g:118:6: lv_elements_0_1= ruleToken
                    	            {

                    	            						newCompositeNode(grammarAccess.getDocumentAccess().getElementsTokenParserRuleCall_0_0_0());
                    	            					
                    	            pushFollow(FOLLOW_3);
                    	            lv_elements_0_1=ruleToken();

                    	            state._fsp--;


                    	            						if (current==null) {
                    	            							current = createModelElementForParent(grammarAccess.getDocumentRule());
                    	            						}
                    	            						add(
                    	            							current,
                    	            							"elements",
                    	            							lv_elements_0_1,
                    	            							"org.xixum.latex.TexDsl.Token");
                    	            						afterParserOrEnumRuleCall();
                    	            					

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalTexDsl.g:134:6: lv_elements_0_2= ruleCommand
                    	            {

                    	            						newCompositeNode(grammarAccess.getDocumentAccess().getElementsCommandParserRuleCall_0_0_1());
                    	            					
                    	            pushFollow(FOLLOW_3);
                    	            lv_elements_0_2=ruleCommand();

                    	            state._fsp--;


                    	            						if (current==null) {
                    	            							current = createModelElementForParent(grammarAccess.getDocumentRule());
                    	            						}
                    	            						add(
                    	            							current,
                    	            							"elements",
                    	            							lv_elements_0_2,
                    	            							"org.xixum.latex.TexDsl.Command");
                    	            						afterParserOrEnumRuleCall();
                    	            					

                    	            }
                    	            break;

                    	    }


                    	    }


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
                    break;
                case 2 :
                    // InternalTexDsl.g:153:3: ( () this_END_2= RULE_END )
                    {
                    // InternalTexDsl.g:153:3: ( () this_END_2= RULE_END )
                    // InternalTexDsl.g:154:4: () this_END_2= RULE_END
                    {
                    // InternalTexDsl.g:154:4: ()
                    // InternalTexDsl.g:155:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDocumentAccess().getDocumentAction_1_0(),
                    						current);
                    				

                    }

                    this_END_2=(Token)match(input,RULE_END,FOLLOW_2); 

                    				newLeafNode(this_END_2, grammarAccess.getDocumentAccess().getENDTerminalRuleCall_1_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDocument"


    // $ANTLR start "entryRuleToken"
    // InternalTexDsl.g:170:1: entryRuleToken returns [EObject current=null] : iv_ruleToken= ruleToken EOF ;
    public final EObject entryRuleToken() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleToken = null;


        try {
            // InternalTexDsl.g:170:46: (iv_ruleToken= ruleToken EOF )
            // InternalTexDsl.g:171:2: iv_ruleToken= ruleToken EOF
            {
             newCompositeNode(grammarAccess.getTokenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleToken=ruleToken();

            state._fsp--;

             current =iv_ruleToken; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleToken"


    // $ANTLR start "ruleToken"
    // InternalTexDsl.g:177:1: ruleToken returns [EObject current=null] : ( (lv_token_0_0= RULE_ALPHA_NUMERIC ) ) ;
    public final EObject ruleToken() throws RecognitionException {
        EObject current = null;

        Token lv_token_0_0=null;


        	enterRule();

        try {
            // InternalTexDsl.g:183:2: ( ( (lv_token_0_0= RULE_ALPHA_NUMERIC ) ) )
            // InternalTexDsl.g:184:2: ( (lv_token_0_0= RULE_ALPHA_NUMERIC ) )
            {
            // InternalTexDsl.g:184:2: ( (lv_token_0_0= RULE_ALPHA_NUMERIC ) )
            // InternalTexDsl.g:185:3: (lv_token_0_0= RULE_ALPHA_NUMERIC )
            {
            // InternalTexDsl.g:185:3: (lv_token_0_0= RULE_ALPHA_NUMERIC )
            // InternalTexDsl.g:186:4: lv_token_0_0= RULE_ALPHA_NUMERIC
            {
            lv_token_0_0=(Token)match(input,RULE_ALPHA_NUMERIC,FOLLOW_2); 

            				newLeafNode(lv_token_0_0, grammarAccess.getTokenAccess().getTokenALPHA_NUMERICTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getTokenRule());
            				}
            				setWithLastConsumed(
            					current,
            					"token",
            					lv_token_0_0,
            					"org.xixum.latex.TexDsl.ALPHA_NUMERIC");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleToken"


    // $ANTLR start "entryRuleID_Token"
    // InternalTexDsl.g:205:1: entryRuleID_Token returns [String current=null] : iv_ruleID_Token= ruleID_Token EOF ;
    public final String entryRuleID_Token() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleID_Token = null;


        try {
            // InternalTexDsl.g:205:48: (iv_ruleID_Token= ruleID_Token EOF )
            // InternalTexDsl.g:206:2: iv_ruleID_Token= ruleID_Token EOF
            {
             newCompositeNode(grammarAccess.getID_TokenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleID_Token=ruleID_Token();

            state._fsp--;

             current =iv_ruleID_Token.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleID_Token"


    // $ANTLR start "ruleID_Token"
    // InternalTexDsl.g:212:1: ruleID_Token returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_ALPHA_NUMERIC_1= RULE_ALPHA_NUMERIC ) ;
    public final AntlrDatatypeRuleToken ruleID_Token() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_ALPHA_NUMERIC_1=null;


        	enterRule();

        try {
            // InternalTexDsl.g:218:2: ( (this_ID_0= RULE_ID | this_ALPHA_NUMERIC_1= RULE_ALPHA_NUMERIC ) )
            // InternalTexDsl.g:219:2: (this_ID_0= RULE_ID | this_ALPHA_NUMERIC_1= RULE_ALPHA_NUMERIC )
            {
            // InternalTexDsl.g:219:2: (this_ID_0= RULE_ID | this_ALPHA_NUMERIC_1= RULE_ALPHA_NUMERIC )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ALPHA_NUMERIC) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalTexDsl.g:220:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getID_TokenAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTexDsl.g:228:3: this_ALPHA_NUMERIC_1= RULE_ALPHA_NUMERIC
                    {
                    this_ALPHA_NUMERIC_1=(Token)match(input,RULE_ALPHA_NUMERIC,FOLLOW_2); 

                    			current.merge(this_ALPHA_NUMERIC_1);
                    		

                    			newLeafNode(this_ALPHA_NUMERIC_1, grammarAccess.getID_TokenAccess().getALPHA_NUMERICTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleID_Token"


    // $ANTLR start "entryRuleCommandName"
    // InternalTexDsl.g:239:1: entryRuleCommandName returns [EObject current=null] : iv_ruleCommandName= ruleCommandName EOF ;
    public final EObject entryRuleCommandName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandName = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTexDsl.g:241:2: (iv_ruleCommandName= ruleCommandName EOF )
            // InternalTexDsl.g:242:2: iv_ruleCommandName= ruleCommandName EOF
            {
             newCompositeNode(grammarAccess.getCommandNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommandName=ruleCommandName();

            state._fsp--;

             current =iv_ruleCommandName; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleCommandName"


    // $ANTLR start "ruleCommandName"
    // InternalTexDsl.g:251:1: ruleCommandName returns [EObject current=null] : ( ( (lv_leading_0_0= RULE_BS ) ) ( (lv_cName_1_0= RULE_ALPHA_NUMERIC ) ) ) ;
    public final EObject ruleCommandName() throws RecognitionException {
        EObject current = null;

        Token lv_leading_0_0=null;
        Token lv_cName_1_0=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTexDsl.g:258:2: ( ( ( (lv_leading_0_0= RULE_BS ) ) ( (lv_cName_1_0= RULE_ALPHA_NUMERIC ) ) ) )
            // InternalTexDsl.g:259:2: ( ( (lv_leading_0_0= RULE_BS ) ) ( (lv_cName_1_0= RULE_ALPHA_NUMERIC ) ) )
            {
            // InternalTexDsl.g:259:2: ( ( (lv_leading_0_0= RULE_BS ) ) ( (lv_cName_1_0= RULE_ALPHA_NUMERIC ) ) )
            // InternalTexDsl.g:260:3: ( (lv_leading_0_0= RULE_BS ) ) ( (lv_cName_1_0= RULE_ALPHA_NUMERIC ) )
            {
            // InternalTexDsl.g:260:3: ( (lv_leading_0_0= RULE_BS ) )
            // InternalTexDsl.g:261:4: (lv_leading_0_0= RULE_BS )
            {
            // InternalTexDsl.g:261:4: (lv_leading_0_0= RULE_BS )
            // InternalTexDsl.g:262:5: lv_leading_0_0= RULE_BS
            {
            lv_leading_0_0=(Token)match(input,RULE_BS,FOLLOW_4); 

            					newLeafNode(lv_leading_0_0, grammarAccess.getCommandNameAccess().getLeadingBSTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommandNameRule());
            					}
            					setWithLastConsumed(
            						current,
            						"leading",
            						lv_leading_0_0,
            						"org.xixum.latex.TexDsl.BS");
            				

            }


            }

            // InternalTexDsl.g:278:3: ( (lv_cName_1_0= RULE_ALPHA_NUMERIC ) )
            // InternalTexDsl.g:279:4: (lv_cName_1_0= RULE_ALPHA_NUMERIC )
            {
            // InternalTexDsl.g:279:4: (lv_cName_1_0= RULE_ALPHA_NUMERIC )
            // InternalTexDsl.g:280:5: lv_cName_1_0= RULE_ALPHA_NUMERIC
            {
            lv_cName_1_0=(Token)match(input,RULE_ALPHA_NUMERIC,FOLLOW_2); 

            					newLeafNode(lv_cName_1_0, grammarAccess.getCommandNameAccess().getCNameALPHA_NUMERICTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommandNameRule());
            					}
            					addWithLastConsumed(
            						current,
            						"cName",
            						lv_cName_1_0,
            						"org.xixum.latex.TexDsl.ALPHA_NUMERIC");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleCommandName"


    // $ANTLR start "entryRuleCommand"
    // InternalTexDsl.g:303:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalTexDsl.g:303:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalTexDsl.g:304:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalTexDsl.g:310:1: ruleCommand returns [EObject current=null] : ( ( (lv_command_0_0= ruleCommandName ) ) (this_SQBO_1= RULE_SQBO ( (lv_attributes_2_0= ruleAttributes ) ) (this_KOMMA_3= RULE_KOMMA ( (lv_attributes_4_0= ruleAttributes ) ) )* this_SQBC_5= RULE_SQBC )? (this_CUBO_6= RULE_CUBO ( (lv_types_7_0= ruleID_Token ) )+ this_CUBC_8= RULE_CUBC )? ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token this_SQBO_1=null;
        Token this_KOMMA_3=null;
        Token this_SQBC_5=null;
        Token this_CUBO_6=null;
        Token this_CUBC_8=null;
        EObject lv_command_0_0 = null;

        EObject lv_attributes_2_0 = null;

        EObject lv_attributes_4_0 = null;

        AntlrDatatypeRuleToken lv_types_7_0 = null;



        	enterRule();

        try {
            // InternalTexDsl.g:316:2: ( ( ( (lv_command_0_0= ruleCommandName ) ) (this_SQBO_1= RULE_SQBO ( (lv_attributes_2_0= ruleAttributes ) ) (this_KOMMA_3= RULE_KOMMA ( (lv_attributes_4_0= ruleAttributes ) ) )* this_SQBC_5= RULE_SQBC )? (this_CUBO_6= RULE_CUBO ( (lv_types_7_0= ruleID_Token ) )+ this_CUBC_8= RULE_CUBC )? ) )
            // InternalTexDsl.g:317:2: ( ( (lv_command_0_0= ruleCommandName ) ) (this_SQBO_1= RULE_SQBO ( (lv_attributes_2_0= ruleAttributes ) ) (this_KOMMA_3= RULE_KOMMA ( (lv_attributes_4_0= ruleAttributes ) ) )* this_SQBC_5= RULE_SQBC )? (this_CUBO_6= RULE_CUBO ( (lv_types_7_0= ruleID_Token ) )+ this_CUBC_8= RULE_CUBC )? )
            {
            // InternalTexDsl.g:317:2: ( ( (lv_command_0_0= ruleCommandName ) ) (this_SQBO_1= RULE_SQBO ( (lv_attributes_2_0= ruleAttributes ) ) (this_KOMMA_3= RULE_KOMMA ( (lv_attributes_4_0= ruleAttributes ) ) )* this_SQBC_5= RULE_SQBC )? (this_CUBO_6= RULE_CUBO ( (lv_types_7_0= ruleID_Token ) )+ this_CUBC_8= RULE_CUBC )? )
            // InternalTexDsl.g:318:3: ( (lv_command_0_0= ruleCommandName ) ) (this_SQBO_1= RULE_SQBO ( (lv_attributes_2_0= ruleAttributes ) ) (this_KOMMA_3= RULE_KOMMA ( (lv_attributes_4_0= ruleAttributes ) ) )* this_SQBC_5= RULE_SQBC )? (this_CUBO_6= RULE_CUBO ( (lv_types_7_0= ruleID_Token ) )+ this_CUBC_8= RULE_CUBC )?
            {
            // InternalTexDsl.g:318:3: ( (lv_command_0_0= ruleCommandName ) )
            // InternalTexDsl.g:319:4: (lv_command_0_0= ruleCommandName )
            {
            // InternalTexDsl.g:319:4: (lv_command_0_0= ruleCommandName )
            // InternalTexDsl.g:320:5: lv_command_0_0= ruleCommandName
            {

            					newCompositeNode(grammarAccess.getCommandAccess().getCommandCommandNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_command_0_0=ruleCommandName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCommandRule());
            					}
            					set(
            						current,
            						"command",
            						lv_command_0_0,
            						"org.xixum.latex.TexDsl.CommandName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTexDsl.g:337:3: (this_SQBO_1= RULE_SQBO ( (lv_attributes_2_0= ruleAttributes ) ) (this_KOMMA_3= RULE_KOMMA ( (lv_attributes_4_0= ruleAttributes ) ) )* this_SQBC_5= RULE_SQBC )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_SQBO) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalTexDsl.g:338:4: this_SQBO_1= RULE_SQBO ( (lv_attributes_2_0= ruleAttributes ) ) (this_KOMMA_3= RULE_KOMMA ( (lv_attributes_4_0= ruleAttributes ) ) )* this_SQBC_5= RULE_SQBC
                    {
                    this_SQBO_1=(Token)match(input,RULE_SQBO,FOLLOW_4); 

                    				newLeafNode(this_SQBO_1, grammarAccess.getCommandAccess().getSQBOTerminalRuleCall_1_0());
                    			
                    // InternalTexDsl.g:342:4: ( (lv_attributes_2_0= ruleAttributes ) )
                    // InternalTexDsl.g:343:5: (lv_attributes_2_0= ruleAttributes )
                    {
                    // InternalTexDsl.g:343:5: (lv_attributes_2_0= ruleAttributes )
                    // InternalTexDsl.g:344:6: lv_attributes_2_0= ruleAttributes
                    {

                    						newCompositeNode(grammarAccess.getCommandAccess().getAttributesAttributesParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_attributes_2_0=ruleAttributes();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommandRule());
                    						}
                    						add(
                    							current,
                    							"attributes",
                    							lv_attributes_2_0,
                    							"org.xixum.latex.TexDsl.Attributes");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTexDsl.g:361:4: (this_KOMMA_3= RULE_KOMMA ( (lv_attributes_4_0= ruleAttributes ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_KOMMA) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalTexDsl.g:362:5: this_KOMMA_3= RULE_KOMMA ( (lv_attributes_4_0= ruleAttributes ) )
                    	    {
                    	    this_KOMMA_3=(Token)match(input,RULE_KOMMA,FOLLOW_4); 

                    	    					newLeafNode(this_KOMMA_3, grammarAccess.getCommandAccess().getKOMMATerminalRuleCall_1_2_0());
                    	    				
                    	    // InternalTexDsl.g:366:5: ( (lv_attributes_4_0= ruleAttributes ) )
                    	    // InternalTexDsl.g:367:6: (lv_attributes_4_0= ruleAttributes )
                    	    {
                    	    // InternalTexDsl.g:367:6: (lv_attributes_4_0= ruleAttributes )
                    	    // InternalTexDsl.g:368:7: lv_attributes_4_0= ruleAttributes
                    	    {

                    	    							newCompositeNode(grammarAccess.getCommandAccess().getAttributesAttributesParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_attributes_4_0=ruleAttributes();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCommandRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attributes",
                    	    								lv_attributes_4_0,
                    	    								"org.xixum.latex.TexDsl.Attributes");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    this_SQBC_5=(Token)match(input,RULE_SQBC,FOLLOW_7); 

                    				newLeafNode(this_SQBC_5, grammarAccess.getCommandAccess().getSQBCTerminalRuleCall_1_3());
                    			

                    }
                    break;

            }

            // InternalTexDsl.g:391:3: (this_CUBO_6= RULE_CUBO ( (lv_types_7_0= ruleID_Token ) )+ this_CUBC_8= RULE_CUBC )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_CUBO) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTexDsl.g:392:4: this_CUBO_6= RULE_CUBO ( (lv_types_7_0= ruleID_Token ) )+ this_CUBC_8= RULE_CUBC
                    {
                    this_CUBO_6=(Token)match(input,RULE_CUBO,FOLLOW_8); 

                    				newLeafNode(this_CUBO_6, grammarAccess.getCommandAccess().getCUBOTerminalRuleCall_2_0());
                    			
                    // InternalTexDsl.g:396:4: ( (lv_types_7_0= ruleID_Token ) )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>=RULE_ALPHA_NUMERIC && LA7_0<=RULE_ID)) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalTexDsl.g:397:5: (lv_types_7_0= ruleID_Token )
                    	    {
                    	    // InternalTexDsl.g:397:5: (lv_types_7_0= ruleID_Token )
                    	    // InternalTexDsl.g:398:6: lv_types_7_0= ruleID_Token
                    	    {

                    	    						newCompositeNode(grammarAccess.getCommandAccess().getTypesID_TokenParserRuleCall_2_1_0());
                    	    					
                    	    pushFollow(FOLLOW_9);
                    	    lv_types_7_0=ruleID_Token();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getCommandRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"types",
                    	    							lv_types_7_0,
                    	    							"org.xixum.latex.TexDsl.ID_Token");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


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

                    this_CUBC_8=(Token)match(input,RULE_CUBC,FOLLOW_2); 

                    				newLeafNode(this_CUBC_8, grammarAccess.getCommandAccess().getCUBCTerminalRuleCall_2_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleAttributes"
    // InternalTexDsl.g:424:1: entryRuleAttributes returns [EObject current=null] : iv_ruleAttributes= ruleAttributes EOF ;
    public final EObject entryRuleAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributes = null;


        try {
            // InternalTexDsl.g:424:51: (iv_ruleAttributes= ruleAttributes EOF )
            // InternalTexDsl.g:425:2: iv_ruleAttributes= ruleAttributes EOF
            {
             newCompositeNode(grammarAccess.getAttributesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributes=ruleAttributes();

            state._fsp--;

             current =iv_ruleAttributes; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAttributes"


    // $ANTLR start "ruleAttributes"
    // InternalTexDsl.g:431:1: ruleAttributes returns [EObject current=null] : ( ( (lv_key_0_0= ruleToken ) ) (this_EQ_1= RULE_EQ ( ( (lv_value_2_0= ruleID_Token ) ) | (this_CUBO_3= RULE_CUBO ( (lv_multiValue_4_0= ruleID_Token ) )+ this_CUBC_5= RULE_CUBC ) ) )? ) ;
    public final EObject ruleAttributes() throws RecognitionException {
        EObject current = null;

        Token this_EQ_1=null;
        Token this_CUBO_3=null;
        Token this_CUBC_5=null;
        EObject lv_key_0_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;

        AntlrDatatypeRuleToken lv_multiValue_4_0 = null;



        	enterRule();

        try {
            // InternalTexDsl.g:437:2: ( ( ( (lv_key_0_0= ruleToken ) ) (this_EQ_1= RULE_EQ ( ( (lv_value_2_0= ruleID_Token ) ) | (this_CUBO_3= RULE_CUBO ( (lv_multiValue_4_0= ruleID_Token ) )+ this_CUBC_5= RULE_CUBC ) ) )? ) )
            // InternalTexDsl.g:438:2: ( ( (lv_key_0_0= ruleToken ) ) (this_EQ_1= RULE_EQ ( ( (lv_value_2_0= ruleID_Token ) ) | (this_CUBO_3= RULE_CUBO ( (lv_multiValue_4_0= ruleID_Token ) )+ this_CUBC_5= RULE_CUBC ) ) )? )
            {
            // InternalTexDsl.g:438:2: ( ( (lv_key_0_0= ruleToken ) ) (this_EQ_1= RULE_EQ ( ( (lv_value_2_0= ruleID_Token ) ) | (this_CUBO_3= RULE_CUBO ( (lv_multiValue_4_0= ruleID_Token ) )+ this_CUBC_5= RULE_CUBC ) ) )? )
            // InternalTexDsl.g:439:3: ( (lv_key_0_0= ruleToken ) ) (this_EQ_1= RULE_EQ ( ( (lv_value_2_0= ruleID_Token ) ) | (this_CUBO_3= RULE_CUBO ( (lv_multiValue_4_0= ruleID_Token ) )+ this_CUBC_5= RULE_CUBC ) ) )?
            {
            // InternalTexDsl.g:439:3: ( (lv_key_0_0= ruleToken ) )
            // InternalTexDsl.g:440:4: (lv_key_0_0= ruleToken )
            {
            // InternalTexDsl.g:440:4: (lv_key_0_0= ruleToken )
            // InternalTexDsl.g:441:5: lv_key_0_0= ruleToken
            {

            					newCompositeNode(grammarAccess.getAttributesAccess().getKeyTokenParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
            lv_key_0_0=ruleToken();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributesRule());
            					}
            					set(
            						current,
            						"key",
            						lv_key_0_0,
            						"org.xixum.latex.TexDsl.Token");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTexDsl.g:458:3: (this_EQ_1= RULE_EQ ( ( (lv_value_2_0= ruleID_Token ) ) | (this_CUBO_3= RULE_CUBO ( (lv_multiValue_4_0= ruleID_Token ) )+ this_CUBC_5= RULE_CUBC ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_EQ) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalTexDsl.g:459:4: this_EQ_1= RULE_EQ ( ( (lv_value_2_0= ruleID_Token ) ) | (this_CUBO_3= RULE_CUBO ( (lv_multiValue_4_0= ruleID_Token ) )+ this_CUBC_5= RULE_CUBC ) )
                    {
                    this_EQ_1=(Token)match(input,RULE_EQ,FOLLOW_11); 

                    				newLeafNode(this_EQ_1, grammarAccess.getAttributesAccess().getEQTerminalRuleCall_1_0());
                    			
                    // InternalTexDsl.g:463:4: ( ( (lv_value_2_0= ruleID_Token ) ) | (this_CUBO_3= RULE_CUBO ( (lv_multiValue_4_0= ruleID_Token ) )+ this_CUBC_5= RULE_CUBC ) )
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( ((LA10_0>=RULE_ALPHA_NUMERIC && LA10_0<=RULE_ID)) ) {
                        alt10=1;
                    }
                    else if ( (LA10_0==RULE_CUBO) ) {
                        alt10=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalTexDsl.g:464:5: ( (lv_value_2_0= ruleID_Token ) )
                            {
                            // InternalTexDsl.g:464:5: ( (lv_value_2_0= ruleID_Token ) )
                            // InternalTexDsl.g:465:6: (lv_value_2_0= ruleID_Token )
                            {
                            // InternalTexDsl.g:465:6: (lv_value_2_0= ruleID_Token )
                            // InternalTexDsl.g:466:7: lv_value_2_0= ruleID_Token
                            {

                            							newCompositeNode(grammarAccess.getAttributesAccess().getValueID_TokenParserRuleCall_1_1_0_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_value_2_0=ruleID_Token();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getAttributesRule());
                            							}
                            							set(
                            								current,
                            								"value",
                            								lv_value_2_0,
                            								"org.xixum.latex.TexDsl.ID_Token");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalTexDsl.g:484:5: (this_CUBO_3= RULE_CUBO ( (lv_multiValue_4_0= ruleID_Token ) )+ this_CUBC_5= RULE_CUBC )
                            {
                            // InternalTexDsl.g:484:5: (this_CUBO_3= RULE_CUBO ( (lv_multiValue_4_0= ruleID_Token ) )+ this_CUBC_5= RULE_CUBC )
                            // InternalTexDsl.g:485:6: this_CUBO_3= RULE_CUBO ( (lv_multiValue_4_0= ruleID_Token ) )+ this_CUBC_5= RULE_CUBC
                            {
                            this_CUBO_3=(Token)match(input,RULE_CUBO,FOLLOW_8); 

                            						newLeafNode(this_CUBO_3, grammarAccess.getAttributesAccess().getCUBOTerminalRuleCall_1_1_1_0());
                            					
                            // InternalTexDsl.g:489:6: ( (lv_multiValue_4_0= ruleID_Token ) )+
                            int cnt9=0;
                            loop9:
                            do {
                                int alt9=2;
                                int LA9_0 = input.LA(1);

                                if ( ((LA9_0>=RULE_ALPHA_NUMERIC && LA9_0<=RULE_ID)) ) {
                                    alt9=1;
                                }


                                switch (alt9) {
                            	case 1 :
                            	    // InternalTexDsl.g:490:7: (lv_multiValue_4_0= ruleID_Token )
                            	    {
                            	    // InternalTexDsl.g:490:7: (lv_multiValue_4_0= ruleID_Token )
                            	    // InternalTexDsl.g:491:8: lv_multiValue_4_0= ruleID_Token
                            	    {

                            	    								newCompositeNode(grammarAccess.getAttributesAccess().getMultiValueID_TokenParserRuleCall_1_1_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_9);
                            	    lv_multiValue_4_0=ruleID_Token();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getAttributesRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"multiValue",
                            	    									lv_multiValue_4_0,
                            	    									"org.xixum.latex.TexDsl.ID_Token");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


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

                            this_CUBC_5=(Token)match(input,RULE_CUBC,FOLLOW_2); 

                            						newLeafNode(this_CUBC_5, grammarAccess.getAttributesAccess().getCUBCTerminalRuleCall_1_1_1_2());
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributes"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000000000A2L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000902L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000001060L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000860L});

}