/**
 */
package vstepngt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vstepngt.Relationship#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see vstepngt.VstepngtPackage#getRelationship()
 * @model abstract="true"
 * @generated
 */
public interface Relationship extends WorkspaceElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see vstepngt.VstepngtPackage#getRelationship_Name()
	 * @model dataType="vstepngt.Identifiable"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link vstepngt.Relationship#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Relationship
