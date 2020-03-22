/**
 */
package usability_rules.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import usability_rules.StringRange;
import usability_rules.Usability_rulesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link usability_rules.impl.StringRangeImpl#getCorrectValues <em>Correct Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StringRangeImpl extends RangeImpl implements StringRange {
	/**
	 * The default value of the '{@link #getCorrectValues() <em>Correct Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrectValues()
	 * @generated
	 * @ordered
	 */
	protected static final String CORRECT_VALUES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCorrectValues() <em>Correct Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrectValues()
	 * @generated
	 * @ordered
	 */
	protected String correctValues = CORRECT_VALUES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringRangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Usability_rulesPackage.Literals.STRING_RANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCorrectValues() {
		return correctValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorrectValues(String newCorrectValues) {
		String oldCorrectValues = correctValues;
		correctValues = newCorrectValues;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Usability_rulesPackage.STRING_RANGE__CORRECT_VALUES, oldCorrectValues, correctValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Usability_rulesPackage.STRING_RANGE__CORRECT_VALUES:
				return getCorrectValues();
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
			case Usability_rulesPackage.STRING_RANGE__CORRECT_VALUES:
				setCorrectValues((String)newValue);
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
			case Usability_rulesPackage.STRING_RANGE__CORRECT_VALUES:
				setCorrectValues(CORRECT_VALUES_EDEFAULT);
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
			case Usability_rulesPackage.STRING_RANGE__CORRECT_VALUES:
				return CORRECT_VALUES_EDEFAULT == null ? correctValues != null : !CORRECT_VALUES_EDEFAULT.equals(correctValues);
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
		result.append(" (correctValues: ");
		result.append(correctValues);
		result.append(')');
		return result.toString();
	}

} //StringRangeImpl
