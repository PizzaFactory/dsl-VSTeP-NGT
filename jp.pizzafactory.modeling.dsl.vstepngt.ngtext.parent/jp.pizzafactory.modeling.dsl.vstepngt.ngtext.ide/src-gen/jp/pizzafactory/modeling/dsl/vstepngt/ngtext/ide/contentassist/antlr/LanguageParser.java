/*
 * generated by Xtext 2.10.0
 */
package jp.pizzafactory.modeling.dsl.vstepngt.ngtext.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import jp.pizzafactory.modeling.dsl.vstepngt.ngtext.ide.contentassist.antlr.internal.InternalLanguageParser;
import jp.pizzafactory.modeling.dsl.vstepngt.ngtext.services.LanguageGrammarAccess;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class LanguageParser extends AbstractContentAssistParser {

	@Inject
	private LanguageGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalLanguageParser createParser() {
		InternalLanguageParser result = new InternalLanguageParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getWorkspaceElementAccess().getAlternatives(), "rule__WorkspaceElement__Alternatives");
					put(grammarAccess.getComponentAccess().getAlternatives(), "rule__Component__Alternatives");
					put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
					put(grammarAccess.getAssociationTypeAccess().getAlternatives(), "rule__AssociationType__Alternatives");
					put(grammarAccess.getWorkspaceRootAccess().getGroup(), "rule__WorkspaceRoot__Group__0");
					put(grammarAccess.getContainerAccess().getGroup(), "rule__Container__Group__0");
					put(grammarAccess.getContainerAccess().getGroup_4(), "rule__Container__Group_4__0");
					put(grammarAccess.getContainerAccess().getGroup_5(), "rule__Container__Group_5__0");
					put(grammarAccess.getAbstractionAccess().getGroup(), "rule__Abstraction__Group__0");
					put(grammarAccess.getAggregationAccess().getGroup(), "rule__Aggregation__Group__0");
					put(grammarAccess.getAggregationAccess().getGroup_4(), "rule__Aggregation__Group_4__0");
					put(grammarAccess.getTestableAccess().getGroup(), "rule__Testable__Group__0");
					put(grammarAccess.getTestableAccess().getGroup_5(), "rule__Testable__Group_5__0");
					put(grammarAccess.getTestAssociationAccess().getGroup(), "rule__TestAssociation__Group__0");
					put(grammarAccess.getTestAssociationAccess().getGroup_3(), "rule__TestAssociation__Group_3__0");
					put(grammarAccess.getWorkspaceRootAccess().getElementsAssignment_0(), "rule__WorkspaceRoot__ElementsAssignment_0");
					put(grammarAccess.getWorkspaceRootAccess().getElementsAssignment_1(), "rule__WorkspaceRoot__ElementsAssignment_1");
					put(grammarAccess.getContainerAccess().getNameAssignment_2(), "rule__Container__NameAssignment_2");
					put(grammarAccess.getContainerAccess().getTitleAssignment_4_1(), "rule__Container__TitleAssignment_4_1");
					put(grammarAccess.getContainerAccess().getElementsAssignment_5_0(), "rule__Container__ElementsAssignment_5_0");
					put(grammarAccess.getContainerAccess().getElementsAssignment_5_1(), "rule__Container__ElementsAssignment_5_1");
					put(grammarAccess.getAbstractionAccess().getNameAssignment_1(), "rule__Abstraction__NameAssignment_1");
					put(grammarAccess.getAbstractionAccess().getSuperClassAssignment_4(), "rule__Abstraction__SuperClassAssignment_4");
					put(grammarAccess.getAbstractionAccess().getSubClassAssignment_6(), "rule__Abstraction__SubClassAssignment_6");
					put(grammarAccess.getAggregationAccess().getNameAssignment_2(), "rule__Aggregation__NameAssignment_2");
					put(grammarAccess.getAggregationAccess().getStereotypeAssignment_4_1(), "rule__Aggregation__StereotypeAssignment_4_1");
					put(grammarAccess.getAggregationAccess().getOwnerAssignment_6(), "rule__Aggregation__OwnerAssignment_6");
					put(grammarAccess.getAggregationAccess().getMemberAssignment_8(), "rule__Aggregation__MemberAssignment_8");
					put(grammarAccess.getTestableAccess().getIsRootAssignment_1(), "rule__Testable__IsRootAssignment_1");
					put(grammarAccess.getTestableAccess().getNameAssignment_3(), "rule__Testable__NameAssignment_3");
					put(grammarAccess.getTestableAccess().getShortDescriptionAssignment_5_1(), "rule__Testable__ShortDescriptionAssignment_5_1");
					put(grammarAccess.getTestAssociationAccess().getNameAssignment_1(), "rule__TestAssociation__NameAssignment_1");
					put(grammarAccess.getTestAssociationAccess().getStereotypeAssignment_3_1(), "rule__TestAssociation__StereotypeAssignment_3_1");
					put(grammarAccess.getTestAssociationAccess().getTypeAssignment_5(), "rule__TestAssociation__TypeAssignment_5");
					put(grammarAccess.getTestAssociationAccess().getSourceAssignment_7(), "rule__TestAssociation__SourceAssignment_7");
					put(grammarAccess.getTestAssociationAccess().getTargetAssignment_9(), "rule__TestAssociation__TargetAssignment_9");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalLanguageParser typedParser = (InternalLanguageParser) parser;
			typedParser.entryRuleWorkspaceRoot();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public LanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(LanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
