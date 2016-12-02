/**
 */
package vstepngt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vstepngt.TestAssociation#getSource <em>Source</em>}</li>
 *   <li>{@link vstepngt.TestAssociation#getTarget <em>Target</em>}</li>
 *   <li>{@link vstepngt.TestAssociation#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see vstepngt.VstepngtPackage#getTestAssociation()
 * @model
 * @generated
 */
public interface TestAssociation extends GenericAssociation {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Testable)
	 * @see vstepngt.VstepngtPackage#getTestAssociation_Source()
	 * @model required="true"
	 * @generated
	 */
	Testable getSource();

	/**
	 * Sets the value of the '{@link vstepngt.TestAssociation#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Testable value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Testable)
	 * @see vstepngt.VstepngtPackage#getTestAssociation_Target()
	 * @model required="true"
	 * @generated
	 */
	Testable getTarget();

	/**
	 * Sets the value of the '{@link vstepngt.TestAssociation#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Testable value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link vstepngt.AssociationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see vstepngt.AssociationType
	 * @see #setType(AssociationType)
	 * @see vstepngt.VstepngtPackage#getTestAssociation_Type()
	 * @model
	 * @generated
	 */
	AssociationType getType();

	/**
	 * Sets the value of the '{@link vstepngt.TestAssociation#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see vstepngt.AssociationType
	 * @see #getType()
	 * @generated
	 */
	void setType(AssociationType value);

} // TestAssociation
