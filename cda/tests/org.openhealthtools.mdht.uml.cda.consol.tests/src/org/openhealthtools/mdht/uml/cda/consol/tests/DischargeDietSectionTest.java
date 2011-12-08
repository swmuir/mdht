/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.DischargeDietSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.DischargeDietSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Discharge Diet Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeDietSection#validateDischargeDietSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Diet Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeDietSection#validateDischargeDietSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Diet Section Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class DischargeDietSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeDietSectionTemplateId() {
		OperationsTestCase<DischargeDietSection> validateDischargeDietSectionTemplateIdTestCase = new OperationsTestCase<DischargeDietSection>(
			"validateDischargeDietSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_DIET_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeDietSection target) {

			}

			@Override
			protected void updateToPass(DischargeDietSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeDietSectionOperations.validateDischargeDietSectionTemplateId(
					(DischargeDietSection) objectToTest, diagnostician, map);
			}

		};

		validateDischargeDietSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeDietSectionCode() {
		OperationsTestCase<DischargeDietSection> validateDischargeDietSectionCodeTestCase = new OperationsTestCase<DischargeDietSection>(
			"validateDischargeDietSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_DIET_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeDietSection target) {

			}

			@Override
			protected void updateToPass(DischargeDietSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeDietSectionOperations.validateDischargeDietSectionCode(
					(DischargeDietSection) objectToTest, diagnostician, map);
			}

		};

		validateDischargeDietSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends DischargeDietSectionOperations {
		public String getOCLValue(String fieldName) {

			String oclValue = null;

			try {
				oclValue = (String) this.getClass().getSuperclass().getDeclaredField(fieldName).get(this);
			} catch (Exception e) {
				oclValue = "NO OCL FOUND FOR PROPERTY " + fieldName;
			}
			return oclValue;
		}
	}

	/**
	*
	* @generated
	*/
	private static class ObjectFactory implements TestObjectFactory<DischargeDietSection> {
		public DischargeDietSection create() {
			return ConsolFactory.eINSTANCE.createDischargeDietSection();
		}
	}

	/**
	*
	* @generated
	*/
	private static OperationsForOCL operationsForOCL = new OperationsForOCL();

	/**
	*
	* @generated
	*/
	private static ObjectFactory objectFactory = new ObjectFactory();

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	private static class ConstructorTestClass extends DischargeDietSectionOperations {
	};

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	@Test
	public void testConstructor() {
		@SuppressWarnings("unused")
		ConstructorTestClass constructorTestClass = new ConstructorTestClass();
	} // testConstructor

	/**
	*
	* @generated
	*/
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // DischargeDietSectionOperations