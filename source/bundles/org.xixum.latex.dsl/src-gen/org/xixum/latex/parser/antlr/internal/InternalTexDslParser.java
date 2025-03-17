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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_END", "RULE_ALPHA_NUMERIC", "RULE_ID", "RULE_BS", "RULE_BO", "RULE_BC", "RULE_SPACE", "RULE_CUBO", "RULE_PIPE", "RULE_CUBC", "RULE_SQBO", "RULE_KOMMA", "RULE_SQBC", "RULE_EQ", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_SYMBOL", "RULE_SYMBOLS", "RULE_ALPHA", "RULE_NUMERIC", "RULE_DOT", "RULE_AND", "RULE_ALPHAC", "RULE_ALPHAS", "RULE_WS", "RULE_ANY_OTHER"
    };
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


    // $ANTLR start "entryRuleID_WS"
    // InternalTexDsl.g:239:1: entryRuleID_WS returns [String current=null] : iv_ruleID_WS= ruleID_WS EOF ;
    public final String entryRuleID_WS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleID_WS = null;


        try {
            // InternalTexDsl.g:239:45: (iv_ruleID_WS= ruleID_WS EOF )
            // InternalTexDsl.g:240:2: iv_ruleID_WS= ruleID_WS EOF
            {
             newCompositeNode(grammarAccess.getID_WSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleID_WS=ruleID_WS();

            state._fsp--;

             current =iv_ruleID_WS.getText(); 
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
    // $ANTLR end "entryRuleID_WS"


    // $ANTLR start "ruleID_WS"
    // InternalTexDsl.g:246:1: ruleID_WS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_BS_0= RULE_BS )? (this_ID_1= RULE_ID | this_ALPHA_NUMERIC_2= RULE_ALPHA_NUMERIC | this_BO_3= RULE_BO | this_BC_4= RULE_BC ) (this_SPACE_5= RULE_SPACE (this_ID_6= RULE_ID | this_ALPHA_NUMERIC_7= RULE_ALPHA_NUMERIC | this_BO_8= RULE_BO | this_BC_9= RULE_BC ) )* ) ;
    public final AntlrDatatypeRuleToken ruleID_WS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BS_0=null;
        Token this_ID_1=null;
        Token this_ALPHA_NUMERIC_2=null;
        Token this_BO_3=null;
        Token this_BC_4=null;
        Token this_SPACE_5=null;
        Token this_ID_6=null;
        Token this_ALPHA_NUMERIC_7=null;
        Token this_BO_8=null;
        Token this_BC_9=null;


        	enterRule();

        try {
            // InternalTexDsl.g:252:2: ( ( (this_BS_0= RULE_BS )? (this_ID_1= RULE_ID | this_ALPHA_NUMERIC_2= RULE_ALPHA_NUMERIC | this_BO_3= RULE_BO | this_BC_4= RULE_BC ) (this_SPACE_5= RULE_SPACE (this_ID_6= RULE_ID | this_ALPHA_NUMERIC_7= RULE_ALPHA_NUMERIC | this_BO_8= RULE_BO | this_BC_9= RULE_BC ) )* ) )
            // InternalTexDsl.g:253:2: ( (this_BS_0= RULE_BS )? (this_ID_1= RULE_ID | this_ALPHA_NUMERIC_2= RULE_ALPHA_NUMERIC | this_BO_3= RULE_BO | this_BC_4= RULE_BC ) (this_SPACE_5= RULE_SPACE (this_ID_6= RULE_ID | this_ALPHA_NUMERIC_7= RULE_ALPHA_NUMERIC | this_BO_8= RULE_BO | this_BC_9= RULE_BC ) )* )
            {
            // InternalTexDsl.g:253:2: ( (this_BS_0= RULE_BS )? (this_ID_1= RULE_ID | this_ALPHA_NUMERIC_2= RULE_ALPHA_NUMERIC | this_BO_3= RULE_BO | this_BC_4= RULE_BC ) (this_SPACE_5= RULE_SPACE (this_ID_6= RULE_ID | this_ALPHA_NUMERIC_7= RULE_ALPHA_NUMERIC | this_BO_8= RULE_BO | this_BC_9= RULE_BC ) )* )
            // InternalTexDsl.g:254:3: (this_BS_0= RULE_BS )? (this_ID_1= RULE_ID | this_ALPHA_NUMERIC_2= RULE_ALPHA_NUMERIC | this_BO_3= RULE_BO | this_BC_4= RULE_BC ) (this_SPACE_5= RULE_SPACE (this_ID_6= RULE_ID | this_ALPHA_NUMERIC_7= RULE_ALPHA_NUMERIC | this_BO_8= RULE_BO | this_BC_9= RULE_BC ) )*
            {
            // InternalTexDsl.g:254:3: (this_BS_0= RULE_BS )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_BS) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalTexDsl.g:255:4: this_BS_0= RULE_BS
                    {
                    this_BS_0=(Token)match(input,RULE_BS,FOLLOW_4); 

                    				current.merge(this_BS_0);
                    			

                    				newLeafNode(this_BS_0, grammarAccess.getID_WSAccess().getBSTerminalRuleCall_0());
                    			

                    }
                    break;

            }

            // InternalTexDsl.g:263:3: (this_ID_1= RULE_ID | this_ALPHA_NUMERIC_2= RULE_ALPHA_NUMERIC | this_BO_3= RULE_BO | this_BC_4= RULE_BC )
            int alt6=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt6=1;
                }
                break;
            case RULE_ALPHA_NUMERIC:
                {
                alt6=2;
                }
                break;
            case RULE_BO:
                {
                alt6=3;
                }
                break;
            case RULE_BC:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalTexDsl.g:264:4: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_5); 

                    				current.merge(this_ID_1);
                    			

                    				newLeafNode(this_ID_1, grammarAccess.getID_WSAccess().getIDTerminalRuleCall_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalTexDsl.g:272:4: this_ALPHA_NUMERIC_2= RULE_ALPHA_NUMERIC
                    {
                    this_ALPHA_NUMERIC_2=(Token)match(input,RULE_ALPHA_NUMERIC,FOLLOW_5); 

                    				current.merge(this_ALPHA_NUMERIC_2);
                    			

                    				newLeafNode(this_ALPHA_NUMERIC_2, grammarAccess.getID_WSAccess().getALPHA_NUMERICTerminalRuleCall_1_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalTexDsl.g:280:4: this_BO_3= RULE_BO
                    {
                    this_BO_3=(Token)match(input,RULE_BO,FOLLOW_5); 

                    				current.merge(this_BO_3);
                    			

                    				newLeafNode(this_BO_3, grammarAccess.getID_WSAccess().getBOTerminalRuleCall_1_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalTexDsl.g:288:4: this_BC_4= RULE_BC
                    {
                    this_BC_4=(Token)match(input,RULE_BC,FOLLOW_5); 

                    				current.merge(this_BC_4);
                    			

                    				newLeafNode(this_BC_4, grammarAccess.getID_WSAccess().getBCTerminalRuleCall_1_3());
                    			

                    }
                    break;

            }

            // InternalTexDsl.g:296:3: (this_SPACE_5= RULE_SPACE (this_ID_6= RULE_ID | this_ALPHA_NUMERIC_7= RULE_ALPHA_NUMERIC | this_BO_8= RULE_BO | this_BC_9= RULE_BC ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_SPACE) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalTexDsl.g:297:4: this_SPACE_5= RULE_SPACE (this_ID_6= RULE_ID | this_ALPHA_NUMERIC_7= RULE_ALPHA_NUMERIC | this_BO_8= RULE_BO | this_BC_9= RULE_BC )
            	    {
            	    this_SPACE_5=(Token)match(input,RULE_SPACE,FOLLOW_4); 

            	    				current.merge(this_SPACE_5);
            	    			

            	    				newLeafNode(this_SPACE_5, grammarAccess.getID_WSAccess().getSPACETerminalRuleCall_2_0());
            	    			
            	    // InternalTexDsl.g:304:4: (this_ID_6= RULE_ID | this_ALPHA_NUMERIC_7= RULE_ALPHA_NUMERIC | this_BO_8= RULE_BO | this_BC_9= RULE_BC )
            	    int alt7=4;
            	    switch ( input.LA(1) ) {
            	    case RULE_ID:
            	        {
            	        alt7=1;
            	        }
            	        break;
            	    case RULE_ALPHA_NUMERIC:
            	        {
            	        alt7=2;
            	        }
            	        break;
            	    case RULE_BO:
            	        {
            	        alt7=3;
            	        }
            	        break;
            	    case RULE_BC:
            	        {
            	        alt7=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 7, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt7) {
            	        case 1 :
            	            // InternalTexDsl.g:305:5: this_ID_6= RULE_ID
            	            {
            	            this_ID_6=(Token)match(input,RULE_ID,FOLLOW_5); 

            	            					current.merge(this_ID_6);
            	            				

            	            					newLeafNode(this_ID_6, grammarAccess.getID_WSAccess().getIDTerminalRuleCall_2_1_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalTexDsl.g:313:5: this_ALPHA_NUMERIC_7= RULE_ALPHA_NUMERIC
            	            {
            	            this_ALPHA_NUMERIC_7=(Token)match(input,RULE_ALPHA_NUMERIC,FOLLOW_5); 

            	            					current.merge(this_ALPHA_NUMERIC_7);
            	            				

            	            					newLeafNode(this_ALPHA_NUMERIC_7, grammarAccess.getID_WSAccess().getALPHA_NUMERICTerminalRuleCall_2_1_1());
            	            				

            	            }
            	            break;
            	        case 3 :
            	            // InternalTexDsl.g:321:5: this_BO_8= RULE_BO
            	            {
            	            this_BO_8=(Token)match(input,RULE_BO,FOLLOW_5); 

            	            					current.merge(this_BO_8);
            	            				

            	            					newLeafNode(this_BO_8, grammarAccess.getID_WSAccess().getBOTerminalRuleCall_2_1_2());
            	            				

            	            }
            	            break;
            	        case 4 :
            	            // InternalTexDsl.g:329:5: this_BC_9= RULE_BC
            	            {
            	            this_BC_9=(Token)match(input,RULE_BC,FOLLOW_5); 

            	            					current.merge(this_BC_9);
            	            				

            	            					newLeafNode(this_BC_9, grammarAccess.getID_WSAccess().getBCTerminalRuleCall_2_1_3());
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


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
    // $ANTLR end "ruleID_WS"


    // $ANTLR start "entryRuleSubCommName"
    // InternalTexDsl.g:342:1: entryRuleSubCommName returns [EObject current=null] : iv_ruleSubCommName= ruleSubCommName EOF ;
    public final EObject entryRuleSubCommName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubCommName = null;


        try {
            // InternalTexDsl.g:342:52: (iv_ruleSubCommName= ruleSubCommName EOF )
            // InternalTexDsl.g:343:2: iv_ruleSubCommName= ruleSubCommName EOF
            {
             newCompositeNode(grammarAccess.getSubCommNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubCommName=ruleSubCommName();

            state._fsp--;

             current =iv_ruleSubCommName; 
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
    // $ANTLR end "entryRuleSubCommName"


    // $ANTLR start "ruleSubCommName"
    // InternalTexDsl.g:349:1: ruleSubCommName returns [EObject current=null] : ( ( (lv_id_0_0= ruleID_WS ) ) ( (lv_subCommand_1_0= ruleSubCommand ) )? ) ;
    public final EObject ruleSubCommName() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_id_0_0 = null;

        EObject lv_subCommand_1_0 = null;



        	enterRule();

        try {
            // InternalTexDsl.g:355:2: ( ( ( (lv_id_0_0= ruleID_WS ) ) ( (lv_subCommand_1_0= ruleSubCommand ) )? ) )
            // InternalTexDsl.g:356:2: ( ( (lv_id_0_0= ruleID_WS ) ) ( (lv_subCommand_1_0= ruleSubCommand ) )? )
            {
            // InternalTexDsl.g:356:2: ( ( (lv_id_0_0= ruleID_WS ) ) ( (lv_subCommand_1_0= ruleSubCommand ) )? )
            // InternalTexDsl.g:357:3: ( (lv_id_0_0= ruleID_WS ) ) ( (lv_subCommand_1_0= ruleSubCommand ) )?
            {
            // InternalTexDsl.g:357:3: ( (lv_id_0_0= ruleID_WS ) )
            // InternalTexDsl.g:358:4: (lv_id_0_0= ruleID_WS )
            {
            // InternalTexDsl.g:358:4: (lv_id_0_0= ruleID_WS )
            // InternalTexDsl.g:359:5: lv_id_0_0= ruleID_WS
            {

            					newCompositeNode(grammarAccess.getSubCommNameAccess().getIdID_WSParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_id_0_0=ruleID_WS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubCommNameRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_0_0,
            						"org.xixum.latex.TexDsl.ID_WS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTexDsl.g:376:3: ( (lv_subCommand_1_0= ruleSubCommand ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_CUBO) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTexDsl.g:377:4: (lv_subCommand_1_0= ruleSubCommand )
                    {
                    // InternalTexDsl.g:377:4: (lv_subCommand_1_0= ruleSubCommand )
                    // InternalTexDsl.g:378:5: lv_subCommand_1_0= ruleSubCommand
                    {

                    					newCompositeNode(grammarAccess.getSubCommNameAccess().getSubCommandSubCommandParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_subCommand_1_0=ruleSubCommand();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSubCommNameRule());
                    					}
                    					set(
                    						current,
                    						"subCommand",
                    						lv_subCommand_1_0,
                    						"org.xixum.latex.TexDsl.SubCommand");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleSubCommName"


    // $ANTLR start "entryRuleCommandName"
    // InternalTexDsl.g:399:1: entryRuleCommandName returns [EObject current=null] : iv_ruleCommandName= ruleCommandName EOF ;
    public final EObject entryRuleCommandName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandName = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTexDsl.g:401:2: (iv_ruleCommandName= ruleCommandName EOF )
            // InternalTexDsl.g:402:2: iv_ruleCommandName= ruleCommandName EOF
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
    // InternalTexDsl.g:411:1: ruleCommandName returns [EObject current=null] : ( ( (lv_leading_0_0= RULE_BS ) ) ( (lv_cName_1_0= RULE_ALPHA_NUMERIC ) ) ) ;
    public final EObject ruleCommandName() throws RecognitionException {
        EObject current = null;

        Token lv_leading_0_0=null;
        Token lv_cName_1_0=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTexDsl.g:418:2: ( ( ( (lv_leading_0_0= RULE_BS ) ) ( (lv_cName_1_0= RULE_ALPHA_NUMERIC ) ) ) )
            // InternalTexDsl.g:419:2: ( ( (lv_leading_0_0= RULE_BS ) ) ( (lv_cName_1_0= RULE_ALPHA_NUMERIC ) ) )
            {
            // InternalTexDsl.g:419:2: ( ( (lv_leading_0_0= RULE_BS ) ) ( (lv_cName_1_0= RULE_ALPHA_NUMERIC ) ) )
            // InternalTexDsl.g:420:3: ( (lv_leading_0_0= RULE_BS ) ) ( (lv_cName_1_0= RULE_ALPHA_NUMERIC ) )
            {
            // InternalTexDsl.g:420:3: ( (lv_leading_0_0= RULE_BS ) )
            // InternalTexDsl.g:421:4: (lv_leading_0_0= RULE_BS )
            {
            // InternalTexDsl.g:421:4: (lv_leading_0_0= RULE_BS )
            // InternalTexDsl.g:422:5: lv_leading_0_0= RULE_BS
            {
            lv_leading_0_0=(Token)match(input,RULE_BS,FOLLOW_7); 

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

            // InternalTexDsl.g:438:3: ( (lv_cName_1_0= RULE_ALPHA_NUMERIC ) )
            // InternalTexDsl.g:439:4: (lv_cName_1_0= RULE_ALPHA_NUMERIC )
            {
            // InternalTexDsl.g:439:4: (lv_cName_1_0= RULE_ALPHA_NUMERIC )
            // InternalTexDsl.g:440:5: lv_cName_1_0= RULE_ALPHA_NUMERIC
            {
            lv_cName_1_0=(Token)match(input,RULE_ALPHA_NUMERIC,FOLLOW_2); 

            					newLeafNode(lv_cName_1_0, grammarAccess.getCommandNameAccess().getCNameALPHA_NUMERICTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommandNameRule());
            					}
            					setWithLastConsumed(
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


    // $ANTLR start "entryRuleSubCommand"
    // InternalTexDsl.g:463:1: entryRuleSubCommand returns [EObject current=null] : iv_ruleSubCommand= ruleSubCommand EOF ;
    public final EObject entryRuleSubCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubCommand = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTexDsl.g:465:2: (iv_ruleSubCommand= ruleSubCommand EOF )
            // InternalTexDsl.g:466:2: iv_ruleSubCommand= ruleSubCommand EOF
            {
             newCompositeNode(grammarAccess.getSubCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubCommand=ruleSubCommand();

            state._fsp--;

             current =iv_ruleSubCommand; 
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
    // $ANTLR end "entryRuleSubCommand"


    // $ANTLR start "ruleSubCommand"
    // InternalTexDsl.g:475:1: ruleSubCommand returns [EObject current=null] : (this_CUBO_0= RULE_CUBO ( (lv_types_1_0= ruleSubCommName ) ) (this_PIPE_2= RULE_PIPE ( (lv_types_3_0= ruleSubCommName ) ) )* this_CUBC_4= RULE_CUBC ) ;
    public final EObject ruleSubCommand() throws RecognitionException {
        EObject current = null;

        Token this_CUBO_0=null;
        Token this_PIPE_2=null;
        Token this_CUBC_4=null;
        EObject lv_types_1_0 = null;

        EObject lv_types_3_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTexDsl.g:482:2: ( (this_CUBO_0= RULE_CUBO ( (lv_types_1_0= ruleSubCommName ) ) (this_PIPE_2= RULE_PIPE ( (lv_types_3_0= ruleSubCommName ) ) )* this_CUBC_4= RULE_CUBC ) )
            // InternalTexDsl.g:483:2: (this_CUBO_0= RULE_CUBO ( (lv_types_1_0= ruleSubCommName ) ) (this_PIPE_2= RULE_PIPE ( (lv_types_3_0= ruleSubCommName ) ) )* this_CUBC_4= RULE_CUBC )
            {
            // InternalTexDsl.g:483:2: (this_CUBO_0= RULE_CUBO ( (lv_types_1_0= ruleSubCommName ) ) (this_PIPE_2= RULE_PIPE ( (lv_types_3_0= ruleSubCommName ) ) )* this_CUBC_4= RULE_CUBC )
            // InternalTexDsl.g:484:3: this_CUBO_0= RULE_CUBO ( (lv_types_1_0= ruleSubCommName ) ) (this_PIPE_2= RULE_PIPE ( (lv_types_3_0= ruleSubCommName ) ) )* this_CUBC_4= RULE_CUBC
            {
            this_CUBO_0=(Token)match(input,RULE_CUBO,FOLLOW_8); 

            			newLeafNode(this_CUBO_0, grammarAccess.getSubCommandAccess().getCUBOTerminalRuleCall_0());
            		
            // InternalTexDsl.g:488:3: ( (lv_types_1_0= ruleSubCommName ) )
            // InternalTexDsl.g:489:4: (lv_types_1_0= ruleSubCommName )
            {
            // InternalTexDsl.g:489:4: (lv_types_1_0= ruleSubCommName )
            // InternalTexDsl.g:490:5: lv_types_1_0= ruleSubCommName
            {

            					newCompositeNode(grammarAccess.getSubCommandAccess().getTypesSubCommNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_types_1_0=ruleSubCommName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubCommandRule());
            					}
            					add(
            						current,
            						"types",
            						lv_types_1_0,
            						"org.xixum.latex.TexDsl.SubCommName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTexDsl.g:507:3: (this_PIPE_2= RULE_PIPE ( (lv_types_3_0= ruleSubCommName ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_PIPE) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalTexDsl.g:508:4: this_PIPE_2= RULE_PIPE ( (lv_types_3_0= ruleSubCommName ) )
            	    {
            	    this_PIPE_2=(Token)match(input,RULE_PIPE,FOLLOW_8); 

            	    				newLeafNode(this_PIPE_2, grammarAccess.getSubCommandAccess().getPIPETerminalRuleCall_2_0());
            	    			
            	    // InternalTexDsl.g:512:4: ( (lv_types_3_0= ruleSubCommName ) )
            	    // InternalTexDsl.g:513:5: (lv_types_3_0= ruleSubCommName )
            	    {
            	    // InternalTexDsl.g:513:5: (lv_types_3_0= ruleSubCommName )
            	    // InternalTexDsl.g:514:6: lv_types_3_0= ruleSubCommName
            	    {

            	    						newCompositeNode(grammarAccess.getSubCommandAccess().getTypesSubCommNameParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_types_3_0=ruleSubCommName();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSubCommandRule());
            	    						}
            	    						add(
            	    							current,
            	    							"types",
            	    							lv_types_3_0,
            	    							"org.xixum.latex.TexDsl.SubCommName");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            this_CUBC_4=(Token)match(input,RULE_CUBC,FOLLOW_2); 

            			newLeafNode(this_CUBC_4, grammarAccess.getSubCommandAccess().getCUBCTerminalRuleCall_3());
            		

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
    // $ANTLR end "ruleSubCommand"


    // $ANTLR start "entryRuleCommandParameters"
    // InternalTexDsl.g:543:1: entryRuleCommandParameters returns [EObject current=null] : iv_ruleCommandParameters= ruleCommandParameters EOF ;
    public final EObject entryRuleCommandParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandParameters = null;


        try {
            // InternalTexDsl.g:543:58: (iv_ruleCommandParameters= ruleCommandParameters EOF )
            // InternalTexDsl.g:544:2: iv_ruleCommandParameters= ruleCommandParameters EOF
            {
             newCompositeNode(grammarAccess.getCommandParametersRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommandParameters=ruleCommandParameters();

            state._fsp--;

             current =iv_ruleCommandParameters; 
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
    // $ANTLR end "entryRuleCommandParameters"


    // $ANTLR start "ruleCommandParameters"
    // InternalTexDsl.g:550:1: ruleCommandParameters returns [EObject current=null] : (this_SQBO_0= RULE_SQBO ( (lv_attributes_1_0= ruleAttributes ) ) (this_KOMMA_2= RULE_KOMMA ( (lv_attributes_3_0= ruleAttributes ) ) )* this_SQBC_4= RULE_SQBC ) ;
    public final EObject ruleCommandParameters() throws RecognitionException {
        EObject current = null;

        Token this_SQBO_0=null;
        Token this_KOMMA_2=null;
        Token this_SQBC_4=null;
        EObject lv_attributes_1_0 = null;

        EObject lv_attributes_3_0 = null;



        	enterRule();

        try {
            // InternalTexDsl.g:556:2: ( (this_SQBO_0= RULE_SQBO ( (lv_attributes_1_0= ruleAttributes ) ) (this_KOMMA_2= RULE_KOMMA ( (lv_attributes_3_0= ruleAttributes ) ) )* this_SQBC_4= RULE_SQBC ) )
            // InternalTexDsl.g:557:2: (this_SQBO_0= RULE_SQBO ( (lv_attributes_1_0= ruleAttributes ) ) (this_KOMMA_2= RULE_KOMMA ( (lv_attributes_3_0= ruleAttributes ) ) )* this_SQBC_4= RULE_SQBC )
            {
            // InternalTexDsl.g:557:2: (this_SQBO_0= RULE_SQBO ( (lv_attributes_1_0= ruleAttributes ) ) (this_KOMMA_2= RULE_KOMMA ( (lv_attributes_3_0= ruleAttributes ) ) )* this_SQBC_4= RULE_SQBC )
            // InternalTexDsl.g:558:3: this_SQBO_0= RULE_SQBO ( (lv_attributes_1_0= ruleAttributes ) ) (this_KOMMA_2= RULE_KOMMA ( (lv_attributes_3_0= ruleAttributes ) ) )* this_SQBC_4= RULE_SQBC
            {
            this_SQBO_0=(Token)match(input,RULE_SQBO,FOLLOW_10); 

            			newLeafNode(this_SQBO_0, grammarAccess.getCommandParametersAccess().getSQBOTerminalRuleCall_0());
            		
            // InternalTexDsl.g:562:3: ( (lv_attributes_1_0= ruleAttributes ) )
            // InternalTexDsl.g:563:4: (lv_attributes_1_0= ruleAttributes )
            {
            // InternalTexDsl.g:563:4: (lv_attributes_1_0= ruleAttributes )
            // InternalTexDsl.g:564:5: lv_attributes_1_0= ruleAttributes
            {

            					newCompositeNode(grammarAccess.getCommandParametersAccess().getAttributesAttributesParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_attributes_1_0=ruleAttributes();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCommandParametersRule());
            					}
            					add(
            						current,
            						"attributes",
            						lv_attributes_1_0,
            						"org.xixum.latex.TexDsl.Attributes");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTexDsl.g:581:3: (this_KOMMA_2= RULE_KOMMA ( (lv_attributes_3_0= ruleAttributes ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_KOMMA) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalTexDsl.g:582:4: this_KOMMA_2= RULE_KOMMA ( (lv_attributes_3_0= ruleAttributes ) )
            	    {
            	    this_KOMMA_2=(Token)match(input,RULE_KOMMA,FOLLOW_10); 

            	    				newLeafNode(this_KOMMA_2, grammarAccess.getCommandParametersAccess().getKOMMATerminalRuleCall_2_0());
            	    			
            	    // InternalTexDsl.g:586:4: ( (lv_attributes_3_0= ruleAttributes ) )
            	    // InternalTexDsl.g:587:5: (lv_attributes_3_0= ruleAttributes )
            	    {
            	    // InternalTexDsl.g:587:5: (lv_attributes_3_0= ruleAttributes )
            	    // InternalTexDsl.g:588:6: lv_attributes_3_0= ruleAttributes
            	    {

            	    						newCompositeNode(grammarAccess.getCommandParametersAccess().getAttributesAttributesParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_attributes_3_0=ruleAttributes();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCommandParametersRule());
            	    						}
            	    						add(
            	    							current,
            	    							"attributes",
            	    							lv_attributes_3_0,
            	    							"org.xixum.latex.TexDsl.Attributes");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            this_SQBC_4=(Token)match(input,RULE_SQBC,FOLLOW_2); 

            			newLeafNode(this_SQBC_4, grammarAccess.getCommandParametersAccess().getSQBCTerminalRuleCall_3());
            		

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
    // $ANTLR end "ruleCommandParameters"


    // $ANTLR start "entryRuleCommand"
    // InternalTexDsl.g:614:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalTexDsl.g:614:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalTexDsl.g:615:2: iv_ruleCommand= ruleCommand EOF
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
    // InternalTexDsl.g:621:1: ruleCommand returns [EObject current=null] : ( ( (lv_command_0_0= ruleCommandName ) ) ( (lv_parameters_1_0= ruleCommandParameters ) )? ( (lv_subCommand_2_0= ruleSubCommand ) )? ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject lv_command_0_0 = null;

        EObject lv_parameters_1_0 = null;

        EObject lv_subCommand_2_0 = null;



        	enterRule();

        try {
            // InternalTexDsl.g:627:2: ( ( ( (lv_command_0_0= ruleCommandName ) ) ( (lv_parameters_1_0= ruleCommandParameters ) )? ( (lv_subCommand_2_0= ruleSubCommand ) )? ) )
            // InternalTexDsl.g:628:2: ( ( (lv_command_0_0= ruleCommandName ) ) ( (lv_parameters_1_0= ruleCommandParameters ) )? ( (lv_subCommand_2_0= ruleSubCommand ) )? )
            {
            // InternalTexDsl.g:628:2: ( ( (lv_command_0_0= ruleCommandName ) ) ( (lv_parameters_1_0= ruleCommandParameters ) )? ( (lv_subCommand_2_0= ruleSubCommand ) )? )
            // InternalTexDsl.g:629:3: ( (lv_command_0_0= ruleCommandName ) ) ( (lv_parameters_1_0= ruleCommandParameters ) )? ( (lv_subCommand_2_0= ruleSubCommand ) )?
            {
            // InternalTexDsl.g:629:3: ( (lv_command_0_0= ruleCommandName ) )
            // InternalTexDsl.g:630:4: (lv_command_0_0= ruleCommandName )
            {
            // InternalTexDsl.g:630:4: (lv_command_0_0= ruleCommandName )
            // InternalTexDsl.g:631:5: lv_command_0_0= ruleCommandName
            {

            					newCompositeNode(grammarAccess.getCommandAccess().getCommandCommandNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
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

            // InternalTexDsl.g:648:3: ( (lv_parameters_1_0= ruleCommandParameters ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_SQBO) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTexDsl.g:649:4: (lv_parameters_1_0= ruleCommandParameters )
                    {
                    // InternalTexDsl.g:649:4: (lv_parameters_1_0= ruleCommandParameters )
                    // InternalTexDsl.g:650:5: lv_parameters_1_0= ruleCommandParameters
                    {

                    					newCompositeNode(grammarAccess.getCommandAccess().getParametersCommandParametersParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_6);
                    lv_parameters_1_0=ruleCommandParameters();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCommandRule());
                    					}
                    					set(
                    						current,
                    						"parameters",
                    						lv_parameters_1_0,
                    						"org.xixum.latex.TexDsl.CommandParameters");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalTexDsl.g:667:3: ( (lv_subCommand_2_0= ruleSubCommand ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_CUBO) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalTexDsl.g:668:4: (lv_subCommand_2_0= ruleSubCommand )
                    {
                    // InternalTexDsl.g:668:4: (lv_subCommand_2_0= ruleSubCommand )
                    // InternalTexDsl.g:669:5: lv_subCommand_2_0= ruleSubCommand
                    {

                    					newCompositeNode(grammarAccess.getCommandAccess().getSubCommandSubCommandParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_subCommand_2_0=ruleSubCommand();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCommandRule());
                    					}
                    					set(
                    						current,
                    						"subCommand",
                    						lv_subCommand_2_0,
                    						"org.xixum.latex.TexDsl.SubCommand");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleAttributes"
    // InternalTexDsl.g:690:1: entryRuleAttributes returns [EObject current=null] : iv_ruleAttributes= ruleAttributes EOF ;
    public final EObject entryRuleAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributes = null;


        try {
            // InternalTexDsl.g:690:51: (iv_ruleAttributes= ruleAttributes EOF )
            // InternalTexDsl.g:691:2: iv_ruleAttributes= ruleAttributes EOF
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
    // InternalTexDsl.g:697:1: ruleAttributes returns [EObject current=null] : ( ( (lv_key_0_0= ruleID_Token ) ) (this_EQ_1= RULE_EQ ( ( (lv_value_2_0= ruleID_Token ) ) | (this_CUBO_3= RULE_CUBO ( (lv_multiValue_4_0= ruleID_Token ) )+ this_CUBC_5= RULE_CUBC ) ) )? ) ;
    public final EObject ruleAttributes() throws RecognitionException {
        EObject current = null;

        Token this_EQ_1=null;
        Token this_CUBO_3=null;
        Token this_CUBC_5=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;

        AntlrDatatypeRuleToken lv_multiValue_4_0 = null;



        	enterRule();

        try {
            // InternalTexDsl.g:703:2: ( ( ( (lv_key_0_0= ruleID_Token ) ) (this_EQ_1= RULE_EQ ( ( (lv_value_2_0= ruleID_Token ) ) | (this_CUBO_3= RULE_CUBO ( (lv_multiValue_4_0= ruleID_Token ) )+ this_CUBC_5= RULE_CUBC ) ) )? ) )
            // InternalTexDsl.g:704:2: ( ( (lv_key_0_0= ruleID_Token ) ) (this_EQ_1= RULE_EQ ( ( (lv_value_2_0= ruleID_Token ) ) | (this_CUBO_3= RULE_CUBO ( (lv_multiValue_4_0= ruleID_Token ) )+ this_CUBC_5= RULE_CUBC ) ) )? )
            {
            // InternalTexDsl.g:704:2: ( ( (lv_key_0_0= ruleID_Token ) ) (this_EQ_1= RULE_EQ ( ( (lv_value_2_0= ruleID_Token ) ) | (this_CUBO_3= RULE_CUBO ( (lv_multiValue_4_0= ruleID_Token ) )+ this_CUBC_5= RULE_CUBC ) ) )? )
            // InternalTexDsl.g:705:3: ( (lv_key_0_0= ruleID_Token ) ) (this_EQ_1= RULE_EQ ( ( (lv_value_2_0= ruleID_Token ) ) | (this_CUBO_3= RULE_CUBO ( (lv_multiValue_4_0= ruleID_Token ) )+ this_CUBC_5= RULE_CUBC ) ) )?
            {
            // InternalTexDsl.g:705:3: ( (lv_key_0_0= ruleID_Token ) )
            // InternalTexDsl.g:706:4: (lv_key_0_0= ruleID_Token )
            {
            // InternalTexDsl.g:706:4: (lv_key_0_0= ruleID_Token )
            // InternalTexDsl.g:707:5: lv_key_0_0= ruleID_Token
            {

            					newCompositeNode(grammarAccess.getAttributesAccess().getKeyID_TokenParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_13);
            lv_key_0_0=ruleID_Token();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributesRule());
            					}
            					set(
            						current,
            						"key",
            						lv_key_0_0,
            						"org.xixum.latex.TexDsl.ID_Token");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTexDsl.g:724:3: (this_EQ_1= RULE_EQ ( ( (lv_value_2_0= ruleID_Token ) ) | (this_CUBO_3= RULE_CUBO ( (lv_multiValue_4_0= ruleID_Token ) )+ this_CUBC_5= RULE_CUBC ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_EQ) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalTexDsl.g:725:4: this_EQ_1= RULE_EQ ( ( (lv_value_2_0= ruleID_Token ) ) | (this_CUBO_3= RULE_CUBO ( (lv_multiValue_4_0= ruleID_Token ) )+ this_CUBC_5= RULE_CUBC ) )
                    {
                    this_EQ_1=(Token)match(input,RULE_EQ,FOLLOW_14); 

                    				newLeafNode(this_EQ_1, grammarAccess.getAttributesAccess().getEQTerminalRuleCall_1_0());
                    			
                    // InternalTexDsl.g:729:4: ( ( (lv_value_2_0= ruleID_Token ) ) | (this_CUBO_3= RULE_CUBO ( (lv_multiValue_4_0= ruleID_Token ) )+ this_CUBC_5= RULE_CUBC ) )
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( ((LA15_0>=RULE_ALPHA_NUMERIC && LA15_0<=RULE_ID)) ) {
                        alt15=1;
                    }
                    else if ( (LA15_0==RULE_CUBO) ) {
                        alt15=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 0, input);

                        throw nvae;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalTexDsl.g:730:5: ( (lv_value_2_0= ruleID_Token ) )
                            {
                            // InternalTexDsl.g:730:5: ( (lv_value_2_0= ruleID_Token ) )
                            // InternalTexDsl.g:731:6: (lv_value_2_0= ruleID_Token )
                            {
                            // InternalTexDsl.g:731:6: (lv_value_2_0= ruleID_Token )
                            // InternalTexDsl.g:732:7: lv_value_2_0= ruleID_Token
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
                            // InternalTexDsl.g:750:5: (this_CUBO_3= RULE_CUBO ( (lv_multiValue_4_0= ruleID_Token ) )+ this_CUBC_5= RULE_CUBC )
                            {
                            // InternalTexDsl.g:750:5: (this_CUBO_3= RULE_CUBO ( (lv_multiValue_4_0= ruleID_Token ) )+ this_CUBC_5= RULE_CUBC )
                            // InternalTexDsl.g:751:6: this_CUBO_3= RULE_CUBO ( (lv_multiValue_4_0= ruleID_Token ) )+ this_CUBC_5= RULE_CUBC
                            {
                            this_CUBO_3=(Token)match(input,RULE_CUBO,FOLLOW_10); 

                            						newLeafNode(this_CUBO_3, grammarAccess.getAttributesAccess().getCUBOTerminalRuleCall_1_1_1_0());
                            					
                            // InternalTexDsl.g:755:6: ( (lv_multiValue_4_0= ruleID_Token ) )+
                            int cnt14=0;
                            loop14:
                            do {
                                int alt14=2;
                                int LA14_0 = input.LA(1);

                                if ( ((LA14_0>=RULE_ALPHA_NUMERIC && LA14_0<=RULE_ID)) ) {
                                    alt14=1;
                                }


                                switch (alt14) {
                            	case 1 :
                            	    // InternalTexDsl.g:756:7: (lv_multiValue_4_0= ruleID_Token )
                            	    {
                            	    // InternalTexDsl.g:756:7: (lv_multiValue_4_0= ruleID_Token )
                            	    // InternalTexDsl.g:757:8: lv_multiValue_4_0= ruleID_Token
                            	    {

                            	    								newCompositeNode(grammarAccess.getAttributesAccess().getMultiValueID_TokenParserRuleCall_1_1_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_15);
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
                            	    if ( cnt14 >= 1 ) break loop14;
                                        EarlyExitException eee =
                                            new EarlyExitException(14, input);
                                        throw eee;
                                }
                                cnt14++;
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000360L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000003E0L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000004802L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000860L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000002060L});

}