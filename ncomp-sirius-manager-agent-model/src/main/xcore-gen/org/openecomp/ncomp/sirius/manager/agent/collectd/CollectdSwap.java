
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
package org.openecomp.ncomp.sirius.manager.agent.collectd;

import org.eclipse.emf.ecore.EObject;
import org.openecomp.ncomp.core.types.metrics.DoubleMetricAttribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Swap</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdSwap#getCached <em>Cached</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdSwap#getFree <em>Free</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdSwap#getUsed <em>Used</em>}</li>
 * </ul>
 *
 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdSwap()
 * @model
 * @generated
 */
public interface CollectdSwap extends EObject {
	/**
	 * Returns the value of the '<em><b>Cached</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cached</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cached</em>' attribute.
	 * @see #setCached(DoubleMetricAttribute)
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdSwap_Cached()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.DoubleMetricAttribute" transient="true"
	 * @generated
	 */
	DoubleMetricAttribute getCached();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdSwap#getCached <em>Cached</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cached</em>' attribute.
	 * @see #getCached()
	 * @generated
	 */
	void setCached(DoubleMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>Free</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Free</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Free</em>' attribute.
	 * @see #setFree(DoubleMetricAttribute)
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdSwap_Free()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.DoubleMetricAttribute" transient="true"
	 * @generated
	 */
	DoubleMetricAttribute getFree();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdSwap#getFree <em>Free</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Free</em>' attribute.
	 * @see #getFree()
	 * @generated
	 */
	void setFree(DoubleMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>Used</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used</em>' attribute.
	 * @see #setUsed(DoubleMetricAttribute)
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdSwap_Used()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.DoubleMetricAttribute" transient="true"
	 * @generated
	 */
	DoubleMetricAttribute getUsed();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdSwap#getUsed <em>Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Used</em>' attribute.
	 * @see #getUsed()
	 * @generated
	 */
	void setUsed(DoubleMetricAttribute value);

} // CollectdSwap
