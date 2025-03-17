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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_ANY_OTHER", "RULE_KOMMA", "RULE_PIPE", "RULE_EXCL", "RULE_SYMBOL", "RULE_DOT", "RULE_ID_COMM", "RULE_BO", "RULE_BC", "RULE_END", "RULE_SQBO", "RULE_SQBC", "RULE_CUBO", "RULE_CUBC", "RULE_EQ", "RULE_SL_COMMENT", "RULE_ALPHA", "RULE_NUMERIC", "RULE_AND", "RULE_BS", "RULE_ALPHAC", "RULE_ALPHAS", "RULE_D_QUOTE", "RULE_S_QUOTE", "RULE_SPACE", "RULE_WS"
    };
    public static final int RULE_ALPHA=21;
    public static final int RULE_END=14;
    public static final int RULE_CUBO=17;
    public static final int RULE_AND=23;
    public static final int RULE_SL_COMMENT=20;
    public static final int RULE_EQ=19;
    public static final int RULE_D_QUOTE=27;
    public static final int RULE_SPACE=29;
    public static final int RULE_DOT=10;
    public static final int EOF=-1;
    public static final int RULE_EXCL=8;
    public static final int RULE_ID_COMM=11;
    public static final int RULE_NUMERIC=22;
    public static final int RULE_ID=4;
    public static final int RULE_WS=30;
    public static final int RULE_SQBO=15;
    public static final int RULE_S_QUOTE=28;
    public static final int RULE_BO=12;
    public static final int RULE_ANY_OTHER=5;
    public static final int RULE_SQBC=16;
    public static final int RULE_ALPHAS=26;
    public static final int RULE_BS=24;
    public static final int RULE_KOMMA=6;
    public static final int RULE_PIPE=7;
    public static final int RULE_CUBC=18;
    public static final int RULE_SYMBOL=9;
    public static final int RULE_ALPHAC=25;
    public static final int RULE_BC=13;

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
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalTexDsl.g:63:1: ruleModel : ( ( ( rule__Model__DocumentAssignment ) ) ( ( rule__Model__DocumentAssignment )* ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:67:2: ( ( ( ( rule__Model__DocumentAssignment ) ) ( ( rule__Model__DocumentAssignment )* ) ) )
            // InternalTexDsl.g:68:2: ( ( ( rule__Model__DocumentAssignment ) ) ( ( rule__Model__DocumentAssignment )* ) )
            {
            // InternalTexDsl.g:68:2: ( ( ( rule__Model__DocumentAssignment ) ) ( ( rule__Model__DocumentAssignment )* ) )
            // InternalTexDsl.g:69:3: ( ( rule__Model__DocumentAssignment ) ) ( ( rule__Model__DocumentAssignment )* )
            {
            // InternalTexDsl.g:69:3: ( ( rule__Model__DocumentAssignment ) )
            // InternalTexDsl.g:70:4: ( rule__Model__DocumentAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getDocumentAssignment()); 
            }
            // InternalTexDsl.g:71:4: ( rule__Model__DocumentAssignment )
            // InternalTexDsl.g:71:5: rule__Model__DocumentAssignment
            {
            pushFollow(FOLLOW_3);
            rule__Model__DocumentAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getDocumentAssignment()); 
            }

            }

            // InternalTexDsl.g:74:3: ( ( rule__Model__DocumentAssignment )* )
            // InternalTexDsl.g:75:4: ( rule__Model__DocumentAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getDocumentAssignment()); 
            }
            // InternalTexDsl.g:76:4: ( rule__Model__DocumentAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_ID_COMM)||LA1_0==RULE_END) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTexDsl.g:76:5: rule__Model__DocumentAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__DocumentAssignment();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getDocumentAssignment()); 
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleDocument"
    // InternalTexDsl.g:86:1: entryRuleDocument : ruleDocument EOF ;
    public final void entryRuleDocument() throws RecognitionException {
        try {
            // InternalTexDsl.g:87:1: ( ruleDocument EOF )
            // InternalTexDsl.g:88:1: ruleDocument EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocumentRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDocument();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDocumentRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalTexDsl.g:95:1: ruleDocument : ( ( rule__Document__Alternatives ) ) ;
    public final void ruleDocument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:99:2: ( ( ( rule__Document__Alternatives ) ) )
            // InternalTexDsl.g:100:2: ( ( rule__Document__Alternatives ) )
            {
            // InternalTexDsl.g:100:2: ( ( rule__Document__Alternatives ) )
            // InternalTexDsl.g:101:3: ( rule__Document__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocumentAccess().getAlternatives()); 
            }
            // InternalTexDsl.g:102:3: ( rule__Document__Alternatives )
            // InternalTexDsl.g:102:4: rule__Document__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Document__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDocumentAccess().getAlternatives()); 
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
    // $ANTLR end "ruleDocument"


    // $ANTLR start "entryRuleText"
    // InternalTexDsl.g:111:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // InternalTexDsl.g:112:1: ( ruleText EOF )
            // InternalTexDsl.g:113:1: ruleText EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleText();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // InternalTexDsl.g:120:1: ruleText : ( ( rule__Text__TokenAssignment ) ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:124:2: ( ( ( rule__Text__TokenAssignment ) ) )
            // InternalTexDsl.g:125:2: ( ( rule__Text__TokenAssignment ) )
            {
            // InternalTexDsl.g:125:2: ( ( rule__Text__TokenAssignment ) )
            // InternalTexDsl.g:126:3: ( rule__Text__TokenAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextAccess().getTokenAssignment()); 
            }
            // InternalTexDsl.g:127:3: ( rule__Text__TokenAssignment )
            // InternalTexDsl.g:127:4: rule__Text__TokenAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Text__TokenAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextAccess().getTokenAssignment()); 
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
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleAnyText"
    // InternalTexDsl.g:136:1: entryRuleAnyText : ruleAnyText EOF ;
    public final void entryRuleAnyText() throws RecognitionException {
        try {
            // InternalTexDsl.g:137:1: ( ruleAnyText EOF )
            // InternalTexDsl.g:138:1: ruleAnyText EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnyTextRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAnyText();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnyTextRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAnyText"


    // $ANTLR start "ruleAnyText"
    // InternalTexDsl.g:145:1: ruleAnyText : ( ( rule__AnyText__Alternatives ) ) ;
    public final void ruleAnyText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:149:2: ( ( ( rule__AnyText__Alternatives ) ) )
            // InternalTexDsl.g:150:2: ( ( rule__AnyText__Alternatives ) )
            {
            // InternalTexDsl.g:150:2: ( ( rule__AnyText__Alternatives ) )
            // InternalTexDsl.g:151:3: ( rule__AnyText__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnyTextAccess().getAlternatives()); 
            }
            // InternalTexDsl.g:152:3: ( rule__AnyText__Alternatives )
            // InternalTexDsl.g:152:4: rule__AnyText__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AnyText__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnyTextAccess().getAlternatives()); 
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
    // $ANTLR end "ruleAnyText"


    // $ANTLR start "entryRuleCommand"
    // InternalTexDsl.g:161:1: entryRuleCommand : ruleCommand EOF ;
    public final void entryRuleCommand() throws RecognitionException {
        try {
            // InternalTexDsl.g:162:1: ( ruleCommand EOF )
            // InternalTexDsl.g:163:1: ruleCommand EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCommand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalTexDsl.g:170:1: ruleCommand : ( ( rule__Command__Group__0 ) ) ;
    public final void ruleCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:174:2: ( ( ( rule__Command__Group__0 ) ) )
            // InternalTexDsl.g:175:2: ( ( rule__Command__Group__0 ) )
            {
            // InternalTexDsl.g:175:2: ( ( rule__Command__Group__0 ) )
            // InternalTexDsl.g:176:3: ( rule__Command__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getGroup()); 
            }
            // InternalTexDsl.g:177:3: ( rule__Command__Group__0 )
            // InternalTexDsl.g:177:4: rule__Command__Group__0
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleMulti"
    // InternalTexDsl.g:186:1: entryRuleMulti : ruleMulti EOF ;
    public final void entryRuleMulti() throws RecognitionException {
        try {
            // InternalTexDsl.g:187:1: ( ruleMulti EOF )
            // InternalTexDsl.g:188:1: ruleMulti EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMulti();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMulti"


    // $ANTLR start "ruleMulti"
    // InternalTexDsl.g:195:1: ruleMulti : ( ( ( rule__Multi__TokensAssignment ) ) ( ( rule__Multi__TokensAssignment )* ) ) ;
    public final void ruleMulti() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:199:2: ( ( ( ( rule__Multi__TokensAssignment ) ) ( ( rule__Multi__TokensAssignment )* ) ) )
            // InternalTexDsl.g:200:2: ( ( ( rule__Multi__TokensAssignment ) ) ( ( rule__Multi__TokensAssignment )* ) )
            {
            // InternalTexDsl.g:200:2: ( ( ( rule__Multi__TokensAssignment ) ) ( ( rule__Multi__TokensAssignment )* ) )
            // InternalTexDsl.g:201:3: ( ( rule__Multi__TokensAssignment ) ) ( ( rule__Multi__TokensAssignment )* )
            {
            // InternalTexDsl.g:201:3: ( ( rule__Multi__TokensAssignment ) )
            // InternalTexDsl.g:202:4: ( rule__Multi__TokensAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiAccess().getTokensAssignment()); 
            }
            // InternalTexDsl.g:203:4: ( rule__Multi__TokensAssignment )
            // InternalTexDsl.g:203:5: rule__Multi__TokensAssignment
            {
            pushFollow(FOLLOW_4);
            rule__Multi__TokensAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiAccess().getTokensAssignment()); 
            }

            }

            // InternalTexDsl.g:206:3: ( ( rule__Multi__TokensAssignment )* )
            // InternalTexDsl.g:207:4: ( rule__Multi__TokensAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiAccess().getTokensAssignment()); 
            }
            // InternalTexDsl.g:208:4: ( rule__Multi__TokensAssignment )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    int LA2_2 = input.LA(2);

                    if ( (synpred2_InternalTexDsl()) ) {
                        alt2=1;
                    }


                }


                switch (alt2) {
            	case 1 :
            	    // InternalTexDsl.g:208:5: rule__Multi__TokensAssignment
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Multi__TokensAssignment();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiAccess().getTokensAssignment()); 
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
    // $ANTLR end "ruleMulti"


    // $ANTLR start "entryRuleCommandExt"
    // InternalTexDsl.g:218:1: entryRuleCommandExt : ruleCommandExt EOF ;
    public final void entryRuleCommandExt() throws RecognitionException {
        try {
            // InternalTexDsl.g:219:1: ( ruleCommandExt EOF )
            // InternalTexDsl.g:220:1: ruleCommandExt EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandExtRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCommandExt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandExtRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCommandExt"


    // $ANTLR start "ruleCommandExt"
    // InternalTexDsl.g:227:1: ruleCommandExt : ( ( rule__CommandExt__Group__0 ) ) ;
    public final void ruleCommandExt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:231:2: ( ( ( rule__CommandExt__Group__0 ) ) )
            // InternalTexDsl.g:232:2: ( ( rule__CommandExt__Group__0 ) )
            {
            // InternalTexDsl.g:232:2: ( ( rule__CommandExt__Group__0 ) )
            // InternalTexDsl.g:233:3: ( rule__CommandExt__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandExtAccess().getGroup()); 
            }
            // InternalTexDsl.g:234:3: ( rule__CommandExt__Group__0 )
            // InternalTexDsl.g:234:4: rule__CommandExt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CommandExt__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandExtAccess().getGroup()); 
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
    // $ANTLR end "ruleCommandExt"


    // $ANTLR start "entryRuleCompound"
    // InternalTexDsl.g:243:1: entryRuleCompound : ruleCompound EOF ;
    public final void entryRuleCompound() throws RecognitionException {
        try {
            // InternalTexDsl.g:244:1: ( ruleCompound EOF )
            // InternalTexDsl.g:245:1: ruleCompound EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompoundRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCompound();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompoundRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCompound"


    // $ANTLR start "ruleCompound"
    // InternalTexDsl.g:252:1: ruleCompound : ( ( rule__Compound__Alternatives ) ) ;
    public final void ruleCompound() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:256:2: ( ( ( rule__Compound__Alternatives ) ) )
            // InternalTexDsl.g:257:2: ( ( rule__Compound__Alternatives ) )
            {
            // InternalTexDsl.g:257:2: ( ( rule__Compound__Alternatives ) )
            // InternalTexDsl.g:258:3: ( rule__Compound__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompoundAccess().getAlternatives()); 
            }
            // InternalTexDsl.g:259:3: ( rule__Compound__Alternatives )
            // InternalTexDsl.g:259:4: rule__Compound__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Compound__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompoundAccess().getAlternatives()); 
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
    // $ANTLR end "ruleCompound"


    // $ANTLR start "entryRuleExtras"
    // InternalTexDsl.g:268:1: entryRuleExtras : ruleExtras EOF ;
    public final void entryRuleExtras() throws RecognitionException {
        try {
            // InternalTexDsl.g:269:1: ( ruleExtras EOF )
            // InternalTexDsl.g:270:1: ruleExtras EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtrasRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExtras();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtrasRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExtras"


    // $ANTLR start "ruleExtras"
    // InternalTexDsl.g:277:1: ruleExtras : ( ( ( rule__Extras__TokensAssignment ) ) ( ( rule__Extras__TokensAssignment )* ) ) ;
    public final void ruleExtras() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:281:2: ( ( ( ( rule__Extras__TokensAssignment ) ) ( ( rule__Extras__TokensAssignment )* ) ) )
            // InternalTexDsl.g:282:2: ( ( ( rule__Extras__TokensAssignment ) ) ( ( rule__Extras__TokensAssignment )* ) )
            {
            // InternalTexDsl.g:282:2: ( ( ( rule__Extras__TokensAssignment ) ) ( ( rule__Extras__TokensAssignment )* ) )
            // InternalTexDsl.g:283:3: ( ( rule__Extras__TokensAssignment ) ) ( ( rule__Extras__TokensAssignment )* )
            {
            // InternalTexDsl.g:283:3: ( ( rule__Extras__TokensAssignment ) )
            // InternalTexDsl.g:284:4: ( rule__Extras__TokensAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtrasAccess().getTokensAssignment()); 
            }
            // InternalTexDsl.g:285:4: ( rule__Extras__TokensAssignment )
            // InternalTexDsl.g:285:5: rule__Extras__TokensAssignment
            {
            pushFollow(FOLLOW_5);
            rule__Extras__TokensAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtrasAccess().getTokensAssignment()); 
            }

            }

            // InternalTexDsl.g:288:3: ( ( rule__Extras__TokensAssignment )* )
            // InternalTexDsl.g:289:4: ( rule__Extras__TokensAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtrasAccess().getTokensAssignment()); 
            }
            // InternalTexDsl.g:290:4: ( rule__Extras__TokensAssignment )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=RULE_BO && LA3_0<=RULE_BC)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTexDsl.g:290:5: rule__Extras__TokensAssignment
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Extras__TokensAssignment();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtrasAccess().getTokensAssignment()); 
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
    // $ANTLR end "ruleExtras"


    // $ANTLR start "entryRuleAttributes"
    // InternalTexDsl.g:300:1: entryRuleAttributes : ruleAttributes EOF ;
    public final void entryRuleAttributes() throws RecognitionException {
        try {
            // InternalTexDsl.g:301:1: ( ruleAttributes EOF )
            // InternalTexDsl.g:302:1: ruleAttributes EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributesRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAttributes();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributesRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalTexDsl.g:309:1: ruleAttributes : ( ( rule__Attributes__Group__0 ) ) ;
    public final void ruleAttributes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:313:2: ( ( ( rule__Attributes__Group__0 ) ) )
            // InternalTexDsl.g:314:2: ( ( rule__Attributes__Group__0 ) )
            {
            // InternalTexDsl.g:314:2: ( ( rule__Attributes__Group__0 ) )
            // InternalTexDsl.g:315:3: ( rule__Attributes__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributesAccess().getGroup()); 
            }
            // InternalTexDsl.g:316:3: ( rule__Attributes__Group__0 )
            // InternalTexDsl.g:316:4: rule__Attributes__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attributes__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributesAccess().getGroup()); 
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
    // $ANTLR end "ruleAttributes"


    // $ANTLR start "rule__Document__Alternatives"
    // InternalTexDsl.g:324:1: rule__Document__Alternatives : ( ( ruleCommand ) | ( ruleText ) | ( ( rule__Document__Group_2__0 ) ) );
    public final void rule__Document__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:328:1: ( ( ruleCommand ) | ( ruleText ) | ( ( rule__Document__Group_2__0 ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_ID_COMM:
                {
                alt4=1;
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
                alt4=2;
                }
                break;
            case RULE_END:
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
                    // InternalTexDsl.g:329:2: ( ruleCommand )
                    {
                    // InternalTexDsl.g:329:2: ( ruleCommand )
                    // InternalTexDsl.g:330:3: ruleCommand
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDocumentAccess().getCommandParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleCommand();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDocumentAccess().getCommandParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTexDsl.g:335:2: ( ruleText )
                    {
                    // InternalTexDsl.g:335:2: ( ruleText )
                    // InternalTexDsl.g:336:3: ruleText
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDocumentAccess().getTextParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleText();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDocumentAccess().getTextParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTexDsl.g:341:2: ( ( rule__Document__Group_2__0 ) )
                    {
                    // InternalTexDsl.g:341:2: ( ( rule__Document__Group_2__0 ) )
                    // InternalTexDsl.g:342:3: ( rule__Document__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDocumentAccess().getGroup_2()); 
                    }
                    // InternalTexDsl.g:343:3: ( rule__Document__Group_2__0 )
                    // InternalTexDsl.g:343:4: rule__Document__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Document__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDocumentAccess().getGroup_2()); 
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
    // $ANTLR end "rule__Document__Alternatives"


    // $ANTLR start "rule__AnyText__Alternatives"
    // InternalTexDsl.g:351:1: rule__AnyText__Alternatives : ( ( RULE_ID ) | ( RULE_ANY_OTHER ) | ( RULE_KOMMA ) | ( RULE_PIPE ) | ( RULE_EXCL ) | ( RULE_SYMBOL ) | ( RULE_DOT ) );
    public final void rule__AnyText__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:355:1: ( ( RULE_ID ) | ( RULE_ANY_OTHER ) | ( RULE_KOMMA ) | ( RULE_PIPE ) | ( RULE_EXCL ) | ( RULE_SYMBOL ) | ( RULE_DOT ) )
            int alt5=7;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt5=1;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt5=2;
                }
                break;
            case RULE_KOMMA:
                {
                alt5=3;
                }
                break;
            case RULE_PIPE:
                {
                alt5=4;
                }
                break;
            case RULE_EXCL:
                {
                alt5=5;
                }
                break;
            case RULE_SYMBOL:
                {
                alt5=6;
                }
                break;
            case RULE_DOT:
                {
                alt5=7;
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
                    // InternalTexDsl.g:356:2: ( RULE_ID )
                    {
                    // InternalTexDsl.g:356:2: ( RULE_ID )
                    // InternalTexDsl.g:357:3: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnyTextAccess().getIDTerminalRuleCall_0()); 
                    }
                    match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnyTextAccess().getIDTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTexDsl.g:362:2: ( RULE_ANY_OTHER )
                    {
                    // InternalTexDsl.g:362:2: ( RULE_ANY_OTHER )
                    // InternalTexDsl.g:363:3: RULE_ANY_OTHER
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnyTextAccess().getANY_OTHERTerminalRuleCall_1()); 
                    }
                    match(input,RULE_ANY_OTHER,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnyTextAccess().getANY_OTHERTerminalRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTexDsl.g:368:2: ( RULE_KOMMA )
                    {
                    // InternalTexDsl.g:368:2: ( RULE_KOMMA )
                    // InternalTexDsl.g:369:3: RULE_KOMMA
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnyTextAccess().getKOMMATerminalRuleCall_2()); 
                    }
                    match(input,RULE_KOMMA,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnyTextAccess().getKOMMATerminalRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalTexDsl.g:374:2: ( RULE_PIPE )
                    {
                    // InternalTexDsl.g:374:2: ( RULE_PIPE )
                    // InternalTexDsl.g:375:3: RULE_PIPE
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnyTextAccess().getPIPETerminalRuleCall_3()); 
                    }
                    match(input,RULE_PIPE,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnyTextAccess().getPIPETerminalRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalTexDsl.g:380:2: ( RULE_EXCL )
                    {
                    // InternalTexDsl.g:380:2: ( RULE_EXCL )
                    // InternalTexDsl.g:381:3: RULE_EXCL
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnyTextAccess().getEXCLTerminalRuleCall_4()); 
                    }
                    match(input,RULE_EXCL,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnyTextAccess().getEXCLTerminalRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalTexDsl.g:386:2: ( RULE_SYMBOL )
                    {
                    // InternalTexDsl.g:386:2: ( RULE_SYMBOL )
                    // InternalTexDsl.g:387:3: RULE_SYMBOL
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnyTextAccess().getSYMBOLTerminalRuleCall_5()); 
                    }
                    match(input,RULE_SYMBOL,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnyTextAccess().getSYMBOLTerminalRuleCall_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalTexDsl.g:392:2: ( RULE_DOT )
                    {
                    // InternalTexDsl.g:392:2: ( RULE_DOT )
                    // InternalTexDsl.g:393:3: RULE_DOT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnyTextAccess().getDOTTerminalRuleCall_6()); 
                    }
                    match(input,RULE_DOT,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnyTextAccess().getDOTTerminalRuleCall_6()); 
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
    // $ANTLR end "rule__AnyText__Alternatives"


    // $ANTLR start "rule__Command__Alternatives_2_2_0"
    // InternalTexDsl.g:402:1: rule__Command__Alternatives_2_2_0 : ( ( RULE_PIPE ) | ( RULE_EXCL ) );
    public final void rule__Command__Alternatives_2_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:406:1: ( ( RULE_PIPE ) | ( RULE_EXCL ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_PIPE) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_EXCL) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalTexDsl.g:407:2: ( RULE_PIPE )
                    {
                    // InternalTexDsl.g:407:2: ( RULE_PIPE )
                    // InternalTexDsl.g:408:3: RULE_PIPE
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandAccess().getPIPETerminalRuleCall_2_2_0_0()); 
                    }
                    match(input,RULE_PIPE,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCommandAccess().getPIPETerminalRuleCall_2_2_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTexDsl.g:413:2: ( RULE_EXCL )
                    {
                    // InternalTexDsl.g:413:2: ( RULE_EXCL )
                    // InternalTexDsl.g:414:3: RULE_EXCL
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandAccess().getEXCLTerminalRuleCall_2_2_0_1()); 
                    }
                    match(input,RULE_EXCL,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCommandAccess().getEXCLTerminalRuleCall_2_2_0_1()); 
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
    // $ANTLR end "rule__Command__Alternatives_2_2_0"


    // $ANTLR start "rule__CommandExt__CommandAlternatives_0_0"
    // InternalTexDsl.g:423:1: rule__CommandExt__CommandAlternatives_0_0 : ( ( RULE_ID ) | ( RULE_ID_COMM ) );
    public final void rule__CommandExt__CommandAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:427:1: ( ( RULE_ID ) | ( RULE_ID_COMM ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID_COMM) ) {
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
                    // InternalTexDsl.g:428:2: ( RULE_ID )
                    {
                    // InternalTexDsl.g:428:2: ( RULE_ID )
                    // InternalTexDsl.g:429:3: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandExtAccess().getCommandIDTerminalRuleCall_0_0_0()); 
                    }
                    match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCommandExtAccess().getCommandIDTerminalRuleCall_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTexDsl.g:434:2: ( RULE_ID_COMM )
                    {
                    // InternalTexDsl.g:434:2: ( RULE_ID_COMM )
                    // InternalTexDsl.g:435:3: RULE_ID_COMM
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandExtAccess().getCommandID_COMMTerminalRuleCall_0_0_1()); 
                    }
                    match(input,RULE_ID_COMM,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCommandExtAccess().getCommandID_COMMTerminalRuleCall_0_0_1()); 
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
    // $ANTLR end "rule__CommandExt__CommandAlternatives_0_0"


    // $ANTLR start "rule__Compound__Alternatives"
    // InternalTexDsl.g:444:1: rule__Compound__Alternatives : ( ( ruleMulti ) | ( ruleExtras ) | ( ( ruleCommandExt ) ) );
    public final void rule__Compound__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:448:1: ( ( ruleMulti ) | ( ruleExtras ) | ( ( ruleCommandExt ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==EOF||LA8_1==RULE_ID||(LA8_1>=RULE_KOMMA && LA8_1<=RULE_EXCL)||LA8_1==RULE_CUBC) ) {
                    alt8=1;
                }
                else if ( (LA8_1==RULE_CUBO) ) {
                    alt8=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_BO:
            case RULE_BC:
                {
                alt8=2;
                }
                break;
            case RULE_ID_COMM:
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
                    // InternalTexDsl.g:449:2: ( ruleMulti )
                    {
                    // InternalTexDsl.g:449:2: ( ruleMulti )
                    // InternalTexDsl.g:450:3: ruleMulti
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompoundAccess().getMultiParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleMulti();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompoundAccess().getMultiParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTexDsl.g:455:2: ( ruleExtras )
                    {
                    // InternalTexDsl.g:455:2: ( ruleExtras )
                    // InternalTexDsl.g:456:3: ruleExtras
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompoundAccess().getExtrasParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleExtras();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompoundAccess().getExtrasParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTexDsl.g:461:2: ( ( ruleCommandExt ) )
                    {
                    // InternalTexDsl.g:461:2: ( ( ruleCommandExt ) )
                    // InternalTexDsl.g:462:3: ( ruleCommandExt )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompoundAccess().getCommandExtParserRuleCall_2()); 
                    }
                    // InternalTexDsl.g:463:3: ( ruleCommandExt )
                    // InternalTexDsl.g:463:4: ruleCommandExt
                    {
                    pushFollow(FOLLOW_2);
                    ruleCommandExt();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompoundAccess().getCommandExtParserRuleCall_2()); 
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
    // $ANTLR end "rule__Compound__Alternatives"


    // $ANTLR start "rule__Extras__TokensAlternatives_0"
    // InternalTexDsl.g:471:1: rule__Extras__TokensAlternatives_0 : ( ( RULE_BO ) | ( RULE_BC ) );
    public final void rule__Extras__TokensAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:475:1: ( ( RULE_BO ) | ( RULE_BC ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_BO) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_BC) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalTexDsl.g:476:2: ( RULE_BO )
                    {
                    // InternalTexDsl.g:476:2: ( RULE_BO )
                    // InternalTexDsl.g:477:3: RULE_BO
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExtrasAccess().getTokensBOTerminalRuleCall_0_0()); 
                    }
                    match(input,RULE_BO,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExtrasAccess().getTokensBOTerminalRuleCall_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTexDsl.g:482:2: ( RULE_BC )
                    {
                    // InternalTexDsl.g:482:2: ( RULE_BC )
                    // InternalTexDsl.g:483:3: RULE_BC
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExtrasAccess().getTokensBCTerminalRuleCall_0_1()); 
                    }
                    match(input,RULE_BC,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExtrasAccess().getTokensBCTerminalRuleCall_0_1()); 
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
    // $ANTLR end "rule__Extras__TokensAlternatives_0"


    // $ANTLR start "rule__Attributes__Alternatives_1_1"
    // InternalTexDsl.g:492:1: rule__Attributes__Alternatives_1_1 : ( ( ( rule__Attributes__Group_1_1_0__0 ) ) | ( ( rule__Attributes__SingleAssignment_1_1_1 ) ) );
    public final void rule__Attributes__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:496:1: ( ( ( rule__Attributes__Group_1_1_0__0 ) ) | ( ( rule__Attributes__SingleAssignment_1_1_1 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_CUBO) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
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
                    // InternalTexDsl.g:497:2: ( ( rule__Attributes__Group_1_1_0__0 ) )
                    {
                    // InternalTexDsl.g:497:2: ( ( rule__Attributes__Group_1_1_0__0 ) )
                    // InternalTexDsl.g:498:3: ( rule__Attributes__Group_1_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributesAccess().getGroup_1_1_0()); 
                    }
                    // InternalTexDsl.g:499:3: ( rule__Attributes__Group_1_1_0__0 )
                    // InternalTexDsl.g:499:4: rule__Attributes__Group_1_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attributes__Group_1_1_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributesAccess().getGroup_1_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTexDsl.g:503:2: ( ( rule__Attributes__SingleAssignment_1_1_1 ) )
                    {
                    // InternalTexDsl.g:503:2: ( ( rule__Attributes__SingleAssignment_1_1_1 ) )
                    // InternalTexDsl.g:504:3: ( rule__Attributes__SingleAssignment_1_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributesAccess().getSingleAssignment_1_1_1()); 
                    }
                    // InternalTexDsl.g:505:3: ( rule__Attributes__SingleAssignment_1_1_1 )
                    // InternalTexDsl.g:505:4: rule__Attributes__SingleAssignment_1_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attributes__SingleAssignment_1_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributesAccess().getSingleAssignment_1_1_1()); 
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
    // $ANTLR end "rule__Attributes__Alternatives_1_1"


    // $ANTLR start "rule__Document__Group_2__0"
    // InternalTexDsl.g:513:1: rule__Document__Group_2__0 : rule__Document__Group_2__0__Impl rule__Document__Group_2__1 ;
    public final void rule__Document__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:517:1: ( rule__Document__Group_2__0__Impl rule__Document__Group_2__1 )
            // InternalTexDsl.g:518:2: rule__Document__Group_2__0__Impl rule__Document__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__Document__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Document__Group_2__1();

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
    // $ANTLR end "rule__Document__Group_2__0"


    // $ANTLR start "rule__Document__Group_2__0__Impl"
    // InternalTexDsl.g:525:1: rule__Document__Group_2__0__Impl : ( () ) ;
    public final void rule__Document__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:529:1: ( ( () ) )
            // InternalTexDsl.g:530:1: ( () )
            {
            // InternalTexDsl.g:530:1: ( () )
            // InternalTexDsl.g:531:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocumentAccess().getDocumentAction_2_0()); 
            }
            // InternalTexDsl.g:532:2: ()
            // InternalTexDsl.g:532:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDocumentAccess().getDocumentAction_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__Group_2__0__Impl"


    // $ANTLR start "rule__Document__Group_2__1"
    // InternalTexDsl.g:540:1: rule__Document__Group_2__1 : rule__Document__Group_2__1__Impl ;
    public final void rule__Document__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:544:1: ( rule__Document__Group_2__1__Impl )
            // InternalTexDsl.g:545:2: rule__Document__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Document__Group_2__1__Impl();

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
    // $ANTLR end "rule__Document__Group_2__1"


    // $ANTLR start "rule__Document__Group_2__1__Impl"
    // InternalTexDsl.g:551:1: rule__Document__Group_2__1__Impl : ( RULE_END ) ;
    public final void rule__Document__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:555:1: ( ( RULE_END ) )
            // InternalTexDsl.g:556:1: ( RULE_END )
            {
            // InternalTexDsl.g:556:1: ( RULE_END )
            // InternalTexDsl.g:557:2: RULE_END
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocumentAccess().getENDTerminalRuleCall_2_1()); 
            }
            match(input,RULE_END,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDocumentAccess().getENDTerminalRuleCall_2_1()); 
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
    // $ANTLR end "rule__Document__Group_2__1__Impl"


    // $ANTLR start "rule__Command__Group__0"
    // InternalTexDsl.g:567:1: rule__Command__Group__0 : rule__Command__Group__0__Impl rule__Command__Group__1 ;
    public final void rule__Command__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:571:1: ( rule__Command__Group__0__Impl rule__Command__Group__1 )
            // InternalTexDsl.g:572:2: rule__Command__Group__0__Impl rule__Command__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Command__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalTexDsl.g:579:1: rule__Command__Group__0__Impl : ( ( rule__Command__CommandAssignment_0 ) ) ;
    public final void rule__Command__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:583:1: ( ( ( rule__Command__CommandAssignment_0 ) ) )
            // InternalTexDsl.g:584:1: ( ( rule__Command__CommandAssignment_0 ) )
            {
            // InternalTexDsl.g:584:1: ( ( rule__Command__CommandAssignment_0 ) )
            // InternalTexDsl.g:585:2: ( rule__Command__CommandAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getCommandAssignment_0()); 
            }
            // InternalTexDsl.g:586:2: ( rule__Command__CommandAssignment_0 )
            // InternalTexDsl.g:586:3: rule__Command__CommandAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Command__CommandAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getCommandAssignment_0()); 
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
    // InternalTexDsl.g:594:1: rule__Command__Group__1 : rule__Command__Group__1__Impl rule__Command__Group__2 ;
    public final void rule__Command__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:598:1: ( rule__Command__Group__1__Impl rule__Command__Group__2 )
            // InternalTexDsl.g:599:2: rule__Command__Group__1__Impl rule__Command__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Command__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalTexDsl.g:606:1: rule__Command__Group__1__Impl : ( ( rule__Command__Group_1__0 )? ) ;
    public final void rule__Command__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:610:1: ( ( ( rule__Command__Group_1__0 )? ) )
            // InternalTexDsl.g:611:1: ( ( rule__Command__Group_1__0 )? )
            {
            // InternalTexDsl.g:611:1: ( ( rule__Command__Group_1__0 )? )
            // InternalTexDsl.g:612:2: ( rule__Command__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getGroup_1()); 
            }
            // InternalTexDsl.g:613:2: ( rule__Command__Group_1__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_SQBO) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalTexDsl.g:613:3: rule__Command__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Command__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getGroup_1()); 
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
    // InternalTexDsl.g:621:1: rule__Command__Group__2 : rule__Command__Group__2__Impl ;
    public final void rule__Command__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:625:1: ( rule__Command__Group__2__Impl )
            // InternalTexDsl.g:626:2: rule__Command__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Command__Group__2__Impl();

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
    // InternalTexDsl.g:632:1: rule__Command__Group__2__Impl : ( ( rule__Command__Group_2__0 )? ) ;
    public final void rule__Command__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:636:1: ( ( ( rule__Command__Group_2__0 )? ) )
            // InternalTexDsl.g:637:1: ( ( rule__Command__Group_2__0 )? )
            {
            // InternalTexDsl.g:637:1: ( ( rule__Command__Group_2__0 )? )
            // InternalTexDsl.g:638:2: ( rule__Command__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getGroup_2()); 
            }
            // InternalTexDsl.g:639:2: ( rule__Command__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_CUBO) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTexDsl.g:639:3: rule__Command__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Command__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getGroup_2()); 
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


    // $ANTLR start "rule__Command__Group_1__0"
    // InternalTexDsl.g:648:1: rule__Command__Group_1__0 : rule__Command__Group_1__0__Impl rule__Command__Group_1__1 ;
    public final void rule__Command__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:652:1: ( rule__Command__Group_1__0__Impl rule__Command__Group_1__1 )
            // InternalTexDsl.g:653:2: rule__Command__Group_1__0__Impl rule__Command__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Command__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Command__Group_1__1();

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
    // $ANTLR end "rule__Command__Group_1__0"


    // $ANTLR start "rule__Command__Group_1__0__Impl"
    // InternalTexDsl.g:660:1: rule__Command__Group_1__0__Impl : ( RULE_SQBO ) ;
    public final void rule__Command__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:664:1: ( ( RULE_SQBO ) )
            // InternalTexDsl.g:665:1: ( RULE_SQBO )
            {
            // InternalTexDsl.g:665:1: ( RULE_SQBO )
            // InternalTexDsl.g:666:2: RULE_SQBO
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getSQBOTerminalRuleCall_1_0()); 
            }
            match(input,RULE_SQBO,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getSQBOTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Command__Group_1__0__Impl"


    // $ANTLR start "rule__Command__Group_1__1"
    // InternalTexDsl.g:675:1: rule__Command__Group_1__1 : rule__Command__Group_1__1__Impl rule__Command__Group_1__2 ;
    public final void rule__Command__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:679:1: ( rule__Command__Group_1__1__Impl rule__Command__Group_1__2 )
            // InternalTexDsl.g:680:2: rule__Command__Group_1__1__Impl rule__Command__Group_1__2
            {
            pushFollow(FOLLOW_9);
            rule__Command__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Command__Group_1__2();

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
    // $ANTLR end "rule__Command__Group_1__1"


    // $ANTLR start "rule__Command__Group_1__1__Impl"
    // InternalTexDsl.g:687:1: rule__Command__Group_1__1__Impl : ( ( rule__Command__AttrsAssignment_1_1 ) ) ;
    public final void rule__Command__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:691:1: ( ( ( rule__Command__AttrsAssignment_1_1 ) ) )
            // InternalTexDsl.g:692:1: ( ( rule__Command__AttrsAssignment_1_1 ) )
            {
            // InternalTexDsl.g:692:1: ( ( rule__Command__AttrsAssignment_1_1 ) )
            // InternalTexDsl.g:693:2: ( rule__Command__AttrsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getAttrsAssignment_1_1()); 
            }
            // InternalTexDsl.g:694:2: ( rule__Command__AttrsAssignment_1_1 )
            // InternalTexDsl.g:694:3: rule__Command__AttrsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Command__AttrsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getAttrsAssignment_1_1()); 
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
    // $ANTLR end "rule__Command__Group_1__1__Impl"


    // $ANTLR start "rule__Command__Group_1__2"
    // InternalTexDsl.g:702:1: rule__Command__Group_1__2 : rule__Command__Group_1__2__Impl rule__Command__Group_1__3 ;
    public final void rule__Command__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:706:1: ( rule__Command__Group_1__2__Impl rule__Command__Group_1__3 )
            // InternalTexDsl.g:707:2: rule__Command__Group_1__2__Impl rule__Command__Group_1__3
            {
            pushFollow(FOLLOW_9);
            rule__Command__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Command__Group_1__3();

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
    // $ANTLR end "rule__Command__Group_1__2"


    // $ANTLR start "rule__Command__Group_1__2__Impl"
    // InternalTexDsl.g:714:1: rule__Command__Group_1__2__Impl : ( ( rule__Command__Group_1_2__0 )* ) ;
    public final void rule__Command__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:718:1: ( ( ( rule__Command__Group_1_2__0 )* ) )
            // InternalTexDsl.g:719:1: ( ( rule__Command__Group_1_2__0 )* )
            {
            // InternalTexDsl.g:719:1: ( ( rule__Command__Group_1_2__0 )* )
            // InternalTexDsl.g:720:2: ( rule__Command__Group_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getGroup_1_2()); 
            }
            // InternalTexDsl.g:721:2: ( rule__Command__Group_1_2__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_KOMMA) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalTexDsl.g:721:3: rule__Command__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Command__Group_1_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getGroup_1_2()); 
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
    // $ANTLR end "rule__Command__Group_1__2__Impl"


    // $ANTLR start "rule__Command__Group_1__3"
    // InternalTexDsl.g:729:1: rule__Command__Group_1__3 : rule__Command__Group_1__3__Impl ;
    public final void rule__Command__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:733:1: ( rule__Command__Group_1__3__Impl )
            // InternalTexDsl.g:734:2: rule__Command__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Command__Group_1__3__Impl();

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
    // $ANTLR end "rule__Command__Group_1__3"


    // $ANTLR start "rule__Command__Group_1__3__Impl"
    // InternalTexDsl.g:740:1: rule__Command__Group_1__3__Impl : ( RULE_SQBC ) ;
    public final void rule__Command__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:744:1: ( ( RULE_SQBC ) )
            // InternalTexDsl.g:745:1: ( RULE_SQBC )
            {
            // InternalTexDsl.g:745:1: ( RULE_SQBC )
            // InternalTexDsl.g:746:2: RULE_SQBC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getSQBCTerminalRuleCall_1_3()); 
            }
            match(input,RULE_SQBC,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getSQBCTerminalRuleCall_1_3()); 
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
    // $ANTLR end "rule__Command__Group_1__3__Impl"


    // $ANTLR start "rule__Command__Group_1_2__0"
    // InternalTexDsl.g:756:1: rule__Command__Group_1_2__0 : rule__Command__Group_1_2__0__Impl rule__Command__Group_1_2__1 ;
    public final void rule__Command__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:760:1: ( rule__Command__Group_1_2__0__Impl rule__Command__Group_1_2__1 )
            // InternalTexDsl.g:761:2: rule__Command__Group_1_2__0__Impl rule__Command__Group_1_2__1
            {
            pushFollow(FOLLOW_8);
            rule__Command__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Command__Group_1_2__1();

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
    // $ANTLR end "rule__Command__Group_1_2__0"


    // $ANTLR start "rule__Command__Group_1_2__0__Impl"
    // InternalTexDsl.g:768:1: rule__Command__Group_1_2__0__Impl : ( RULE_KOMMA ) ;
    public final void rule__Command__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:772:1: ( ( RULE_KOMMA ) )
            // InternalTexDsl.g:773:1: ( RULE_KOMMA )
            {
            // InternalTexDsl.g:773:1: ( RULE_KOMMA )
            // InternalTexDsl.g:774:2: RULE_KOMMA
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getKOMMATerminalRuleCall_1_2_0()); 
            }
            match(input,RULE_KOMMA,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getKOMMATerminalRuleCall_1_2_0()); 
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
    // $ANTLR end "rule__Command__Group_1_2__0__Impl"


    // $ANTLR start "rule__Command__Group_1_2__1"
    // InternalTexDsl.g:783:1: rule__Command__Group_1_2__1 : rule__Command__Group_1_2__1__Impl ;
    public final void rule__Command__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:787:1: ( rule__Command__Group_1_2__1__Impl )
            // InternalTexDsl.g:788:2: rule__Command__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Command__Group_1_2__1__Impl();

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
    // $ANTLR end "rule__Command__Group_1_2__1"


    // $ANTLR start "rule__Command__Group_1_2__1__Impl"
    // InternalTexDsl.g:794:1: rule__Command__Group_1_2__1__Impl : ( ( rule__Command__AttrsAssignment_1_2_1 ) ) ;
    public final void rule__Command__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:798:1: ( ( ( rule__Command__AttrsAssignment_1_2_1 ) ) )
            // InternalTexDsl.g:799:1: ( ( rule__Command__AttrsAssignment_1_2_1 ) )
            {
            // InternalTexDsl.g:799:1: ( ( rule__Command__AttrsAssignment_1_2_1 ) )
            // InternalTexDsl.g:800:2: ( rule__Command__AttrsAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getAttrsAssignment_1_2_1()); 
            }
            // InternalTexDsl.g:801:2: ( rule__Command__AttrsAssignment_1_2_1 )
            // InternalTexDsl.g:801:3: rule__Command__AttrsAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Command__AttrsAssignment_1_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getAttrsAssignment_1_2_1()); 
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
    // $ANTLR end "rule__Command__Group_1_2__1__Impl"


    // $ANTLR start "rule__Command__Group_2__0"
    // InternalTexDsl.g:810:1: rule__Command__Group_2__0 : rule__Command__Group_2__0__Impl rule__Command__Group_2__1 ;
    public final void rule__Command__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:814:1: ( rule__Command__Group_2__0__Impl rule__Command__Group_2__1 )
            // InternalTexDsl.g:815:2: rule__Command__Group_2__0__Impl rule__Command__Group_2__1
            {
            pushFollow(FOLLOW_11);
            rule__Command__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Command__Group_2__1();

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
    // $ANTLR end "rule__Command__Group_2__0"


    // $ANTLR start "rule__Command__Group_2__0__Impl"
    // InternalTexDsl.g:822:1: rule__Command__Group_2__0__Impl : ( RULE_CUBO ) ;
    public final void rule__Command__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:826:1: ( ( RULE_CUBO ) )
            // InternalTexDsl.g:827:1: ( RULE_CUBO )
            {
            // InternalTexDsl.g:827:1: ( RULE_CUBO )
            // InternalTexDsl.g:828:2: RULE_CUBO
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getCUBOTerminalRuleCall_2_0()); 
            }
            match(input,RULE_CUBO,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getCUBOTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__Command__Group_2__0__Impl"


    // $ANTLR start "rule__Command__Group_2__1"
    // InternalTexDsl.g:837:1: rule__Command__Group_2__1 : rule__Command__Group_2__1__Impl rule__Command__Group_2__2 ;
    public final void rule__Command__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:841:1: ( rule__Command__Group_2__1__Impl rule__Command__Group_2__2 )
            // InternalTexDsl.g:842:2: rule__Command__Group_2__1__Impl rule__Command__Group_2__2
            {
            pushFollow(FOLLOW_12);
            rule__Command__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Command__Group_2__2();

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
    // $ANTLR end "rule__Command__Group_2__1"


    // $ANTLR start "rule__Command__Group_2__1__Impl"
    // InternalTexDsl.g:849:1: rule__Command__Group_2__1__Impl : ( ( rule__Command__TokensAssignment_2_1 ) ) ;
    public final void rule__Command__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:853:1: ( ( ( rule__Command__TokensAssignment_2_1 ) ) )
            // InternalTexDsl.g:854:1: ( ( rule__Command__TokensAssignment_2_1 ) )
            {
            // InternalTexDsl.g:854:1: ( ( rule__Command__TokensAssignment_2_1 ) )
            // InternalTexDsl.g:855:2: ( rule__Command__TokensAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getTokensAssignment_2_1()); 
            }
            // InternalTexDsl.g:856:2: ( rule__Command__TokensAssignment_2_1 )
            // InternalTexDsl.g:856:3: rule__Command__TokensAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Command__TokensAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getTokensAssignment_2_1()); 
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
    // InternalTexDsl.g:864:1: rule__Command__Group_2__2 : rule__Command__Group_2__2__Impl rule__Command__Group_2__3 ;
    public final void rule__Command__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:868:1: ( rule__Command__Group_2__2__Impl rule__Command__Group_2__3 )
            // InternalTexDsl.g:869:2: rule__Command__Group_2__2__Impl rule__Command__Group_2__3
            {
            pushFollow(FOLLOW_12);
            rule__Command__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Command__Group_2__3();

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
    // $ANTLR end "rule__Command__Group_2__2"


    // $ANTLR start "rule__Command__Group_2__2__Impl"
    // InternalTexDsl.g:876:1: rule__Command__Group_2__2__Impl : ( ( rule__Command__Group_2_2__0 )* ) ;
    public final void rule__Command__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:880:1: ( ( ( rule__Command__Group_2_2__0 )* ) )
            // InternalTexDsl.g:881:1: ( ( rule__Command__Group_2_2__0 )* )
            {
            // InternalTexDsl.g:881:1: ( ( rule__Command__Group_2_2__0 )* )
            // InternalTexDsl.g:882:2: ( rule__Command__Group_2_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getGroup_2_2()); 
            }
            // InternalTexDsl.g:883:2: ( rule__Command__Group_2_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_PIPE && LA14_0<=RULE_EXCL)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalTexDsl.g:883:3: rule__Command__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Command__Group_2_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getGroup_2_2()); 
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
    // $ANTLR end "rule__Command__Group_2__2__Impl"


    // $ANTLR start "rule__Command__Group_2__3"
    // InternalTexDsl.g:891:1: rule__Command__Group_2__3 : rule__Command__Group_2__3__Impl ;
    public final void rule__Command__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:895:1: ( rule__Command__Group_2__3__Impl )
            // InternalTexDsl.g:896:2: rule__Command__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Command__Group_2__3__Impl();

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
    // $ANTLR end "rule__Command__Group_2__3"


    // $ANTLR start "rule__Command__Group_2__3__Impl"
    // InternalTexDsl.g:902:1: rule__Command__Group_2__3__Impl : ( RULE_CUBC ) ;
    public final void rule__Command__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:906:1: ( ( RULE_CUBC ) )
            // InternalTexDsl.g:907:1: ( RULE_CUBC )
            {
            // InternalTexDsl.g:907:1: ( RULE_CUBC )
            // InternalTexDsl.g:908:2: RULE_CUBC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getCUBCTerminalRuleCall_2_3()); 
            }
            match(input,RULE_CUBC,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getCUBCTerminalRuleCall_2_3()); 
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
    // $ANTLR end "rule__Command__Group_2__3__Impl"


    // $ANTLR start "rule__Command__Group_2_2__0"
    // InternalTexDsl.g:918:1: rule__Command__Group_2_2__0 : rule__Command__Group_2_2__0__Impl rule__Command__Group_2_2__1 ;
    public final void rule__Command__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:922:1: ( rule__Command__Group_2_2__0__Impl rule__Command__Group_2_2__1 )
            // InternalTexDsl.g:923:2: rule__Command__Group_2_2__0__Impl rule__Command__Group_2_2__1
            {
            pushFollow(FOLLOW_11);
            rule__Command__Group_2_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Command__Group_2_2__1();

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
    // $ANTLR end "rule__Command__Group_2_2__0"


    // $ANTLR start "rule__Command__Group_2_2__0__Impl"
    // InternalTexDsl.g:930:1: rule__Command__Group_2_2__0__Impl : ( ( rule__Command__Alternatives_2_2_0 ) ) ;
    public final void rule__Command__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:934:1: ( ( ( rule__Command__Alternatives_2_2_0 ) ) )
            // InternalTexDsl.g:935:1: ( ( rule__Command__Alternatives_2_2_0 ) )
            {
            // InternalTexDsl.g:935:1: ( ( rule__Command__Alternatives_2_2_0 ) )
            // InternalTexDsl.g:936:2: ( rule__Command__Alternatives_2_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getAlternatives_2_2_0()); 
            }
            // InternalTexDsl.g:937:2: ( rule__Command__Alternatives_2_2_0 )
            // InternalTexDsl.g:937:3: rule__Command__Alternatives_2_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Command__Alternatives_2_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getAlternatives_2_2_0()); 
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
    // $ANTLR end "rule__Command__Group_2_2__0__Impl"


    // $ANTLR start "rule__Command__Group_2_2__1"
    // InternalTexDsl.g:945:1: rule__Command__Group_2_2__1 : rule__Command__Group_2_2__1__Impl ;
    public final void rule__Command__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:949:1: ( rule__Command__Group_2_2__1__Impl )
            // InternalTexDsl.g:950:2: rule__Command__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Command__Group_2_2__1__Impl();

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
    // $ANTLR end "rule__Command__Group_2_2__1"


    // $ANTLR start "rule__Command__Group_2_2__1__Impl"
    // InternalTexDsl.g:956:1: rule__Command__Group_2_2__1__Impl : ( ( rule__Command__TokensAssignment_2_2_1 ) ) ;
    public final void rule__Command__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:960:1: ( ( ( rule__Command__TokensAssignment_2_2_1 ) ) )
            // InternalTexDsl.g:961:1: ( ( rule__Command__TokensAssignment_2_2_1 ) )
            {
            // InternalTexDsl.g:961:1: ( ( rule__Command__TokensAssignment_2_2_1 ) )
            // InternalTexDsl.g:962:2: ( rule__Command__TokensAssignment_2_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getTokensAssignment_2_2_1()); 
            }
            // InternalTexDsl.g:963:2: ( rule__Command__TokensAssignment_2_2_1 )
            // InternalTexDsl.g:963:3: rule__Command__TokensAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Command__TokensAssignment_2_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getTokensAssignment_2_2_1()); 
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
    // $ANTLR end "rule__Command__Group_2_2__1__Impl"


    // $ANTLR start "rule__CommandExt__Group__0"
    // InternalTexDsl.g:972:1: rule__CommandExt__Group__0 : rule__CommandExt__Group__0__Impl rule__CommandExt__Group__1 ;
    public final void rule__CommandExt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:976:1: ( rule__CommandExt__Group__0__Impl rule__CommandExt__Group__1 )
            // InternalTexDsl.g:977:2: rule__CommandExt__Group__0__Impl rule__CommandExt__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__CommandExt__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CommandExt__Group__1();

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
    // $ANTLR end "rule__CommandExt__Group__0"


    // $ANTLR start "rule__CommandExt__Group__0__Impl"
    // InternalTexDsl.g:984:1: rule__CommandExt__Group__0__Impl : ( ( rule__CommandExt__CommandAssignment_0 ) ) ;
    public final void rule__CommandExt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:988:1: ( ( ( rule__CommandExt__CommandAssignment_0 ) ) )
            // InternalTexDsl.g:989:1: ( ( rule__CommandExt__CommandAssignment_0 ) )
            {
            // InternalTexDsl.g:989:1: ( ( rule__CommandExt__CommandAssignment_0 ) )
            // InternalTexDsl.g:990:2: ( rule__CommandExt__CommandAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandExtAccess().getCommandAssignment_0()); 
            }
            // InternalTexDsl.g:991:2: ( rule__CommandExt__CommandAssignment_0 )
            // InternalTexDsl.g:991:3: rule__CommandExt__CommandAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CommandExt__CommandAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandExtAccess().getCommandAssignment_0()); 
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
    // $ANTLR end "rule__CommandExt__Group__0__Impl"


    // $ANTLR start "rule__CommandExt__Group__1"
    // InternalTexDsl.g:999:1: rule__CommandExt__Group__1 : rule__CommandExt__Group__1__Impl ;
    public final void rule__CommandExt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1003:1: ( rule__CommandExt__Group__1__Impl )
            // InternalTexDsl.g:1004:2: rule__CommandExt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommandExt__Group__1__Impl();

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
    // $ANTLR end "rule__CommandExt__Group__1"


    // $ANTLR start "rule__CommandExt__Group__1__Impl"
    // InternalTexDsl.g:1010:1: rule__CommandExt__Group__1__Impl : ( ( rule__CommandExt__Group_1__0 ) ) ;
    public final void rule__CommandExt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1014:1: ( ( ( rule__CommandExt__Group_1__0 ) ) )
            // InternalTexDsl.g:1015:1: ( ( rule__CommandExt__Group_1__0 ) )
            {
            // InternalTexDsl.g:1015:1: ( ( rule__CommandExt__Group_1__0 ) )
            // InternalTexDsl.g:1016:2: ( rule__CommandExt__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandExtAccess().getGroup_1()); 
            }
            // InternalTexDsl.g:1017:2: ( rule__CommandExt__Group_1__0 )
            // InternalTexDsl.g:1017:3: rule__CommandExt__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__CommandExt__Group_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandExtAccess().getGroup_1()); 
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
    // $ANTLR end "rule__CommandExt__Group__1__Impl"


    // $ANTLR start "rule__CommandExt__Group_1__0"
    // InternalTexDsl.g:1026:1: rule__CommandExt__Group_1__0 : rule__CommandExt__Group_1__0__Impl rule__CommandExt__Group_1__1 ;
    public final void rule__CommandExt__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1030:1: ( rule__CommandExt__Group_1__0__Impl rule__CommandExt__Group_1__1 )
            // InternalTexDsl.g:1031:2: rule__CommandExt__Group_1__0__Impl rule__CommandExt__Group_1__1
            {
            pushFollow(FOLLOW_11);
            rule__CommandExt__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CommandExt__Group_1__1();

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
    // $ANTLR end "rule__CommandExt__Group_1__0"


    // $ANTLR start "rule__CommandExt__Group_1__0__Impl"
    // InternalTexDsl.g:1038:1: rule__CommandExt__Group_1__0__Impl : ( RULE_CUBO ) ;
    public final void rule__CommandExt__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1042:1: ( ( RULE_CUBO ) )
            // InternalTexDsl.g:1043:1: ( RULE_CUBO )
            {
            // InternalTexDsl.g:1043:1: ( RULE_CUBO )
            // InternalTexDsl.g:1044:2: RULE_CUBO
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandExtAccess().getCUBOTerminalRuleCall_1_0()); 
            }
            match(input,RULE_CUBO,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandExtAccess().getCUBOTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__CommandExt__Group_1__0__Impl"


    // $ANTLR start "rule__CommandExt__Group_1__1"
    // InternalTexDsl.g:1053:1: rule__CommandExt__Group_1__1 : rule__CommandExt__Group_1__1__Impl rule__CommandExt__Group_1__2 ;
    public final void rule__CommandExt__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1057:1: ( rule__CommandExt__Group_1__1__Impl rule__CommandExt__Group_1__2 )
            // InternalTexDsl.g:1058:2: rule__CommandExt__Group_1__1__Impl rule__CommandExt__Group_1__2
            {
            pushFollow(FOLLOW_15);
            rule__CommandExt__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CommandExt__Group_1__2();

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
    // $ANTLR end "rule__CommandExt__Group_1__1"


    // $ANTLR start "rule__CommandExt__Group_1__1__Impl"
    // InternalTexDsl.g:1065:1: rule__CommandExt__Group_1__1__Impl : ( ( rule__CommandExt__TokensAssignment_1_1 ) ) ;
    public final void rule__CommandExt__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1069:1: ( ( ( rule__CommandExt__TokensAssignment_1_1 ) ) )
            // InternalTexDsl.g:1070:1: ( ( rule__CommandExt__TokensAssignment_1_1 ) )
            {
            // InternalTexDsl.g:1070:1: ( ( rule__CommandExt__TokensAssignment_1_1 ) )
            // InternalTexDsl.g:1071:2: ( rule__CommandExt__TokensAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandExtAccess().getTokensAssignment_1_1()); 
            }
            // InternalTexDsl.g:1072:2: ( rule__CommandExt__TokensAssignment_1_1 )
            // InternalTexDsl.g:1072:3: rule__CommandExt__TokensAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CommandExt__TokensAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandExtAccess().getTokensAssignment_1_1()); 
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
    // $ANTLR end "rule__CommandExt__Group_1__1__Impl"


    // $ANTLR start "rule__CommandExt__Group_1__2"
    // InternalTexDsl.g:1080:1: rule__CommandExt__Group_1__2 : rule__CommandExt__Group_1__2__Impl rule__CommandExt__Group_1__3 ;
    public final void rule__CommandExt__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1084:1: ( rule__CommandExt__Group_1__2__Impl rule__CommandExt__Group_1__3 )
            // InternalTexDsl.g:1085:2: rule__CommandExt__Group_1__2__Impl rule__CommandExt__Group_1__3
            {
            pushFollow(FOLLOW_15);
            rule__CommandExt__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CommandExt__Group_1__3();

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
    // $ANTLR end "rule__CommandExt__Group_1__2"


    // $ANTLR start "rule__CommandExt__Group_1__2__Impl"
    // InternalTexDsl.g:1092:1: rule__CommandExt__Group_1__2__Impl : ( ( rule__CommandExt__Group_1_2__0 )* ) ;
    public final void rule__CommandExt__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1096:1: ( ( ( rule__CommandExt__Group_1_2__0 )* ) )
            // InternalTexDsl.g:1097:1: ( ( rule__CommandExt__Group_1_2__0 )* )
            {
            // InternalTexDsl.g:1097:1: ( ( rule__CommandExt__Group_1_2__0 )* )
            // InternalTexDsl.g:1098:2: ( rule__CommandExt__Group_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandExtAccess().getGroup_1_2()); 
            }
            // InternalTexDsl.g:1099:2: ( rule__CommandExt__Group_1_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_KOMMA) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalTexDsl.g:1099:3: rule__CommandExt__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__CommandExt__Group_1_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandExtAccess().getGroup_1_2()); 
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
    // $ANTLR end "rule__CommandExt__Group_1__2__Impl"


    // $ANTLR start "rule__CommandExt__Group_1__3"
    // InternalTexDsl.g:1107:1: rule__CommandExt__Group_1__3 : rule__CommandExt__Group_1__3__Impl ;
    public final void rule__CommandExt__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1111:1: ( rule__CommandExt__Group_1__3__Impl )
            // InternalTexDsl.g:1112:2: rule__CommandExt__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommandExt__Group_1__3__Impl();

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
    // $ANTLR end "rule__CommandExt__Group_1__3"


    // $ANTLR start "rule__CommandExt__Group_1__3__Impl"
    // InternalTexDsl.g:1118:1: rule__CommandExt__Group_1__3__Impl : ( RULE_CUBC ) ;
    public final void rule__CommandExt__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1122:1: ( ( RULE_CUBC ) )
            // InternalTexDsl.g:1123:1: ( RULE_CUBC )
            {
            // InternalTexDsl.g:1123:1: ( RULE_CUBC )
            // InternalTexDsl.g:1124:2: RULE_CUBC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandExtAccess().getCUBCTerminalRuleCall_1_3()); 
            }
            match(input,RULE_CUBC,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandExtAccess().getCUBCTerminalRuleCall_1_3()); 
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
    // $ANTLR end "rule__CommandExt__Group_1__3__Impl"


    // $ANTLR start "rule__CommandExt__Group_1_2__0"
    // InternalTexDsl.g:1134:1: rule__CommandExt__Group_1_2__0 : rule__CommandExt__Group_1_2__0__Impl rule__CommandExt__Group_1_2__1 ;
    public final void rule__CommandExt__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1138:1: ( rule__CommandExt__Group_1_2__0__Impl rule__CommandExt__Group_1_2__1 )
            // InternalTexDsl.g:1139:2: rule__CommandExt__Group_1_2__0__Impl rule__CommandExt__Group_1_2__1
            {
            pushFollow(FOLLOW_11);
            rule__CommandExt__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CommandExt__Group_1_2__1();

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
    // $ANTLR end "rule__CommandExt__Group_1_2__0"


    // $ANTLR start "rule__CommandExt__Group_1_2__0__Impl"
    // InternalTexDsl.g:1146:1: rule__CommandExt__Group_1_2__0__Impl : ( RULE_KOMMA ) ;
    public final void rule__CommandExt__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1150:1: ( ( RULE_KOMMA ) )
            // InternalTexDsl.g:1151:1: ( RULE_KOMMA )
            {
            // InternalTexDsl.g:1151:1: ( RULE_KOMMA )
            // InternalTexDsl.g:1152:2: RULE_KOMMA
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandExtAccess().getKOMMATerminalRuleCall_1_2_0()); 
            }
            match(input,RULE_KOMMA,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandExtAccess().getKOMMATerminalRuleCall_1_2_0()); 
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
    // $ANTLR end "rule__CommandExt__Group_1_2__0__Impl"


    // $ANTLR start "rule__CommandExt__Group_1_2__1"
    // InternalTexDsl.g:1161:1: rule__CommandExt__Group_1_2__1 : rule__CommandExt__Group_1_2__1__Impl ;
    public final void rule__CommandExt__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1165:1: ( rule__CommandExt__Group_1_2__1__Impl )
            // InternalTexDsl.g:1166:2: rule__CommandExt__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommandExt__Group_1_2__1__Impl();

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
    // $ANTLR end "rule__CommandExt__Group_1_2__1"


    // $ANTLR start "rule__CommandExt__Group_1_2__1__Impl"
    // InternalTexDsl.g:1172:1: rule__CommandExt__Group_1_2__1__Impl : ( ( rule__CommandExt__TokensAssignment_1_2_1 ) ) ;
    public final void rule__CommandExt__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1176:1: ( ( ( rule__CommandExt__TokensAssignment_1_2_1 ) ) )
            // InternalTexDsl.g:1177:1: ( ( rule__CommandExt__TokensAssignment_1_2_1 ) )
            {
            // InternalTexDsl.g:1177:1: ( ( rule__CommandExt__TokensAssignment_1_2_1 ) )
            // InternalTexDsl.g:1178:2: ( rule__CommandExt__TokensAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandExtAccess().getTokensAssignment_1_2_1()); 
            }
            // InternalTexDsl.g:1179:2: ( rule__CommandExt__TokensAssignment_1_2_1 )
            // InternalTexDsl.g:1179:3: rule__CommandExt__TokensAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__CommandExt__TokensAssignment_1_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandExtAccess().getTokensAssignment_1_2_1()); 
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
    // $ANTLR end "rule__CommandExt__Group_1_2__1__Impl"


    // $ANTLR start "rule__Attributes__Group__0"
    // InternalTexDsl.g:1188:1: rule__Attributes__Group__0 : rule__Attributes__Group__0__Impl rule__Attributes__Group__1 ;
    public final void rule__Attributes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1192:1: ( rule__Attributes__Group__0__Impl rule__Attributes__Group__1 )
            // InternalTexDsl.g:1193:2: rule__Attributes__Group__0__Impl rule__Attributes__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Attributes__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Attributes__Group__1();

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
    // $ANTLR end "rule__Attributes__Group__0"


    // $ANTLR start "rule__Attributes__Group__0__Impl"
    // InternalTexDsl.g:1200:1: rule__Attributes__Group__0__Impl : ( ( rule__Attributes__KeyAssignment_0 ) ) ;
    public final void rule__Attributes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1204:1: ( ( ( rule__Attributes__KeyAssignment_0 ) ) )
            // InternalTexDsl.g:1205:1: ( ( rule__Attributes__KeyAssignment_0 ) )
            {
            // InternalTexDsl.g:1205:1: ( ( rule__Attributes__KeyAssignment_0 ) )
            // InternalTexDsl.g:1206:2: ( rule__Attributes__KeyAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributesAccess().getKeyAssignment_0()); 
            }
            // InternalTexDsl.g:1207:2: ( rule__Attributes__KeyAssignment_0 )
            // InternalTexDsl.g:1207:3: rule__Attributes__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Attributes__KeyAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributesAccess().getKeyAssignment_0()); 
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
    // $ANTLR end "rule__Attributes__Group__0__Impl"


    // $ANTLR start "rule__Attributes__Group__1"
    // InternalTexDsl.g:1215:1: rule__Attributes__Group__1 : rule__Attributes__Group__1__Impl ;
    public final void rule__Attributes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1219:1: ( rule__Attributes__Group__1__Impl )
            // InternalTexDsl.g:1220:2: rule__Attributes__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attributes__Group__1__Impl();

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
    // $ANTLR end "rule__Attributes__Group__1"


    // $ANTLR start "rule__Attributes__Group__1__Impl"
    // InternalTexDsl.g:1226:1: rule__Attributes__Group__1__Impl : ( ( rule__Attributes__Group_1__0 )? ) ;
    public final void rule__Attributes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1230:1: ( ( ( rule__Attributes__Group_1__0 )? ) )
            // InternalTexDsl.g:1231:1: ( ( rule__Attributes__Group_1__0 )? )
            {
            // InternalTexDsl.g:1231:1: ( ( rule__Attributes__Group_1__0 )? )
            // InternalTexDsl.g:1232:2: ( rule__Attributes__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributesAccess().getGroup_1()); 
            }
            // InternalTexDsl.g:1233:2: ( rule__Attributes__Group_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_EQ) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalTexDsl.g:1233:3: rule__Attributes__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attributes__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributesAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Attributes__Group__1__Impl"


    // $ANTLR start "rule__Attributes__Group_1__0"
    // InternalTexDsl.g:1242:1: rule__Attributes__Group_1__0 : rule__Attributes__Group_1__0__Impl rule__Attributes__Group_1__1 ;
    public final void rule__Attributes__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1246:1: ( rule__Attributes__Group_1__0__Impl rule__Attributes__Group_1__1 )
            // InternalTexDsl.g:1247:2: rule__Attributes__Group_1__0__Impl rule__Attributes__Group_1__1
            {
            pushFollow(FOLLOW_17);
            rule__Attributes__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Attributes__Group_1__1();

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
    // $ANTLR end "rule__Attributes__Group_1__0"


    // $ANTLR start "rule__Attributes__Group_1__0__Impl"
    // InternalTexDsl.g:1254:1: rule__Attributes__Group_1__0__Impl : ( RULE_EQ ) ;
    public final void rule__Attributes__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1258:1: ( ( RULE_EQ ) )
            // InternalTexDsl.g:1259:1: ( RULE_EQ )
            {
            // InternalTexDsl.g:1259:1: ( RULE_EQ )
            // InternalTexDsl.g:1260:2: RULE_EQ
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributesAccess().getEQTerminalRuleCall_1_0()); 
            }
            match(input,RULE_EQ,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributesAccess().getEQTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Attributes__Group_1__0__Impl"


    // $ANTLR start "rule__Attributes__Group_1__1"
    // InternalTexDsl.g:1269:1: rule__Attributes__Group_1__1 : rule__Attributes__Group_1__1__Impl ;
    public final void rule__Attributes__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1273:1: ( rule__Attributes__Group_1__1__Impl )
            // InternalTexDsl.g:1274:2: rule__Attributes__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attributes__Group_1__1__Impl();

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
    // $ANTLR end "rule__Attributes__Group_1__1"


    // $ANTLR start "rule__Attributes__Group_1__1__Impl"
    // InternalTexDsl.g:1280:1: rule__Attributes__Group_1__1__Impl : ( ( rule__Attributes__Alternatives_1_1 ) ) ;
    public final void rule__Attributes__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1284:1: ( ( ( rule__Attributes__Alternatives_1_1 ) ) )
            // InternalTexDsl.g:1285:1: ( ( rule__Attributes__Alternatives_1_1 ) )
            {
            // InternalTexDsl.g:1285:1: ( ( rule__Attributes__Alternatives_1_1 ) )
            // InternalTexDsl.g:1286:2: ( rule__Attributes__Alternatives_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributesAccess().getAlternatives_1_1()); 
            }
            // InternalTexDsl.g:1287:2: ( rule__Attributes__Alternatives_1_1 )
            // InternalTexDsl.g:1287:3: rule__Attributes__Alternatives_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Attributes__Alternatives_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributesAccess().getAlternatives_1_1()); 
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
    // $ANTLR end "rule__Attributes__Group_1__1__Impl"


    // $ANTLR start "rule__Attributes__Group_1_1_0__0"
    // InternalTexDsl.g:1296:1: rule__Attributes__Group_1_1_0__0 : rule__Attributes__Group_1_1_0__0__Impl rule__Attributes__Group_1_1_0__1 ;
    public final void rule__Attributes__Group_1_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1300:1: ( rule__Attributes__Group_1_1_0__0__Impl rule__Attributes__Group_1_1_0__1 )
            // InternalTexDsl.g:1301:2: rule__Attributes__Group_1_1_0__0__Impl rule__Attributes__Group_1_1_0__1
            {
            pushFollow(FOLLOW_8);
            rule__Attributes__Group_1_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Attributes__Group_1_1_0__1();

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
    // $ANTLR end "rule__Attributes__Group_1_1_0__0"


    // $ANTLR start "rule__Attributes__Group_1_1_0__0__Impl"
    // InternalTexDsl.g:1308:1: rule__Attributes__Group_1_1_0__0__Impl : ( RULE_CUBO ) ;
    public final void rule__Attributes__Group_1_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1312:1: ( ( RULE_CUBO ) )
            // InternalTexDsl.g:1313:1: ( RULE_CUBO )
            {
            // InternalTexDsl.g:1313:1: ( RULE_CUBO )
            // InternalTexDsl.g:1314:2: RULE_CUBO
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributesAccess().getCUBOTerminalRuleCall_1_1_0_0()); 
            }
            match(input,RULE_CUBO,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributesAccess().getCUBOTerminalRuleCall_1_1_0_0()); 
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
    // $ANTLR end "rule__Attributes__Group_1_1_0__0__Impl"


    // $ANTLR start "rule__Attributes__Group_1_1_0__1"
    // InternalTexDsl.g:1323:1: rule__Attributes__Group_1_1_0__1 : rule__Attributes__Group_1_1_0__1__Impl rule__Attributes__Group_1_1_0__2 ;
    public final void rule__Attributes__Group_1_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1327:1: ( rule__Attributes__Group_1_1_0__1__Impl rule__Attributes__Group_1_1_0__2 )
            // InternalTexDsl.g:1328:2: rule__Attributes__Group_1_1_0__1__Impl rule__Attributes__Group_1_1_0__2
            {
            pushFollow(FOLLOW_18);
            rule__Attributes__Group_1_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Attributes__Group_1_1_0__2();

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
    // $ANTLR end "rule__Attributes__Group_1_1_0__1"


    // $ANTLR start "rule__Attributes__Group_1_1_0__1__Impl"
    // InternalTexDsl.g:1335:1: rule__Attributes__Group_1_1_0__1__Impl : ( ( ( rule__Attributes__MultiAssignment_1_1_0_1 ) ) ( ( rule__Attributes__MultiAssignment_1_1_0_1 )* ) ) ;
    public final void rule__Attributes__Group_1_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1339:1: ( ( ( ( rule__Attributes__MultiAssignment_1_1_0_1 ) ) ( ( rule__Attributes__MultiAssignment_1_1_0_1 )* ) ) )
            // InternalTexDsl.g:1340:1: ( ( ( rule__Attributes__MultiAssignment_1_1_0_1 ) ) ( ( rule__Attributes__MultiAssignment_1_1_0_1 )* ) )
            {
            // InternalTexDsl.g:1340:1: ( ( ( rule__Attributes__MultiAssignment_1_1_0_1 ) ) ( ( rule__Attributes__MultiAssignment_1_1_0_1 )* ) )
            // InternalTexDsl.g:1341:2: ( ( rule__Attributes__MultiAssignment_1_1_0_1 ) ) ( ( rule__Attributes__MultiAssignment_1_1_0_1 )* )
            {
            // InternalTexDsl.g:1341:2: ( ( rule__Attributes__MultiAssignment_1_1_0_1 ) )
            // InternalTexDsl.g:1342:3: ( rule__Attributes__MultiAssignment_1_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributesAccess().getMultiAssignment_1_1_0_1()); 
            }
            // InternalTexDsl.g:1343:3: ( rule__Attributes__MultiAssignment_1_1_0_1 )
            // InternalTexDsl.g:1343:4: rule__Attributes__MultiAssignment_1_1_0_1
            {
            pushFollow(FOLLOW_4);
            rule__Attributes__MultiAssignment_1_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributesAccess().getMultiAssignment_1_1_0_1()); 
            }

            }

            // InternalTexDsl.g:1346:2: ( ( rule__Attributes__MultiAssignment_1_1_0_1 )* )
            // InternalTexDsl.g:1347:3: ( rule__Attributes__MultiAssignment_1_1_0_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributesAccess().getMultiAssignment_1_1_0_1()); 
            }
            // InternalTexDsl.g:1348:3: ( rule__Attributes__MultiAssignment_1_1_0_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalTexDsl.g:1348:4: rule__Attributes__MultiAssignment_1_1_0_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Attributes__MultiAssignment_1_1_0_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributesAccess().getMultiAssignment_1_1_0_1()); 
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
    // $ANTLR end "rule__Attributes__Group_1_1_0__1__Impl"


    // $ANTLR start "rule__Attributes__Group_1_1_0__2"
    // InternalTexDsl.g:1357:1: rule__Attributes__Group_1_1_0__2 : rule__Attributes__Group_1_1_0__2__Impl ;
    public final void rule__Attributes__Group_1_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1361:1: ( rule__Attributes__Group_1_1_0__2__Impl )
            // InternalTexDsl.g:1362:2: rule__Attributes__Group_1_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attributes__Group_1_1_0__2__Impl();

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
    // $ANTLR end "rule__Attributes__Group_1_1_0__2"


    // $ANTLR start "rule__Attributes__Group_1_1_0__2__Impl"
    // InternalTexDsl.g:1368:1: rule__Attributes__Group_1_1_0__2__Impl : ( RULE_CUBC ) ;
    public final void rule__Attributes__Group_1_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1372:1: ( ( RULE_CUBC ) )
            // InternalTexDsl.g:1373:1: ( RULE_CUBC )
            {
            // InternalTexDsl.g:1373:1: ( RULE_CUBC )
            // InternalTexDsl.g:1374:2: RULE_CUBC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributesAccess().getCUBCTerminalRuleCall_1_1_0_2()); 
            }
            match(input,RULE_CUBC,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributesAccess().getCUBCTerminalRuleCall_1_1_0_2()); 
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
    // $ANTLR end "rule__Attributes__Group_1_1_0__2__Impl"


    // $ANTLR start "rule__Model__DocumentAssignment"
    // InternalTexDsl.g:1384:1: rule__Model__DocumentAssignment : ( ruleDocument ) ;
    public final void rule__Model__DocumentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1388:1: ( ( ruleDocument ) )
            // InternalTexDsl.g:1389:2: ( ruleDocument )
            {
            // InternalTexDsl.g:1389:2: ( ruleDocument )
            // InternalTexDsl.g:1390:3: ruleDocument
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getDocumentDocumentParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDocument();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getDocumentDocumentParserRuleCall_0()); 
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
    // $ANTLR end "rule__Model__DocumentAssignment"


    // $ANTLR start "rule__Text__TokenAssignment"
    // InternalTexDsl.g:1399:1: rule__Text__TokenAssignment : ( ruleAnyText ) ;
    public final void rule__Text__TokenAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1403:1: ( ( ruleAnyText ) )
            // InternalTexDsl.g:1404:2: ( ruleAnyText )
            {
            // InternalTexDsl.g:1404:2: ( ruleAnyText )
            // InternalTexDsl.g:1405:3: ruleAnyText
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextAccess().getTokenAnyTextParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAnyText();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextAccess().getTokenAnyTextParserRuleCall_0()); 
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
    // $ANTLR end "rule__Text__TokenAssignment"


    // $ANTLR start "rule__Command__CommandAssignment_0"
    // InternalTexDsl.g:1414:1: rule__Command__CommandAssignment_0 : ( RULE_ID_COMM ) ;
    public final void rule__Command__CommandAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1418:1: ( ( RULE_ID_COMM ) )
            // InternalTexDsl.g:1419:2: ( RULE_ID_COMM )
            {
            // InternalTexDsl.g:1419:2: ( RULE_ID_COMM )
            // InternalTexDsl.g:1420:3: RULE_ID_COMM
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getCommandID_COMMTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID_COMM,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getCommandID_COMMTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__Command__CommandAssignment_0"


    // $ANTLR start "rule__Command__AttrsAssignment_1_1"
    // InternalTexDsl.g:1429:1: rule__Command__AttrsAssignment_1_1 : ( ruleAttributes ) ;
    public final void rule__Command__AttrsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1433:1: ( ( ruleAttributes ) )
            // InternalTexDsl.g:1434:2: ( ruleAttributes )
            {
            // InternalTexDsl.g:1434:2: ( ruleAttributes )
            // InternalTexDsl.g:1435:3: ruleAttributes
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getAttrsAttributesParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAttributes();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getAttrsAttributesParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__Command__AttrsAssignment_1_1"


    // $ANTLR start "rule__Command__AttrsAssignment_1_2_1"
    // InternalTexDsl.g:1444:1: rule__Command__AttrsAssignment_1_2_1 : ( ruleAttributes ) ;
    public final void rule__Command__AttrsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1448:1: ( ( ruleAttributes ) )
            // InternalTexDsl.g:1449:2: ( ruleAttributes )
            {
            // InternalTexDsl.g:1449:2: ( ruleAttributes )
            // InternalTexDsl.g:1450:3: ruleAttributes
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getAttrsAttributesParserRuleCall_1_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAttributes();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getAttrsAttributesParserRuleCall_1_2_1_0()); 
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
    // $ANTLR end "rule__Command__AttrsAssignment_1_2_1"


    // $ANTLR start "rule__Command__TokensAssignment_2_1"
    // InternalTexDsl.g:1459:1: rule__Command__TokensAssignment_2_1 : ( ruleCompound ) ;
    public final void rule__Command__TokensAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1463:1: ( ( ruleCompound ) )
            // InternalTexDsl.g:1464:2: ( ruleCompound )
            {
            // InternalTexDsl.g:1464:2: ( ruleCompound )
            // InternalTexDsl.g:1465:3: ruleCompound
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getTokensCompoundParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCompound();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getTokensCompoundParserRuleCall_2_1_0()); 
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
    // $ANTLR end "rule__Command__TokensAssignment_2_1"


    // $ANTLR start "rule__Command__TokensAssignment_2_2_1"
    // InternalTexDsl.g:1474:1: rule__Command__TokensAssignment_2_2_1 : ( ruleCompound ) ;
    public final void rule__Command__TokensAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1478:1: ( ( ruleCompound ) )
            // InternalTexDsl.g:1479:2: ( ruleCompound )
            {
            // InternalTexDsl.g:1479:2: ( ruleCompound )
            // InternalTexDsl.g:1480:3: ruleCompound
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getTokensCompoundParserRuleCall_2_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCompound();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getTokensCompoundParserRuleCall_2_2_1_0()); 
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
    // $ANTLR end "rule__Command__TokensAssignment_2_2_1"


    // $ANTLR start "rule__Multi__TokensAssignment"
    // InternalTexDsl.g:1489:1: rule__Multi__TokensAssignment : ( RULE_ID ) ;
    public final void rule__Multi__TokensAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1493:1: ( ( RULE_ID ) )
            // InternalTexDsl.g:1494:2: ( RULE_ID )
            {
            // InternalTexDsl.g:1494:2: ( RULE_ID )
            // InternalTexDsl.g:1495:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiAccess().getTokensIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiAccess().getTokensIDTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__Multi__TokensAssignment"


    // $ANTLR start "rule__CommandExt__CommandAssignment_0"
    // InternalTexDsl.g:1504:1: rule__CommandExt__CommandAssignment_0 : ( ( rule__CommandExt__CommandAlternatives_0_0 ) ) ;
    public final void rule__CommandExt__CommandAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1508:1: ( ( ( rule__CommandExt__CommandAlternatives_0_0 ) ) )
            // InternalTexDsl.g:1509:2: ( ( rule__CommandExt__CommandAlternatives_0_0 ) )
            {
            // InternalTexDsl.g:1509:2: ( ( rule__CommandExt__CommandAlternatives_0_0 ) )
            // InternalTexDsl.g:1510:3: ( rule__CommandExt__CommandAlternatives_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandExtAccess().getCommandAlternatives_0_0()); 
            }
            // InternalTexDsl.g:1511:3: ( rule__CommandExt__CommandAlternatives_0_0 )
            // InternalTexDsl.g:1511:4: rule__CommandExt__CommandAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__CommandExt__CommandAlternatives_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandExtAccess().getCommandAlternatives_0_0()); 
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
    // $ANTLR end "rule__CommandExt__CommandAssignment_0"


    // $ANTLR start "rule__CommandExt__TokensAssignment_1_1"
    // InternalTexDsl.g:1519:1: rule__CommandExt__TokensAssignment_1_1 : ( ruleCompound ) ;
    public final void rule__CommandExt__TokensAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1523:1: ( ( ruleCompound ) )
            // InternalTexDsl.g:1524:2: ( ruleCompound )
            {
            // InternalTexDsl.g:1524:2: ( ruleCompound )
            // InternalTexDsl.g:1525:3: ruleCompound
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandExtAccess().getTokensCompoundParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCompound();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandExtAccess().getTokensCompoundParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__CommandExt__TokensAssignment_1_1"


    // $ANTLR start "rule__CommandExt__TokensAssignment_1_2_1"
    // InternalTexDsl.g:1534:1: rule__CommandExt__TokensAssignment_1_2_1 : ( ruleCompound ) ;
    public final void rule__CommandExt__TokensAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1538:1: ( ( ruleCompound ) )
            // InternalTexDsl.g:1539:2: ( ruleCompound )
            {
            // InternalTexDsl.g:1539:2: ( ruleCompound )
            // InternalTexDsl.g:1540:3: ruleCompound
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandExtAccess().getTokensCompoundParserRuleCall_1_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCompound();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandExtAccess().getTokensCompoundParserRuleCall_1_2_1_0()); 
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
    // $ANTLR end "rule__CommandExt__TokensAssignment_1_2_1"


    // $ANTLR start "rule__Extras__TokensAssignment"
    // InternalTexDsl.g:1549:1: rule__Extras__TokensAssignment : ( ( rule__Extras__TokensAlternatives_0 ) ) ;
    public final void rule__Extras__TokensAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1553:1: ( ( ( rule__Extras__TokensAlternatives_0 ) ) )
            // InternalTexDsl.g:1554:2: ( ( rule__Extras__TokensAlternatives_0 ) )
            {
            // InternalTexDsl.g:1554:2: ( ( rule__Extras__TokensAlternatives_0 ) )
            // InternalTexDsl.g:1555:3: ( rule__Extras__TokensAlternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtrasAccess().getTokensAlternatives_0()); 
            }
            // InternalTexDsl.g:1556:3: ( rule__Extras__TokensAlternatives_0 )
            // InternalTexDsl.g:1556:4: rule__Extras__TokensAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Extras__TokensAlternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtrasAccess().getTokensAlternatives_0()); 
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
    // $ANTLR end "rule__Extras__TokensAssignment"


    // $ANTLR start "rule__Attributes__KeyAssignment_0"
    // InternalTexDsl.g:1564:1: rule__Attributes__KeyAssignment_0 : ( RULE_ID ) ;
    public final void rule__Attributes__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1568:1: ( ( RULE_ID ) )
            // InternalTexDsl.g:1569:2: ( RULE_ID )
            {
            // InternalTexDsl.g:1569:2: ( RULE_ID )
            // InternalTexDsl.g:1570:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributesAccess().getKeyIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributesAccess().getKeyIDTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__Attributes__KeyAssignment_0"


    // $ANTLR start "rule__Attributes__MultiAssignment_1_1_0_1"
    // InternalTexDsl.g:1579:1: rule__Attributes__MultiAssignment_1_1_0_1 : ( ruleMulti ) ;
    public final void rule__Attributes__MultiAssignment_1_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1583:1: ( ( ruleMulti ) )
            // InternalTexDsl.g:1584:2: ( ruleMulti )
            {
            // InternalTexDsl.g:1584:2: ( ruleMulti )
            // InternalTexDsl.g:1585:3: ruleMulti
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributesAccess().getMultiMultiParserRuleCall_1_1_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMulti();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributesAccess().getMultiMultiParserRuleCall_1_1_0_1_0()); 
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
    // $ANTLR end "rule__Attributes__MultiAssignment_1_1_0_1"


    // $ANTLR start "rule__Attributes__SingleAssignment_1_1_1"
    // InternalTexDsl.g:1594:1: rule__Attributes__SingleAssignment_1_1_1 : ( RULE_ID ) ;
    public final void rule__Attributes__SingleAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTexDsl.g:1598:1: ( ( RULE_ID ) )
            // InternalTexDsl.g:1599:2: ( RULE_ID )
            {
            // InternalTexDsl.g:1599:2: ( RULE_ID )
            // InternalTexDsl.g:1600:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributesAccess().getSingleIDTerminalRuleCall_1_1_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributesAccess().getSingleIDTerminalRuleCall_1_1_1_0()); 
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
    // $ANTLR end "rule__Attributes__SingleAssignment_1_1_1"

    // $ANTLR start synpred2_InternalTexDsl
    public final void synpred2_InternalTexDsl_fragment() throws RecognitionException {   
        // InternalTexDsl.g:208:5: ( rule__Multi__TokensAssignment )
        // InternalTexDsl.g:208:5: rule__Multi__TokensAssignment
        {
        pushFollow(FOLLOW_2);
        rule__Multi__TokensAssignment();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalTexDsl

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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004FF2L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004FF0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000003810L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040180L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000182L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000040000L});

}