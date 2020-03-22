/**
 */
package usability_rules.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import usability_rules.BooleanRange;
import usability_rules.Usability_rulesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link usability_rules.impl.BooleanRangeImpl#isCorrectValue <em>Correct Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BooleanRangeImpl extends RangeImpl implements BooleanRange {
	/**
	 * The default value of the '{@link #isCorrectValue() <em>Correct Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCorrectValue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CORRECT_VALUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCorrectValue() <em>Correct Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCorrectValue()
	 * @generated
	 * @ordered
	 */
	protected boolean correctValue = CORRECT_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanRangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Usability_rulesPackage.Literals.BOOLEAN_RANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCorrectValue() {
		return correctValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorrectValue(boolean newCorrectValue) {
		boolean oldCorrectValue = correctValue;
		correctValue = newCorrectValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Usability_rulesPackage.BOOLEAN_RANGE__CORRECT_VALUE, oldCorrectValue, correctValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Usability_rulesPackage.BOOLEAN_RANGE__CORRECT_VALUE:
				return isCorrectValue();
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
			case Usability_rulesPackage.BOOLEAN_RANGE__CORRECT_VALUE:
				setCorrectValue((Boolean)newValue);
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
			case Usability_rulesPackage.BOOLEAN_RANGE__CORRECT_VALUE:
				setCorrectValue(CORRECT_VALUE_EDEFAULT);
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
			case Usability_rulesPackage.BOOLEAN_RANGE__CORRECT_VALUE:
				return correctValue != CORRECT_VALUE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (correctValue: ");
		result.append(correctValue);
		result.append(')');
		return result.toString();
	}

} //BooleanRangeImpl
