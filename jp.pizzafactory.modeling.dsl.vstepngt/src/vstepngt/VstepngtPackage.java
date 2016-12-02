/**
 */
package vstepngt;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see vstepngt.VstepngtFactory
 * @model kind="package"
 * @generated
 */
public interface VstepngtPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "vstepngt";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/vstepngt";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "vstepngt";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VstepngtPackage eINSTANCE = vstepngt.impl.VstepngtPackageImpl.init();

	/**
	 * The meta object id for the '{@link vstepngt.WorkspaceElement <em>Workspace Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vstepngt.WorkspaceElement
	 * @see vstepngt.impl.VstepngtPackageImpl#getWorkspaceElement()
	 * @generated
	 */
	int WORKSPACE_ELEMENT = 8;

	/**
	 * The number of structural features of the '<em>Workspace Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Workspace Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link vstepngt.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vstepngt.impl.ComponentImpl
	 * @see vstepngt.impl.VstepngtPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = WORKSPACE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = WORKSPACE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = WORKSPACE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vstepngt.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vstepngt.impl.ContainerImpl
	 * @see vstepngt.impl.VstepngtPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ELEMENTS = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__TITLE = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vstepngt.impl.RelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vstepngt.impl.RelationshipImpl
	 * @see vstepngt.impl.VstepngtPackageImpl#getRelationship()
	 * @generated
	 */
	int RELATIONSHIP = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__NAME = WORKSPACE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_FEATURE_COUNT = WORKSPACE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_OPERATION_COUNT = WORKSPACE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vstepngt.impl.AbstractionImpl <em>Abstraction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vstepngt.impl.AbstractionImpl
	 * @see vstepngt.impl.VstepngtPackageImpl#getAbstraction()
	 * @generated
	 */
	int ABSTRACTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION__NAME = RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION__SUPER_CLASS = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION__SUB_CLASS = RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstraction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Abstraction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION_OPERATION_COUNT = RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vstepngt.impl.GenericAssociationImpl <em>Generic Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vstepngt.impl.GenericAssociationImpl
	 * @see vstepngt.impl.VstepngtPackageImpl#getGenericAssociation()
	 * @generated
	 */
	int GENERIC_ASSOCIATION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_ASSOCIATION__NAME = RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_ASSOCIATION__STEREOTYPE = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Generic Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_ASSOCIATION_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Generic Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_ASSOCIATION_OPERATION_COUNT = RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vstepngt.impl.AggregationImpl <em>Aggregation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vstepngt.impl.AggregationImpl
	 * @see vstepngt.impl.VstepngtPackageImpl#getAggregation()
	 * @generated
	 */
	int AGGREGATION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__NAME = GENERIC_ASSOCIATION__NAME;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__STEREOTYPE = GENERIC_ASSOCIATION__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__OWNER = GENERIC_ASSOCIATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__MEMBER = GENERIC_ASSOCIATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_FEATURE_COUNT = GENERIC_ASSOCIATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_OPERATION_COUNT = GENERIC_ASSOCIATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vstepngt.impl.TestableImpl <em>Testable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vstepngt.impl.TestableImpl
	 * @see vstepngt.impl.VstepngtPackageImpl#getTestable()
	 * @generated
	 */
	int TESTABLE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTABLE__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTABLE__SHORT_DESCRIPTION = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTABLE__IS_ROOT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Testable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTABLE_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Testable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTABLE_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vstepngt.impl.TestAssociationImpl <em>Test Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vstepngt.impl.TestAssociationImpl
	 * @see vstepngt.impl.VstepngtPackageImpl#getTestAssociation()
	 * @generated
	 */
	int TEST_ASSOCIATION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ASSOCIATION__NAME = GENERIC_ASSOCIATION__NAME;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ASSOCIATION__STEREOTYPE = GENERIC_ASSOCIATION__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ASSOCIATION__SOURCE = GENERIC_ASSOCIATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ASSOCIATION__TARGET = GENERIC_ASSOCIATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ASSOCIATION__TYPE = GENERIC_ASSOCIATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Test Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ASSOCIATION_FEATURE_COUNT = GENERIC_ASSOCIATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Test Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ASSOCIATION_OPERATION_COUNT = GENERIC_ASSOCIATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vstepngt.AssociationType <em>Association Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vstepngt.AssociationType
	 * @see vstepngt.impl.VstepngtPackageImpl#getAssociationType()
	 * @generated
	 */
	int ASSOCIATION_TYPE = 9;

	/**
	 * The meta object id for the '<em>Stereotype</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see vstepngt.impl.VstepngtPackageImpl#getStereotype()
	 * @generated
	 */
	int STEREOTYPE = 10;

	/**
	 * The meta object id for the '<em>Identifiable</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see vstepngt.impl.VstepngtPackageImpl#getIdentifiable()
	 * @generated
	 */
	int IDENTIFIABLE = 11;

	/**
	 * The meta object id for the '<em>Short Description</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see vstepngt.impl.VstepngtPackageImpl#getShortDescription()
	 * @generated
	 */
	int SHORT_DESCRIPTION = 12;


	/**
	 * Returns the meta object for class '{@link vstepngt.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see vstepngt.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link vstepngt.Container#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see vstepngt.Container#getElements()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Elements();

	/**
	 * Returns the meta object for the attribute '{@link vstepngt.Container#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see vstepngt.Container#getTitle()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Title();

	/**
	 * Returns the meta object for class '{@link vstepngt.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see vstepngt.Relationship
	 * @generated
	 */
	EClass getRelationship();

	/**
	 * Returns the meta object for the attribute '{@link vstepngt.Relationship#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see vstepngt.Relationship#getName()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_Name();

	/**
	 * Returns the meta object for class '{@link vstepngt.Abstraction <em>Abstraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstraction</em>'.
	 * @see vstepngt.Abstraction
	 * @generated
	 */
	EClass getAbstraction();

	/**
	 * Returns the meta object for the reference '{@link vstepngt.Abstraction#getSuperClass <em>Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Class</em>'.
	 * @see vstepngt.Abstraction#getSuperClass()
	 * @see #getAbstraction()
	 * @generated
	 */
	EReference getAbstraction_SuperClass();

	/**
	 * Returns the meta object for the reference '{@link vstepngt.Abstraction#getSubClass <em>Sub Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sub Class</em>'.
	 * @see vstepngt.Abstraction#getSubClass()
	 * @see #getAbstraction()
	 * @generated
	 */
	EReference getAbstraction_SubClass();

	/**
	 * Returns the meta object for class '{@link vstepngt.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see vstepngt.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the attribute '{@link vstepngt.Component#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see vstepngt.Component#getName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Name();

	/**
	 * Returns the meta object for class '{@link vstepngt.Aggregation <em>Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregation</em>'.
	 * @see vstepngt.Aggregation
	 * @generated
	 */
	EClass getAggregation();

	/**
	 * Returns the meta object for the reference '{@link vstepngt.Aggregation#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see vstepngt.Aggregation#getOwner()
	 * @see #getAggregation()
	 * @generated
	 */
	EReference getAggregation_Owner();

	/**
	 * Returns the meta object for the reference '{@link vstepngt.Aggregation#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Member</em>'.
	 * @see vstepngt.Aggregation#getMember()
	 * @see #getAggregation()
	 * @generated
	 */
	EReference getAggregation_Member();

	/**
	 * Returns the meta object for class '{@link vstepngt.GenericAssociation <em>Generic Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Association</em>'.
	 * @see vstepngt.GenericAssociation
	 * @generated
	 */
	EClass getGenericAssociation();

	/**
	 * Returns the meta object for the attribute '{@link vstepngt.GenericAssociation#getStereotype <em>Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stereotype</em>'.
	 * @see vstepngt.GenericAssociation#getStereotype()
	 * @see #getGenericAssociation()
	 * @generated
	 */
	EAttribute getGenericAssociation_Stereotype();

	/**
	 * Returns the meta object for class '{@link vstepngt.Testable <em>Testable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Testable</em>'.
	 * @see vstepngt.Testable
	 * @generated
	 */
	EClass getTestable();

	/**
	 * Returns the meta object for the attribute '{@link vstepngt.Testable#getShortDescription <em>Short Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Description</em>'.
	 * @see vstepngt.Testable#getShortDescription()
	 * @see #getTestable()
	 * @generated
	 */
	EAttribute getTestable_ShortDescription();

	/**
	 * Returns the meta object for the attribute '{@link vstepngt.Testable#isIsRoot <em>Is Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Root</em>'.
	 * @see vstepngt.Testable#isIsRoot()
	 * @see #getTestable()
	 * @generated
	 */
	EAttribute getTestable_IsRoot();

	/**
	 * Returns the meta object for class '{@link vstepngt.TestAssociation <em>Test Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Association</em>'.
	 * @see vstepngt.TestAssociation
	 * @generated
	 */
	EClass getTestAssociation();

	/**
	 * Returns the meta object for the reference '{@link vstepngt.TestAssociation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see vstepngt.TestAssociation#getSource()
	 * @see #getTestAssociation()
	 * @generated
	 */
	EReference getTestAssociation_Source();

	/**
	 * Returns the meta object for the reference '{@link vstepngt.TestAssociation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see vstepngt.TestAssociation#getTarget()
	 * @see #getTestAssociation()
	 * @generated
	 */
	EReference getTestAssociation_Target();

	/**
	 * Returns the meta object for the attribute '{@link vstepngt.TestAssociation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see vstepngt.TestAssociation#getType()
	 * @see #getTestAssociation()
	 * @generated
	 */
	EAttribute getTestAssociation_Type();

	/**
	 * Returns the meta object for class '{@link vstepngt.WorkspaceElement <em>Workspace Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workspace Element</em>'.
	 * @see vstepngt.WorkspaceElement
	 * @generated
	 */
	EClass getWorkspaceElement();

	/**
	 * Returns the meta object for enum '{@link vstepngt.AssociationType <em>Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Association Type</em>'.
	 * @see vstepngt.AssociationType
	 * @generated
	 */
	EEnum getAssociationType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Stereotype</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getStereotype();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Identifiable</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getIdentifiable();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Short Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Short Description</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getShortDescription();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VstepngtFactory getVstepngtFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link vstepngt.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vstepngt.impl.ContainerImpl
		 * @see vstepngt.impl.VstepngtPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__ELEMENTS = eINSTANCE.getContainer_Elements();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__TITLE = eINSTANCE.getContainer_Title();

		/**
		 * The meta object literal for the '{@link vstepngt.impl.RelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vstepngt.impl.RelationshipImpl
		 * @see vstepngt.impl.VstepngtPackageImpl#getRelationship()
		 * @generated
		 */
		EClass RELATIONSHIP = eINSTANCE.getRelationship();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__NAME = eINSTANCE.getRelationship_Name();

		/**
		 * The meta object literal for the '{@link vstepngt.impl.AbstractionImpl <em>Abstraction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vstepngt.impl.AbstractionImpl
		 * @see vstepngt.impl.VstepngtPackageImpl#getAbstraction()
		 * @generated
		 */
		EClass ABSTRACTION = eINSTANCE.getAbstraction();

		/**
		 * The meta object literal for the '<em><b>Super Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACTION__SUPER_CLASS = eINSTANCE.getAbstraction_SuperClass();

		/**
		 * The meta object literal for the '<em><b>Sub Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACTION__SUB_CLASS = eINSTANCE.getAbstraction_SubClass();

		/**
		 * The meta object literal for the '{@link vstepngt.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vstepngt.impl.ComponentImpl
		 * @see vstepngt.impl.VstepngtPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

		/**
		 * The meta object literal for the '{@link vstepngt.impl.AggregationImpl <em>Aggregation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vstepngt.impl.AggregationImpl
		 * @see vstepngt.impl.VstepngtPackageImpl#getAggregation()
		 * @generated
		 */
		EClass AGGREGATION = eINSTANCE.getAggregation();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATION__OWNER = eINSTANCE.getAggregation_Owner();

		/**
		 * The meta object literal for the '<em><b>Member</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATION__MEMBER = eINSTANCE.getAggregation_Member();

		/**
		 * The meta object literal for the '{@link vstepngt.impl.GenericAssociationImpl <em>Generic Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vstepngt.impl.GenericAssociationImpl
		 * @see vstepngt.impl.VstepngtPackageImpl#getGenericAssociation()
		 * @generated
		 */
		EClass GENERIC_ASSOCIATION = eINSTANCE.getGenericAssociation();

		/**
		 * The meta object literal for the '<em><b>Stereotype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_ASSOCIATION__STEREOTYPE = eINSTANCE.getGenericAssociation_Stereotype();

		/**
		 * The meta object literal for the '{@link vstepngt.impl.TestableImpl <em>Testable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vstepngt.impl.TestableImpl
		 * @see vstepngt.impl.VstepngtPackageImpl#getTestable()
		 * @generated
		 */
		EClass TESTABLE = eINSTANCE.getTestable();

		/**
		 * The meta object literal for the '<em><b>Short Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTABLE__SHORT_DESCRIPTION = eINSTANCE.getTestable_ShortDescription();

		/**
		 * The meta object literal for the '<em><b>Is Root</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTABLE__IS_ROOT = eINSTANCE.getTestable_IsRoot();

		/**
		 * The meta object literal for the '{@link vstepngt.impl.TestAssociationImpl <em>Test Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vstepngt.impl.TestAssociationImpl
		 * @see vstepngt.impl.VstepngtPackageImpl#getTestAssociation()
		 * @generated
		 */
		EClass TEST_ASSOCIATION = eINSTANCE.getTestAssociation();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_ASSOCIATION__SOURCE = eINSTANCE.getTestAssociation_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_ASSOCIATION__TARGET = eINSTANCE.getTestAssociation_Target();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_ASSOCIATION__TYPE = eINSTANCE.getTestAssociation_Type();

		/**
		 * The meta object literal for the '{@link vstepngt.WorkspaceElement <em>Workspace Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vstepngt.WorkspaceElement
		 * @see vstepngt.impl.VstepngtPackageImpl#getWorkspaceElement()
		 * @generated
		 */
		EClass WORKSPACE_ELEMENT = eINSTANCE.getWorkspaceElement();

		/**
		 * The meta object literal for the '{@link vstepngt.AssociationType <em>Association Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vstepngt.AssociationType
		 * @see vstepngt.impl.VstepngtPackageImpl#getAssociationType()
		 * @generated
		 */
		EEnum ASSOCIATION_TYPE = eINSTANCE.getAssociationType();

		/**
		 * The meta object literal for the '<em>Stereotype</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see vstepngt.impl.VstepngtPackageImpl#getStereotype()
		 * @generated
		 */
		EDataType STEREOTYPE = eINSTANCE.getStereotype();

		/**
		 * The meta object literal for the '<em>Identifiable</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see vstepngt.impl.VstepngtPackageImpl#getIdentifiable()
		 * @generated
		 */
		EDataType IDENTIFIABLE = eINSTANCE.getIdentifiable();

		/**
		 * The meta object literal for the '<em>Short Description</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see vstepngt.impl.VstepngtPackageImpl#getShortDescription()
		 * @generated
		 */
		EDataType SHORT_DESCRIPTION = eINSTANCE.getShortDescription();

	}

} //VstepngtPackage
