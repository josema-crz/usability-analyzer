/**
 */
package usability_rules;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link usability_rules.BooleanRange#isCorrectValue <em>Correct Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see usability_rules.Usability_rulesPackage#getBooleanRange()
 * @model
 * @generated
 */
public interface BooleanRange extends Range {
	/**
	 * Returns the value of the '<em><b>Correct Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correct Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correct Value</em>' attribute.
	 * @see #setCorrectValue(boolean)
	 * @see usability_rules.Usability_rulesPackage#getBooleanRange_CorrectValue()
	 * @model required="true"
	 * @generated
	 */
	boolean isCorrectValue();

	/**
	 * Sets the value of the '{@link usability_rules.BooleanRange#isCorrectValue <em>Correct Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correct Value</em>' attribute.
	 * @see #isCorrectValue()
	 * @generated
	 */
	void setCorrectValue(boolean value);

} // BooleanRange
