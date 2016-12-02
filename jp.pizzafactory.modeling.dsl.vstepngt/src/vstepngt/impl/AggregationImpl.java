/**
 */
package vstepngt.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import vstepngt.Aggregation;
import vstepngt.Component;
import vstepngt.Testable;
import vstepngt.VstepngtPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aggregation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vstepngt.impl.AggregationImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link vstepngt.impl.AggregationImpl#getMember <em>Member</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AggregationImpl extends GenericAssociationImpl implements Aggregation {
	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected Component owner;

	/**
	 * The cached value of the '{@link #getMember() <em>Member</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMember()
	 * @generated
	 * @ordered
	 */
	protected Testable member;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AggregationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VstepngtPackage.Literals.AGGREGATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getOwner() {
		if (owner != null && owner.eIsProxy()) {
			InternalEObject oldOwner = (InternalEObject)owner;
			owner = (Component)eResolveProxy(oldOwner);
			if (owner != oldOwner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VstepngtPackage.AGGREGATION__OWNER, oldOwner, owner));
			}
		}
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(Component newOwner) {
		Component oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VstepngtPackage.AGGREGATION__OWNER, oldOwner, owner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Testable getMember() {
		if (member != null && member.eIsProxy()) {
			InternalEObject oldMember = (InternalEObject)member;
			member = (Testable)eResolveProxy(oldMember);
			if (member != oldMember) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VstepngtPackage.AGGREGATION__MEMBER, oldMember, member));
			}
		}
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Testable basicGetMember() {
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMember(Testable newMember) {
		Testable oldMember = member;
		member = newMember;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VstepngtPackage.AGGREGATION__MEMBER, oldMember, member));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VstepngtPackage.AGGREGATION__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case VstepngtPackage.AGGREGATION__MEMBER:
				if (resolve) return getMember();
				return basicGetMember();
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
			case VstepngtPackage.AGGREGATION__OWNER:
				setOwner((Component)newValue);
				return;
			case VstepngtPackage.AGGREGATION__MEMBER:
				setMember((Testable)newValue);
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
			case VstepngtPackage.AGGREGATION__OWNER:
				setOwner((Component)null);
				return;
			case VstepngtPackage.AGGREGATION__MEMBER:
				setMember((Testable)null);
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
			case VstepngtPackage.AGGREGATION__OWNER:
				return owner != null;
			case VstepngtPackage.AGGREGATION__MEMBER:
				return member != null;
		}
		return super.eIsSet(featureID);
	}

} //AggregationImpl
