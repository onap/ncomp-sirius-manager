
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
package org.openecomp.ncomp.sirius.manager.tableTemplate;

import org.openecomp.ncomp.core.metrics.MetricValueOption;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metric Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.tableTemplate.TableTemplateMetricColumn#getPath <em>Path</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.tableTemplate.TableTemplateMetricColumn#getOption <em>Option</em>}</li>
 * </ul>
 *
 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.TableTemplatePackage#getTableTemplateMetricColumn()
 * @model
 * @generated
 */
public interface TableTemplateMetricColumn extends TableTemplateColumn {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.TableTemplatePackage#getTableTemplateMetricColumn_Path()
	 * @model unique="false"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.tableTemplate.TableTemplateMetricColumn#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Option</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Option</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option</em>' reference.
	 * @see #setOption(MetricValueOption)
	 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.TableTemplatePackage#getTableTemplateMetricColumn_Option()
	 * @model
	 * @generated
	 */
	MetricValueOption getOption();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.tableTemplate.TableTemplateMetricColumn#getOption <em>Option</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option</em>' reference.
	 * @see #getOption()
	 * @generated
	 */
	void setOption(MetricValueOption value);

} // TableTemplateMetricColumn
