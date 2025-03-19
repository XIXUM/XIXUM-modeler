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
public class InternalTexDslParser extends AbstractInternalContentAssistParser {
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

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_SYMBOL)||(LA1_0>=11 && LA1_0<=12)||LA1_0==14||(LA1_0>=16 && LA1_0<=17)) ) {
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


    // $ANTLR start "entryRuleArgumentContent"
    // InternalTexDsl.g:179:1: entryRuleArgumentContent : ruleArgumentContent EOF ;
    public final void entryRuleArgumentContent() throws RecognitionException {
        try {
            // InternalTexDsl.g:180:1: ( ruleArgumentContent EOF )
            // InternalTexDsl.g:181:1: ruleArgumentContent EOF
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
    // InternalTexDsl.g:188:1: ruleArgumentContent : ( ( rule__ArgumentContent__Alternatives ) ) ;
    public final void ruleArgumentContent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:192:2: ( ( ( rule__ArgumentContent__Alternatives ) ) )
            // InternalTexDsl.g:193:2: ( ( rule__ArgumentContent__Alternatives ) )
            {
            // InternalTexDsl.g:193:2: ( ( rule__ArgumentContent__Alternatives ) )
            // InternalTexDsl.g:194:3: ( rule__ArgumentContent__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArgumentContentAccess().getAlternatives()); 
            }
            // InternalTexDsl.g:195:3: ( rule__ArgumentContent__Alternatives )
            // InternalTexDsl.g:195:4: rule__ArgumentContent__Alternatives
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
    // InternalTexDsl.g:204:1: entryRuleTextContainer : ruleTextContainer EOF ;
    public final void entryRuleTextContainer() throws RecognitionException {
        try {
            // InternalTexDsl.g:205:1: ( ruleTextContainer EOF )
            // InternalTexDsl.g:206:1: ruleTextContainer EOF
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
    // InternalTexDsl.g:213:1: ruleTextContainer : ( ( ( rule__TextContainer__TextAssignment ) ) ( ( rule__TextContainer__TextAssignment )* ) ) ;
    public final void ruleTextContainer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:217:2: ( ( ( ( rule__TextContainer__TextAssignment ) ) ( ( rule__TextContainer__TextAssignment )* ) ) )
            // InternalTexDsl.g:218:2: ( ( ( rule__TextContainer__TextAssignment ) ) ( ( rule__TextContainer__TextAssignment )* ) )
            {
            // InternalTexDsl.g:218:2: ( ( ( rule__TextContainer__TextAssignment ) ) ( ( rule__TextContainer__TextAssignment )* ) )
            // InternalTexDsl.g:219:3: ( ( rule__TextContainer__TextAssignment ) ) ( ( rule__TextContainer__TextAssignment )* )
            {
            // InternalTexDsl.g:219:3: ( ( rule__TextContainer__TextAssignment ) )
            // InternalTexDsl.g:220:4: ( rule__TextContainer__TextAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextContainerAccess().getTextAssignment()); 
            }
            // InternalTexDsl.g:221:4: ( rule__TextContainer__TextAssignment )
            // InternalTexDsl.g:221:5: rule__TextContainer__TextAssignment
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

            // InternalTexDsl.g:224:3: ( ( rule__TextContainer__TextAssignment )* )
            // InternalTexDsl.g:225:4: ( rule__TextContainer__TextAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextContainerAccess().getTextAssignment()); 
            }
            // InternalTexDsl.g:226:4: ( rule__TextContainer__TextAssignment )*
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
            	    // InternalTexDsl.g:226:5: rule__TextContainer__TextAssignment
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
    // InternalTexDsl.g:236:1: entryRuleTextContent : ruleTextContent EOF ;
    public final void entryRuleTextContent() throws RecognitionException {
        try {
            // InternalTexDsl.g:237:1: ( ruleTextContent EOF )
            // InternalTexDsl.g:238:1: ruleTextContent EOF
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
    // InternalTexDsl.g:245:1: ruleTextContent : ( ( rule__TextContent__Alternatives ) ) ;
    public final void ruleTextContent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:249:2: ( ( ( rule__TextContent__Alternatives ) ) )
            // InternalTexDsl.g:250:2: ( ( rule__TextContent__Alternatives ) )
            {
            // InternalTexDsl.g:250:2: ( ( rule__TextContent__Alternatives ) )
            // InternalTexDsl.g:251:3: ( rule__TextContent__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextContentAccess().getAlternatives()); 
            }
            // InternalTexDsl.g:252:3: ( rule__TextContent__Alternatives )
            // InternalTexDsl.g:252:4: rule__TextContent__Alternatives
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
    // InternalTexDsl.g:261:1: entryRuleIdentifiers : ruleIdentifiers EOF ;
    public final void entryRuleIdentifiers() throws RecognitionException {
        try {
            // InternalTexDsl.g:262:1: ( ruleIdentifiers EOF )
            // InternalTexDsl.g:263:1: ruleIdentifiers EOF
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
    // InternalTexDsl.g:270:1: ruleIdentifiers : ( ( rule__Identifiers__IdAssignment ) ) ;
    public final void ruleIdentifiers() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:274:2: ( ( ( rule__Identifiers__IdAssignment ) ) )
            // InternalTexDsl.g:275:2: ( ( rule__Identifiers__IdAssignment ) )
            {
            // InternalTexDsl.g:275:2: ( ( rule__Identifiers__IdAssignment ) )
            // InternalTexDsl.g:276:3: ( rule__Identifiers__IdAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifiersAccess().getIdAssignment()); 
            }
            // InternalTexDsl.g:277:3: ( rule__Identifiers__IdAssignment )
            // InternalTexDsl.g:277:4: rule__Identifiers__IdAssignment
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
    // InternalTexDsl.g:286:1: entryRuleNumbers : ruleNumbers EOF ;
    public final void entryRuleNumbers() throws RecognitionException {
        try {
            // InternalTexDsl.g:287:1: ( ruleNumbers EOF )
            // InternalTexDsl.g:288:1: ruleNumbers EOF
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
    // InternalTexDsl.g:295:1: ruleNumbers : ( ( rule__Numbers__NumAssignment ) ) ;
    public final void ruleNumbers() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:299:2: ( ( ( rule__Numbers__NumAssignment ) ) )
            // InternalTexDsl.g:300:2: ( ( rule__Numbers__NumAssignment ) )
            {
            // InternalTexDsl.g:300:2: ( ( rule__Numbers__NumAssignment ) )
            // InternalTexDsl.g:301:3: ( rule__Numbers__NumAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumbersAccess().getNumAssignment()); 
            }
            // InternalTexDsl.g:302:3: ( rule__Numbers__NumAssignment )
            // InternalTexDsl.g:302:4: rule__Numbers__NumAssignment
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
    // InternalTexDsl.g:311:1: entryRuleOperators : ruleOperators EOF ;
    public final void entryRuleOperators() throws RecognitionException {
        try {
            // InternalTexDsl.g:312:1: ( ruleOperators EOF )
            // InternalTexDsl.g:313:1: ruleOperators EOF
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
    // InternalTexDsl.g:320:1: ruleOperators : ( ( ( rule__Operators__OpAssignment ) ) ( ( rule__Operators__OpAssignment )* ) ) ;
    public final void ruleOperators() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:324:2: ( ( ( ( rule__Operators__OpAssignment ) ) ( ( rule__Operators__OpAssignment )* ) ) )
            // InternalTexDsl.g:325:2: ( ( ( rule__Operators__OpAssignment ) ) ( ( rule__Operators__OpAssignment )* ) )
            {
            // InternalTexDsl.g:325:2: ( ( ( rule__Operators__OpAssignment ) ) ( ( rule__Operators__OpAssignment )* ) )
            // InternalTexDsl.g:326:3: ( ( rule__Operators__OpAssignment ) ) ( ( rule__Operators__OpAssignment )* )
            {
            // InternalTexDsl.g:326:3: ( ( rule__Operators__OpAssignment ) )
            // InternalTexDsl.g:327:4: ( rule__Operators__OpAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorsAccess().getOpAssignment()); 
            }
            // InternalTexDsl.g:328:4: ( rule__Operators__OpAssignment )
            // InternalTexDsl.g:328:5: rule__Operators__OpAssignment
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

            // InternalTexDsl.g:331:3: ( ( rule__Operators__OpAssignment )* )
            // InternalTexDsl.g:332:4: ( rule__Operators__OpAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorsAccess().getOpAssignment()); 
            }
            // InternalTexDsl.g:333:4: ( rule__Operators__OpAssignment )*
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
            	    // InternalTexDsl.g:333:5: rule__Operators__OpAssignment
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
    // InternalTexDsl.g:343:1: entryRuleMathExpression : ruleMathExpression EOF ;
    public final void entryRuleMathExpression() throws RecognitionException {
        try {
            // InternalTexDsl.g:344:1: ( ruleMathExpression EOF )
            // InternalTexDsl.g:345:1: ruleMathExpression EOF
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
    // InternalTexDsl.g:352:1: ruleMathExpression : ( ( rule__MathExpression__Alternatives ) ) ;
    public final void ruleMathExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:356:2: ( ( ( rule__MathExpression__Alternatives ) ) )
            // InternalTexDsl.g:357:2: ( ( rule__MathExpression__Alternatives ) )
            {
            // InternalTexDsl.g:357:2: ( ( rule__MathExpression__Alternatives ) )
            // InternalTexDsl.g:358:3: ( rule__MathExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMathExpressionAccess().getAlternatives()); 
            }
            // InternalTexDsl.g:359:3: ( rule__MathExpression__Alternatives )
            // InternalTexDsl.g:359:4: rule__MathExpression__Alternatives
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
    // InternalTexDsl.g:368:1: entryRuleInlineMath : ruleInlineMath EOF ;
    public final void entryRuleInlineMath() throws RecognitionException {
        try {
            // InternalTexDsl.g:369:1: ( ruleInlineMath EOF )
            // InternalTexDsl.g:370:1: ruleInlineMath EOF
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
    // InternalTexDsl.g:377:1: ruleInlineMath : ( ( rule__InlineMath__Group__0 ) ) ;
    public final void ruleInlineMath() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:381:2: ( ( ( rule__InlineMath__Group__0 ) ) )
            // InternalTexDsl.g:382:2: ( ( rule__InlineMath__Group__0 ) )
            {
            // InternalTexDsl.g:382:2: ( ( rule__InlineMath__Group__0 ) )
            // InternalTexDsl.g:383:3: ( rule__InlineMath__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInlineMathAccess().getGroup()); 
            }
            // InternalTexDsl.g:384:3: ( rule__InlineMath__Group__0 )
            // InternalTexDsl.g:384:4: rule__InlineMath__Group__0
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
    // InternalTexDsl.g:393:1: entryRuleDisplayMath : ruleDisplayMath EOF ;
    public final void entryRuleDisplayMath() throws RecognitionException {
        try {
            // InternalTexDsl.g:394:1: ( ruleDisplayMath EOF )
            // InternalTexDsl.g:395:1: ruleDisplayMath EOF
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
    // InternalTexDsl.g:402:1: ruleDisplayMath : ( ( rule__DisplayMath__Group__0 ) ) ;
    public final void ruleDisplayMath() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:406:2: ( ( ( rule__DisplayMath__Group__0 ) ) )
            // InternalTexDsl.g:407:2: ( ( rule__DisplayMath__Group__0 ) )
            {
            // InternalTexDsl.g:407:2: ( ( rule__DisplayMath__Group__0 ) )
            // InternalTexDsl.g:408:3: ( rule__DisplayMath__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisplayMathAccess().getGroup()); 
            }
            // InternalTexDsl.g:409:3: ( rule__DisplayMath__Group__0 )
            // InternalTexDsl.g:409:4: rule__DisplayMath__Group__0
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
    // InternalTexDsl.g:418:1: entryRuleMathContent : ruleMathContent EOF ;
    public final void entryRuleMathContent() throws RecognitionException {
        try {
            // InternalTexDsl.g:419:1: ( ruleMathContent EOF )
            // InternalTexDsl.g:420:1: ruleMathContent EOF
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
    // InternalTexDsl.g:427:1: ruleMathContent : ( ( rule__MathContent__Alternatives ) ) ;
    public final void ruleMathContent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:431:2: ( ( ( rule__MathContent__Alternatives ) ) )
            // InternalTexDsl.g:432:2: ( ( rule__MathContent__Alternatives ) )
            {
            // InternalTexDsl.g:432:2: ( ( rule__MathContent__Alternatives ) )
            // InternalTexDsl.g:433:3: ( rule__MathContent__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMathContentAccess().getAlternatives()); 
            }
            // InternalTexDsl.g:434:3: ( rule__MathContent__Alternatives )
            // InternalTexDsl.g:434:4: rule__MathContent__Alternatives
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
    // InternalTexDsl.g:442:1: rule__Element__Alternatives : ( ( ruleCommand ) | ( ruleTextContent ) | ( ruleMathExpression ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:446:1: ( ( ruleCommand ) | ( ruleTextContent ) | ( ruleMathExpression ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case RULE_ID:
            case RULE_TEXT:
            case RULE_NUMBER:
            case RULE_SYMBOL:
            case 12:
            case 14:
                {
                alt4=2;
                }
                break;
            case 16:
            case 17:
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
                    // InternalTexDsl.g:447:2: ( ruleCommand )
                    {
                    // InternalTexDsl.g:447:2: ( ruleCommand )
                    // InternalTexDsl.g:448:3: ruleCommand
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
                    // InternalTexDsl.g:453:2: ( ruleTextContent )
                    {
                    // InternalTexDsl.g:453:2: ( ruleTextContent )
                    // InternalTexDsl.g:454:3: ruleTextContent
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
                    // InternalTexDsl.g:459:2: ( ruleMathExpression )
                    {
                    // InternalTexDsl.g:459:2: ( ruleMathExpression )
                    // InternalTexDsl.g:460:3: ruleMathExpression
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
    // InternalTexDsl.g:469:1: rule__ArgumentContent__Alternatives : ( ( ruleTextContent ) | ( ruleCommand ) | ( ruleMathExpression ) );
    public final void rule__ArgumentContent__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:473:1: ( ( ruleTextContent ) | ( ruleCommand ) | ( ruleMathExpression ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_TEXT:
            case RULE_NUMBER:
            case RULE_SYMBOL:
            case 12:
            case 14:
                {
                alt5=1;
                }
                break;
            case 11:
                {
                alt5=2;
                }
                break;
            case 16:
            case 17:
                {
                alt5=3;
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
                    // InternalTexDsl.g:474:2: ( ruleTextContent )
                    {
                    // InternalTexDsl.g:474:2: ( ruleTextContent )
                    // InternalTexDsl.g:475:3: ruleTextContent
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
                    // InternalTexDsl.g:480:2: ( ruleCommand )
                    {
                    // InternalTexDsl.g:480:2: ( ruleCommand )
                    // InternalTexDsl.g:481:3: ruleCommand
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
                    // InternalTexDsl.g:486:2: ( ruleMathExpression )
                    {
                    // InternalTexDsl.g:486:2: ( ruleMathExpression )
                    // InternalTexDsl.g:487:3: ruleMathExpression
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
    // InternalTexDsl.g:496:1: rule__TextContent__Alternatives : ( ( ruleIdentifiers ) | ( ruleTextContainer ) | ( ruleOperators ) | ( ruleNumbers ) | ( ruleOptionalArgument ) | ( ruleMandatoryArgument ) );
    public final void rule__TextContent__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:500:1: ( ( ruleIdentifiers ) | ( ruleTextContainer ) | ( ruleOperators ) | ( ruleNumbers ) | ( ruleOptionalArgument ) | ( ruleMandatoryArgument ) )
            int alt6=6;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt6=1;
                }
                break;
            case RULE_TEXT:
                {
                alt6=2;
                }
                break;
            case RULE_SYMBOL:
                {
                alt6=3;
                }
                break;
            case RULE_NUMBER:
                {
                alt6=4;
                }
                break;
            case 12:
                {
                alt6=5;
                }
                break;
            case 14:
                {
                alt6=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalTexDsl.g:501:2: ( ruleIdentifiers )
                    {
                    // InternalTexDsl.g:501:2: ( ruleIdentifiers )
                    // InternalTexDsl.g:502:3: ruleIdentifiers
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
                    // InternalTexDsl.g:507:2: ( ruleTextContainer )
                    {
                    // InternalTexDsl.g:507:2: ( ruleTextContainer )
                    // InternalTexDsl.g:508:3: ruleTextContainer
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
                    // InternalTexDsl.g:513:2: ( ruleOperators )
                    {
                    // InternalTexDsl.g:513:2: ( ruleOperators )
                    // InternalTexDsl.g:514:3: ruleOperators
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
                    // InternalTexDsl.g:519:2: ( ruleNumbers )
                    {
                    // InternalTexDsl.g:519:2: ( ruleNumbers )
                    // InternalTexDsl.g:520:3: ruleNumbers
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
                    // InternalTexDsl.g:525:2: ( ruleOptionalArgument )
                    {
                    // InternalTexDsl.g:525:2: ( ruleOptionalArgument )
                    // InternalTexDsl.g:526:3: ruleOptionalArgument
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
                    // InternalTexDsl.g:531:2: ( ruleMandatoryArgument )
                    {
                    // InternalTexDsl.g:531:2: ( ruleMandatoryArgument )
                    // InternalTexDsl.g:532:3: ruleMandatoryArgument
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
    // InternalTexDsl.g:541:1: rule__MathExpression__Alternatives : ( ( ruleInlineMath ) | ( ruleDisplayMath ) );
    public final void rule__MathExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:545:1: ( ( ruleInlineMath ) | ( ruleDisplayMath ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            else if ( (LA7_0==17) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalTexDsl.g:546:2: ( ruleInlineMath )
                    {
                    // InternalTexDsl.g:546:2: ( ruleInlineMath )
                    // InternalTexDsl.g:547:3: ruleInlineMath
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
                    // InternalTexDsl.g:552:2: ( ruleDisplayMath )
                    {
                    // InternalTexDsl.g:552:2: ( ruleDisplayMath )
                    // InternalTexDsl.g:553:3: ruleDisplayMath
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
    // InternalTexDsl.g:562:1: rule__MathContent__Alternatives : ( ( ruleCommand ) | ( ruleTextContent ) | ( ruleNumbers ) | ( ruleOperators ) );
    public final void rule__MathContent__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:566:1: ( ( ruleCommand ) | ( ruleTextContent ) | ( ruleNumbers ) | ( ruleOperators ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt8=1;
                }
                break;
            case RULE_ID:
            case RULE_TEXT:
            case 12:
            case 14:
                {
                alt8=2;
                }
                break;
            case RULE_SYMBOL:
                {
                int LA8_3 = input.LA(2);

                if ( (synpred15_InternalTexDsl()) ) {
                    alt8=2;
                }
                else if ( (true) ) {
                    alt8=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_NUMBER:
                {
                int LA8_4 = input.LA(2);

                if ( (synpred15_InternalTexDsl()) ) {
                    alt8=2;
                }
                else if ( (synpred16_InternalTexDsl()) ) {
                    alt8=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 4, input);

                    throw nvae;
                }
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
                    // InternalTexDsl.g:567:2: ( ruleCommand )
                    {
                    // InternalTexDsl.g:567:2: ( ruleCommand )
                    // InternalTexDsl.g:568:3: ruleCommand
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
                    // InternalTexDsl.g:573:2: ( ruleTextContent )
                    {
                    // InternalTexDsl.g:573:2: ( ruleTextContent )
                    // InternalTexDsl.g:574:3: ruleTextContent
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
                    // InternalTexDsl.g:579:2: ( ruleNumbers )
                    {
                    // InternalTexDsl.g:579:2: ( ruleNumbers )
                    // InternalTexDsl.g:580:3: ruleNumbers
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
                    // InternalTexDsl.g:585:2: ( ruleOperators )
                    {
                    // InternalTexDsl.g:585:2: ( ruleOperators )
                    // InternalTexDsl.g:586:3: ruleOperators
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
    // InternalTexDsl.g:595:1: rule__Command__Group__0 : rule__Command__Group__0__Impl rule__Command__Group__1 ;
    public final void rule__Command__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:599:1: ( rule__Command__Group__0__Impl rule__Command__Group__1 )
            // InternalTexDsl.g:600:2: rule__Command__Group__0__Impl rule__Command__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_6);
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
    // InternalTexDsl.g:607:1: rule__Command__Group__0__Impl : ( '\\\\' ) ;
    public final void rule__Command__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:611:1: ( ( '\\\\' ) )
            // InternalTexDsl.g:612:1: ( '\\\\' )
            {
            // InternalTexDsl.g:612:1: ( '\\\\' )
            // InternalTexDsl.g:613:2: '\\\\'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getBackslashKeyword_0()); 
            }
            match(input,11,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalTexDsl.g:622:1: rule__Command__Group__1 : rule__Command__Group__1__Impl rule__Command__Group__2 ;
    public final void rule__Command__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:626:1: ( rule__Command__Group__1__Impl rule__Command__Group__2 )
            // InternalTexDsl.g:627:2: rule__Command__Group__1__Impl rule__Command__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_7);
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
    // InternalTexDsl.g:634:1: rule__Command__Group__1__Impl : ( ( rule__Command__CommandAssignment_1 ) ) ;
    public final void rule__Command__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:638:1: ( ( ( rule__Command__CommandAssignment_1 ) ) )
            // InternalTexDsl.g:639:1: ( ( rule__Command__CommandAssignment_1 ) )
            {
            // InternalTexDsl.g:639:1: ( ( rule__Command__CommandAssignment_1 ) )
            // InternalTexDsl.g:640:2: ( rule__Command__CommandAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getCommandAssignment_1()); 
            }
            // InternalTexDsl.g:641:2: ( rule__Command__CommandAssignment_1 )
            // InternalTexDsl.g:641:3: rule__Command__CommandAssignment_1
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
    // InternalTexDsl.g:649:1: rule__Command__Group__2 : rule__Command__Group__2__Impl rule__Command__Group__3 ;
    public final void rule__Command__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:653:1: ( rule__Command__Group__2__Impl rule__Command__Group__3 )
            // InternalTexDsl.g:654:2: rule__Command__Group__2__Impl rule__Command__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_7);
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
    // InternalTexDsl.g:661:1: rule__Command__Group__2__Impl : ( ( rule__Command__OptionalArgsAssignment_2 )* ) ;
    public final void rule__Command__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:665:1: ( ( ( rule__Command__OptionalArgsAssignment_2 )* ) )
            // InternalTexDsl.g:666:1: ( ( rule__Command__OptionalArgsAssignment_2 )* )
            {
            // InternalTexDsl.g:666:1: ( ( rule__Command__OptionalArgsAssignment_2 )* )
            // InternalTexDsl.g:667:2: ( rule__Command__OptionalArgsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getOptionalArgsAssignment_2()); 
            }
            // InternalTexDsl.g:668:2: ( rule__Command__OptionalArgsAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                alt9 = dfa9.predict(input);
                switch (alt9) {
            	case 1 :
            	    // InternalTexDsl.g:668:3: rule__Command__OptionalArgsAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_8);
            	    rule__Command__OptionalArgsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalTexDsl.g:676:1: rule__Command__Group__3 : rule__Command__Group__3__Impl ;
    public final void rule__Command__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:680:1: ( rule__Command__Group__3__Impl )
            // InternalTexDsl.g:681:2: rule__Command__Group__3__Impl
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
    // InternalTexDsl.g:687:1: rule__Command__Group__3__Impl : ( ( rule__Command__MandatoryArgsAssignment_3 )* ) ;
    public final void rule__Command__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:691:1: ( ( ( rule__Command__MandatoryArgsAssignment_3 )* ) )
            // InternalTexDsl.g:692:1: ( ( rule__Command__MandatoryArgsAssignment_3 )* )
            {
            // InternalTexDsl.g:692:1: ( ( rule__Command__MandatoryArgsAssignment_3 )* )
            // InternalTexDsl.g:693:2: ( rule__Command__MandatoryArgsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getMandatoryArgsAssignment_3()); 
            }
            // InternalTexDsl.g:694:2: ( rule__Command__MandatoryArgsAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                alt10 = dfa10.predict(input);
                switch (alt10) {
            	case 1 :
            	    // InternalTexDsl.g:694:3: rule__Command__MandatoryArgsAssignment_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_9);
            	    rule__Command__MandatoryArgsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalTexDsl.g:703:1: rule__OptionalArgument__Group__0 : rule__OptionalArgument__Group__0__Impl rule__OptionalArgument__Group__1 ;
    public final void rule__OptionalArgument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:707:1: ( rule__OptionalArgument__Group__0__Impl rule__OptionalArgument__Group__1 )
            // InternalTexDsl.g:708:2: rule__OptionalArgument__Group__0__Impl rule__OptionalArgument__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_10);
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
    // InternalTexDsl.g:715:1: rule__OptionalArgument__Group__0__Impl : ( () ) ;
    public final void rule__OptionalArgument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:719:1: ( ( () ) )
            // InternalTexDsl.g:720:1: ( () )
            {
            // InternalTexDsl.g:720:1: ( () )
            // InternalTexDsl.g:721:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionalArgumentAccess().getOptionalArgumentAction_0()); 
            }
            // InternalTexDsl.g:722:2: ()
            // InternalTexDsl.g:722:3: 
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
    // InternalTexDsl.g:730:1: rule__OptionalArgument__Group__1 : rule__OptionalArgument__Group__1__Impl rule__OptionalArgument__Group__2 ;
    public final void rule__OptionalArgument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:734:1: ( rule__OptionalArgument__Group__1__Impl rule__OptionalArgument__Group__2 )
            // InternalTexDsl.g:735:2: rule__OptionalArgument__Group__1__Impl rule__OptionalArgument__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_11);
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
    // InternalTexDsl.g:742:1: rule__OptionalArgument__Group__1__Impl : ( '[' ) ;
    public final void rule__OptionalArgument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:746:1: ( ( '[' ) )
            // InternalTexDsl.g:747:1: ( '[' )
            {
            // InternalTexDsl.g:747:1: ( '[' )
            // InternalTexDsl.g:748:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionalArgumentAccess().getLeftSquareBracketKeyword_1()); 
            }
            match(input,12,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOptionalArgumentAccess().getLeftSquareBracketKeyword_1()); 
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
    // InternalTexDsl.g:757:1: rule__OptionalArgument__Group__2 : rule__OptionalArgument__Group__2__Impl rule__OptionalArgument__Group__3 ;
    public final void rule__OptionalArgument__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:761:1: ( rule__OptionalArgument__Group__2__Impl rule__OptionalArgument__Group__3 )
            // InternalTexDsl.g:762:2: rule__OptionalArgument__Group__2__Impl rule__OptionalArgument__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_11);
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
    // InternalTexDsl.g:769:1: rule__OptionalArgument__Group__2__Impl : ( ( rule__OptionalArgument__ContentAssignment_2 )* ) ;
    public final void rule__OptionalArgument__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:773:1: ( ( ( rule__OptionalArgument__ContentAssignment_2 )* ) )
            // InternalTexDsl.g:774:1: ( ( rule__OptionalArgument__ContentAssignment_2 )* )
            {
            // InternalTexDsl.g:774:1: ( ( rule__OptionalArgument__ContentAssignment_2 )* )
            // InternalTexDsl.g:775:2: ( rule__OptionalArgument__ContentAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionalArgumentAccess().getContentAssignment_2()); 
            }
            // InternalTexDsl.g:776:2: ( rule__OptionalArgument__ContentAssignment_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_SYMBOL)||(LA11_0>=11 && LA11_0<=12)||LA11_0==14||(LA11_0>=16 && LA11_0<=17)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalTexDsl.g:776:3: rule__OptionalArgument__ContentAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_3);
            	    rule__OptionalArgument__ContentAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalTexDsl.g:784:1: rule__OptionalArgument__Group__3 : rule__OptionalArgument__Group__3__Impl ;
    public final void rule__OptionalArgument__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:788:1: ( rule__OptionalArgument__Group__3__Impl )
            // InternalTexDsl.g:789:2: rule__OptionalArgument__Group__3__Impl
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
    // InternalTexDsl.g:795:1: rule__OptionalArgument__Group__3__Impl : ( ']' ) ;
    public final void rule__OptionalArgument__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:799:1: ( ( ']' ) )
            // InternalTexDsl.g:800:1: ( ']' )
            {
            // InternalTexDsl.g:800:1: ( ']' )
            // InternalTexDsl.g:801:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionalArgumentAccess().getRightSquareBracketKeyword_3()); 
            }
            match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOptionalArgumentAccess().getRightSquareBracketKeyword_3()); 
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
    // InternalTexDsl.g:811:1: rule__MandatoryArgument__Group__0 : rule__MandatoryArgument__Group__0__Impl rule__MandatoryArgument__Group__1 ;
    public final void rule__MandatoryArgument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:815:1: ( rule__MandatoryArgument__Group__0__Impl rule__MandatoryArgument__Group__1 )
            // InternalTexDsl.g:816:2: rule__MandatoryArgument__Group__0__Impl rule__MandatoryArgument__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
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
    // InternalTexDsl.g:823:1: rule__MandatoryArgument__Group__0__Impl : ( () ) ;
    public final void rule__MandatoryArgument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:827:1: ( ( () ) )
            // InternalTexDsl.g:828:1: ( () )
            {
            // InternalTexDsl.g:828:1: ( () )
            // InternalTexDsl.g:829:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMandatoryArgumentAccess().getMandatoryArgumentAction_0()); 
            }
            // InternalTexDsl.g:830:2: ()
            // InternalTexDsl.g:830:3: 
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
    // InternalTexDsl.g:838:1: rule__MandatoryArgument__Group__1 : rule__MandatoryArgument__Group__1__Impl rule__MandatoryArgument__Group__2 ;
    public final void rule__MandatoryArgument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:842:1: ( rule__MandatoryArgument__Group__1__Impl rule__MandatoryArgument__Group__2 )
            // InternalTexDsl.g:843:2: rule__MandatoryArgument__Group__1__Impl rule__MandatoryArgument__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_12);
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
    // InternalTexDsl.g:850:1: rule__MandatoryArgument__Group__1__Impl : ( '{' ) ;
    public final void rule__MandatoryArgument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:854:1: ( ( '{' ) )
            // InternalTexDsl.g:855:1: ( '{' )
            {
            // InternalTexDsl.g:855:1: ( '{' )
            // InternalTexDsl.g:856:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMandatoryArgumentAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMandatoryArgumentAccess().getLeftCurlyBracketKeyword_1()); 
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
    // InternalTexDsl.g:865:1: rule__MandatoryArgument__Group__2 : rule__MandatoryArgument__Group__2__Impl rule__MandatoryArgument__Group__3 ;
    public final void rule__MandatoryArgument__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:869:1: ( rule__MandatoryArgument__Group__2__Impl rule__MandatoryArgument__Group__3 )
            // InternalTexDsl.g:870:2: rule__MandatoryArgument__Group__2__Impl rule__MandatoryArgument__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_12);
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
    // InternalTexDsl.g:877:1: rule__MandatoryArgument__Group__2__Impl : ( ( rule__MandatoryArgument__ContentAssignment_2 )* ) ;
    public final void rule__MandatoryArgument__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:881:1: ( ( ( rule__MandatoryArgument__ContentAssignment_2 )* ) )
            // InternalTexDsl.g:882:1: ( ( rule__MandatoryArgument__ContentAssignment_2 )* )
            {
            // InternalTexDsl.g:882:1: ( ( rule__MandatoryArgument__ContentAssignment_2 )* )
            // InternalTexDsl.g:883:2: ( rule__MandatoryArgument__ContentAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMandatoryArgumentAccess().getContentAssignment_2()); 
            }
            // InternalTexDsl.g:884:2: ( rule__MandatoryArgument__ContentAssignment_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_SYMBOL)||(LA12_0>=11 && LA12_0<=12)||LA12_0==14||(LA12_0>=16 && LA12_0<=17)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalTexDsl.g:884:3: rule__MandatoryArgument__ContentAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_3);
            	    rule__MandatoryArgument__ContentAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalTexDsl.g:892:1: rule__MandatoryArgument__Group__3 : rule__MandatoryArgument__Group__3__Impl ;
    public final void rule__MandatoryArgument__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:896:1: ( rule__MandatoryArgument__Group__3__Impl )
            // InternalTexDsl.g:897:2: rule__MandatoryArgument__Group__3__Impl
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
    // InternalTexDsl.g:903:1: rule__MandatoryArgument__Group__3__Impl : ( '}' ) ;
    public final void rule__MandatoryArgument__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:907:1: ( ( '}' ) )
            // InternalTexDsl.g:908:1: ( '}' )
            {
            // InternalTexDsl.g:908:1: ( '}' )
            // InternalTexDsl.g:909:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMandatoryArgumentAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,15,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMandatoryArgumentAccess().getRightCurlyBracketKeyword_3()); 
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


    // $ANTLR start "rule__InlineMath__Group__0"
    // InternalTexDsl.g:919:1: rule__InlineMath__Group__0 : rule__InlineMath__Group__0__Impl rule__InlineMath__Group__1 ;
    public final void rule__InlineMath__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:923:1: ( rule__InlineMath__Group__0__Impl rule__InlineMath__Group__1 )
            // InternalTexDsl.g:924:2: rule__InlineMath__Group__0__Impl rule__InlineMath__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_13);
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
    // InternalTexDsl.g:931:1: rule__InlineMath__Group__0__Impl : ( () ) ;
    public final void rule__InlineMath__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:935:1: ( ( () ) )
            // InternalTexDsl.g:936:1: ( () )
            {
            // InternalTexDsl.g:936:1: ( () )
            // InternalTexDsl.g:937:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInlineMathAccess().getInlineMathAction_0()); 
            }
            // InternalTexDsl.g:938:2: ()
            // InternalTexDsl.g:938:3: 
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
    // InternalTexDsl.g:946:1: rule__InlineMath__Group__1 : rule__InlineMath__Group__1__Impl rule__InlineMath__Group__2 ;
    public final void rule__InlineMath__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:950:1: ( rule__InlineMath__Group__1__Impl rule__InlineMath__Group__2 )
            // InternalTexDsl.g:951:2: rule__InlineMath__Group__1__Impl rule__InlineMath__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_14);
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
    // InternalTexDsl.g:958:1: rule__InlineMath__Group__1__Impl : ( '$' ) ;
    public final void rule__InlineMath__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:962:1: ( ( '$' ) )
            // InternalTexDsl.g:963:1: ( '$' )
            {
            // InternalTexDsl.g:963:1: ( '$' )
            // InternalTexDsl.g:964:2: '$'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInlineMathAccess().getDollarSignKeyword_1()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalTexDsl.g:973:1: rule__InlineMath__Group__2 : rule__InlineMath__Group__2__Impl rule__InlineMath__Group__3 ;
    public final void rule__InlineMath__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:977:1: ( rule__InlineMath__Group__2__Impl rule__InlineMath__Group__3 )
            // InternalTexDsl.g:978:2: rule__InlineMath__Group__2__Impl rule__InlineMath__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_14);
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
    // InternalTexDsl.g:985:1: rule__InlineMath__Group__2__Impl : ( ( rule__InlineMath__ContentAssignment_2 )* ) ;
    public final void rule__InlineMath__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:989:1: ( ( ( rule__InlineMath__ContentAssignment_2 )* ) )
            // InternalTexDsl.g:990:1: ( ( rule__InlineMath__ContentAssignment_2 )* )
            {
            // InternalTexDsl.g:990:1: ( ( rule__InlineMath__ContentAssignment_2 )* )
            // InternalTexDsl.g:991:2: ( rule__InlineMath__ContentAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInlineMathAccess().getContentAssignment_2()); 
            }
            // InternalTexDsl.g:992:2: ( rule__InlineMath__ContentAssignment_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_ID && LA13_0<=RULE_SYMBOL)||(LA13_0>=11 && LA13_0<=12)||LA13_0==14) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalTexDsl.g:992:3: rule__InlineMath__ContentAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_15);
            	    rule__InlineMath__ContentAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalTexDsl.g:1000:1: rule__InlineMath__Group__3 : rule__InlineMath__Group__3__Impl ;
    public final void rule__InlineMath__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1004:1: ( rule__InlineMath__Group__3__Impl )
            // InternalTexDsl.g:1005:2: rule__InlineMath__Group__3__Impl
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
    // InternalTexDsl.g:1011:1: rule__InlineMath__Group__3__Impl : ( '$' ) ;
    public final void rule__InlineMath__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1015:1: ( ( '$' ) )
            // InternalTexDsl.g:1016:1: ( '$' )
            {
            // InternalTexDsl.g:1016:1: ( '$' )
            // InternalTexDsl.g:1017:2: '$'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInlineMathAccess().getDollarSignKeyword_3()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalTexDsl.g:1027:1: rule__DisplayMath__Group__0 : rule__DisplayMath__Group__0__Impl rule__DisplayMath__Group__1 ;
    public final void rule__DisplayMath__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1031:1: ( rule__DisplayMath__Group__0__Impl rule__DisplayMath__Group__1 )
            // InternalTexDsl.g:1032:2: rule__DisplayMath__Group__0__Impl rule__DisplayMath__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_16);
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
    // InternalTexDsl.g:1039:1: rule__DisplayMath__Group__0__Impl : ( () ) ;
    public final void rule__DisplayMath__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1043:1: ( ( () ) )
            // InternalTexDsl.g:1044:1: ( () )
            {
            // InternalTexDsl.g:1044:1: ( () )
            // InternalTexDsl.g:1045:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisplayMathAccess().getDisplayMathAction_0()); 
            }
            // InternalTexDsl.g:1046:2: ()
            // InternalTexDsl.g:1046:3: 
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
    // InternalTexDsl.g:1054:1: rule__DisplayMath__Group__1 : rule__DisplayMath__Group__1__Impl rule__DisplayMath__Group__2 ;
    public final void rule__DisplayMath__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1058:1: ( rule__DisplayMath__Group__1__Impl rule__DisplayMath__Group__2 )
            // InternalTexDsl.g:1059:2: rule__DisplayMath__Group__1__Impl rule__DisplayMath__Group__2
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
    // InternalTexDsl.g:1066:1: rule__DisplayMath__Group__1__Impl : ( '$$' ) ;
    public final void rule__DisplayMath__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1070:1: ( ( '$$' ) )
            // InternalTexDsl.g:1071:1: ( '$$' )
            {
            // InternalTexDsl.g:1071:1: ( '$$' )
            // InternalTexDsl.g:1072:2: '$$'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisplayMathAccess().getDollarSignDollarSignKeyword_1()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalTexDsl.g:1081:1: rule__DisplayMath__Group__2 : rule__DisplayMath__Group__2__Impl rule__DisplayMath__Group__3 ;
    public final void rule__DisplayMath__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1085:1: ( rule__DisplayMath__Group__2__Impl rule__DisplayMath__Group__3 )
            // InternalTexDsl.g:1086:2: rule__DisplayMath__Group__2__Impl rule__DisplayMath__Group__3
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
    // InternalTexDsl.g:1093:1: rule__DisplayMath__Group__2__Impl : ( ( rule__DisplayMath__ContentAssignment_2 )* ) ;
    public final void rule__DisplayMath__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1097:1: ( ( ( rule__DisplayMath__ContentAssignment_2 )* ) )
            // InternalTexDsl.g:1098:1: ( ( rule__DisplayMath__ContentAssignment_2 )* )
            {
            // InternalTexDsl.g:1098:1: ( ( rule__DisplayMath__ContentAssignment_2 )* )
            // InternalTexDsl.g:1099:2: ( rule__DisplayMath__ContentAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisplayMathAccess().getContentAssignment_2()); 
            }
            // InternalTexDsl.g:1100:2: ( rule__DisplayMath__ContentAssignment_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_SYMBOL)||(LA14_0>=11 && LA14_0<=12)||LA14_0==14) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalTexDsl.g:1100:3: rule__DisplayMath__ContentAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_15);
            	    rule__DisplayMath__ContentAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalTexDsl.g:1108:1: rule__DisplayMath__Group__3 : rule__DisplayMath__Group__3__Impl ;
    public final void rule__DisplayMath__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1112:1: ( rule__DisplayMath__Group__3__Impl )
            // InternalTexDsl.g:1113:2: rule__DisplayMath__Group__3__Impl
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
    // InternalTexDsl.g:1119:1: rule__DisplayMath__Group__3__Impl : ( '$$' ) ;
    public final void rule__DisplayMath__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1123:1: ( ( '$$' ) )
            // InternalTexDsl.g:1124:1: ( '$$' )
            {
            // InternalTexDsl.g:1124:1: ( '$$' )
            // InternalTexDsl.g:1125:2: '$$'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisplayMathAccess().getDollarSignDollarSignKeyword_3()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalTexDsl.g:1135:1: rule__Model__ElementsAssignment : ( ruleElement ) ;
    public final void rule__Model__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1139:1: ( ( ruleElement ) )
            // InternalTexDsl.g:1140:2: ( ruleElement )
            {
            // InternalTexDsl.g:1140:2: ( ruleElement )
            // InternalTexDsl.g:1141:3: ruleElement
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
    // InternalTexDsl.g:1150:1: rule__Command__CommandAssignment_1 : ( RULE_ID ) ;
    public final void rule__Command__CommandAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1154:1: ( ( RULE_ID ) )
            // InternalTexDsl.g:1155:2: ( RULE_ID )
            {
            // InternalTexDsl.g:1155:2: ( RULE_ID )
            // InternalTexDsl.g:1156:3: RULE_ID
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
    // InternalTexDsl.g:1165:1: rule__Command__OptionalArgsAssignment_2 : ( ruleOptionalArgument ) ;
    public final void rule__Command__OptionalArgsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1169:1: ( ( ruleOptionalArgument ) )
            // InternalTexDsl.g:1170:2: ( ruleOptionalArgument )
            {
            // InternalTexDsl.g:1170:2: ( ruleOptionalArgument )
            // InternalTexDsl.g:1171:3: ruleOptionalArgument
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
    // InternalTexDsl.g:1180:1: rule__Command__MandatoryArgsAssignment_3 : ( ruleMandatoryArgument ) ;
    public final void rule__Command__MandatoryArgsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1184:1: ( ( ruleMandatoryArgument ) )
            // InternalTexDsl.g:1185:2: ( ruleMandatoryArgument )
            {
            // InternalTexDsl.g:1185:2: ( ruleMandatoryArgument )
            // InternalTexDsl.g:1186:3: ruleMandatoryArgument
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
    // InternalTexDsl.g:1195:1: rule__OptionalArgument__ContentAssignment_2 : ( ruleArgumentContent ) ;
    public final void rule__OptionalArgument__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1199:1: ( ( ruleArgumentContent ) )
            // InternalTexDsl.g:1200:2: ( ruleArgumentContent )
            {
            // InternalTexDsl.g:1200:2: ( ruleArgumentContent )
            // InternalTexDsl.g:1201:3: ruleArgumentContent
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
    // InternalTexDsl.g:1210:1: rule__MandatoryArgument__ContentAssignment_2 : ( ruleArgumentContent ) ;
    public final void rule__MandatoryArgument__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1214:1: ( ( ruleArgumentContent ) )
            // InternalTexDsl.g:1215:2: ( ruleArgumentContent )
            {
            // InternalTexDsl.g:1215:2: ( ruleArgumentContent )
            // InternalTexDsl.g:1216:3: ruleArgumentContent
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


    // $ANTLR start "rule__TextContainer__TextAssignment"
    // InternalTexDsl.g:1225:1: rule__TextContainer__TextAssignment : ( RULE_TEXT ) ;
    public final void rule__TextContainer__TextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1229:1: ( ( RULE_TEXT ) )
            // InternalTexDsl.g:1230:2: ( RULE_TEXT )
            {
            // InternalTexDsl.g:1230:2: ( RULE_TEXT )
            // InternalTexDsl.g:1231:3: RULE_TEXT
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
    // InternalTexDsl.g:1240:1: rule__Identifiers__IdAssignment : ( RULE_ID ) ;
    public final void rule__Identifiers__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1244:1: ( ( RULE_ID ) )
            // InternalTexDsl.g:1245:2: ( RULE_ID )
            {
            // InternalTexDsl.g:1245:2: ( RULE_ID )
            // InternalTexDsl.g:1246:3: RULE_ID
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
    // InternalTexDsl.g:1255:1: rule__Numbers__NumAssignment : ( RULE_NUMBER ) ;
    public final void rule__Numbers__NumAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1259:1: ( ( RULE_NUMBER ) )
            // InternalTexDsl.g:1260:2: ( RULE_NUMBER )
            {
            // InternalTexDsl.g:1260:2: ( RULE_NUMBER )
            // InternalTexDsl.g:1261:3: RULE_NUMBER
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
    // InternalTexDsl.g:1270:1: rule__Operators__OpAssignment : ( RULE_SYMBOL ) ;
    public final void rule__Operators__OpAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1274:1: ( ( RULE_SYMBOL ) )
            // InternalTexDsl.g:1275:2: ( RULE_SYMBOL )
            {
            // InternalTexDsl.g:1275:2: ( RULE_SYMBOL )
            // InternalTexDsl.g:1276:3: RULE_SYMBOL
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
    // InternalTexDsl.g:1285:1: rule__InlineMath__ContentAssignment_2 : ( ruleMathContent ) ;
    public final void rule__InlineMath__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1289:1: ( ( ruleMathContent ) )
            // InternalTexDsl.g:1290:2: ( ruleMathContent )
            {
            // InternalTexDsl.g:1290:2: ( ruleMathContent )
            // InternalTexDsl.g:1291:3: ruleMathContent
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
    // InternalTexDsl.g:1300:1: rule__DisplayMath__ContentAssignment_2 : ( ruleMathContent ) ;
    public final void rule__DisplayMath__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1304:1: ( ( ruleMathContent ) )
            // InternalTexDsl.g:1305:2: ( ruleMathContent )
            {
            // InternalTexDsl.g:1305:2: ( ruleMathContent )
            // InternalTexDsl.g:1306:3: ruleMathContent
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
        // InternalTexDsl.g:226:5: ( rule__TextContainer__TextAssignment )
        // InternalTexDsl.g:226:5: rule__TextContainer__TextAssignment
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
        // InternalTexDsl.g:333:5: ( rule__Operators__OpAssignment )
        // InternalTexDsl.g:333:5: rule__Operators__OpAssignment
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__Operators__OpAssignment();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalTexDsl

    // $ANTLR start synpred15_InternalTexDsl
    public final void synpred15_InternalTexDsl_fragment() throws RecognitionException {   
        // InternalTexDsl.g:573:2: ( ( ruleTextContent ) )
        // InternalTexDsl.g:573:2: ( ruleTextContent )
        {
        // InternalTexDsl.g:573:2: ( ruleTextContent )
        // InternalTexDsl.g:574:3: ruleTextContent
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
    // $ANTLR end synpred15_InternalTexDsl

    // $ANTLR start synpred16_InternalTexDsl
    public final void synpred16_InternalTexDsl_fragment() throws RecognitionException {   
        // InternalTexDsl.g:579:2: ( ( ruleNumbers ) )
        // InternalTexDsl.g:579:2: ( ruleNumbers )
        {
        // InternalTexDsl.g:579:2: ( ruleNumbers )
        // InternalTexDsl.g:580:3: ruleNumbers
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
    // $ANTLR end synpred16_InternalTexDsl

    // $ANTLR start synpred17_InternalTexDsl
    public final void synpred17_InternalTexDsl_fragment() throws RecognitionException {   
        // InternalTexDsl.g:668:3: ( rule__Command__OptionalArgsAssignment_2 )
        // InternalTexDsl.g:668:3: rule__Command__OptionalArgsAssignment_2
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__Command__OptionalArgsAssignment_2();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred17_InternalTexDsl

    // $ANTLR start synpred18_InternalTexDsl
    public final void synpred18_InternalTexDsl_fragment() throws RecognitionException {   
        // InternalTexDsl.g:694:3: ( rule__Command__MandatoryArgsAssignment_3 )
        // InternalTexDsl.g:694:3: rule__Command__MandatoryArgsAssignment_3
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__Command__MandatoryArgsAssignment_3();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_InternalTexDsl

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
    public final boolean synpred18_InternalTexDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalTexDsl_fragment(); // can never throw exception
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


    protected DFA9 dfa9 = new DFA9(this);
    protected DFA10 dfa10 = new DFA10(this);
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

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 668:2: ( rule__Command__OptionalArgsAssignment_2 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_8 = input.LA(1);

                         
                        int index9_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalTexDsl()) ) {s = 13;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index9_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 9, _s, input);
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

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_8;
        }
        public String getDescription() {
            return "()* loopback of 694:2: ( rule__Command__MandatoryArgsAssignment_3 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_8 = input.LA(1);

                         
                        int index10_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalTexDsl()) ) {s = 13;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index10_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 10, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000000358F2L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000022L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000082L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000050F0L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000050F2L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000378F0L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000003D8F0L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000000158F0L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000000058F2L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000000358F0L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000000258F0L});
    }


}