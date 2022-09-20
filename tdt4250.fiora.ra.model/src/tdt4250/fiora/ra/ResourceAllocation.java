/**
 */
package tdt4250.fiora.ra;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Allocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.fiora.ra.ResourceAllocation#getCourse <em>Course</em>}</li>
 *   <li>{@link tdt4250.fiora.ra.ResourceAllocation#getPerson <em>Person</em>}</li>
 *   <li>{@link tdt4250.fiora.ra.ResourceAllocation#getFactor <em>Factor</em>}</li>
 * </ul>
 *
 * @see tdt4250.fiora.ra.RaPackage#getResourceAllocation()
 * @model
 * @generated
 */
public interface ResourceAllocation extends EObject {
	/**
	 * Returns the value of the '<em><b>Course</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tdt4250.fiora.ra.Course#getResourceAllocations <em>Resource Allocations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' container reference.
	 * @see #setCourse(Course)
	 * @see tdt4250.fiora.ra.RaPackage#getResourceAllocation_Course()
	 * @see tdt4250.fiora.ra.Course#getResourceAllocations
	 * @model opposite="resourceAllocations" transient="false"
	 * @generated
	 */
	Course getCourse();

	/**
	 * Sets the value of the '{@link tdt4250.fiora.ra.ResourceAllocation#getCourse <em>Course</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course</em>' container reference.
	 * @see #getCourse()
	 * @generated
	 */
	void setCourse(Course value);

	/**
	 * Returns the value of the '<em><b>Person</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tdt4250.fiora.ra.Person#getResourceAllocations <em>Resource Allocations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person</em>' reference.
	 * @see #setPerson(Person)
	 * @see tdt4250.fiora.ra.RaPackage#getResourceAllocation_Person()
	 * @see tdt4250.fiora.ra.Person#getResourceAllocations
	 * @model opposite="resourceAllocations"
	 * @generated
	 */
	Person getPerson();

	/**
	 * Sets the value of the '{@link tdt4250.fiora.ra.ResourceAllocation#getPerson <em>Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person</em>' reference.
	 * @see #getPerson()
	 * @generated
	 */
	void setPerson(Person value);

	/**
	 * Returns the value of the '<em><b>Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factor</em>' attribute.
	 * @see #setFactor(float)
	 * @see tdt4250.fiora.ra.RaPackage#getResourceAllocation_Factor()
	 * @model
	 * @generated
	 */
	float getFactor();

	/**
	 * Sets the value of the '{@link tdt4250.fiora.ra.ResourceAllocation#getFactor <em>Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factor</em>' attribute.
	 * @see #getFactor()
	 * @generated
	 */
	void setFactor(float value);

} // ResourceAllocation
