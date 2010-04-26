/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.hitsp.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPlugin;
import org.openhealthtools.mdht.uml.cda.hitsp.ProblemListSection;
import org.openhealthtools.mdht.uml.cda.hitsp.util.HITSPValidator;
import org.openhealthtools.mdht.uml.cda.ihe.operations.ActiveProblemsSectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Problem List Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.ProblemListSection#validateProblemListSectionCondition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem List Section Condition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.ProblemListSection#validateProblemSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProblemListSectionOperations extends ActiveProblemsSectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProblemListSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemListSectionCondition(ProblemListSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem List Section Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemListSectionCondition(ProblemListSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_LIST_SECTION_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(hitsp::Condition))";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemListSectionCondition(ProblemListSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem List Section Condition</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemListSectionCondition(ProblemListSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROBLEM_LIST_SECTION_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(hitsp::Condition))
	 * @param problemListSection The receiving '<em><b>Problem List Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProblemListSectionCondition(ProblemListSection problemListSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROBLEM_LIST_SECTION_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.PROBLEM_LIST_SECTION);
			try {
				VALIDATE_PROBLEM_LIST_SECTION_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_LIST_SECTION_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_LIST_SECTION_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemListSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HITSPValidator.DIAGNOSTIC_SOURCE,
						 HITSPValidator.PROBLEM_LIST_SECTION__PROBLEM_LIST_SECTION_CONDITION,
						 HITSPPlugin.INSTANCE.getString("ProblemListSectionCondition"),
						 new Object [] { problemListSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemSectionTemplateId(ProblemListSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemSectionTemplateId(ProblemListSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.103')";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemSectionTemplateId(ProblemListSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemSectionTemplateId(ProblemListSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROBLEM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.103')
	 * @param problemListSection The receiving '<em><b>Problem List Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProblemSectionTemplateId(ProblemListSection problemListSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROBLEM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.PROBLEM_LIST_SECTION);
			try {
				VALIDATE_PROBLEM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemListSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HITSPValidator.DIAGNOSTIC_SOURCE,
						 HITSPValidator.PROBLEM_LIST_SECTION__PROBLEM_SECTION_TEMPLATE_ID,
						 HITSPPlugin.INSTANCE.getString("ProblemSectionTemplateId"),
						 new Object [] { problemListSection }));
			}
			return false;
		}
		return true;
	}

} // ProblemListSectionOperations