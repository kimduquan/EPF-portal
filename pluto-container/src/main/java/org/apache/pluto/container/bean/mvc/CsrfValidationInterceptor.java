/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.pluto.container.bean.mvc;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Priority;
import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import javax.mvc.MvcContext;
import javax.mvc.security.Csrf;
import javax.mvc.security.CsrfProtected;
import javax.portlet.ClientDataRequest;
import javax.ws.rs.core.Configuration;


/**
 * @author  Neil Griffin
 */
@Interceptor
@CsrfValidationInterceptorBinding
@Priority(Interceptor.Priority.LIBRARY_BEFORE)
public class CsrfValidationInterceptor implements Serializable {

	private static final long serialVersionUID = 1348567603498123441L;

	private static final Logger LOG = Logger.getLogger(CsrfValidationInterceptor.class.getName());

	@Inject
	private Configuration configuration;

	@Inject
	private MvcContext mvcContext;

	@AroundInvoke
	public Object validateMethodInvocation(InvocationContext invocationContext) throws Exception {

		Csrf.CsrfOptions csrfOptions = Csrf.CsrfOptions.EXPLICIT;

		Object csrfProtection = configuration.getProperty(Csrf.CSRF_PROTECTION);

		if (csrfProtection != null) {

			if (csrfProtection instanceof Csrf.CsrfOptions) {
				csrfOptions = (Csrf.CsrfOptions) csrfProtection;
			}
			else {

				try {
					csrfOptions = Csrf.CsrfOptions.valueOf(csrfProtection.toString());
				}
				catch (IllegalArgumentException e) {
					LOG.log(Level.SEVERE ,e.getMessage(), e);
				}
			}
		}

		if (csrfOptions == Csrf.CsrfOptions.OFF) {
			return invocationContext.proceed();
		}

		Method targetMethod = invocationContext.getMethod();

		if ((csrfOptions == Csrf.CsrfOptions.EXPLICIT) && !targetMethod.isAnnotationPresent(CsrfProtected.class)) {
			return invocationContext.proceed();
		}

		boolean proceed = false;

		Object[] parameters = invocationContext.getParameters();

		if (parameters.length == 2) {

			if (parameters[0] instanceof ClientDataRequest) {

				ClientDataRequest clientDataRequest = (ClientDataRequest) parameters[0];

				String method = clientDataRequest.getMethod();

				if (method.equalsIgnoreCase("post")) {

					Csrf csrf = mvcContext.getCsrf();

					String csrfRequestParameterValue = clientDataRequest.getParameter(csrf.getName());

					String csrfToken = csrf.getToken();

					if ((csrfToken != null) && csrfToken.equalsIgnoreCase(csrfRequestParameterValue)) {
						proceed = true;
					}
					else {
						LOG.severe("Invalid CSRF token");
					}

				}
				else {
					proceed = true;
				}
			}
			else {
				LOG.severe("First parameter of method signature must be ActionRequest or ResourceRequest");
			}
		}
		else {
			LOG.severe("Method signature must include ActionRequest,ActionResponse or ResourceRequest,ResourceResponse");
		}

		if (proceed) {
			return invocationContext.proceed();
		}

		return null;
	}
}
