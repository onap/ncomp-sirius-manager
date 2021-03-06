
/*-
 * ============LICENSE_START==========================================
 * OPENECOMP - DCAE
 * ===================================================================
 * Copyright (c) 2017 AT&T Intellectual Property. All rights reserved.
 * ===================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0 
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ============LICENSE_END============================================
 */
	
/**
 */
package org.openecomp.ncomp.sirius.manager.swagger;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Collection Format</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerPackage#getSwaggerCollectionFormat()
 * @model
 * @generated
 */
public enum SwaggerCollectionFormat implements Enumerator {
	/**
	 * The '<em><b>Csv</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CSV_VALUE
	 * @generated
	 * @ordered
	 */
	CSV(0, "csv", "csv"),

	/**
	 * The '<em><b>Ssv</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SSV_VALUE
	 * @generated
	 * @ordered
	 */
	SSV(0, "ssv", "ssv"), /**
	 * The '<em><b>Tsv</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TSV_VALUE
	 * @generated
	 * @ordered
	 */
	TSV(0, "tsv", "tsv"), /**
	 * The '<em><b>Pipes</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIPES_VALUE
	 * @generated
	 * @ordered
	 */
	PIPES(0, "pipes", "pipes"), /**
	 * The '<em><b>Multi</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTI_VALUE
	 * @generated
	 * @ordered
	 */
	MULTI(0, "multi", "multi");

	/**
	 * The '<em><b>Csv</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CSV</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CSV
	 * @model name="csv"
	 * @generated
	 * @ordered
	 */
	public static final int CSV_VALUE = 0;

	/**
	 * The '<em><b>Ssv</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ssv</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SSV
	 * @model name="ssv"
	 * @generated
	 * @ordered
	 */
	public static final int SSV_VALUE = 0;

	/**
	 * The '<em><b>Tsv</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tsv</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TSV
	 * @model name="tsv"
	 * @generated
	 * @ordered
	 */
	public static final int TSV_VALUE = 0;

	/**
	 * The '<em><b>Pipes</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pipes</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIPES
	 * @model name="pipes"
	 * @generated
	 * @ordered
	 */
	public static final int PIPES_VALUE = 0;

	/**
	 * The '<em><b>Multi</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Multi</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MULTI
	 * @model name="multi"
	 * @generated
	 * @ordered
	 */
	public static final int MULTI_VALUE = 0;

	/**
	 * An array of all the '<em><b>Collection Format</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SwaggerCollectionFormat[] VALUES_ARRAY =
		new SwaggerCollectionFormat[] {
			CSV,
			SSV,
			TSV,
			PIPES,
			MULTI,
		};

	/**
	 * A public read-only list of all the '<em><b>Collection Format</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SwaggerCollectionFormat> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Collection Format</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SwaggerCollectionFormat get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SwaggerCollectionFormat result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Collection Format</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SwaggerCollectionFormat getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SwaggerCollectionFormat result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Collection Format</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SwaggerCollectionFormat get(int value) {
		switch (value) {
			case CSV_VALUE: return CSV;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private SwaggerCollectionFormat(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //SwaggerCollectionFormat
