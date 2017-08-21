package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MathDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMathDslParser extends AbstractInternalAntlrParser {
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

        public InternalMathDslParser(TokenStream input, MathDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "AllExp";
       	}

       	@Override
       	protected MathDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleAllExp"
    // InternalMathDsl.g:64:1: entryRuleAllExp returns [EObject current=null] : iv_ruleAllExp= ruleAllExp EOF ;
    public final EObject entryRuleAllExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllExp = null;


        try {
            // InternalMathDsl.g:64:47: (iv_ruleAllExp= ruleAllExp EOF )
            // InternalMathDsl.g:65:2: iv_ruleAllExp= ruleAllExp EOF
            {
             newCompositeNode(grammarAccess.getAllExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAllExp=ruleAllExp();

            state._fsp--;

             current =iv_ruleAllExp; 
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
    // $ANTLR end "entryRuleAllExp"


    // $ANTLR start "ruleAllExp"
    // InternalMathDsl.g:71:1: ruleAllExp returns [EObject current=null] : (otherlv_0= 'name' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_exps_3_0= ruleMathExp ) )+ ) ;
    public final EObject ruleAllExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_exps_3_0 = null;



        	enterRule();

        try {
            // InternalMathDsl.g:77:2: ( (otherlv_0= 'name' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_exps_3_0= ruleMathExp ) )+ ) )
            // InternalMathDsl.g:78:2: (otherlv_0= 'name' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_exps_3_0= ruleMathExp ) )+ )
            {
            // InternalMathDsl.g:78:2: (otherlv_0= 'name' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_exps_3_0= ruleMathExp ) )+ )
            // InternalMathDsl.g:79:3: otherlv_0= 'name' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_exps_3_0= ruleMathExp ) )+
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAllExpAccess().getNameKeyword_0());
            		
            // InternalMathDsl.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMathDsl.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMathDsl.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalMathDsl.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAllExpAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAllExpRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getAllExpAccess().getColonKeyword_2());
            		
            // InternalMathDsl.g:105:3: ( (lv_exps_3_0= ruleMathExp ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMathDsl.g:106:4: (lv_exps_3_0= ruleMathExp )
            	    {
            	    // InternalMathDsl.g:106:4: (lv_exps_3_0= ruleMathExp )
            	    // InternalMathDsl.g:107:5: lv_exps_3_0= ruleMathExp
            	    {

            	    					newCompositeNode(grammarAccess.getAllExpAccess().getExpsMathExpParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_exps_3_0=ruleMathExp();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAllExpRule());
            	    					}
            	    					add(
            	    						current,
            	    						"exps",
            	    						lv_exps_3_0,
            	    						"org.xtext.example.mydsl.MathDsl.MathExp");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
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
    // $ANTLR end "ruleAllExp"


    // $ANTLR start "entryRuleMathExp"
    // InternalMathDsl.g:128:1: entryRuleMathExp returns [EObject current=null] : iv_ruleMathExp= ruleMathExp EOF ;
    public final EObject entryRuleMathExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathExp = null;


        try {
            // InternalMathDsl.g:128:48: (iv_ruleMathExp= ruleMathExp EOF )
            // InternalMathDsl.g:129:2: iv_ruleMathExp= ruleMathExp EOF
            {
             newCompositeNode(grammarAccess.getMathExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMathExp=ruleMathExp();

            state._fsp--;

             current =iv_ruleMathExp; 
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
    // $ANTLR end "entryRuleMathExp"


    // $ANTLR start "ruleMathExp"
    // InternalMathDsl.g:135:1: ruleMathExp returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruleExpression ) ) ) ;
    public final EObject ruleMathExp() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalMathDsl.g:141:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruleExpression ) ) ) )
            // InternalMathDsl.g:142:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruleExpression ) ) )
            {
            // InternalMathDsl.g:142:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruleExpression ) ) )
            // InternalMathDsl.g:143:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruleExpression ) )
            {
            // InternalMathDsl.g:143:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMathDsl.g:144:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMathDsl.g:144:4: (lv_name_0_0= RULE_ID )
            // InternalMathDsl.g:145:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_0_0, grammarAccess.getMathExpAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMathExpRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getMathExpAccess().getEqualsSignKeyword_1());
            		
            // InternalMathDsl.g:165:3: ( (lv_exp_2_0= ruleExpression ) )
            // InternalMathDsl.g:166:4: (lv_exp_2_0= ruleExpression )
            {
            // InternalMathDsl.g:166:4: (lv_exp_2_0= ruleExpression )
            // InternalMathDsl.g:167:5: lv_exp_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getMathExpAccess().getExpExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_exp_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMathExpRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_2_0,
            						"org.xtext.example.mydsl.MathDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

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
        }
        return current;
    }
    // $ANTLR end "ruleMathExp"


    // $ANTLR start "entryRuleExpression"
    // InternalMathDsl.g:188:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalMathDsl.g:188:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalMathDsl.g:189:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMathDsl.g:195:1: ruleExpression returns [EObject current=null] : this_Addition_0= ruleAddition ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Addition_0 = null;



        	enterRule();

        try {
            // InternalMathDsl.g:201:2: (this_Addition_0= ruleAddition )
            // InternalMathDsl.g:202:2: this_Addition_0= ruleAddition
            {

            		newCompositeNode(grammarAccess.getExpressionAccess().getAdditionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Addition_0=ruleAddition();

            state._fsp--;


            		current = this_Addition_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAddition"
    // InternalMathDsl.g:213:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalMathDsl.g:213:49: (iv_ruleAddition= ruleAddition EOF )
            // InternalMathDsl.g:214:2: iv_ruleAddition= ruleAddition EOF
            {
             newCompositeNode(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddition=ruleAddition();

            state._fsp--;

             current =iv_ruleAddition; 
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
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalMathDsl.g:220:1: ruleAddition returns [EObject current=null] : (this_Subtraction_0= ruleSubtraction ( () otherlv_2= '+' ( (lv_right_3_0= ruleSubtraction ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Subtraction_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMathDsl.g:226:2: ( (this_Subtraction_0= ruleSubtraction ( () otherlv_2= '+' ( (lv_right_3_0= ruleSubtraction ) ) )* ) )
            // InternalMathDsl.g:227:2: (this_Subtraction_0= ruleSubtraction ( () otherlv_2= '+' ( (lv_right_3_0= ruleSubtraction ) ) )* )
            {
            // InternalMathDsl.g:227:2: (this_Subtraction_0= ruleSubtraction ( () otherlv_2= '+' ( (lv_right_3_0= ruleSubtraction ) ) )* )
            // InternalMathDsl.g:228:3: this_Subtraction_0= ruleSubtraction ( () otherlv_2= '+' ( (lv_right_3_0= ruleSubtraction ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdditionAccess().getSubtractionParserRuleCall_0());
            		
            pushFollow(FOLLOW_8);
            this_Subtraction_0=ruleSubtraction();

            state._fsp--;


            			current = this_Subtraction_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMathDsl.g:236:3: ( () otherlv_2= '+' ( (lv_right_3_0= ruleSubtraction ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMathDsl.g:237:4: () otherlv_2= '+' ( (lv_right_3_0= ruleSubtraction ) )
            	    {
            	    // InternalMathDsl.g:237:4: ()
            	    // InternalMathDsl.g:238:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,14,FOLLOW_7); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAdditionAccess().getPlusSignKeyword_1_1());
            	    			
            	    // InternalMathDsl.g:248:4: ( (lv_right_3_0= ruleSubtraction ) )
            	    // InternalMathDsl.g:249:5: (lv_right_3_0= ruleSubtraction )
            	    {
            	    // InternalMathDsl.g:249:5: (lv_right_3_0= ruleSubtraction )
            	    // InternalMathDsl.g:250:6: lv_right_3_0= ruleSubtraction
            	    {

            	    						newCompositeNode(grammarAccess.getAdditionAccess().getRightSubtractionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_right_3_0=ruleSubtraction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAdditionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl.MathDsl.Subtraction");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleSubtraction"
    // InternalMathDsl.g:272:1: entryRuleSubtraction returns [EObject current=null] : iv_ruleSubtraction= ruleSubtraction EOF ;
    public final EObject entryRuleSubtraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubtraction = null;


        try {
            // InternalMathDsl.g:272:52: (iv_ruleSubtraction= ruleSubtraction EOF )
            // InternalMathDsl.g:273:2: iv_ruleSubtraction= ruleSubtraction EOF
            {
             newCompositeNode(grammarAccess.getSubtractionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubtraction=ruleSubtraction();

            state._fsp--;

             current =iv_ruleSubtraction; 
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
    // $ANTLR end "entryRuleSubtraction"


    // $ANTLR start "ruleSubtraction"
    // InternalMathDsl.g:279:1: ruleSubtraction returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( () otherlv_2= '-' ( (lv_right_3_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleSubtraction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMathDsl.g:285:2: ( (this_Multiplication_0= ruleMultiplication ( () otherlv_2= '-' ( (lv_right_3_0= ruleMultiplication ) ) )* ) )
            // InternalMathDsl.g:286:2: (this_Multiplication_0= ruleMultiplication ( () otherlv_2= '-' ( (lv_right_3_0= ruleMultiplication ) ) )* )
            {
            // InternalMathDsl.g:286:2: (this_Multiplication_0= ruleMultiplication ( () otherlv_2= '-' ( (lv_right_3_0= ruleMultiplication ) ) )* )
            // InternalMathDsl.g:287:3: this_Multiplication_0= ruleMultiplication ( () otherlv_2= '-' ( (lv_right_3_0= ruleMultiplication ) ) )*
            {

            			newCompositeNode(grammarAccess.getSubtractionAccess().getMultiplicationParserRuleCall_0());
            		
            pushFollow(FOLLOW_9);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;


            			current = this_Multiplication_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMathDsl.g:295:3: ( () otherlv_2= '-' ( (lv_right_3_0= ruleMultiplication ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMathDsl.g:296:4: () otherlv_2= '-' ( (lv_right_3_0= ruleMultiplication ) )
            	    {
            	    // InternalMathDsl.g:296:4: ()
            	    // InternalMathDsl.g:297:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getSubtractionAccess().getSubtractionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,15,FOLLOW_7); 

            	    				newLeafNode(otherlv_2, grammarAccess.getSubtractionAccess().getHyphenMinusKeyword_1_1());
            	    			
            	    // InternalMathDsl.g:307:4: ( (lv_right_3_0= ruleMultiplication ) )
            	    // InternalMathDsl.g:308:5: (lv_right_3_0= ruleMultiplication )
            	    {
            	    // InternalMathDsl.g:308:5: (lv_right_3_0= ruleMultiplication )
            	    // InternalMathDsl.g:309:6: lv_right_3_0= ruleMultiplication
            	    {

            	    						newCompositeNode(grammarAccess.getSubtractionAccess().getRightMultiplicationParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_right_3_0=ruleMultiplication();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSubtractionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl.MathDsl.Multiplication");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end "ruleSubtraction"


    // $ANTLR start "entryRuleMultiplication"
    // InternalMathDsl.g:331:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // InternalMathDsl.g:331:55: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalMathDsl.g:332:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
             newCompositeNode(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;

             current =iv_ruleMultiplication; 
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
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalMathDsl.g:338:1: ruleMultiplication returns [EObject current=null] : (this_Division_0= ruleDivision ( () otherlv_2= '*' ( (lv_right_3_0= ruleDivision ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Division_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMathDsl.g:344:2: ( (this_Division_0= ruleDivision ( () otherlv_2= '*' ( (lv_right_3_0= ruleDivision ) ) )* ) )
            // InternalMathDsl.g:345:2: (this_Division_0= ruleDivision ( () otherlv_2= '*' ( (lv_right_3_0= ruleDivision ) ) )* )
            {
            // InternalMathDsl.g:345:2: (this_Division_0= ruleDivision ( () otherlv_2= '*' ( (lv_right_3_0= ruleDivision ) ) )* )
            // InternalMathDsl.g:346:3: this_Division_0= ruleDivision ( () otherlv_2= '*' ( (lv_right_3_0= ruleDivision ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicationAccess().getDivisionParserRuleCall_0());
            		
            pushFollow(FOLLOW_10);
            this_Division_0=ruleDivision();

            state._fsp--;


            			current = this_Division_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMathDsl.g:354:3: ( () otherlv_2= '*' ( (lv_right_3_0= ruleDivision ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMathDsl.g:355:4: () otherlv_2= '*' ( (lv_right_3_0= ruleDivision ) )
            	    {
            	    // InternalMathDsl.g:355:4: ()
            	    // InternalMathDsl.g:356:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,16,FOLLOW_7); 

            	    				newLeafNode(otherlv_2, grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_1());
            	    			
            	    // InternalMathDsl.g:366:4: ( (lv_right_3_0= ruleDivision ) )
            	    // InternalMathDsl.g:367:5: (lv_right_3_0= ruleDivision )
            	    {
            	    // InternalMathDsl.g:367:5: (lv_right_3_0= ruleDivision )
            	    // InternalMathDsl.g:368:6: lv_right_3_0= ruleDivision
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicationAccess().getRightDivisionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_right_3_0=ruleDivision();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiplicationRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl.MathDsl.Division");
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
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRuleDivision"
    // InternalMathDsl.g:390:1: entryRuleDivision returns [EObject current=null] : iv_ruleDivision= ruleDivision EOF ;
    public final EObject entryRuleDivision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivision = null;


        try {
            // InternalMathDsl.g:390:49: (iv_ruleDivision= ruleDivision EOF )
            // InternalMathDsl.g:391:2: iv_ruleDivision= ruleDivision EOF
            {
             newCompositeNode(grammarAccess.getDivisionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDivision=ruleDivision();

            state._fsp--;

             current =iv_ruleDivision; 
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
    // $ANTLR end "entryRuleDivision"


    // $ANTLR start "ruleDivision"
    // InternalMathDsl.g:397:1: ruleDivision returns [EObject current=null] : (this_Primitive_0= rulePrimitive ( () otherlv_2= '/' ( (lv_right_3_0= rulePrimitive ) ) )* ) ;
    public final EObject ruleDivision() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Primitive_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMathDsl.g:403:2: ( (this_Primitive_0= rulePrimitive ( () otherlv_2= '/' ( (lv_right_3_0= rulePrimitive ) ) )* ) )
            // InternalMathDsl.g:404:2: (this_Primitive_0= rulePrimitive ( () otherlv_2= '/' ( (lv_right_3_0= rulePrimitive ) ) )* )
            {
            // InternalMathDsl.g:404:2: (this_Primitive_0= rulePrimitive ( () otherlv_2= '/' ( (lv_right_3_0= rulePrimitive ) ) )* )
            // InternalMathDsl.g:405:3: this_Primitive_0= rulePrimitive ( () otherlv_2= '/' ( (lv_right_3_0= rulePrimitive ) ) )*
            {

            			newCompositeNode(grammarAccess.getDivisionAccess().getPrimitiveParserRuleCall_0());
            		
            pushFollow(FOLLOW_11);
            this_Primitive_0=rulePrimitive();

            state._fsp--;


            			current = this_Primitive_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMathDsl.g:413:3: ( () otherlv_2= '/' ( (lv_right_3_0= rulePrimitive ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMathDsl.g:414:4: () otherlv_2= '/' ( (lv_right_3_0= rulePrimitive ) )
            	    {
            	    // InternalMathDsl.g:414:4: ()
            	    // InternalMathDsl.g:415:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getDivisionAccess().getDivisionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,17,FOLLOW_7); 

            	    				newLeafNode(otherlv_2, grammarAccess.getDivisionAccess().getSolidusKeyword_1_1());
            	    			
            	    // InternalMathDsl.g:425:4: ( (lv_right_3_0= rulePrimitive ) )
            	    // InternalMathDsl.g:426:5: (lv_right_3_0= rulePrimitive )
            	    {
            	    // InternalMathDsl.g:426:5: (lv_right_3_0= rulePrimitive )
            	    // InternalMathDsl.g:427:6: lv_right_3_0= rulePrimitive
            	    {

            	    						newCompositeNode(grammarAccess.getDivisionAccess().getRightPrimitiveParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_right_3_0=rulePrimitive();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDivisionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl.MathDsl.Primitive");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // $ANTLR end "ruleDivision"


    // $ANTLR start "entryRulePrimitive"
    // InternalMathDsl.g:449:1: entryRulePrimitive returns [EObject current=null] : iv_rulePrimitive= rulePrimitive EOF ;
    public final EObject entryRulePrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitive = null;


        try {
            // InternalMathDsl.g:449:50: (iv_rulePrimitive= rulePrimitive EOF )
            // InternalMathDsl.g:450:2: iv_rulePrimitive= rulePrimitive EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimitive=rulePrimitive();

            state._fsp--;

             current =iv_rulePrimitive; 
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
    // $ANTLR end "entryRulePrimitive"


    // $ANTLR start "rulePrimitive"
    // InternalMathDsl.g:456:1: rulePrimitive returns [EObject current=null] : (this_RawInteger_0= ruleRawInteger | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) | this_RawVariable_4= ruleRawVariable ) ;
    public final EObject rulePrimitive() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_RawInteger_0 = null;

        EObject this_Expression_2 = null;

        EObject this_RawVariable_4 = null;



        	enterRule();

        try {
            // InternalMathDsl.g:462:2: ( (this_RawInteger_0= ruleRawInteger | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) | this_RawVariable_4= ruleRawVariable ) )
            // InternalMathDsl.g:463:2: (this_RawInteger_0= ruleRawInteger | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) | this_RawVariable_4= ruleRawVariable )
            {
            // InternalMathDsl.g:463:2: (this_RawInteger_0= ruleRawInteger | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) | this_RawVariable_4= ruleRawVariable )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt6=1;
                }
                break;
            case 18:
                {
                alt6=2;
                }
                break;
            case RULE_ID:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMathDsl.g:464:3: this_RawInteger_0= ruleRawInteger
                    {

                    			newCompositeNode(grammarAccess.getPrimitiveAccess().getRawIntegerParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_RawInteger_0=ruleRawInteger();

                    state._fsp--;


                    			current = this_RawInteger_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMathDsl.g:473:3: (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' )
                    {
                    // InternalMathDsl.g:473:3: (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' )
                    // InternalMathDsl.g:474:4: otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_7); 

                    				newLeafNode(otherlv_1, grammarAccess.getPrimitiveAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimitiveAccess().getExpressionParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_12);
                    this_Expression_2=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_2;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_3=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrimitiveAccess().getRightParenthesisKeyword_1_2());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMathDsl.g:492:3: this_RawVariable_4= ruleRawVariable
                    {

                    			newCompositeNode(grammarAccess.getPrimitiveAccess().getRawVariableParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_RawVariable_4=ruleRawVariable();

                    state._fsp--;


                    			current = this_RawVariable_4;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "rulePrimitive"


    // $ANTLR start "entryRuleRawInteger"
    // InternalMathDsl.g:504:1: entryRuleRawInteger returns [EObject current=null] : iv_ruleRawInteger= ruleRawInteger EOF ;
    public final EObject entryRuleRawInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRawInteger = null;


        try {
            // InternalMathDsl.g:504:51: (iv_ruleRawInteger= ruleRawInteger EOF )
            // InternalMathDsl.g:505:2: iv_ruleRawInteger= ruleRawInteger EOF
            {
             newCompositeNode(grammarAccess.getRawIntegerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRawInteger=ruleRawInteger();

            state._fsp--;

             current =iv_ruleRawInteger; 
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
    // $ANTLR end "entryRuleRawInteger"


    // $ANTLR start "ruleRawInteger"
    // InternalMathDsl.g:511:1: ruleRawInteger returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleRawInteger() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMathDsl.g:517:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalMathDsl.g:518:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalMathDsl.g:518:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalMathDsl.g:519:3: (lv_value_0_0= RULE_INT )
            {
            // InternalMathDsl.g:519:3: (lv_value_0_0= RULE_INT )
            // InternalMathDsl.g:520:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getRawIntegerAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getRawIntegerRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

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
    // $ANTLR end "ruleRawInteger"


    // $ANTLR start "entryRuleRawVariable"
    // InternalMathDsl.g:539:1: entryRuleRawVariable returns [EObject current=null] : iv_ruleRawVariable= ruleRawVariable EOF ;
    public final EObject entryRuleRawVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRawVariable = null;


        try {
            // InternalMathDsl.g:539:52: (iv_ruleRawVariable= ruleRawVariable EOF )
            // InternalMathDsl.g:540:2: iv_ruleRawVariable= ruleRawVariable EOF
            {
             newCompositeNode(grammarAccess.getRawVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRawVariable=ruleRawVariable();

            state._fsp--;

             current =iv_ruleRawVariable; 
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
    // $ANTLR end "entryRuleRawVariable"


    // $ANTLR start "ruleRawVariable"
    // InternalMathDsl.g:546:1: ruleRawVariable returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleRawVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMathDsl.g:552:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalMathDsl.g:553:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalMathDsl.g:553:2: ( (otherlv_0= RULE_ID ) )
            // InternalMathDsl.g:554:3: (otherlv_0= RULE_ID )
            {
            // InternalMathDsl.g:554:3: (otherlv_0= RULE_ID )
            // InternalMathDsl.g:555:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getRawVariableRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getRawVariableAccess().getValueMathExpCrossReference_0());
            			

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
    // $ANTLR end "ruleRawVariable"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});

}