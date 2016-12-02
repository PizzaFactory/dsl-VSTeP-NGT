/**
 */
package vstepngt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstraction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vstepngt.Abstraction#getSuperClass <em>Super Class</em>}</li>
 *   <li>{@link vstepngt.Abstraction#getSubClass <em>Sub Class</em>}</li>
 * </ul>
 *
 * @see vstepngt.VstepngtPackage#getAbstraction()
 * @model
 * @generated
 */
public interface Abstraction extends Relationship {
	/**
	 * Returns the value of the '<em><b>Super Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Class</em>' reference.
	 * @see #setSuperClass(Testable)
	 * @see vstepngt.VstepngtPackage#getAbstraction_SuperClass()
	 * @model required="true"
	 * @generated
	 */
	Testable getSuperClass();

	/**
	 * Sets the value of the '{@link vstepngt.Abstraction#getSuperClass <em>Super Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Class</em>' reference.
	 * @see #getSuperClass()
	 * @generated
	 */
	void setSuperClass(Testable value);

	/**
	 * Returns the value of the '<em><b>Sub Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Class</em>' reference.
	 * @see #setSubClass(Testable)
	 * @see vstepngt.VstepngtPackage#getAbstraction_SubClass()
	 * @model required="true"
	 * @generated
	 */
	Testable getSubClass();

	/**
	 * Sets the value of the '{@link vstepngt.Abstraction#getSubClass <em>Sub Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Class</em>' reference.
	 * @see #getSubClass()
	 * @generated
	 */
	void setSubClass(Testable value);

} // Abstraction
