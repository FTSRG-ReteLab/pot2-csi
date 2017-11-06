/**
 */
package hu.bme.mit.inf.critlab.codegen.dfd.pid;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dataflow Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.critlab.codegen.dfd.pid.DataflowDiagram#getNodes <em>Nodes</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.critlab.codegen.dfd.pid.PidPackage#getDataflowDiagram()
 * @model
 * @generated
 */
public interface DataflowDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.critlab.codegen.dfd.pid.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see hu.bme.mit.inf.critlab.codegen.dfd.pid.PidPackage#getDataflowDiagram_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getNodes();

} // DataflowDiagram
