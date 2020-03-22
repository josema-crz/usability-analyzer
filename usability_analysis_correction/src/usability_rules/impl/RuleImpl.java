/**
 */
package usability_rules.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import usability_rules.Description;
import usability_rules.EOLCode;
import usability_rules.Importance;
import usability_rules.Range;
import usability_rules.Rule;
import usability_rules.Usability_rulesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link usability_rules.impl.RuleImpl#getCalculation <em>Calculation</em>}</li>
 *   <li>{@link usability_rules.impl.RuleImpl#getRestriction <em>Restriction</em>}</li>
 *   <li>{@link usability_rules.impl.RuleImpl#getCorrection <em>Correction</em>}</li>
 *   <li>{@link usability_rules.impl.RuleImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link usability_rules.impl.RuleImpl#getImportance <em>Importance</em>}</li>
 *   <li>{@link usability_rules.impl.RuleImpl#getRange <em>Range</em>}</li>
 *   <li>{@link usability_rules.impl.RuleImpl#getElementType <em>Element Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleImpl extends NamedElementImpl implements Rule {
	/**
	 * The cached value of the '{@link #getCalculation() <em>Calculation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalculation()
	 * @generated
	 * @ordered
	 */
	protected EOLCode calculation;

	/**
	 * The cached value of the '{@link #getRestriction() <em>Restriction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestriction()
	 * @generated
	 * @ordered
	 */
	protected EOLCode restriction;

	/**
	 * The cached value of the '{@link #getCorrection() <em>Correction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrection()
	 * @generated
	 * @ordered
	 */
	protected EOLCode correction;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected Description description;

	/**
	 * The default value of the '{@link #getImportance() <em>Importance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportance()
	 * @generated
	 * @ordered
	 */
	protected static final Importance IMPORTANCE_EDEFAULT = Importance.LOW;

	/**
	 * The cached value of the '{@link #getImportance() <em>Importance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportance()
	 * @generated
	 * @ordered
	 */
	protected Importance importance = IMPORTANCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRange() <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected Range range;

	/**
	 * The default value of the '{@link #getElementType() <em>Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementType()
	 * @generated
	 * @ordered
	 */
	protected static final String ELEMENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElementType() <em>Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementType()
	 * @generated
	 * @ordered
	 */
	protected String elementType = ELEMENT_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Usability_rulesPackage.Literals.RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOLCode getCalculation() {
		return calculation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCalculation(EOLCode newCalculation, NotificationChain msgs) {
		EOLCode oldCalculation = calculation;
		calculation = newCalculation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Usability_rulesPackage.RULE__CALCULATION, oldCalculation, newCalculation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalculation(EOLCode newCalculation) {
		if (newCalculation != calculation) {
			NotificationChain msgs = null;
			if (calculation != null)
				msgs = ((InternalEObject)calculation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Usability_rulesPackage.RULE__CALCULATION, null, msgs);
			if (newCalculation != null)
				msgs = ((InternalEObject)newCalculation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Usability_rulesPackage.RULE__CALCULATION, null, msgs);
			msgs = basicSetCalculation(newCalculation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Usability_rulesPackage.RULE__CALCULATION, newCalculation, newCalculation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOLCode getRestriction() {
		return restriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRestriction(EOLCode newRestriction, NotificationChain msgs) {
		EOLCode oldRestriction = restriction;
		restriction = newRestriction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Usability_rulesPackage.RULE__RESTRICTION, oldRestriction, newRestriction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRestriction(EOLCode newRestriction) {
		if (newRestriction != restriction) {
			NotificationChain msgs = null;
			if (restriction != null)
				msgs = ((InternalEObject)restriction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Usability_rulesPackage.RULE__RESTRICTION, null, msgs);
			if (newRestriction != null)
				msgs = ((InternalEObject)newRestriction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Usability_rulesPackage.RULE__RESTRICTION, null, msgs);
			msgs = basicSetRestriction(newRestriction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Usability_rulesPackage.RULE__RESTRICTION, newRestriction, newRestriction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOLCode getCorrection() {
		return correction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCorrection(EOLCode newCorrection, NotificationChain msgs) {
		EOLCode oldCorrection = correction;
		correction = newCorrection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Usability_rulesPackage.RULE__CORRECTION, oldCorrection, newCorrection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorrection(EOLCode newCorrection) {
		if (newCorrection != correction) {
			NotificationChain msgs = null;
			if (correction != null)
				msgs = ((InternalEObject)correction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Usability_rulesPackage.RULE__CORRECTION, null, msgs);
			if (newCorrection != null)
				msgs = ((InternalEObject)newCorrection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Usability_rulesPackage.RULE__CORRECTION, null, msgs);
			msgs = basicSetCorrection(newCorrection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Usability_rulesPackage.RULE__CORRECTION, newCorrection, newCorrection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Description getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(Description newDescription, NotificationChain msgs) {
		Description oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Usability_rulesPackage.RULE__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(Description newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Usability_rulesPackage.RULE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Usability_rulesPackage.RULE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Usability_rulesPackage.RULE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Importance getImportance() {
		return importance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportance(Importance newImportance) {
		Importance oldImportance = importance;
		importance = newImportance == null ? IMPORTANCE_EDEFAULT : newImportance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Usability_rulesPackage.RULE__IMPORTANCE, oldImportance, importance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Range getRange() {
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRange(Range newRange, NotificationChain msgs) {
		Range oldRange = range;
		range = newRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Usability_rulesPackage.RULE__RANGE, oldRange, newRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRange(Range newRange) {
		if (newRange != range) {
			NotificationChain msgs = null;
			if (range != null)
				msgs = ((InternalEObject)range).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Usability_rulesPackage.RULE__RANGE, null, msgs);
			if (newRange != null)
				msgs = ((InternalEObject)newRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Usability_rulesPackage.RULE__RANGE, null, msgs);
			msgs = basicSetRange(newRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Usability_rulesPackage.RULE__RANGE, newRange, newRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getElementType() {
		return elementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementType(String newElementType) {
		String oldElementType = elementType;
		elementType = newElementType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Usability_rulesPackage.RULE__ELEMENT_TYPE, oldElementType, elementType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Usability_rulesPackage.RULE__CALCULATION:
				return basicSetCalculation(null, msgs);
			case Usability_rulesPackage.RULE__RESTRICTION:
				return basicSetRestriction(null, msgs);
			case Usability_rulesPackage.RULE__CORRECTION:
				return basicSetCorrection(null, msgs);
			case Usability_rulesPackage.RULE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case Usability_rulesPackage.RULE__RANGE:
				return basicSetRange(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Usability_rulesPackage.RULE__CALCULATION:
				return getCalculation();
			case Usability_rulesPackage.RULE__RESTRICTION:
				return getRestriction();
			case Usability_rulesPackage.RULE__CORRECTION:
				return getCorrection();
			case Usability_rulesPackage.RULE__DESCRIPTION:
				return getDescription();
			case Usability_rulesPackage.RULE__IMPORTANCE:
				return getImportance();
			case Usability_rulesPackage.RULE__RANGE:
				return getRange();
			case Usability_rulesPackage.RULE__ELEMENT_TYPE:
				return getElementType();
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
			case Usability_rulesPackage.RULE__CALCULATION:
				setCalculation((EOLCode)newValue);
				return;
			case Usability_rulesPackage.RULE__RESTRICTION:
				setRestriction((EOLCode)newValue);
				return;
			case Usability_rulesPackage.RULE__CORRECTION:
				setCorrection((EOLCode)newValue);
				return;
			case Usability_rulesPackage.RULE__DESCRIPTION:
				setDescription((Description)newValue);
				return;
			case Usability_rulesPackage.RULE__IMPORTANCE:
				setImportance((Importance)newValue);
				return;
			case Usability_rulesPackage.RULE__RANGE:
				setRange((Range)newValue);
				return;
			case Usability_rulesPackage.RULE__ELEMENT_TYPE:
				setElementType((String)newValue);
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
			case Usability_rulesPackage.RULE__CALCULATION:
				setCalculation((EOLCode)null);
				return;
			case Usability_rulesPackage.RULE__RESTRICTION:
				setRestriction((EOLCode)null);
				return;
			case Usability_rulesPackage.RULE__CORRECTION:
				setCorrection((EOLCode)null);
				return;
			case Usability_rulesPackage.RULE__DESCRIPTION:
				setDescription((Description)null);
				return;
			case Usability_rulesPackage.RULE__IMPORTANCE:
				setImportance(IMPORTANCE_EDEFAULT);
				return;
			case Usability_rulesPackage.RULE__RANGE:
				setRange((Range)null);
				return;
			case Usability_rulesPackage.RULE__ELEMENT_TYPE:
				setElementType(ELEMENT_TYPE_EDEFAULT);
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
			case Usability_rulesPackage.RULE__CALCULATION:
				return calculation != null;
			case Usability_rulesPackage.RULE__RESTRICTION:
				return restriction != null;
			case Usability_rulesPackage.RULE__CORRECTION:
				return correction != null;
			case Usability_rulesPackage.RULE__DESCRIPTION:
				return description != null;
			case Usability_rulesPackage.RULE__IMPORTANCE:
				return importance != IMPORTANCE_EDEFAULT;
			case Usability_rulesPackage.RULE__RANGE:
				return range != null;
			case Usability_rulesPackage.RULE__ELEMENT_TYPE:
				return ELEMENT_TYPE_EDEFAULT == null ? elementType != null : !ELEMENT_TYPE_EDEFAULT.equals(elementType);
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
		result.append(" (importance: ");
		result.append(importance);
		result.append(", elementType: ");
		result.append(elementType);
		result.append(')');
		return result.toString();
	}

} //RuleImpl
