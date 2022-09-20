/**
 */
package tdt4250.fiora.ra;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.fiora.ra.Person#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.fiora.ra.Person#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link tdt4250.fiora.ra.Person#getResourceAllocations <em>Resource Allocations</em>}</li>
 * </ul>
 *
 * @see tdt4250.fiora.ra.RaPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tdt4250.fiora.ra.RaPackage#getPerson_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tdt4250.fiora.ra.Person#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity</em>' attribute.
	 * @see #setCapacity(float)
	 * @see tdt4250.fiora.ra.RaPackage#getPerson_Capacity()
	 * @model
	 * @generated
	 */
	float getCapacity();

	/**
	 * Sets the value of the '{@link tdt4250.fiora.ra.Person#getCapacity <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' attribute.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(float value);

	/**
	 * Returns the value of the '<em><b>Resource Allocations</b></em>' reference list.
	 * The list contents are of type {@link tdt4250.fiora.ra.ResourceAllocation}.
	 * It is bidirectional and its opposite is '{@link tdt4250.fiora.ra.ResourceAllocation#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Allocations</em>' reference list.
	 * @see tdt4250.fiora.ra.RaPackage#getPerson_ResourceAllocations()
	 * @see tdt4250.fiora.ra.ResourceAllocation#getPerson
	 * @model opposite="person"
	 * @generated
	 */
	EList<ResourceAllocation> getResourceAllocations();

} // Person
