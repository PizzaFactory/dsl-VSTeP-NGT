/**
 */
package vstepngt.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import vstepngt.Abstraction;
import vstepngt.Testable;
import vstepngt.VstepngtPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstraction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vstepngt.impl.AbstractionImpl#getSuperClass <em>Super Class</em>}</li>
 *   <li>{@link vstepngt.impl.AbstractionImpl#getSubClass <em>Sub Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractionImpl extends RelationshipImpl implements Abstraction {
	/**
	 * The cached value of the '{@link #getSuperClass() <em>Super Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperClass()
	 * @generated
	 * @ordered
	 */
	protected Testable superClass;

	/**
	 * The cached value of the '{@link #getSubClass() <em>Sub Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubClass()
	 * @generated
	 * @ordered
	 */
	protected Testable subClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VstepngtPackage.Literals.ABSTRACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Testable getSuperClass() {
		if (superClass != null && superClass.eIsProxy()) {
			InternalEObject oldSuperClass = (InternalEObject)superClass;
			superClass = (Testable)eResolveProxy(oldSuperClass);
			if (superClass != oldSuperClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VstepngtPackage.ABSTRACTION__SUPER_CLASS, oldSuperClass, superClass));
			}
		}
		return superClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Testable basicGetSuperClass() {
		return superClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperClass(Testable newSuperClass) {
		Testable oldSuperClass = superClass;
		superClass = newSuperClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VstepngtPackage.ABSTRACTION__SUPER_CLASS, oldSuperClass, superClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Testable getSubClass() {
		if (subClass != null && subClass.eIsProxy()) {
			InternalEObject oldSubClass = (InternalEObject)subClass;
			subClass = (Testable)eResolveProxy(oldSubClass);
			if (subClass != oldSubClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VstepngtPackage.ABSTRACTION__SUB_CLASS, oldSubClass, subClass));
			}
		}
		return subClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Testable basicGetSubClass() {
		return subClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubClass(Testable newSubClass) {
		Testable oldSubClass = subClass;
		subClass = newSubClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VstepngtPackage.ABSTRACTION__SUB_CLASS, oldSubClass, subClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VstepngtPackage.ABSTRACTION__SUPER_CLASS:
				if (resolve) return getSuperClass();
				return basicGetSuperClass();
			case VstepngtPackage.ABSTRACTION__SUB_CLASS:
				if (resolve) return getSubClass();
				return basicGetSubClass();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VstepngtPackage.ABSTRACTION__SUPER_CLASS:
				setSuperClass((Testable)newValue);
				return;
			case VstepngtPackage.ABSTRACTION__SUB_CLASS:
				setSubClass((Testable)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case VstepngtPackage.ABSTRACTION__SUPER_CLASS:
				setSuperClass((Testable)null);
				return;
			case VstepngtPackage.ABSTRACTION__SUB_CLASS:
				setSubClass((Testable)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case VstepngtPackage.ABSTRACTION__SUPER_CLASS:
				return superClass != null;
			case VstepngtPackage.ABSTRACTION__SUB_CLASS:
				return subClass != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractionImpl
