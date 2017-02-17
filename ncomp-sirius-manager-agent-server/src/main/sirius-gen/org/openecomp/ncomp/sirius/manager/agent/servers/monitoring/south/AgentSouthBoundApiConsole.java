
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
	
// Autogenerated
// Do not edit but extend this class as needed
package org.openecomp.ncomp.sirius.manager.agent.servers.monitoring.south;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.openecomp.ncomp.sirius.manager.console.Console;
import org.openecomp.ncomp.sirius.manager.ManagementServerError;




public class AgentSouthBoundApiConsole extends Console {
	public static final Logger logger = Logger.getLogger(AgentSouthBoundApiConsole.class);
    protected AgentSouthBoundApiClient controller;
    



    public AgentSouthBoundApiConsole(String filename, String name) {
            super(filename, name);
            controller = new AgentSouthBoundApiClient(filename,name);
            client = controller.client;

    }

	public void logs(EList<org.openecomp.ncomp.core.logs.LogMessage> logs) {
		
		try {
			 controller.logs(null,logs);
		}
		catch (ManagementServerError e) {
			System.err.println("ERROR: " + e.getJson().toString(2));
		}
		
	}

	public void metrics(EList<org.openecomp.ncomp.core.metrics.Metric> metrics) {
		
		try {
			 controller.metrics(null,metrics);
		}
		catch (ManagementServerError e) {
			System.err.println("ERROR: " + e.getJson().toString(2));
		}
		
	}

	public void properties(EList<org.openecomp.ncomp.sirius.manager.properties.AbstractProperty> l) {
		
		try {
			 controller.properties(null,l);
		}
		catch (ManagementServerError e) {
			System.err.println("ERROR: " + e.getJson().toString(2));
		}
		
	}

}