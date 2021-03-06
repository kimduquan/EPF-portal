/*  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */


package org.apache.pluto.container.driver;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * Dummy servlet to allow "legacy" portlets with web.xml files specifying PortletServlet to deploy properly.
 * The real portlet servlet is PortletServlet3, which is deployed through the servlet container
 * initializer.
 * 
 * @see PortletServlet3
 * @see PortletContainerInitializer
 * @author Scott Nicklous
 */
@WebServlet(
		name = "AboutPortlet",
		initParams = {@WebInitParam(name = "portlet-name", value = "AboutPortlet")},
		loadOnStartup = 1
		)
public class PortletServlet extends HttpServlet {
   private static final long serialVersionUID = -2550104981099637033L;

}
