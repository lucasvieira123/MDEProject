/**
 */
package UMLActivityDiagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UML Acitivity Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UMLActivityDiagram.UMLAcitivityDiagram#getNodes <em>Nodes</em>}</li>
 *   <li>{@link UMLActivityDiagram.UMLAcitivityDiagram#getTransitions <em>Transitions</em>}</li>
 * </ul>
 *
 * @see UMLActivityDiagram.UMLActivityDiagramPackage#getUMLAcitivityDiagram()
 * @model
 * @generated
 */
public interface UMLAcitivityDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link UMLActivityDiagram.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see UMLActivityDiagram.UMLActivityDiagramPackage#getUMLAcitivityDiagram_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getNodes();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link UMLActivityDiagram.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see UMLActivityDiagram.UMLActivityDiagramPackage#getUMLAcitivityDiagram_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

} // UMLAcitivityDiagram
