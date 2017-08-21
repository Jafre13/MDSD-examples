package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

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
import org.xtext.example.mydsl.services.MathDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMathDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'name'", "':'", "'='", "'+'", "'-'", "'*'", "'/'", "'('", "')'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalMathDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMathDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMathDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMathDsl.g"; }


    	private MathDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MathDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleAllExp"
    // InternalMathDsl.g:53:1: entryRuleAllExp : ruleAllExp EOF ;
    public final void entryRuleAllExp() throws RecognitionException {
        try {
            // InternalMathDsl.g:54:1: ( ruleAllExp EOF )
            // InternalMathDsl.g:55:1: ruleAllExp EOF
            {
             before(grammarAccess.getAllExpRule()); 
            pushFollow(FOLLOW_1);
            ruleAllExp();

            state._fsp--;

             after(grammarAccess.getAllExpRule()); 
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
    // $ANTLR end "entryRuleAllExp"


    // $ANTLR start "ruleAllExp"
    // InternalMathDsl.g:62:1: ruleAllExp : ( ( rule__AllExp__Group__0 ) ) ;
    public final void ruleAllExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:66:2: ( ( ( rule__AllExp__Group__0 ) ) )
            // InternalMathDsl.g:67:2: ( ( rule__AllExp__Group__0 ) )
            {
            // InternalMathDsl.g:67:2: ( ( rule__AllExp__Group__0 ) )
            // InternalMathDsl.g:68:3: ( rule__AllExp__Group__0 )
            {
             before(grammarAccess.getAllExpAccess().getGroup()); 
            // InternalMathDsl.g:69:3: ( rule__AllExp__Group__0 )
            // InternalMathDsl.g:69:4: rule__AllExp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AllExp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAllExpAccess().getGroup()); 

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
    // $ANTLR end "ruleAllExp"


    // $ANTLR start "entryRuleMathExp"
    // InternalMathDsl.g:78:1: entryRuleMathExp : ruleMathExp EOF ;
    public final void entryRuleMathExp() throws RecognitionException {
        try {
            // InternalMathDsl.g:79:1: ( ruleMathExp EOF )
            // InternalMathDsl.g:80:1: ruleMathExp EOF
            {
             before(grammarAccess.getMathExpRule()); 
            pushFollow(FOLLOW_1);
            ruleMathExp();

            state._fsp--;

             after(grammarAccess.getMathExpRule()); 
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
    // $ANTLR end "entryRuleMathExp"


    // $ANTLR start "ruleMathExp"
    // InternalMathDsl.g:87:1: ruleMathExp : ( ( rule__MathExp__Group__0 ) ) ;
    public final void ruleMathExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:91:2: ( ( ( rule__MathExp__Group__0 ) ) )
            // InternalMathDsl.g:92:2: ( ( rule__MathExp__Group__0 ) )
            {
            // InternalMathDsl.g:92:2: ( ( rule__MathExp__Group__0 ) )
            // InternalMathDsl.g:93:3: ( rule__MathExp__Group__0 )
            {
             before(grammarAccess.getMathExpAccess().getGroup()); 
            // InternalMathDsl.g:94:3: ( rule__MathExp__Group__0 )
            // InternalMathDsl.g:94:4: rule__MathExp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MathExp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMathExpAccess().getGroup()); 

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
    // $ANTLR end "ruleMathExp"


    // $ANTLR start "entryRuleExpression"
    // InternalMathDsl.g:103:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalMathDsl.g:104:1: ( ruleExpression EOF )
            // InternalMathDsl.g:105:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMathDsl.g:112:1: ruleExpression : ( ruleAddition ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:116:2: ( ( ruleAddition ) )
            // InternalMathDsl.g:117:2: ( ruleAddition )
            {
            // InternalMathDsl.g:117:2: ( ruleAddition )
            // InternalMathDsl.g:118:3: ruleAddition
            {
             before(grammarAccess.getExpressionAccess().getAdditionParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getAdditionParserRuleCall()); 

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAddition"
    // InternalMathDsl.g:128:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // InternalMathDsl.g:129:1: ( ruleAddition EOF )
            // InternalMathDsl.g:130:1: ruleAddition EOF
            {
             before(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_1);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getAdditionRule()); 
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
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalMathDsl.g:137:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:141:2: ( ( ( rule__Addition__Group__0 ) ) )
            // InternalMathDsl.g:142:2: ( ( rule__Addition__Group__0 ) )
            {
            // InternalMathDsl.g:142:2: ( ( rule__Addition__Group__0 ) )
            // InternalMathDsl.g:143:3: ( rule__Addition__Group__0 )
            {
             before(grammarAccess.getAdditionAccess().getGroup()); 
            // InternalMathDsl.g:144:3: ( rule__Addition__Group__0 )
            // InternalMathDsl.g:144:4: rule__Addition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getGroup()); 

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
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleSubtraction"
    // InternalMathDsl.g:153:1: entryRuleSubtraction : ruleSubtraction EOF ;
    public final void entryRuleSubtraction() throws RecognitionException {
        try {
            // InternalMathDsl.g:154:1: ( ruleSubtraction EOF )
            // InternalMathDsl.g:155:1: ruleSubtraction EOF
            {
             before(grammarAccess.getSubtractionRule()); 
            pushFollow(FOLLOW_1);
            ruleSubtraction();

            state._fsp--;

             after(grammarAccess.getSubtractionRule()); 
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
    // $ANTLR end "entryRuleSubtraction"


    // $ANTLR start "ruleSubtraction"
    // InternalMathDsl.g:162:1: ruleSubtraction : ( ( rule__Subtraction__Group__0 ) ) ;
    public final void ruleSubtraction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:166:2: ( ( ( rule__Subtraction__Group__0 ) ) )
            // InternalMathDsl.g:167:2: ( ( rule__Subtraction__Group__0 ) )
            {
            // InternalMathDsl.g:167:2: ( ( rule__Subtraction__Group__0 ) )
            // InternalMathDsl.g:168:3: ( rule__Subtraction__Group__0 )
            {
             before(grammarAccess.getSubtractionAccess().getGroup()); 
            // InternalMathDsl.g:169:3: ( rule__Subtraction__Group__0 )
            // InternalMathDsl.g:169:4: rule__Subtraction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Subtraction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubtractionAccess().getGroup()); 

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
    // $ANTLR end "ruleSubtraction"


    // $ANTLR start "entryRuleMultiplication"
    // InternalMathDsl.g:178:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // InternalMathDsl.g:179:1: ( ruleMultiplication EOF )
            // InternalMathDsl.g:180:1: ruleMultiplication EOF
            {
             before(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getMultiplicationRule()); 
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
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalMathDsl.g:187:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:191:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // InternalMathDsl.g:192:2: ( ( rule__Multiplication__Group__0 ) )
            {
            // InternalMathDsl.g:192:2: ( ( rule__Multiplication__Group__0 ) )
            // InternalMathDsl.g:193:3: ( rule__Multiplication__Group__0 )
            {
             before(grammarAccess.getMultiplicationAccess().getGroup()); 
            // InternalMathDsl.g:194:3: ( rule__Multiplication__Group__0 )
            // InternalMathDsl.g:194:4: rule__Multiplication__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getGroup()); 

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
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRuleDivision"
    // InternalMathDsl.g:203:1: entryRuleDivision : ruleDivision EOF ;
    public final void entryRuleDivision() throws RecognitionException {
        try {
            // InternalMathDsl.g:204:1: ( ruleDivision EOF )
            // InternalMathDsl.g:205:1: ruleDivision EOF
            {
             before(grammarAccess.getDivisionRule()); 
            pushFollow(FOLLOW_1);
            ruleDivision();

            state._fsp--;

             after(grammarAccess.getDivisionRule()); 
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
    // $ANTLR end "entryRuleDivision"


    // $ANTLR start "ruleDivision"
    // InternalMathDsl.g:212:1: ruleDivision : ( ( rule__Division__Group__0 ) ) ;
    public final void ruleDivision() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:216:2: ( ( ( rule__Division__Group__0 ) ) )
            // InternalMathDsl.g:217:2: ( ( rule__Division__Group__0 ) )
            {
            // InternalMathDsl.g:217:2: ( ( rule__Division__Group__0 ) )
            // InternalMathDsl.g:218:3: ( rule__Division__Group__0 )
            {
             before(grammarAccess.getDivisionAccess().getGroup()); 
            // InternalMathDsl.g:219:3: ( rule__Division__Group__0 )
            // InternalMathDsl.g:219:4: rule__Division__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Division__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDivisionAccess().getGroup()); 

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
    // $ANTLR end "ruleDivision"


    // $ANTLR start "entryRulePrimitive"
    // InternalMathDsl.g:228:1: entryRulePrimitive : rulePrimitive EOF ;
    public final void entryRulePrimitive() throws RecognitionException {
        try {
            // InternalMathDsl.g:229:1: ( rulePrimitive EOF )
            // InternalMathDsl.g:230:1: rulePrimitive EOF
            {
             before(grammarAccess.getPrimitiveRule()); 
            pushFollow(FOLLOW_1);
            rulePrimitive();

            state._fsp--;

             after(grammarAccess.getPrimitiveRule()); 
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
    // $ANTLR end "entryRulePrimitive"


    // $ANTLR start "rulePrimitive"
    // InternalMathDsl.g:237:1: rulePrimitive : ( ( rule__Primitive__Alternatives ) ) ;
    public final void rulePrimitive() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:241:2: ( ( ( rule__Primitive__Alternatives ) ) )
            // InternalMathDsl.g:242:2: ( ( rule__Primitive__Alternatives ) )
            {
            // InternalMathDsl.g:242:2: ( ( rule__Primitive__Alternatives ) )
            // InternalMathDsl.g:243:3: ( rule__Primitive__Alternatives )
            {
             before(grammarAccess.getPrimitiveAccess().getAlternatives()); 
            // InternalMathDsl.g:244:3: ( rule__Primitive__Alternatives )
            // InternalMathDsl.g:244:4: rule__Primitive__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Primitive__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveAccess().getAlternatives()); 

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
    // $ANTLR end "rulePrimitive"


    // $ANTLR start "entryRuleRawInteger"
    // InternalMathDsl.g:253:1: entryRuleRawInteger : ruleRawInteger EOF ;
    public final void entryRuleRawInteger() throws RecognitionException {
        try {
            // InternalMathDsl.g:254:1: ( ruleRawInteger EOF )
            // InternalMathDsl.g:255:1: ruleRawInteger EOF
            {
             before(grammarAccess.getRawIntegerRule()); 
            pushFollow(FOLLOW_1);
            ruleRawInteger();

            state._fsp--;

             after(grammarAccess.getRawIntegerRule()); 
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
    // $ANTLR end "entryRuleRawInteger"


    // $ANTLR start "ruleRawInteger"
    // InternalMathDsl.g:262:1: ruleRawInteger : ( ( rule__RawInteger__ValueAssignment ) ) ;
    public final void ruleRawInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:266:2: ( ( ( rule__RawInteger__ValueAssignment ) ) )
            // InternalMathDsl.g:267:2: ( ( rule__RawInteger__ValueAssignment ) )
            {
            // InternalMathDsl.g:267:2: ( ( rule__RawInteger__ValueAssignment ) )
            // InternalMathDsl.g:268:3: ( rule__RawInteger__ValueAssignment )
            {
             before(grammarAccess.getRawIntegerAccess().getValueAssignment()); 
            // InternalMathDsl.g:269:3: ( rule__RawInteger__ValueAssignment )
            // InternalMathDsl.g:269:4: rule__RawInteger__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__RawInteger__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getRawIntegerAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleRawInteger"


    // $ANTLR start "entryRuleRawVariable"
    // InternalMathDsl.g:278:1: entryRuleRawVariable : ruleRawVariable EOF ;
    public final void entryRuleRawVariable() throws RecognitionException {
        try {
            // InternalMathDsl.g:279:1: ( ruleRawVariable EOF )
            // InternalMathDsl.g:280:1: ruleRawVariable EOF
            {
             before(grammarAccess.getRawVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleRawVariable();

            state._fsp--;

             after(grammarAccess.getRawVariableRule()); 
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
    // $ANTLR end "entryRuleRawVariable"


    // $ANTLR start "ruleRawVariable"
    // InternalMathDsl.g:287:1: ruleRawVariable : ( ( rule__RawVariable__ValueAssignment ) ) ;
    public final void ruleRawVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:291:2: ( ( ( rule__RawVariable__ValueAssignment ) ) )
            // InternalMathDsl.g:292:2: ( ( rule__RawVariable__ValueAssignment ) )
            {
            // InternalMathDsl.g:292:2: ( ( rule__RawVariable__ValueAssignment ) )
            // InternalMathDsl.g:293:3: ( rule__RawVariable__ValueAssignment )
            {
             before(grammarAccess.getRawVariableAccess().getValueAssignment()); 
            // InternalMathDsl.g:294:3: ( rule__RawVariable__ValueAssignment )
            // InternalMathDsl.g:294:4: rule__RawVariable__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__RawVariable__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getRawVariableAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleRawVariable"


    // $ANTLR start "rule__Primitive__Alternatives"
    // InternalMathDsl.g:302:1: rule__Primitive__Alternatives : ( ( ruleRawInteger ) | ( ( rule__Primitive__Group_1__0 ) ) | ( ruleRawVariable ) );
    public final void rule__Primitive__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:306:1: ( ( ruleRawInteger ) | ( ( rule__Primitive__Group_1__0 ) ) | ( ruleRawVariable ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt1=1;
                }
                break;
            case 18:
                {
                alt1=2;
                }
                break;
            case RULE_ID:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMathDsl.g:307:2: ( ruleRawInteger )
                    {
                    // InternalMathDsl.g:307:2: ( ruleRawInteger )
                    // InternalMathDsl.g:308:3: ruleRawInteger
                    {
                     before(grammarAccess.getPrimitiveAccess().getRawIntegerParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRawInteger();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveAccess().getRawIntegerParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMathDsl.g:313:2: ( ( rule__Primitive__Group_1__0 ) )
                    {
                    // InternalMathDsl.g:313:2: ( ( rule__Primitive__Group_1__0 ) )
                    // InternalMathDsl.g:314:3: ( rule__Primitive__Group_1__0 )
                    {
                     before(grammarAccess.getPrimitiveAccess().getGroup_1()); 
                    // InternalMathDsl.g:315:3: ( rule__Primitive__Group_1__0 )
                    // InternalMathDsl.g:315:4: rule__Primitive__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primitive__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMathDsl.g:319:2: ( ruleRawVariable )
                    {
                    // InternalMathDsl.g:319:2: ( ruleRawVariable )
                    // InternalMathDsl.g:320:3: ruleRawVariable
                    {
                     before(grammarAccess.getPrimitiveAccess().getRawVariableParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleRawVariable();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveAccess().getRawVariableParserRuleCall_2()); 

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
    // $ANTLR end "rule__Primitive__Alternatives"


    // $ANTLR start "rule__AllExp__Group__0"
    // InternalMathDsl.g:329:1: rule__AllExp__Group__0 : rule__AllExp__Group__0__Impl rule__AllExp__Group__1 ;
    public final void rule__AllExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:333:1: ( rule__AllExp__Group__0__Impl rule__AllExp__Group__1 )
            // InternalMathDsl.g:334:2: rule__AllExp__Group__0__Impl rule__AllExp__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__AllExp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllExp__Group__1();

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
    // $ANTLR end "rule__AllExp__Group__0"


    // $ANTLR start "rule__AllExp__Group__0__Impl"
    // InternalMathDsl.g:341:1: rule__AllExp__Group__0__Impl : ( 'name' ) ;
    public final void rule__AllExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:345:1: ( ( 'name' ) )
            // InternalMathDsl.g:346:1: ( 'name' )
            {
            // InternalMathDsl.g:346:1: ( 'name' )
            // InternalMathDsl.g:347:2: 'name'
            {
             before(grammarAccess.getAllExpAccess().getNameKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getAllExpAccess().getNameKeyword_0()); 

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
    // $ANTLR end "rule__AllExp__Group__0__Impl"


    // $ANTLR start "rule__AllExp__Group__1"
    // InternalMathDsl.g:356:1: rule__AllExp__Group__1 : rule__AllExp__Group__1__Impl rule__AllExp__Group__2 ;
    public final void rule__AllExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:360:1: ( rule__AllExp__Group__1__Impl rule__AllExp__Group__2 )
            // InternalMathDsl.g:361:2: rule__AllExp__Group__1__Impl rule__AllExp__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__AllExp__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllExp__Group__2();

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
    // $ANTLR end "rule__AllExp__Group__1"


    // $ANTLR start "rule__AllExp__Group__1__Impl"
    // InternalMathDsl.g:368:1: rule__AllExp__Group__1__Impl : ( ( rule__AllExp__NameAssignment_1 ) ) ;
    public final void rule__AllExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:372:1: ( ( ( rule__AllExp__NameAssignment_1 ) ) )
            // InternalMathDsl.g:373:1: ( ( rule__AllExp__NameAssignment_1 ) )
            {
            // InternalMathDsl.g:373:1: ( ( rule__AllExp__NameAssignment_1 ) )
            // InternalMathDsl.g:374:2: ( rule__AllExp__NameAssignment_1 )
            {
             before(grammarAccess.getAllExpAccess().getNameAssignment_1()); 
            // InternalMathDsl.g:375:2: ( rule__AllExp__NameAssignment_1 )
            // InternalMathDsl.g:375:3: rule__AllExp__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AllExp__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAllExpAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__AllExp__Group__1__Impl"


    // $ANTLR start "rule__AllExp__Group__2"
    // InternalMathDsl.g:383:1: rule__AllExp__Group__2 : rule__AllExp__Group__2__Impl rule__AllExp__Group__3 ;
    public final void rule__AllExp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:387:1: ( rule__AllExp__Group__2__Impl rule__AllExp__Group__3 )
            // InternalMathDsl.g:388:2: rule__AllExp__Group__2__Impl rule__AllExp__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__AllExp__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllExp__Group__3();

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
    // $ANTLR end "rule__AllExp__Group__2"


    // $ANTLR start "rule__AllExp__Group__2__Impl"
    // InternalMathDsl.g:395:1: rule__AllExp__Group__2__Impl : ( ':' ) ;
    public final void rule__AllExp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:399:1: ( ( ':' ) )
            // InternalMathDsl.g:400:1: ( ':' )
            {
            // InternalMathDsl.g:400:1: ( ':' )
            // InternalMathDsl.g:401:2: ':'
            {
             before(grammarAccess.getAllExpAccess().getColonKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getAllExpAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__AllExp__Group__2__Impl"


    // $ANTLR start "rule__AllExp__Group__3"
    // InternalMathDsl.g:410:1: rule__AllExp__Group__3 : rule__AllExp__Group__3__Impl ;
    public final void rule__AllExp__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:414:1: ( rule__AllExp__Group__3__Impl )
            // InternalMathDsl.g:415:2: rule__AllExp__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AllExp__Group__3__Impl();

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
    // $ANTLR end "rule__AllExp__Group__3"


    // $ANTLR start "rule__AllExp__Group__3__Impl"
    // InternalMathDsl.g:421:1: rule__AllExp__Group__3__Impl : ( ( ( rule__AllExp__ExpsAssignment_3 ) ) ( ( rule__AllExp__ExpsAssignment_3 )* ) ) ;
    public final void rule__AllExp__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:425:1: ( ( ( ( rule__AllExp__ExpsAssignment_3 ) ) ( ( rule__AllExp__ExpsAssignment_3 )* ) ) )
            // InternalMathDsl.g:426:1: ( ( ( rule__AllExp__ExpsAssignment_3 ) ) ( ( rule__AllExp__ExpsAssignment_3 )* ) )
            {
            // InternalMathDsl.g:426:1: ( ( ( rule__AllExp__ExpsAssignment_3 ) ) ( ( rule__AllExp__ExpsAssignment_3 )* ) )
            // InternalMathDsl.g:427:2: ( ( rule__AllExp__ExpsAssignment_3 ) ) ( ( rule__AllExp__ExpsAssignment_3 )* )
            {
            // InternalMathDsl.g:427:2: ( ( rule__AllExp__ExpsAssignment_3 ) )
            // InternalMathDsl.g:428:3: ( rule__AllExp__ExpsAssignment_3 )
            {
             before(grammarAccess.getAllExpAccess().getExpsAssignment_3()); 
            // InternalMathDsl.g:429:3: ( rule__AllExp__ExpsAssignment_3 )
            // InternalMathDsl.g:429:4: rule__AllExp__ExpsAssignment_3
            {
            pushFollow(FOLLOW_5);
            rule__AllExp__ExpsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAllExpAccess().getExpsAssignment_3()); 

            }

            // InternalMathDsl.g:432:2: ( ( rule__AllExp__ExpsAssignment_3 )* )
            // InternalMathDsl.g:433:3: ( rule__AllExp__ExpsAssignment_3 )*
            {
             before(grammarAccess.getAllExpAccess().getExpsAssignment_3()); 
            // InternalMathDsl.g:434:3: ( rule__AllExp__ExpsAssignment_3 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMathDsl.g:434:4: rule__AllExp__ExpsAssignment_3
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__AllExp__ExpsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getAllExpAccess().getExpsAssignment_3()); 

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
    // $ANTLR end "rule__AllExp__Group__3__Impl"


    // $ANTLR start "rule__MathExp__Group__0"
    // InternalMathDsl.g:444:1: rule__MathExp__Group__0 : rule__MathExp__Group__0__Impl rule__MathExp__Group__1 ;
    public final void rule__MathExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:448:1: ( rule__MathExp__Group__0__Impl rule__MathExp__Group__1 )
            // InternalMathDsl.g:449:2: rule__MathExp__Group__0__Impl rule__MathExp__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__MathExp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MathExp__Group__1();

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
    // $ANTLR end "rule__MathExp__Group__0"


    // $ANTLR start "rule__MathExp__Group__0__Impl"
    // InternalMathDsl.g:456:1: rule__MathExp__Group__0__Impl : ( ( rule__MathExp__NameAssignment_0 ) ) ;
    public final void rule__MathExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:460:1: ( ( ( rule__MathExp__NameAssignment_0 ) ) )
            // InternalMathDsl.g:461:1: ( ( rule__MathExp__NameAssignment_0 ) )
            {
            // InternalMathDsl.g:461:1: ( ( rule__MathExp__NameAssignment_0 ) )
            // InternalMathDsl.g:462:2: ( rule__MathExp__NameAssignment_0 )
            {
             before(grammarAccess.getMathExpAccess().getNameAssignment_0()); 
            // InternalMathDsl.g:463:2: ( rule__MathExp__NameAssignment_0 )
            // InternalMathDsl.g:463:3: rule__MathExp__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MathExp__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMathExpAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__MathExp__Group__0__Impl"


    // $ANTLR start "rule__MathExp__Group__1"
    // InternalMathDsl.g:471:1: rule__MathExp__Group__1 : rule__MathExp__Group__1__Impl rule__MathExp__Group__2 ;
    public final void rule__MathExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:475:1: ( rule__MathExp__Group__1__Impl rule__MathExp__Group__2 )
            // InternalMathDsl.g:476:2: rule__MathExp__Group__1__Impl rule__MathExp__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__MathExp__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MathExp__Group__2();

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
    // $ANTLR end "rule__MathExp__Group__1"


    // $ANTLR start "rule__MathExp__Group__1__Impl"
    // InternalMathDsl.g:483:1: rule__MathExp__Group__1__Impl : ( '=' ) ;
    public final void rule__MathExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:487:1: ( ( '=' ) )
            // InternalMathDsl.g:488:1: ( '=' )
            {
            // InternalMathDsl.g:488:1: ( '=' )
            // InternalMathDsl.g:489:2: '='
            {
             before(grammarAccess.getMathExpAccess().getEqualsSignKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getMathExpAccess().getEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__MathExp__Group__1__Impl"


    // $ANTLR start "rule__MathExp__Group__2"
    // InternalMathDsl.g:498:1: rule__MathExp__Group__2 : rule__MathExp__Group__2__Impl ;
    public final void rule__MathExp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:502:1: ( rule__MathExp__Group__2__Impl )
            // InternalMathDsl.g:503:2: rule__MathExp__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MathExp__Group__2__Impl();

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
    // $ANTLR end "rule__MathExp__Group__2"


    // $ANTLR start "rule__MathExp__Group__2__Impl"
    // InternalMathDsl.g:509:1: rule__MathExp__Group__2__Impl : ( ( rule__MathExp__ExpAssignment_2 ) ) ;
    public final void rule__MathExp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:513:1: ( ( ( rule__MathExp__ExpAssignment_2 ) ) )
            // InternalMathDsl.g:514:1: ( ( rule__MathExp__ExpAssignment_2 ) )
            {
            // InternalMathDsl.g:514:1: ( ( rule__MathExp__ExpAssignment_2 ) )
            // InternalMathDsl.g:515:2: ( rule__MathExp__ExpAssignment_2 )
            {
             before(grammarAccess.getMathExpAccess().getExpAssignment_2()); 
            // InternalMathDsl.g:516:2: ( rule__MathExp__ExpAssignment_2 )
            // InternalMathDsl.g:516:3: rule__MathExp__ExpAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MathExp__ExpAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMathExpAccess().getExpAssignment_2()); 

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
    // $ANTLR end "rule__MathExp__Group__2__Impl"


    // $ANTLR start "rule__Addition__Group__0"
    // InternalMathDsl.g:525:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:529:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // InternalMathDsl.g:530:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Addition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group__1();

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
    // $ANTLR end "rule__Addition__Group__0"


    // $ANTLR start "rule__Addition__Group__0__Impl"
    // InternalMathDsl.g:537:1: rule__Addition__Group__0__Impl : ( ruleSubtraction ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:541:1: ( ( ruleSubtraction ) )
            // InternalMathDsl.g:542:1: ( ruleSubtraction )
            {
            // InternalMathDsl.g:542:1: ( ruleSubtraction )
            // InternalMathDsl.g:543:2: ruleSubtraction
            {
             before(grammarAccess.getAdditionAccess().getSubtractionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleSubtraction();

            state._fsp--;

             after(grammarAccess.getAdditionAccess().getSubtractionParserRuleCall_0()); 

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
    // $ANTLR end "rule__Addition__Group__0__Impl"


    // $ANTLR start "rule__Addition__Group__1"
    // InternalMathDsl.g:552:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:556:1: ( rule__Addition__Group__1__Impl )
            // InternalMathDsl.g:557:2: rule__Addition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group__1__Impl();

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
    // $ANTLR end "rule__Addition__Group__1"


    // $ANTLR start "rule__Addition__Group__1__Impl"
    // InternalMathDsl.g:563:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:567:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // InternalMathDsl.g:568:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // InternalMathDsl.g:568:1: ( ( rule__Addition__Group_1__0 )* )
            // InternalMathDsl.g:569:2: ( rule__Addition__Group_1__0 )*
            {
             before(grammarAccess.getAdditionAccess().getGroup_1()); 
            // InternalMathDsl.g:570:2: ( rule__Addition__Group_1__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMathDsl.g:570:3: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Addition__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getAdditionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Addition__Group__1__Impl"


    // $ANTLR start "rule__Addition__Group_1__0"
    // InternalMathDsl.g:579:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:583:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // InternalMathDsl.g:584:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Addition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group_1__1();

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
    // $ANTLR end "rule__Addition__Group_1__0"


    // $ANTLR start "rule__Addition__Group_1__0__Impl"
    // InternalMathDsl.g:591:1: rule__Addition__Group_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:595:1: ( ( () ) )
            // InternalMathDsl.g:596:1: ( () )
            {
            // InternalMathDsl.g:596:1: ( () )
            // InternalMathDsl.g:597:2: ()
            {
             before(grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0()); 
            // InternalMathDsl.g:598:2: ()
            // InternalMathDsl.g:598:3: 
            {
            }

             after(grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__0__Impl"


    // $ANTLR start "rule__Addition__Group_1__1"
    // InternalMathDsl.g:606:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:610:1: ( rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 )
            // InternalMathDsl.g:611:2: rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2
            {
            pushFollow(FOLLOW_7);
            rule__Addition__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group_1__2();

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
    // $ANTLR end "rule__Addition__Group_1__1"


    // $ANTLR start "rule__Addition__Group_1__1__Impl"
    // InternalMathDsl.g:618:1: rule__Addition__Group_1__1__Impl : ( '+' ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:622:1: ( ( '+' ) )
            // InternalMathDsl.g:623:1: ( '+' )
            {
            // InternalMathDsl.g:623:1: ( '+' )
            // InternalMathDsl.g:624:2: '+'
            {
             before(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_1()); 

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
    // $ANTLR end "rule__Addition__Group_1__1__Impl"


    // $ANTLR start "rule__Addition__Group_1__2"
    // InternalMathDsl.g:633:1: rule__Addition__Group_1__2 : rule__Addition__Group_1__2__Impl ;
    public final void rule__Addition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:637:1: ( rule__Addition__Group_1__2__Impl )
            // InternalMathDsl.g:638:2: rule__Addition__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group_1__2__Impl();

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
    // $ANTLR end "rule__Addition__Group_1__2"


    // $ANTLR start "rule__Addition__Group_1__2__Impl"
    // InternalMathDsl.g:644:1: rule__Addition__Group_1__2__Impl : ( ( rule__Addition__RightAssignment_1_2 ) ) ;
    public final void rule__Addition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:648:1: ( ( ( rule__Addition__RightAssignment_1_2 ) ) )
            // InternalMathDsl.g:649:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            {
            // InternalMathDsl.g:649:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            // InternalMathDsl.g:650:2: ( rule__Addition__RightAssignment_1_2 )
            {
             before(grammarAccess.getAdditionAccess().getRightAssignment_1_2()); 
            // InternalMathDsl.g:651:2: ( rule__Addition__RightAssignment_1_2 )
            // InternalMathDsl.g:651:3: rule__Addition__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Addition__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__Addition__Group_1__2__Impl"


    // $ANTLR start "rule__Subtraction__Group__0"
    // InternalMathDsl.g:660:1: rule__Subtraction__Group__0 : rule__Subtraction__Group__0__Impl rule__Subtraction__Group__1 ;
    public final void rule__Subtraction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:664:1: ( rule__Subtraction__Group__0__Impl rule__Subtraction__Group__1 )
            // InternalMathDsl.g:665:2: rule__Subtraction__Group__0__Impl rule__Subtraction__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Subtraction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subtraction__Group__1();

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
    // $ANTLR end "rule__Subtraction__Group__0"


    // $ANTLR start "rule__Subtraction__Group__0__Impl"
    // InternalMathDsl.g:672:1: rule__Subtraction__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Subtraction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:676:1: ( ( ruleMultiplication ) )
            // InternalMathDsl.g:677:1: ( ruleMultiplication )
            {
            // InternalMathDsl.g:677:1: ( ruleMultiplication )
            // InternalMathDsl.g:678:2: ruleMultiplication
            {
             before(grammarAccess.getSubtractionAccess().getMultiplicationParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getSubtractionAccess().getMultiplicationParserRuleCall_0()); 

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
    // $ANTLR end "rule__Subtraction__Group__0__Impl"


    // $ANTLR start "rule__Subtraction__Group__1"
    // InternalMathDsl.g:687:1: rule__Subtraction__Group__1 : rule__Subtraction__Group__1__Impl ;
    public final void rule__Subtraction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:691:1: ( rule__Subtraction__Group__1__Impl )
            // InternalMathDsl.g:692:2: rule__Subtraction__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subtraction__Group__1__Impl();

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
    // $ANTLR end "rule__Subtraction__Group__1"


    // $ANTLR start "rule__Subtraction__Group__1__Impl"
    // InternalMathDsl.g:698:1: rule__Subtraction__Group__1__Impl : ( ( rule__Subtraction__Group_1__0 )* ) ;
    public final void rule__Subtraction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:702:1: ( ( ( rule__Subtraction__Group_1__0 )* ) )
            // InternalMathDsl.g:703:1: ( ( rule__Subtraction__Group_1__0 )* )
            {
            // InternalMathDsl.g:703:1: ( ( rule__Subtraction__Group_1__0 )* )
            // InternalMathDsl.g:704:2: ( rule__Subtraction__Group_1__0 )*
            {
             before(grammarAccess.getSubtractionAccess().getGroup_1()); 
            // InternalMathDsl.g:705:2: ( rule__Subtraction__Group_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMathDsl.g:705:3: rule__Subtraction__Group_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Subtraction__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getSubtractionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Subtraction__Group__1__Impl"


    // $ANTLR start "rule__Subtraction__Group_1__0"
    // InternalMathDsl.g:714:1: rule__Subtraction__Group_1__0 : rule__Subtraction__Group_1__0__Impl rule__Subtraction__Group_1__1 ;
    public final void rule__Subtraction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:718:1: ( rule__Subtraction__Group_1__0__Impl rule__Subtraction__Group_1__1 )
            // InternalMathDsl.g:719:2: rule__Subtraction__Group_1__0__Impl rule__Subtraction__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__Subtraction__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subtraction__Group_1__1();

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
    // $ANTLR end "rule__Subtraction__Group_1__0"


    // $ANTLR start "rule__Subtraction__Group_1__0__Impl"
    // InternalMathDsl.g:726:1: rule__Subtraction__Group_1__0__Impl : ( () ) ;
    public final void rule__Subtraction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:730:1: ( ( () ) )
            // InternalMathDsl.g:731:1: ( () )
            {
            // InternalMathDsl.g:731:1: ( () )
            // InternalMathDsl.g:732:2: ()
            {
             before(grammarAccess.getSubtractionAccess().getSubtractionLeftAction_1_0()); 
            // InternalMathDsl.g:733:2: ()
            // InternalMathDsl.g:733:3: 
            {
            }

             after(grammarAccess.getSubtractionAccess().getSubtractionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtraction__Group_1__0__Impl"


    // $ANTLR start "rule__Subtraction__Group_1__1"
    // InternalMathDsl.g:741:1: rule__Subtraction__Group_1__1 : rule__Subtraction__Group_1__1__Impl rule__Subtraction__Group_1__2 ;
    public final void rule__Subtraction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:745:1: ( rule__Subtraction__Group_1__1__Impl rule__Subtraction__Group_1__2 )
            // InternalMathDsl.g:746:2: rule__Subtraction__Group_1__1__Impl rule__Subtraction__Group_1__2
            {
            pushFollow(FOLLOW_7);
            rule__Subtraction__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subtraction__Group_1__2();

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
    // $ANTLR end "rule__Subtraction__Group_1__1"


    // $ANTLR start "rule__Subtraction__Group_1__1__Impl"
    // InternalMathDsl.g:753:1: rule__Subtraction__Group_1__1__Impl : ( '-' ) ;
    public final void rule__Subtraction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:757:1: ( ( '-' ) )
            // InternalMathDsl.g:758:1: ( '-' )
            {
            // InternalMathDsl.g:758:1: ( '-' )
            // InternalMathDsl.g:759:2: '-'
            {
             before(grammarAccess.getSubtractionAccess().getHyphenMinusKeyword_1_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSubtractionAccess().getHyphenMinusKeyword_1_1()); 

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
    // $ANTLR end "rule__Subtraction__Group_1__1__Impl"


    // $ANTLR start "rule__Subtraction__Group_1__2"
    // InternalMathDsl.g:768:1: rule__Subtraction__Group_1__2 : rule__Subtraction__Group_1__2__Impl ;
    public final void rule__Subtraction__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:772:1: ( rule__Subtraction__Group_1__2__Impl )
            // InternalMathDsl.g:773:2: rule__Subtraction__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subtraction__Group_1__2__Impl();

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
    // $ANTLR end "rule__Subtraction__Group_1__2"


    // $ANTLR start "rule__Subtraction__Group_1__2__Impl"
    // InternalMathDsl.g:779:1: rule__Subtraction__Group_1__2__Impl : ( ( rule__Subtraction__RightAssignment_1_2 ) ) ;
    public final void rule__Subtraction__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:783:1: ( ( ( rule__Subtraction__RightAssignment_1_2 ) ) )
            // InternalMathDsl.g:784:1: ( ( rule__Subtraction__RightAssignment_1_2 ) )
            {
            // InternalMathDsl.g:784:1: ( ( rule__Subtraction__RightAssignment_1_2 ) )
            // InternalMathDsl.g:785:2: ( rule__Subtraction__RightAssignment_1_2 )
            {
             before(grammarAccess.getSubtractionAccess().getRightAssignment_1_2()); 
            // InternalMathDsl.g:786:2: ( rule__Subtraction__RightAssignment_1_2 )
            // InternalMathDsl.g:786:3: rule__Subtraction__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Subtraction__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getSubtractionAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__Subtraction__Group_1__2__Impl"


    // $ANTLR start "rule__Multiplication__Group__0"
    // InternalMathDsl.g:795:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:799:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // InternalMathDsl.g:800:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Multiplication__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__1();

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
    // $ANTLR end "rule__Multiplication__Group__0"


    // $ANTLR start "rule__Multiplication__Group__0__Impl"
    // InternalMathDsl.g:807:1: rule__Multiplication__Group__0__Impl : ( ruleDivision ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:811:1: ( ( ruleDivision ) )
            // InternalMathDsl.g:812:1: ( ruleDivision )
            {
            // InternalMathDsl.g:812:1: ( ruleDivision )
            // InternalMathDsl.g:813:2: ruleDivision
            {
             before(grammarAccess.getMultiplicationAccess().getDivisionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleDivision();

            state._fsp--;

             after(grammarAccess.getMultiplicationAccess().getDivisionParserRuleCall_0()); 

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
    // $ANTLR end "rule__Multiplication__Group__0__Impl"


    // $ANTLR start "rule__Multiplication__Group__1"
    // InternalMathDsl.g:822:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:826:1: ( rule__Multiplication__Group__1__Impl )
            // InternalMathDsl.g:827:2: rule__Multiplication__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__1__Impl();

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
    // $ANTLR end "rule__Multiplication__Group__1"


    // $ANTLR start "rule__Multiplication__Group__1__Impl"
    // InternalMathDsl.g:833:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:837:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // InternalMathDsl.g:838:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // InternalMathDsl.g:838:1: ( ( rule__Multiplication__Group_1__0 )* )
            // InternalMathDsl.g:839:2: ( rule__Multiplication__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            // InternalMathDsl.g:840:2: ( rule__Multiplication__Group_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMathDsl.g:840:3: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Multiplication__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getMultiplicationAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Multiplication__Group__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__0"
    // InternalMathDsl.g:849:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:853:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // InternalMathDsl.g:854:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__Multiplication__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1__1();

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
    // $ANTLR end "rule__Multiplication__Group_1__0"


    // $ANTLR start "rule__Multiplication__Group_1__0__Impl"
    // InternalMathDsl.g:861:1: rule__Multiplication__Group_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:865:1: ( ( () ) )
            // InternalMathDsl.g:866:1: ( () )
            {
            // InternalMathDsl.g:866:1: ( () )
            // InternalMathDsl.g:867:2: ()
            {
             before(grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0()); 
            // InternalMathDsl.g:868:2: ()
            // InternalMathDsl.g:868:3: 
            {
            }

             after(grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__1"
    // InternalMathDsl.g:876:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:880:1: ( rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 )
            // InternalMathDsl.g:881:2: rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2
            {
            pushFollow(FOLLOW_7);
            rule__Multiplication__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1__2();

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
    // $ANTLR end "rule__Multiplication__Group_1__1"


    // $ANTLR start "rule__Multiplication__Group_1__1__Impl"
    // InternalMathDsl.g:888:1: rule__Multiplication__Group_1__1__Impl : ( '*' ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:892:1: ( ( '*' ) )
            // InternalMathDsl.g:893:1: ( '*' )
            {
            // InternalMathDsl.g:893:1: ( '*' )
            // InternalMathDsl.g:894:2: '*'
            {
             before(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_1()); 

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
    // $ANTLR end "rule__Multiplication__Group_1__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__2"
    // InternalMathDsl.g:903:1: rule__Multiplication__Group_1__2 : rule__Multiplication__Group_1__2__Impl ;
    public final void rule__Multiplication__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:907:1: ( rule__Multiplication__Group_1__2__Impl )
            // InternalMathDsl.g:908:2: rule__Multiplication__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1__2__Impl();

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
    // $ANTLR end "rule__Multiplication__Group_1__2"


    // $ANTLR start "rule__Multiplication__Group_1__2__Impl"
    // InternalMathDsl.g:914:1: rule__Multiplication__Group_1__2__Impl : ( ( rule__Multiplication__RightAssignment_1_2 ) ) ;
    public final void rule__Multiplication__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:918:1: ( ( ( rule__Multiplication__RightAssignment_1_2 ) ) )
            // InternalMathDsl.g:919:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            {
            // InternalMathDsl.g:919:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            // InternalMathDsl.g:920:2: ( rule__Multiplication__RightAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2()); 
            // InternalMathDsl.g:921:2: ( rule__Multiplication__RightAssignment_1_2 )
            // InternalMathDsl.g:921:3: rule__Multiplication__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__Multiplication__Group_1__2__Impl"


    // $ANTLR start "rule__Division__Group__0"
    // InternalMathDsl.g:930:1: rule__Division__Group__0 : rule__Division__Group__0__Impl rule__Division__Group__1 ;
    public final void rule__Division__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:934:1: ( rule__Division__Group__0__Impl rule__Division__Group__1 )
            // InternalMathDsl.g:935:2: rule__Division__Group__0__Impl rule__Division__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Division__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Division__Group__1();

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
    // $ANTLR end "rule__Division__Group__0"


    // $ANTLR start "rule__Division__Group__0__Impl"
    // InternalMathDsl.g:942:1: rule__Division__Group__0__Impl : ( rulePrimitive ) ;
    public final void rule__Division__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:946:1: ( ( rulePrimitive ) )
            // InternalMathDsl.g:947:1: ( rulePrimitive )
            {
            // InternalMathDsl.g:947:1: ( rulePrimitive )
            // InternalMathDsl.g:948:2: rulePrimitive
            {
             before(grammarAccess.getDivisionAccess().getPrimitiveParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimitive();

            state._fsp--;

             after(grammarAccess.getDivisionAccess().getPrimitiveParserRuleCall_0()); 

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
    // $ANTLR end "rule__Division__Group__0__Impl"


    // $ANTLR start "rule__Division__Group__1"
    // InternalMathDsl.g:957:1: rule__Division__Group__1 : rule__Division__Group__1__Impl ;
    public final void rule__Division__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:961:1: ( rule__Division__Group__1__Impl )
            // InternalMathDsl.g:962:2: rule__Division__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Division__Group__1__Impl();

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
    // $ANTLR end "rule__Division__Group__1"


    // $ANTLR start "rule__Division__Group__1__Impl"
    // InternalMathDsl.g:968:1: rule__Division__Group__1__Impl : ( ( rule__Division__Group_1__0 )* ) ;
    public final void rule__Division__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:972:1: ( ( ( rule__Division__Group_1__0 )* ) )
            // InternalMathDsl.g:973:1: ( ( rule__Division__Group_1__0 )* )
            {
            // InternalMathDsl.g:973:1: ( ( rule__Division__Group_1__0 )* )
            // InternalMathDsl.g:974:2: ( rule__Division__Group_1__0 )*
            {
             before(grammarAccess.getDivisionAccess().getGroup_1()); 
            // InternalMathDsl.g:975:2: ( rule__Division__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMathDsl.g:975:3: rule__Division__Group_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Division__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getDivisionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Division__Group__1__Impl"


    // $ANTLR start "rule__Division__Group_1__0"
    // InternalMathDsl.g:984:1: rule__Division__Group_1__0 : rule__Division__Group_1__0__Impl rule__Division__Group_1__1 ;
    public final void rule__Division__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:988:1: ( rule__Division__Group_1__0__Impl rule__Division__Group_1__1 )
            // InternalMathDsl.g:989:2: rule__Division__Group_1__0__Impl rule__Division__Group_1__1
            {
            pushFollow(FOLLOW_14);
            rule__Division__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Division__Group_1__1();

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
    // $ANTLR end "rule__Division__Group_1__0"


    // $ANTLR start "rule__Division__Group_1__0__Impl"
    // InternalMathDsl.g:996:1: rule__Division__Group_1__0__Impl : ( () ) ;
    public final void rule__Division__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:1000:1: ( ( () ) )
            // InternalMathDsl.g:1001:1: ( () )
            {
            // InternalMathDsl.g:1001:1: ( () )
            // InternalMathDsl.g:1002:2: ()
            {
             before(grammarAccess.getDivisionAccess().getDivisionLeftAction_1_0()); 
            // InternalMathDsl.g:1003:2: ()
            // InternalMathDsl.g:1003:3: 
            {
            }

             after(grammarAccess.getDivisionAccess().getDivisionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Division__Group_1__0__Impl"


    // $ANTLR start "rule__Division__Group_1__1"
    // InternalMathDsl.g:1011:1: rule__Division__Group_1__1 : rule__Division__Group_1__1__Impl rule__Division__Group_1__2 ;
    public final void rule__Division__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:1015:1: ( rule__Division__Group_1__1__Impl rule__Division__Group_1__2 )
            // InternalMathDsl.g:1016:2: rule__Division__Group_1__1__Impl rule__Division__Group_1__2
            {
            pushFollow(FOLLOW_7);
            rule__Division__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Division__Group_1__2();

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
    // $ANTLR end "rule__Division__Group_1__1"


    // $ANTLR start "rule__Division__Group_1__1__Impl"
    // InternalMathDsl.g:1023:1: rule__Division__Group_1__1__Impl : ( '/' ) ;
    public final void rule__Division__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:1027:1: ( ( '/' ) )
            // InternalMathDsl.g:1028:1: ( '/' )
            {
            // InternalMathDsl.g:1028:1: ( '/' )
            // InternalMathDsl.g:1029:2: '/'
            {
             before(grammarAccess.getDivisionAccess().getSolidusKeyword_1_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDivisionAccess().getSolidusKeyword_1_1()); 

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
    // $ANTLR end "rule__Division__Group_1__1__Impl"


    // $ANTLR start "rule__Division__Group_1__2"
    // InternalMathDsl.g:1038:1: rule__Division__Group_1__2 : rule__Division__Group_1__2__Impl ;
    public final void rule__Division__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:1042:1: ( rule__Division__Group_1__2__Impl )
            // InternalMathDsl.g:1043:2: rule__Division__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Division__Group_1__2__Impl();

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
    // $ANTLR end "rule__Division__Group_1__2"


    // $ANTLR start "rule__Division__Group_1__2__Impl"
    // InternalMathDsl.g:1049:1: rule__Division__Group_1__2__Impl : ( ( rule__Division__RightAssignment_1_2 ) ) ;
    public final void rule__Division__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:1053:1: ( ( ( rule__Division__RightAssignment_1_2 ) ) )
            // InternalMathDsl.g:1054:1: ( ( rule__Division__RightAssignment_1_2 ) )
            {
            // InternalMathDsl.g:1054:1: ( ( rule__Division__RightAssignment_1_2 ) )
            // InternalMathDsl.g:1055:2: ( rule__Division__RightAssignment_1_2 )
            {
             before(grammarAccess.getDivisionAccess().getRightAssignment_1_2()); 
            // InternalMathDsl.g:1056:2: ( rule__Division__RightAssignment_1_2 )
            // InternalMathDsl.g:1056:3: rule__Division__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Division__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getDivisionAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__Division__Group_1__2__Impl"


    // $ANTLR start "rule__Primitive__Group_1__0"
    // InternalMathDsl.g:1065:1: rule__Primitive__Group_1__0 : rule__Primitive__Group_1__0__Impl rule__Primitive__Group_1__1 ;
    public final void rule__Primitive__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:1069:1: ( rule__Primitive__Group_1__0__Impl rule__Primitive__Group_1__1 )
            // InternalMathDsl.g:1070:2: rule__Primitive__Group_1__0__Impl rule__Primitive__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__Primitive__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primitive__Group_1__1();

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
    // $ANTLR end "rule__Primitive__Group_1__0"


    // $ANTLR start "rule__Primitive__Group_1__0__Impl"
    // InternalMathDsl.g:1077:1: rule__Primitive__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Primitive__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:1081:1: ( ( '(' ) )
            // InternalMathDsl.g:1082:1: ( '(' )
            {
            // InternalMathDsl.g:1082:1: ( '(' )
            // InternalMathDsl.g:1083:2: '('
            {
             before(grammarAccess.getPrimitiveAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPrimitiveAccess().getLeftParenthesisKeyword_1_0()); 

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
    // $ANTLR end "rule__Primitive__Group_1__0__Impl"


    // $ANTLR start "rule__Primitive__Group_1__1"
    // InternalMathDsl.g:1092:1: rule__Primitive__Group_1__1 : rule__Primitive__Group_1__1__Impl rule__Primitive__Group_1__2 ;
    public final void rule__Primitive__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:1096:1: ( rule__Primitive__Group_1__1__Impl rule__Primitive__Group_1__2 )
            // InternalMathDsl.g:1097:2: rule__Primitive__Group_1__1__Impl rule__Primitive__Group_1__2
            {
            pushFollow(FOLLOW_16);
            rule__Primitive__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primitive__Group_1__2();

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
    // $ANTLR end "rule__Primitive__Group_1__1"


    // $ANTLR start "rule__Primitive__Group_1__1__Impl"
    // InternalMathDsl.g:1104:1: rule__Primitive__Group_1__1__Impl : ( ruleExpression ) ;
    public final void rule__Primitive__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:1108:1: ( ( ruleExpression ) )
            // InternalMathDsl.g:1109:1: ( ruleExpression )
            {
            // InternalMathDsl.g:1109:1: ( ruleExpression )
            // InternalMathDsl.g:1110:2: ruleExpression
            {
             before(grammarAccess.getPrimitiveAccess().getExpressionParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getPrimitiveAccess().getExpressionParserRuleCall_1_1()); 

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
    // $ANTLR end "rule__Primitive__Group_1__1__Impl"


    // $ANTLR start "rule__Primitive__Group_1__2"
    // InternalMathDsl.g:1119:1: rule__Primitive__Group_1__2 : rule__Primitive__Group_1__2__Impl ;
    public final void rule__Primitive__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:1123:1: ( rule__Primitive__Group_1__2__Impl )
            // InternalMathDsl.g:1124:2: rule__Primitive__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primitive__Group_1__2__Impl();

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
    // $ANTLR end "rule__Primitive__Group_1__2"


    // $ANTLR start "rule__Primitive__Group_1__2__Impl"
    // InternalMathDsl.g:1130:1: rule__Primitive__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Primitive__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:1134:1: ( ( ')' ) )
            // InternalMathDsl.g:1135:1: ( ')' )
            {
            // InternalMathDsl.g:1135:1: ( ')' )
            // InternalMathDsl.g:1136:2: ')'
            {
             before(grammarAccess.getPrimitiveAccess().getRightParenthesisKeyword_1_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPrimitiveAccess().getRightParenthesisKeyword_1_2()); 

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
    // $ANTLR end "rule__Primitive__Group_1__2__Impl"


    // $ANTLR start "rule__AllExp__NameAssignment_1"
    // InternalMathDsl.g:1146:1: rule__AllExp__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AllExp__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:1150:1: ( ( RULE_ID ) )
            // InternalMathDsl.g:1151:2: ( RULE_ID )
            {
            // InternalMathDsl.g:1151:2: ( RULE_ID )
            // InternalMathDsl.g:1152:3: RULE_ID
            {
             before(grammarAccess.getAllExpAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAllExpAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__AllExp__NameAssignment_1"


    // $ANTLR start "rule__AllExp__ExpsAssignment_3"
    // InternalMathDsl.g:1161:1: rule__AllExp__ExpsAssignment_3 : ( ruleMathExp ) ;
    public final void rule__AllExp__ExpsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:1165:1: ( ( ruleMathExp ) )
            // InternalMathDsl.g:1166:2: ( ruleMathExp )
            {
            // InternalMathDsl.g:1166:2: ( ruleMathExp )
            // InternalMathDsl.g:1167:3: ruleMathExp
            {
             before(grammarAccess.getAllExpAccess().getExpsMathExpParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMathExp();

            state._fsp--;

             after(grammarAccess.getAllExpAccess().getExpsMathExpParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__AllExp__ExpsAssignment_3"


    // $ANTLR start "rule__MathExp__NameAssignment_0"
    // InternalMathDsl.g:1176:1: rule__MathExp__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__MathExp__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:1180:1: ( ( RULE_ID ) )
            // InternalMathDsl.g:1181:2: ( RULE_ID )
            {
            // InternalMathDsl.g:1181:2: ( RULE_ID )
            // InternalMathDsl.g:1182:3: RULE_ID
            {
             before(grammarAccess.getMathExpAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMathExpAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__MathExp__NameAssignment_0"


    // $ANTLR start "rule__MathExp__ExpAssignment_2"
    // InternalMathDsl.g:1191:1: rule__MathExp__ExpAssignment_2 : ( ruleExpression ) ;
    public final void rule__MathExp__ExpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:1195:1: ( ( ruleExpression ) )
            // InternalMathDsl.g:1196:2: ( ruleExpression )
            {
            // InternalMathDsl.g:1196:2: ( ruleExpression )
            // InternalMathDsl.g:1197:3: ruleExpression
            {
             before(grammarAccess.getMathExpAccess().getExpExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getMathExpAccess().getExpExpressionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__MathExp__ExpAssignment_2"


    // $ANTLR start "rule__Addition__RightAssignment_1_2"
    // InternalMathDsl.g:1206:1: rule__Addition__RightAssignment_1_2 : ( ruleSubtraction ) ;
    public final void rule__Addition__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:1210:1: ( ( ruleSubtraction ) )
            // InternalMathDsl.g:1211:2: ( ruleSubtraction )
            {
            // InternalMathDsl.g:1211:2: ( ruleSubtraction )
            // InternalMathDsl.g:1212:3: ruleSubtraction
            {
             before(grammarAccess.getAdditionAccess().getRightSubtractionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSubtraction();

            state._fsp--;

             after(grammarAccess.getAdditionAccess().getRightSubtractionParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Addition__RightAssignment_1_2"


    // $ANTLR start "rule__Subtraction__RightAssignment_1_2"
    // InternalMathDsl.g:1221:1: rule__Subtraction__RightAssignment_1_2 : ( ruleMultiplication ) ;
    public final void rule__Subtraction__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:1225:1: ( ( ruleMultiplication ) )
            // InternalMathDsl.g:1226:2: ( ruleMultiplication )
            {
            // InternalMathDsl.g:1226:2: ( ruleMultiplication )
            // InternalMathDsl.g:1227:3: ruleMultiplication
            {
             before(grammarAccess.getSubtractionAccess().getRightMultiplicationParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getSubtractionAccess().getRightMultiplicationParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Subtraction__RightAssignment_1_2"


    // $ANTLR start "rule__Multiplication__RightAssignment_1_2"
    // InternalMathDsl.g:1236:1: rule__Multiplication__RightAssignment_1_2 : ( ruleDivision ) ;
    public final void rule__Multiplication__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:1240:1: ( ( ruleDivision ) )
            // InternalMathDsl.g:1241:2: ( ruleDivision )
            {
            // InternalMathDsl.g:1241:2: ( ruleDivision )
            // InternalMathDsl.g:1242:3: ruleDivision
            {
             before(grammarAccess.getMultiplicationAccess().getRightDivisionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDivision();

            state._fsp--;

             after(grammarAccess.getMultiplicationAccess().getRightDivisionParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Multiplication__RightAssignment_1_2"


    // $ANTLR start "rule__Division__RightAssignment_1_2"
    // InternalMathDsl.g:1251:1: rule__Division__RightAssignment_1_2 : ( rulePrimitive ) ;
    public final void rule__Division__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:1255:1: ( ( rulePrimitive ) )
            // InternalMathDsl.g:1256:2: ( rulePrimitive )
            {
            // InternalMathDsl.g:1256:2: ( rulePrimitive )
            // InternalMathDsl.g:1257:3: rulePrimitive
            {
             before(grammarAccess.getDivisionAccess().getRightPrimitiveParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimitive();

            state._fsp--;

             after(grammarAccess.getDivisionAccess().getRightPrimitiveParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Division__RightAssignment_1_2"


    // $ANTLR start "rule__RawInteger__ValueAssignment"
    // InternalMathDsl.g:1266:1: rule__RawInteger__ValueAssignment : ( RULE_INT ) ;
    public final void rule__RawInteger__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:1270:1: ( ( RULE_INT ) )
            // InternalMathDsl.g:1271:2: ( RULE_INT )
            {
            // InternalMathDsl.g:1271:2: ( RULE_INT )
            // InternalMathDsl.g:1272:3: RULE_INT
            {
             before(grammarAccess.getRawIntegerAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRawIntegerAccess().getValueINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__RawInteger__ValueAssignment"


    // $ANTLR start "rule__RawVariable__ValueAssignment"
    // InternalMathDsl.g:1281:1: rule__RawVariable__ValueAssignment : ( ( RULE_ID ) ) ;
    public final void rule__RawVariable__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathDsl.g:1285:1: ( ( ( RULE_ID ) ) )
            // InternalMathDsl.g:1286:2: ( ( RULE_ID ) )
            {
            // InternalMathDsl.g:1286:2: ( ( RULE_ID ) )
            // InternalMathDsl.g:1287:3: ( RULE_ID )
            {
             before(grammarAccess.getRawVariableAccess().getValueMathExpCrossReference_0()); 
            // InternalMathDsl.g:1288:3: ( RULE_ID )
            // InternalMathDsl.g:1289:4: RULE_ID
            {
             before(grammarAccess.getRawVariableAccess().getValueMathExpIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRawVariableAccess().getValueMathExpIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getRawVariableAccess().getValueMathExpCrossReference_0()); 

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
    // $ANTLR end "rule__RawVariable__ValueAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080000L});

}