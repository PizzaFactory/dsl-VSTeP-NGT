/**
 */
package vstepngt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aggregation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vstepngt.Aggregation#getOwner <em>Owner</em>}</li>
 *   <li>{@link vstepngt.Aggregation#getMember <em>Member</em>}</li>
 * </ul>
 *
 * @see vstepngt.VstepngtPackage#getAggregation()
 * @model
 * @generated
 */
public interface Aggregation extends GenericAssociation {
	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(Component)
	 * @see vstepngt.VstepngtPackage#getAggregation_Owner()
	 * @model required="true"
	 * @generated
	 */
	Component getOwner();

	/**
	 * Sets the value of the '{@link vstepngt.Aggregation#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Component value);

	/**
	 * Returns the value of the '<em><b>Member</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' reference.
	 * @see #setMember(Testable)
	 * @see vstepngt.VstepngtPackage#getAggregation_Member()
	 * @model required="true"
	 * @generated
	 */
	Testable getMember();

	/**
	 * Sets the value of the '{@link vstepngt.Aggregation#getMember <em>Member</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member</em>' reference.
	 * @see #getMember()
	 * @generated
	 */
	void setMember(Testable value);

} // Aggregation
