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

@SuppressWarnings("all")
public class InternalTexDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_ALPHA_NUMERIC", "RULE_END", "RULE_SQBO", "RULE_SQBC", "RULE_KOMMA", "RULE_CUBO", "RULE_CUBC", "RULE_EQ", "RULE_BS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_SYMBOL", "RULE_SYMBOLS", "RULE_ALPHA", "RULE_NUMERIC", "RULE_ALPHAC", "RULE_ALPHAS", "RULE_BO", "RULE_BC", "RULE_INT", "RULE_STRING", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_ALPHA=18;
    public static final int RULE_END=6;
    public static final int RULE_CUBO=10;
    public static final int RULE_STRING=25;
    public static final int RULE_SL_COMMENT=15;
    public static final int RULE_EQ=12;
    public static final int EOF=-1;
    public static final int RULE_NUMERIC=19;
    public static final int RULE_ID=4;
    public static final int RULE_WS=26;
    public static final int RULE_SQBO=7;
    public static final int RULE_ALPHA_NUMERIC=5;
    public static final int RULE_BO=22;
    public static final int RULE_SQBC=8;
    public static final int RULE_ANY_OTHER=27;
    public static final int RULE_ALPHAS=21;
    public static final int RULE_BS=13;
    public static final int RULE_KOMMA=9;
    public static final int RULE_INT=24;
    public static final int RULE_CUBC=11;
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



    // $ANTLR start "entryRuleModel"
    // InternalTexDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalTexDsl.g:54:1: ( ruleModel EOF )
            // InternalTexDsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalTexDsl.g:62:1: ruleModel : ( ( rule__Model__DocumentAssignment ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:66:2: ( ( ( rule__Model__DocumentAssignment ) ) )
            // InternalTexDsl.g:67:2: ( ( rule__Model__DocumentAssignment ) )
            {
            // InternalTexDsl.g:67:2: ( ( rule__Model__DocumentAssignment ) )
            // InternalTexDsl.g:68:3: ( rule__Model__DocumentAssignment )
            {
             before(grammarAccess.getModelAccess().getDocumentAssignment()); 
            // InternalTexDsl.g:69:3: ( rule__Model__DocumentAssignment )
            // InternalTexDsl.g:69:4: rule__Model__DocumentAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Model__DocumentAssignment();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getDocumentAssignment()); 

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


    // $ANTLR start "entryRuleDocument"
    // InternalTexDsl.g:78:1: entryRuleDocument : ruleDocument EOF ;
    public final void entryRuleDocument() throws RecognitionException {
        try {
            // InternalTexDsl.g:79:1: ( ruleDocument EOF )
            // InternalTexDsl.g:80:1: ruleDocument EOF
            {
             before(grammarAccess.getDocumentRule()); 
            pushFollow(FOLLOW_1);
            ruleDocument();

            state._fsp--;

             after(grammarAccess.getDocumentRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDocument"


    // $ANTLR start "ruleDocument"
    // InternalTexDsl.g:87:1: ruleDocument : ( ( rule__Document__Alternatives ) ) ;
    public final void ruleDocument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:91:2: ( ( ( rule__Document__Alternatives ) ) )
            // InternalTexDsl.g:92:2: ( ( rule__Document__Alternatives ) )
            {
            // InternalTexDsl.g:92:2: ( ( rule__Document__Alternatives ) )
            // InternalTexDsl.g:93:3: ( rule__Document__Alternatives )
            {
             before(grammarAccess.getDocumentAccess().getAlternatives()); 
            // InternalTexDsl.g:94:3: ( rule__Document__Alternatives )
            // InternalTexDsl.g:94:4: rule__Document__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Document__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDocumentAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDocument"


    // $ANTLR start "entryRuleToken"
    // InternalTexDsl.g:103:1: entryRuleToken : ruleToken EOF ;
    public final void entryRuleToken() throws RecognitionException {
        try {
            // InternalTexDsl.g:104:1: ( ruleToken EOF )
            // InternalTexDsl.g:105:1: ruleToken EOF
            {
             before(grammarAccess.getTokenRule()); 
            pushFollow(FOLLOW_1);
            ruleToken();

            state._fsp--;

             after(grammarAccess.getTokenRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleToken"


    // $ANTLR start "ruleToken"
    // InternalTexDsl.g:112:1: ruleToken : ( ( rule__Token__TokenAssignment ) ) ;
    public final void ruleToken() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:116:2: ( ( ( rule__Token__TokenAssignment ) ) )
            // InternalTexDsl.g:117:2: ( ( rule__Token__TokenAssignment ) )
            {
            // InternalTexDsl.g:117:2: ( ( rule__Token__TokenAssignment ) )
            // InternalTexDsl.g:118:3: ( rule__Token__TokenAssignment )
            {
             before(grammarAccess.getTokenAccess().getTokenAssignment()); 
            // InternalTexDsl.g:119:3: ( rule__Token__TokenAssignment )
            // InternalTexDsl.g:119:4: rule__Token__TokenAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Token__TokenAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTokenAccess().getTokenAssignment()); 

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
    // $ANTLR end "ruleToken"


    // $ANTLR start "entryRuleID_Token"
    // InternalTexDsl.g:128:1: entryRuleID_Token : ruleID_Token EOF ;
    public final void entryRuleID_Token() throws RecognitionException {
        try {
            // InternalTexDsl.g:129:1: ( ruleID_Token EOF )
            // InternalTexDsl.g:130:1: ruleID_Token EOF
            {
             before(grammarAccess.getID_TokenRule()); 
            pushFollow(FOLLOW_1);
            ruleID_Token();

            state._fsp--;

             after(grammarAccess.getID_TokenRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleID_Token"


    // $ANTLR start "ruleID_Token"
    // InternalTexDsl.g:137:1: ruleID_Token : ( ( rule__ID_Token__Alternatives ) ) ;
    public final void ruleID_Token() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:141:2: ( ( ( rule__ID_Token__Alternatives ) ) )
            // InternalTexDsl.g:142:2: ( ( rule__ID_Token__Alternatives ) )
            {
            // InternalTexDsl.g:142:2: ( ( rule__ID_Token__Alternatives ) )
            // InternalTexDsl.g:143:3: ( rule__ID_Token__Alternatives )
            {
             before(grammarAccess.getID_TokenAccess().getAlternatives()); 
            // InternalTexDsl.g:144:3: ( rule__ID_Token__Alternatives )
            // InternalTexDsl.g:144:4: rule__ID_Token__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ID_Token__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getID_TokenAccess().getAlternatives()); 

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
    // $ANTLR end "ruleID_Token"


    // $ANTLR start "entryRuleCommandName"
    // InternalTexDsl.g:153:1: entryRuleCommandName : ruleCommandName EOF ;
    public final void entryRuleCommandName() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTexDsl.g:157:1: ( ruleCommandName EOF )
            // InternalTexDsl.g:158:1: ruleCommandName EOF
            {
             before(grammarAccess.getCommandNameRule()); 
            pushFollow(FOLLOW_1);
            ruleCommandName();

            state._fsp--;

             after(grammarAccess.getCommandNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleCommandName"


    // $ANTLR start "ruleCommandName"
    // InternalTexDsl.g:168:1: ruleCommandName : ( ( rule__CommandName__Group__0 ) ) ;
    public final void ruleCommandName() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:173:2: ( ( ( rule__CommandName__Group__0 ) ) )
            // InternalTexDsl.g:174:2: ( ( rule__CommandName__Group__0 ) )
            {
            // InternalTexDsl.g:174:2: ( ( rule__CommandName__Group__0 ) )
            // InternalTexDsl.g:175:3: ( rule__CommandName__Group__0 )
            {
             before(grammarAccess.getCommandNameAccess().getGroup()); 
            // InternalTexDsl.g:176:3: ( rule__CommandName__Group__0 )
            // InternalTexDsl.g:176:4: rule__CommandName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CommandName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCommandNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleCommandName"


    // $ANTLR start "entryRuleCommand"
    // InternalTexDsl.g:186:1: entryRuleCommand : ruleCommand EOF ;
    public final void entryRuleCommand() throws RecognitionException {
        try {
            // InternalTexDsl.g:187:1: ( ruleCommand EOF )
            // InternalTexDsl.g:188:1: ruleCommand EOF
            {
             before(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getCommandRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalTexDsl.g:195:1: ruleCommand : ( ( rule__Command__Group__0 ) ) ;
    public final void ruleCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:199:2: ( ( ( rule__Command__Group__0 ) ) )
            // InternalTexDsl.g:200:2: ( ( rule__Command__Group__0 ) )
            {
            // InternalTexDsl.g:200:2: ( ( rule__Command__Group__0 ) )
            // InternalTexDsl.g:201:3: ( rule__Command__Group__0 )
            {
             before(grammarAccess.getCommandAccess().getGroup()); 
            // InternalTexDsl.g:202:3: ( rule__Command__Group__0 )
            // InternalTexDsl.g:202:4: rule__Command__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Command__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCommandAccess().getGroup()); 

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


    // $ANTLR start "entryRuleAttributes"
    // InternalTexDsl.g:211:1: entryRuleAttributes : ruleAttributes EOF ;
    public final void entryRuleAttributes() throws RecognitionException {
        try {
            // InternalTexDsl.g:212:1: ( ruleAttributes EOF )
            // InternalTexDsl.g:213:1: ruleAttributes EOF
            {
             before(grammarAccess.getAttributesRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributes();

            state._fsp--;

             after(grammarAccess.getAttributesRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAttributes"


    // $ANTLR start "ruleAttributes"
    // InternalTexDsl.g:220:1: ruleAttributes : ( ( rule__Attributes__Group__0 ) ) ;
    public final void ruleAttributes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:224:2: ( ( ( rule__Attributes__Group__0 ) ) )
            // InternalTexDsl.g:225:2: ( ( rule__Attributes__Group__0 ) )
            {
            // InternalTexDsl.g:225:2: ( ( rule__Attributes__Group__0 ) )
            // InternalTexDsl.g:226:3: ( rule__Attributes__Group__0 )
            {
             before(grammarAccess.getAttributesAccess().getGroup()); 
            // InternalTexDsl.g:227:3: ( rule__Attributes__Group__0 )
            // InternalTexDsl.g:227:4: rule__Attributes__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attributes__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributesAccess().getGroup()); 

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
    // $ANTLR end "ruleAttributes"


    // $ANTLR start "rule__Document__Alternatives"
    // InternalTexDsl.g:235:1: rule__Document__Alternatives : ( ( ( ( rule__Document__ElementsAssignment_0 ) ) ( ( rule__Document__ElementsAssignment_0 )* ) ) | ( ( rule__Document__Group_1__0 ) ) );
    public final void rule__Document__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:239:1: ( ( ( ( rule__Document__ElementsAssignment_0 ) ) ( ( rule__Document__ElementsAssignment_0 )* ) ) | ( ( rule__Document__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ALPHA_NUMERIC||LA2_0==RULE_BS) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_END) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalTexDsl.g:240:2: ( ( ( rule__Document__ElementsAssignment_0 ) ) ( ( rule__Document__ElementsAssignment_0 )* ) )
                    {
                    // InternalTexDsl.g:240:2: ( ( ( rule__Document__ElementsAssignment_0 ) ) ( ( rule__Document__ElementsAssignment_0 )* ) )
                    // InternalTexDsl.g:241:3: ( ( rule__Document__ElementsAssignment_0 ) ) ( ( rule__Document__ElementsAssignment_0 )* )
                    {
                    // InternalTexDsl.g:241:3: ( ( rule__Document__ElementsAssignment_0 ) )
                    // InternalTexDsl.g:242:4: ( rule__Document__ElementsAssignment_0 )
                    {
                     before(grammarAccess.getDocumentAccess().getElementsAssignment_0()); 
                    // InternalTexDsl.g:243:4: ( rule__Document__ElementsAssignment_0 )
                    // InternalTexDsl.g:243:5: rule__Document__ElementsAssignment_0
                    {
                    pushFollow(FOLLOW_3);
                    rule__Document__ElementsAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDocumentAccess().getElementsAssignment_0()); 

                    }

                    // InternalTexDsl.g:246:3: ( ( rule__Document__ElementsAssignment_0 )* )
                    // InternalTexDsl.g:247:4: ( rule__Document__ElementsAssignment_0 )*
                    {
                     before(grammarAccess.getDocumentAccess().getElementsAssignment_0()); 
                    // InternalTexDsl.g:248:4: ( rule__Document__ElementsAssignment_0 )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==RULE_ALPHA_NUMERIC||LA1_0==RULE_BS) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalTexDsl.g:248:5: rule__Document__ElementsAssignment_0
                    	    {
                    	    pushFollow(FOLLOW_3);
                    	    rule__Document__ElementsAssignment_0();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                     after(grammarAccess.getDocumentAccess().getElementsAssignment_0()); 

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTexDsl.g:253:2: ( ( rule__Document__Group_1__0 ) )
                    {
                    // InternalTexDsl.g:253:2: ( ( rule__Document__Group_1__0 ) )
                    // InternalTexDsl.g:254:3: ( rule__Document__Group_1__0 )
                    {
                     before(grammarAccess.getDocumentAccess().getGroup_1()); 
                    // InternalTexDsl.g:255:3: ( rule__Document__Group_1__0 )
                    // InternalTexDsl.g:255:4: rule__Document__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Document__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDocumentAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Document__Alternatives"


    // $ANTLR start "rule__Document__ElementsAlternatives_0_0"
    // InternalTexDsl.g:263:1: rule__Document__ElementsAlternatives_0_0 : ( ( ruleToken ) | ( ruleCommand ) );
    public final void rule__Document__ElementsAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:267:1: ( ( ruleToken ) | ( ruleCommand ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ALPHA_NUMERIC) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_BS) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalTexDsl.g:268:2: ( ruleToken )
                    {
                    // InternalTexDsl.g:268:2: ( ruleToken )
                    // InternalTexDsl.g:269:3: ruleToken
                    {
                     before(grammarAccess.getDocumentAccess().getElementsTokenParserRuleCall_0_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleToken();

                    state._fsp--;

                     after(grammarAccess.getDocumentAccess().getElementsTokenParserRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTexDsl.g:274:2: ( ruleCommand )
                    {
                    // InternalTexDsl.g:274:2: ( ruleCommand )
                    // InternalTexDsl.g:275:3: ruleCommand
                    {
                     before(grammarAccess.getDocumentAccess().getElementsCommandParserRuleCall_0_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCommand();

                    state._fsp--;

                     after(grammarAccess.getDocumentAccess().getElementsCommandParserRuleCall_0_0_1()); 

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
    // $ANTLR end "rule__Document__ElementsAlternatives_0_0"


    // $ANTLR start "rule__ID_Token__Alternatives"
    // InternalTexDsl.g:284:1: rule__ID_Token__Alternatives : ( ( RULE_ID ) | ( RULE_ALPHA_NUMERIC ) );
    public final void rule__ID_Token__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:288:1: ( ( RULE_ID ) | ( RULE_ALPHA_NUMERIC ) )
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
                    // InternalTexDsl.g:289:2: ( RULE_ID )
                    {
                    // InternalTexDsl.g:289:2: ( RULE_ID )
                    // InternalTexDsl.g:290:3: RULE_ID
                    {
                     before(grammarAccess.getID_TokenAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getID_TokenAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTexDsl.g:295:2: ( RULE_ALPHA_NUMERIC )
                    {
                    // InternalTexDsl.g:295:2: ( RULE_ALPHA_NUMERIC )
                    // InternalTexDsl.g:296:3: RULE_ALPHA_NUMERIC
                    {
                     before(grammarAccess.getID_TokenAccess().getALPHA_NUMERICTerminalRuleCall_1()); 
                    match(input,RULE_ALPHA_NUMERIC,FOLLOW_2); 
                     after(grammarAccess.getID_TokenAccess().getALPHA_NUMERICTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__ID_Token__Alternatives"


    // $ANTLR start "rule__Attributes__Alternatives_1_1"
    // InternalTexDsl.g:305:1: rule__Attributes__Alternatives_1_1 : ( ( ( rule__Attributes__ValueAssignment_1_1_0 ) ) | ( ( rule__Attributes__Group_1_1_1__0 ) ) );
    public final void rule__Attributes__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:309:1: ( ( ( rule__Attributes__ValueAssignment_1_1_0 ) ) | ( ( rule__Attributes__Group_1_1_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_ALPHA_NUMERIC)) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_CUBO) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalTexDsl.g:310:2: ( ( rule__Attributes__ValueAssignment_1_1_0 ) )
                    {
                    // InternalTexDsl.g:310:2: ( ( rule__Attributes__ValueAssignment_1_1_0 ) )
                    // InternalTexDsl.g:311:3: ( rule__Attributes__ValueAssignment_1_1_0 )
                    {
                     before(grammarAccess.getAttributesAccess().getValueAssignment_1_1_0()); 
                    // InternalTexDsl.g:312:3: ( rule__Attributes__ValueAssignment_1_1_0 )
                    // InternalTexDsl.g:312:4: rule__Attributes__ValueAssignment_1_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attributes__ValueAssignment_1_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributesAccess().getValueAssignment_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTexDsl.g:316:2: ( ( rule__Attributes__Group_1_1_1__0 ) )
                    {
                    // InternalTexDsl.g:316:2: ( ( rule__Attributes__Group_1_1_1__0 ) )
                    // InternalTexDsl.g:317:3: ( rule__Attributes__Group_1_1_1__0 )
                    {
                     before(grammarAccess.getAttributesAccess().getGroup_1_1_1()); 
                    // InternalTexDsl.g:318:3: ( rule__Attributes__Group_1_1_1__0 )
                    // InternalTexDsl.g:318:4: rule__Attributes__Group_1_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attributes__Group_1_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributesAccess().getGroup_1_1_1()); 

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
    // $ANTLR end "rule__Attributes__Alternatives_1_1"


    // $ANTLR start "rule__Document__Group_1__0"
    // InternalTexDsl.g:326:1: rule__Document__Group_1__0 : rule__Document__Group_1__0__Impl rule__Document__Group_1__1 ;
    public final void rule__Document__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:330:1: ( rule__Document__Group_1__0__Impl rule__Document__Group_1__1 )
            // InternalTexDsl.g:331:2: rule__Document__Group_1__0__Impl rule__Document__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Document__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Document__Group_1__1();

            state._fsp--;


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
    // $ANTLR end "rule__Document__Group_1__0"


    // $ANTLR start "rule__Document__Group_1__0__Impl"
    // InternalTexDsl.g:338:1: rule__Document__Group_1__0__Impl : ( () ) ;
    public final void rule__Document__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:342:1: ( ( () ) )
            // InternalTexDsl.g:343:1: ( () )
            {
            // InternalTexDsl.g:343:1: ( () )
            // InternalTexDsl.g:344:2: ()
            {
             before(grammarAccess.getDocumentAccess().getDocumentAction_1_0()); 
            // InternalTexDsl.g:345:2: ()
            // InternalTexDsl.g:345:3: 
            {
            }

             after(grammarAccess.getDocumentAccess().getDocumentAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__Group_1__0__Impl"


    // $ANTLR start "rule__Document__Group_1__1"
    // InternalTexDsl.g:353:1: rule__Document__Group_1__1 : rule__Document__Group_1__1__Impl ;
    public final void rule__Document__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:357:1: ( rule__Document__Group_1__1__Impl )
            // InternalTexDsl.g:358:2: rule__Document__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Document__Group_1__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Document__Group_1__1"


    // $ANTLR start "rule__Document__Group_1__1__Impl"
    // InternalTexDsl.g:364:1: rule__Document__Group_1__1__Impl : ( RULE_END ) ;
    public final void rule__Document__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:368:1: ( ( RULE_END ) )
            // InternalTexDsl.g:369:1: ( RULE_END )
            {
            // InternalTexDsl.g:369:1: ( RULE_END )
            // InternalTexDsl.g:370:2: RULE_END
            {
             before(grammarAccess.getDocumentAccess().getENDTerminalRuleCall_1_1()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getDocumentAccess().getENDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__Document__Group_1__1__Impl"


    // $ANTLR start "rule__CommandName__Group__0"
    // InternalTexDsl.g:380:1: rule__CommandName__Group__0 : rule__CommandName__Group__0__Impl rule__CommandName__Group__1 ;
    public final void rule__CommandName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:384:1: ( rule__CommandName__Group__0__Impl rule__CommandName__Group__1 )
            // InternalTexDsl.g:385:2: rule__CommandName__Group__0__Impl rule__CommandName__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__CommandName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandName__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__CommandName__Group__0"


    // $ANTLR start "rule__CommandName__Group__0__Impl"
    // InternalTexDsl.g:392:1: rule__CommandName__Group__0__Impl : ( ( rule__CommandName__LeadingAssignment_0 ) ) ;
    public final void rule__CommandName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:396:1: ( ( ( rule__CommandName__LeadingAssignment_0 ) ) )
            // InternalTexDsl.g:397:1: ( ( rule__CommandName__LeadingAssignment_0 ) )
            {
            // InternalTexDsl.g:397:1: ( ( rule__CommandName__LeadingAssignment_0 ) )
            // InternalTexDsl.g:398:2: ( rule__CommandName__LeadingAssignment_0 )
            {
             before(grammarAccess.getCommandNameAccess().getLeadingAssignment_0()); 
            // InternalTexDsl.g:399:2: ( rule__CommandName__LeadingAssignment_0 )
            // InternalTexDsl.g:399:3: rule__CommandName__LeadingAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CommandName__LeadingAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCommandNameAccess().getLeadingAssignment_0()); 

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
    // $ANTLR end "rule__CommandName__Group__0__Impl"


    // $ANTLR start "rule__CommandName__Group__1"
    // InternalTexDsl.g:407:1: rule__CommandName__Group__1 : rule__CommandName__Group__1__Impl ;
    public final void rule__CommandName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:411:1: ( rule__CommandName__Group__1__Impl )
            // InternalTexDsl.g:412:2: rule__CommandName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommandName__Group__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__CommandName__Group__1"


    // $ANTLR start "rule__CommandName__Group__1__Impl"
    // InternalTexDsl.g:418:1: rule__CommandName__Group__1__Impl : ( ( rule__CommandName__CNameAssignment_1 ) ) ;
    public final void rule__CommandName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:422:1: ( ( ( rule__CommandName__CNameAssignment_1 ) ) )
            // InternalTexDsl.g:423:1: ( ( rule__CommandName__CNameAssignment_1 ) )
            {
            // InternalTexDsl.g:423:1: ( ( rule__CommandName__CNameAssignment_1 ) )
            // InternalTexDsl.g:424:2: ( rule__CommandName__CNameAssignment_1 )
            {
             before(grammarAccess.getCommandNameAccess().getCNameAssignment_1()); 
            // InternalTexDsl.g:425:2: ( rule__CommandName__CNameAssignment_1 )
            // InternalTexDsl.g:425:3: rule__CommandName__CNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CommandName__CNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCommandNameAccess().getCNameAssignment_1()); 

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
    // $ANTLR end "rule__CommandName__Group__1__Impl"


    // $ANTLR start "rule__Command__Group__0"
    // InternalTexDsl.g:434:1: rule__Command__Group__0 : rule__Command__Group__0__Impl rule__Command__Group__1 ;
    public final void rule__Command__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:438:1: ( rule__Command__Group__0__Impl rule__Command__Group__1 )
            // InternalTexDsl.g:439:2: rule__Command__Group__0__Impl rule__Command__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Command__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Command__Group__1();

            state._fsp--;


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
    // InternalTexDsl.g:446:1: rule__Command__Group__0__Impl : ( ( rule__Command__CommandAssignment_0 ) ) ;
    public final void rule__Command__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:450:1: ( ( ( rule__Command__CommandAssignment_0 ) ) )
            // InternalTexDsl.g:451:1: ( ( rule__Command__CommandAssignment_0 ) )
            {
            // InternalTexDsl.g:451:1: ( ( rule__Command__CommandAssignment_0 ) )
            // InternalTexDsl.g:452:2: ( rule__Command__CommandAssignment_0 )
            {
             before(grammarAccess.getCommandAccess().getCommandAssignment_0()); 
            // InternalTexDsl.g:453:2: ( rule__Command__CommandAssignment_0 )
            // InternalTexDsl.g:453:3: rule__Command__CommandAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Command__CommandAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCommandAccess().getCommandAssignment_0()); 

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
    // InternalTexDsl.g:461:1: rule__Command__Group__1 : rule__Command__Group__1__Impl rule__Command__Group__2 ;
    public final void rule__Command__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:465:1: ( rule__Command__Group__1__Impl rule__Command__Group__2 )
            // InternalTexDsl.g:466:2: rule__Command__Group__1__Impl rule__Command__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Command__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Command__Group__2();

            state._fsp--;


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
    // InternalTexDsl.g:473:1: rule__Command__Group__1__Impl : ( ( rule__Command__Group_1__0 )? ) ;
    public final void rule__Command__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:477:1: ( ( ( rule__Command__Group_1__0 )? ) )
            // InternalTexDsl.g:478:1: ( ( rule__Command__Group_1__0 )? )
            {
            // InternalTexDsl.g:478:1: ( ( rule__Command__Group_1__0 )? )
            // InternalTexDsl.g:479:2: ( rule__Command__Group_1__0 )?
            {
             before(grammarAccess.getCommandAccess().getGroup_1()); 
            // InternalTexDsl.g:480:2: ( rule__Command__Group_1__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_SQBO) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalTexDsl.g:480:3: rule__Command__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Command__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCommandAccess().getGroup_1()); 

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
    // InternalTexDsl.g:488:1: rule__Command__Group__2 : rule__Command__Group__2__Impl ;
    public final void rule__Command__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:492:1: ( rule__Command__Group__2__Impl )
            // InternalTexDsl.g:493:2: rule__Command__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Command__Group__2__Impl();

            state._fsp--;


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
    // InternalTexDsl.g:499:1: rule__Command__Group__2__Impl : ( ( rule__Command__Group_2__0 )? ) ;
    public final void rule__Command__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:503:1: ( ( ( rule__Command__Group_2__0 )? ) )
            // InternalTexDsl.g:504:1: ( ( rule__Command__Group_2__0 )? )
            {
            // InternalTexDsl.g:504:1: ( ( rule__Command__Group_2__0 )? )
            // InternalTexDsl.g:505:2: ( rule__Command__Group_2__0 )?
            {
             before(grammarAccess.getCommandAccess().getGroup_2()); 
            // InternalTexDsl.g:506:2: ( rule__Command__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_CUBO) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalTexDsl.g:506:3: rule__Command__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Command__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCommandAccess().getGroup_2()); 

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


    // $ANTLR start "rule__Command__Group_1__0"
    // InternalTexDsl.g:515:1: rule__Command__Group_1__0 : rule__Command__Group_1__0__Impl rule__Command__Group_1__1 ;
    public final void rule__Command__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:519:1: ( rule__Command__Group_1__0__Impl rule__Command__Group_1__1 )
            // InternalTexDsl.g:520:2: rule__Command__Group_1__0__Impl rule__Command__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Command__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Command__Group_1__1();

            state._fsp--;


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
    // $ANTLR end "rule__Command__Group_1__0"


    // $ANTLR start "rule__Command__Group_1__0__Impl"
    // InternalTexDsl.g:527:1: rule__Command__Group_1__0__Impl : ( RULE_SQBO ) ;
    public final void rule__Command__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:531:1: ( ( RULE_SQBO ) )
            // InternalTexDsl.g:532:1: ( RULE_SQBO )
            {
            // InternalTexDsl.g:532:1: ( RULE_SQBO )
            // InternalTexDsl.g:533:2: RULE_SQBO
            {
             before(grammarAccess.getCommandAccess().getSQBOTerminalRuleCall_1_0()); 
            match(input,RULE_SQBO,FOLLOW_2); 
             after(grammarAccess.getCommandAccess().getSQBOTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Command__Group_1__0__Impl"


    // $ANTLR start "rule__Command__Group_1__1"
    // InternalTexDsl.g:542:1: rule__Command__Group_1__1 : rule__Command__Group_1__1__Impl rule__Command__Group_1__2 ;
    public final void rule__Command__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:546:1: ( rule__Command__Group_1__1__Impl rule__Command__Group_1__2 )
            // InternalTexDsl.g:547:2: rule__Command__Group_1__1__Impl rule__Command__Group_1__2
            {
            pushFollow(FOLLOW_7);
            rule__Command__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Command__Group_1__2();

            state._fsp--;


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
    // $ANTLR end "rule__Command__Group_1__1"


    // $ANTLR start "rule__Command__Group_1__1__Impl"
    // InternalTexDsl.g:554:1: rule__Command__Group_1__1__Impl : ( ( rule__Command__AttributesAssignment_1_1 ) ) ;
    public final void rule__Command__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:558:1: ( ( ( rule__Command__AttributesAssignment_1_1 ) ) )
            // InternalTexDsl.g:559:1: ( ( rule__Command__AttributesAssignment_1_1 ) )
            {
            // InternalTexDsl.g:559:1: ( ( rule__Command__AttributesAssignment_1_1 ) )
            // InternalTexDsl.g:560:2: ( rule__Command__AttributesAssignment_1_1 )
            {
             before(grammarAccess.getCommandAccess().getAttributesAssignment_1_1()); 
            // InternalTexDsl.g:561:2: ( rule__Command__AttributesAssignment_1_1 )
            // InternalTexDsl.g:561:3: rule__Command__AttributesAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Command__AttributesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCommandAccess().getAttributesAssignment_1_1()); 

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
    // $ANTLR end "rule__Command__Group_1__1__Impl"


    // $ANTLR start "rule__Command__Group_1__2"
    // InternalTexDsl.g:569:1: rule__Command__Group_1__2 : rule__Command__Group_1__2__Impl rule__Command__Group_1__3 ;
    public final void rule__Command__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:573:1: ( rule__Command__Group_1__2__Impl rule__Command__Group_1__3 )
            // InternalTexDsl.g:574:2: rule__Command__Group_1__2__Impl rule__Command__Group_1__3
            {
            pushFollow(FOLLOW_7);
            rule__Command__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Command__Group_1__3();

            state._fsp--;


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
    // $ANTLR end "rule__Command__Group_1__2"


    // $ANTLR start "rule__Command__Group_1__2__Impl"
    // InternalTexDsl.g:581:1: rule__Command__Group_1__2__Impl : ( ( rule__Command__Group_1_2__0 )* ) ;
    public final void rule__Command__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:585:1: ( ( ( rule__Command__Group_1_2__0 )* ) )
            // InternalTexDsl.g:586:1: ( ( rule__Command__Group_1_2__0 )* )
            {
            // InternalTexDsl.g:586:1: ( ( rule__Command__Group_1_2__0 )* )
            // InternalTexDsl.g:587:2: ( rule__Command__Group_1_2__0 )*
            {
             before(grammarAccess.getCommandAccess().getGroup_1_2()); 
            // InternalTexDsl.g:588:2: ( rule__Command__Group_1_2__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_KOMMA) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalTexDsl.g:588:3: rule__Command__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Command__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getCommandAccess().getGroup_1_2()); 

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
    // $ANTLR end "rule__Command__Group_1__2__Impl"


    // $ANTLR start "rule__Command__Group_1__3"
    // InternalTexDsl.g:596:1: rule__Command__Group_1__3 : rule__Command__Group_1__3__Impl ;
    public final void rule__Command__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:600:1: ( rule__Command__Group_1__3__Impl )
            // InternalTexDsl.g:601:2: rule__Command__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Command__Group_1__3__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Command__Group_1__3"


    // $ANTLR start "rule__Command__Group_1__3__Impl"
    // InternalTexDsl.g:607:1: rule__Command__Group_1__3__Impl : ( RULE_SQBC ) ;
    public final void rule__Command__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:611:1: ( ( RULE_SQBC ) )
            // InternalTexDsl.g:612:1: ( RULE_SQBC )
            {
            // InternalTexDsl.g:612:1: ( RULE_SQBC )
            // InternalTexDsl.g:613:2: RULE_SQBC
            {
             before(grammarAccess.getCommandAccess().getSQBCTerminalRuleCall_1_3()); 
            match(input,RULE_SQBC,FOLLOW_2); 
             after(grammarAccess.getCommandAccess().getSQBCTerminalRuleCall_1_3()); 

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
    // $ANTLR end "rule__Command__Group_1__3__Impl"


    // $ANTLR start "rule__Command__Group_1_2__0"
    // InternalTexDsl.g:623:1: rule__Command__Group_1_2__0 : rule__Command__Group_1_2__0__Impl rule__Command__Group_1_2__1 ;
    public final void rule__Command__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:627:1: ( rule__Command__Group_1_2__0__Impl rule__Command__Group_1_2__1 )
            // InternalTexDsl.g:628:2: rule__Command__Group_1_2__0__Impl rule__Command__Group_1_2__1
            {
            pushFollow(FOLLOW_5);
            rule__Command__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Command__Group_1_2__1();

            state._fsp--;


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
    // $ANTLR end "rule__Command__Group_1_2__0"


    // $ANTLR start "rule__Command__Group_1_2__0__Impl"
    // InternalTexDsl.g:635:1: rule__Command__Group_1_2__0__Impl : ( RULE_KOMMA ) ;
    public final void rule__Command__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:639:1: ( ( RULE_KOMMA ) )
            // InternalTexDsl.g:640:1: ( RULE_KOMMA )
            {
            // InternalTexDsl.g:640:1: ( RULE_KOMMA )
            // InternalTexDsl.g:641:2: RULE_KOMMA
            {
             before(grammarAccess.getCommandAccess().getKOMMATerminalRuleCall_1_2_0()); 
            match(input,RULE_KOMMA,FOLLOW_2); 
             after(grammarAccess.getCommandAccess().getKOMMATerminalRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Command__Group_1_2__0__Impl"


    // $ANTLR start "rule__Command__Group_1_2__1"
    // InternalTexDsl.g:650:1: rule__Command__Group_1_2__1 : rule__Command__Group_1_2__1__Impl ;
    public final void rule__Command__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:654:1: ( rule__Command__Group_1_2__1__Impl )
            // InternalTexDsl.g:655:2: rule__Command__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Command__Group_1_2__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Command__Group_1_2__1"


    // $ANTLR start "rule__Command__Group_1_2__1__Impl"
    // InternalTexDsl.g:661:1: rule__Command__Group_1_2__1__Impl : ( ( rule__Command__AttributesAssignment_1_2_1 ) ) ;
    public final void rule__Command__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:665:1: ( ( ( rule__Command__AttributesAssignment_1_2_1 ) ) )
            // InternalTexDsl.g:666:1: ( ( rule__Command__AttributesAssignment_1_2_1 ) )
            {
            // InternalTexDsl.g:666:1: ( ( rule__Command__AttributesAssignment_1_2_1 ) )
            // InternalTexDsl.g:667:2: ( rule__Command__AttributesAssignment_1_2_1 )
            {
             before(grammarAccess.getCommandAccess().getAttributesAssignment_1_2_1()); 
            // InternalTexDsl.g:668:2: ( rule__Command__AttributesAssignment_1_2_1 )
            // InternalTexDsl.g:668:3: rule__Command__AttributesAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Command__AttributesAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCommandAccess().getAttributesAssignment_1_2_1()); 

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
    // $ANTLR end "rule__Command__Group_1_2__1__Impl"


    // $ANTLR start "rule__Command__Group_2__0"
    // InternalTexDsl.g:677:1: rule__Command__Group_2__0 : rule__Command__Group_2__0__Impl rule__Command__Group_2__1 ;
    public final void rule__Command__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:681:1: ( rule__Command__Group_2__0__Impl rule__Command__Group_2__1 )
            // InternalTexDsl.g:682:2: rule__Command__Group_2__0__Impl rule__Command__Group_2__1
            {
            pushFollow(FOLLOW_9);
            rule__Command__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Command__Group_2__1();

            state._fsp--;


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
    // $ANTLR end "rule__Command__Group_2__0"


    // $ANTLR start "rule__Command__Group_2__0__Impl"
    // InternalTexDsl.g:689:1: rule__Command__Group_2__0__Impl : ( RULE_CUBO ) ;
    public final void rule__Command__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:693:1: ( ( RULE_CUBO ) )
            // InternalTexDsl.g:694:1: ( RULE_CUBO )
            {
            // InternalTexDsl.g:694:1: ( RULE_CUBO )
            // InternalTexDsl.g:695:2: RULE_CUBO
            {
             before(grammarAccess.getCommandAccess().getCUBOTerminalRuleCall_2_0()); 
            match(input,RULE_CUBO,FOLLOW_2); 
             after(grammarAccess.getCommandAccess().getCUBOTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Command__Group_2__0__Impl"


    // $ANTLR start "rule__Command__Group_2__1"
    // InternalTexDsl.g:704:1: rule__Command__Group_2__1 : rule__Command__Group_2__1__Impl rule__Command__Group_2__2 ;
    public final void rule__Command__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:708:1: ( rule__Command__Group_2__1__Impl rule__Command__Group_2__2 )
            // InternalTexDsl.g:709:2: rule__Command__Group_2__1__Impl rule__Command__Group_2__2
            {
            pushFollow(FOLLOW_10);
            rule__Command__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Command__Group_2__2();

            state._fsp--;


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
    // $ANTLR end "rule__Command__Group_2__1"


    // $ANTLR start "rule__Command__Group_2__1__Impl"
    // InternalTexDsl.g:716:1: rule__Command__Group_2__1__Impl : ( ( ( rule__Command__TypesAssignment_2_1 ) ) ( ( rule__Command__TypesAssignment_2_1 )* ) ) ;
    public final void rule__Command__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:720:1: ( ( ( ( rule__Command__TypesAssignment_2_1 ) ) ( ( rule__Command__TypesAssignment_2_1 )* ) ) )
            // InternalTexDsl.g:721:1: ( ( ( rule__Command__TypesAssignment_2_1 ) ) ( ( rule__Command__TypesAssignment_2_1 )* ) )
            {
            // InternalTexDsl.g:721:1: ( ( ( rule__Command__TypesAssignment_2_1 ) ) ( ( rule__Command__TypesAssignment_2_1 )* ) )
            // InternalTexDsl.g:722:2: ( ( rule__Command__TypesAssignment_2_1 ) ) ( ( rule__Command__TypesAssignment_2_1 )* )
            {
            // InternalTexDsl.g:722:2: ( ( rule__Command__TypesAssignment_2_1 ) )
            // InternalTexDsl.g:723:3: ( rule__Command__TypesAssignment_2_1 )
            {
             before(grammarAccess.getCommandAccess().getTypesAssignment_2_1()); 
            // InternalTexDsl.g:724:3: ( rule__Command__TypesAssignment_2_1 )
            // InternalTexDsl.g:724:4: rule__Command__TypesAssignment_2_1
            {
            pushFollow(FOLLOW_11);
            rule__Command__TypesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCommandAccess().getTypesAssignment_2_1()); 

            }

            // InternalTexDsl.g:727:2: ( ( rule__Command__TypesAssignment_2_1 )* )
            // InternalTexDsl.g:728:3: ( rule__Command__TypesAssignment_2_1 )*
            {
             before(grammarAccess.getCommandAccess().getTypesAssignment_2_1()); 
            // InternalTexDsl.g:729:3: ( rule__Command__TypesAssignment_2_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_ALPHA_NUMERIC)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalTexDsl.g:729:4: rule__Command__TypesAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Command__TypesAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getCommandAccess().getTypesAssignment_2_1()); 

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
    // $ANTLR end "rule__Command__Group_2__1__Impl"


    // $ANTLR start "rule__Command__Group_2__2"
    // InternalTexDsl.g:738:1: rule__Command__Group_2__2 : rule__Command__Group_2__2__Impl ;
    public final void rule__Command__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:742:1: ( rule__Command__Group_2__2__Impl )
            // InternalTexDsl.g:743:2: rule__Command__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Command__Group_2__2__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Command__Group_2__2"


    // $ANTLR start "rule__Command__Group_2__2__Impl"
    // InternalTexDsl.g:749:1: rule__Command__Group_2__2__Impl : ( RULE_CUBC ) ;
    public final void rule__Command__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:753:1: ( ( RULE_CUBC ) )
            // InternalTexDsl.g:754:1: ( RULE_CUBC )
            {
            // InternalTexDsl.g:754:1: ( RULE_CUBC )
            // InternalTexDsl.g:755:2: RULE_CUBC
            {
             before(grammarAccess.getCommandAccess().getCUBCTerminalRuleCall_2_2()); 
            match(input,RULE_CUBC,FOLLOW_2); 
             after(grammarAccess.getCommandAccess().getCUBCTerminalRuleCall_2_2()); 

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
    // $ANTLR end "rule__Command__Group_2__2__Impl"


    // $ANTLR start "rule__Attributes__Group__0"
    // InternalTexDsl.g:765:1: rule__Attributes__Group__0 : rule__Attributes__Group__0__Impl rule__Attributes__Group__1 ;
    public final void rule__Attributes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:769:1: ( rule__Attributes__Group__0__Impl rule__Attributes__Group__1 )
            // InternalTexDsl.g:770:2: rule__Attributes__Group__0__Impl rule__Attributes__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Attributes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attributes__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Attributes__Group__0"


    // $ANTLR start "rule__Attributes__Group__0__Impl"
    // InternalTexDsl.g:777:1: rule__Attributes__Group__0__Impl : ( ( rule__Attributes__KeyAssignment_0 ) ) ;
    public final void rule__Attributes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:781:1: ( ( ( rule__Attributes__KeyAssignment_0 ) ) )
            // InternalTexDsl.g:782:1: ( ( rule__Attributes__KeyAssignment_0 ) )
            {
            // InternalTexDsl.g:782:1: ( ( rule__Attributes__KeyAssignment_0 ) )
            // InternalTexDsl.g:783:2: ( rule__Attributes__KeyAssignment_0 )
            {
             before(grammarAccess.getAttributesAccess().getKeyAssignment_0()); 
            // InternalTexDsl.g:784:2: ( rule__Attributes__KeyAssignment_0 )
            // InternalTexDsl.g:784:3: rule__Attributes__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Attributes__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributesAccess().getKeyAssignment_0()); 

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
    // $ANTLR end "rule__Attributes__Group__0__Impl"


    // $ANTLR start "rule__Attributes__Group__1"
    // InternalTexDsl.g:792:1: rule__Attributes__Group__1 : rule__Attributes__Group__1__Impl ;
    public final void rule__Attributes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:796:1: ( rule__Attributes__Group__1__Impl )
            // InternalTexDsl.g:797:2: rule__Attributes__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attributes__Group__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Attributes__Group__1"


    // $ANTLR start "rule__Attributes__Group__1__Impl"
    // InternalTexDsl.g:803:1: rule__Attributes__Group__1__Impl : ( ( rule__Attributes__Group_1__0 )? ) ;
    public final void rule__Attributes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:807:1: ( ( ( rule__Attributes__Group_1__0 )? ) )
            // InternalTexDsl.g:808:1: ( ( rule__Attributes__Group_1__0 )? )
            {
            // InternalTexDsl.g:808:1: ( ( rule__Attributes__Group_1__0 )? )
            // InternalTexDsl.g:809:2: ( rule__Attributes__Group_1__0 )?
            {
             before(grammarAccess.getAttributesAccess().getGroup_1()); 
            // InternalTexDsl.g:810:2: ( rule__Attributes__Group_1__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_EQ) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalTexDsl.g:810:3: rule__Attributes__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attributes__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributesAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Attributes__Group__1__Impl"


    // $ANTLR start "rule__Attributes__Group_1__0"
    // InternalTexDsl.g:819:1: rule__Attributes__Group_1__0 : rule__Attributes__Group_1__0__Impl rule__Attributes__Group_1__1 ;
    public final void rule__Attributes__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:823:1: ( rule__Attributes__Group_1__0__Impl rule__Attributes__Group_1__1 )
            // InternalTexDsl.g:824:2: rule__Attributes__Group_1__0__Impl rule__Attributes__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__Attributes__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attributes__Group_1__1();

            state._fsp--;


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
    // $ANTLR end "rule__Attributes__Group_1__0"


    // $ANTLR start "rule__Attributes__Group_1__0__Impl"
    // InternalTexDsl.g:831:1: rule__Attributes__Group_1__0__Impl : ( RULE_EQ ) ;
    public final void rule__Attributes__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:835:1: ( ( RULE_EQ ) )
            // InternalTexDsl.g:836:1: ( RULE_EQ )
            {
            // InternalTexDsl.g:836:1: ( RULE_EQ )
            // InternalTexDsl.g:837:2: RULE_EQ
            {
             before(grammarAccess.getAttributesAccess().getEQTerminalRuleCall_1_0()); 
            match(input,RULE_EQ,FOLLOW_2); 
             after(grammarAccess.getAttributesAccess().getEQTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Attributes__Group_1__0__Impl"


    // $ANTLR start "rule__Attributes__Group_1__1"
    // InternalTexDsl.g:846:1: rule__Attributes__Group_1__1 : rule__Attributes__Group_1__1__Impl ;
    public final void rule__Attributes__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:850:1: ( rule__Attributes__Group_1__1__Impl )
            // InternalTexDsl.g:851:2: rule__Attributes__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attributes__Group_1__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Attributes__Group_1__1"


    // $ANTLR start "rule__Attributes__Group_1__1__Impl"
    // InternalTexDsl.g:857:1: rule__Attributes__Group_1__1__Impl : ( ( rule__Attributes__Alternatives_1_1 ) ) ;
    public final void rule__Attributes__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:861:1: ( ( ( rule__Attributes__Alternatives_1_1 ) ) )
            // InternalTexDsl.g:862:1: ( ( rule__Attributes__Alternatives_1_1 ) )
            {
            // InternalTexDsl.g:862:1: ( ( rule__Attributes__Alternatives_1_1 ) )
            // InternalTexDsl.g:863:2: ( rule__Attributes__Alternatives_1_1 )
            {
             before(grammarAccess.getAttributesAccess().getAlternatives_1_1()); 
            // InternalTexDsl.g:864:2: ( rule__Attributes__Alternatives_1_1 )
            // InternalTexDsl.g:864:3: rule__Attributes__Alternatives_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Attributes__Alternatives_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributesAccess().getAlternatives_1_1()); 

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
    // $ANTLR end "rule__Attributes__Group_1__1__Impl"


    // $ANTLR start "rule__Attributes__Group_1_1_1__0"
    // InternalTexDsl.g:873:1: rule__Attributes__Group_1_1_1__0 : rule__Attributes__Group_1_1_1__0__Impl rule__Attributes__Group_1_1_1__1 ;
    public final void rule__Attributes__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:877:1: ( rule__Attributes__Group_1_1_1__0__Impl rule__Attributes__Group_1_1_1__1 )
            // InternalTexDsl.g:878:2: rule__Attributes__Group_1_1_1__0__Impl rule__Attributes__Group_1_1_1__1
            {
            pushFollow(FOLLOW_9);
            rule__Attributes__Group_1_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attributes__Group_1_1_1__1();

            state._fsp--;


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
    // $ANTLR end "rule__Attributes__Group_1_1_1__0"


    // $ANTLR start "rule__Attributes__Group_1_1_1__0__Impl"
    // InternalTexDsl.g:885:1: rule__Attributes__Group_1_1_1__0__Impl : ( RULE_CUBO ) ;
    public final void rule__Attributes__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:889:1: ( ( RULE_CUBO ) )
            // InternalTexDsl.g:890:1: ( RULE_CUBO )
            {
            // InternalTexDsl.g:890:1: ( RULE_CUBO )
            // InternalTexDsl.g:891:2: RULE_CUBO
            {
             before(grammarAccess.getAttributesAccess().getCUBOTerminalRuleCall_1_1_1_0()); 
            match(input,RULE_CUBO,FOLLOW_2); 
             after(grammarAccess.getAttributesAccess().getCUBOTerminalRuleCall_1_1_1_0()); 

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
    // $ANTLR end "rule__Attributes__Group_1_1_1__0__Impl"


    // $ANTLR start "rule__Attributes__Group_1_1_1__1"
    // InternalTexDsl.g:900:1: rule__Attributes__Group_1_1_1__1 : rule__Attributes__Group_1_1_1__1__Impl rule__Attributes__Group_1_1_1__2 ;
    public final void rule__Attributes__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:904:1: ( rule__Attributes__Group_1_1_1__1__Impl rule__Attributes__Group_1_1_1__2 )
            // InternalTexDsl.g:905:2: rule__Attributes__Group_1_1_1__1__Impl rule__Attributes__Group_1_1_1__2
            {
            pushFollow(FOLLOW_10);
            rule__Attributes__Group_1_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attributes__Group_1_1_1__2();

            state._fsp--;


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
    // $ANTLR end "rule__Attributes__Group_1_1_1__1"


    // $ANTLR start "rule__Attributes__Group_1_1_1__1__Impl"
    // InternalTexDsl.g:912:1: rule__Attributes__Group_1_1_1__1__Impl : ( ( ( rule__Attributes__MultiValueAssignment_1_1_1_1 ) ) ( ( rule__Attributes__MultiValueAssignment_1_1_1_1 )* ) ) ;
    public final void rule__Attributes__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:916:1: ( ( ( ( rule__Attributes__MultiValueAssignment_1_1_1_1 ) ) ( ( rule__Attributes__MultiValueAssignment_1_1_1_1 )* ) ) )
            // InternalTexDsl.g:917:1: ( ( ( rule__Attributes__MultiValueAssignment_1_1_1_1 ) ) ( ( rule__Attributes__MultiValueAssignment_1_1_1_1 )* ) )
            {
            // InternalTexDsl.g:917:1: ( ( ( rule__Attributes__MultiValueAssignment_1_1_1_1 ) ) ( ( rule__Attributes__MultiValueAssignment_1_1_1_1 )* ) )
            // InternalTexDsl.g:918:2: ( ( rule__Attributes__MultiValueAssignment_1_1_1_1 ) ) ( ( rule__Attributes__MultiValueAssignment_1_1_1_1 )* )
            {
            // InternalTexDsl.g:918:2: ( ( rule__Attributes__MultiValueAssignment_1_1_1_1 ) )
            // InternalTexDsl.g:919:3: ( rule__Attributes__MultiValueAssignment_1_1_1_1 )
            {
             before(grammarAccess.getAttributesAccess().getMultiValueAssignment_1_1_1_1()); 
            // InternalTexDsl.g:920:3: ( rule__Attributes__MultiValueAssignment_1_1_1_1 )
            // InternalTexDsl.g:920:4: rule__Attributes__MultiValueAssignment_1_1_1_1
            {
            pushFollow(FOLLOW_11);
            rule__Attributes__MultiValueAssignment_1_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributesAccess().getMultiValueAssignment_1_1_1_1()); 

            }

            // InternalTexDsl.g:923:2: ( ( rule__Attributes__MultiValueAssignment_1_1_1_1 )* )
            // InternalTexDsl.g:924:3: ( rule__Attributes__MultiValueAssignment_1_1_1_1 )*
            {
             before(grammarAccess.getAttributesAccess().getMultiValueAssignment_1_1_1_1()); 
            // InternalTexDsl.g:925:3: ( rule__Attributes__MultiValueAssignment_1_1_1_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_ALPHA_NUMERIC)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalTexDsl.g:925:4: rule__Attributes__MultiValueAssignment_1_1_1_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Attributes__MultiValueAssignment_1_1_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getAttributesAccess().getMultiValueAssignment_1_1_1_1()); 

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
    // $ANTLR end "rule__Attributes__Group_1_1_1__1__Impl"


    // $ANTLR start "rule__Attributes__Group_1_1_1__2"
    // InternalTexDsl.g:934:1: rule__Attributes__Group_1_1_1__2 : rule__Attributes__Group_1_1_1__2__Impl ;
    public final void rule__Attributes__Group_1_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:938:1: ( rule__Attributes__Group_1_1_1__2__Impl )
            // InternalTexDsl.g:939:2: rule__Attributes__Group_1_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attributes__Group_1_1_1__2__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Attributes__Group_1_1_1__2"


    // $ANTLR start "rule__Attributes__Group_1_1_1__2__Impl"
    // InternalTexDsl.g:945:1: rule__Attributes__Group_1_1_1__2__Impl : ( RULE_CUBC ) ;
    public final void rule__Attributes__Group_1_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:949:1: ( ( RULE_CUBC ) )
            // InternalTexDsl.g:950:1: ( RULE_CUBC )
            {
            // InternalTexDsl.g:950:1: ( RULE_CUBC )
            // InternalTexDsl.g:951:2: RULE_CUBC
            {
             before(grammarAccess.getAttributesAccess().getCUBCTerminalRuleCall_1_1_1_2()); 
            match(input,RULE_CUBC,FOLLOW_2); 
             after(grammarAccess.getAttributesAccess().getCUBCTerminalRuleCall_1_1_1_2()); 

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
    // $ANTLR end "rule__Attributes__Group_1_1_1__2__Impl"


    // $ANTLR start "rule__Model__DocumentAssignment"
    // InternalTexDsl.g:961:1: rule__Model__DocumentAssignment : ( ruleDocument ) ;
    public final void rule__Model__DocumentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:965:1: ( ( ruleDocument ) )
            // InternalTexDsl.g:966:2: ( ruleDocument )
            {
            // InternalTexDsl.g:966:2: ( ruleDocument )
            // InternalTexDsl.g:967:3: ruleDocument
            {
             before(grammarAccess.getModelAccess().getDocumentDocumentParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleDocument();

            state._fsp--;

             after(grammarAccess.getModelAccess().getDocumentDocumentParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__DocumentAssignment"


    // $ANTLR start "rule__Document__ElementsAssignment_0"
    // InternalTexDsl.g:976:1: rule__Document__ElementsAssignment_0 : ( ( rule__Document__ElementsAlternatives_0_0 ) ) ;
    public final void rule__Document__ElementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:980:1: ( ( ( rule__Document__ElementsAlternatives_0_0 ) ) )
            // InternalTexDsl.g:981:2: ( ( rule__Document__ElementsAlternatives_0_0 ) )
            {
            // InternalTexDsl.g:981:2: ( ( rule__Document__ElementsAlternatives_0_0 ) )
            // InternalTexDsl.g:982:3: ( rule__Document__ElementsAlternatives_0_0 )
            {
             before(grammarAccess.getDocumentAccess().getElementsAlternatives_0_0()); 
            // InternalTexDsl.g:983:3: ( rule__Document__ElementsAlternatives_0_0 )
            // InternalTexDsl.g:983:4: rule__Document__ElementsAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Document__ElementsAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getDocumentAccess().getElementsAlternatives_0_0()); 

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
    // $ANTLR end "rule__Document__ElementsAssignment_0"


    // $ANTLR start "rule__Token__TokenAssignment"
    // InternalTexDsl.g:991:1: rule__Token__TokenAssignment : ( RULE_ALPHA_NUMERIC ) ;
    public final void rule__Token__TokenAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:995:1: ( ( RULE_ALPHA_NUMERIC ) )
            // InternalTexDsl.g:996:2: ( RULE_ALPHA_NUMERIC )
            {
            // InternalTexDsl.g:996:2: ( RULE_ALPHA_NUMERIC )
            // InternalTexDsl.g:997:3: RULE_ALPHA_NUMERIC
            {
             before(grammarAccess.getTokenAccess().getTokenALPHA_NUMERICTerminalRuleCall_0()); 
            match(input,RULE_ALPHA_NUMERIC,FOLLOW_2); 
             after(grammarAccess.getTokenAccess().getTokenALPHA_NUMERICTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Token__TokenAssignment"


    // $ANTLR start "rule__CommandName__LeadingAssignment_0"
    // InternalTexDsl.g:1006:1: rule__CommandName__LeadingAssignment_0 : ( RULE_BS ) ;
    public final void rule__CommandName__LeadingAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1010:1: ( ( RULE_BS ) )
            // InternalTexDsl.g:1011:2: ( RULE_BS )
            {
            // InternalTexDsl.g:1011:2: ( RULE_BS )
            // InternalTexDsl.g:1012:3: RULE_BS
            {
             before(grammarAccess.getCommandNameAccess().getLeadingBSTerminalRuleCall_0_0()); 
            match(input,RULE_BS,FOLLOW_2); 
             after(grammarAccess.getCommandNameAccess().getLeadingBSTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__CommandName__LeadingAssignment_0"


    // $ANTLR start "rule__CommandName__CNameAssignment_1"
    // InternalTexDsl.g:1021:1: rule__CommandName__CNameAssignment_1 : ( RULE_ALPHA_NUMERIC ) ;
    public final void rule__CommandName__CNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1025:1: ( ( RULE_ALPHA_NUMERIC ) )
            // InternalTexDsl.g:1026:2: ( RULE_ALPHA_NUMERIC )
            {
            // InternalTexDsl.g:1026:2: ( RULE_ALPHA_NUMERIC )
            // InternalTexDsl.g:1027:3: RULE_ALPHA_NUMERIC
            {
             before(grammarAccess.getCommandNameAccess().getCNameALPHA_NUMERICTerminalRuleCall_1_0()); 
            match(input,RULE_ALPHA_NUMERIC,FOLLOW_2); 
             after(grammarAccess.getCommandNameAccess().getCNameALPHA_NUMERICTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__CommandName__CNameAssignment_1"


    // $ANTLR start "rule__Command__CommandAssignment_0"
    // InternalTexDsl.g:1036:1: rule__Command__CommandAssignment_0 : ( ruleCommandName ) ;
    public final void rule__Command__CommandAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1040:1: ( ( ruleCommandName ) )
            // InternalTexDsl.g:1041:2: ( ruleCommandName )
            {
            // InternalTexDsl.g:1041:2: ( ruleCommandName )
            // InternalTexDsl.g:1042:3: ruleCommandName
            {
             before(grammarAccess.getCommandAccess().getCommandCommandNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCommandName();

            state._fsp--;

             after(grammarAccess.getCommandAccess().getCommandCommandNameParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Command__CommandAssignment_0"


    // $ANTLR start "rule__Command__AttributesAssignment_1_1"
    // InternalTexDsl.g:1051:1: rule__Command__AttributesAssignment_1_1 : ( ruleAttributes ) ;
    public final void rule__Command__AttributesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1055:1: ( ( ruleAttributes ) )
            // InternalTexDsl.g:1056:2: ( ruleAttributes )
            {
            // InternalTexDsl.g:1056:2: ( ruleAttributes )
            // InternalTexDsl.g:1057:3: ruleAttributes
            {
             before(grammarAccess.getCommandAccess().getAttributesAttributesParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributes();

            state._fsp--;

             after(grammarAccess.getCommandAccess().getAttributesAttributesParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Command__AttributesAssignment_1_1"


    // $ANTLR start "rule__Command__AttributesAssignment_1_2_1"
    // InternalTexDsl.g:1066:1: rule__Command__AttributesAssignment_1_2_1 : ( ruleAttributes ) ;
    public final void rule__Command__AttributesAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1070:1: ( ( ruleAttributes ) )
            // InternalTexDsl.g:1071:2: ( ruleAttributes )
            {
            // InternalTexDsl.g:1071:2: ( ruleAttributes )
            // InternalTexDsl.g:1072:3: ruleAttributes
            {
             before(grammarAccess.getCommandAccess().getAttributesAttributesParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributes();

            state._fsp--;

             after(grammarAccess.getCommandAccess().getAttributesAttributesParserRuleCall_1_2_1_0()); 

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
    // $ANTLR end "rule__Command__AttributesAssignment_1_2_1"


    // $ANTLR start "rule__Command__TypesAssignment_2_1"
    // InternalTexDsl.g:1081:1: rule__Command__TypesAssignment_2_1 : ( ruleID_Token ) ;
    public final void rule__Command__TypesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1085:1: ( ( ruleID_Token ) )
            // InternalTexDsl.g:1086:2: ( ruleID_Token )
            {
            // InternalTexDsl.g:1086:2: ( ruleID_Token )
            // InternalTexDsl.g:1087:3: ruleID_Token
            {
             before(grammarAccess.getCommandAccess().getTypesID_TokenParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleID_Token();

            state._fsp--;

             after(grammarAccess.getCommandAccess().getTypesID_TokenParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Command__TypesAssignment_2_1"


    // $ANTLR start "rule__Attributes__KeyAssignment_0"
    // InternalTexDsl.g:1096:1: rule__Attributes__KeyAssignment_0 : ( ruleToken ) ;
    public final void rule__Attributes__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1100:1: ( ( ruleToken ) )
            // InternalTexDsl.g:1101:2: ( ruleToken )
            {
            // InternalTexDsl.g:1101:2: ( ruleToken )
            // InternalTexDsl.g:1102:3: ruleToken
            {
             before(grammarAccess.getAttributesAccess().getKeyTokenParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleToken();

            state._fsp--;

             after(grammarAccess.getAttributesAccess().getKeyTokenParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Attributes__KeyAssignment_0"


    // $ANTLR start "rule__Attributes__ValueAssignment_1_1_0"
    // InternalTexDsl.g:1111:1: rule__Attributes__ValueAssignment_1_1_0 : ( ruleID_Token ) ;
    public final void rule__Attributes__ValueAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1115:1: ( ( ruleID_Token ) )
            // InternalTexDsl.g:1116:2: ( ruleID_Token )
            {
            // InternalTexDsl.g:1116:2: ( ruleID_Token )
            // InternalTexDsl.g:1117:3: ruleID_Token
            {
             before(grammarAccess.getAttributesAccess().getValueID_TokenParserRuleCall_1_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleID_Token();

            state._fsp--;

             after(grammarAccess.getAttributesAccess().getValueID_TokenParserRuleCall_1_1_0_0()); 

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
    // $ANTLR end "rule__Attributes__ValueAssignment_1_1_0"


    // $ANTLR start "rule__Attributes__MultiValueAssignment_1_1_1_1"
    // InternalTexDsl.g:1126:1: rule__Attributes__MultiValueAssignment_1_1_1_1 : ( ruleID_Token ) ;
    public final void rule__Attributes__MultiValueAssignment_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1130:1: ( ( ruleID_Token ) )
            // InternalTexDsl.g:1131:2: ( ruleID_Token )
            {
            // InternalTexDsl.g:1131:2: ( ruleID_Token )
            // InternalTexDsl.g:1132:3: ruleID_Token
            {
             before(grammarAccess.getAttributesAccess().getMultiValueID_TokenParserRuleCall_1_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleID_Token();

            state._fsp--;

             after(grammarAccess.getAttributesAccess().getMultiValueID_TokenParserRuleCall_1_1_1_1_0()); 

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
    // $ANTLR end "rule__Attributes__MultiValueAssignment_1_1_1_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002022L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000430L});

}