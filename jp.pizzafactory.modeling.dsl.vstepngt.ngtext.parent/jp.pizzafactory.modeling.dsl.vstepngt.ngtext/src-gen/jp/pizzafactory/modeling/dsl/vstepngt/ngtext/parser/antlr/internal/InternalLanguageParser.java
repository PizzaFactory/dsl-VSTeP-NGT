package jp.pizzafactory.modeling.dsl.vstepngt.ngtext.parser.antlr.internal;

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
import jp.pizzafactory.modeling.dsl.vstepngt.ngtext.services.LanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Container'", "'{'", "'title'", "'}'", "'Abstraction'", "'superClass'", "'subClass'", "'Aggregation'", "'stereotype'", "'owner'", "'member'", "'root'", "'Testable'", "'shortDescription'", "'TestAssociation'", "'type'", "'source'", "'target'", "'COMBINATION'", "'FRAMING'", "'SEQUENCE'"
    };
    public static final int RULE_STRING=5;
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
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalLanguage.g"; }



     	private LanguageGrammarAccess grammarAccess;

        public InternalLanguageParser(TokenStream input, LanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "WorkspaceRoot";
       	}

       	@Override
       	protected LanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleWorkspaceRoot"
    // InternalLanguage.g:65:1: entryRuleWorkspaceRoot returns [EObject current=null] : iv_ruleWorkspaceRoot= ruleWorkspaceRoot EOF ;
    public final EObject entryRuleWorkspaceRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkspaceRoot = null;


        try {
            // InternalLanguage.g:65:54: (iv_ruleWorkspaceRoot= ruleWorkspaceRoot EOF )
            // InternalLanguage.g:66:2: iv_ruleWorkspaceRoot= ruleWorkspaceRoot EOF
            {
             newCompositeNode(grammarAccess.getWorkspaceRootRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkspaceRoot=ruleWorkspaceRoot();

            state._fsp--;

             current =iv_ruleWorkspaceRoot; 
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
    // $ANTLR end "entryRuleWorkspaceRoot"


    // $ANTLR start "ruleWorkspaceRoot"
    // InternalLanguage.g:72:1: ruleWorkspaceRoot returns [EObject current=null] : ( ( (lv_elements_0_0= ruleWorkspaceElement ) ) ( (lv_elements_1_0= ruleWorkspaceElement ) )* ) ;
    public final EObject ruleWorkspaceRoot() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;

        EObject lv_elements_1_0 = null;



        	enterRule();

        try {
            // InternalLanguage.g:78:2: ( ( ( (lv_elements_0_0= ruleWorkspaceElement ) ) ( (lv_elements_1_0= ruleWorkspaceElement ) )* ) )
            // InternalLanguage.g:79:2: ( ( (lv_elements_0_0= ruleWorkspaceElement ) ) ( (lv_elements_1_0= ruleWorkspaceElement ) )* )
            {
            // InternalLanguage.g:79:2: ( ( (lv_elements_0_0= ruleWorkspaceElement ) ) ( (lv_elements_1_0= ruleWorkspaceElement ) )* )
            // InternalLanguage.g:80:3: ( (lv_elements_0_0= ruleWorkspaceElement ) ) ( (lv_elements_1_0= ruleWorkspaceElement ) )*
            {
            // InternalLanguage.g:80:3: ( (lv_elements_0_0= ruleWorkspaceElement ) )
            // InternalLanguage.g:81:4: (lv_elements_0_0= ruleWorkspaceElement )
            {
            // InternalLanguage.g:81:4: (lv_elements_0_0= ruleWorkspaceElement )
            // InternalLanguage.g:82:5: lv_elements_0_0= ruleWorkspaceElement
            {

            					newCompositeNode(grammarAccess.getWorkspaceRootAccess().getElementsWorkspaceElementParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_elements_0_0=ruleWorkspaceElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWorkspaceRootRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_0_0,
            						"jp.pizzafactory.modeling.dsl.vstepngt.ngtext.Language.WorkspaceElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLanguage.g:99:3: ( (lv_elements_1_0= ruleWorkspaceElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==15||LA1_0==18||(LA1_0>=22 && LA1_0<=23)||LA1_0==25) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalLanguage.g:100:4: (lv_elements_1_0= ruleWorkspaceElement )
            	    {
            	    // InternalLanguage.g:100:4: (lv_elements_1_0= ruleWorkspaceElement )
            	    // InternalLanguage.g:101:5: lv_elements_1_0= ruleWorkspaceElement
            	    {

            	    					newCompositeNode(grammarAccess.getWorkspaceRootAccess().getElementsWorkspaceElementParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_elements_1_0=ruleWorkspaceElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getWorkspaceRootRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_1_0,
            	    						"jp.pizzafactory.modeling.dsl.vstepngt.ngtext.Language.WorkspaceElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "ruleWorkspaceRoot"


    // $ANTLR start "entryRuleWorkspaceElement"
    // InternalLanguage.g:122:1: entryRuleWorkspaceElement returns [EObject current=null] : iv_ruleWorkspaceElement= ruleWorkspaceElement EOF ;
    public final EObject entryRuleWorkspaceElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkspaceElement = null;


        try {
            // InternalLanguage.g:122:57: (iv_ruleWorkspaceElement= ruleWorkspaceElement EOF )
            // InternalLanguage.g:123:2: iv_ruleWorkspaceElement= ruleWorkspaceElement EOF
            {
             newCompositeNode(grammarAccess.getWorkspaceElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkspaceElement=ruleWorkspaceElement();

            state._fsp--;

             current =iv_ruleWorkspaceElement; 
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
    // $ANTLR end "entryRuleWorkspaceElement"


    // $ANTLR start "ruleWorkspaceElement"
    // InternalLanguage.g:129:1: ruleWorkspaceElement returns [EObject current=null] : (this_Container_0= ruleContainer | this_Abstraction_1= ruleAbstraction | this_Aggregation_2= ruleAggregation | this_Testable_3= ruleTestable | this_TestAssociation_4= ruleTestAssociation ) ;
    public final EObject ruleWorkspaceElement() throws RecognitionException {
        EObject current = null;

        EObject this_Container_0 = null;

        EObject this_Abstraction_1 = null;

        EObject this_Aggregation_2 = null;

        EObject this_Testable_3 = null;

        EObject this_TestAssociation_4 = null;



        	enterRule();

        try {
            // InternalLanguage.g:135:2: ( (this_Container_0= ruleContainer | this_Abstraction_1= ruleAbstraction | this_Aggregation_2= ruleAggregation | this_Testable_3= ruleTestable | this_TestAssociation_4= ruleTestAssociation ) )
            // InternalLanguage.g:136:2: (this_Container_0= ruleContainer | this_Abstraction_1= ruleAbstraction | this_Aggregation_2= ruleAggregation | this_Testable_3= ruleTestable | this_TestAssociation_4= ruleTestAssociation )
            {
            // InternalLanguage.g:136:2: (this_Container_0= ruleContainer | this_Abstraction_1= ruleAbstraction | this_Aggregation_2= ruleAggregation | this_Testable_3= ruleTestable | this_TestAssociation_4= ruleTestAssociation )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 15:
                {
                alt2=2;
                }
                break;
            case 18:
                {
                alt2=3;
                }
                break;
            case 22:
            case 23:
                {
                alt2=4;
                }
                break;
            case 25:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalLanguage.g:137:3: this_Container_0= ruleContainer
                    {

                    			newCompositeNode(grammarAccess.getWorkspaceElementAccess().getContainerParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Container_0=ruleContainer();

                    state._fsp--;


                    			current = this_Container_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalLanguage.g:146:3: this_Abstraction_1= ruleAbstraction
                    {

                    			newCompositeNode(grammarAccess.getWorkspaceElementAccess().getAbstractionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Abstraction_1=ruleAbstraction();

                    state._fsp--;


                    			current = this_Abstraction_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalLanguage.g:155:3: this_Aggregation_2= ruleAggregation
                    {

                    			newCompositeNode(grammarAccess.getWorkspaceElementAccess().getAggregationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Aggregation_2=ruleAggregation();

                    state._fsp--;


                    			current = this_Aggregation_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalLanguage.g:164:3: this_Testable_3= ruleTestable
                    {

                    			newCompositeNode(grammarAccess.getWorkspaceElementAccess().getTestableParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Testable_3=ruleTestable();

                    state._fsp--;


                    			current = this_Testable_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalLanguage.g:173:3: this_TestAssociation_4= ruleTestAssociation
                    {

                    			newCompositeNode(grammarAccess.getWorkspaceElementAccess().getTestAssociationParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_TestAssociation_4=ruleTestAssociation();

                    state._fsp--;


                    			current = this_TestAssociation_4;
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
    // $ANTLR end "ruleWorkspaceElement"


    // $ANTLR start "entryRuleContainer"
    // InternalLanguage.g:185:1: entryRuleContainer returns [EObject current=null] : iv_ruleContainer= ruleContainer EOF ;
    public final EObject entryRuleContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainer = null;


        try {
            // InternalLanguage.g:185:50: (iv_ruleContainer= ruleContainer EOF )
            // InternalLanguage.g:186:2: iv_ruleContainer= ruleContainer EOF
            {
             newCompositeNode(grammarAccess.getContainerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContainer=ruleContainer();

            state._fsp--;

             current =iv_ruleContainer; 
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
    // $ANTLR end "entryRuleContainer"


    // $ANTLR start "ruleContainer"
    // InternalLanguage.g:192:1: ruleContainer returns [EObject current=null] : ( () otherlv_1= 'Container' ( (lv_name_2_0= ruleIdentifiable ) )? otherlv_3= '{' (otherlv_4= 'title' ( (lv_title_5_0= ruleTitle ) ) )? ( ( (lv_elements_6_0= ruleWorkspaceElement ) ) ( (lv_elements_7_0= ruleWorkspaceElement ) )* )? otherlv_8= '}' ) ;
    public final EObject ruleContainer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_title_5_0 = null;

        EObject lv_elements_6_0 = null;

        EObject lv_elements_7_0 = null;



        	enterRule();

        try {
            // InternalLanguage.g:198:2: ( ( () otherlv_1= 'Container' ( (lv_name_2_0= ruleIdentifiable ) )? otherlv_3= '{' (otherlv_4= 'title' ( (lv_title_5_0= ruleTitle ) ) )? ( ( (lv_elements_6_0= ruleWorkspaceElement ) ) ( (lv_elements_7_0= ruleWorkspaceElement ) )* )? otherlv_8= '}' ) )
            // InternalLanguage.g:199:2: ( () otherlv_1= 'Container' ( (lv_name_2_0= ruleIdentifiable ) )? otherlv_3= '{' (otherlv_4= 'title' ( (lv_title_5_0= ruleTitle ) ) )? ( ( (lv_elements_6_0= ruleWorkspaceElement ) ) ( (lv_elements_7_0= ruleWorkspaceElement ) )* )? otherlv_8= '}' )
            {
            // InternalLanguage.g:199:2: ( () otherlv_1= 'Container' ( (lv_name_2_0= ruleIdentifiable ) )? otherlv_3= '{' (otherlv_4= 'title' ( (lv_title_5_0= ruleTitle ) ) )? ( ( (lv_elements_6_0= ruleWorkspaceElement ) ) ( (lv_elements_7_0= ruleWorkspaceElement ) )* )? otherlv_8= '}' )
            // InternalLanguage.g:200:3: () otherlv_1= 'Container' ( (lv_name_2_0= ruleIdentifiable ) )? otherlv_3= '{' (otherlv_4= 'title' ( (lv_title_5_0= ruleTitle ) ) )? ( ( (lv_elements_6_0= ruleWorkspaceElement ) ) ( (lv_elements_7_0= ruleWorkspaceElement ) )* )? otherlv_8= '}'
            {
            // InternalLanguage.g:200:3: ()
            // InternalLanguage.g:201:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getContainerAccess().getContainerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getContainerAccess().getContainerKeyword_1());
            		
            // InternalLanguage.g:211:3: ( (lv_name_2_0= ruleIdentifiable ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalLanguage.g:212:4: (lv_name_2_0= ruleIdentifiable )
                    {
                    // InternalLanguage.g:212:4: (lv_name_2_0= ruleIdentifiable )
                    // InternalLanguage.g:213:5: lv_name_2_0= ruleIdentifiable
                    {

                    					newCompositeNode(grammarAccess.getContainerAccess().getNameIdentifiableParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_name_2_0=ruleIdentifiable();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getContainerRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"jp.pizzafactory.modeling.dsl.vstepngt.ngtext.Language.Identifiable");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalLanguage.g:234:3: (otherlv_4= 'title' ( (lv_title_5_0= ruleTitle ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalLanguage.g:235:4: otherlv_4= 'title' ( (lv_title_5_0= ruleTitle ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getContainerAccess().getTitleKeyword_4_0());
                    			
                    // InternalLanguage.g:239:4: ( (lv_title_5_0= ruleTitle ) )
                    // InternalLanguage.g:240:5: (lv_title_5_0= ruleTitle )
                    {
                    // InternalLanguage.g:240:5: (lv_title_5_0= ruleTitle )
                    // InternalLanguage.g:241:6: lv_title_5_0= ruleTitle
                    {

                    						newCompositeNode(grammarAccess.getContainerAccess().getTitleTitleParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_title_5_0=ruleTitle();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getContainerRule());
                    						}
                    						set(
                    							current,
                    							"title",
                    							lv_title_5_0,
                    							"jp.pizzafactory.modeling.dsl.vstepngt.ngtext.Language.Title");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalLanguage.g:259:3: ( ( (lv_elements_6_0= ruleWorkspaceElement ) ) ( (lv_elements_7_0= ruleWorkspaceElement ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==11||LA6_0==15||LA6_0==18||(LA6_0>=22 && LA6_0<=23)||LA6_0==25) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalLanguage.g:260:4: ( (lv_elements_6_0= ruleWorkspaceElement ) ) ( (lv_elements_7_0= ruleWorkspaceElement ) )*
                    {
                    // InternalLanguage.g:260:4: ( (lv_elements_6_0= ruleWorkspaceElement ) )
                    // InternalLanguage.g:261:5: (lv_elements_6_0= ruleWorkspaceElement )
                    {
                    // InternalLanguage.g:261:5: (lv_elements_6_0= ruleWorkspaceElement )
                    // InternalLanguage.g:262:6: lv_elements_6_0= ruleWorkspaceElement
                    {

                    						newCompositeNode(grammarAccess.getContainerAccess().getElementsWorkspaceElementParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_elements_6_0=ruleWorkspaceElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getContainerRule());
                    						}
                    						add(
                    							current,
                    							"elements",
                    							lv_elements_6_0,
                    							"jp.pizzafactory.modeling.dsl.vstepngt.ngtext.Language.WorkspaceElement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalLanguage.g:279:4: ( (lv_elements_7_0= ruleWorkspaceElement ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==11||LA5_0==15||LA5_0==18||(LA5_0>=22 && LA5_0<=23)||LA5_0==25) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalLanguage.g:280:5: (lv_elements_7_0= ruleWorkspaceElement )
                    	    {
                    	    // InternalLanguage.g:280:5: (lv_elements_7_0= ruleWorkspaceElement )
                    	    // InternalLanguage.g:281:6: lv_elements_7_0= ruleWorkspaceElement
                    	    {

                    	    						newCompositeNode(grammarAccess.getContainerAccess().getElementsWorkspaceElementParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
                    	    lv_elements_7_0=ruleWorkspaceElement();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getContainerRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"elements",
                    	    							lv_elements_7_0,
                    	    							"jp.pizzafactory.modeling.dsl.vstepngt.ngtext.Language.WorkspaceElement");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleContainer"


    // $ANTLR start "entryRuleAbstraction"
    // InternalLanguage.g:307:1: entryRuleAbstraction returns [EObject current=null] : iv_ruleAbstraction= ruleAbstraction EOF ;
    public final EObject entryRuleAbstraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstraction = null;


        try {
            // InternalLanguage.g:307:52: (iv_ruleAbstraction= ruleAbstraction EOF )
            // InternalLanguage.g:308:2: iv_ruleAbstraction= ruleAbstraction EOF
            {
             newCompositeNode(grammarAccess.getAbstractionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstraction=ruleAbstraction();

            state._fsp--;

             current =iv_ruleAbstraction; 
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
    // $ANTLR end "entryRuleAbstraction"


    // $ANTLR start "ruleAbstraction"
    // InternalLanguage.g:314:1: ruleAbstraction returns [EObject current=null] : (otherlv_0= 'Abstraction' ( (lv_name_1_0= ruleIdentifiable ) )? otherlv_2= '{' otherlv_3= 'superClass' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'subClass' ( (otherlv_6= RULE_ID ) ) otherlv_7= '}' ) ;
    public final EObject ruleAbstraction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalLanguage.g:320:2: ( (otherlv_0= 'Abstraction' ( (lv_name_1_0= ruleIdentifiable ) )? otherlv_2= '{' otherlv_3= 'superClass' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'subClass' ( (otherlv_6= RULE_ID ) ) otherlv_7= '}' ) )
            // InternalLanguage.g:321:2: (otherlv_0= 'Abstraction' ( (lv_name_1_0= ruleIdentifiable ) )? otherlv_2= '{' otherlv_3= 'superClass' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'subClass' ( (otherlv_6= RULE_ID ) ) otherlv_7= '}' )
            {
            // InternalLanguage.g:321:2: (otherlv_0= 'Abstraction' ( (lv_name_1_0= ruleIdentifiable ) )? otherlv_2= '{' otherlv_3= 'superClass' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'subClass' ( (otherlv_6= RULE_ID ) ) otherlv_7= '}' )
            // InternalLanguage.g:322:3: otherlv_0= 'Abstraction' ( (lv_name_1_0= ruleIdentifiable ) )? otherlv_2= '{' otherlv_3= 'superClass' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'subClass' ( (otherlv_6= RULE_ID ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAbstractionAccess().getAbstractionKeyword_0());
            		
            // InternalLanguage.g:326:3: ( (lv_name_1_0= ruleIdentifiable ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalLanguage.g:327:4: (lv_name_1_0= ruleIdentifiable )
                    {
                    // InternalLanguage.g:327:4: (lv_name_1_0= ruleIdentifiable )
                    // InternalLanguage.g:328:5: lv_name_1_0= ruleIdentifiable
                    {

                    					newCompositeNode(grammarAccess.getAbstractionAccess().getNameIdentifiableParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_name_1_0=ruleIdentifiable();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAbstractionRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"jp.pizzafactory.modeling.dsl.vstepngt.ngtext.Language.Identifiable");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getAbstractionAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getAbstractionAccess().getSuperClassKeyword_3());
            		
            // InternalLanguage.g:353:3: ( (otherlv_4= RULE_ID ) )
            // InternalLanguage.g:354:4: (otherlv_4= RULE_ID )
            {
            // InternalLanguage.g:354:4: (otherlv_4= RULE_ID )
            // InternalLanguage.g:355:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAbstractionRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_4, grammarAccess.getAbstractionAccess().getSuperClassTestableCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getAbstractionAccess().getSubClassKeyword_5());
            		
            // InternalLanguage.g:370:3: ( (otherlv_6= RULE_ID ) )
            // InternalLanguage.g:371:4: (otherlv_6= RULE_ID )
            {
            // InternalLanguage.g:371:4: (otherlv_6= RULE_ID )
            // InternalLanguage.g:372:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAbstractionRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_6, grammarAccess.getAbstractionAccess().getSubClassTestableCrossReference_6_0());
            				

            }


            }

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getAbstractionAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleAbstraction"


    // $ANTLR start "entryRuleAggregation"
    // InternalLanguage.g:391:1: entryRuleAggregation returns [EObject current=null] : iv_ruleAggregation= ruleAggregation EOF ;
    public final EObject entryRuleAggregation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAggregation = null;


        try {
            // InternalLanguage.g:391:52: (iv_ruleAggregation= ruleAggregation EOF )
            // InternalLanguage.g:392:2: iv_ruleAggregation= ruleAggregation EOF
            {
             newCompositeNode(grammarAccess.getAggregationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAggregation=ruleAggregation();

            state._fsp--;

             current =iv_ruleAggregation; 
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
    // $ANTLR end "entryRuleAggregation"


    // $ANTLR start "ruleAggregation"
    // InternalLanguage.g:398:1: ruleAggregation returns [EObject current=null] : ( () otherlv_1= 'Aggregation' ( (lv_name_2_0= ruleIdentifiable ) )? otherlv_3= '{' (otherlv_4= 'stereotype' ( (lv_stereotype_5_0= ruleStereotype ) ) )? otherlv_6= 'owner' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'member' ( (otherlv_9= RULE_ID ) ) otherlv_10= '}' ) ;
    public final EObject ruleAggregation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_stereotype_5_0 = null;



        	enterRule();

        try {
            // InternalLanguage.g:404:2: ( ( () otherlv_1= 'Aggregation' ( (lv_name_2_0= ruleIdentifiable ) )? otherlv_3= '{' (otherlv_4= 'stereotype' ( (lv_stereotype_5_0= ruleStereotype ) ) )? otherlv_6= 'owner' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'member' ( (otherlv_9= RULE_ID ) ) otherlv_10= '}' ) )
            // InternalLanguage.g:405:2: ( () otherlv_1= 'Aggregation' ( (lv_name_2_0= ruleIdentifiable ) )? otherlv_3= '{' (otherlv_4= 'stereotype' ( (lv_stereotype_5_0= ruleStereotype ) ) )? otherlv_6= 'owner' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'member' ( (otherlv_9= RULE_ID ) ) otherlv_10= '}' )
            {
            // InternalLanguage.g:405:2: ( () otherlv_1= 'Aggregation' ( (lv_name_2_0= ruleIdentifiable ) )? otherlv_3= '{' (otherlv_4= 'stereotype' ( (lv_stereotype_5_0= ruleStereotype ) ) )? otherlv_6= 'owner' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'member' ( (otherlv_9= RULE_ID ) ) otherlv_10= '}' )
            // InternalLanguage.g:406:3: () otherlv_1= 'Aggregation' ( (lv_name_2_0= ruleIdentifiable ) )? otherlv_3= '{' (otherlv_4= 'stereotype' ( (lv_stereotype_5_0= ruleStereotype ) ) )? otherlv_6= 'owner' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'member' ( (otherlv_9= RULE_ID ) ) otherlv_10= '}'
            {
            // InternalLanguage.g:406:3: ()
            // InternalLanguage.g:407:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAggregationAccess().getAggregationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAggregationAccess().getAggregationKeyword_1());
            		
            // InternalLanguage.g:417:3: ( (lv_name_2_0= ruleIdentifiable ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalLanguage.g:418:4: (lv_name_2_0= ruleIdentifiable )
                    {
                    // InternalLanguage.g:418:4: (lv_name_2_0= ruleIdentifiable )
                    // InternalLanguage.g:419:5: lv_name_2_0= ruleIdentifiable
                    {

                    					newCompositeNode(grammarAccess.getAggregationAccess().getNameIdentifiableParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_name_2_0=ruleIdentifiable();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAggregationRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"jp.pizzafactory.modeling.dsl.vstepngt.ngtext.Language.Identifiable");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getAggregationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalLanguage.g:440:3: (otherlv_4= 'stereotype' ( (lv_stereotype_5_0= ruleStereotype ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalLanguage.g:441:4: otherlv_4= 'stereotype' ( (lv_stereotype_5_0= ruleStereotype ) )
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getAggregationAccess().getStereotypeKeyword_4_0());
                    			
                    // InternalLanguage.g:445:4: ( (lv_stereotype_5_0= ruleStereotype ) )
                    // InternalLanguage.g:446:5: (lv_stereotype_5_0= ruleStereotype )
                    {
                    // InternalLanguage.g:446:5: (lv_stereotype_5_0= ruleStereotype )
                    // InternalLanguage.g:447:6: lv_stereotype_5_0= ruleStereotype
                    {

                    						newCompositeNode(grammarAccess.getAggregationAccess().getStereotypeStereotypeParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_stereotype_5_0=ruleStereotype();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAggregationRule());
                    						}
                    						set(
                    							current,
                    							"stereotype",
                    							lv_stereotype_5_0,
                    							"jp.pizzafactory.modeling.dsl.vstepngt.ngtext.Language.Stereotype");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getAggregationAccess().getOwnerKeyword_5());
            		
            // InternalLanguage.g:469:3: ( (otherlv_7= RULE_ID ) )
            // InternalLanguage.g:470:4: (otherlv_7= RULE_ID )
            {
            // InternalLanguage.g:470:4: (otherlv_7= RULE_ID )
            // InternalLanguage.g:471:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAggregationRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_7, grammarAccess.getAggregationAccess().getOwnerComponentCrossReference_6_0());
            				

            }


            }

            otherlv_8=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_8, grammarAccess.getAggregationAccess().getMemberKeyword_7());
            		
            // InternalLanguage.g:486:3: ( (otherlv_9= RULE_ID ) )
            // InternalLanguage.g:487:4: (otherlv_9= RULE_ID )
            {
            // InternalLanguage.g:487:4: (otherlv_9= RULE_ID )
            // InternalLanguage.g:488:5: otherlv_9= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAggregationRule());
            					}
            				
            otherlv_9=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_9, grammarAccess.getAggregationAccess().getMemberTestableCrossReference_8_0());
            				

            }


            }

            otherlv_10=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getAggregationAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleAggregation"


    // $ANTLR start "entryRuleTestable"
    // InternalLanguage.g:507:1: entryRuleTestable returns [EObject current=null] : iv_ruleTestable= ruleTestable EOF ;
    public final EObject entryRuleTestable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestable = null;


        try {
            // InternalLanguage.g:507:49: (iv_ruleTestable= ruleTestable EOF )
            // InternalLanguage.g:508:2: iv_ruleTestable= ruleTestable EOF
            {
             newCompositeNode(grammarAccess.getTestableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTestable=ruleTestable();

            state._fsp--;

             current =iv_ruleTestable; 
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
    // $ANTLR end "entryRuleTestable"


    // $ANTLR start "ruleTestable"
    // InternalLanguage.g:514:1: ruleTestable returns [EObject current=null] : ( () ( (lv_isRoot_1_0= 'root' ) )? otherlv_2= 'Testable' ( (lv_name_3_0= ruleIdentifiable ) )? otherlv_4= '{' (otherlv_5= 'shortDescription' ( (lv_shortDescription_6_0= ruleShortDescription ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleTestable() throws RecognitionException {
        EObject current = null;

        Token lv_isRoot_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_shortDescription_6_0 = null;



        	enterRule();

        try {
            // InternalLanguage.g:520:2: ( ( () ( (lv_isRoot_1_0= 'root' ) )? otherlv_2= 'Testable' ( (lv_name_3_0= ruleIdentifiable ) )? otherlv_4= '{' (otherlv_5= 'shortDescription' ( (lv_shortDescription_6_0= ruleShortDescription ) ) )? otherlv_7= '}' ) )
            // InternalLanguage.g:521:2: ( () ( (lv_isRoot_1_0= 'root' ) )? otherlv_2= 'Testable' ( (lv_name_3_0= ruleIdentifiable ) )? otherlv_4= '{' (otherlv_5= 'shortDescription' ( (lv_shortDescription_6_0= ruleShortDescription ) ) )? otherlv_7= '}' )
            {
            // InternalLanguage.g:521:2: ( () ( (lv_isRoot_1_0= 'root' ) )? otherlv_2= 'Testable' ( (lv_name_3_0= ruleIdentifiable ) )? otherlv_4= '{' (otherlv_5= 'shortDescription' ( (lv_shortDescription_6_0= ruleShortDescription ) ) )? otherlv_7= '}' )
            // InternalLanguage.g:522:3: () ( (lv_isRoot_1_0= 'root' ) )? otherlv_2= 'Testable' ( (lv_name_3_0= ruleIdentifiable ) )? otherlv_4= '{' (otherlv_5= 'shortDescription' ( (lv_shortDescription_6_0= ruleShortDescription ) ) )? otherlv_7= '}'
            {
            // InternalLanguage.g:522:3: ()
            // InternalLanguage.g:523:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTestableAccess().getTestableAction_0(),
            					current);
            			

            }

            // InternalLanguage.g:529:3: ( (lv_isRoot_1_0= 'root' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalLanguage.g:530:4: (lv_isRoot_1_0= 'root' )
                    {
                    // InternalLanguage.g:530:4: (lv_isRoot_1_0= 'root' )
                    // InternalLanguage.g:531:5: lv_isRoot_1_0= 'root'
                    {
                    lv_isRoot_1_0=(Token)match(input,22,FOLLOW_16); 

                    					newLeafNode(lv_isRoot_1_0, grammarAccess.getTestableAccess().getIsRootRootKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTestableRule());
                    					}
                    					setWithLastConsumed(current, "isRoot", true, "root");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getTestableAccess().getTestableKeyword_2());
            		
            // InternalLanguage.g:547:3: ( (lv_name_3_0= ruleIdentifiable ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalLanguage.g:548:4: (lv_name_3_0= ruleIdentifiable )
                    {
                    // InternalLanguage.g:548:4: (lv_name_3_0= ruleIdentifiable )
                    // InternalLanguage.g:549:5: lv_name_3_0= ruleIdentifiable
                    {

                    					newCompositeNode(grammarAccess.getTestableAccess().getNameIdentifiableParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_name_3_0=ruleIdentifiable();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTestableRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_3_0,
                    						"jp.pizzafactory.modeling.dsl.vstepngt.ngtext.Language.Identifiable");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getTestableAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalLanguage.g:570:3: (otherlv_5= 'shortDescription' ( (lv_shortDescription_6_0= ruleShortDescription ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalLanguage.g:571:4: otherlv_5= 'shortDescription' ( (lv_shortDescription_6_0= ruleShortDescription ) )
                    {
                    otherlv_5=(Token)match(input,24,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getTestableAccess().getShortDescriptionKeyword_5_0());
                    			
                    // InternalLanguage.g:575:4: ( (lv_shortDescription_6_0= ruleShortDescription ) )
                    // InternalLanguage.g:576:5: (lv_shortDescription_6_0= ruleShortDescription )
                    {
                    // InternalLanguage.g:576:5: (lv_shortDescription_6_0= ruleShortDescription )
                    // InternalLanguage.g:577:6: lv_shortDescription_6_0= ruleShortDescription
                    {

                    						newCompositeNode(grammarAccess.getTestableAccess().getShortDescriptionShortDescriptionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_shortDescription_6_0=ruleShortDescription();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTestableRule());
                    						}
                    						set(
                    							current,
                    							"shortDescription",
                    							lv_shortDescription_6_0,
                    							"jp.pizzafactory.modeling.dsl.vstepngt.ngtext.Language.ShortDescription");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getTestableAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleTestable"


    // $ANTLR start "entryRuleTestAssociation"
    // InternalLanguage.g:603:1: entryRuleTestAssociation returns [EObject current=null] : iv_ruleTestAssociation= ruleTestAssociation EOF ;
    public final EObject entryRuleTestAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestAssociation = null;


        try {
            // InternalLanguage.g:603:56: (iv_ruleTestAssociation= ruleTestAssociation EOF )
            // InternalLanguage.g:604:2: iv_ruleTestAssociation= ruleTestAssociation EOF
            {
             newCompositeNode(grammarAccess.getTestAssociationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTestAssociation=ruleTestAssociation();

            state._fsp--;

             current =iv_ruleTestAssociation; 
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
    // $ANTLR end "entryRuleTestAssociation"


    // $ANTLR start "ruleTestAssociation"
    // InternalLanguage.g:610:1: ruleTestAssociation returns [EObject current=null] : (otherlv_0= 'TestAssociation' ( (lv_name_1_0= ruleIdentifiable ) )? otherlv_2= '{' (otherlv_3= 'stereotype' ( (lv_stereotype_4_0= ruleStereotype ) ) )? otherlv_5= 'type' ( (lv_type_6_0= ruleAssociationType ) ) otherlv_7= 'source' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) otherlv_11= '}' ) ;
    public final EObject ruleTestAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_stereotype_4_0 = null;

        Enumerator lv_type_6_0 = null;



        	enterRule();

        try {
            // InternalLanguage.g:616:2: ( (otherlv_0= 'TestAssociation' ( (lv_name_1_0= ruleIdentifiable ) )? otherlv_2= '{' (otherlv_3= 'stereotype' ( (lv_stereotype_4_0= ruleStereotype ) ) )? otherlv_5= 'type' ( (lv_type_6_0= ruleAssociationType ) ) otherlv_7= 'source' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) otherlv_11= '}' ) )
            // InternalLanguage.g:617:2: (otherlv_0= 'TestAssociation' ( (lv_name_1_0= ruleIdentifiable ) )? otherlv_2= '{' (otherlv_3= 'stereotype' ( (lv_stereotype_4_0= ruleStereotype ) ) )? otherlv_5= 'type' ( (lv_type_6_0= ruleAssociationType ) ) otherlv_7= 'source' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) otherlv_11= '}' )
            {
            // InternalLanguage.g:617:2: (otherlv_0= 'TestAssociation' ( (lv_name_1_0= ruleIdentifiable ) )? otherlv_2= '{' (otherlv_3= 'stereotype' ( (lv_stereotype_4_0= ruleStereotype ) ) )? otherlv_5= 'type' ( (lv_type_6_0= ruleAssociationType ) ) otherlv_7= 'source' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) otherlv_11= '}' )
            // InternalLanguage.g:618:3: otherlv_0= 'TestAssociation' ( (lv_name_1_0= ruleIdentifiable ) )? otherlv_2= '{' (otherlv_3= 'stereotype' ( (lv_stereotype_4_0= ruleStereotype ) ) )? otherlv_5= 'type' ( (lv_type_6_0= ruleAssociationType ) ) otherlv_7= 'source' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTestAssociationAccess().getTestAssociationKeyword_0());
            		
            // InternalLanguage.g:622:3: ( (lv_name_1_0= ruleIdentifiable ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalLanguage.g:623:4: (lv_name_1_0= ruleIdentifiable )
                    {
                    // InternalLanguage.g:623:4: (lv_name_1_0= ruleIdentifiable )
                    // InternalLanguage.g:624:5: lv_name_1_0= ruleIdentifiable
                    {

                    					newCompositeNode(grammarAccess.getTestAssociationAccess().getNameIdentifiableParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_name_1_0=ruleIdentifiable();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTestAssociationRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"jp.pizzafactory.modeling.dsl.vstepngt.ngtext.Language.Identifiable");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getTestAssociationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLanguage.g:645:3: (otherlv_3= 'stereotype' ( (lv_stereotype_4_0= ruleStereotype ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==19) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalLanguage.g:646:4: otherlv_3= 'stereotype' ( (lv_stereotype_4_0= ruleStereotype ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getTestAssociationAccess().getStereotypeKeyword_3_0());
                    			
                    // InternalLanguage.g:650:4: ( (lv_stereotype_4_0= ruleStereotype ) )
                    // InternalLanguage.g:651:5: (lv_stereotype_4_0= ruleStereotype )
                    {
                    // InternalLanguage.g:651:5: (lv_stereotype_4_0= ruleStereotype )
                    // InternalLanguage.g:652:6: lv_stereotype_4_0= ruleStereotype
                    {

                    						newCompositeNode(grammarAccess.getTestAssociationAccess().getStereotypeStereotypeParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_stereotype_4_0=ruleStereotype();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTestAssociationRule());
                    						}
                    						set(
                    							current,
                    							"stereotype",
                    							lv_stereotype_4_0,
                    							"jp.pizzafactory.modeling.dsl.vstepngt.ngtext.Language.Stereotype");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,26,FOLLOW_20); 

            			newLeafNode(otherlv_5, grammarAccess.getTestAssociationAccess().getTypeKeyword_4());
            		
            // InternalLanguage.g:674:3: ( (lv_type_6_0= ruleAssociationType ) )
            // InternalLanguage.g:675:4: (lv_type_6_0= ruleAssociationType )
            {
            // InternalLanguage.g:675:4: (lv_type_6_0= ruleAssociationType )
            // InternalLanguage.g:676:5: lv_type_6_0= ruleAssociationType
            {

            					newCompositeNode(grammarAccess.getTestAssociationAccess().getTypeAssociationTypeEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_21);
            lv_type_6_0=ruleAssociationType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTestAssociationRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_6_0,
            						"jp.pizzafactory.modeling.dsl.vstepngt.ngtext.Language.AssociationType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,27,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getTestAssociationAccess().getSourceKeyword_6());
            		
            // InternalLanguage.g:697:3: ( (otherlv_8= RULE_ID ) )
            // InternalLanguage.g:698:4: (otherlv_8= RULE_ID )
            {
            // InternalLanguage.g:698:4: (otherlv_8= RULE_ID )
            // InternalLanguage.g:699:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTestAssociationRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_8, grammarAccess.getTestAssociationAccess().getSourceTestableCrossReference_7_0());
            				

            }


            }

            otherlv_9=(Token)match(input,28,FOLLOW_10); 

            			newLeafNode(otherlv_9, grammarAccess.getTestAssociationAccess().getTargetKeyword_8());
            		
            // InternalLanguage.g:714:3: ( (otherlv_10= RULE_ID ) )
            // InternalLanguage.g:715:4: (otherlv_10= RULE_ID )
            {
            // InternalLanguage.g:715:4: (otherlv_10= RULE_ID )
            // InternalLanguage.g:716:5: otherlv_10= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTestAssociationRule());
            					}
            				
            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_10, grammarAccess.getTestAssociationAccess().getTargetTestableCrossReference_9_0());
            				

            }


            }

            otherlv_11=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getTestAssociationAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleTestAssociation"


    // $ANTLR start "entryRuleIdentifiable"
    // InternalLanguage.g:735:1: entryRuleIdentifiable returns [String current=null] : iv_ruleIdentifiable= ruleIdentifiable EOF ;
    public final String entryRuleIdentifiable() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdentifiable = null;


        try {
            // InternalLanguage.g:735:52: (iv_ruleIdentifiable= ruleIdentifiable EOF )
            // InternalLanguage.g:736:2: iv_ruleIdentifiable= ruleIdentifiable EOF
            {
             newCompositeNode(grammarAccess.getIdentifiableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIdentifiable=ruleIdentifiable();

            state._fsp--;

             current =iv_ruleIdentifiable.getText(); 
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
    // $ANTLR end "entryRuleIdentifiable"


    // $ANTLR start "ruleIdentifiable"
    // InternalLanguage.g:742:1: ruleIdentifiable returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleIdentifiable() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalLanguage.g:748:2: (this_ID_0= RULE_ID )
            // InternalLanguage.g:749:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            		current.merge(this_ID_0);
            	

            		newLeafNode(this_ID_0, grammarAccess.getIdentifiableAccess().getIDTerminalRuleCall());
            	

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
    // $ANTLR end "ruleIdentifiable"


    // $ANTLR start "entryRuleStereotype"
    // InternalLanguage.g:759:1: entryRuleStereotype returns [String current=null] : iv_ruleStereotype= ruleStereotype EOF ;
    public final String entryRuleStereotype() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStereotype = null;


        try {
            // InternalLanguage.g:759:50: (iv_ruleStereotype= ruleStereotype EOF )
            // InternalLanguage.g:760:2: iv_ruleStereotype= ruleStereotype EOF
            {
             newCompositeNode(grammarAccess.getStereotypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStereotype=ruleStereotype();

            state._fsp--;

             current =iv_ruleStereotype.getText(); 
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
    // $ANTLR end "entryRuleStereotype"


    // $ANTLR start "ruleStereotype"
    // InternalLanguage.g:766:1: ruleStereotype returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleStereotype() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalLanguage.g:772:2: (this_STRING_0= RULE_STRING )
            // InternalLanguage.g:773:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getStereotypeAccess().getSTRINGTerminalRuleCall());
            	

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
    // $ANTLR end "ruleStereotype"


    // $ANTLR start "entryRuleShortDescription"
    // InternalLanguage.g:783:1: entryRuleShortDescription returns [String current=null] : iv_ruleShortDescription= ruleShortDescription EOF ;
    public final String entryRuleShortDescription() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleShortDescription = null;


        try {
            // InternalLanguage.g:783:56: (iv_ruleShortDescription= ruleShortDescription EOF )
            // InternalLanguage.g:784:2: iv_ruleShortDescription= ruleShortDescription EOF
            {
             newCompositeNode(grammarAccess.getShortDescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleShortDescription=ruleShortDescription();

            state._fsp--;

             current =iv_ruleShortDescription.getText(); 
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
    // $ANTLR end "entryRuleShortDescription"


    // $ANTLR start "ruleShortDescription"
    // InternalLanguage.g:790:1: ruleShortDescription returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleShortDescription() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalLanguage.g:796:2: (this_STRING_0= RULE_STRING )
            // InternalLanguage.g:797:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getShortDescriptionAccess().getSTRINGTerminalRuleCall());
            	

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
    // $ANTLR end "ruleShortDescription"


    // $ANTLR start "entryRuleTitle"
    // InternalLanguage.g:807:1: entryRuleTitle returns [String current=null] : iv_ruleTitle= ruleTitle EOF ;
    public final String entryRuleTitle() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTitle = null;


        try {
            // InternalLanguage.g:807:45: (iv_ruleTitle= ruleTitle EOF )
            // InternalLanguage.g:808:2: iv_ruleTitle= ruleTitle EOF
            {
             newCompositeNode(grammarAccess.getTitleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTitle=ruleTitle();

            state._fsp--;

             current =iv_ruleTitle.getText(); 
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
    // $ANTLR end "entryRuleTitle"


    // $ANTLR start "ruleTitle"
    // InternalLanguage.g:814:1: ruleTitle returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleTitle() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalLanguage.g:820:2: (this_STRING_0= RULE_STRING )
            // InternalLanguage.g:821:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getTitleAccess().getSTRINGTerminalRuleCall());
            	

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
    // $ANTLR end "ruleTitle"


    // $ANTLR start "ruleAssociationType"
    // InternalLanguage.g:831:1: ruleAssociationType returns [Enumerator current=null] : ( (enumLiteral_0= 'COMBINATION' ) | (enumLiteral_1= 'FRAMING' ) | (enumLiteral_2= 'SEQUENCE' ) ) ;
    public final Enumerator ruleAssociationType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalLanguage.g:837:2: ( ( (enumLiteral_0= 'COMBINATION' ) | (enumLiteral_1= 'FRAMING' ) | (enumLiteral_2= 'SEQUENCE' ) ) )
            // InternalLanguage.g:838:2: ( (enumLiteral_0= 'COMBINATION' ) | (enumLiteral_1= 'FRAMING' ) | (enumLiteral_2= 'SEQUENCE' ) )
            {
            // InternalLanguage.g:838:2: ( (enumLiteral_0= 'COMBINATION' ) | (enumLiteral_1= 'FRAMING' ) | (enumLiteral_2= 'SEQUENCE' ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt15=1;
                }
                break;
            case 30:
                {
                alt15=2;
                }
                break;
            case 31:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalLanguage.g:839:3: (enumLiteral_0= 'COMBINATION' )
                    {
                    // InternalLanguage.g:839:3: (enumLiteral_0= 'COMBINATION' )
                    // InternalLanguage.g:840:4: enumLiteral_0= 'COMBINATION'
                    {
                    enumLiteral_0=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getAssociationTypeAccess().getCOMBINATIONEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAssociationTypeAccess().getCOMBINATIONEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLanguage.g:847:3: (enumLiteral_1= 'FRAMING' )
                    {
                    // InternalLanguage.g:847:3: (enumLiteral_1= 'FRAMING' )
                    // InternalLanguage.g:848:4: enumLiteral_1= 'FRAMING'
                    {
                    enumLiteral_1=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getAssociationTypeAccess().getFRAMINGEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAssociationTypeAccess().getFRAMINGEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalLanguage.g:855:3: (enumLiteral_2= 'SEQUENCE' )
                    {
                    // InternalLanguage.g:855:3: (enumLiteral_2= 'SEQUENCE' )
                    // InternalLanguage.g:856:4: enumLiteral_2= 'SEQUENCE'
                    {
                    enumLiteral_2=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getAssociationTypeAccess().getSEQUENCEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getAssociationTypeAccess().getSEQUENCEEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleAssociationType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000002C48802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000002C4E800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002C4C800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004080000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});

}