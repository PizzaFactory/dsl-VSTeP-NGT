/**
 */
package vstepngt;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see vstepngt.VstepngtPackage
 * @generated
 */
public interface VstepngtFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VstepngtFactory eINSTANCE = vstepngt.impl.VstepngtFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container</em>'.
	 * @generated
	 */
	Container createContainer();

	/**
	 * Returns a new object of class '<em>Abstraction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstraction</em>'.
	 * @generated
	 */
	Abstraction createAbstraction();

	/**
	 * Returns a new object of class '<em>Aggregation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aggregation</em>'.
	 * @generated
	 */
	Aggregation createAggregation();

	/**
	 * Returns a new object of class '<em>Testable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Testable</em>'.
	 * @generated
	 */
	Testable createTestable();

	/**
	 * Returns a new object of class '<em>Test Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Association</em>'.
	 * @generated
	 */
	TestAssociation createTestAssociation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	VstepngtPackage getVstepngtPackage();

} //VstepngtFactory
