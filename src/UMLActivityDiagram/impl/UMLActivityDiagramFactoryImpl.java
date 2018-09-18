/**
 */
package UMLActivityDiagram.impl;

import UMLActivityDiagram.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UMLActivityDiagramFactoryImpl extends EFactoryImpl implements UMLActivityDiagramFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UMLActivityDiagramFactory init() {
		try {
			UMLActivityDiagramFactory theUMLActivityDiagramFactory = (UMLActivityDiagramFactory)EPackage.Registry.INSTANCE.getEFactory(UMLActivityDiagramPackage.eNS_URI);
			if (theUMLActivityDiagramFactory != null) {
				return theUMLActivityDiagramFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UMLActivityDiagramFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLActivityDiagramFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case UMLActivityDiagramPackage.UML_ACITIVITY_DIAGRAM: return createUMLAcitivityDiagram();
			case UMLActivityDiagramPackage.NODE: return createNode();
			case UMLActivityDiagramPackage.TRANSITION: return createTransition();
			case UMLActivityDiagramPackage.INITIAL_NODE: return createInitialNode();
			case UMLActivityDiagramPackage.ACTIVITY_NODE: return createActivityNode();
			case UMLActivityDiagramPackage.FINAL_NODE: return createFinalNode();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLAcitivityDiagram createUMLAcitivityDiagram() {
		UMLAcitivityDiagramImpl umlAcitivityDiagram = new UMLAcitivityDiagramImpl();
		return umlAcitivityDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialNode createInitialNode() {
		InitialNodeImpl initialNode = new InitialNodeImpl();
		return initialNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode createActivityNode() {
		ActivityNodeImpl activityNode = new ActivityNodeImpl();
		return activityNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalNode createFinalNode() {
		FinalNodeImpl finalNode = new FinalNodeImpl();
		return finalNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLActivityDiagramPackage getUMLActivityDiagramPackage() {
		return (UMLActivityDiagramPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UMLActivityDiagramPackage getPackage() {
		return UMLActivityDiagramPackage.eINSTANCE;
	}

} //UMLActivityDiagramFactoryImpl
