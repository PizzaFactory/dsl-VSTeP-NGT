/**
 */
package vstepngt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vstepngt.GenericAssociation#getStereotype <em>Stereotype</em>}</li>
 * </ul>
 *
 * @see vstepngt.VstepngtPackage#getGenericAssociation()
 * @model abstract="true"
 * @generated
 */
public interface GenericAssociation extends Relationship {
	/**
	 * Returns the value of the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stereotype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stereotype</em>' attribute.
	 * @see #setStereotype(String)
	 * @see vstepngt.VstepngtPackage#getGenericAssociation_Stereotype()
	 * @model dataType="vstepngt.Stereotype"
	 * @generated
	 */
	String getStereotype();

	/**
	 * Sets the value of the '{@link vstepngt.GenericAssociation#getStereotype <em>Stereotype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stereotype</em>' attribute.
	 * @see #getStereotype()
	 * @generated
	 */
	void setStereotype(String value);

} // GenericAssociation
