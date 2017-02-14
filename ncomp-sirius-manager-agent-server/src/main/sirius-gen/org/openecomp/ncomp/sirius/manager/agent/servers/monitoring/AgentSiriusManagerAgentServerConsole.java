
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
package org.openecomp.ncomp.sirius.manager.agent.servers.monitoring;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.openecomp.ncomp.sirius.manager.console.Console;
import org.openecomp.ncomp.sirius.manager.ManagementServerError;

    
import org.openecomp.ncomp.sirius.manager.agent.servers.monitoring.gui.AgentGuiClientApiConsole;       
import org.openecomp.ncomp.sirius.manager.agent.servers.monitoring.south.AgentSouthBoundApiConsole;   


public class AgentSiriusManagerAgentServerConsole extends Console {
	public static final Logger logger = Logger.getLogger(AgentSiriusManagerAgentServerConsole.class);
    protected AgentSiriusManagerAgentServerClient controller;
    
    
        AgentGuiClientApiConsole gui;       
        AgentSouthBoundApiConsole south;   


    public AgentSiriusManagerAgentServerConsole(String filename, String name) {
            super(filename, name);
            controller = new AgentSiriusManagerAgentServerClient(filename,name);
            client = controller.client;
    
            gui = new  AgentGuiClientApiConsole(filename,name);       
            south = new  AgentSouthBoundApiConsole(filename,name);   
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

	public void uploadInfo(EList<org.openecomp.ncomp.sirius.manager.server.ManagementInfo> info) {
		
		try {
			 controller.uploadInfo(null,info);
		}
		catch (ManagementServerError e) {
			System.err.println("ERROR: " + e.getJson().toString(2));
		}
		
	}

	public EList<org.openecomp.ncomp.core.metrics.DoubleMetric> getValues(java.lang.String path, java.lang.Long start, java.lang.Long end, org.openecomp.ncomp.core.metrics.MetricValueOption option, boolean relativeInterval) {
		EList<org.openecomp.ncomp.core.metrics.DoubleMetric> res = null;
		try {
			res =  controller.getValues(null,path,start,end,option,relativeInterval);
		}
		catch (ManagementServerError e) {
			System.err.println("ERROR: " + e.getJson().toString(2));
		}
		return res;
	}

	public EList<org.openecomp.ncomp.core.metrics.DoubleMetric> getValuesAll(java.lang.String path, EList<java.lang.String> metrics, java.lang.Long start, java.lang.Long end, org.openecomp.ncomp.core.metrics.MetricValueOption option, boolean relativeInterval) {
		EList<org.openecomp.ncomp.core.metrics.DoubleMetric> res = null;
		try {
			res =  controller.getValuesAll(null,path,metrics,start,end,option,relativeInterval);
		}
		catch (ManagementServerError e) {
			System.err.println("ERROR: " + e.getJson().toString(2));
		}
		return res;
	}

	public EList<org.openecomp.ncomp.core.logs.LogMessage> getMessages(java.lang.String path, java.lang.Long start, java.lang.Long end) {
		EList<org.openecomp.ncomp.core.logs.LogMessage> res = null;
		try {
			res =  controller.getMessages(null,path,start,end);
		}
		catch (ManagementServerError e) {
			System.err.println("ERROR: " + e.getJson().toString(2));
		}
		return res;
	}

	public org.openecomp.ncomp.sirius.manager.server.LoggerInfo getRequestLogger(java.lang.String userName, java.lang.String action, java.lang.String resourcePath, org.json.JSONObject context) {
		org.openecomp.ncomp.sirius.manager.server.LoggerInfo res = null;
		try {
			res =  controller.getRequestLogger(userName,action,resourcePath,context);
		}
		catch (ManagementServerError e) {
			System.err.println("ERROR: " + e.getJson().toString(2));
		}
		return res;
	}

	public EList<org.openecomp.ncomp.core.function.ValuePair> evaluate(java.lang.String path, org.openecomp.ncomp.core.function.Function function) {
		EList<org.openecomp.ncomp.core.function.ValuePair> res = null;
		try {
			res =  controller.evaluate(path,function);
		}
		catch (ManagementServerError e) {
			System.err.println("ERROR: " + e.getJson().toString(2));
		}
		return res;
	}

	public void update(java.lang.String path, org.openecomp.ncomp.core.function.Function function) {
		
		try {
			 controller.update(path,function);
		}
		catch (ManagementServerError e) {
			System.err.println("ERROR: " + e.getJson().toString(2));
		}
		
	}

}
