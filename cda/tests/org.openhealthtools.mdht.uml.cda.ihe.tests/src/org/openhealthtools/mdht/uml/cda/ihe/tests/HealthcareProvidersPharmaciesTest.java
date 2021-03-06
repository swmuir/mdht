/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ihe.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ihe.HealthcareProvidersPharmacies;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.operations.HealthcareProvidersPharmaciesOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Healthcare Providers Pharmacies</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.HealthcareProvidersPharmacies#validateHealthcareProvidersPharmaciesTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Healthcare Providers Pharmacies Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class HealthcareProvidersPharmaciesTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHealthcareProvidersPharmaciesTemplateId() {
		OperationsTestCase<HealthcareProvidersPharmacies> validateHealthcareProvidersPharmaciesTemplateIdTestCase = new OperationsTestCase<HealthcareProvidersPharmacies>(
			"validateHealthcareProvidersPharmaciesTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_HEALTHCARE_PROVIDERS_PHARMACIES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthcareProvidersPharmacies target) {

			}

			@Override
			protected void updateToPass(HealthcareProvidersPharmacies target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthcareProvidersPharmaciesOperations.validateHealthcareProvidersPharmaciesTemplateId(
					(HealthcareProvidersPharmacies) objectToTest, diagnostician, map);
			}

		};

		validateHealthcareProvidersPharmaciesTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends HealthcareProvidersPharmaciesOperations {
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
	private static class ObjectFactory implements TestObjectFactory<HealthcareProvidersPharmacies> {

		public HealthcareProvidersPharmacies create() {
			return IHEFactory.eINSTANCE.createHealthcareProvidersPharmacies();
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
	private static class ConstructorTestClass extends HealthcareProvidersPharmaciesOperations {
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

} // HealthcareProvidersPharmaciesOperations
