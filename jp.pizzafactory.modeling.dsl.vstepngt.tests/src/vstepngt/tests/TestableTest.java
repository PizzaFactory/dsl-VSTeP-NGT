/**
 */
package vstepngt.tests;

import junit.textui.TestRunner;
import vstepngt.Testable;
import vstepngt.VstepngtFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Testable</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TestableTest extends ComponentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TestableTest.class);
	}

	/**
	 * Constructs a new Testable test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestableTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Testable test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Testable getFixture() {
		return (Testable)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(VstepngtFactory.eINSTANCE.createTestable());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //TestableTest
