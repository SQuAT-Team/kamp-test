package org.palladiosimulator.commons.stoex.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.palladiosimulator.commons.stoex.services.StoExGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalStoExParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_CONDDELIMITER", "RULE_ELSEDELIMITER", "RULE_POW", "RULE_NOT", "RULE_DOUBLE", "RULE_SQUARE_PAREN_L", "RULE_SQUARE_PAREN_R", "RULE_LPAREN", "RULE_RPAREN", "RULE_ID", "RULE_COLON", "RULE_DOT", "RULE_BOOLEAN_KEYWORDS", "RULE_STRING", "RULE_DECINT", "RULE_DOUBLEPDF", "RULE_INTPMF", "RULE_DOUBLEPMF", "RULE_ENUMPMF", "RULE_ORDERED_DEF", "RULE_BOOLPMF", "RULE_SEMI", "RULE_DIGIT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'-'", "'/'", "'*'", "'AND'", "'OR'", "'XOR'", "'>'", "'<'", "'=='", "'<>'", "'>='", "'<='", "'+'", "'%'", "'_'", "'unitless'", "'B'", "'s'", "'m'"
    };
    public static final int RULE_BOOLEAN_KEYWORDS=16;
    public static final int RULE_LPAREN=11;
    public static final int RULE_SQUARE_PAREN_L=9;
    public static final int RULE_ENUMPMF=22;
    public static final int RULE_SQUARE_PAREN_R=10;
    public static final int RULE_ID=13;
    public static final int RULE_DIGIT=26;
    public static final int RULE_COLON=14;
    public static final int RULE_BOOLPMF=24;
    public static final int RULE_ORDERED_DEF=23;
    public static final int RULE_ML_COMMENT=27;
    public static final int RULE_ELSEDELIMITER=5;
    public static final int RULE_INTPMF=20;
    public static final int RULE_STRING=17;
    public static final int RULE_NOT=7;
    public static final int RULE_DOUBLEPMF=21;
    public static final int RULE_POW=6;
    public static final int RULE_SL_COMMENT=28;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=8;
    public static final int T__38=38;
    public static final int RULE_CONDDELIMITER=4;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int RULE_DECINT=18;
    public static final int RULE_DOT=15;
    public static final int EOF=-1;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=29;
    public static final int RULE_DOUBLEPDF=19;
    public static final int RULE_ANY_OTHER=30;
    public static final int RULE_RPAREN=12;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_SEMI=25;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalStoExParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalStoExParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalStoExParser.tokenNames; }
    public String getGrammarFileName() { return "../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private StoExGrammarAccess grammarAccess;
     	
        public InternalStoExParser(TokenStream input, StoExGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "expression";	
       	}
       	
       	@Override
       	protected StoExGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleexpression"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:74:1: entryRuleexpression returns [EObject current=null] : iv_ruleexpression= ruleexpression EOF ;
    public final EObject entryRuleexpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpression = null;


        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:75:2: (iv_ruleexpression= ruleexpression EOF )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:76:2: iv_ruleexpression= ruleexpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleexpression_in_entryRuleexpression81);
            iv_ruleexpression=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleexpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleexpression91); if (state.failed) return current;

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
    // $ANTLR end "entryRuleexpression"


    // $ANTLR start "ruleexpression"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:83:1: ruleexpression returns [EObject current=null] : this_ifelseExpr_0= ruleifelseExpr ;
    public final EObject ruleexpression() throws RecognitionException {
        EObject current = null;

        EObject this_ifelseExpr_0 = null;


         enterRule(); 
            
        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:86:28: (this_ifelseExpr_0= ruleifelseExpr )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:88:2: this_ifelseExpr_0= ruleifelseExpr
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getIfelseExprParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleifelseExpr_in_ruleexpression140);
            this_ifelseExpr_0=ruleifelseExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ifelseExpr_0; 
                      afterParserOrEnumRuleCall();
                  
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
    // $ANTLR end "ruleexpression"


    // $ANTLR start "entryRuleifelseExpr"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:107:1: entryRuleifelseExpr returns [EObject current=null] : iv_ruleifelseExpr= ruleifelseExpr EOF ;
    public final EObject entryRuleifelseExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleifelseExpr = null;


        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:108:2: (iv_ruleifelseExpr= ruleifelseExpr EOF )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:109:2: iv_ruleifelseExpr= ruleifelseExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfelseExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleifelseExpr_in_entryRuleifelseExpr174);
            iv_ruleifelseExpr=ruleifelseExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleifelseExpr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleifelseExpr184); if (state.failed) return current;

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
    // $ANTLR end "entryRuleifelseExpr"


    // $ANTLR start "ruleifelseExpr"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:116:1: ruleifelseExpr returns [EObject current=null] : (this_boolAndExpr_0= ruleboolAndExpr ( () this_CONDDELIMITER_2= RULE_CONDDELIMITER ( (lv_ifExpression_3_0= ruleboolAndExpr ) ) this_ELSEDELIMITER_4= RULE_ELSEDELIMITER ( (lv_elseExpression_5_0= ruleboolAndExpr ) ) )? ) ;
    public final EObject ruleifelseExpr() throws RecognitionException {
        EObject current = null;

        Token this_CONDDELIMITER_2=null;
        Token this_ELSEDELIMITER_4=null;
        EObject this_boolAndExpr_0 = null;

        EObject lv_ifExpression_3_0 = null;

        EObject lv_elseExpression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:119:28: ( (this_boolAndExpr_0= ruleboolAndExpr ( () this_CONDDELIMITER_2= RULE_CONDDELIMITER ( (lv_ifExpression_3_0= ruleboolAndExpr ) ) this_ELSEDELIMITER_4= RULE_ELSEDELIMITER ( (lv_elseExpression_5_0= ruleboolAndExpr ) ) )? ) )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:120:1: (this_boolAndExpr_0= ruleboolAndExpr ( () this_CONDDELIMITER_2= RULE_CONDDELIMITER ( (lv_ifExpression_3_0= ruleboolAndExpr ) ) this_ELSEDELIMITER_4= RULE_ELSEDELIMITER ( (lv_elseExpression_5_0= ruleboolAndExpr ) ) )? )
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:120:1: (this_boolAndExpr_0= ruleboolAndExpr ( () this_CONDDELIMITER_2= RULE_CONDDELIMITER ( (lv_ifExpression_3_0= ruleboolAndExpr ) ) this_ELSEDELIMITER_4= RULE_ELSEDELIMITER ( (lv_elseExpression_5_0= ruleboolAndExpr ) ) )? )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:121:2: this_boolAndExpr_0= ruleboolAndExpr ( () this_CONDDELIMITER_2= RULE_CONDDELIMITER ( (lv_ifExpression_3_0= ruleboolAndExpr ) ) this_ELSEDELIMITER_4= RULE_ELSEDELIMITER ( (lv_elseExpression_5_0= ruleboolAndExpr ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getIfelseExprAccess().getBoolAndExprParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleboolAndExpr_in_ruleifelseExpr234);
            this_boolAndExpr_0=ruleboolAndExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_boolAndExpr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:132:1: ( () this_CONDDELIMITER_2= RULE_CONDDELIMITER ( (lv_ifExpression_3_0= ruleboolAndExpr ) ) this_ELSEDELIMITER_4= RULE_ELSEDELIMITER ( (lv_elseExpression_5_0= ruleboolAndExpr ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_CONDDELIMITER) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:132:2: () this_CONDDELIMITER_2= RULE_CONDDELIMITER ( (lv_ifExpression_3_0= ruleboolAndExpr ) ) this_ELSEDELIMITER_4= RULE_ELSEDELIMITER ( (lv_elseExpression_5_0= ruleboolAndExpr ) )
                    {
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:132:2: ()
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:133:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getIfelseExprAccess().getIfElseExpressionConditionExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    this_CONDDELIMITER_2=(Token)match(input,RULE_CONDDELIMITER,FollowSets000.FOLLOW_RULE_CONDDELIMITER_in_ruleifelseExpr257); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_CONDDELIMITER_2, grammarAccess.getIfelseExprAccess().getCONDDELIMITERTerminalRuleCall_1_1()); 
                          
                    }
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:145:1: ( (lv_ifExpression_3_0= ruleboolAndExpr ) )
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:146:1: (lv_ifExpression_3_0= ruleboolAndExpr )
                    {
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:146:1: (lv_ifExpression_3_0= ruleboolAndExpr )
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:147:3: lv_ifExpression_3_0= ruleboolAndExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfelseExprAccess().getIfExpressionBoolAndExprParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleboolAndExpr_in_ruleifelseExpr277);
                    lv_ifExpression_3_0=ruleboolAndExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIfelseExprRule());
                      	        }
                             		set(
                             			current, 
                             			"ifExpression",
                              		lv_ifExpression_3_0, 
                              		"boolAndExpr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_ELSEDELIMITER_4=(Token)match(input,RULE_ELSEDELIMITER,FollowSets000.FOLLOW_RULE_ELSEDELIMITER_in_ruleifelseExpr288); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ELSEDELIMITER_4, grammarAccess.getIfelseExprAccess().getELSEDELIMITERTerminalRuleCall_1_3()); 
                          
                    }
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:167:1: ( (lv_elseExpression_5_0= ruleboolAndExpr ) )
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:168:1: (lv_elseExpression_5_0= ruleboolAndExpr )
                    {
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:168:1: (lv_elseExpression_5_0= ruleboolAndExpr )
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:169:3: lv_elseExpression_5_0= ruleboolAndExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfelseExprAccess().getElseExpressionBoolAndExprParserRuleCall_1_4_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleboolAndExpr_in_ruleifelseExpr308);
                    lv_elseExpression_5_0=ruleboolAndExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIfelseExprRule());
                      	        }
                             		set(
                             			current, 
                             			"elseExpression",
                              		lv_elseExpression_5_0, 
                              		"boolAndExpr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


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
    // $ANTLR end "ruleifelseExpr"


    // $ANTLR start "entryRuleboolAndExpr"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:195:1: entryRuleboolAndExpr returns [EObject current=null] : iv_ruleboolAndExpr= ruleboolAndExpr EOF ;
    public final EObject entryRuleboolAndExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleboolAndExpr = null;


        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:196:2: (iv_ruleboolAndExpr= ruleboolAndExpr EOF )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:197:2: iv_ruleboolAndExpr= ruleboolAndExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolAndExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleboolAndExpr_in_entryRuleboolAndExpr348);
            iv_ruleboolAndExpr=ruleboolAndExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleboolAndExpr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleboolAndExpr358); if (state.failed) return current;

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
    // $ANTLR end "entryRuleboolAndExpr"


    // $ANTLR start "ruleboolAndExpr"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:204:1: ruleboolAndExpr returns [EObject current=null] : (this_boolOrExpr_0= ruleboolOrExpr ( () ( (lv_operation_2_0= ruleandoperation ) ) ( (lv_right_3_0= ruleboolOrExpr ) ) )* ) ;
    public final EObject ruleboolAndExpr() throws RecognitionException {
        EObject current = null;

        EObject this_boolOrExpr_0 = null;

        Enumerator lv_operation_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:207:28: ( (this_boolOrExpr_0= ruleboolOrExpr ( () ( (lv_operation_2_0= ruleandoperation ) ) ( (lv_right_3_0= ruleboolOrExpr ) ) )* ) )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:208:1: (this_boolOrExpr_0= ruleboolOrExpr ( () ( (lv_operation_2_0= ruleandoperation ) ) ( (lv_right_3_0= ruleboolOrExpr ) ) )* )
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:208:1: (this_boolOrExpr_0= ruleboolOrExpr ( () ( (lv_operation_2_0= ruleandoperation ) ) ( (lv_right_3_0= ruleboolOrExpr ) ) )* )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:209:2: this_boolOrExpr_0= ruleboolOrExpr ( () ( (lv_operation_2_0= ruleandoperation ) ) ( (lv_right_3_0= ruleboolOrExpr ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBoolAndExprAccess().getBoolOrExprParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleboolOrExpr_in_ruleboolAndExpr408);
            this_boolOrExpr_0=ruleboolOrExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_boolOrExpr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:220:1: ( () ( (lv_operation_2_0= ruleandoperation ) ) ( (lv_right_3_0= ruleboolOrExpr ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==34) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:220:2: () ( (lv_operation_2_0= ruleandoperation ) ) ( (lv_right_3_0= ruleboolOrExpr ) )
            	    {
            	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:220:2: ()
            	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:221:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBoolAndExprAccess().getBooleanOperatorExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:229:2: ( (lv_operation_2_0= ruleandoperation ) )
            	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:230:1: (lv_operation_2_0= ruleandoperation )
            	    {
            	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:230:1: (lv_operation_2_0= ruleandoperation )
            	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:231:3: lv_operation_2_0= ruleandoperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBoolAndExprAccess().getOperationAndoperationEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleandoperation_in_ruleboolAndExpr441);
            	    lv_operation_2_0=ruleandoperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBoolAndExprRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"operation",
            	              		lv_operation_2_0, 
            	              		"andoperation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:247:2: ( (lv_right_3_0= ruleboolOrExpr ) )
            	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:248:1: (lv_right_3_0= ruleboolOrExpr )
            	    {
            	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:248:1: (lv_right_3_0= ruleboolOrExpr )
            	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:249:3: lv_right_3_0= ruleboolOrExpr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBoolAndExprAccess().getRightBoolOrExprParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleboolOrExpr_in_ruleboolAndExpr462);
            	    lv_right_3_0=ruleboolOrExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBoolAndExprRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"boolOrExpr");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

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
    // $ANTLR end "ruleboolAndExpr"


    // $ANTLR start "entryRuleboolOrExpr"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:273:1: entryRuleboolOrExpr returns [EObject current=null] : iv_ruleboolOrExpr= ruleboolOrExpr EOF ;
    public final EObject entryRuleboolOrExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleboolOrExpr = null;


        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:274:2: (iv_ruleboolOrExpr= ruleboolOrExpr EOF )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:275:2: iv_ruleboolOrExpr= ruleboolOrExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolOrExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleboolOrExpr_in_entryRuleboolOrExpr500);
            iv_ruleboolOrExpr=ruleboolOrExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleboolOrExpr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleboolOrExpr510); if (state.failed) return current;

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
    // $ANTLR end "entryRuleboolOrExpr"


    // $ANTLR start "ruleboolOrExpr"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:282:1: ruleboolOrExpr returns [EObject current=null] : (this_compareExpr_0= rulecompareExpr ( () ( (lv_operation_2_0= ruleoroperations ) ) ( (lv_right_3_0= rulecompareExpr ) ) )* ) ;
    public final EObject ruleboolOrExpr() throws RecognitionException {
        EObject current = null;

        EObject this_compareExpr_0 = null;

        Enumerator lv_operation_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:285:28: ( (this_compareExpr_0= rulecompareExpr ( () ( (lv_operation_2_0= ruleoroperations ) ) ( (lv_right_3_0= rulecompareExpr ) ) )* ) )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:286:1: (this_compareExpr_0= rulecompareExpr ( () ( (lv_operation_2_0= ruleoroperations ) ) ( (lv_right_3_0= rulecompareExpr ) ) )* )
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:286:1: (this_compareExpr_0= rulecompareExpr ( () ( (lv_operation_2_0= ruleoroperations ) ) ( (lv_right_3_0= rulecompareExpr ) ) )* )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:287:2: this_compareExpr_0= rulecompareExpr ( () ( (lv_operation_2_0= ruleoroperations ) ) ( (lv_right_3_0= rulecompareExpr ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBoolOrExprAccess().getCompareExprParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_rulecompareExpr_in_ruleboolOrExpr560);
            this_compareExpr_0=rulecompareExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_compareExpr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:298:1: ( () ( (lv_operation_2_0= ruleoroperations ) ) ( (lv_right_3_0= rulecompareExpr ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=35 && LA3_0<=36)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:298:2: () ( (lv_operation_2_0= ruleoroperations ) ) ( (lv_right_3_0= rulecompareExpr ) )
            	    {
            	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:298:2: ()
            	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:299:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBoolOrExprAccess().getBooleanOperatorExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:307:2: ( (lv_operation_2_0= ruleoroperations ) )
            	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:308:1: (lv_operation_2_0= ruleoroperations )
            	    {
            	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:308:1: (lv_operation_2_0= ruleoroperations )
            	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:309:3: lv_operation_2_0= ruleoroperations
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBoolOrExprAccess().getOperationOroperationsEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleoroperations_in_ruleboolOrExpr593);
            	    lv_operation_2_0=ruleoroperations();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBoolOrExprRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"operation",
            	              		lv_operation_2_0, 
            	              		"oroperations");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:325:2: ( (lv_right_3_0= rulecompareExpr ) )
            	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:326:1: (lv_right_3_0= rulecompareExpr )
            	    {
            	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:326:1: (lv_right_3_0= rulecompareExpr )
            	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:327:3: lv_right_3_0= rulecompareExpr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBoolOrExprAccess().getRightCompareExprParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_rulecompareExpr_in_ruleboolOrExpr614);
            	    lv_right_3_0=rulecompareExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBoolOrExprRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"compareExpr");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

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
    // $ANTLR end "ruleboolOrExpr"


    // $ANTLR start "entryRulecompareExpr"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:351:1: entryRulecompareExpr returns [EObject current=null] : iv_rulecompareExpr= rulecompareExpr EOF ;
    public final EObject entryRulecompareExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecompareExpr = null;


        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:352:2: (iv_rulecompareExpr= rulecompareExpr EOF )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:353:2: iv_rulecompareExpr= rulecompareExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompareExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulecompareExpr_in_entryRulecompareExpr652);
            iv_rulecompareExpr=rulecompareExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulecompareExpr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulecompareExpr662); if (state.failed) return current;

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
    // $ANTLR end "entryRulecompareExpr"


    // $ANTLR start "rulecompareExpr"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:360:1: rulecompareExpr returns [EObject current=null] : (this_sumExpr_0= rulesumExpr ( () ( (lv_operation_2_0= ruleCompareOperations ) ) ( (lv_right_3_0= rulesumExpr ) ) )? ) ;
    public final EObject rulecompareExpr() throws RecognitionException {
        EObject current = null;

        EObject this_sumExpr_0 = null;

        Enumerator lv_operation_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:363:28: ( (this_sumExpr_0= rulesumExpr ( () ( (lv_operation_2_0= ruleCompareOperations ) ) ( (lv_right_3_0= rulesumExpr ) ) )? ) )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:364:1: (this_sumExpr_0= rulesumExpr ( () ( (lv_operation_2_0= ruleCompareOperations ) ) ( (lv_right_3_0= rulesumExpr ) ) )? )
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:364:1: (this_sumExpr_0= rulesumExpr ( () ( (lv_operation_2_0= ruleCompareOperations ) ) ( (lv_right_3_0= rulesumExpr ) ) )? )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:365:2: this_sumExpr_0= rulesumExpr ( () ( (lv_operation_2_0= ruleCompareOperations ) ) ( (lv_right_3_0= rulesumExpr ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCompareExprAccess().getSumExprParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_rulesumExpr_in_rulecompareExpr712);
            this_sumExpr_0=rulesumExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_sumExpr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:376:1: ( () ( (lv_operation_2_0= ruleCompareOperations ) ) ( (lv_right_3_0= rulesumExpr ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=37 && LA4_0<=42)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:376:2: () ( (lv_operation_2_0= ruleCompareOperations ) ) ( (lv_right_3_0= rulesumExpr ) )
                    {
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:376:2: ()
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:377:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getCompareExprAccess().getCompareExpressionLeftAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:385:2: ( (lv_operation_2_0= ruleCompareOperations ) )
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:386:1: (lv_operation_2_0= ruleCompareOperations )
                    {
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:386:1: (lv_operation_2_0= ruleCompareOperations )
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:387:3: lv_operation_2_0= ruleCompareOperations
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompareExprAccess().getOperationCompareOperationsEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCompareOperations_in_rulecompareExpr745);
                    lv_operation_2_0=ruleCompareOperations();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCompareExprRule());
                      	        }
                             		set(
                             			current, 
                             			"operation",
                              		lv_operation_2_0, 
                              		"CompareOperations");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:403:2: ( (lv_right_3_0= rulesumExpr ) )
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:404:1: (lv_right_3_0= rulesumExpr )
                    {
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:404:1: (lv_right_3_0= rulesumExpr )
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:405:3: lv_right_3_0= rulesumExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompareExprAccess().getRightSumExprParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulesumExpr_in_rulecompareExpr766);
                    lv_right_3_0=rulesumExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCompareExprRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"sumExpr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


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
    // $ANTLR end "rulecompareExpr"


    // $ANTLR start "entryRulesumExpr"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:429:1: entryRulesumExpr returns [EObject current=null] : iv_rulesumExpr= rulesumExpr EOF ;
    public final EObject entryRulesumExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesumExpr = null;


        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:430:2: (iv_rulesumExpr= rulesumExpr EOF )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:431:2: iv_rulesumExpr= rulesumExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSumExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulesumExpr_in_entryRulesumExpr804);
            iv_rulesumExpr=rulesumExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulesumExpr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesumExpr814); if (state.failed) return current;

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
    // $ANTLR end "entryRulesumExpr"


    // $ANTLR start "rulesumExpr"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:438:1: rulesumExpr returns [EObject current=null] : (this_prodExpr_0= ruleprodExpr ( () ( (lv_operation_2_0= ruleTermOperations ) ) ( (lv_right_3_0= ruleprodExpr ) ) )* ) ;
    public final EObject rulesumExpr() throws RecognitionException {
        EObject current = null;

        EObject this_prodExpr_0 = null;

        Enumerator lv_operation_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:441:28: ( (this_prodExpr_0= ruleprodExpr ( () ( (lv_operation_2_0= ruleTermOperations ) ) ( (lv_right_3_0= ruleprodExpr ) ) )* ) )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:442:1: (this_prodExpr_0= ruleprodExpr ( () ( (lv_operation_2_0= ruleTermOperations ) ) ( (lv_right_3_0= ruleprodExpr ) ) )* )
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:442:1: (this_prodExpr_0= ruleprodExpr ( () ( (lv_operation_2_0= ruleTermOperations ) ) ( (lv_right_3_0= ruleprodExpr ) ) )* )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:443:2: this_prodExpr_0= ruleprodExpr ( () ( (lv_operation_2_0= ruleTermOperations ) ) ( (lv_right_3_0= ruleprodExpr ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSumExprAccess().getProdExprParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleprodExpr_in_rulesumExpr864);
            this_prodExpr_0=ruleprodExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_prodExpr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:454:1: ( () ( (lv_operation_2_0= ruleTermOperations ) ) ( (lv_right_3_0= ruleprodExpr ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==31||LA5_0==43) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:454:2: () ( (lv_operation_2_0= ruleTermOperations ) ) ( (lv_right_3_0= ruleprodExpr ) )
            	    {
            	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:454:2: ()
            	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:455:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getSumExprAccess().getTermExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:463:2: ( (lv_operation_2_0= ruleTermOperations ) )
            	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:464:1: (lv_operation_2_0= ruleTermOperations )
            	    {
            	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:464:1: (lv_operation_2_0= ruleTermOperations )
            	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:465:3: lv_operation_2_0= ruleTermOperations
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSumExprAccess().getOperationTermOperationsEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleTermOperations_in_rulesumExpr897);
            	    lv_operation_2_0=ruleTermOperations();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSumExprRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"operation",
            	              		lv_operation_2_0, 
            	              		"TermOperations");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:481:2: ( (lv_right_3_0= ruleprodExpr ) )
            	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:482:1: (lv_right_3_0= ruleprodExpr )
            	    {
            	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:482:1: (lv_right_3_0= ruleprodExpr )
            	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:483:3: lv_right_3_0= ruleprodExpr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSumExprAccess().getRightProdExprParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleprodExpr_in_rulesumExpr918);
            	    lv_right_3_0=ruleprodExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSumExprRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"prodExpr");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

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
    // $ANTLR end "rulesumExpr"


    // $ANTLR start "entryRuleprodExpr"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:507:1: entryRuleprodExpr returns [EObject current=null] : iv_ruleprodExpr= ruleprodExpr EOF ;
    public final EObject entryRuleprodExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprodExpr = null;


        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:508:2: (iv_ruleprodExpr= ruleprodExpr EOF )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:509:2: iv_ruleprodExpr= ruleprodExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProdExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleprodExpr_in_entryRuleprodExpr956);
            iv_ruleprodExpr=ruleprodExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleprodExpr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleprodExpr966); if (state.failed) return current;

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
    // $ANTLR end "entryRuleprodExpr"


    // $ANTLR start "ruleprodExpr"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:516:1: ruleprodExpr returns [EObject current=null] : (this_powExpr_0= rulepowExpr ( () ( (lv_operation_2_0= ruleProductOperations ) ) ( (lv_right_3_0= rulepowExpr ) ) )* ) ;
    public final EObject ruleprodExpr() throws RecognitionException {
        EObject current = null;

        EObject this_powExpr_0 = null;

        Enumerator lv_operation_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:519:28: ( (this_powExpr_0= rulepowExpr ( () ( (lv_operation_2_0= ruleProductOperations ) ) ( (lv_right_3_0= rulepowExpr ) ) )* ) )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:520:1: (this_powExpr_0= rulepowExpr ( () ( (lv_operation_2_0= ruleProductOperations ) ) ( (lv_right_3_0= rulepowExpr ) ) )* )
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:520:1: (this_powExpr_0= rulepowExpr ( () ( (lv_operation_2_0= ruleProductOperations ) ) ( (lv_right_3_0= rulepowExpr ) ) )* )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:521:2: this_powExpr_0= rulepowExpr ( () ( (lv_operation_2_0= ruleProductOperations ) ) ( (lv_right_3_0= rulepowExpr ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getProdExprAccess().getPowExprParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_rulepowExpr_in_ruleprodExpr1016);
            this_powExpr_0=rulepowExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_powExpr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:532:1: ( () ( (lv_operation_2_0= ruleProductOperations ) ) ( (lv_right_3_0= rulepowExpr ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=32 && LA6_0<=33)||LA6_0==44) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:532:2: () ( (lv_operation_2_0= ruleProductOperations ) ) ( (lv_right_3_0= rulepowExpr ) )
            	    {
            	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:532:2: ()
            	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:533:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getProdExprAccess().getProductExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:541:2: ( (lv_operation_2_0= ruleProductOperations ) )
            	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:542:1: (lv_operation_2_0= ruleProductOperations )
            	    {
            	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:542:1: (lv_operation_2_0= ruleProductOperations )
            	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:543:3: lv_operation_2_0= ruleProductOperations
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getProdExprAccess().getOperationProductOperationsEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleProductOperations_in_ruleprodExpr1049);
            	    lv_operation_2_0=ruleProductOperations();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getProdExprRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"operation",
            	              		lv_operation_2_0, 
            	              		"ProductOperations");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:559:2: ( (lv_right_3_0= rulepowExpr ) )
            	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:560:1: (lv_right_3_0= rulepowExpr )
            	    {
            	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:560:1: (lv_right_3_0= rulepowExpr )
            	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:561:3: lv_right_3_0= rulepowExpr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getProdExprAccess().getRightPowExprParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_rulepowExpr_in_ruleprodExpr1070);
            	    lv_right_3_0=rulepowExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getProdExprRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"powExpr");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // $ANTLR end "ruleprodExpr"


    // $ANTLR start "entryRulepowExpr"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:585:1: entryRulepowExpr returns [EObject current=null] : iv_rulepowExpr= rulepowExpr EOF ;
    public final EObject entryRulepowExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepowExpr = null;


        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:586:2: (iv_rulepowExpr= rulepowExpr EOF )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:587:2: iv_rulepowExpr= rulepowExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPowExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulepowExpr_in_entryRulepowExpr1108);
            iv_rulepowExpr=rulepowExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulepowExpr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulepowExpr1118); if (state.failed) return current;

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
    // $ANTLR end "entryRulepowExpr"


    // $ANTLR start "rulepowExpr"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:594:1: rulepowExpr returns [EObject current=null] : (this_unaryExpr_0= ruleunaryExpr ( () this_POW_2= RULE_POW ( (lv_exponent_3_0= ruleunaryExpr ) ) )? ) ;
    public final EObject rulepowExpr() throws RecognitionException {
        EObject current = null;

        Token this_POW_2=null;
        EObject this_unaryExpr_0 = null;

        EObject lv_exponent_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:597:28: ( (this_unaryExpr_0= ruleunaryExpr ( () this_POW_2= RULE_POW ( (lv_exponent_3_0= ruleunaryExpr ) ) )? ) )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:598:1: (this_unaryExpr_0= ruleunaryExpr ( () this_POW_2= RULE_POW ( (lv_exponent_3_0= ruleunaryExpr ) ) )? )
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:598:1: (this_unaryExpr_0= ruleunaryExpr ( () this_POW_2= RULE_POW ( (lv_exponent_3_0= ruleunaryExpr ) ) )? )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:599:2: this_unaryExpr_0= ruleunaryExpr ( () this_POW_2= RULE_POW ( (lv_exponent_3_0= ruleunaryExpr ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPowExprAccess().getUnaryExprParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleunaryExpr_in_rulepowExpr1168);
            this_unaryExpr_0=ruleunaryExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_unaryExpr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:610:1: ( () this_POW_2= RULE_POW ( (lv_exponent_3_0= ruleunaryExpr ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_POW) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:610:2: () this_POW_2= RULE_POW ( (lv_exponent_3_0= ruleunaryExpr ) )
                    {
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:610:2: ()
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:611:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getPowExprAccess().getPowerExpressionBaseAction_1_0(),
                                  current);
                          
                    }

                    }

                    this_POW_2=(Token)match(input,RULE_POW,FollowSets000.FOLLOW_RULE_POW_in_rulepowExpr1191); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_POW_2, grammarAccess.getPowExprAccess().getPOWTerminalRuleCall_1_1()); 
                          
                    }
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:623:1: ( (lv_exponent_3_0= ruleunaryExpr ) )
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:624:1: (lv_exponent_3_0= ruleunaryExpr )
                    {
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:624:1: (lv_exponent_3_0= ruleunaryExpr )
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:625:3: lv_exponent_3_0= ruleunaryExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPowExprAccess().getExponentUnaryExprParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleunaryExpr_in_rulepowExpr1211);
                    lv_exponent_3_0=ruleunaryExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPowExprRule());
                      	        }
                             		set(
                             			current, 
                             			"exponent",
                              		lv_exponent_3_0, 
                              		"unaryExpr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


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
    // $ANTLR end "rulepowExpr"


    // $ANTLR start "entryRuleunaryExpr"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:649:1: entryRuleunaryExpr returns [EObject current=null] : iv_ruleunaryExpr= ruleunaryExpr EOF ;
    public final EObject entryRuleunaryExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunaryExpr = null;


        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:650:2: (iv_ruleunaryExpr= ruleunaryExpr EOF )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:651:2: iv_ruleunaryExpr= ruleunaryExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleunaryExpr_in_entryRuleunaryExpr1249);
            iv_ruleunaryExpr=ruleunaryExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleunaryExpr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleunaryExpr1259); if (state.failed) return current;

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
    // $ANTLR end "entryRuleunaryExpr"


    // $ANTLR start "ruleunaryExpr"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:658:1: ruleunaryExpr returns [EObject current=null] : (this_NegativeExpression_0= ruleNegativeExpression | this_NotExpression_1= ruleNotExpression | this_atom_2= ruleatom ) ;
    public final EObject ruleunaryExpr() throws RecognitionException {
        EObject current = null;

        EObject this_NegativeExpression_0 = null;

        EObject this_NotExpression_1 = null;

        EObject this_atom_2 = null;


         enterRule(); 
            
        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:661:28: ( (this_NegativeExpression_0= ruleNegativeExpression | this_NotExpression_1= ruleNotExpression | this_atom_2= ruleatom ) )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:662:1: (this_NegativeExpression_0= ruleNegativeExpression | this_NotExpression_1= ruleNotExpression | this_atom_2= ruleatom )
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:662:1: (this_NegativeExpression_0= ruleNegativeExpression | this_NotExpression_1= ruleNotExpression | this_atom_2= ruleatom )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt8=1;
                }
                break;
            case RULE_NOT:
                {
                alt8=2;
                }
                break;
            case RULE_DOUBLE:
            case RULE_LPAREN:
            case RULE_ID:
            case RULE_BOOLEAN_KEYWORDS:
            case RULE_STRING:
            case RULE_DECINT:
            case RULE_DOUBLEPDF:
            case RULE_INTPMF:
            case RULE_DOUBLEPMF:
            case RULE_ENUMPMF:
            case RULE_BOOLPMF:
                {
                alt8=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:663:2: this_NegativeExpression_0= ruleNegativeExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnaryExprAccess().getNegativeExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNegativeExpression_in_ruleunaryExpr1309);
                    this_NegativeExpression_0=ruleNegativeExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NegativeExpression_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:676:2: this_NotExpression_1= ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnaryExprAccess().getNotExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_ruleunaryExpr1339);
                    this_NotExpression_1=ruleNotExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NotExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:689:2: this_atom_2= ruleatom
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnaryExprAccess().getAtomParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleatom_in_ruleunaryExpr1369);
                    this_atom_2=ruleatom();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_atom_2; 
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
    // $ANTLR end "ruleunaryExpr"


    // $ANTLR start "entryRuleNotExpression"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:708:1: entryRuleNotExpression returns [EObject current=null] : iv_ruleNotExpression= ruleNotExpression EOF ;
    public final EObject entryRuleNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotExpression = null;


        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:709:2: (iv_ruleNotExpression= ruleNotExpression EOF )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:710:2: iv_ruleNotExpression= ruleNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_entryRuleNotExpression1404);
            iv_ruleNotExpression=ruleNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNotExpression1414); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNotExpression"


    // $ANTLR start "ruleNotExpression"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:717:1: ruleNotExpression returns [EObject current=null] : (this_NOT_0= RULE_NOT ( (lv_inner_1_0= ruleunaryExpr ) ) ) ;
    public final EObject ruleNotExpression() throws RecognitionException {
        EObject current = null;

        Token this_NOT_0=null;
        EObject lv_inner_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:720:28: ( (this_NOT_0= RULE_NOT ( (lv_inner_1_0= ruleunaryExpr ) ) ) )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:721:1: (this_NOT_0= RULE_NOT ( (lv_inner_1_0= ruleunaryExpr ) ) )
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:721:1: (this_NOT_0= RULE_NOT ( (lv_inner_1_0= ruleunaryExpr ) ) )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:721:2: this_NOT_0= RULE_NOT ( (lv_inner_1_0= ruleunaryExpr ) )
            {
            this_NOT_0=(Token)match(input,RULE_NOT,FollowSets000.FOLLOW_RULE_NOT_in_ruleNotExpression1450); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_NOT_0, grammarAccess.getNotExpressionAccess().getNOTTerminalRuleCall_0()); 
                  
            }
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:725:1: ( (lv_inner_1_0= ruleunaryExpr ) )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:726:1: (lv_inner_1_0= ruleunaryExpr )
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:726:1: (lv_inner_1_0= ruleunaryExpr )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:727:3: lv_inner_1_0= ruleunaryExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNotExpressionAccess().getInnerUnaryExprParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleunaryExpr_in_ruleNotExpression1470);
            lv_inner_1_0=ruleunaryExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNotExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"inner",
                      		lv_inner_1_0, 
                      		"unaryExpr");
              	        afterParserOrEnumRuleCall();
              	    
            }

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
    // $ANTLR end "ruleNotExpression"


    // $ANTLR start "entryRuleNegativeExpression"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:751:1: entryRuleNegativeExpression returns [EObject current=null] : iv_ruleNegativeExpression= ruleNegativeExpression EOF ;
    public final EObject entryRuleNegativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegativeExpression = null;


        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:752:2: (iv_ruleNegativeExpression= ruleNegativeExpression EOF )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:753:2: iv_ruleNegativeExpression= ruleNegativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNegativeExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNegativeExpression_in_entryRuleNegativeExpression1506);
            iv_ruleNegativeExpression=ruleNegativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNegativeExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNegativeExpression1516); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNegativeExpression"


    // $ANTLR start "ruleNegativeExpression"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:760:1: ruleNegativeExpression returns [EObject current=null] : (otherlv_0= '-' ( (lv_inner_1_0= ruleunaryExpr ) ) ) ;
    public final EObject ruleNegativeExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_inner_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:763:28: ( (otherlv_0= '-' ( (lv_inner_1_0= ruleunaryExpr ) ) ) )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:764:1: (otherlv_0= '-' ( (lv_inner_1_0= ruleunaryExpr ) ) )
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:764:1: (otherlv_0= '-' ( (lv_inner_1_0= ruleunaryExpr ) ) )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:764:3: otherlv_0= '-' ( (lv_inner_1_0= ruleunaryExpr ) )
            {
            otherlv_0=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleNegativeExpression1553); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNegativeExpressionAccess().getHyphenMinusKeyword_0());
                  
            }
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:768:1: ( (lv_inner_1_0= ruleunaryExpr ) )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:769:1: (lv_inner_1_0= ruleunaryExpr )
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:769:1: (lv_inner_1_0= ruleunaryExpr )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:770:3: lv_inner_1_0= ruleunaryExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNegativeExpressionAccess().getInnerUnaryExprParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleunaryExpr_in_ruleNegativeExpression1574);
            lv_inner_1_0=ruleunaryExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNegativeExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"inner",
                      		lv_inner_1_0, 
                      		"unaryExpr");
              	        afterParserOrEnumRuleCall();
              	    
            }

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
    // $ANTLR end "ruleNegativeExpression"


    // $ANTLR start "entryRuleatom"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:794:1: entryRuleatom returns [EObject current=null] : iv_ruleatom= ruleatom EOF ;
    public final EObject entryRuleatom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleatom = null;


        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:795:2: (iv_ruleatom= ruleatom EOF )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:796:2: iv_ruleatom= ruleatom EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleatom_in_entryRuleatom1610);
            iv_ruleatom=ruleatom();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleatom; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleatom1620); if (state.failed) return current;

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
    // $ANTLR end "entryRuleatom"


    // $ANTLR start "ruleatom"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:803:1: ruleatom returns [EObject current=null] : (this_IntLiteral_0= ruleIntLiteral | this_DoubleLiteral_1= ruleDoubleLiteral | this_StringLiteral_2= ruleStringLiteral | this_BoolLiteral_3= ruleBoolLiteral | this_FunctionLiteral_4= ruleFunctionLiteral | this_Variable_5= ruleVariable | this_Parenthesis_6= ruleParenthesis | this_ProbabilityFunctionLiteral_7= ruleProbabilityFunctionLiteral ) ;
    public final EObject ruleatom() throws RecognitionException {
        EObject current = null;

        EObject this_IntLiteral_0 = null;

        EObject this_DoubleLiteral_1 = null;

        EObject this_StringLiteral_2 = null;

        EObject this_BoolLiteral_3 = null;

        EObject this_FunctionLiteral_4 = null;

        EObject this_Variable_5 = null;

        EObject this_Parenthesis_6 = null;

        EObject this_ProbabilityFunctionLiteral_7 = null;


         enterRule(); 
            
        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:806:28: ( (this_IntLiteral_0= ruleIntLiteral | this_DoubleLiteral_1= ruleDoubleLiteral | this_StringLiteral_2= ruleStringLiteral | this_BoolLiteral_3= ruleBoolLiteral | this_FunctionLiteral_4= ruleFunctionLiteral | this_Variable_5= ruleVariable | this_Parenthesis_6= ruleParenthesis | this_ProbabilityFunctionLiteral_7= ruleProbabilityFunctionLiteral ) )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:807:1: (this_IntLiteral_0= ruleIntLiteral | this_DoubleLiteral_1= ruleDoubleLiteral | this_StringLiteral_2= ruleStringLiteral | this_BoolLiteral_3= ruleBoolLiteral | this_FunctionLiteral_4= ruleFunctionLiteral | this_Variable_5= ruleVariable | this_Parenthesis_6= ruleParenthesis | this_ProbabilityFunctionLiteral_7= ruleProbabilityFunctionLiteral )
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:807:1: (this_IntLiteral_0= ruleIntLiteral | this_DoubleLiteral_1= ruleDoubleLiteral | this_StringLiteral_2= ruleStringLiteral | this_BoolLiteral_3= ruleBoolLiteral | this_FunctionLiteral_4= ruleFunctionLiteral | this_Variable_5= ruleVariable | this_Parenthesis_6= ruleParenthesis | this_ProbabilityFunctionLiteral_7= ruleProbabilityFunctionLiteral )
            int alt9=8;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:808:2: this_IntLiteral_0= ruleIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomAccess().getIntLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleIntLiteral_in_ruleatom1670);
                    this_IntLiteral_0=ruleIntLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IntLiteral_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:821:2: this_DoubleLiteral_1= ruleDoubleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomAccess().getDoubleLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleDoubleLiteral_in_ruleatom1700);
                    this_DoubleLiteral_1=ruleDoubleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DoubleLiteral_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:834:2: this_StringLiteral_2= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomAccess().getStringLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleStringLiteral_in_ruleatom1730);
                    this_StringLiteral_2=ruleStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StringLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:847:2: this_BoolLiteral_3= ruleBoolLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomAccess().getBoolLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBoolLiteral_in_ruleatom1760);
                    this_BoolLiteral_3=ruleBoolLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BoolLiteral_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:860:2: this_FunctionLiteral_4= ruleFunctionLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomAccess().getFunctionLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFunctionLiteral_in_ruleatom1790);
                    this_FunctionLiteral_4=ruleFunctionLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FunctionLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:873:2: this_Variable_5= ruleVariable
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomAccess().getVariableParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleatom1820);
                    this_Variable_5=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Variable_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:886:2: this_Parenthesis_6= ruleParenthesis
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomAccess().getParenthesisParserRuleCall_6()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleParenthesis_in_ruleatom1850);
                    this_Parenthesis_6=ruleParenthesis();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Parenthesis_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:899:2: this_ProbabilityFunctionLiteral_7= ruleProbabilityFunctionLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomAccess().getProbabilityFunctionLiteralParserRuleCall_7()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleProbabilityFunctionLiteral_in_ruleatom1880);
                    this_ProbabilityFunctionLiteral_7=ruleProbabilityFunctionLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ProbabilityFunctionLiteral_7; 
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
    // $ANTLR end "ruleatom"


    // $ANTLR start "entryRuleDoubleLiteral"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:918:1: entryRuleDoubleLiteral returns [EObject current=null] : iv_ruleDoubleLiteral= ruleDoubleLiteral EOF ;
    public final EObject entryRuleDoubleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleLiteral = null;


        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:919:2: (iv_ruleDoubleLiteral= ruleDoubleLiteral EOF )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:920:2: iv_ruleDoubleLiteral= ruleDoubleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDoubleLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDoubleLiteral_in_entryRuleDoubleLiteral1915);
            iv_ruleDoubleLiteral=ruleDoubleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDoubleLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDoubleLiteral1925); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDoubleLiteral"


    // $ANTLR start "ruleDoubleLiteral"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:927:1: ruleDoubleLiteral returns [EObject current=null] : ( ( (lv_value_0_0= RULE_DOUBLE ) ) (this_SQUARE_PAREN_L_1= RULE_SQUARE_PAREN_L ( (lv_unit_2_0= ruleUnit ) ) this_SQUARE_PAREN_R_3= RULE_SQUARE_PAREN_R )? ) ;
    public final EObject ruleDoubleLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token this_SQUARE_PAREN_L_1=null;
        Token this_SQUARE_PAREN_R_3=null;
        EObject lv_unit_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:930:28: ( ( ( (lv_value_0_0= RULE_DOUBLE ) ) (this_SQUARE_PAREN_L_1= RULE_SQUARE_PAREN_L ( (lv_unit_2_0= ruleUnit ) ) this_SQUARE_PAREN_R_3= RULE_SQUARE_PAREN_R )? ) )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:931:1: ( ( (lv_value_0_0= RULE_DOUBLE ) ) (this_SQUARE_PAREN_L_1= RULE_SQUARE_PAREN_L ( (lv_unit_2_0= ruleUnit ) ) this_SQUARE_PAREN_R_3= RULE_SQUARE_PAREN_R )? )
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:931:1: ( ( (lv_value_0_0= RULE_DOUBLE ) ) (this_SQUARE_PAREN_L_1= RULE_SQUARE_PAREN_L ( (lv_unit_2_0= ruleUnit ) ) this_SQUARE_PAREN_R_3= RULE_SQUARE_PAREN_R )? )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:931:2: ( (lv_value_0_0= RULE_DOUBLE ) ) (this_SQUARE_PAREN_L_1= RULE_SQUARE_PAREN_L ( (lv_unit_2_0= ruleUnit ) ) this_SQUARE_PAREN_R_3= RULE_SQUARE_PAREN_R )?
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:931:2: ( (lv_value_0_0= RULE_DOUBLE ) )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:932:1: (lv_value_0_0= RULE_DOUBLE )
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:932:1: (lv_value_0_0= RULE_DOUBLE )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:933:3: lv_value_0_0= RULE_DOUBLE
            {
            lv_value_0_0=(Token)match(input,RULE_DOUBLE,FollowSets000.FOLLOW_RULE_DOUBLE_in_ruleDoubleLiteral1967); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getDoubleLiteralAccess().getValueDOUBLETerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDoubleLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"DOUBLE");
              	    
            }

            }


            }

            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:949:2: (this_SQUARE_PAREN_L_1= RULE_SQUARE_PAREN_L ( (lv_unit_2_0= ruleUnit ) ) this_SQUARE_PAREN_R_3= RULE_SQUARE_PAREN_R )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_SQUARE_PAREN_L) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:949:3: this_SQUARE_PAREN_L_1= RULE_SQUARE_PAREN_L ( (lv_unit_2_0= ruleUnit ) ) this_SQUARE_PAREN_R_3= RULE_SQUARE_PAREN_R
                    {
                    this_SQUARE_PAREN_L_1=(Token)match(input,RULE_SQUARE_PAREN_L,FollowSets000.FOLLOW_RULE_SQUARE_PAREN_L_in_ruleDoubleLiteral1984); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SQUARE_PAREN_L_1, grammarAccess.getDoubleLiteralAccess().getSQUARE_PAREN_LTerminalRuleCall_1_0()); 
                          
                    }
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:953:1: ( (lv_unit_2_0= ruleUnit ) )
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:954:1: (lv_unit_2_0= ruleUnit )
                    {
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:954:1: (lv_unit_2_0= ruleUnit )
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:955:3: lv_unit_2_0= ruleUnit
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDoubleLiteralAccess().getUnitUnitParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnit_in_ruleDoubleLiteral2004);
                    lv_unit_2_0=ruleUnit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDoubleLiteralRule());
                      	        }
                             		set(
                             			current, 
                             			"unit",
                              		lv_unit_2_0, 
                              		"Unit");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_SQUARE_PAREN_R_3=(Token)match(input,RULE_SQUARE_PAREN_R,FollowSets000.FOLLOW_RULE_SQUARE_PAREN_R_in_ruleDoubleLiteral2015); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SQUARE_PAREN_R_3, grammarAccess.getDoubleLiteralAccess().getSQUARE_PAREN_RTerminalRuleCall_1_2()); 
                          
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
    // $ANTLR end "ruleDoubleLiteral"


    // $ANTLR start "entryRuleProbabilityFunctionLiteral"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:983:1: entryRuleProbabilityFunctionLiteral returns [EObject current=null] : iv_ruleProbabilityFunctionLiteral= ruleProbabilityFunctionLiteral EOF ;
    public final EObject entryRuleProbabilityFunctionLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProbabilityFunctionLiteral = null;


        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:984:2: (iv_ruleProbabilityFunctionLiteral= ruleProbabilityFunctionLiteral EOF )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:985:2: iv_ruleProbabilityFunctionLiteral= ruleProbabilityFunctionLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProbabilityFunctionLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleProbabilityFunctionLiteral_in_entryRuleProbabilityFunctionLiteral2052);
            iv_ruleProbabilityFunctionLiteral=ruleProbabilityFunctionLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProbabilityFunctionLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProbabilityFunctionLiteral2062); if (state.failed) return current;

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
    // $ANTLR end "entryRuleProbabilityFunctionLiteral"


    // $ANTLR start "ruleProbabilityFunctionLiteral"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:992:1: ruleProbabilityFunctionLiteral returns [EObject current=null] : ( (lv_function_ProbabilityFunctionLiteral_0_0= ruledefinition ) ) ;
    public final EObject ruleProbabilityFunctionLiteral() throws RecognitionException {
        EObject current = null;

        EObject lv_function_ProbabilityFunctionLiteral_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:995:28: ( ( (lv_function_ProbabilityFunctionLiteral_0_0= ruledefinition ) ) )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:996:1: ( (lv_function_ProbabilityFunctionLiteral_0_0= ruledefinition ) )
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:996:1: ( (lv_function_ProbabilityFunctionLiteral_0_0= ruledefinition ) )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:997:1: (lv_function_ProbabilityFunctionLiteral_0_0= ruledefinition )
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:997:1: (lv_function_ProbabilityFunctionLiteral_0_0= ruledefinition )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:998:3: lv_function_ProbabilityFunctionLiteral_0_0= ruledefinition
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getProbabilityFunctionLiteralAccess().getFunction_ProbabilityFunctionLiteralDefinitionParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruledefinition_in_ruleProbabilityFunctionLiteral2107);
            lv_function_ProbabilityFunctionLiteral_0_0=ruledefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getProbabilityFunctionLiteralRule());
              	        }
                     		set(
                     			current, 
                     			"function_ProbabilityFunctionLiteral",
                      		lv_function_ProbabilityFunctionLiteral_0_0, 
                      		"definition");
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
    // $ANTLR end "ruleProbabilityFunctionLiteral"


    // $ANTLR start "entryRuleParenthesis"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1022:1: entryRuleParenthesis returns [EObject current=null] : iv_ruleParenthesis= ruleParenthesis EOF ;
    public final EObject entryRuleParenthesis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesis = null;


        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1023:2: (iv_ruleParenthesis= ruleParenthesis EOF )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1024:2: iv_ruleParenthesis= ruleParenthesis EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParenthesisRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleParenthesis_in_entryRuleParenthesis2142);
            iv_ruleParenthesis=ruleParenthesis();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParenthesis; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParenthesis2152); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParenthesis"


    // $ANTLR start "ruleParenthesis"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1031:1: ruleParenthesis returns [EObject current=null] : (this_LPAREN_0= RULE_LPAREN ( (lv_innerExpression_1_0= ruleifelseExpr ) ) this_RPAREN_2= RULE_RPAREN ) ;
    public final EObject ruleParenthesis() throws RecognitionException {
        EObject current = null;

        Token this_LPAREN_0=null;
        Token this_RPAREN_2=null;
        EObject lv_innerExpression_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1034:28: ( (this_LPAREN_0= RULE_LPAREN ( (lv_innerExpression_1_0= ruleifelseExpr ) ) this_RPAREN_2= RULE_RPAREN ) )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1035:1: (this_LPAREN_0= RULE_LPAREN ( (lv_innerExpression_1_0= ruleifelseExpr ) ) this_RPAREN_2= RULE_RPAREN )
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1035:1: (this_LPAREN_0= RULE_LPAREN ( (lv_innerExpression_1_0= ruleifelseExpr ) ) this_RPAREN_2= RULE_RPAREN )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1035:2: this_LPAREN_0= RULE_LPAREN ( (lv_innerExpression_1_0= ruleifelseExpr ) ) this_RPAREN_2= RULE_RPAREN
            {
            this_LPAREN_0=(Token)match(input,RULE_LPAREN,FollowSets000.FOLLOW_RULE_LPAREN_in_ruleParenthesis2188); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LPAREN_0, grammarAccess.getParenthesisAccess().getLPARENTerminalRuleCall_0()); 
                  
            }
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1039:1: ( (lv_innerExpression_1_0= ruleifelseExpr ) )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1040:1: (lv_innerExpression_1_0= ruleifelseExpr )
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1040:1: (lv_innerExpression_1_0= ruleifelseExpr )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1041:3: lv_innerExpression_1_0= ruleifelseExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParenthesisAccess().getInnerExpressionIfelseExprParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleifelseExpr_in_ruleParenthesis2208);
            lv_innerExpression_1_0=ruleifelseExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParenthesisRule());
              	        }
                     		set(
                     			current, 
                     			"innerExpression",
                      		lv_innerExpression_1_0, 
                      		"ifelseExpr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_RPAREN_2=(Token)match(input,RULE_RPAREN,FollowSets000.FOLLOW_RULE_RPAREN_in_ruleParenthesis2219); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RPAREN_2, grammarAccess.getParenthesisAccess().getRPARENTerminalRuleCall_2()); 
                  
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
    // $ANTLR end "ruleParenthesis"


    // $ANTLR start "entryRuleFunctionLiteral"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1069:1: entryRuleFunctionLiteral returns [EObject current=null] : iv_ruleFunctionLiteral= ruleFunctionLiteral EOF ;
    public final EObject entryRuleFunctionLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionLiteral = null;


        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1070:2: (iv_ruleFunctionLiteral= ruleFunctionLiteral EOF )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1071:2: iv_ruleFunctionLiteral= ruleFunctionLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFunctionLiteral_in_entryRuleFunctionLiteral2254);
            iv_ruleFunctionLiteral=ruleFunctionLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFunctionLiteral2264); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFunctionLiteral"


    // $ANTLR start "ruleFunctionLiteral"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1078:1: ruleFunctionLiteral returns [EObject current=null] : ( ( (lv_id_0_0= RULE_ID ) ) this_LPAREN_1= RULE_LPAREN ( ( (lv_parameters_FunctionLiteral_2_0= ruleboolAndExpr ) ) (this_COLON_3= RULE_COLON ( (lv_parameters_FunctionLiteral_4_0= ruleboolAndExpr ) ) )* )? this_RPAREN_5= RULE_RPAREN ) ;
    public final EObject ruleFunctionLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token this_LPAREN_1=null;
        Token this_COLON_3=null;
        Token this_RPAREN_5=null;
        EObject lv_parameters_FunctionLiteral_2_0 = null;

        EObject lv_parameters_FunctionLiteral_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1081:28: ( ( ( (lv_id_0_0= RULE_ID ) ) this_LPAREN_1= RULE_LPAREN ( ( (lv_parameters_FunctionLiteral_2_0= ruleboolAndExpr ) ) (this_COLON_3= RULE_COLON ( (lv_parameters_FunctionLiteral_4_0= ruleboolAndExpr ) ) )* )? this_RPAREN_5= RULE_RPAREN ) )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1082:1: ( ( (lv_id_0_0= RULE_ID ) ) this_LPAREN_1= RULE_LPAREN ( ( (lv_parameters_FunctionLiteral_2_0= ruleboolAndExpr ) ) (this_COLON_3= RULE_COLON ( (lv_parameters_FunctionLiteral_4_0= ruleboolAndExpr ) ) )* )? this_RPAREN_5= RULE_RPAREN )
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1082:1: ( ( (lv_id_0_0= RULE_ID ) ) this_LPAREN_1= RULE_LPAREN ( ( (lv_parameters_FunctionLiteral_2_0= ruleboolAndExpr ) ) (this_COLON_3= RULE_COLON ( (lv_parameters_FunctionLiteral_4_0= ruleboolAndExpr ) ) )* )? this_RPAREN_5= RULE_RPAREN )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1082:2: ( (lv_id_0_0= RULE_ID ) ) this_LPAREN_1= RULE_LPAREN ( ( (lv_parameters_FunctionLiteral_2_0= ruleboolAndExpr ) ) (this_COLON_3= RULE_COLON ( (lv_parameters_FunctionLiteral_4_0= ruleboolAndExpr ) ) )* )? this_RPAREN_5= RULE_RPAREN
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1082:2: ( (lv_id_0_0= RULE_ID ) )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1083:1: (lv_id_0_0= RULE_ID )
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1083:1: (lv_id_0_0= RULE_ID )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1084:3: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFunctionLiteral2306); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_id_0_0, grammarAccess.getFunctionLiteralAccess().getIdIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFunctionLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"id",
                      		lv_id_0_0, 
                      		"ID");
              	    
            }

            }


            }

            this_LPAREN_1=(Token)match(input,RULE_LPAREN,FollowSets000.FOLLOW_RULE_LPAREN_in_ruleFunctionLiteral2322); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LPAREN_1, grammarAccess.getFunctionLiteralAccess().getLPARENTerminalRuleCall_1()); 
                  
            }
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1104:1: ( ( (lv_parameters_FunctionLiteral_2_0= ruleboolAndExpr ) ) (this_COLON_3= RULE_COLON ( (lv_parameters_FunctionLiteral_4_0= ruleboolAndExpr ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_NOT && LA12_0<=RULE_DOUBLE)||LA12_0==RULE_LPAREN||LA12_0==RULE_ID||(LA12_0>=RULE_BOOLEAN_KEYWORDS && LA12_0<=RULE_ENUMPMF)||LA12_0==RULE_BOOLPMF||LA12_0==31) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1104:2: ( (lv_parameters_FunctionLiteral_2_0= ruleboolAndExpr ) ) (this_COLON_3= RULE_COLON ( (lv_parameters_FunctionLiteral_4_0= ruleboolAndExpr ) ) )*
                    {
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1104:2: ( (lv_parameters_FunctionLiteral_2_0= ruleboolAndExpr ) )
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1105:1: (lv_parameters_FunctionLiteral_2_0= ruleboolAndExpr )
                    {
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1105:1: (lv_parameters_FunctionLiteral_2_0= ruleboolAndExpr )
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1106:3: lv_parameters_FunctionLiteral_2_0= ruleboolAndExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionLiteralAccess().getParameters_FunctionLiteralBoolAndExprParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleboolAndExpr_in_ruleFunctionLiteral2343);
                    lv_parameters_FunctionLiteral_2_0=ruleboolAndExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFunctionLiteralRule());
                      	        }
                             		add(
                             			current, 
                             			"parameters_FunctionLiteral",
                              		lv_parameters_FunctionLiteral_2_0, 
                              		"boolAndExpr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1122:2: (this_COLON_3= RULE_COLON ( (lv_parameters_FunctionLiteral_4_0= ruleboolAndExpr ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_COLON) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1122:3: this_COLON_3= RULE_COLON ( (lv_parameters_FunctionLiteral_4_0= ruleboolAndExpr ) )
                    	    {
                    	    this_COLON_3=(Token)match(input,RULE_COLON,FollowSets000.FOLLOW_RULE_COLON_in_ruleFunctionLiteral2355); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_COLON_3, grammarAccess.getFunctionLiteralAccess().getCOLONTerminalRuleCall_2_1_0()); 
                    	          
                    	    }
                    	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1126:1: ( (lv_parameters_FunctionLiteral_4_0= ruleboolAndExpr ) )
                    	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1127:1: (lv_parameters_FunctionLiteral_4_0= ruleboolAndExpr )
                    	    {
                    	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1127:1: (lv_parameters_FunctionLiteral_4_0= ruleboolAndExpr )
                    	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1128:3: lv_parameters_FunctionLiteral_4_0= ruleboolAndExpr
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getFunctionLiteralAccess().getParameters_FunctionLiteralBoolAndExprParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleboolAndExpr_in_ruleFunctionLiteral2375);
                    	    lv_parameters_FunctionLiteral_4_0=ruleboolAndExpr();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getFunctionLiteralRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"parameters_FunctionLiteral",
                    	              		lv_parameters_FunctionLiteral_4_0, 
                    	              		"boolAndExpr");
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


                    }
                    break;

            }

            this_RPAREN_5=(Token)match(input,RULE_RPAREN,FollowSets000.FOLLOW_RULE_RPAREN_in_ruleFunctionLiteral2390); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RPAREN_5, grammarAccess.getFunctionLiteralAccess().getRPARENTerminalRuleCall_3()); 
                  
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
    // $ANTLR end "ruleFunctionLiteral"


    // $ANTLR start "entryRuleVariable"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1156:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1157:2: (iv_ruleVariable= ruleVariable EOF )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1158:2: iv_ruleVariable= ruleVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_entryRuleVariable2425);
            iv_ruleVariable=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariable2435); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1165:1: ruleVariable returns [EObject current=null] : ( (lv_id_Variable_0_0= ruleAbstractNamedReference ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        EObject lv_id_Variable_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1168:28: ( ( (lv_id_Variable_0_0= ruleAbstractNamedReference ) ) )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1169:1: ( (lv_id_Variable_0_0= ruleAbstractNamedReference ) )
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1169:1: ( (lv_id_Variable_0_0= ruleAbstractNamedReference ) )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1170:1: (lv_id_Variable_0_0= ruleAbstractNamedReference )
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1170:1: (lv_id_Variable_0_0= ruleAbstractNamedReference )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1171:3: lv_id_Variable_0_0= ruleAbstractNamedReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableAccess().getId_VariableAbstractNamedReferenceParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleAbstractNamedReference_in_ruleVariable2480);
            lv_id_Variable_0_0=ruleAbstractNamedReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVariableRule());
              	        }
                     		set(
                     			current, 
                     			"id_Variable",
                      		lv_id_Variable_0_0, 
                      		"AbstractNamedReference");
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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleAbstractNamedReference"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1195:1: entryRuleAbstractNamedReference returns [EObject current=null] : iv_ruleAbstractNamedReference= ruleAbstractNamedReference EOF ;
    public final EObject entryRuleAbstractNamedReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractNamedReference = null;


        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1196:2: (iv_ruleAbstractNamedReference= ruleAbstractNamedReference EOF )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1197:2: iv_ruleAbstractNamedReference= ruleAbstractNamedReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractNamedReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAbstractNamedReference_in_entryRuleAbstractNamedReference2515);
            iv_ruleAbstractNamedReference=ruleAbstractNamedReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractNamedReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractNamedReference2525); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAbstractNamedReference"


    // $ANTLR start "ruleAbstractNamedReference"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1204:1: ruleAbstractNamedReference returns [EObject current=null] : (this_VariableReference_0= ruleVariableReference | this_NamespaceReference_1= ruleNamespaceReference ) ;
    public final EObject ruleAbstractNamedReference() throws RecognitionException {
        EObject current = null;

        EObject this_VariableReference_0 = null;

        EObject this_NamespaceReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1207:28: ( (this_VariableReference_0= ruleVariableReference | this_NamespaceReference_1= ruleNamespaceReference ) )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1208:1: (this_VariableReference_0= ruleVariableReference | this_NamespaceReference_1= ruleNamespaceReference )
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1208:1: (this_VariableReference_0= ruleVariableReference | this_NamespaceReference_1= ruleNamespaceReference )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==EOF||(LA13_1>=RULE_CONDDELIMITER && LA13_1<=RULE_POW)||LA13_1==RULE_RPAREN||LA13_1==RULE_COLON||(LA13_1>=31 && LA13_1<=44)) ) {
                    alt13=1;
                }
                else if ( (LA13_1==RULE_DOT) ) {
                    alt13=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1209:2: this_VariableReference_0= ruleVariableReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractNamedReferenceAccess().getVariableReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleVariableReference_in_ruleAbstractNamedReference2575);
                    this_VariableReference_0=ruleVariableReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_VariableReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1222:2: this_NamespaceReference_1= ruleNamespaceReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractNamedReferenceAccess().getNamespaceReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNamespaceReference_in_ruleAbstractNamedReference2605);
                    this_NamespaceReference_1=ruleNamespaceReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NamespaceReference_1; 
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
    // $ANTLR end "ruleAbstractNamedReference"


    // $ANTLR start "entryRuleVariableReference"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1241:1: entryRuleVariableReference returns [EObject current=null] : iv_ruleVariableReference= ruleVariableReference EOF ;
    public final EObject entryRuleVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableReference = null;


        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1242:2: (iv_ruleVariableReference= ruleVariableReference EOF )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1243:2: iv_ruleVariableReference= ruleVariableReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVariableReference_in_entryRuleVariableReference2640);
            iv_ruleVariableReference=ruleVariableReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariableReference2650); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVariableReference"


    // $ANTLR start "ruleVariableReference"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1250:1: ruleVariableReference returns [EObject current=null] : ( (lv_referenceName_0_0= RULE_ID ) ) ;
    public final EObject ruleVariableReference() throws RecognitionException {
        EObject current = null;

        Token lv_referenceName_0_0=null;

         enterRule(); 
            
        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1253:28: ( ( (lv_referenceName_0_0= RULE_ID ) ) )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1254:1: ( (lv_referenceName_0_0= RULE_ID ) )
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1254:1: ( (lv_referenceName_0_0= RULE_ID ) )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1255:1: (lv_referenceName_0_0= RULE_ID )
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1255:1: (lv_referenceName_0_0= RULE_ID )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1256:3: lv_referenceName_0_0= RULE_ID
            {
            lv_referenceName_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleVariableReference2691); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_referenceName_0_0, grammarAccess.getVariableReferenceAccess().getReferenceNameIDTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableReferenceRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"referenceName",
                      		lv_referenceName_0_0, 
                      		"ID");
              	    
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
    // $ANTLR end "ruleVariableReference"


    // $ANTLR start "entryRuleNamespaceReference"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1280:1: entryRuleNamespaceReference returns [EObject current=null] : iv_ruleNamespaceReference= ruleNamespaceReference EOF ;
    public final EObject entryRuleNamespaceReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespaceReference = null;


        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1281:2: (iv_ruleNamespaceReference= ruleNamespaceReference EOF )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1282:2: iv_ruleNamespaceReference= ruleNamespaceReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNamespaceReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNamespaceReference_in_entryRuleNamespaceReference2731);
            iv_ruleNamespaceReference=ruleNamespaceReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNamespaceReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNamespaceReference2741); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNamespaceReference"


    // $ANTLR start "ruleNamespaceReference"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1289:1: ruleNamespaceReference returns [EObject current=null] : ( ( (lv_referenceName_0_0= RULE_ID ) ) this_DOT_1= RULE_DOT ( (lv_innerReference_NamespaceReference_2_0= ruleAbstractNamedReference ) ) ) ;
    public final EObject ruleNamespaceReference() throws RecognitionException {
        EObject current = null;

        Token lv_referenceName_0_0=null;
        Token this_DOT_1=null;
        EObject lv_innerReference_NamespaceReference_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1292:28: ( ( ( (lv_referenceName_0_0= RULE_ID ) ) this_DOT_1= RULE_DOT ( (lv_innerReference_NamespaceReference_2_0= ruleAbstractNamedReference ) ) ) )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1293:1: ( ( (lv_referenceName_0_0= RULE_ID ) ) this_DOT_1= RULE_DOT ( (lv_innerReference_NamespaceReference_2_0= ruleAbstractNamedReference ) ) )
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1293:1: ( ( (lv_referenceName_0_0= RULE_ID ) ) this_DOT_1= RULE_DOT ( (lv_innerReference_NamespaceReference_2_0= ruleAbstractNamedReference ) ) )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1293:2: ( (lv_referenceName_0_0= RULE_ID ) ) this_DOT_1= RULE_DOT ( (lv_innerReference_NamespaceReference_2_0= ruleAbstractNamedReference ) )
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1293:2: ( (lv_referenceName_0_0= RULE_ID ) )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1294:1: (lv_referenceName_0_0= RULE_ID )
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1294:1: (lv_referenceName_0_0= RULE_ID )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1295:3: lv_referenceName_0_0= RULE_ID
            {
            lv_referenceName_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleNamespaceReference2783); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_referenceName_0_0, grammarAccess.getNamespaceReferenceAccess().getReferenceNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getNamespaceReferenceRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"referenceName",
                      		lv_referenceName_0_0, 
                      		"ID");
              	    
            }

            }


            }

            this_DOT_1=(Token)match(input,RULE_DOT,FollowSets000.FOLLOW_RULE_DOT_in_ruleNamespaceReference2799); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_DOT_1, grammarAccess.getNamespaceReferenceAccess().getDOTTerminalRuleCall_1()); 
                  
            }
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1315:1: ( (lv_innerReference_NamespaceReference_2_0= ruleAbstractNamedReference ) )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1316:1: (lv_innerReference_NamespaceReference_2_0= ruleAbstractNamedReference )
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1316:1: (lv_innerReference_NamespaceReference_2_0= ruleAbstractNamedReference )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1317:3: lv_innerReference_NamespaceReference_2_0= ruleAbstractNamedReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNamespaceReferenceAccess().getInnerReference_NamespaceReferenceAbstractNamedReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleAbstractNamedReference_in_ruleNamespaceReference2819);
            lv_innerReference_NamespaceReference_2_0=ruleAbstractNamedReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNamespaceReferenceRule());
              	        }
                     		set(
                     			current, 
                     			"innerReference_NamespaceReference",
                      		lv_innerReference_NamespaceReference_2_0, 
                      		"AbstractNamedReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

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
    // $ANTLR end "ruleNamespaceReference"


    // $ANTLR start "entryRuleBoolLiteral"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1341:1: entryRuleBoolLiteral returns [EObject current=null] : iv_ruleBoolLiteral= ruleBoolLiteral EOF ;
    public final EObject entryRuleBoolLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolLiteral = null;


        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1342:2: (iv_ruleBoolLiteral= ruleBoolLiteral EOF )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1343:2: iv_ruleBoolLiteral= ruleBoolLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral2855);
            iv_ruleBoolLiteral=ruleBoolLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBoolLiteral2865); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBoolLiteral"


    // $ANTLR start "ruleBoolLiteral"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1350:1: ruleBoolLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN_KEYWORDS ) ) ;
    public final EObject ruleBoolLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1353:28: ( ( (lv_value_0_0= RULE_BOOLEAN_KEYWORDS ) ) )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1354:1: ( (lv_value_0_0= RULE_BOOLEAN_KEYWORDS ) )
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1354:1: ( (lv_value_0_0= RULE_BOOLEAN_KEYWORDS ) )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1355:1: (lv_value_0_0= RULE_BOOLEAN_KEYWORDS )
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1355:1: (lv_value_0_0= RULE_BOOLEAN_KEYWORDS )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1356:3: lv_value_0_0= RULE_BOOLEAN_KEYWORDS
            {
            lv_value_0_0=(Token)match(input,RULE_BOOLEAN_KEYWORDS,FollowSets000.FOLLOW_RULE_BOOLEAN_KEYWORDS_in_ruleBoolLiteral2906); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getBoolLiteralAccess().getValueBOOLEAN_KEYWORDSTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getBoolLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"BOOLEAN_KEYWORDS");
              	    
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
    // $ANTLR end "ruleBoolLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1380:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1381:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1382:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral2946);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStringLiteral2956); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1389:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1392:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1393:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1393:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1394:1: (lv_value_0_0= RULE_STRING )
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1394:1: (lv_value_0_0= RULE_STRING )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1395:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleStringLiteral2997); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStringLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"STRING");
              	    
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
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleIntLiteral"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1419:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1420:2: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1421:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral3037);
            iv_ruleIntLiteral=ruleIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntLiteral3047); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIntLiteral"


    // $ANTLR start "ruleIntLiteral"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1428:1: ruleIntLiteral returns [EObject current=null] : ( ( (lv_value_0_0= RULE_DECINT ) ) (this_SQUARE_PAREN_L_1= RULE_SQUARE_PAREN_L ( (lv_unit_2_0= ruleUnit ) ) this_SQUARE_PAREN_R_3= RULE_SQUARE_PAREN_R )? ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token this_SQUARE_PAREN_L_1=null;
        Token this_SQUARE_PAREN_R_3=null;
        EObject lv_unit_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1431:28: ( ( ( (lv_value_0_0= RULE_DECINT ) ) (this_SQUARE_PAREN_L_1= RULE_SQUARE_PAREN_L ( (lv_unit_2_0= ruleUnit ) ) this_SQUARE_PAREN_R_3= RULE_SQUARE_PAREN_R )? ) )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1432:1: ( ( (lv_value_0_0= RULE_DECINT ) ) (this_SQUARE_PAREN_L_1= RULE_SQUARE_PAREN_L ( (lv_unit_2_0= ruleUnit ) ) this_SQUARE_PAREN_R_3= RULE_SQUARE_PAREN_R )? )
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1432:1: ( ( (lv_value_0_0= RULE_DECINT ) ) (this_SQUARE_PAREN_L_1= RULE_SQUARE_PAREN_L ( (lv_unit_2_0= ruleUnit ) ) this_SQUARE_PAREN_R_3= RULE_SQUARE_PAREN_R )? )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1432:2: ( (lv_value_0_0= RULE_DECINT ) ) (this_SQUARE_PAREN_L_1= RULE_SQUARE_PAREN_L ( (lv_unit_2_0= ruleUnit ) ) this_SQUARE_PAREN_R_3= RULE_SQUARE_PAREN_R )?
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1432:2: ( (lv_value_0_0= RULE_DECINT ) )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1433:1: (lv_value_0_0= RULE_DECINT )
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1433:1: (lv_value_0_0= RULE_DECINT )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1434:3: lv_value_0_0= RULE_DECINT
            {
            lv_value_0_0=(Token)match(input,RULE_DECINT,FollowSets000.FOLLOW_RULE_DECINT_in_ruleIntLiteral3089); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getIntLiteralAccess().getValueDECINTTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getIntLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"DECINT");
              	    
            }

            }


            }

            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1450:2: (this_SQUARE_PAREN_L_1= RULE_SQUARE_PAREN_L ( (lv_unit_2_0= ruleUnit ) ) this_SQUARE_PAREN_R_3= RULE_SQUARE_PAREN_R )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_SQUARE_PAREN_L) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1450:3: this_SQUARE_PAREN_L_1= RULE_SQUARE_PAREN_L ( (lv_unit_2_0= ruleUnit ) ) this_SQUARE_PAREN_R_3= RULE_SQUARE_PAREN_R
                    {
                    this_SQUARE_PAREN_L_1=(Token)match(input,RULE_SQUARE_PAREN_L,FollowSets000.FOLLOW_RULE_SQUARE_PAREN_L_in_ruleIntLiteral3106); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SQUARE_PAREN_L_1, grammarAccess.getIntLiteralAccess().getSQUARE_PAREN_LTerminalRuleCall_1_0()); 
                          
                    }
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1454:1: ( (lv_unit_2_0= ruleUnit ) )
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1455:1: (lv_unit_2_0= ruleUnit )
                    {
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1455:1: (lv_unit_2_0= ruleUnit )
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1456:3: lv_unit_2_0= ruleUnit
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIntLiteralAccess().getUnitUnitParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnit_in_ruleIntLiteral3126);
                    lv_unit_2_0=ruleUnit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIntLiteralRule());
                      	        }
                             		set(
                             			current, 
                             			"unit",
                              		lv_unit_2_0, 
                              		"Unit");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_SQUARE_PAREN_R_3=(Token)match(input,RULE_SQUARE_PAREN_R,FollowSets000.FOLLOW_RULE_SQUARE_PAREN_R_in_ruleIntLiteral3137); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SQUARE_PAREN_R_3, grammarAccess.getIntLiteralAccess().getSQUARE_PAREN_RTerminalRuleCall_1_2()); 
                          
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
    // $ANTLR end "ruleIntLiteral"


    // $ANTLR start "entryRuleUnit"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1484:1: entryRuleUnit returns [EObject current=null] : iv_ruleUnit= ruleUnit EOF ;
    public final EObject entryRuleUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnit = null;


        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1485:2: (iv_ruleUnit= ruleUnit EOF )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1486:2: iv_ruleUnit= ruleUnit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnitRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnit_in_entryRuleUnit3174);
            iv_ruleUnit=ruleUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnit; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnit3184); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnit"


    // $ANTLR start "ruleUnit"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1493:1: ruleUnit returns [EObject current=null] : (this_unitMulti_0= ruleunitMulti | this_unitDiv_1= ruleunitDiv | this_BaseUnit_2= ruleBaseUnit ) ;
    public final EObject ruleUnit() throws RecognitionException {
        EObject current = null;

        EObject this_unitMulti_0 = null;

        EObject this_unitDiv_1 = null;

        EObject this_BaseUnit_2 = null;


         enterRule(); 
            
        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1496:28: ( (this_unitMulti_0= ruleunitMulti | this_unitDiv_1= ruleunitDiv | this_BaseUnit_2= ruleBaseUnit ) )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1497:1: (this_unitMulti_0= ruleunitMulti | this_unitDiv_1= ruleunitDiv | this_BaseUnit_2= ruleBaseUnit )
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1497:1: (this_unitMulti_0= ruleunitMulti | this_unitDiv_1= ruleunitDiv | this_BaseUnit_2= ruleBaseUnit )
            int alt15=3;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1498:2: this_unitMulti_0= ruleunitMulti
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnitAccess().getUnitMultiParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleunitMulti_in_ruleUnit3234);
                    this_unitMulti_0=ruleunitMulti();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_unitMulti_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1511:2: this_unitDiv_1= ruleunitDiv
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnitAccess().getUnitDivParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleunitDiv_in_ruleUnit3264);
                    this_unitDiv_1=ruleunitDiv();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_unitDiv_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1524:2: this_BaseUnit_2= ruleBaseUnit
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnitAccess().getBaseUnitParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBaseUnit_in_ruleUnit3294);
                    this_BaseUnit_2=ruleBaseUnit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BaseUnit_2; 
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
    // $ANTLR end "ruleUnit"


    // $ANTLR start "entryRuleunitDiv"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1543:1: entryRuleunitDiv returns [EObject current=null] : iv_ruleunitDiv= ruleunitDiv EOF ;
    public final EObject entryRuleunitDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunitDiv = null;


        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1544:2: (iv_ruleunitDiv= ruleunitDiv EOF )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1545:2: iv_ruleunitDiv= ruleunitDiv EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnitDivRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleunitDiv_in_entryRuleunitDiv3329);
            iv_ruleunitDiv=ruleunitDiv();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleunitDiv; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleunitDiv3339); if (state.failed) return current;

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
    // $ANTLR end "entryRuleunitDiv"


    // $ANTLR start "ruleunitDiv"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1552:1: ruleunitDiv returns [EObject current=null] : (this_unitPow_0= ruleunitPow ( () otherlv_2= '/' ( (lv_divisor_3_0= ruleUnit ) ) )? ) ;
    public final EObject ruleunitDiv() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_unitPow_0 = null;

        EObject lv_divisor_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1555:28: ( (this_unitPow_0= ruleunitPow ( () otherlv_2= '/' ( (lv_divisor_3_0= ruleUnit ) ) )? ) )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1556:1: (this_unitPow_0= ruleunitPow ( () otherlv_2= '/' ( (lv_divisor_3_0= ruleUnit ) ) )? )
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1556:1: (this_unitPow_0= ruleunitPow ( () otherlv_2= '/' ( (lv_divisor_3_0= ruleUnit ) ) )? )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1557:2: this_unitPow_0= ruleunitPow ( () otherlv_2= '/' ( (lv_divisor_3_0= ruleUnit ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getUnitDivAccess().getUnitPowParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleunitPow_in_ruleunitDiv3389);
            this_unitPow_0=ruleunitPow();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_unitPow_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1568:1: ( () otherlv_2= '/' ( (lv_divisor_3_0= ruleUnit ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==32) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1568:2: () otherlv_2= '/' ( (lv_divisor_3_0= ruleUnit ) )
                    {
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1568:2: ()
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1569:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getUnitDivAccess().getUnitDivisionDividendAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleunitDiv3413); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getUnitDivAccess().getSolidusKeyword_1_1());
                          
                    }
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1581:1: ( (lv_divisor_3_0= ruleUnit ) )
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1582:1: (lv_divisor_3_0= ruleUnit )
                    {
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1582:1: (lv_divisor_3_0= ruleUnit )
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1583:3: lv_divisor_3_0= ruleUnit
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnitDivAccess().getDivisorUnitParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnit_in_ruleunitDiv3434);
                    lv_divisor_3_0=ruleUnit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUnitDivRule());
                      	        }
                             		set(
                             			current, 
                             			"divisor",
                              		lv_divisor_3_0, 
                              		"Unit");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


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
    // $ANTLR end "ruleunitDiv"


    // $ANTLR start "entryRuleunitMulti"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1607:1: entryRuleunitMulti returns [EObject current=null] : iv_ruleunitMulti= ruleunitMulti EOF ;
    public final EObject entryRuleunitMulti() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunitMulti = null;


        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1608:2: (iv_ruleunitMulti= ruleunitMulti EOF )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1609:2: iv_ruleunitMulti= ruleunitMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnitMultiRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleunitMulti_in_entryRuleunitMulti3472);
            iv_ruleunitMulti=ruleunitMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleunitMulti; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleunitMulti3482); if (state.failed) return current;

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
    // $ANTLR end "entryRuleunitMulti"


    // $ANTLR start "ruleunitMulti"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1616:1: ruleunitMulti returns [EObject current=null] : (this_unitPow_0= ruleunitPow ( () otherlv_2= '*' ( (lv_units_3_0= ruleUnit ) ) )* ) ;
    public final EObject ruleunitMulti() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_unitPow_0 = null;

        EObject lv_units_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1619:28: ( (this_unitPow_0= ruleunitPow ( () otherlv_2= '*' ( (lv_units_3_0= ruleUnit ) ) )* ) )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1620:1: (this_unitPow_0= ruleunitPow ( () otherlv_2= '*' ( (lv_units_3_0= ruleUnit ) ) )* )
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1620:1: (this_unitPow_0= ruleunitPow ( () otherlv_2= '*' ( (lv_units_3_0= ruleUnit ) ) )* )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1621:2: this_unitPow_0= ruleunitPow ( () otherlv_2= '*' ( (lv_units_3_0= ruleUnit ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getUnitMultiAccess().getUnitPowParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleunitPow_in_ruleunitMulti3532);
            this_unitPow_0=ruleunitPow();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_unitPow_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1632:1: ( () otherlv_2= '*' ( (lv_units_3_0= ruleUnit ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==33) ) {
                    int LA17_2 = input.LA(2);

                    if ( (synpred25_InternalStoEx()) ) {
                        alt17=1;
                    }


                }


                switch (alt17) {
            	case 1 :
            	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1632:2: () otherlv_2= '*' ( (lv_units_3_0= ruleUnit ) )
            	    {
            	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1632:2: ()
            	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1633:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndAdd(
            	                  grammarAccess.getUnitMultiAccess().getUnitMultiplicationUnitsAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleunitMulti3556); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getUnitMultiAccess().getAsteriskKeyword_1_1());
            	          
            	    }
            	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1645:1: ( (lv_units_3_0= ruleUnit ) )
            	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1646:1: (lv_units_3_0= ruleUnit )
            	    {
            	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1646:1: (lv_units_3_0= ruleUnit )
            	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1647:3: lv_units_3_0= ruleUnit
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getUnitMultiAccess().getUnitsUnitParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleUnit_in_ruleunitMulti3577);
            	    lv_units_3_0=ruleUnit();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getUnitMultiRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"units",
            	              		lv_units_3_0, 
            	              		"Unit");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // $ANTLR end "ruleunitMulti"


    // $ANTLR start "entryRuleunitPow"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1671:1: entryRuleunitPow returns [EObject current=null] : iv_ruleunitPow= ruleunitPow EOF ;
    public final EObject entryRuleunitPow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunitPow = null;


        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1672:2: (iv_ruleunitPow= ruleunitPow EOF )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1673:2: iv_ruleunitPow= ruleunitPow EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnitPowRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleunitPow_in_entryRuleunitPow3615);
            iv_ruleunitPow=ruleunitPow();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleunitPow; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleunitPow3625); if (state.failed) return current;

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
    // $ANTLR end "entryRuleunitPow"


    // $ANTLR start "ruleunitPow"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1680:1: ruleunitPow returns [EObject current=null] : ( (this_BaseUnit_0= ruleBaseUnit | (this_LPAREN_1= RULE_LPAREN (this_unitMulti_2= ruleunitMulti | this_unitDiv_3= ruleunitDiv ) this_RPAREN_4= RULE_RPAREN ) ) ( () this_POW_6= RULE_POW ( (lv_exponent_7_0= ruleSIGNED_INT ) ) )* ) ;
    public final EObject ruleunitPow() throws RecognitionException {
        EObject current = null;

        Token this_LPAREN_1=null;
        Token this_RPAREN_4=null;
        Token this_POW_6=null;
        EObject this_BaseUnit_0 = null;

        EObject this_unitMulti_2 = null;

        EObject this_unitDiv_3 = null;

        AntlrDatatypeRuleToken lv_exponent_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1683:28: ( ( (this_BaseUnit_0= ruleBaseUnit | (this_LPAREN_1= RULE_LPAREN (this_unitMulti_2= ruleunitMulti | this_unitDiv_3= ruleunitDiv ) this_RPAREN_4= RULE_RPAREN ) ) ( () this_POW_6= RULE_POW ( (lv_exponent_7_0= ruleSIGNED_INT ) ) )* ) )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1684:1: ( (this_BaseUnit_0= ruleBaseUnit | (this_LPAREN_1= RULE_LPAREN (this_unitMulti_2= ruleunitMulti | this_unitDiv_3= ruleunitDiv ) this_RPAREN_4= RULE_RPAREN ) ) ( () this_POW_6= RULE_POW ( (lv_exponent_7_0= ruleSIGNED_INT ) ) )* )
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1684:1: ( (this_BaseUnit_0= ruleBaseUnit | (this_LPAREN_1= RULE_LPAREN (this_unitMulti_2= ruleunitMulti | this_unitDiv_3= ruleunitDiv ) this_RPAREN_4= RULE_RPAREN ) ) ( () this_POW_6= RULE_POW ( (lv_exponent_7_0= ruleSIGNED_INT ) ) )* )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1684:2: (this_BaseUnit_0= ruleBaseUnit | (this_LPAREN_1= RULE_LPAREN (this_unitMulti_2= ruleunitMulti | this_unitDiv_3= ruleunitDiv ) this_RPAREN_4= RULE_RPAREN ) ) ( () this_POW_6= RULE_POW ( (lv_exponent_7_0= ruleSIGNED_INT ) ) )*
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1684:2: (this_BaseUnit_0= ruleBaseUnit | (this_LPAREN_1= RULE_LPAREN (this_unitMulti_2= ruleunitMulti | this_unitDiv_3= ruleunitDiv ) this_RPAREN_4= RULE_RPAREN ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=45 && LA19_0<=49)) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_LPAREN) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1685:2: this_BaseUnit_0= ruleBaseUnit
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnitPowAccess().getBaseUnitParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBaseUnit_in_ruleunitPow3676);
                    this_BaseUnit_0=ruleBaseUnit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BaseUnit_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1697:6: (this_LPAREN_1= RULE_LPAREN (this_unitMulti_2= ruleunitMulti | this_unitDiv_3= ruleunitDiv ) this_RPAREN_4= RULE_RPAREN )
                    {
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1697:6: (this_LPAREN_1= RULE_LPAREN (this_unitMulti_2= ruleunitMulti | this_unitDiv_3= ruleunitDiv ) this_RPAREN_4= RULE_RPAREN )
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1697:7: this_LPAREN_1= RULE_LPAREN (this_unitMulti_2= ruleunitMulti | this_unitDiv_3= ruleunitDiv ) this_RPAREN_4= RULE_RPAREN
                    {
                    this_LPAREN_1=(Token)match(input,RULE_LPAREN,FollowSets000.FOLLOW_RULE_LPAREN_in_ruleunitPow3693); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LPAREN_1, grammarAccess.getUnitPowAccess().getLPARENTerminalRuleCall_0_1_0()); 
                          
                    }
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1701:1: (this_unitMulti_2= ruleunitMulti | this_unitDiv_3= ruleunitDiv )
                    int alt18=2;
                    switch ( input.LA(1) ) {
                    case 45:
                        {
                        int LA18_1 = input.LA(2);

                        if ( (synpred27_InternalStoEx()) ) {
                            alt18=1;
                        }
                        else if ( (true) ) {
                            alt18=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 18, 1, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 46:
                        {
                        int LA18_2 = input.LA(2);

                        if ( (synpred27_InternalStoEx()) ) {
                            alt18=1;
                        }
                        else if ( (true) ) {
                            alt18=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 18, 2, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 47:
                        {
                        int LA18_3 = input.LA(2);

                        if ( (synpred27_InternalStoEx()) ) {
                            alt18=1;
                        }
                        else if ( (true) ) {
                            alt18=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 18, 3, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 48:
                        {
                        int LA18_4 = input.LA(2);

                        if ( (synpred27_InternalStoEx()) ) {
                            alt18=1;
                        }
                        else if ( (true) ) {
                            alt18=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 18, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 49:
                        {
                        int LA18_5 = input.LA(2);

                        if ( (synpred27_InternalStoEx()) ) {
                            alt18=1;
                        }
                        else if ( (true) ) {
                            alt18=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 18, 5, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_LPAREN:
                        {
                        int LA18_6 = input.LA(2);

                        if ( (synpred27_InternalStoEx()) ) {
                            alt18=1;
                        }
                        else if ( (true) ) {
                            alt18=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 18, 6, input);

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
                            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1702:2: this_unitMulti_2= ruleunitMulti
                            {
                            if ( state.backtracking==0 ) {
                               
                              	  /* */ 
                              	
                            }
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getUnitPowAccess().getUnitMultiParserRuleCall_0_1_1_0()); 
                                  
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleunitMulti_in_ruleunitPow3718);
                            this_unitMulti_2=ruleunitMulti();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                      current = this_unitMulti_2; 
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1715:2: this_unitDiv_3= ruleunitDiv
                            {
                            if ( state.backtracking==0 ) {
                               
                              	  /* */ 
                              	
                            }
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getUnitPowAccess().getUnitDivParserRuleCall_0_1_1_1()); 
                                  
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleunitDiv_in_ruleunitPow3748);
                            this_unitDiv_3=ruleunitDiv();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                      current = this_unitDiv_3; 
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;

                    }

                    this_RPAREN_4=(Token)match(input,RULE_RPAREN,FollowSets000.FOLLOW_RULE_RPAREN_in_ruleunitPow3759); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RPAREN_4, grammarAccess.getUnitPowAccess().getRPARENTerminalRuleCall_0_1_2()); 
                          
                    }

                    }


                    }
                    break;

            }

            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1730:3: ( () this_POW_6= RULE_POW ( (lv_exponent_7_0= ruleSIGNED_INT ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_POW) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1730:4: () this_POW_6= RULE_POW ( (lv_exponent_7_0= ruleSIGNED_INT ) )
            	    {
            	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1730:4: ()
            	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1731:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getUnitPowAccess().getUnitPowerUnitAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    this_POW_6=(Token)match(input,RULE_POW,FollowSets000.FOLLOW_RULE_POW_in_ruleunitPow3784); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_POW_6, grammarAccess.getUnitPowAccess().getPOWTerminalRuleCall_1_1()); 
            	          
            	    }
            	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1743:1: ( (lv_exponent_7_0= ruleSIGNED_INT ) )
            	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1744:1: (lv_exponent_7_0= ruleSIGNED_INT )
            	    {
            	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1744:1: (lv_exponent_7_0= ruleSIGNED_INT )
            	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1745:3: lv_exponent_7_0= ruleSIGNED_INT
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getUnitPowAccess().getExponentSIGNED_INTParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleSIGNED_INT_in_ruleunitPow3804);
            	    lv_exponent_7_0=ruleSIGNED_INT();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getUnitPowRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"exponent",
            	              		lv_exponent_7_0, 
            	              		"SIGNED_INT");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // $ANTLR end "ruleunitPow"


    // $ANTLR start "entryRuleBaseUnit"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1769:1: entryRuleBaseUnit returns [EObject current=null] : iv_ruleBaseUnit= ruleBaseUnit EOF ;
    public final EObject entryRuleBaseUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseUnit = null;


        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1770:2: (iv_ruleBaseUnit= ruleBaseUnit EOF )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1771:2: iv_ruleBaseUnit= ruleBaseUnit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBaseUnitRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBaseUnit_in_entryRuleBaseUnit3842);
            iv_ruleBaseUnit=ruleBaseUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBaseUnit; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBaseUnit3852); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBaseUnit"


    // $ANTLR start "ruleBaseUnit"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1778:1: ruleBaseUnit returns [EObject current=null] : ( (lv_name_0_0= ruleUnitNames ) ) ;
    public final EObject ruleBaseUnit() throws RecognitionException {
        EObject current = null;

        Enumerator lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1781:28: ( ( (lv_name_0_0= ruleUnitNames ) ) )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1782:1: ( (lv_name_0_0= ruleUnitNames ) )
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1782:1: ( (lv_name_0_0= ruleUnitNames ) )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1783:1: (lv_name_0_0= ruleUnitNames )
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1783:1: (lv_name_0_0= ruleUnitNames )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1784:3: lv_name_0_0= ruleUnitNames
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBaseUnitAccess().getNameUnitNamesEnumRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnitNames_in_ruleBaseUnit3897);
            lv_name_0_0=ruleUnitNames();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBaseUnitRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"UnitNames");
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
    // $ANTLR end "ruleBaseUnit"


    // $ANTLR start "entryRuledefinition"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1808:1: entryRuledefinition returns [EObject current=null] : iv_ruledefinition= ruledefinition EOF ;
    public final EObject entryRuledefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledefinition = null;


        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1809:2: (iv_ruledefinition= ruledefinition EOF )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1810:2: iv_ruledefinition= ruledefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruledefinition_in_entryRuledefinition3932);
            iv_ruledefinition=ruledefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruledefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuledefinition3942); if (state.failed) return current;

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
    // $ANTLR end "entryRuledefinition"


    // $ANTLR start "ruledefinition"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1817:1: ruledefinition returns [EObject current=null] : (this_ProbabilityMassFunction_0= ruleProbabilityMassFunction | this_ProbabilityDensityFunction_1= ruleProbabilityDensityFunction ) ;
    public final EObject ruledefinition() throws RecognitionException {
        EObject current = null;

        EObject this_ProbabilityMassFunction_0 = null;

        EObject this_ProbabilityDensityFunction_1 = null;


         enterRule(); 
            
        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1820:28: ( (this_ProbabilityMassFunction_0= ruleProbabilityMassFunction | this_ProbabilityDensityFunction_1= ruleProbabilityDensityFunction ) )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1821:1: (this_ProbabilityMassFunction_0= ruleProbabilityMassFunction | this_ProbabilityDensityFunction_1= ruleProbabilityDensityFunction )
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1821:1: (this_ProbabilityMassFunction_0= ruleProbabilityMassFunction | this_ProbabilityDensityFunction_1= ruleProbabilityDensityFunction )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_INTPMF && LA21_0<=RULE_ENUMPMF)||LA21_0==RULE_BOOLPMF) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_DOUBLEPDF) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1822:2: this_ProbabilityMassFunction_0= ruleProbabilityMassFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefinitionAccess().getProbabilityMassFunctionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleProbabilityMassFunction_in_ruledefinition3992);
                    this_ProbabilityMassFunction_0=ruleProbabilityMassFunction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ProbabilityMassFunction_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1835:2: this_ProbabilityDensityFunction_1= ruleProbabilityDensityFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefinitionAccess().getProbabilityDensityFunctionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleProbabilityDensityFunction_in_ruledefinition4022);
                    this_ProbabilityDensityFunction_1=ruleProbabilityDensityFunction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ProbabilityDensityFunction_1; 
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
    // $ANTLR end "ruledefinition"


    // $ANTLR start "entryRuleProbabilityDensityFunction"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1854:1: entryRuleProbabilityDensityFunction returns [EObject current=null] : iv_ruleProbabilityDensityFunction= ruleProbabilityDensityFunction EOF ;
    public final EObject entryRuleProbabilityDensityFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProbabilityDensityFunction = null;


        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1855:2: (iv_ruleProbabilityDensityFunction= ruleProbabilityDensityFunction EOF )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1856:2: iv_ruleProbabilityDensityFunction= ruleProbabilityDensityFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProbabilityDensityFunctionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleProbabilityDensityFunction_in_entryRuleProbabilityDensityFunction4057);
            iv_ruleProbabilityDensityFunction=ruleProbabilityDensityFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProbabilityDensityFunction; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProbabilityDensityFunction4067); if (state.failed) return current;

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
    // $ANTLR end "entryRuleProbabilityDensityFunction"


    // $ANTLR start "ruleProbabilityDensityFunction"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1863:1: ruleProbabilityDensityFunction returns [EObject current=null] : this_BoxedPDF_0= ruleBoxedPDF ;
    public final EObject ruleProbabilityDensityFunction() throws RecognitionException {
        EObject current = null;

        EObject this_BoxedPDF_0 = null;


         enterRule(); 
            
        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1866:28: (this_BoxedPDF_0= ruleBoxedPDF )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1868:2: this_BoxedPDF_0= ruleBoxedPDF
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getProbabilityDensityFunctionAccess().getBoxedPDFParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleBoxedPDF_in_ruleProbabilityDensityFunction4116);
            this_BoxedPDF_0=ruleBoxedPDF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BoxedPDF_0; 
                      afterParserOrEnumRuleCall();
                  
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
    // $ANTLR end "ruleProbabilityDensityFunction"


    // $ANTLR start "entryRuleBoxedPDF"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1887:1: entryRuleBoxedPDF returns [EObject current=null] : iv_ruleBoxedPDF= ruleBoxedPDF EOF ;
    public final EObject entryRuleBoxedPDF() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoxedPDF = null;


        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1888:2: (iv_ruleBoxedPDF= ruleBoxedPDF EOF )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1889:2: iv_ruleBoxedPDF= ruleBoxedPDF EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoxedPDFRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBoxedPDF_in_entryRuleBoxedPDF4150);
            iv_ruleBoxedPDF=ruleBoxedPDF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoxedPDF; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBoxedPDF4160); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBoxedPDF"


    // $ANTLR start "ruleBoxedPDF"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1896:1: ruleBoxedPDF returns [EObject current=null] : (this_DOUBLEPDF_0= RULE_DOUBLEPDF this_SQUARE_PAREN_L_1= RULE_SQUARE_PAREN_L ( (lv_samples_2_0= rulereal_pdf_sample ) )+ this_SQUARE_PAREN_R_3= RULE_SQUARE_PAREN_R (this_SQUARE_PAREN_L_4= RULE_SQUARE_PAREN_L ( (lv_unit_5_0= ruleUnit ) ) this_SQUARE_PAREN_R_6= RULE_SQUARE_PAREN_R )? ) ;
    public final EObject ruleBoxedPDF() throws RecognitionException {
        EObject current = null;

        Token this_DOUBLEPDF_0=null;
        Token this_SQUARE_PAREN_L_1=null;
        Token this_SQUARE_PAREN_R_3=null;
        Token this_SQUARE_PAREN_L_4=null;
        Token this_SQUARE_PAREN_R_6=null;
        EObject lv_samples_2_0 = null;

        EObject lv_unit_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1899:28: ( (this_DOUBLEPDF_0= RULE_DOUBLEPDF this_SQUARE_PAREN_L_1= RULE_SQUARE_PAREN_L ( (lv_samples_2_0= rulereal_pdf_sample ) )+ this_SQUARE_PAREN_R_3= RULE_SQUARE_PAREN_R (this_SQUARE_PAREN_L_4= RULE_SQUARE_PAREN_L ( (lv_unit_5_0= ruleUnit ) ) this_SQUARE_PAREN_R_6= RULE_SQUARE_PAREN_R )? ) )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1900:1: (this_DOUBLEPDF_0= RULE_DOUBLEPDF this_SQUARE_PAREN_L_1= RULE_SQUARE_PAREN_L ( (lv_samples_2_0= rulereal_pdf_sample ) )+ this_SQUARE_PAREN_R_3= RULE_SQUARE_PAREN_R (this_SQUARE_PAREN_L_4= RULE_SQUARE_PAREN_L ( (lv_unit_5_0= ruleUnit ) ) this_SQUARE_PAREN_R_6= RULE_SQUARE_PAREN_R )? )
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1900:1: (this_DOUBLEPDF_0= RULE_DOUBLEPDF this_SQUARE_PAREN_L_1= RULE_SQUARE_PAREN_L ( (lv_samples_2_0= rulereal_pdf_sample ) )+ this_SQUARE_PAREN_R_3= RULE_SQUARE_PAREN_R (this_SQUARE_PAREN_L_4= RULE_SQUARE_PAREN_L ( (lv_unit_5_0= ruleUnit ) ) this_SQUARE_PAREN_R_6= RULE_SQUARE_PAREN_R )? )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1900:2: this_DOUBLEPDF_0= RULE_DOUBLEPDF this_SQUARE_PAREN_L_1= RULE_SQUARE_PAREN_L ( (lv_samples_2_0= rulereal_pdf_sample ) )+ this_SQUARE_PAREN_R_3= RULE_SQUARE_PAREN_R (this_SQUARE_PAREN_L_4= RULE_SQUARE_PAREN_L ( (lv_unit_5_0= ruleUnit ) ) this_SQUARE_PAREN_R_6= RULE_SQUARE_PAREN_R )?
            {
            this_DOUBLEPDF_0=(Token)match(input,RULE_DOUBLEPDF,FollowSets000.FOLLOW_RULE_DOUBLEPDF_in_ruleBoxedPDF4196); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_DOUBLEPDF_0, grammarAccess.getBoxedPDFAccess().getDOUBLEPDFTerminalRuleCall_0()); 
                  
            }
            this_SQUARE_PAREN_L_1=(Token)match(input,RULE_SQUARE_PAREN_L,FollowSets000.FOLLOW_RULE_SQUARE_PAREN_L_in_ruleBoxedPDF4206); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_SQUARE_PAREN_L_1, grammarAccess.getBoxedPDFAccess().getSQUARE_PAREN_LTerminalRuleCall_1()); 
                  
            }
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1908:1: ( (lv_samples_2_0= rulereal_pdf_sample ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_LPAREN) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1909:1: (lv_samples_2_0= rulereal_pdf_sample )
            	    {
            	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1909:1: (lv_samples_2_0= rulereal_pdf_sample )
            	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1910:3: lv_samples_2_0= rulereal_pdf_sample
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBoxedPDFAccess().getSamplesReal_pdf_sampleParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_rulereal_pdf_sample_in_ruleBoxedPDF4226);
            	    lv_samples_2_0=rulereal_pdf_sample();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBoxedPDFRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"samples",
            	              		lv_samples_2_0, 
            	              		"real_pdf_sample");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);

            this_SQUARE_PAREN_R_3=(Token)match(input,RULE_SQUARE_PAREN_R,FollowSets000.FOLLOW_RULE_SQUARE_PAREN_R_in_ruleBoxedPDF4238); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_SQUARE_PAREN_R_3, grammarAccess.getBoxedPDFAccess().getSQUARE_PAREN_RTerminalRuleCall_3()); 
                  
            }
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1930:1: (this_SQUARE_PAREN_L_4= RULE_SQUARE_PAREN_L ( (lv_unit_5_0= ruleUnit ) ) this_SQUARE_PAREN_R_6= RULE_SQUARE_PAREN_R )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_SQUARE_PAREN_L) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1930:2: this_SQUARE_PAREN_L_4= RULE_SQUARE_PAREN_L ( (lv_unit_5_0= ruleUnit ) ) this_SQUARE_PAREN_R_6= RULE_SQUARE_PAREN_R
                    {
                    this_SQUARE_PAREN_L_4=(Token)match(input,RULE_SQUARE_PAREN_L,FollowSets000.FOLLOW_RULE_SQUARE_PAREN_L_in_ruleBoxedPDF4249); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SQUARE_PAREN_L_4, grammarAccess.getBoxedPDFAccess().getSQUARE_PAREN_LTerminalRuleCall_4_0()); 
                          
                    }
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1934:1: ( (lv_unit_5_0= ruleUnit ) )
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1935:1: (lv_unit_5_0= ruleUnit )
                    {
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1935:1: (lv_unit_5_0= ruleUnit )
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1936:3: lv_unit_5_0= ruleUnit
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBoxedPDFAccess().getUnitUnitParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnit_in_ruleBoxedPDF4269);
                    lv_unit_5_0=ruleUnit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBoxedPDFRule());
                      	        }
                             		set(
                             			current, 
                             			"unit",
                              		lv_unit_5_0, 
                              		"Unit");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_SQUARE_PAREN_R_6=(Token)match(input,RULE_SQUARE_PAREN_R,FollowSets000.FOLLOW_RULE_SQUARE_PAREN_R_in_ruleBoxedPDF4280); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SQUARE_PAREN_R_6, grammarAccess.getBoxedPDFAccess().getSQUARE_PAREN_RTerminalRuleCall_4_2()); 
                          
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
    // $ANTLR end "ruleBoxedPDF"


    // $ANTLR start "entryRuleProbabilityMassFunction"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1964:1: entryRuleProbabilityMassFunction returns [EObject current=null] : iv_ruleProbabilityMassFunction= ruleProbabilityMassFunction EOF ;
    public final EObject entryRuleProbabilityMassFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProbabilityMassFunction = null;


        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1965:2: (iv_ruleProbabilityMassFunction= ruleProbabilityMassFunction EOF )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1966:2: iv_ruleProbabilityMassFunction= ruleProbabilityMassFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProbabilityMassFunctionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleProbabilityMassFunction_in_entryRuleProbabilityMassFunction4317);
            iv_ruleProbabilityMassFunction=ruleProbabilityMassFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProbabilityMassFunction; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProbabilityMassFunction4327); if (state.failed) return current;

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
    // $ANTLR end "entryRuleProbabilityMassFunction"


    // $ANTLR start "ruleProbabilityMassFunction"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1973:1: ruleProbabilityMassFunction returns [EObject current=null] : ( (this_INTPMF_0= RULE_INTPMF this_SQUARE_PAREN_L_1= RULE_SQUARE_PAREN_L ( (lv_samples_2_0= rulenumeric_int_sample ) )+ this_SQUARE_PAREN_R_3= RULE_SQUARE_PAREN_R (this_SQUARE_PAREN_L_4= RULE_SQUARE_PAREN_L ( (lv_unit_5_0= ruleUnit ) ) this_SQUARE_PAREN_R_6= RULE_SQUARE_PAREN_R )? ) | (this_DOUBLEPMF_7= RULE_DOUBLEPMF this_SQUARE_PAREN_L_8= RULE_SQUARE_PAREN_L ( (lv_samples_9_0= rulenumeric_real_sample ) )+ this_SQUARE_PAREN_R_10= RULE_SQUARE_PAREN_R (this_SQUARE_PAREN_L_11= RULE_SQUARE_PAREN_L ( (lv_unit_12_0= ruleUnit ) ) this_SQUARE_PAREN_R_13= RULE_SQUARE_PAREN_R )? ) | (this_ENUMPMF_14= RULE_ENUMPMF (this_LPAREN_15= RULE_LPAREN ( (lv_orderedDomain_16_0= RULE_ORDERED_DEF ) ) this_RPAREN_17= RULE_RPAREN )? this_SQUARE_PAREN_L_18= RULE_SQUARE_PAREN_L ( (lv_samples_19_0= rulestringsample ) )+ this_SQUARE_PAREN_R_20= RULE_SQUARE_PAREN_R ) | (this_BOOLPMF_21= RULE_BOOLPMF (this_LPAREN_22= RULE_LPAREN ( (lv_orderedDomain_23_0= RULE_ORDERED_DEF ) ) this_RPAREN_24= RULE_RPAREN )? this_SQUARE_PAREN_L_25= RULE_SQUARE_PAREN_L ( (lv_samples_26_0= ruleboolsample ) )+ this_SQUARE_PAREN_R_27= RULE_SQUARE_PAREN_R ) ) ;
    public final EObject ruleProbabilityMassFunction() throws RecognitionException {
        EObject current = null;

        Token this_INTPMF_0=null;
        Token this_SQUARE_PAREN_L_1=null;
        Token this_SQUARE_PAREN_R_3=null;
        Token this_SQUARE_PAREN_L_4=null;
        Token this_SQUARE_PAREN_R_6=null;
        Token this_DOUBLEPMF_7=null;
        Token this_SQUARE_PAREN_L_8=null;
        Token this_SQUARE_PAREN_R_10=null;
        Token this_SQUARE_PAREN_L_11=null;
        Token this_SQUARE_PAREN_R_13=null;
        Token this_ENUMPMF_14=null;
        Token this_LPAREN_15=null;
        Token lv_orderedDomain_16_0=null;
        Token this_RPAREN_17=null;
        Token this_SQUARE_PAREN_L_18=null;
        Token this_SQUARE_PAREN_R_20=null;
        Token this_BOOLPMF_21=null;
        Token this_LPAREN_22=null;
        Token lv_orderedDomain_23_0=null;
        Token this_RPAREN_24=null;
        Token this_SQUARE_PAREN_L_25=null;
        Token this_SQUARE_PAREN_R_27=null;
        EObject lv_samples_2_0 = null;

        EObject lv_unit_5_0 = null;

        EObject lv_samples_9_0 = null;

        EObject lv_unit_12_0 = null;

        EObject lv_samples_19_0 = null;

        EObject lv_samples_26_0 = null;


         enterRule(); 
            
        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1976:28: ( ( (this_INTPMF_0= RULE_INTPMF this_SQUARE_PAREN_L_1= RULE_SQUARE_PAREN_L ( (lv_samples_2_0= rulenumeric_int_sample ) )+ this_SQUARE_PAREN_R_3= RULE_SQUARE_PAREN_R (this_SQUARE_PAREN_L_4= RULE_SQUARE_PAREN_L ( (lv_unit_5_0= ruleUnit ) ) this_SQUARE_PAREN_R_6= RULE_SQUARE_PAREN_R )? ) | (this_DOUBLEPMF_7= RULE_DOUBLEPMF this_SQUARE_PAREN_L_8= RULE_SQUARE_PAREN_L ( (lv_samples_9_0= rulenumeric_real_sample ) )+ this_SQUARE_PAREN_R_10= RULE_SQUARE_PAREN_R (this_SQUARE_PAREN_L_11= RULE_SQUARE_PAREN_L ( (lv_unit_12_0= ruleUnit ) ) this_SQUARE_PAREN_R_13= RULE_SQUARE_PAREN_R )? ) | (this_ENUMPMF_14= RULE_ENUMPMF (this_LPAREN_15= RULE_LPAREN ( (lv_orderedDomain_16_0= RULE_ORDERED_DEF ) ) this_RPAREN_17= RULE_RPAREN )? this_SQUARE_PAREN_L_18= RULE_SQUARE_PAREN_L ( (lv_samples_19_0= rulestringsample ) )+ this_SQUARE_PAREN_R_20= RULE_SQUARE_PAREN_R ) | (this_BOOLPMF_21= RULE_BOOLPMF (this_LPAREN_22= RULE_LPAREN ( (lv_orderedDomain_23_0= RULE_ORDERED_DEF ) ) this_RPAREN_24= RULE_RPAREN )? this_SQUARE_PAREN_L_25= RULE_SQUARE_PAREN_L ( (lv_samples_26_0= ruleboolsample ) )+ this_SQUARE_PAREN_R_27= RULE_SQUARE_PAREN_R ) ) )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1977:1: ( (this_INTPMF_0= RULE_INTPMF this_SQUARE_PAREN_L_1= RULE_SQUARE_PAREN_L ( (lv_samples_2_0= rulenumeric_int_sample ) )+ this_SQUARE_PAREN_R_3= RULE_SQUARE_PAREN_R (this_SQUARE_PAREN_L_4= RULE_SQUARE_PAREN_L ( (lv_unit_5_0= ruleUnit ) ) this_SQUARE_PAREN_R_6= RULE_SQUARE_PAREN_R )? ) | (this_DOUBLEPMF_7= RULE_DOUBLEPMF this_SQUARE_PAREN_L_8= RULE_SQUARE_PAREN_L ( (lv_samples_9_0= rulenumeric_real_sample ) )+ this_SQUARE_PAREN_R_10= RULE_SQUARE_PAREN_R (this_SQUARE_PAREN_L_11= RULE_SQUARE_PAREN_L ( (lv_unit_12_0= ruleUnit ) ) this_SQUARE_PAREN_R_13= RULE_SQUARE_PAREN_R )? ) | (this_ENUMPMF_14= RULE_ENUMPMF (this_LPAREN_15= RULE_LPAREN ( (lv_orderedDomain_16_0= RULE_ORDERED_DEF ) ) this_RPAREN_17= RULE_RPAREN )? this_SQUARE_PAREN_L_18= RULE_SQUARE_PAREN_L ( (lv_samples_19_0= rulestringsample ) )+ this_SQUARE_PAREN_R_20= RULE_SQUARE_PAREN_R ) | (this_BOOLPMF_21= RULE_BOOLPMF (this_LPAREN_22= RULE_LPAREN ( (lv_orderedDomain_23_0= RULE_ORDERED_DEF ) ) this_RPAREN_24= RULE_RPAREN )? this_SQUARE_PAREN_L_25= RULE_SQUARE_PAREN_L ( (lv_samples_26_0= ruleboolsample ) )+ this_SQUARE_PAREN_R_27= RULE_SQUARE_PAREN_R ) )
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1977:1: ( (this_INTPMF_0= RULE_INTPMF this_SQUARE_PAREN_L_1= RULE_SQUARE_PAREN_L ( (lv_samples_2_0= rulenumeric_int_sample ) )+ this_SQUARE_PAREN_R_3= RULE_SQUARE_PAREN_R (this_SQUARE_PAREN_L_4= RULE_SQUARE_PAREN_L ( (lv_unit_5_0= ruleUnit ) ) this_SQUARE_PAREN_R_6= RULE_SQUARE_PAREN_R )? ) | (this_DOUBLEPMF_7= RULE_DOUBLEPMF this_SQUARE_PAREN_L_8= RULE_SQUARE_PAREN_L ( (lv_samples_9_0= rulenumeric_real_sample ) )+ this_SQUARE_PAREN_R_10= RULE_SQUARE_PAREN_R (this_SQUARE_PAREN_L_11= RULE_SQUARE_PAREN_L ( (lv_unit_12_0= ruleUnit ) ) this_SQUARE_PAREN_R_13= RULE_SQUARE_PAREN_R )? ) | (this_ENUMPMF_14= RULE_ENUMPMF (this_LPAREN_15= RULE_LPAREN ( (lv_orderedDomain_16_0= RULE_ORDERED_DEF ) ) this_RPAREN_17= RULE_RPAREN )? this_SQUARE_PAREN_L_18= RULE_SQUARE_PAREN_L ( (lv_samples_19_0= rulestringsample ) )+ this_SQUARE_PAREN_R_20= RULE_SQUARE_PAREN_R ) | (this_BOOLPMF_21= RULE_BOOLPMF (this_LPAREN_22= RULE_LPAREN ( (lv_orderedDomain_23_0= RULE_ORDERED_DEF ) ) this_RPAREN_24= RULE_RPAREN )? this_SQUARE_PAREN_L_25= RULE_SQUARE_PAREN_L ( (lv_samples_26_0= ruleboolsample ) )+ this_SQUARE_PAREN_R_27= RULE_SQUARE_PAREN_R ) )
            int alt32=4;
            switch ( input.LA(1) ) {
            case RULE_INTPMF:
                {
                alt32=1;
                }
                break;
            case RULE_DOUBLEPMF:
                {
                alt32=2;
                }
                break;
            case RULE_ENUMPMF:
                {
                alt32=3;
                }
                break;
            case RULE_BOOLPMF:
                {
                alt32=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1977:2: (this_INTPMF_0= RULE_INTPMF this_SQUARE_PAREN_L_1= RULE_SQUARE_PAREN_L ( (lv_samples_2_0= rulenumeric_int_sample ) )+ this_SQUARE_PAREN_R_3= RULE_SQUARE_PAREN_R (this_SQUARE_PAREN_L_4= RULE_SQUARE_PAREN_L ( (lv_unit_5_0= ruleUnit ) ) this_SQUARE_PAREN_R_6= RULE_SQUARE_PAREN_R )? )
                    {
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1977:2: (this_INTPMF_0= RULE_INTPMF this_SQUARE_PAREN_L_1= RULE_SQUARE_PAREN_L ( (lv_samples_2_0= rulenumeric_int_sample ) )+ this_SQUARE_PAREN_R_3= RULE_SQUARE_PAREN_R (this_SQUARE_PAREN_L_4= RULE_SQUARE_PAREN_L ( (lv_unit_5_0= ruleUnit ) ) this_SQUARE_PAREN_R_6= RULE_SQUARE_PAREN_R )? )
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1977:3: this_INTPMF_0= RULE_INTPMF this_SQUARE_PAREN_L_1= RULE_SQUARE_PAREN_L ( (lv_samples_2_0= rulenumeric_int_sample ) )+ this_SQUARE_PAREN_R_3= RULE_SQUARE_PAREN_R (this_SQUARE_PAREN_L_4= RULE_SQUARE_PAREN_L ( (lv_unit_5_0= ruleUnit ) ) this_SQUARE_PAREN_R_6= RULE_SQUARE_PAREN_R )?
                    {
                    this_INTPMF_0=(Token)match(input,RULE_INTPMF,FollowSets000.FOLLOW_RULE_INTPMF_in_ruleProbabilityMassFunction4364); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INTPMF_0, grammarAccess.getProbabilityMassFunctionAccess().getINTPMFTerminalRuleCall_0_0()); 
                          
                    }
                    this_SQUARE_PAREN_L_1=(Token)match(input,RULE_SQUARE_PAREN_L,FollowSets000.FOLLOW_RULE_SQUARE_PAREN_L_in_ruleProbabilityMassFunction4374); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SQUARE_PAREN_L_1, grammarAccess.getProbabilityMassFunctionAccess().getSQUARE_PAREN_LTerminalRuleCall_0_1()); 
                          
                    }
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1985:1: ( (lv_samples_2_0= rulenumeric_int_sample ) )+
                    int cnt24=0;
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==RULE_LPAREN) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1986:1: (lv_samples_2_0= rulenumeric_int_sample )
                    	    {
                    	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1986:1: (lv_samples_2_0= rulenumeric_int_sample )
                    	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1987:3: lv_samples_2_0= rulenumeric_int_sample
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getProbabilityMassFunctionAccess().getSamplesNumeric_int_sampleParserRuleCall_0_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_rulenumeric_int_sample_in_ruleProbabilityMassFunction4394);
                    	    lv_samples_2_0=rulenumeric_int_sample();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getProbabilityMassFunctionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"samples",
                    	              		lv_samples_2_0, 
                    	              		"numeric_int_sample");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt24 >= 1 ) break loop24;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(24, input);
                                throw eee;
                        }
                        cnt24++;
                    } while (true);

                    this_SQUARE_PAREN_R_3=(Token)match(input,RULE_SQUARE_PAREN_R,FollowSets000.FOLLOW_RULE_SQUARE_PAREN_R_in_ruleProbabilityMassFunction4406); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SQUARE_PAREN_R_3, grammarAccess.getProbabilityMassFunctionAccess().getSQUARE_PAREN_RTerminalRuleCall_0_3()); 
                          
                    }
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2007:1: (this_SQUARE_PAREN_L_4= RULE_SQUARE_PAREN_L ( (lv_unit_5_0= ruleUnit ) ) this_SQUARE_PAREN_R_6= RULE_SQUARE_PAREN_R )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==RULE_SQUARE_PAREN_L) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2007:2: this_SQUARE_PAREN_L_4= RULE_SQUARE_PAREN_L ( (lv_unit_5_0= ruleUnit ) ) this_SQUARE_PAREN_R_6= RULE_SQUARE_PAREN_R
                            {
                            this_SQUARE_PAREN_L_4=(Token)match(input,RULE_SQUARE_PAREN_L,FollowSets000.FOLLOW_RULE_SQUARE_PAREN_L_in_ruleProbabilityMassFunction4417); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_SQUARE_PAREN_L_4, grammarAccess.getProbabilityMassFunctionAccess().getSQUARE_PAREN_LTerminalRuleCall_0_4_0()); 
                                  
                            }
                            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2011:1: ( (lv_unit_5_0= ruleUnit ) )
                            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2012:1: (lv_unit_5_0= ruleUnit )
                            {
                            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2012:1: (lv_unit_5_0= ruleUnit )
                            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2013:3: lv_unit_5_0= ruleUnit
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getProbabilityMassFunctionAccess().getUnitUnitParserRuleCall_0_4_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleUnit_in_ruleProbabilityMassFunction4437);
                            lv_unit_5_0=ruleUnit();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getProbabilityMassFunctionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"unit",
                                      		lv_unit_5_0, 
                                      		"Unit");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            this_SQUARE_PAREN_R_6=(Token)match(input,RULE_SQUARE_PAREN_R,FollowSets000.FOLLOW_RULE_SQUARE_PAREN_R_in_ruleProbabilityMassFunction4448); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_SQUARE_PAREN_R_6, grammarAccess.getProbabilityMassFunctionAccess().getSQUARE_PAREN_RTerminalRuleCall_0_4_2()); 
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2034:6: (this_DOUBLEPMF_7= RULE_DOUBLEPMF this_SQUARE_PAREN_L_8= RULE_SQUARE_PAREN_L ( (lv_samples_9_0= rulenumeric_real_sample ) )+ this_SQUARE_PAREN_R_10= RULE_SQUARE_PAREN_R (this_SQUARE_PAREN_L_11= RULE_SQUARE_PAREN_L ( (lv_unit_12_0= ruleUnit ) ) this_SQUARE_PAREN_R_13= RULE_SQUARE_PAREN_R )? )
                    {
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2034:6: (this_DOUBLEPMF_7= RULE_DOUBLEPMF this_SQUARE_PAREN_L_8= RULE_SQUARE_PAREN_L ( (lv_samples_9_0= rulenumeric_real_sample ) )+ this_SQUARE_PAREN_R_10= RULE_SQUARE_PAREN_R (this_SQUARE_PAREN_L_11= RULE_SQUARE_PAREN_L ( (lv_unit_12_0= ruleUnit ) ) this_SQUARE_PAREN_R_13= RULE_SQUARE_PAREN_R )? )
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2034:7: this_DOUBLEPMF_7= RULE_DOUBLEPMF this_SQUARE_PAREN_L_8= RULE_SQUARE_PAREN_L ( (lv_samples_9_0= rulenumeric_real_sample ) )+ this_SQUARE_PAREN_R_10= RULE_SQUARE_PAREN_R (this_SQUARE_PAREN_L_11= RULE_SQUARE_PAREN_L ( (lv_unit_12_0= ruleUnit ) ) this_SQUARE_PAREN_R_13= RULE_SQUARE_PAREN_R )?
                    {
                    this_DOUBLEPMF_7=(Token)match(input,RULE_DOUBLEPMF,FollowSets000.FOLLOW_RULE_DOUBLEPMF_in_ruleProbabilityMassFunction4468); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_DOUBLEPMF_7, grammarAccess.getProbabilityMassFunctionAccess().getDOUBLEPMFTerminalRuleCall_1_0()); 
                          
                    }
                    this_SQUARE_PAREN_L_8=(Token)match(input,RULE_SQUARE_PAREN_L,FollowSets000.FOLLOW_RULE_SQUARE_PAREN_L_in_ruleProbabilityMassFunction4478); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SQUARE_PAREN_L_8, grammarAccess.getProbabilityMassFunctionAccess().getSQUARE_PAREN_LTerminalRuleCall_1_1()); 
                          
                    }
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2042:1: ( (lv_samples_9_0= rulenumeric_real_sample ) )+
                    int cnt26=0;
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==RULE_LPAREN) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2043:1: (lv_samples_9_0= rulenumeric_real_sample )
                    	    {
                    	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2043:1: (lv_samples_9_0= rulenumeric_real_sample )
                    	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2044:3: lv_samples_9_0= rulenumeric_real_sample
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getProbabilityMassFunctionAccess().getSamplesNumeric_real_sampleParserRuleCall_1_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_rulenumeric_real_sample_in_ruleProbabilityMassFunction4498);
                    	    lv_samples_9_0=rulenumeric_real_sample();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getProbabilityMassFunctionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"samples",
                    	              		lv_samples_9_0, 
                    	              		"numeric_real_sample");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt26 >= 1 ) break loop26;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(26, input);
                                throw eee;
                        }
                        cnt26++;
                    } while (true);

                    this_SQUARE_PAREN_R_10=(Token)match(input,RULE_SQUARE_PAREN_R,FollowSets000.FOLLOW_RULE_SQUARE_PAREN_R_in_ruleProbabilityMassFunction4510); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SQUARE_PAREN_R_10, grammarAccess.getProbabilityMassFunctionAccess().getSQUARE_PAREN_RTerminalRuleCall_1_3()); 
                          
                    }
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2064:1: (this_SQUARE_PAREN_L_11= RULE_SQUARE_PAREN_L ( (lv_unit_12_0= ruleUnit ) ) this_SQUARE_PAREN_R_13= RULE_SQUARE_PAREN_R )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==RULE_SQUARE_PAREN_L) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2064:2: this_SQUARE_PAREN_L_11= RULE_SQUARE_PAREN_L ( (lv_unit_12_0= ruleUnit ) ) this_SQUARE_PAREN_R_13= RULE_SQUARE_PAREN_R
                            {
                            this_SQUARE_PAREN_L_11=(Token)match(input,RULE_SQUARE_PAREN_L,FollowSets000.FOLLOW_RULE_SQUARE_PAREN_L_in_ruleProbabilityMassFunction4521); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_SQUARE_PAREN_L_11, grammarAccess.getProbabilityMassFunctionAccess().getSQUARE_PAREN_LTerminalRuleCall_1_4_0()); 
                                  
                            }
                            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2068:1: ( (lv_unit_12_0= ruleUnit ) )
                            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2069:1: (lv_unit_12_0= ruleUnit )
                            {
                            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2069:1: (lv_unit_12_0= ruleUnit )
                            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2070:3: lv_unit_12_0= ruleUnit
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getProbabilityMassFunctionAccess().getUnitUnitParserRuleCall_1_4_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleUnit_in_ruleProbabilityMassFunction4541);
                            lv_unit_12_0=ruleUnit();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getProbabilityMassFunctionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"unit",
                                      		lv_unit_12_0, 
                                      		"Unit");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            this_SQUARE_PAREN_R_13=(Token)match(input,RULE_SQUARE_PAREN_R,FollowSets000.FOLLOW_RULE_SQUARE_PAREN_R_in_ruleProbabilityMassFunction4552); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_SQUARE_PAREN_R_13, grammarAccess.getProbabilityMassFunctionAccess().getSQUARE_PAREN_RTerminalRuleCall_1_4_2()); 
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2091:6: (this_ENUMPMF_14= RULE_ENUMPMF (this_LPAREN_15= RULE_LPAREN ( (lv_orderedDomain_16_0= RULE_ORDERED_DEF ) ) this_RPAREN_17= RULE_RPAREN )? this_SQUARE_PAREN_L_18= RULE_SQUARE_PAREN_L ( (lv_samples_19_0= rulestringsample ) )+ this_SQUARE_PAREN_R_20= RULE_SQUARE_PAREN_R )
                    {
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2091:6: (this_ENUMPMF_14= RULE_ENUMPMF (this_LPAREN_15= RULE_LPAREN ( (lv_orderedDomain_16_0= RULE_ORDERED_DEF ) ) this_RPAREN_17= RULE_RPAREN )? this_SQUARE_PAREN_L_18= RULE_SQUARE_PAREN_L ( (lv_samples_19_0= rulestringsample ) )+ this_SQUARE_PAREN_R_20= RULE_SQUARE_PAREN_R )
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2091:7: this_ENUMPMF_14= RULE_ENUMPMF (this_LPAREN_15= RULE_LPAREN ( (lv_orderedDomain_16_0= RULE_ORDERED_DEF ) ) this_RPAREN_17= RULE_RPAREN )? this_SQUARE_PAREN_L_18= RULE_SQUARE_PAREN_L ( (lv_samples_19_0= rulestringsample ) )+ this_SQUARE_PAREN_R_20= RULE_SQUARE_PAREN_R
                    {
                    this_ENUMPMF_14=(Token)match(input,RULE_ENUMPMF,FollowSets000.FOLLOW_RULE_ENUMPMF_in_ruleProbabilityMassFunction4572); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ENUMPMF_14, grammarAccess.getProbabilityMassFunctionAccess().getENUMPMFTerminalRuleCall_2_0()); 
                          
                    }
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2095:1: (this_LPAREN_15= RULE_LPAREN ( (lv_orderedDomain_16_0= RULE_ORDERED_DEF ) ) this_RPAREN_17= RULE_RPAREN )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==RULE_LPAREN) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2095:2: this_LPAREN_15= RULE_LPAREN ( (lv_orderedDomain_16_0= RULE_ORDERED_DEF ) ) this_RPAREN_17= RULE_RPAREN
                            {
                            this_LPAREN_15=(Token)match(input,RULE_LPAREN,FollowSets000.FOLLOW_RULE_LPAREN_in_ruleProbabilityMassFunction4583); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_LPAREN_15, grammarAccess.getProbabilityMassFunctionAccess().getLPARENTerminalRuleCall_2_1_0()); 
                                  
                            }
                            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2099:1: ( (lv_orderedDomain_16_0= RULE_ORDERED_DEF ) )
                            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2100:1: (lv_orderedDomain_16_0= RULE_ORDERED_DEF )
                            {
                            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2100:1: (lv_orderedDomain_16_0= RULE_ORDERED_DEF )
                            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2101:3: lv_orderedDomain_16_0= RULE_ORDERED_DEF
                            {
                            lv_orderedDomain_16_0=(Token)match(input,RULE_ORDERED_DEF,FollowSets000.FOLLOW_RULE_ORDERED_DEF_in_ruleProbabilityMassFunction4599); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_orderedDomain_16_0, grammarAccess.getProbabilityMassFunctionAccess().getOrderedDomainORDERED_DEFTerminalRuleCall_2_1_1_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getProbabilityMassFunctionRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"orderedDomain",
                                      		true, 
                                      		"ORDERED_DEF");
                              	    
                            }

                            }


                            }

                            this_RPAREN_17=(Token)match(input,RULE_RPAREN,FollowSets000.FOLLOW_RULE_RPAREN_in_ruleProbabilityMassFunction4615); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_RPAREN_17, grammarAccess.getProbabilityMassFunctionAccess().getRPARENTerminalRuleCall_2_1_2()); 
                                  
                            }

                            }
                            break;

                    }

                    this_SQUARE_PAREN_L_18=(Token)match(input,RULE_SQUARE_PAREN_L,FollowSets000.FOLLOW_RULE_SQUARE_PAREN_L_in_ruleProbabilityMassFunction4627); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SQUARE_PAREN_L_18, grammarAccess.getProbabilityMassFunctionAccess().getSQUARE_PAREN_LTerminalRuleCall_2_2()); 
                          
                    }
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2125:1: ( (lv_samples_19_0= rulestringsample ) )+
                    int cnt29=0;
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==RULE_LPAREN) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2126:1: (lv_samples_19_0= rulestringsample )
                    	    {
                    	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2126:1: (lv_samples_19_0= rulestringsample )
                    	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2127:3: lv_samples_19_0= rulestringsample
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getProbabilityMassFunctionAccess().getSamplesStringsampleParserRuleCall_2_3_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_rulestringsample_in_ruleProbabilityMassFunction4647);
                    	    lv_samples_19_0=rulestringsample();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getProbabilityMassFunctionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"samples",
                    	              		lv_samples_19_0, 
                    	              		"stringsample");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt29 >= 1 ) break loop29;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(29, input);
                                throw eee;
                        }
                        cnt29++;
                    } while (true);

                    this_SQUARE_PAREN_R_20=(Token)match(input,RULE_SQUARE_PAREN_R,FollowSets000.FOLLOW_RULE_SQUARE_PAREN_R_in_ruleProbabilityMassFunction4659); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SQUARE_PAREN_R_20, grammarAccess.getProbabilityMassFunctionAccess().getSQUARE_PAREN_RTerminalRuleCall_2_4()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2148:6: (this_BOOLPMF_21= RULE_BOOLPMF (this_LPAREN_22= RULE_LPAREN ( (lv_orderedDomain_23_0= RULE_ORDERED_DEF ) ) this_RPAREN_24= RULE_RPAREN )? this_SQUARE_PAREN_L_25= RULE_SQUARE_PAREN_L ( (lv_samples_26_0= ruleboolsample ) )+ this_SQUARE_PAREN_R_27= RULE_SQUARE_PAREN_R )
                    {
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2148:6: (this_BOOLPMF_21= RULE_BOOLPMF (this_LPAREN_22= RULE_LPAREN ( (lv_orderedDomain_23_0= RULE_ORDERED_DEF ) ) this_RPAREN_24= RULE_RPAREN )? this_SQUARE_PAREN_L_25= RULE_SQUARE_PAREN_L ( (lv_samples_26_0= ruleboolsample ) )+ this_SQUARE_PAREN_R_27= RULE_SQUARE_PAREN_R )
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2148:7: this_BOOLPMF_21= RULE_BOOLPMF (this_LPAREN_22= RULE_LPAREN ( (lv_orderedDomain_23_0= RULE_ORDERED_DEF ) ) this_RPAREN_24= RULE_RPAREN )? this_SQUARE_PAREN_L_25= RULE_SQUARE_PAREN_L ( (lv_samples_26_0= ruleboolsample ) )+ this_SQUARE_PAREN_R_27= RULE_SQUARE_PAREN_R
                    {
                    this_BOOLPMF_21=(Token)match(input,RULE_BOOLPMF,FollowSets000.FOLLOW_RULE_BOOLPMF_in_ruleProbabilityMassFunction4677); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BOOLPMF_21, grammarAccess.getProbabilityMassFunctionAccess().getBOOLPMFTerminalRuleCall_3_0()); 
                          
                    }
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2152:1: (this_LPAREN_22= RULE_LPAREN ( (lv_orderedDomain_23_0= RULE_ORDERED_DEF ) ) this_RPAREN_24= RULE_RPAREN )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==RULE_LPAREN) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2152:2: this_LPAREN_22= RULE_LPAREN ( (lv_orderedDomain_23_0= RULE_ORDERED_DEF ) ) this_RPAREN_24= RULE_RPAREN
                            {
                            this_LPAREN_22=(Token)match(input,RULE_LPAREN,FollowSets000.FOLLOW_RULE_LPAREN_in_ruleProbabilityMassFunction4688); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_LPAREN_22, grammarAccess.getProbabilityMassFunctionAccess().getLPARENTerminalRuleCall_3_1_0()); 
                                  
                            }
                            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2156:1: ( (lv_orderedDomain_23_0= RULE_ORDERED_DEF ) )
                            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2157:1: (lv_orderedDomain_23_0= RULE_ORDERED_DEF )
                            {
                            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2157:1: (lv_orderedDomain_23_0= RULE_ORDERED_DEF )
                            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2158:3: lv_orderedDomain_23_0= RULE_ORDERED_DEF
                            {
                            lv_orderedDomain_23_0=(Token)match(input,RULE_ORDERED_DEF,FollowSets000.FOLLOW_RULE_ORDERED_DEF_in_ruleProbabilityMassFunction4704); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_orderedDomain_23_0, grammarAccess.getProbabilityMassFunctionAccess().getOrderedDomainORDERED_DEFTerminalRuleCall_3_1_1_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getProbabilityMassFunctionRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"orderedDomain",
                                      		true, 
                                      		"ORDERED_DEF");
                              	    
                            }

                            }


                            }

                            this_RPAREN_24=(Token)match(input,RULE_RPAREN,FollowSets000.FOLLOW_RULE_RPAREN_in_ruleProbabilityMassFunction4720); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_RPAREN_24, grammarAccess.getProbabilityMassFunctionAccess().getRPARENTerminalRuleCall_3_1_2()); 
                                  
                            }

                            }
                            break;

                    }

                    this_SQUARE_PAREN_L_25=(Token)match(input,RULE_SQUARE_PAREN_L,FollowSets000.FOLLOW_RULE_SQUARE_PAREN_L_in_ruleProbabilityMassFunction4732); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SQUARE_PAREN_L_25, grammarAccess.getProbabilityMassFunctionAccess().getSQUARE_PAREN_LTerminalRuleCall_3_2()); 
                          
                    }
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2182:1: ( (lv_samples_26_0= ruleboolsample ) )+
                    int cnt31=0;
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==RULE_LPAREN) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2183:1: (lv_samples_26_0= ruleboolsample )
                    	    {
                    	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2183:1: (lv_samples_26_0= ruleboolsample )
                    	    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2184:3: lv_samples_26_0= ruleboolsample
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getProbabilityMassFunctionAccess().getSamplesBoolsampleParserRuleCall_3_3_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleboolsample_in_ruleProbabilityMassFunction4752);
                    	    lv_samples_26_0=ruleboolsample();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getProbabilityMassFunctionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"samples",
                    	              		lv_samples_26_0, 
                    	              		"boolsample");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt31 >= 1 ) break loop31;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(31, input);
                                throw eee;
                        }
                        cnt31++;
                    } while (true);

                    this_SQUARE_PAREN_R_27=(Token)match(input,RULE_SQUARE_PAREN_R,FollowSets000.FOLLOW_RULE_SQUARE_PAREN_R_in_ruleProbabilityMassFunction4764); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SQUARE_PAREN_R_27, grammarAccess.getProbabilityMassFunctionAccess().getSQUARE_PAREN_RTerminalRuleCall_3_4()); 
                          
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
    // $ANTLR end "ruleProbabilityMassFunction"


    // $ANTLR start "entryRulenumeric_int_sample"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2212:1: entryRulenumeric_int_sample returns [EObject current=null] : iv_rulenumeric_int_sample= rulenumeric_int_sample EOF ;
    public final EObject entryRulenumeric_int_sample() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenumeric_int_sample = null;


        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2213:2: (iv_rulenumeric_int_sample= rulenumeric_int_sample EOF )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2214:2: iv_rulenumeric_int_sample= rulenumeric_int_sample EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumeric_int_sampleRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulenumeric_int_sample_in_entryRulenumeric_int_sample4800);
            iv_rulenumeric_int_sample=rulenumeric_int_sample();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulenumeric_int_sample; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulenumeric_int_sample4810); if (state.failed) return current;

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
    // $ANTLR end "entryRulenumeric_int_sample"


    // $ANTLR start "rulenumeric_int_sample"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2221:1: rulenumeric_int_sample returns [EObject current=null] : (this_LPAREN_0= RULE_LPAREN ( (lv_value_1_0= ruleSIGNED_INT ) ) this_SEMI_2= RULE_SEMI ( (lv_probability_3_0= RULE_DOUBLE ) ) this_RPAREN_4= RULE_RPAREN ) ;
    public final EObject rulenumeric_int_sample() throws RecognitionException {
        EObject current = null;

        Token this_LPAREN_0=null;
        Token this_SEMI_2=null;
        Token lv_probability_3_0=null;
        Token this_RPAREN_4=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2224:28: ( (this_LPAREN_0= RULE_LPAREN ( (lv_value_1_0= ruleSIGNED_INT ) ) this_SEMI_2= RULE_SEMI ( (lv_probability_3_0= RULE_DOUBLE ) ) this_RPAREN_4= RULE_RPAREN ) )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2225:1: (this_LPAREN_0= RULE_LPAREN ( (lv_value_1_0= ruleSIGNED_INT ) ) this_SEMI_2= RULE_SEMI ( (lv_probability_3_0= RULE_DOUBLE ) ) this_RPAREN_4= RULE_RPAREN )
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2225:1: (this_LPAREN_0= RULE_LPAREN ( (lv_value_1_0= ruleSIGNED_INT ) ) this_SEMI_2= RULE_SEMI ( (lv_probability_3_0= RULE_DOUBLE ) ) this_RPAREN_4= RULE_RPAREN )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2225:2: this_LPAREN_0= RULE_LPAREN ( (lv_value_1_0= ruleSIGNED_INT ) ) this_SEMI_2= RULE_SEMI ( (lv_probability_3_0= RULE_DOUBLE ) ) this_RPAREN_4= RULE_RPAREN
            {
            this_LPAREN_0=(Token)match(input,RULE_LPAREN,FollowSets000.FOLLOW_RULE_LPAREN_in_rulenumeric_int_sample4846); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LPAREN_0, grammarAccess.getNumeric_int_sampleAccess().getLPARENTerminalRuleCall_0()); 
                  
            }
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2229:1: ( (lv_value_1_0= ruleSIGNED_INT ) )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2230:1: (lv_value_1_0= ruleSIGNED_INT )
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2230:1: (lv_value_1_0= ruleSIGNED_INT )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2231:3: lv_value_1_0= ruleSIGNED_INT
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumeric_int_sampleAccess().getValueSIGNED_INTParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleSIGNED_INT_in_rulenumeric_int_sample4866);
            lv_value_1_0=ruleSIGNED_INT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNumeric_int_sampleRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"SIGNED_INT");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_SEMI_2=(Token)match(input,RULE_SEMI,FollowSets000.FOLLOW_RULE_SEMI_in_rulenumeric_int_sample4877); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_SEMI_2, grammarAccess.getNumeric_int_sampleAccess().getSEMITerminalRuleCall_2()); 
                  
            }
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2251:1: ( (lv_probability_3_0= RULE_DOUBLE ) )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2252:1: (lv_probability_3_0= RULE_DOUBLE )
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2252:1: (lv_probability_3_0= RULE_DOUBLE )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2253:3: lv_probability_3_0= RULE_DOUBLE
            {
            lv_probability_3_0=(Token)match(input,RULE_DOUBLE,FollowSets000.FOLLOW_RULE_DOUBLE_in_rulenumeric_int_sample4893); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_probability_3_0, grammarAccess.getNumeric_int_sampleAccess().getProbabilityDOUBLETerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getNumeric_int_sampleRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"probability",
                      		lv_probability_3_0, 
                      		"DOUBLE");
              	    
            }

            }


            }

            this_RPAREN_4=(Token)match(input,RULE_RPAREN,FollowSets000.FOLLOW_RULE_RPAREN_in_rulenumeric_int_sample4909); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RPAREN_4, grammarAccess.getNumeric_int_sampleAccess().getRPARENTerminalRuleCall_4()); 
                  
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
    // $ANTLR end "rulenumeric_int_sample"


    // $ANTLR start "entryRulenumeric_real_sample"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2281:1: entryRulenumeric_real_sample returns [EObject current=null] : iv_rulenumeric_real_sample= rulenumeric_real_sample EOF ;
    public final EObject entryRulenumeric_real_sample() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenumeric_real_sample = null;


        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2282:2: (iv_rulenumeric_real_sample= rulenumeric_real_sample EOF )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2283:2: iv_rulenumeric_real_sample= rulenumeric_real_sample EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumeric_real_sampleRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulenumeric_real_sample_in_entryRulenumeric_real_sample4944);
            iv_rulenumeric_real_sample=rulenumeric_real_sample();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulenumeric_real_sample; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulenumeric_real_sample4954); if (state.failed) return current;

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
    // $ANTLR end "entryRulenumeric_real_sample"


    // $ANTLR start "rulenumeric_real_sample"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2290:1: rulenumeric_real_sample returns [EObject current=null] : (this_LPAREN_0= RULE_LPAREN ( (lv_value_1_0= ruleSIGNED_NUMBER ) ) this_SEMI_2= RULE_SEMI ( (lv_probability_3_0= RULE_DOUBLE ) ) this_RPAREN_4= RULE_RPAREN ) ;
    public final EObject rulenumeric_real_sample() throws RecognitionException {
        EObject current = null;

        Token this_LPAREN_0=null;
        Token this_SEMI_2=null;
        Token lv_probability_3_0=null;
        Token this_RPAREN_4=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2293:28: ( (this_LPAREN_0= RULE_LPAREN ( (lv_value_1_0= ruleSIGNED_NUMBER ) ) this_SEMI_2= RULE_SEMI ( (lv_probability_3_0= RULE_DOUBLE ) ) this_RPAREN_4= RULE_RPAREN ) )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2294:1: (this_LPAREN_0= RULE_LPAREN ( (lv_value_1_0= ruleSIGNED_NUMBER ) ) this_SEMI_2= RULE_SEMI ( (lv_probability_3_0= RULE_DOUBLE ) ) this_RPAREN_4= RULE_RPAREN )
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2294:1: (this_LPAREN_0= RULE_LPAREN ( (lv_value_1_0= ruleSIGNED_NUMBER ) ) this_SEMI_2= RULE_SEMI ( (lv_probability_3_0= RULE_DOUBLE ) ) this_RPAREN_4= RULE_RPAREN )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2294:2: this_LPAREN_0= RULE_LPAREN ( (lv_value_1_0= ruleSIGNED_NUMBER ) ) this_SEMI_2= RULE_SEMI ( (lv_probability_3_0= RULE_DOUBLE ) ) this_RPAREN_4= RULE_RPAREN
            {
            this_LPAREN_0=(Token)match(input,RULE_LPAREN,FollowSets000.FOLLOW_RULE_LPAREN_in_rulenumeric_real_sample4990); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LPAREN_0, grammarAccess.getNumeric_real_sampleAccess().getLPARENTerminalRuleCall_0()); 
                  
            }
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2298:1: ( (lv_value_1_0= ruleSIGNED_NUMBER ) )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2299:1: (lv_value_1_0= ruleSIGNED_NUMBER )
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2299:1: (lv_value_1_0= ruleSIGNED_NUMBER )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2300:3: lv_value_1_0= ruleSIGNED_NUMBER
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumeric_real_sampleAccess().getValueSIGNED_NUMBERParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleSIGNED_NUMBER_in_rulenumeric_real_sample5010);
            lv_value_1_0=ruleSIGNED_NUMBER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNumeric_real_sampleRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"SIGNED_NUMBER");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_SEMI_2=(Token)match(input,RULE_SEMI,FollowSets000.FOLLOW_RULE_SEMI_in_rulenumeric_real_sample5021); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_SEMI_2, grammarAccess.getNumeric_real_sampleAccess().getSEMITerminalRuleCall_2()); 
                  
            }
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2320:1: ( (lv_probability_3_0= RULE_DOUBLE ) )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2321:1: (lv_probability_3_0= RULE_DOUBLE )
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2321:1: (lv_probability_3_0= RULE_DOUBLE )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2322:3: lv_probability_3_0= RULE_DOUBLE
            {
            lv_probability_3_0=(Token)match(input,RULE_DOUBLE,FollowSets000.FOLLOW_RULE_DOUBLE_in_rulenumeric_real_sample5037); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_probability_3_0, grammarAccess.getNumeric_real_sampleAccess().getProbabilityDOUBLETerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getNumeric_real_sampleRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"probability",
                      		lv_probability_3_0, 
                      		"DOUBLE");
              	    
            }

            }


            }

            this_RPAREN_4=(Token)match(input,RULE_RPAREN,FollowSets000.FOLLOW_RULE_RPAREN_in_rulenumeric_real_sample5053); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RPAREN_4, grammarAccess.getNumeric_real_sampleAccess().getRPARENTerminalRuleCall_4()); 
                  
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
    // $ANTLR end "rulenumeric_real_sample"


    // $ANTLR start "entryRulereal_pdf_sample"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2350:1: entryRulereal_pdf_sample returns [EObject current=null] : iv_rulereal_pdf_sample= rulereal_pdf_sample EOF ;
    public final EObject entryRulereal_pdf_sample() throws RecognitionException {
        EObject current = null;

        EObject iv_rulereal_pdf_sample = null;


        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2351:2: (iv_rulereal_pdf_sample= rulereal_pdf_sample EOF )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2352:2: iv_rulereal_pdf_sample= rulereal_pdf_sample EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReal_pdf_sampleRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulereal_pdf_sample_in_entryRulereal_pdf_sample5088);
            iv_rulereal_pdf_sample=rulereal_pdf_sample();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulereal_pdf_sample; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulereal_pdf_sample5098); if (state.failed) return current;

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
    // $ANTLR end "entryRulereal_pdf_sample"


    // $ANTLR start "rulereal_pdf_sample"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2359:1: rulereal_pdf_sample returns [EObject current=null] : (this_LPAREN_0= RULE_LPAREN ( (lv_value_1_0= ruleSIGNED_NUMBER ) ) this_SEMI_2= RULE_SEMI ( (lv_probability_3_0= RULE_DOUBLE ) ) this_RPAREN_4= RULE_RPAREN ) ;
    public final EObject rulereal_pdf_sample() throws RecognitionException {
        EObject current = null;

        Token this_LPAREN_0=null;
        Token this_SEMI_2=null;
        Token lv_probability_3_0=null;
        Token this_RPAREN_4=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2362:28: ( (this_LPAREN_0= RULE_LPAREN ( (lv_value_1_0= ruleSIGNED_NUMBER ) ) this_SEMI_2= RULE_SEMI ( (lv_probability_3_0= RULE_DOUBLE ) ) this_RPAREN_4= RULE_RPAREN ) )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2363:1: (this_LPAREN_0= RULE_LPAREN ( (lv_value_1_0= ruleSIGNED_NUMBER ) ) this_SEMI_2= RULE_SEMI ( (lv_probability_3_0= RULE_DOUBLE ) ) this_RPAREN_4= RULE_RPAREN )
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2363:1: (this_LPAREN_0= RULE_LPAREN ( (lv_value_1_0= ruleSIGNED_NUMBER ) ) this_SEMI_2= RULE_SEMI ( (lv_probability_3_0= RULE_DOUBLE ) ) this_RPAREN_4= RULE_RPAREN )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2363:2: this_LPAREN_0= RULE_LPAREN ( (lv_value_1_0= ruleSIGNED_NUMBER ) ) this_SEMI_2= RULE_SEMI ( (lv_probability_3_0= RULE_DOUBLE ) ) this_RPAREN_4= RULE_RPAREN
            {
            this_LPAREN_0=(Token)match(input,RULE_LPAREN,FollowSets000.FOLLOW_RULE_LPAREN_in_rulereal_pdf_sample5134); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LPAREN_0, grammarAccess.getReal_pdf_sampleAccess().getLPARENTerminalRuleCall_0()); 
                  
            }
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2367:1: ( (lv_value_1_0= ruleSIGNED_NUMBER ) )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2368:1: (lv_value_1_0= ruleSIGNED_NUMBER )
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2368:1: (lv_value_1_0= ruleSIGNED_NUMBER )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2369:3: lv_value_1_0= ruleSIGNED_NUMBER
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReal_pdf_sampleAccess().getValueSIGNED_NUMBERParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleSIGNED_NUMBER_in_rulereal_pdf_sample5154);
            lv_value_1_0=ruleSIGNED_NUMBER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getReal_pdf_sampleRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"SIGNED_NUMBER");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_SEMI_2=(Token)match(input,RULE_SEMI,FollowSets000.FOLLOW_RULE_SEMI_in_rulereal_pdf_sample5165); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_SEMI_2, grammarAccess.getReal_pdf_sampleAccess().getSEMITerminalRuleCall_2()); 
                  
            }
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2389:1: ( (lv_probability_3_0= RULE_DOUBLE ) )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2390:1: (lv_probability_3_0= RULE_DOUBLE )
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2390:1: (lv_probability_3_0= RULE_DOUBLE )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2391:3: lv_probability_3_0= RULE_DOUBLE
            {
            lv_probability_3_0=(Token)match(input,RULE_DOUBLE,FollowSets000.FOLLOW_RULE_DOUBLE_in_rulereal_pdf_sample5181); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_probability_3_0, grammarAccess.getReal_pdf_sampleAccess().getProbabilityDOUBLETerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getReal_pdf_sampleRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"probability",
                      		lv_probability_3_0, 
                      		"DOUBLE");
              	    
            }

            }


            }

            this_RPAREN_4=(Token)match(input,RULE_RPAREN,FollowSets000.FOLLOW_RULE_RPAREN_in_rulereal_pdf_sample5197); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RPAREN_4, grammarAccess.getReal_pdf_sampleAccess().getRPARENTerminalRuleCall_4()); 
                  
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
    // $ANTLR end "rulereal_pdf_sample"


    // $ANTLR start "entryRulestringsample"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2419:1: entryRulestringsample returns [EObject current=null] : iv_rulestringsample= rulestringsample EOF ;
    public final EObject entryRulestringsample() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestringsample = null;


        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2420:2: (iv_rulestringsample= rulestringsample EOF )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2421:2: iv_rulestringsample= rulestringsample EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringsampleRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulestringsample_in_entryRulestringsample5232);
            iv_rulestringsample=rulestringsample();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulestringsample; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulestringsample5242); if (state.failed) return current;

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
    // $ANTLR end "entryRulestringsample"


    // $ANTLR start "rulestringsample"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2428:1: rulestringsample returns [EObject current=null] : (this_LPAREN_0= RULE_LPAREN ( (lv_value_1_0= RULE_STRING ) ) this_SEMI_2= RULE_SEMI ( (lv_probability_3_0= RULE_DOUBLE ) ) this_RPAREN_4= RULE_RPAREN ) ;
    public final EObject rulestringsample() throws RecognitionException {
        EObject current = null;

        Token this_LPAREN_0=null;
        Token lv_value_1_0=null;
        Token this_SEMI_2=null;
        Token lv_probability_3_0=null;
        Token this_RPAREN_4=null;

         enterRule(); 
            
        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2431:28: ( (this_LPAREN_0= RULE_LPAREN ( (lv_value_1_0= RULE_STRING ) ) this_SEMI_2= RULE_SEMI ( (lv_probability_3_0= RULE_DOUBLE ) ) this_RPAREN_4= RULE_RPAREN ) )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2432:1: (this_LPAREN_0= RULE_LPAREN ( (lv_value_1_0= RULE_STRING ) ) this_SEMI_2= RULE_SEMI ( (lv_probability_3_0= RULE_DOUBLE ) ) this_RPAREN_4= RULE_RPAREN )
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2432:1: (this_LPAREN_0= RULE_LPAREN ( (lv_value_1_0= RULE_STRING ) ) this_SEMI_2= RULE_SEMI ( (lv_probability_3_0= RULE_DOUBLE ) ) this_RPAREN_4= RULE_RPAREN )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2432:2: this_LPAREN_0= RULE_LPAREN ( (lv_value_1_0= RULE_STRING ) ) this_SEMI_2= RULE_SEMI ( (lv_probability_3_0= RULE_DOUBLE ) ) this_RPAREN_4= RULE_RPAREN
            {
            this_LPAREN_0=(Token)match(input,RULE_LPAREN,FollowSets000.FOLLOW_RULE_LPAREN_in_rulestringsample5278); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LPAREN_0, grammarAccess.getStringsampleAccess().getLPARENTerminalRuleCall_0()); 
                  
            }
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2436:1: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2437:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2437:1: (lv_value_1_0= RULE_STRING )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2438:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rulestringsample5294); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getStringsampleAccess().getValueSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStringsampleRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"STRING");
              	    
            }

            }


            }

            this_SEMI_2=(Token)match(input,RULE_SEMI,FollowSets000.FOLLOW_RULE_SEMI_in_rulestringsample5310); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_SEMI_2, grammarAccess.getStringsampleAccess().getSEMITerminalRuleCall_2()); 
                  
            }
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2458:1: ( (lv_probability_3_0= RULE_DOUBLE ) )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2459:1: (lv_probability_3_0= RULE_DOUBLE )
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2459:1: (lv_probability_3_0= RULE_DOUBLE )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2460:3: lv_probability_3_0= RULE_DOUBLE
            {
            lv_probability_3_0=(Token)match(input,RULE_DOUBLE,FollowSets000.FOLLOW_RULE_DOUBLE_in_rulestringsample5326); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_probability_3_0, grammarAccess.getStringsampleAccess().getProbabilityDOUBLETerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStringsampleRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"probability",
                      		lv_probability_3_0, 
                      		"DOUBLE");
              	    
            }

            }


            }

            this_RPAREN_4=(Token)match(input,RULE_RPAREN,FollowSets000.FOLLOW_RULE_RPAREN_in_rulestringsample5342); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RPAREN_4, grammarAccess.getStringsampleAccess().getRPARENTerminalRuleCall_4()); 
                  
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
    // $ANTLR end "rulestringsample"


    // $ANTLR start "entryRuleboolsample"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2488:1: entryRuleboolsample returns [EObject current=null] : iv_ruleboolsample= ruleboolsample EOF ;
    public final EObject entryRuleboolsample() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleboolsample = null;


        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2489:2: (iv_ruleboolsample= ruleboolsample EOF )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2490:2: iv_ruleboolsample= ruleboolsample EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolsampleRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleboolsample_in_entryRuleboolsample5377);
            iv_ruleboolsample=ruleboolsample();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleboolsample; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleboolsample5387); if (state.failed) return current;

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
    // $ANTLR end "entryRuleboolsample"


    // $ANTLR start "ruleboolsample"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2497:1: ruleboolsample returns [EObject current=null] : (this_LPAREN_0= RULE_LPAREN ( (lv_value_1_0= RULE_BOOLEAN_KEYWORDS ) ) this_SEMI_2= RULE_SEMI ( (lv_probability_3_0= RULE_DOUBLE ) ) this_RPAREN_4= RULE_RPAREN ) ;
    public final EObject ruleboolsample() throws RecognitionException {
        EObject current = null;

        Token this_LPAREN_0=null;
        Token lv_value_1_0=null;
        Token this_SEMI_2=null;
        Token lv_probability_3_0=null;
        Token this_RPAREN_4=null;

         enterRule(); 
            
        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2500:28: ( (this_LPAREN_0= RULE_LPAREN ( (lv_value_1_0= RULE_BOOLEAN_KEYWORDS ) ) this_SEMI_2= RULE_SEMI ( (lv_probability_3_0= RULE_DOUBLE ) ) this_RPAREN_4= RULE_RPAREN ) )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2501:1: (this_LPAREN_0= RULE_LPAREN ( (lv_value_1_0= RULE_BOOLEAN_KEYWORDS ) ) this_SEMI_2= RULE_SEMI ( (lv_probability_3_0= RULE_DOUBLE ) ) this_RPAREN_4= RULE_RPAREN )
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2501:1: (this_LPAREN_0= RULE_LPAREN ( (lv_value_1_0= RULE_BOOLEAN_KEYWORDS ) ) this_SEMI_2= RULE_SEMI ( (lv_probability_3_0= RULE_DOUBLE ) ) this_RPAREN_4= RULE_RPAREN )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2501:2: this_LPAREN_0= RULE_LPAREN ( (lv_value_1_0= RULE_BOOLEAN_KEYWORDS ) ) this_SEMI_2= RULE_SEMI ( (lv_probability_3_0= RULE_DOUBLE ) ) this_RPAREN_4= RULE_RPAREN
            {
            this_LPAREN_0=(Token)match(input,RULE_LPAREN,FollowSets000.FOLLOW_RULE_LPAREN_in_ruleboolsample5423); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LPAREN_0, grammarAccess.getBoolsampleAccess().getLPARENTerminalRuleCall_0()); 
                  
            }
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2505:1: ( (lv_value_1_0= RULE_BOOLEAN_KEYWORDS ) )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2506:1: (lv_value_1_0= RULE_BOOLEAN_KEYWORDS )
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2506:1: (lv_value_1_0= RULE_BOOLEAN_KEYWORDS )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2507:3: lv_value_1_0= RULE_BOOLEAN_KEYWORDS
            {
            lv_value_1_0=(Token)match(input,RULE_BOOLEAN_KEYWORDS,FollowSets000.FOLLOW_RULE_BOOLEAN_KEYWORDS_in_ruleboolsample5439); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getBoolsampleAccess().getValueBOOLEAN_KEYWORDSTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getBoolsampleRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"BOOLEAN_KEYWORDS");
              	    
            }

            }


            }

            this_SEMI_2=(Token)match(input,RULE_SEMI,FollowSets000.FOLLOW_RULE_SEMI_in_ruleboolsample5455); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_SEMI_2, grammarAccess.getBoolsampleAccess().getSEMITerminalRuleCall_2()); 
                  
            }
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2527:1: ( (lv_probability_3_0= RULE_DOUBLE ) )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2528:1: (lv_probability_3_0= RULE_DOUBLE )
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2528:1: (lv_probability_3_0= RULE_DOUBLE )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2529:3: lv_probability_3_0= RULE_DOUBLE
            {
            lv_probability_3_0=(Token)match(input,RULE_DOUBLE,FollowSets000.FOLLOW_RULE_DOUBLE_in_ruleboolsample5471); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_probability_3_0, grammarAccess.getBoolsampleAccess().getProbabilityDOUBLETerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getBoolsampleRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"probability",
                      		lv_probability_3_0, 
                      		"DOUBLE");
              	    
            }

            }


            }

            this_RPAREN_4=(Token)match(input,RULE_RPAREN,FollowSets000.FOLLOW_RULE_RPAREN_in_ruleboolsample5487); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RPAREN_4, grammarAccess.getBoolsampleAccess().getRPARENTerminalRuleCall_4()); 
                  
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
    // $ANTLR end "ruleboolsample"


    // $ANTLR start "entryRuleSIGNED_NUMBER"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2557:1: entryRuleSIGNED_NUMBER returns [String current=null] : iv_ruleSIGNED_NUMBER= ruleSIGNED_NUMBER EOF ;
    public final String entryRuleSIGNED_NUMBER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSIGNED_NUMBER = null;


        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2558:2: (iv_ruleSIGNED_NUMBER= ruleSIGNED_NUMBER EOF )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2559:2: iv_ruleSIGNED_NUMBER= ruleSIGNED_NUMBER EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSIGNED_NUMBERRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSIGNED_NUMBER_in_entryRuleSIGNED_NUMBER5523);
            iv_ruleSIGNED_NUMBER=ruleSIGNED_NUMBER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSIGNED_NUMBER.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSIGNED_NUMBER5534); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSIGNED_NUMBER"


    // $ANTLR start "ruleSIGNED_NUMBER"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2566:1: ruleSIGNED_NUMBER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_DOUBLE_1= RULE_DOUBLE ) ;
    public final AntlrDatatypeRuleToken ruleSIGNED_NUMBER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_DOUBLE_1=null;

         enterRule(); 
            
        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2569:28: ( ( (kw= '-' )? this_DOUBLE_1= RULE_DOUBLE ) )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2570:1: ( (kw= '-' )? this_DOUBLE_1= RULE_DOUBLE )
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2570:1: ( (kw= '-' )? this_DOUBLE_1= RULE_DOUBLE )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2570:2: (kw= '-' )? this_DOUBLE_1= RULE_DOUBLE
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2570:2: (kw= '-' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==31) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2571:2: kw= '-'
                    {
                    kw=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleSIGNED_NUMBER5573); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSIGNED_NUMBERAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_DOUBLE_1=(Token)match(input,RULE_DOUBLE,FollowSets000.FOLLOW_RULE_DOUBLE_in_ruleSIGNED_NUMBER5590); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_DOUBLE_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_DOUBLE_1, grammarAccess.getSIGNED_NUMBERAccess().getDOUBLETerminalRuleCall_1()); 
                  
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
    // $ANTLR end "ruleSIGNED_NUMBER"


    // $ANTLR start "entryRuleSIGNED_INT"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2591:1: entryRuleSIGNED_INT returns [String current=null] : iv_ruleSIGNED_INT= ruleSIGNED_INT EOF ;
    public final String entryRuleSIGNED_INT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSIGNED_INT = null;


        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2592:2: (iv_ruleSIGNED_INT= ruleSIGNED_INT EOF )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2593:2: iv_ruleSIGNED_INT= ruleSIGNED_INT EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSIGNED_INTRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSIGNED_INT_in_entryRuleSIGNED_INT5636);
            iv_ruleSIGNED_INT=ruleSIGNED_INT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSIGNED_INT.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSIGNED_INT5647); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSIGNED_INT"


    // $ANTLR start "ruleSIGNED_INT"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2600:1: ruleSIGNED_INT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_DECINT_1= RULE_DECINT ) ;
    public final AntlrDatatypeRuleToken ruleSIGNED_INT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_DECINT_1=null;

         enterRule(); 
            
        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2603:28: ( ( (kw= '-' )? this_DECINT_1= RULE_DECINT ) )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2604:1: ( (kw= '-' )? this_DECINT_1= RULE_DECINT )
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2604:1: ( (kw= '-' )? this_DECINT_1= RULE_DECINT )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2604:2: (kw= '-' )? this_DECINT_1= RULE_DECINT
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2604:2: (kw= '-' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==31) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2605:2: kw= '-'
                    {
                    kw=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleSIGNED_INT5686); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSIGNED_INTAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_DECINT_1=(Token)match(input,RULE_DECINT,FollowSets000.FOLLOW_RULE_DECINT_in_ruleSIGNED_INT5703); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_DECINT_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_DECINT_1, grammarAccess.getSIGNED_INTAccess().getDECINTTerminalRuleCall_1()); 
                  
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
    // $ANTLR end "ruleSIGNED_INT"


    // $ANTLR start "ruleBooleanOperations"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2625:1: ruleBooleanOperations returns [Enumerator current=null] : ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) | (enumLiteral_2= 'XOR' ) ) ;
    public final Enumerator ruleBooleanOperations() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2627:28: ( ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) | (enumLiteral_2= 'XOR' ) ) )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2628:1: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) | (enumLiteral_2= 'XOR' ) )
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2628:1: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) | (enumLiteral_2= 'XOR' ) )
            int alt35=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt35=1;
                }
                break;
            case 35:
                {
                alt35=2;
                }
                break;
            case 36:
                {
                alt35=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2628:2: (enumLiteral_0= 'AND' )
                    {
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2628:2: (enumLiteral_0= 'AND' )
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2628:4: enumLiteral_0= 'AND'
                    {
                    enumLiteral_0=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleBooleanOperations5762); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBooleanOperationsAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getBooleanOperationsAccess().getANDEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2634:6: (enumLiteral_1= 'OR' )
                    {
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2634:6: (enumLiteral_1= 'OR' )
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2634:8: enumLiteral_1= 'OR'
                    {
                    enumLiteral_1=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleBooleanOperations5779); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBooleanOperationsAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getBooleanOperationsAccess().getOREnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2640:6: (enumLiteral_2= 'XOR' )
                    {
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2640:6: (enumLiteral_2= 'XOR' )
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2640:8: enumLiteral_2= 'XOR'
                    {
                    enumLiteral_2=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleBooleanOperations5796); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBooleanOperationsAccess().getXOREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getBooleanOperationsAccess().getXOREnumLiteralDeclaration_2()); 
                          
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
    // $ANTLR end "ruleBooleanOperations"


    // $ANTLR start "ruleandoperation"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2650:1: ruleandoperation returns [Enumerator current=null] : (enumLiteral_0= 'AND' ) ;
    public final Enumerator ruleandoperation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2652:28: ( (enumLiteral_0= 'AND' ) )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2653:1: (enumLiteral_0= 'AND' )
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2653:1: (enumLiteral_0= 'AND' )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2653:3: enumLiteral_0= 'AND'
            {
            enumLiteral_0=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleandoperation5840); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getAndoperationAccess().getANDEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getAndoperationAccess().getANDEnumLiteralDeclaration()); 
                  
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
    // $ANTLR end "ruleandoperation"


    // $ANTLR start "ruleoroperations"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2663:1: ruleoroperations returns [Enumerator current=null] : ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'XOR' ) ) ;
    public final Enumerator ruleoroperations() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2665:28: ( ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'XOR' ) ) )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2666:1: ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'XOR' ) )
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2666:1: ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'XOR' ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==35) ) {
                alt36=1;
            }
            else if ( (LA36_0==36) ) {
                alt36=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2666:2: (enumLiteral_0= 'OR' )
                    {
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2666:2: (enumLiteral_0= 'OR' )
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2666:4: enumLiteral_0= 'OR'
                    {
                    enumLiteral_0=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleoroperations5884); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOroperationsAccess().getOREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getOroperationsAccess().getOREnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2672:6: (enumLiteral_1= 'XOR' )
                    {
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2672:6: (enumLiteral_1= 'XOR' )
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2672:8: enumLiteral_1= 'XOR'
                    {
                    enumLiteral_1=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleoroperations5901); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOroperationsAccess().getXOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getOroperationsAccess().getXOREnumLiteralDeclaration_1()); 
                          
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
    // $ANTLR end "ruleoroperations"


    // $ANTLR start "ruleCompareOperations"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2682:1: ruleCompareOperations returns [Enumerator current=null] : ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '<>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) ) ;
    public final Enumerator ruleCompareOperations() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2684:28: ( ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '<>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) ) )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2685:1: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '<>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) )
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2685:1: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '<>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) )
            int alt37=6;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt37=1;
                }
                break;
            case 38:
                {
                alt37=2;
                }
                break;
            case 39:
                {
                alt37=3;
                }
                break;
            case 40:
                {
                alt37=4;
                }
                break;
            case 41:
                {
                alt37=5;
                }
                break;
            case 42:
                {
                alt37=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2685:2: (enumLiteral_0= '>' )
                    {
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2685:2: (enumLiteral_0= '>' )
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2685:4: enumLiteral_0= '>'
                    {
                    enumLiteral_0=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleCompareOperations5946); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperationsAccess().getGREATEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCompareOperationsAccess().getGREATEREnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2691:6: (enumLiteral_1= '<' )
                    {
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2691:6: (enumLiteral_1= '<' )
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2691:8: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleCompareOperations5963); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperationsAccess().getLESSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCompareOperationsAccess().getLESSEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2697:6: (enumLiteral_2= '==' )
                    {
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2697:6: (enumLiteral_2= '==' )
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2697:8: enumLiteral_2= '=='
                    {
                    enumLiteral_2=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleCompareOperations5980); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperationsAccess().getEQUALSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCompareOperationsAccess().getEQUALSEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2703:6: (enumLiteral_3= '<>' )
                    {
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2703:6: (enumLiteral_3= '<>' )
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2703:8: enumLiteral_3= '<>'
                    {
                    enumLiteral_3=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleCompareOperations5997); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperationsAccess().getNOTEQUALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getCompareOperationsAccess().getNOTEQUALEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2709:6: (enumLiteral_4= '>=' )
                    {
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2709:6: (enumLiteral_4= '>=' )
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2709:8: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleCompareOperations6014); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperationsAccess().getGREATEREQUALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getCompareOperationsAccess().getGREATEREQUALEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2715:6: (enumLiteral_5= '<=' )
                    {
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2715:6: (enumLiteral_5= '<=' )
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2715:8: enumLiteral_5= '<='
                    {
                    enumLiteral_5=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleCompareOperations6031); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperationsAccess().getLESSEQUALEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getCompareOperationsAccess().getLESSEQUALEnumLiteralDeclaration_5()); 
                          
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
    // $ANTLR end "ruleCompareOperations"


    // $ANTLR start "ruleTermOperations"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2725:1: ruleTermOperations returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleTermOperations() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2727:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2728:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2728:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==43) ) {
                alt38=1;
            }
            else if ( (LA38_0==31) ) {
                alt38=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2728:2: (enumLiteral_0= '+' )
                    {
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2728:2: (enumLiteral_0= '+' )
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2728:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleTermOperations6076); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTermOperationsAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTermOperationsAccess().getADDEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2734:6: (enumLiteral_1= '-' )
                    {
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2734:6: (enumLiteral_1= '-' )
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2734:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleTermOperations6093); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTermOperationsAccess().getSUBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getTermOperationsAccess().getSUBEnumLiteralDeclaration_1()); 
                          
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
    // $ANTLR end "ruleTermOperations"


    // $ANTLR start "ruleProductOperations"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2744:1: ruleProductOperations returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) ;
    public final Enumerator ruleProductOperations() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2746:28: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2747:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2747:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            int alt39=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt39=1;
                }
                break;
            case 32:
                {
                alt39=2;
                }
                break;
            case 44:
                {
                alt39=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2747:2: (enumLiteral_0= '*' )
                    {
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2747:2: (enumLiteral_0= '*' )
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2747:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleProductOperations6138); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getProductOperationsAccess().getMULTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getProductOperationsAccess().getMULTEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2753:6: (enumLiteral_1= '/' )
                    {
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2753:6: (enumLiteral_1= '/' )
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2753:8: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleProductOperations6155); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getProductOperationsAccess().getDIVEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getProductOperationsAccess().getDIVEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2759:6: (enumLiteral_2= '%' )
                    {
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2759:6: (enumLiteral_2= '%' )
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2759:8: enumLiteral_2= '%'
                    {
                    enumLiteral_2=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleProductOperations6172); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getProductOperationsAccess().getMODEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getProductOperationsAccess().getMODEnumLiteralDeclaration_2()); 
                          
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
    // $ANTLR end "ruleProductOperations"


    // $ANTLR start "ruleUnitNames"
    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2769:1: ruleUnitNames returns [Enumerator current=null] : ( (enumLiteral_0= '_' ) | (enumLiteral_1= 'unitless' ) | (enumLiteral_2= 'B' ) | (enumLiteral_3= 's' ) | (enumLiteral_4= 'm' ) ) ;
    public final Enumerator ruleUnitNames() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2771:28: ( ( (enumLiteral_0= '_' ) | (enumLiteral_1= 'unitless' ) | (enumLiteral_2= 'B' ) | (enumLiteral_3= 's' ) | (enumLiteral_4= 'm' ) ) )
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2772:1: ( (enumLiteral_0= '_' ) | (enumLiteral_1= 'unitless' ) | (enumLiteral_2= 'B' ) | (enumLiteral_3= 's' ) | (enumLiteral_4= 'm' ) )
            {
            // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2772:1: ( (enumLiteral_0= '_' ) | (enumLiteral_1= 'unitless' ) | (enumLiteral_2= 'B' ) | (enumLiteral_3= 's' ) | (enumLiteral_4= 'm' ) )
            int alt40=5;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt40=1;
                }
                break;
            case 46:
                {
                alt40=2;
                }
                break;
            case 47:
                {
                alt40=3;
                }
                break;
            case 48:
                {
                alt40=4;
                }
                break;
            case 49:
                {
                alt40=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2772:2: (enumLiteral_0= '_' )
                    {
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2772:2: (enumLiteral_0= '_' )
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2772:4: enumLiteral_0= '_'
                    {
                    enumLiteral_0=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleUnitNames6217); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnitNamesAccess().getUNITLESSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getUnitNamesAccess().getUNITLESSEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2778:6: (enumLiteral_1= 'unitless' )
                    {
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2778:6: (enumLiteral_1= 'unitless' )
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2778:8: enumLiteral_1= 'unitless'
                    {
                    enumLiteral_1=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleUnitNames6234); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnitNamesAccess().getUNITLESSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getUnitNamesAccess().getUNITLESSEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2784:6: (enumLiteral_2= 'B' )
                    {
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2784:6: (enumLiteral_2= 'B' )
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2784:8: enumLiteral_2= 'B'
                    {
                    enumLiteral_2=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleUnitNames6251); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnitNamesAccess().getBYTEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getUnitNamesAccess().getBYTEEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2790:6: (enumLiteral_3= 's' )
                    {
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2790:6: (enumLiteral_3= 's' )
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2790:8: enumLiteral_3= 's'
                    {
                    enumLiteral_3=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleUnitNames6268); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnitNamesAccess().getSECONDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getUnitNamesAccess().getSECONDEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2796:6: (enumLiteral_4= 'm' )
                    {
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2796:6: (enumLiteral_4= 'm' )
                    // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:2796:8: enumLiteral_4= 'm'
                    {
                    enumLiteral_4=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleUnitNames6285); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnitNamesAccess().getMETEREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getUnitNamesAccess().getMETEREnumLiteralDeclaration_4()); 
                          
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
    // $ANTLR end "ruleUnitNames"

    // $ANTLR start synpred22_InternalStoEx
    public final void synpred22_InternalStoEx_fragment() throws RecognitionException {   
        EObject this_unitMulti_0 = null;


        // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1498:2: (this_unitMulti_0= ruleunitMulti )
        // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1498:2: this_unitMulti_0= ruleunitMulti
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleunitMulti_in_synpred22_InternalStoEx3234);
        this_unitMulti_0=ruleunitMulti();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalStoEx

    // $ANTLR start synpred23_InternalStoEx
    public final void synpred23_InternalStoEx_fragment() throws RecognitionException {   
        EObject this_unitDiv_1 = null;


        // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1511:2: (this_unitDiv_1= ruleunitDiv )
        // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1511:2: this_unitDiv_1= ruleunitDiv
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleunitDiv_in_synpred23_InternalStoEx3264);
        this_unitDiv_1=ruleunitDiv();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred23_InternalStoEx

    // $ANTLR start synpred25_InternalStoEx
    public final void synpred25_InternalStoEx_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        EObject lv_units_3_0 = null;


        // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1632:2: ( () otherlv_2= '*' ( (lv_units_3_0= ruleUnit ) ) )
        // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1632:2: () otherlv_2= '*' ( (lv_units_3_0= ruleUnit ) )
        {
        // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1632:2: ()
        // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1633:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        otherlv_2=(Token)match(input,33,FollowSets000.FOLLOW_33_in_synpred25_InternalStoEx3556); if (state.failed) return ;
        // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1645:1: ( (lv_units_3_0= ruleUnit ) )
        // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1646:1: (lv_units_3_0= ruleUnit )
        {
        // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1646:1: (lv_units_3_0= ruleUnit )
        // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1647:3: lv_units_3_0= ruleUnit
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getUnitMultiAccess().getUnitsUnitParserRuleCall_1_2_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleUnit_in_synpred25_InternalStoEx3577);
        lv_units_3_0=ruleUnit();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred25_InternalStoEx

    // $ANTLR start synpred27_InternalStoEx
    public final void synpred27_InternalStoEx_fragment() throws RecognitionException {   
        EObject this_unitMulti_2 = null;


        // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1702:2: (this_unitMulti_2= ruleunitMulti )
        // ../org.palladiosimulator.commons.stoex/src-gen/org/palladiosimulator/commons/stoex/parser/antlr/internal/InternalStoEx.g:1702:2: this_unitMulti_2= ruleunitMulti
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleunitMulti_in_synpred27_InternalStoEx3718);
        this_unitMulti_2=ruleunitMulti();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred27_InternalStoEx

    // Delegated rules

    public final boolean synpred27_InternalStoEx() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalStoEx_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalStoEx() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalStoEx_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalStoEx() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalStoEx_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalStoEx() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalStoEx_fragment(); // can never throw exception
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
    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA9_eotS =
        "\12\uffff";
    static final String DFA9_eofS =
        "\5\uffff\1\11\4\uffff";
    static final String DFA9_minS =
        "\1\10\4\uffff\1\4\4\uffff";
    static final String DFA9_maxS =
        "\1\30\4\uffff\1\54\4\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\7\1\10\1\5\1\6";
    static final String DFA9_specialS =
        "\12\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\2\2\uffff\1\6\1\uffff\1\5\2\uffff\1\4\1\3\1\1\4\7\1\uffff\1\7",
            "",
            "",
            "",
            "",
            "\3\11\4\uffff\1\10\1\11\1\uffff\2\11\17\uffff\16\11",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "807:1: (this_IntLiteral_0= ruleIntLiteral | this_DoubleLiteral_1= ruleDoubleLiteral | this_StringLiteral_2= ruleStringLiteral | this_BoolLiteral_3= ruleBoolLiteral | this_FunctionLiteral_4= ruleFunctionLiteral | this_Variable_5= ruleVariable | this_Parenthesis_6= ruleParenthesis | this_ProbabilityFunctionLiteral_7= ruleProbabilityFunctionLiteral )";
        }
    }
    static final String DFA15_eotS =
        "\12\uffff";
    static final String DFA15_eofS =
        "\12\uffff";
    static final String DFA15_minS =
        "\1\13\6\0\3\uffff";
    static final String DFA15_maxS =
        "\1\61\6\0\3\uffff";
    static final String DFA15_acceptS =
        "\7\uffff\1\1\1\2\1\3";
    static final String DFA15_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\3\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\6\41\uffff\1\1\1\2\1\3\1\4\1\5",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1497:1: (this_unitMulti_0= ruleunitMulti | this_unitDiv_1= ruleunitDiv | this_BaseUnit_2= ruleBaseUnit )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_1 = input.LA(1);

                         
                        int index15_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalStoEx()) ) {s = 7;}

                        else if ( (synpred23_InternalStoEx()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index15_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_2 = input.LA(1);

                         
                        int index15_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalStoEx()) ) {s = 7;}

                        else if ( (synpred23_InternalStoEx()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index15_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_3 = input.LA(1);

                         
                        int index15_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalStoEx()) ) {s = 7;}

                        else if ( (synpred23_InternalStoEx()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index15_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA15_4 = input.LA(1);

                         
                        int index15_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalStoEx()) ) {s = 7;}

                        else if ( (synpred23_InternalStoEx()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index15_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA15_5 = input.LA(1);

                         
                        int index15_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalStoEx()) ) {s = 7;}

                        else if ( (synpred23_InternalStoEx()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index15_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA15_6 = input.LA(1);

                         
                        int index15_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalStoEx()) ) {s = 7;}

                        else if ( (synpred23_InternalStoEx()) ) {s = 8;}

                         
                        input.seek(index15_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleexpression_in_entryRuleexpression81 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleexpression91 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleifelseExpr_in_ruleexpression140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleifelseExpr_in_entryRuleifelseExpr174 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleifelseExpr184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleboolAndExpr_in_ruleifelseExpr234 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_RULE_CONDDELIMITER_in_ruleifelseExpr257 = new BitSet(new long[]{0x00000000817F2980L});
        public static final BitSet FOLLOW_ruleboolAndExpr_in_ruleifelseExpr277 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ELSEDELIMITER_in_ruleifelseExpr288 = new BitSet(new long[]{0x00000000817F2980L});
        public static final BitSet FOLLOW_ruleboolAndExpr_in_ruleifelseExpr308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleboolAndExpr_in_entryRuleboolAndExpr348 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleboolAndExpr358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleboolOrExpr_in_ruleboolAndExpr408 = new BitSet(new long[]{0x0000000400000002L});
        public static final BitSet FOLLOW_ruleandoperation_in_ruleboolAndExpr441 = new BitSet(new long[]{0x00000000817F2980L});
        public static final BitSet FOLLOW_ruleboolOrExpr_in_ruleboolAndExpr462 = new BitSet(new long[]{0x0000000400000002L});
        public static final BitSet FOLLOW_ruleboolOrExpr_in_entryRuleboolOrExpr500 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleboolOrExpr510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulecompareExpr_in_ruleboolOrExpr560 = new BitSet(new long[]{0x0000001800000002L});
        public static final BitSet FOLLOW_ruleoroperations_in_ruleboolOrExpr593 = new BitSet(new long[]{0x00000000817F2980L});
        public static final BitSet FOLLOW_rulecompareExpr_in_ruleboolOrExpr614 = new BitSet(new long[]{0x0000001800000002L});
        public static final BitSet FOLLOW_rulecompareExpr_in_entryRulecompareExpr652 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulecompareExpr662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesumExpr_in_rulecompareExpr712 = new BitSet(new long[]{0x000007E000000002L});
        public static final BitSet FOLLOW_ruleCompareOperations_in_rulecompareExpr745 = new BitSet(new long[]{0x00000000817F2980L});
        public static final BitSet FOLLOW_rulesumExpr_in_rulecompareExpr766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesumExpr_in_entryRulesumExpr804 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesumExpr814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleprodExpr_in_rulesumExpr864 = new BitSet(new long[]{0x0000080080000002L});
        public static final BitSet FOLLOW_ruleTermOperations_in_rulesumExpr897 = new BitSet(new long[]{0x00000000817F2980L});
        public static final BitSet FOLLOW_ruleprodExpr_in_rulesumExpr918 = new BitSet(new long[]{0x0000080080000002L});
        public static final BitSet FOLLOW_ruleprodExpr_in_entryRuleprodExpr956 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleprodExpr966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulepowExpr_in_ruleprodExpr1016 = new BitSet(new long[]{0x0000100300000002L});
        public static final BitSet FOLLOW_ruleProductOperations_in_ruleprodExpr1049 = new BitSet(new long[]{0x00000000817F2980L});
        public static final BitSet FOLLOW_rulepowExpr_in_ruleprodExpr1070 = new BitSet(new long[]{0x0000100300000002L});
        public static final BitSet FOLLOW_rulepowExpr_in_entryRulepowExpr1108 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulepowExpr1118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleunaryExpr_in_rulepowExpr1168 = new BitSet(new long[]{0x0000000000000042L});
        public static final BitSet FOLLOW_RULE_POW_in_rulepowExpr1191 = new BitSet(new long[]{0x00000000817F2980L});
        public static final BitSet FOLLOW_ruleunaryExpr_in_rulepowExpr1211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleunaryExpr_in_entryRuleunaryExpr1249 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleunaryExpr1259 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNegativeExpression_in_ruleunaryExpr1309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpression_in_ruleunaryExpr1339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleatom_in_ruleunaryExpr1369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpression_in_entryRuleNotExpression1404 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNotExpression1414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_NOT_in_ruleNotExpression1450 = new BitSet(new long[]{0x00000000817F2980L});
        public static final BitSet FOLLOW_ruleunaryExpr_in_ruleNotExpression1470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNegativeExpression_in_entryRuleNegativeExpression1506 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNegativeExpression1516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleNegativeExpression1553 = new BitSet(new long[]{0x00000000817F2980L});
        public static final BitSet FOLLOW_ruleunaryExpr_in_ruleNegativeExpression1574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleatom_in_entryRuleatom1610 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleatom1620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntLiteral_in_ruleatom1670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDoubleLiteral_in_ruleatom1700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringLiteral_in_ruleatom1730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolLiteral_in_ruleatom1760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFunctionLiteral_in_ruleatom1790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleatom1820 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParenthesis_in_ruleatom1850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProbabilityFunctionLiteral_in_ruleatom1880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDoubleLiteral_in_entryRuleDoubleLiteral1915 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDoubleLiteral1925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleDoubleLiteral1967 = new BitSet(new long[]{0x0000000000000202L});
        public static final BitSet FOLLOW_RULE_SQUARE_PAREN_L_in_ruleDoubleLiteral1984 = new BitSet(new long[]{0x0003E00000000800L});
        public static final BitSet FOLLOW_ruleUnit_in_ruleDoubleLiteral2004 = new BitSet(new long[]{0x0000000000000400L});
        public static final BitSet FOLLOW_RULE_SQUARE_PAREN_R_in_ruleDoubleLiteral2015 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProbabilityFunctionLiteral_in_entryRuleProbabilityFunctionLiteral2052 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProbabilityFunctionLiteral2062 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruledefinition_in_ruleProbabilityFunctionLiteral2107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParenthesis_in_entryRuleParenthesis2142 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParenthesis2152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_LPAREN_in_ruleParenthesis2188 = new BitSet(new long[]{0x00000000817F2980L});
        public static final BitSet FOLLOW_ruleifelseExpr_in_ruleParenthesis2208 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_RULE_RPAREN_in_ruleParenthesis2219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFunctionLiteral_in_entryRuleFunctionLiteral2254 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFunctionLiteral2264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionLiteral2306 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_RULE_LPAREN_in_ruleFunctionLiteral2322 = new BitSet(new long[]{0x00000000817F3980L});
        public static final BitSet FOLLOW_ruleboolAndExpr_in_ruleFunctionLiteral2343 = new BitSet(new long[]{0x0000000000005000L});
        public static final BitSet FOLLOW_RULE_COLON_in_ruleFunctionLiteral2355 = new BitSet(new long[]{0x00000000817F2980L});
        public static final BitSet FOLLOW_ruleboolAndExpr_in_ruleFunctionLiteral2375 = new BitSet(new long[]{0x0000000000005000L});
        public static final BitSet FOLLOW_RULE_RPAREN_in_ruleFunctionLiteral2390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable2425 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariable2435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractNamedReference_in_ruleVariable2480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractNamedReference_in_entryRuleAbstractNamedReference2515 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractNamedReference2525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableReference_in_ruleAbstractNamedReference2575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNamespaceReference_in_ruleAbstractNamedReference2605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableReference_in_entryRuleVariableReference2640 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariableReference2650 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleVariableReference2691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNamespaceReference_in_entryRuleNamespaceReference2731 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNamespaceReference2741 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleNamespaceReference2783 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_RULE_DOT_in_ruleNamespaceReference2799 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_ruleAbstractNamedReference_in_ruleNamespaceReference2819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral2855 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBoolLiteral2865 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_KEYWORDS_in_ruleBoolLiteral2906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral2946 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral2956 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral2997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral3037 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntLiteral3047 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_DECINT_in_ruleIntLiteral3089 = new BitSet(new long[]{0x0000000000000202L});
        public static final BitSet FOLLOW_RULE_SQUARE_PAREN_L_in_ruleIntLiteral3106 = new BitSet(new long[]{0x0003E00000000800L});
        public static final BitSet FOLLOW_ruleUnit_in_ruleIntLiteral3126 = new BitSet(new long[]{0x0000000000000400L});
        public static final BitSet FOLLOW_RULE_SQUARE_PAREN_R_in_ruleIntLiteral3137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnit_in_entryRuleUnit3174 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnit3184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleunitMulti_in_ruleUnit3234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleunitDiv_in_ruleUnit3264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBaseUnit_in_ruleUnit3294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleunitDiv_in_entryRuleunitDiv3329 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleunitDiv3339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleunitPow_in_ruleunitDiv3389 = new BitSet(new long[]{0x0000000100000002L});
        public static final BitSet FOLLOW_32_in_ruleunitDiv3413 = new BitSet(new long[]{0x0003E00000000800L});
        public static final BitSet FOLLOW_ruleUnit_in_ruleunitDiv3434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleunitMulti_in_entryRuleunitMulti3472 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleunitMulti3482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleunitPow_in_ruleunitMulti3532 = new BitSet(new long[]{0x0000000200000002L});
        public static final BitSet FOLLOW_33_in_ruleunitMulti3556 = new BitSet(new long[]{0x0003E00000000800L});
        public static final BitSet FOLLOW_ruleUnit_in_ruleunitMulti3577 = new BitSet(new long[]{0x0000000200000002L});
        public static final BitSet FOLLOW_ruleunitPow_in_entryRuleunitPow3615 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleunitPow3625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBaseUnit_in_ruleunitPow3676 = new BitSet(new long[]{0x0000000000000042L});
        public static final BitSet FOLLOW_RULE_LPAREN_in_ruleunitPow3693 = new BitSet(new long[]{0x0003E00000000800L});
        public static final BitSet FOLLOW_ruleunitMulti_in_ruleunitPow3718 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_ruleunitDiv_in_ruleunitPow3748 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_RULE_RPAREN_in_ruleunitPow3759 = new BitSet(new long[]{0x0000000000000042L});
        public static final BitSet FOLLOW_RULE_POW_in_ruleunitPow3784 = new BitSet(new long[]{0x0000000080040000L});
        public static final BitSet FOLLOW_ruleSIGNED_INT_in_ruleunitPow3804 = new BitSet(new long[]{0x0000000000000042L});
        public static final BitSet FOLLOW_ruleBaseUnit_in_entryRuleBaseUnit3842 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBaseUnit3852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnitNames_in_ruleBaseUnit3897 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruledefinition_in_entryRuledefinition3932 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuledefinition3942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProbabilityMassFunction_in_ruledefinition3992 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProbabilityDensityFunction_in_ruledefinition4022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProbabilityDensityFunction_in_entryRuleProbabilityDensityFunction4057 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProbabilityDensityFunction4067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoxedPDF_in_ruleProbabilityDensityFunction4116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoxedPDF_in_entryRuleBoxedPDF4150 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBoxedPDF4160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_DOUBLEPDF_in_ruleBoxedPDF4196 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_RULE_SQUARE_PAREN_L_in_ruleBoxedPDF4206 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rulereal_pdf_sample_in_ruleBoxedPDF4226 = new BitSet(new long[]{0x0000000000000C00L});
        public static final BitSet FOLLOW_RULE_SQUARE_PAREN_R_in_ruleBoxedPDF4238 = new BitSet(new long[]{0x0000000000000202L});
        public static final BitSet FOLLOW_RULE_SQUARE_PAREN_L_in_ruleBoxedPDF4249 = new BitSet(new long[]{0x0003E00000000800L});
        public static final BitSet FOLLOW_ruleUnit_in_ruleBoxedPDF4269 = new BitSet(new long[]{0x0000000000000400L});
        public static final BitSet FOLLOW_RULE_SQUARE_PAREN_R_in_ruleBoxedPDF4280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProbabilityMassFunction_in_entryRuleProbabilityMassFunction4317 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProbabilityMassFunction4327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INTPMF_in_ruleProbabilityMassFunction4364 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_RULE_SQUARE_PAREN_L_in_ruleProbabilityMassFunction4374 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rulenumeric_int_sample_in_ruleProbabilityMassFunction4394 = new BitSet(new long[]{0x0000000000000C00L});
        public static final BitSet FOLLOW_RULE_SQUARE_PAREN_R_in_ruleProbabilityMassFunction4406 = new BitSet(new long[]{0x0000000000000202L});
        public static final BitSet FOLLOW_RULE_SQUARE_PAREN_L_in_ruleProbabilityMassFunction4417 = new BitSet(new long[]{0x0003E00000000800L});
        public static final BitSet FOLLOW_ruleUnit_in_ruleProbabilityMassFunction4437 = new BitSet(new long[]{0x0000000000000400L});
        public static final BitSet FOLLOW_RULE_SQUARE_PAREN_R_in_ruleProbabilityMassFunction4448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_DOUBLEPMF_in_ruleProbabilityMassFunction4468 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_RULE_SQUARE_PAREN_L_in_ruleProbabilityMassFunction4478 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rulenumeric_real_sample_in_ruleProbabilityMassFunction4498 = new BitSet(new long[]{0x0000000000000C00L});
        public static final BitSet FOLLOW_RULE_SQUARE_PAREN_R_in_ruleProbabilityMassFunction4510 = new BitSet(new long[]{0x0000000000000202L});
        public static final BitSet FOLLOW_RULE_SQUARE_PAREN_L_in_ruleProbabilityMassFunction4521 = new BitSet(new long[]{0x0003E00000000800L});
        public static final BitSet FOLLOW_ruleUnit_in_ruleProbabilityMassFunction4541 = new BitSet(new long[]{0x0000000000000400L});
        public static final BitSet FOLLOW_RULE_SQUARE_PAREN_R_in_ruleProbabilityMassFunction4552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ENUMPMF_in_ruleProbabilityMassFunction4572 = new BitSet(new long[]{0x0000000000000A00L});
        public static final BitSet FOLLOW_RULE_LPAREN_in_ruleProbabilityMassFunction4583 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_RULE_ORDERED_DEF_in_ruleProbabilityMassFunction4599 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_RULE_RPAREN_in_ruleProbabilityMassFunction4615 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_RULE_SQUARE_PAREN_L_in_ruleProbabilityMassFunction4627 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rulestringsample_in_ruleProbabilityMassFunction4647 = new BitSet(new long[]{0x0000000000000C00L});
        public static final BitSet FOLLOW_RULE_SQUARE_PAREN_R_in_ruleProbabilityMassFunction4659 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_BOOLPMF_in_ruleProbabilityMassFunction4677 = new BitSet(new long[]{0x0000000000000A00L});
        public static final BitSet FOLLOW_RULE_LPAREN_in_ruleProbabilityMassFunction4688 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_RULE_ORDERED_DEF_in_ruleProbabilityMassFunction4704 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_RULE_RPAREN_in_ruleProbabilityMassFunction4720 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_RULE_SQUARE_PAREN_L_in_ruleProbabilityMassFunction4732 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_ruleboolsample_in_ruleProbabilityMassFunction4752 = new BitSet(new long[]{0x0000000000000C00L});
        public static final BitSet FOLLOW_RULE_SQUARE_PAREN_R_in_ruleProbabilityMassFunction4764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulenumeric_int_sample_in_entryRulenumeric_int_sample4800 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulenumeric_int_sample4810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_LPAREN_in_rulenumeric_int_sample4846 = new BitSet(new long[]{0x0000000080040000L});
        public static final BitSet FOLLOW_ruleSIGNED_INT_in_rulenumeric_int_sample4866 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_RULE_SEMI_in_rulenumeric_int_sample4877 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_RULE_DOUBLE_in_rulenumeric_int_sample4893 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_RULE_RPAREN_in_rulenumeric_int_sample4909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulenumeric_real_sample_in_entryRulenumeric_real_sample4944 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulenumeric_real_sample4954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_LPAREN_in_rulenumeric_real_sample4990 = new BitSet(new long[]{0x0000000080000100L});
        public static final BitSet FOLLOW_ruleSIGNED_NUMBER_in_rulenumeric_real_sample5010 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_RULE_SEMI_in_rulenumeric_real_sample5021 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_RULE_DOUBLE_in_rulenumeric_real_sample5037 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_RULE_RPAREN_in_rulenumeric_real_sample5053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulereal_pdf_sample_in_entryRulereal_pdf_sample5088 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulereal_pdf_sample5098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_LPAREN_in_rulereal_pdf_sample5134 = new BitSet(new long[]{0x0000000080000100L});
        public static final BitSet FOLLOW_ruleSIGNED_NUMBER_in_rulereal_pdf_sample5154 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_RULE_SEMI_in_rulereal_pdf_sample5165 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_RULE_DOUBLE_in_rulereal_pdf_sample5181 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_RULE_RPAREN_in_rulereal_pdf_sample5197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulestringsample_in_entryRulestringsample5232 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulestringsample5242 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_LPAREN_in_rulestringsample5278 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_RULE_STRING_in_rulestringsample5294 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_RULE_SEMI_in_rulestringsample5310 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_RULE_DOUBLE_in_rulestringsample5326 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_RULE_RPAREN_in_rulestringsample5342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleboolsample_in_entryRuleboolsample5377 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleboolsample5387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_LPAREN_in_ruleboolsample5423 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_KEYWORDS_in_ruleboolsample5439 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_RULE_SEMI_in_ruleboolsample5455 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleboolsample5471 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_RULE_RPAREN_in_ruleboolsample5487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSIGNED_NUMBER_in_entryRuleSIGNED_NUMBER5523 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSIGNED_NUMBER5534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleSIGNED_NUMBER5573 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleSIGNED_NUMBER5590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSIGNED_INT_in_entryRuleSIGNED_INT5636 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSIGNED_INT5647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleSIGNED_INT5686 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_RULE_DECINT_in_ruleSIGNED_INT5703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleBooleanOperations5762 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleBooleanOperations5779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleBooleanOperations5796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleandoperation5840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleoroperations5884 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleoroperations5901 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleCompareOperations5946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleCompareOperations5963 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleCompareOperations5980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleCompareOperations5997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleCompareOperations6014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleCompareOperations6031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleTermOperations6076 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleTermOperations6093 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleProductOperations6138 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleProductOperations6155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleProductOperations6172 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleUnitNames6217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleUnitNames6234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleUnitNames6251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleUnitNames6268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleUnitNames6285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleunitMulti_in_synpred22_InternalStoEx3234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleunitDiv_in_synpred23_InternalStoEx3264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_synpred25_InternalStoEx3556 = new BitSet(new long[]{0x0003E00000000800L});
        public static final BitSet FOLLOW_ruleUnit_in_synpred25_InternalStoEx3577 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleunitMulti_in_synpred27_InternalStoEx3718 = new BitSet(new long[]{0x0000000000000002L});
    }


}