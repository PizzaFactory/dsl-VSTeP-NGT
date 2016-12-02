/**
 */
package vstepngt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Testable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vstepngt.Testable#getShortDescription <em>Short Description</em>}</li>
 *   <li>{@link vstepngt.Testable#isIsRoot <em>Is Root</em>}</li>
 * </ul>
 *
 * @see vstepngt.VstepngtPackage#getTestable()
 * @model
 * @generated
 */
public interface Testable extends Component {
	/**
	 * Returns the value of the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Short Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short Description</em>' attribute.
	 * @see #setShortDescription(String)
	 * @see vstepngt.VstepngtPackage#getTestable_ShortDescription()
	 * @model dataType="vstepngt.ShortDescription"
	 * @generated
	 */
	String getShortDescription();

	/**
	 * Sets the value of the '{@link vstepngt.Testable#getShortDescription <em>Short Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short Description</em>' attribute.
	 * @see #getShortDescription()
	 * @generated
	 */
	void setShortDescription(String value);

	/**
	 * Returns the value of the '<em><b>Is Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Root</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Root</em>' attribute.
	 * @see #setIsRoot(boolean)
	 * @see vstepngt.VstepngtPackage#getTestable_IsRoot()
	 * @model
	 * @generated
	 */
	boolean isIsRoot();

	/**
	 * Sets the value of the '{@link vstepngt.Testable#isIsRoot <em>Is Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Root</em>' attribute.
	 * @see #isIsRoot()
	 * @generated
	 */
	void setIsRoot(boolean value);

} // Testable
