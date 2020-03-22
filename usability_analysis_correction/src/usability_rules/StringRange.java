/**
 */
package usability_rules;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link usability_rules.StringRange#getCorrectValues <em>Correct Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see usability_rules.Usability_rulesPackage#getStringRange()
 * @model
 * @generated
 */
public interface StringRange extends Range {
	/**
	 * Returns the value of the '<em><b>Correct Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correct Values</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correct Values</em>' attribute.
	 * @see #setCorrectValues(String)
	 * @see usability_rules.Usability_rulesPackage#getStringRange_CorrectValues()
	 * @model required="true"
	 * @generated
	 */
	String getCorrectValues();

	/**
	 * Sets the value of the '{@link usability_rules.StringRange#getCorrectValues <em>Correct Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correct Values</em>' attribute.
	 * @see #getCorrectValues()
	 * @generated
	 */
	void setCorrectValues(String value);

} // StringRange
