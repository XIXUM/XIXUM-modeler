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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_END", "RULE_ID", "RULE_ANY_OTHER", "RULE_KOMMA", "RULE_PIPE", "RULE_EXCL", "RULE_SYMBOL", "RULE_DOT", "RULE_ID_COMM", "RULE_SQBO", "RULE_SQBC", "RULE_CUBO", "RULE_CUBC", "RULE_BO", "RULE_BC", "RULE_EQ", "RULE_SL_COMMENT", "RULE_ALPHA", "RULE_NUMERIC", "RULE_AND", "RULE_BS", "RULE_ALPHAC", "RULE_ALPHAS", "RULE_D_QUOTE", "RULE_S_QUOTE", "RULE_SPACE", "RULE_WS"
    };
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
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalTexDsl.g:71:1: ruleModel returns [EObject current=null] : ( (lv_document_0_0= ruleDocument ) )+ ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_document_0_0 = null;



        	enterRule();

        try {
            // InternalTexDsl.g:77:2: ( ( (lv_document_0_0= ruleDocument ) )+ )
            // InternalTexDsl.g:78:2: ( (lv_document_0_0= ruleDocument ) )+
            {
            // InternalTexDsl.g:78:2: ( (lv_document_0_0= ruleDocument ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_END && LA1_0<=RULE_ID_COMM)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTexDsl.g:79:3: (lv_document_0_0= ruleDocument )
            	    {
            	    // InternalTexDsl.g:79:3: (lv_document_0_0= ruleDocument )
            	    // InternalTexDsl.g:80:4: lv_document_0_0= ruleDocument
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getModelAccess().getDocumentDocumentParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_document_0_0=ruleDocument();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
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


    // $ANTLR start "entryRuleDocument"
    // InternalTexDsl.g:100:1: entryRuleDocument returns [EObject current=null] : iv_ruleDocument= ruleDocument EOF ;
    public final EObject entryRuleDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocument = null;


        try {
            // InternalTexDsl.g:100:49: (iv_ruleDocument= ruleDocument EOF )
            // InternalTexDsl.g:101:2: iv_ruleDocument= ruleDocument EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDocumentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDocument=ruleDocument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDocument; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalTexDsl.g:107:1: ruleDocument returns [EObject current=null] : (this_Command_0= ruleCommand | this_Text_1= ruleText | ( () this_END_3= RULE_END ) ) ;
    public final EObject ruleDocument() throws RecognitionException {
        EObject current = null;

        Token this_END_3=null;
        EObject this_Command_0 = null;

        EObject this_Text_1 = null;



        	enterRule();

        try {
            // InternalTexDsl.g:113:2: ( (this_Command_0= ruleCommand | this_Text_1= ruleText | ( () this_END_3= RULE_END ) ) )
            // InternalTexDsl.g:114:2: (this_Command_0= ruleCommand | this_Text_1= ruleText | ( () this_END_3= RULE_END ) )
            {
            // InternalTexDsl.g:114:2: (this_Command_0= ruleCommand | this_Text_1= ruleText | ( () this_END_3= RULE_END ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_ID_COMM:
                {
                alt2=1;
                }
                break;
            case RULE_ID:
            case RULE_ANY_OTHER:
            case RULE_KOMMA:
            case RULE_PIPE:
            case RULE_EXCL:
            case RULE_SYMBOL:
            case RULE_DOT:
                {
                alt2=2;
                }
                break;
            case RULE_END:
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
                    // InternalTexDsl.g:115:3: this_Command_0= ruleCommand
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDocumentAccess().getCommandParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalTexDsl.g:124:3: this_Text_1= ruleText
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDocumentAccess().getTextParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Text_1=ruleText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Text_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalTexDsl.g:133:3: ( () this_END_3= RULE_END )
                    {
                    // InternalTexDsl.g:133:3: ( () this_END_3= RULE_END )
                    // InternalTexDsl.g:134:4: () this_END_3= RULE_END
                    {
                    // InternalTexDsl.g:134:4: ()
                    // InternalTexDsl.g:135:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getDocumentAccess().getDocumentAction_2_0(),
                      						current);
                      				
                    }

                    }

                    this_END_3=(Token)match(input,RULE_END,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_END_3, grammarAccess.getDocumentAccess().getENDTerminalRuleCall_2_1());
                      			
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
    // $ANTLR end "ruleDocument"


    // $ANTLR start "entryRuleText"
    // InternalTexDsl.g:150:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // InternalTexDsl.g:150:45: (iv_ruleText= ruleText EOF )
            // InternalTexDsl.g:151:2: iv_ruleText= ruleText EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTextRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleText=ruleText();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleText; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // InternalTexDsl.g:157:1: ruleText returns [EObject current=null] : ( (lv_token_0_0= ruleAnyText ) ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_token_0_0 = null;



        	enterRule();

        try {
            // InternalTexDsl.g:163:2: ( ( (lv_token_0_0= ruleAnyText ) ) )
            // InternalTexDsl.g:164:2: ( (lv_token_0_0= ruleAnyText ) )
            {
            // InternalTexDsl.g:164:2: ( (lv_token_0_0= ruleAnyText ) )
            // InternalTexDsl.g:165:3: (lv_token_0_0= ruleAnyText )
            {
            // InternalTexDsl.g:165:3: (lv_token_0_0= ruleAnyText )
            // InternalTexDsl.g:166:4: lv_token_0_0= ruleAnyText
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getTextAccess().getTokenAnyTextParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_token_0_0=ruleAnyText();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getTextRule());
              				}
              				add(
              					current,
              					"token",
              					lv_token_0_0,
              					"org.xixum.latex.TexDsl.AnyText");
              				afterParserOrEnumRuleCall();
              			
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
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleAnyText"
    // InternalTexDsl.g:186:1: entryRuleAnyText returns [String current=null] : iv_ruleAnyText= ruleAnyText EOF ;
    public final String entryRuleAnyText() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAnyText = null;


        try {
            // InternalTexDsl.g:186:47: (iv_ruleAnyText= ruleAnyText EOF )
            // InternalTexDsl.g:187:2: iv_ruleAnyText= ruleAnyText EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnyTextRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAnyText=ruleAnyText();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnyText.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAnyText"


    // $ANTLR start "ruleAnyText"
    // InternalTexDsl.g:193:1: ruleAnyText returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_KOMMA_2= RULE_KOMMA | this_PIPE_3= RULE_PIPE | this_EXCL_4= RULE_EXCL | this_SYMBOL_5= RULE_SYMBOL | this_DOT_6= RULE_DOT ) ;
    public final AntlrDatatypeRuleToken ruleAnyText() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_ANY_OTHER_1=null;
        Token this_KOMMA_2=null;
        Token this_PIPE_3=null;
        Token this_EXCL_4=null;
        Token this_SYMBOL_5=null;
        Token this_DOT_6=null;


        	enterRule();

        try {
            // InternalTexDsl.g:199:2: ( (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_KOMMA_2= RULE_KOMMA | this_PIPE_3= RULE_PIPE | this_EXCL_4= RULE_EXCL | this_SYMBOL_5= RULE_SYMBOL | this_DOT_6= RULE_DOT ) )
            // InternalTexDsl.g:200:2: (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_KOMMA_2= RULE_KOMMA | this_PIPE_3= RULE_PIPE | this_EXCL_4= RULE_EXCL | this_SYMBOL_5= RULE_SYMBOL | this_DOT_6= RULE_DOT )
            {
            // InternalTexDsl.g:200:2: (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_KOMMA_2= RULE_KOMMA | this_PIPE_3= RULE_PIPE | this_EXCL_4= RULE_EXCL | this_SYMBOL_5= RULE_SYMBOL | this_DOT_6= RULE_DOT )
            int alt3=7;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt3=1;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt3=2;
                }
                break;
            case RULE_KOMMA:
                {
                alt3=3;
                }
                break;
            case RULE_PIPE:
                {
                alt3=4;
                }
                break;
            case RULE_EXCL:
                {
                alt3=5;
                }
                break;
            case RULE_SYMBOL:
                {
                alt3=6;
                }
                break;
            case RULE_DOT:
                {
                alt3=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalTexDsl.g:201:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ID_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ID_0, grammarAccess.getAnyTextAccess().getIDTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalTexDsl.g:209:3: this_ANY_OTHER_1= RULE_ANY_OTHER
                    {
                    this_ANY_OTHER_1=(Token)match(input,RULE_ANY_OTHER,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ANY_OTHER_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ANY_OTHER_1, grammarAccess.getAnyTextAccess().getANY_OTHERTerminalRuleCall_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalTexDsl.g:217:3: this_KOMMA_2= RULE_KOMMA
                    {
                    this_KOMMA_2=(Token)match(input,RULE_KOMMA,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_KOMMA_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_KOMMA_2, grammarAccess.getAnyTextAccess().getKOMMATerminalRuleCall_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalTexDsl.g:225:3: this_PIPE_3= RULE_PIPE
                    {
                    this_PIPE_3=(Token)match(input,RULE_PIPE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_PIPE_3);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_PIPE_3, grammarAccess.getAnyTextAccess().getPIPETerminalRuleCall_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalTexDsl.g:233:3: this_EXCL_4= RULE_EXCL
                    {
                    this_EXCL_4=(Token)match(input,RULE_EXCL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_EXCL_4);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_EXCL_4, grammarAccess.getAnyTextAccess().getEXCLTerminalRuleCall_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalTexDsl.g:241:3: this_SYMBOL_5= RULE_SYMBOL
                    {
                    this_SYMBOL_5=(Token)match(input,RULE_SYMBOL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_SYMBOL_5);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_SYMBOL_5, grammarAccess.getAnyTextAccess().getSYMBOLTerminalRuleCall_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalTexDsl.g:249:3: this_DOT_6= RULE_DOT
                    {
                    this_DOT_6=(Token)match(input,RULE_DOT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_DOT_6);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_DOT_6, grammarAccess.getAnyTextAccess().getDOTTerminalRuleCall_6());
                      		
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
    // $ANTLR end "ruleAnyText"


    // $ANTLR start "entryRuleCommand"
    // InternalTexDsl.g:260:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalTexDsl.g:260:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalTexDsl.g:261:2: iv_ruleCommand= ruleCommand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommandRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCommand=ruleCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommand; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalTexDsl.g:267:1: ruleCommand returns [EObject current=null] : ( ( (lv_command_0_0= RULE_ID_COMM ) ) (this_SQBO_1= RULE_SQBO ( (lv_attrs_2_0= ruleAttributes ) ) (this_KOMMA_3= RULE_KOMMA ( (lv_attrs_4_0= ruleAttributes ) ) )* this_SQBC_5= RULE_SQBC )? (this_CUBO_6= RULE_CUBO ( (lv_tokens_7_0= ruleCompound ) ) ( (this_PIPE_8= RULE_PIPE | this_EXCL_9= RULE_EXCL ) ( (lv_tokens_10_0= ruleCompound ) ) )* this_CUBC_11= RULE_CUBC )? ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token lv_command_0_0=null;
        Token this_SQBO_1=null;
        Token this_KOMMA_3=null;
        Token this_SQBC_5=null;
        Token this_CUBO_6=null;
        Token this_PIPE_8=null;
        Token this_EXCL_9=null;
        Token this_CUBC_11=null;
        EObject lv_attrs_2_0 = null;

        EObject lv_attrs_4_0 = null;

        EObject lv_tokens_7_0 = null;

        EObject lv_tokens_10_0 = null;



        	enterRule();

        try {
            // InternalTexDsl.g:273:2: ( ( ( (lv_command_0_0= RULE_ID_COMM ) ) (this_SQBO_1= RULE_SQBO ( (lv_attrs_2_0= ruleAttributes ) ) (this_KOMMA_3= RULE_KOMMA ( (lv_attrs_4_0= ruleAttributes ) ) )* this_SQBC_5= RULE_SQBC )? (this_CUBO_6= RULE_CUBO ( (lv_tokens_7_0= ruleCompound ) ) ( (this_PIPE_8= RULE_PIPE | this_EXCL_9= RULE_EXCL ) ( (lv_tokens_10_0= ruleCompound ) ) )* this_CUBC_11= RULE_CUBC )? ) )
            // InternalTexDsl.g:274:2: ( ( (lv_command_0_0= RULE_ID_COMM ) ) (this_SQBO_1= RULE_SQBO ( (lv_attrs_2_0= ruleAttributes ) ) (this_KOMMA_3= RULE_KOMMA ( (lv_attrs_4_0= ruleAttributes ) ) )* this_SQBC_5= RULE_SQBC )? (this_CUBO_6= RULE_CUBO ( (lv_tokens_7_0= ruleCompound ) ) ( (this_PIPE_8= RULE_PIPE | this_EXCL_9= RULE_EXCL ) ( (lv_tokens_10_0= ruleCompound ) ) )* this_CUBC_11= RULE_CUBC )? )
            {
            // InternalTexDsl.g:274:2: ( ( (lv_command_0_0= RULE_ID_COMM ) ) (this_SQBO_1= RULE_SQBO ( (lv_attrs_2_0= ruleAttributes ) ) (this_KOMMA_3= RULE_KOMMA ( (lv_attrs_4_0= ruleAttributes ) ) )* this_SQBC_5= RULE_SQBC )? (this_CUBO_6= RULE_CUBO ( (lv_tokens_7_0= ruleCompound ) ) ( (this_PIPE_8= RULE_PIPE | this_EXCL_9= RULE_EXCL ) ( (lv_tokens_10_0= ruleCompound ) ) )* this_CUBC_11= RULE_CUBC )? )
            // InternalTexDsl.g:275:3: ( (lv_command_0_0= RULE_ID_COMM ) ) (this_SQBO_1= RULE_SQBO ( (lv_attrs_2_0= ruleAttributes ) ) (this_KOMMA_3= RULE_KOMMA ( (lv_attrs_4_0= ruleAttributes ) ) )* this_SQBC_5= RULE_SQBC )? (this_CUBO_6= RULE_CUBO ( (lv_tokens_7_0= ruleCompound ) ) ( (this_PIPE_8= RULE_PIPE | this_EXCL_9= RULE_EXCL ) ( (lv_tokens_10_0= ruleCompound ) ) )* this_CUBC_11= RULE_CUBC )?
            {
            // InternalTexDsl.g:275:3: ( (lv_command_0_0= RULE_ID_COMM ) )
            // InternalTexDsl.g:276:4: (lv_command_0_0= RULE_ID_COMM )
            {
            // InternalTexDsl.g:276:4: (lv_command_0_0= RULE_ID_COMM )
            // InternalTexDsl.g:277:5: lv_command_0_0= RULE_ID_COMM
            {
            lv_command_0_0=(Token)match(input,RULE_ID_COMM,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_command_0_0, grammarAccess.getCommandAccess().getCommandID_COMMTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getCommandRule());
              					}
              					setWithLastConsumed(
              						current,
              						"command",
              						lv_command_0_0,
              						"org.xixum.latex.TexDsl.ID_COMM");
              				
            }

            }


            }

            // InternalTexDsl.g:293:3: (this_SQBO_1= RULE_SQBO ( (lv_attrs_2_0= ruleAttributes ) ) (this_KOMMA_3= RULE_KOMMA ( (lv_attrs_4_0= ruleAttributes ) ) )* this_SQBC_5= RULE_SQBC )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_SQBO) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalTexDsl.g:294:4: this_SQBO_1= RULE_SQBO ( (lv_attrs_2_0= ruleAttributes ) ) (this_KOMMA_3= RULE_KOMMA ( (lv_attrs_4_0= ruleAttributes ) ) )* this_SQBC_5= RULE_SQBC
                    {
                    this_SQBO_1=(Token)match(input,RULE_SQBO,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_SQBO_1, grammarAccess.getCommandAccess().getSQBOTerminalRuleCall_1_0());
                      			
                    }
                    // InternalTexDsl.g:298:4: ( (lv_attrs_2_0= ruleAttributes ) )
                    // InternalTexDsl.g:299:5: (lv_attrs_2_0= ruleAttributes )
                    {
                    // InternalTexDsl.g:299:5: (lv_attrs_2_0= ruleAttributes )
                    // InternalTexDsl.g:300:6: lv_attrs_2_0= ruleAttributes
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCommandAccess().getAttrsAttributesParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_6);
                    lv_attrs_2_0=ruleAttributes();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCommandRule());
                      						}
                      						add(
                      							current,
                      							"attrs",
                      							lv_attrs_2_0,
                      							"org.xixum.latex.TexDsl.Attributes");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalTexDsl.g:317:4: (this_KOMMA_3= RULE_KOMMA ( (lv_attrs_4_0= ruleAttributes ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_KOMMA) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalTexDsl.g:318:5: this_KOMMA_3= RULE_KOMMA ( (lv_attrs_4_0= ruleAttributes ) )
                    	    {
                    	    this_KOMMA_3=(Token)match(input,RULE_KOMMA,FOLLOW_5); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_KOMMA_3, grammarAccess.getCommandAccess().getKOMMATerminalRuleCall_1_2_0());
                    	      				
                    	    }
                    	    // InternalTexDsl.g:322:5: ( (lv_attrs_4_0= ruleAttributes ) )
                    	    // InternalTexDsl.g:323:6: (lv_attrs_4_0= ruleAttributes )
                    	    {
                    	    // InternalTexDsl.g:323:6: (lv_attrs_4_0= ruleAttributes )
                    	    // InternalTexDsl.g:324:7: lv_attrs_4_0= ruleAttributes
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getCommandAccess().getAttrsAttributesParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_6);
                    	    lv_attrs_4_0=ruleAttributes();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getCommandRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"attrs",
                    	      								lv_attrs_4_0,
                    	      								"org.xixum.latex.TexDsl.Attributes");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    this_SQBC_5=(Token)match(input,RULE_SQBC,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_SQBC_5, grammarAccess.getCommandAccess().getSQBCTerminalRuleCall_1_3());
                      			
                    }

                    }
                    break;

            }

            // InternalTexDsl.g:347:3: (this_CUBO_6= RULE_CUBO ( (lv_tokens_7_0= ruleCompound ) ) ( (this_PIPE_8= RULE_PIPE | this_EXCL_9= RULE_EXCL ) ( (lv_tokens_10_0= ruleCompound ) ) )* this_CUBC_11= RULE_CUBC )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_CUBO) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTexDsl.g:348:4: this_CUBO_6= RULE_CUBO ( (lv_tokens_7_0= ruleCompound ) ) ( (this_PIPE_8= RULE_PIPE | this_EXCL_9= RULE_EXCL ) ( (lv_tokens_10_0= ruleCompound ) ) )* this_CUBC_11= RULE_CUBC
                    {
                    this_CUBO_6=(Token)match(input,RULE_CUBO,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_CUBO_6, grammarAccess.getCommandAccess().getCUBOTerminalRuleCall_2_0());
                      			
                    }
                    // InternalTexDsl.g:352:4: ( (lv_tokens_7_0= ruleCompound ) )
                    // InternalTexDsl.g:353:5: (lv_tokens_7_0= ruleCompound )
                    {
                    // InternalTexDsl.g:353:5: (lv_tokens_7_0= ruleCompound )
                    // InternalTexDsl.g:354:6: lv_tokens_7_0= ruleCompound
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCommandAccess().getTokensCompoundParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_9);
                    lv_tokens_7_0=ruleCompound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCommandRule());
                      						}
                      						add(
                      							current,
                      							"tokens",
                      							lv_tokens_7_0,
                      							"org.xixum.latex.TexDsl.Compound");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalTexDsl.g:371:4: ( (this_PIPE_8= RULE_PIPE | this_EXCL_9= RULE_EXCL ) ( (lv_tokens_10_0= ruleCompound ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>=RULE_PIPE && LA7_0<=RULE_EXCL)) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalTexDsl.g:372:5: (this_PIPE_8= RULE_PIPE | this_EXCL_9= RULE_EXCL ) ( (lv_tokens_10_0= ruleCompound ) )
                    	    {
                    	    // InternalTexDsl.g:372:5: (this_PIPE_8= RULE_PIPE | this_EXCL_9= RULE_EXCL )
                    	    int alt6=2;
                    	    int LA6_0 = input.LA(1);

                    	    if ( (LA6_0==RULE_PIPE) ) {
                    	        alt6=1;
                    	    }
                    	    else if ( (LA6_0==RULE_EXCL) ) {
                    	        alt6=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 6, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt6) {
                    	        case 1 :
                    	            // InternalTexDsl.g:373:6: this_PIPE_8= RULE_PIPE
                    	            {
                    	            this_PIPE_8=(Token)match(input,RULE_PIPE,FOLLOW_8); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              						newLeafNode(this_PIPE_8, grammarAccess.getCommandAccess().getPIPETerminalRuleCall_2_2_0_0());
                    	              					
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalTexDsl.g:378:6: this_EXCL_9= RULE_EXCL
                    	            {
                    	            this_EXCL_9=(Token)match(input,RULE_EXCL,FOLLOW_8); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              						newLeafNode(this_EXCL_9, grammarAccess.getCommandAccess().getEXCLTerminalRuleCall_2_2_0_1());
                    	              					
                    	            }

                    	            }
                    	            break;

                    	    }

                    	    // InternalTexDsl.g:383:5: ( (lv_tokens_10_0= ruleCompound ) )
                    	    // InternalTexDsl.g:384:6: (lv_tokens_10_0= ruleCompound )
                    	    {
                    	    // InternalTexDsl.g:384:6: (lv_tokens_10_0= ruleCompound )
                    	    // InternalTexDsl.g:385:7: lv_tokens_10_0= ruleCompound
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getCommandAccess().getTokensCompoundParserRuleCall_2_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_9);
                    	    lv_tokens_10_0=ruleCompound();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getCommandRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"tokens",
                    	      								lv_tokens_10_0,
                    	      								"org.xixum.latex.TexDsl.Compound");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    this_CUBC_11=(Token)match(input,RULE_CUBC,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_CUBC_11, grammarAccess.getCommandAccess().getCUBCTerminalRuleCall_2_3());
                      			
                    }

                    }
                    break;

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
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleMulti"
    // InternalTexDsl.g:412:1: entryRuleMulti returns [EObject current=null] : iv_ruleMulti= ruleMulti EOF ;
    public final EObject entryRuleMulti() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulti = null;


        try {
            // InternalTexDsl.g:412:46: (iv_ruleMulti= ruleMulti EOF )
            // InternalTexDsl.g:413:2: iv_ruleMulti= ruleMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMulti=ruleMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMulti; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMulti"


    // $ANTLR start "ruleMulti"
    // InternalTexDsl.g:419:1: ruleMulti returns [EObject current=null] : ( (lv_tokens_0_0= RULE_ID ) )+ ;
    public final EObject ruleMulti() throws RecognitionException {
        EObject current = null;

        Token lv_tokens_0_0=null;


        	enterRule();

        try {
            // InternalTexDsl.g:425:2: ( ( (lv_tokens_0_0= RULE_ID ) )+ )
            // InternalTexDsl.g:426:2: ( (lv_tokens_0_0= RULE_ID ) )+
            {
            // InternalTexDsl.g:426:2: ( (lv_tokens_0_0= RULE_ID ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalTexDsl.g:427:3: (lv_tokens_0_0= RULE_ID )
            	    {
            	    // InternalTexDsl.g:427:3: (lv_tokens_0_0= RULE_ID )
            	    // InternalTexDsl.g:428:4: lv_tokens_0_0= RULE_ID
            	    {
            	    lv_tokens_0_0=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(lv_tokens_0_0, grammarAccess.getMultiAccess().getTokensIDTerminalRuleCall_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElement(grammarAccess.getMultiRule());
            	      				}
            	      				addWithLastConsumed(
            	      					current,
            	      					"tokens",
            	      					lv_tokens_0_0,
            	      					"org.xixum.latex.TexDsl.ID");
            	      			
            	    }

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
    // $ANTLR end "ruleMulti"


    // $ANTLR start "entryRuleCommandExt"
    // InternalTexDsl.g:447:1: entryRuleCommandExt returns [EObject current=null] : iv_ruleCommandExt= ruleCommandExt EOF ;
    public final EObject entryRuleCommandExt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandExt = null;


        try {
            // InternalTexDsl.g:447:51: (iv_ruleCommandExt= ruleCommandExt EOF )
            // InternalTexDsl.g:448:2: iv_ruleCommandExt= ruleCommandExt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommandExtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCommandExt=ruleCommandExt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommandExt; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCommandExt"


    // $ANTLR start "ruleCommandExt"
    // InternalTexDsl.g:454:1: ruleCommandExt returns [EObject current=null] : ( ( ( (lv_command_0_1= RULE_ID | lv_command_0_2= RULE_ID_COMM ) ) ) (this_CUBO_1= RULE_CUBO ( (lv_tokens_2_0= ruleCompound ) ) (this_KOMMA_3= RULE_KOMMA ( (lv_tokens_4_0= ruleCompound ) ) )* this_CUBC_5= RULE_CUBC ) ) ;
    public final EObject ruleCommandExt() throws RecognitionException {
        EObject current = null;

        Token lv_command_0_1=null;
        Token lv_command_0_2=null;
        Token this_CUBO_1=null;
        Token this_KOMMA_3=null;
        Token this_CUBC_5=null;
        EObject lv_tokens_2_0 = null;

        EObject lv_tokens_4_0 = null;



        	enterRule();

        try {
            // InternalTexDsl.g:460:2: ( ( ( ( (lv_command_0_1= RULE_ID | lv_command_0_2= RULE_ID_COMM ) ) ) (this_CUBO_1= RULE_CUBO ( (lv_tokens_2_0= ruleCompound ) ) (this_KOMMA_3= RULE_KOMMA ( (lv_tokens_4_0= ruleCompound ) ) )* this_CUBC_5= RULE_CUBC ) ) )
            // InternalTexDsl.g:461:2: ( ( ( (lv_command_0_1= RULE_ID | lv_command_0_2= RULE_ID_COMM ) ) ) (this_CUBO_1= RULE_CUBO ( (lv_tokens_2_0= ruleCompound ) ) (this_KOMMA_3= RULE_KOMMA ( (lv_tokens_4_0= ruleCompound ) ) )* this_CUBC_5= RULE_CUBC ) )
            {
            // InternalTexDsl.g:461:2: ( ( ( (lv_command_0_1= RULE_ID | lv_command_0_2= RULE_ID_COMM ) ) ) (this_CUBO_1= RULE_CUBO ( (lv_tokens_2_0= ruleCompound ) ) (this_KOMMA_3= RULE_KOMMA ( (lv_tokens_4_0= ruleCompound ) ) )* this_CUBC_5= RULE_CUBC ) )
            // InternalTexDsl.g:462:3: ( ( (lv_command_0_1= RULE_ID | lv_command_0_2= RULE_ID_COMM ) ) ) (this_CUBO_1= RULE_CUBO ( (lv_tokens_2_0= ruleCompound ) ) (this_KOMMA_3= RULE_KOMMA ( (lv_tokens_4_0= ruleCompound ) ) )* this_CUBC_5= RULE_CUBC )
            {
            // InternalTexDsl.g:462:3: ( ( (lv_command_0_1= RULE_ID | lv_command_0_2= RULE_ID_COMM ) ) )
            // InternalTexDsl.g:463:4: ( (lv_command_0_1= RULE_ID | lv_command_0_2= RULE_ID_COMM ) )
            {
            // InternalTexDsl.g:463:4: ( (lv_command_0_1= RULE_ID | lv_command_0_2= RULE_ID_COMM ) )
            // InternalTexDsl.g:464:5: (lv_command_0_1= RULE_ID | lv_command_0_2= RULE_ID_COMM )
            {
            // InternalTexDsl.g:464:5: (lv_command_0_1= RULE_ID | lv_command_0_2= RULE_ID_COMM )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID_COMM) ) {
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
                    // InternalTexDsl.g:465:6: lv_command_0_1= RULE_ID
                    {
                    lv_command_0_1=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_command_0_1, grammarAccess.getCommandExtAccess().getCommandIDTerminalRuleCall_0_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getCommandExtRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"command",
                      							lv_command_0_1,
                      							"org.xixum.latex.TexDsl.ID");
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalTexDsl.g:480:6: lv_command_0_2= RULE_ID_COMM
                    {
                    lv_command_0_2=(Token)match(input,RULE_ID_COMM,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_command_0_2, grammarAccess.getCommandExtAccess().getCommandID_COMMTerminalRuleCall_0_0_1());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getCommandExtRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"command",
                      							lv_command_0_2,
                      							"org.xixum.latex.TexDsl.ID_COMM");
                      					
                    }

                    }
                    break;

            }


            }


            }

            // InternalTexDsl.g:497:3: (this_CUBO_1= RULE_CUBO ( (lv_tokens_2_0= ruleCompound ) ) (this_KOMMA_3= RULE_KOMMA ( (lv_tokens_4_0= ruleCompound ) ) )* this_CUBC_5= RULE_CUBC )
            // InternalTexDsl.g:498:4: this_CUBO_1= RULE_CUBO ( (lv_tokens_2_0= ruleCompound ) ) (this_KOMMA_3= RULE_KOMMA ( (lv_tokens_4_0= ruleCompound ) ) )* this_CUBC_5= RULE_CUBC
            {
            this_CUBO_1=(Token)match(input,RULE_CUBO,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(this_CUBO_1, grammarAccess.getCommandExtAccess().getCUBOTerminalRuleCall_1_0());
              			
            }
            // InternalTexDsl.g:502:4: ( (lv_tokens_2_0= ruleCompound ) )
            // InternalTexDsl.g:503:5: (lv_tokens_2_0= ruleCompound )
            {
            // InternalTexDsl.g:503:5: (lv_tokens_2_0= ruleCompound )
            // InternalTexDsl.g:504:6: lv_tokens_2_0= ruleCompound
            {
            if ( state.backtracking==0 ) {

              						newCompositeNode(grammarAccess.getCommandExtAccess().getTokensCompoundParserRuleCall_1_1_0());
              					
            }
            pushFollow(FOLLOW_12);
            lv_tokens_2_0=ruleCompound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElementForParent(grammarAccess.getCommandExtRule());
              						}
              						add(
              							current,
              							"tokens",
              							lv_tokens_2_0,
              							"org.xixum.latex.TexDsl.Compound");
              						afterParserOrEnumRuleCall();
              					
            }

            }


            }

            // InternalTexDsl.g:521:4: (this_KOMMA_3= RULE_KOMMA ( (lv_tokens_4_0= ruleCompound ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_KOMMA) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalTexDsl.g:522:5: this_KOMMA_3= RULE_KOMMA ( (lv_tokens_4_0= ruleCompound ) )
            	    {
            	    this_KOMMA_3=(Token)match(input,RULE_KOMMA,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(this_KOMMA_3, grammarAccess.getCommandExtAccess().getKOMMATerminalRuleCall_1_2_0());
            	      				
            	    }
            	    // InternalTexDsl.g:526:5: ( (lv_tokens_4_0= ruleCompound ) )
            	    // InternalTexDsl.g:527:6: (lv_tokens_4_0= ruleCompound )
            	    {
            	    // InternalTexDsl.g:527:6: (lv_tokens_4_0= ruleCompound )
            	    // InternalTexDsl.g:528:7: lv_tokens_4_0= ruleCompound
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getCommandExtAccess().getTokensCompoundParserRuleCall_1_2_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_tokens_4_0=ruleCompound();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getCommandExtRule());
            	      							}
            	      							add(
            	      								current,
            	      								"tokens",
            	      								lv_tokens_4_0,
            	      								"org.xixum.latex.TexDsl.Compound");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            this_CUBC_5=(Token)match(input,RULE_CUBC,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(this_CUBC_5, grammarAccess.getCommandExtAccess().getCUBCTerminalRuleCall_1_3());
              			
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
    // $ANTLR end "ruleCommandExt"


    // $ANTLR start "entryRuleCompound"
    // InternalTexDsl.g:555:1: entryRuleCompound returns [EObject current=null] : iv_ruleCompound= ruleCompound EOF ;
    public final EObject entryRuleCompound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompound = null;


        try {
            // InternalTexDsl.g:555:49: (iv_ruleCompound= ruleCompound EOF )
            // InternalTexDsl.g:556:2: iv_ruleCompound= ruleCompound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompoundRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCompound=ruleCompound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompound; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCompound"


    // $ANTLR start "ruleCompound"
    // InternalTexDsl.g:562:1: ruleCompound returns [EObject current=null] : (this_Multi_0= ruleMulti | this_Extras_1= ruleExtras | ( ( ruleCommandExt )=>this_CommandExt_2= ruleCommandExt ) ) ;
    public final EObject ruleCompound() throws RecognitionException {
        EObject current = null;

        EObject this_Multi_0 = null;

        EObject this_Extras_1 = null;

        EObject this_CommandExt_2 = null;



        	enterRule();

        try {
            // InternalTexDsl.g:568:2: ( (this_Multi_0= ruleMulti | this_Extras_1= ruleExtras | ( ( ruleCommandExt )=>this_CommandExt_2= ruleCommandExt ) ) )
            // InternalTexDsl.g:569:2: (this_Multi_0= ruleMulti | this_Extras_1= ruleExtras | ( ( ruleCommandExt )=>this_CommandExt_2= ruleCommandExt ) )
            {
            // InternalTexDsl.g:569:2: (this_Multi_0= ruleMulti | this_Extras_1= ruleExtras | ( ( ruleCommandExt )=>this_CommandExt_2= ruleCommandExt ) )
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==EOF||LA12_1==RULE_ID||(LA12_1>=RULE_KOMMA && LA12_1<=RULE_EXCL)||LA12_1==RULE_CUBC) ) {
                    alt12=1;
                }
                else if ( (LA12_1==RULE_CUBO) && (synpred1_InternalTexDsl())) {
                    alt12=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA12_0>=RULE_BO && LA12_0<=RULE_BC)) ) {
                alt12=2;
            }
            else if ( (LA12_0==RULE_ID_COMM) && (synpred1_InternalTexDsl())) {
                alt12=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalTexDsl.g:570:3: this_Multi_0= ruleMulti
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCompoundAccess().getMultiParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Multi_0=ruleMulti();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Multi_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalTexDsl.g:579:3: this_Extras_1= ruleExtras
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCompoundAccess().getExtrasParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Extras_1=ruleExtras();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Extras_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalTexDsl.g:588:3: ( ( ruleCommandExt )=>this_CommandExt_2= ruleCommandExt )
                    {
                    // InternalTexDsl.g:588:3: ( ( ruleCommandExt )=>this_CommandExt_2= ruleCommandExt )
                    // InternalTexDsl.g:589:4: ( ruleCommandExt )=>this_CommandExt_2= ruleCommandExt
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getCompoundAccess().getCommandExtParserRuleCall_2());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_CommandExt_2=ruleCommandExt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_CommandExt_2;
                      				afterParserOrEnumRuleCall();
                      			
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
    // $ANTLR end "ruleCompound"


    // $ANTLR start "entryRuleExtras"
    // InternalTexDsl.g:603:1: entryRuleExtras returns [EObject current=null] : iv_ruleExtras= ruleExtras EOF ;
    public final EObject entryRuleExtras() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtras = null;


        try {
            // InternalTexDsl.g:603:47: (iv_ruleExtras= ruleExtras EOF )
            // InternalTexDsl.g:604:2: iv_ruleExtras= ruleExtras EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExtrasRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExtras=ruleExtras();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExtras; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExtras"


    // $ANTLR start "ruleExtras"
    // InternalTexDsl.g:610:1: ruleExtras returns [EObject current=null] : ( ( (lv_tokens_0_1= RULE_BO | lv_tokens_0_2= RULE_BC ) ) )+ ;
    public final EObject ruleExtras() throws RecognitionException {
        EObject current = null;

        Token lv_tokens_0_1=null;
        Token lv_tokens_0_2=null;


        	enterRule();

        try {
            // InternalTexDsl.g:616:2: ( ( ( (lv_tokens_0_1= RULE_BO | lv_tokens_0_2= RULE_BC ) ) )+ )
            // InternalTexDsl.g:617:2: ( ( (lv_tokens_0_1= RULE_BO | lv_tokens_0_2= RULE_BC ) ) )+
            {
            // InternalTexDsl.g:617:2: ( ( (lv_tokens_0_1= RULE_BO | lv_tokens_0_2= RULE_BC ) ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_BO && LA14_0<=RULE_BC)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalTexDsl.g:618:3: ( (lv_tokens_0_1= RULE_BO | lv_tokens_0_2= RULE_BC ) )
            	    {
            	    // InternalTexDsl.g:618:3: ( (lv_tokens_0_1= RULE_BO | lv_tokens_0_2= RULE_BC ) )
            	    // InternalTexDsl.g:619:4: (lv_tokens_0_1= RULE_BO | lv_tokens_0_2= RULE_BC )
            	    {
            	    // InternalTexDsl.g:619:4: (lv_tokens_0_1= RULE_BO | lv_tokens_0_2= RULE_BC )
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==RULE_BO) ) {
            	        alt13=1;
            	    }
            	    else if ( (LA13_0==RULE_BC) ) {
            	        alt13=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 13, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // InternalTexDsl.g:620:5: lv_tokens_0_1= RULE_BO
            	            {
            	            lv_tokens_0_1=(Token)match(input,RULE_BO,FOLLOW_13); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(lv_tokens_0_1, grammarAccess.getExtrasAccess().getTokensBOTerminalRuleCall_0_0());
            	              				
            	            }
            	            if ( state.backtracking==0 ) {

            	              					if (current==null) {
            	              						current = createModelElement(grammarAccess.getExtrasRule());
            	              					}
            	              					addWithLastConsumed(
            	              						current,
            	              						"tokens",
            	              						lv_tokens_0_1,
            	              						"org.xixum.latex.TexDsl.BO");
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalTexDsl.g:635:5: lv_tokens_0_2= RULE_BC
            	            {
            	            lv_tokens_0_2=(Token)match(input,RULE_BC,FOLLOW_13); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(lv_tokens_0_2, grammarAccess.getExtrasAccess().getTokensBCTerminalRuleCall_0_1());
            	              				
            	            }
            	            if ( state.backtracking==0 ) {

            	              					if (current==null) {
            	              						current = createModelElement(grammarAccess.getExtrasRule());
            	              					}
            	              					addWithLastConsumed(
            	              						current,
            	              						"tokens",
            	              						lv_tokens_0_2,
            	              						"org.xixum.latex.TexDsl.BC");
            	              				
            	            }

            	            }
            	            break;

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
    // $ANTLR end "ruleExtras"


    // $ANTLR start "entryRuleAttributes"
    // InternalTexDsl.g:655:1: entryRuleAttributes returns [EObject current=null] : iv_ruleAttributes= ruleAttributes EOF ;
    public final EObject entryRuleAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributes = null;


        try {
            // InternalTexDsl.g:655:51: (iv_ruleAttributes= ruleAttributes EOF )
            // InternalTexDsl.g:656:2: iv_ruleAttributes= ruleAttributes EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAttributes=ruleAttributes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributes; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalTexDsl.g:662:1: ruleAttributes returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) (this_EQ_1= RULE_EQ ( (this_CUBO_2= RULE_CUBO ( (lv_multi_3_0= ruleMulti ) )+ this_CUBC_4= RULE_CUBC ) | ( (lv_single_5_0= RULE_ID ) ) ) )? ) ;
    public final EObject ruleAttributes() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token this_EQ_1=null;
        Token this_CUBO_2=null;
        Token this_CUBC_4=null;
        Token lv_single_5_0=null;
        EObject lv_multi_3_0 = null;



        	enterRule();

        try {
            // InternalTexDsl.g:668:2: ( ( ( (lv_key_0_0= RULE_ID ) ) (this_EQ_1= RULE_EQ ( (this_CUBO_2= RULE_CUBO ( (lv_multi_3_0= ruleMulti ) )+ this_CUBC_4= RULE_CUBC ) | ( (lv_single_5_0= RULE_ID ) ) ) )? ) )
            // InternalTexDsl.g:669:2: ( ( (lv_key_0_0= RULE_ID ) ) (this_EQ_1= RULE_EQ ( (this_CUBO_2= RULE_CUBO ( (lv_multi_3_0= ruleMulti ) )+ this_CUBC_4= RULE_CUBC ) | ( (lv_single_5_0= RULE_ID ) ) ) )? )
            {
            // InternalTexDsl.g:669:2: ( ( (lv_key_0_0= RULE_ID ) ) (this_EQ_1= RULE_EQ ( (this_CUBO_2= RULE_CUBO ( (lv_multi_3_0= ruleMulti ) )+ this_CUBC_4= RULE_CUBC ) | ( (lv_single_5_0= RULE_ID ) ) ) )? )
            // InternalTexDsl.g:670:3: ( (lv_key_0_0= RULE_ID ) ) (this_EQ_1= RULE_EQ ( (this_CUBO_2= RULE_CUBO ( (lv_multi_3_0= ruleMulti ) )+ this_CUBC_4= RULE_CUBC ) | ( (lv_single_5_0= RULE_ID ) ) ) )?
            {
            // InternalTexDsl.g:670:3: ( (lv_key_0_0= RULE_ID ) )
            // InternalTexDsl.g:671:4: (lv_key_0_0= RULE_ID )
            {
            // InternalTexDsl.g:671:4: (lv_key_0_0= RULE_ID )
            // InternalTexDsl.g:672:5: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_key_0_0, grammarAccess.getAttributesAccess().getKeyIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAttributesRule());
              					}
              					setWithLastConsumed(
              						current,
              						"key",
              						lv_key_0_0,
              						"org.xixum.latex.TexDsl.ID");
              				
            }

            }


            }

            // InternalTexDsl.g:688:3: (this_EQ_1= RULE_EQ ( (this_CUBO_2= RULE_CUBO ( (lv_multi_3_0= ruleMulti ) )+ this_CUBC_4= RULE_CUBC ) | ( (lv_single_5_0= RULE_ID ) ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_EQ) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalTexDsl.g:689:4: this_EQ_1= RULE_EQ ( (this_CUBO_2= RULE_CUBO ( (lv_multi_3_0= ruleMulti ) )+ this_CUBC_4= RULE_CUBC ) | ( (lv_single_5_0= RULE_ID ) ) )
                    {
                    this_EQ_1=(Token)match(input,RULE_EQ,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_EQ_1, grammarAccess.getAttributesAccess().getEQTerminalRuleCall_1_0());
                      			
                    }
                    // InternalTexDsl.g:693:4: ( (this_CUBO_2= RULE_CUBO ( (lv_multi_3_0= ruleMulti ) )+ this_CUBC_4= RULE_CUBC ) | ( (lv_single_5_0= RULE_ID ) ) )
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==RULE_CUBO) ) {
                        alt16=1;
                    }
                    else if ( (LA16_0==RULE_ID) ) {
                        alt16=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 0, input);

                        throw nvae;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalTexDsl.g:694:5: (this_CUBO_2= RULE_CUBO ( (lv_multi_3_0= ruleMulti ) )+ this_CUBC_4= RULE_CUBC )
                            {
                            // InternalTexDsl.g:694:5: (this_CUBO_2= RULE_CUBO ( (lv_multi_3_0= ruleMulti ) )+ this_CUBC_4= RULE_CUBC )
                            // InternalTexDsl.g:695:6: this_CUBO_2= RULE_CUBO ( (lv_multi_3_0= ruleMulti ) )+ this_CUBC_4= RULE_CUBC
                            {
                            this_CUBO_2=(Token)match(input,RULE_CUBO,FOLLOW_5); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(this_CUBO_2, grammarAccess.getAttributesAccess().getCUBOTerminalRuleCall_1_1_0_0());
                              					
                            }
                            // InternalTexDsl.g:699:6: ( (lv_multi_3_0= ruleMulti ) )+
                            int cnt15=0;
                            loop15:
                            do {
                                int alt15=2;
                                int LA15_0 = input.LA(1);

                                if ( (LA15_0==RULE_ID) ) {
                                    alt15=1;
                                }


                                switch (alt15) {
                            	case 1 :
                            	    // InternalTexDsl.g:700:7: (lv_multi_3_0= ruleMulti )
                            	    {
                            	    // InternalTexDsl.g:700:7: (lv_multi_3_0= ruleMulti )
                            	    // InternalTexDsl.g:701:8: lv_multi_3_0= ruleMulti
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getAttributesAccess().getMultiMultiParserRuleCall_1_1_0_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_16);
                            	    lv_multi_3_0=ruleMulti();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getAttributesRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"multi",
                            	      									lv_multi_3_0,
                            	      									"org.xixum.latex.TexDsl.Multi");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt15 >= 1 ) break loop15;
                            	    if (state.backtracking>0) {state.failed=true; return current;}
                                        EarlyExitException eee =
                                            new EarlyExitException(15, input);
                                        throw eee;
                                }
                                cnt15++;
                            } while (true);

                            this_CUBC_4=(Token)match(input,RULE_CUBC,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(this_CUBC_4, grammarAccess.getAttributesAccess().getCUBCTerminalRuleCall_1_1_0_2());
                              					
                            }

                            }


                            }
                            break;
                        case 2 :
                            // InternalTexDsl.g:724:5: ( (lv_single_5_0= RULE_ID ) )
                            {
                            // InternalTexDsl.g:724:5: ( (lv_single_5_0= RULE_ID ) )
                            // InternalTexDsl.g:725:6: (lv_single_5_0= RULE_ID )
                            {
                            // InternalTexDsl.g:725:6: (lv_single_5_0= RULE_ID )
                            // InternalTexDsl.g:726:7: lv_single_5_0= RULE_ID
                            {
                            lv_single_5_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_single_5_0, grammarAccess.getAttributesAccess().getSingleIDTerminalRuleCall_1_1_1_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getAttributesRule());
                              							}
                              							setWithLastConsumed(
                              								current,
                              								"single",
                              								lv_single_5_0,
                              								"org.xixum.latex.TexDsl.ID");
                              						
                            }

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

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
    // $ANTLR end "ruleAttributes"

    // $ANTLR start synpred1_InternalTexDsl
    public final void synpred1_InternalTexDsl_fragment() throws RecognitionException {   
        // InternalTexDsl.g:589:4: ( ruleCommandExt )
        // InternalTexDsl.g:589:5: ruleCommandExt
        {
        pushFollow(FOLLOW_2);
        ruleCommandExt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalTexDsl

    // Delegated rules

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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001FF2L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000A002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004080L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000061020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010300L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010080L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000010020L});

}