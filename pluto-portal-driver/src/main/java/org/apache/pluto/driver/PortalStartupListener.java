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
package org.apache.pluto.driver;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import org.apache.pluto.container.PortletContainer;
import org.apache.pluto.container.PortletContainerException;
import org.apache.pluto.driver.config.AdminConfiguration;
import org.apache.pluto.driver.config.DriverConfiguration;
import org.apache.pluto.driver.config.DriverConfigurationException;
import javax.servlet.annotation.WebListener;

/**
 * Listener used to start up / shut down the Pluto Portal Driver upon startup /
 * showdown of the servlet context in which it resides.
 * <p/>
 * Startup Includes:
 * <ol>
 * <li>Instantiation of the DriverConfiguration</li>
 * <li>Registration of the DriverConfiguration</li>
 * <li>Instantiation of the PortalContext</li>
 * <li>Registration of the PortalContext</li>
 * <li>Instantiation of the ContainerServices</li>
 * <li>Registration of the ContainerServices</li>
 * </ol>
 *
 * @version $Revision$ $Date$
 * @since Sep 22, 2004
 */
@WebListener
@ApplicationScoped
public class PortalStartupListener implements ServletContextListener
{

    /**
     * Internal logger.
     */
    private static final Logger LOG = Logger.getLogger(PortalStartupListener.class.getName());

    /**
     * The KEY with which the container is bound to the context.
     */
    private static final String CONTAINER_KEY = AttributeKeys.PORTLET_CONTAINER;

    /**
     * The KEY with which the driver configuration is bound to the context.
     */
    private static final String DRIVER_CONFIG_KEY = AttributeKeys.DRIVER_CONFIG;

    /**
     * The KEY with which the admin configuration is bound to the context.
     */
    private static final String ADMIN_CONFIG_KEY = AttributeKeys.DRIVER_ADMIN_CONFIG;

    private static ServletContext servletContext;
    
    @Inject @Named("DriverConfiguration")
    private Instance<DriverConfiguration> driverConfigurationInstance;
    
    @Inject @Named("AdminConfiguration")
    private Instance<AdminConfiguration> adminConfigurationInstance;
    
    @Inject @Named("PortletContainer")
    private Instance<PortletContainer> portletContainerInstance;

    public static ServletContext getServletContext()
    {
        return servletContext;
    }

    // ServletContextListener Impl ---------------------------------------------

    /**
     * Receives the startup notification and subsequently starts up the portal
     * driver. The following are done in this order:
     * <ol>
     * <li>Retrieve the ResourceConfig File</li>
     * <li>Parse the ResourceConfig File into ResourceConfig Objects</li>
     * <li>Create a Portal Context</li>
     * <li>Create the ContainerServices implementation</li>
     * <li>Create the Portlet Container</li>
     * <li>Initialize the Container</li>
     * <li>Bind the configuration to the ServletContext</li>
     * <li>Bind the container to the ServletContext</li>
     * <ol>
     *
     * @param event the servlet context event.
     */
    public void contextInitialized(ServletContextEvent event)
    {
        LOG.info("Starting up Pluto Portal Driver. . .");

        final ServletContext servletContext = event.getServletContext();

        PortalStartupListener.servletContext = servletContext;

        LOG.info(" [1a] Loading DriverConfiguration. . . ");
        DriverConfiguration driverConfiguration = driverConfigurationInstance.get();

        LOG.info(" [1b] Registering DriverConfiguration. . .");
        servletContext.setAttribute(DRIVER_CONFIG_KEY, driverConfiguration);


        LOG.info(" [2a] Loading Optional AdminConfiguration. . .");
        AdminConfiguration adminConfiguration = adminConfigurationInstance.get();

        if (adminConfiguration != null)
        {
            LOG.info(" [2b] Registering Optional AdminConfiguration");
            servletContext.setAttribute(ADMIN_CONFIG_KEY, adminConfiguration);
        } else
        {
            LOG.info("Optional AdminConfiguration not found. Ignoring.");
        }


        LOG.info("Initializing Portlet Container. . .");

        // Create portlet container.
        LOG.info(" [1] Creating portlet container...");
        PortletContainer container = portletContainerInstance.get();

        // Save portlet container to the servlet context scope.
        servletContext.setAttribute(CONTAINER_KEY, container);
        LOG.info("Pluto portlet container started.");

        LOG.info("********** Pluto Portal Driver Started **********\n\n");
    }

    /**
     * Recieve notification that the context is being shut down and subsequently
     * destroy the container.
     *
     * @param event the destrubtion event.
     */
    public void contextDestroyed(ServletContextEvent event)
    {
        ServletContext servletContext = event.getServletContext();
        if (LOG.isLoggable(Level.INFO))
        {
            LOG.info("Shutting down Pluto Portal Driver...");
        }
        destroyContainer(servletContext);
        destroyAdminConfiguration(servletContext);
        destroyDriverConfiguration(servletContext);
        if (LOG.isLoggable(Level.INFO))
        {
            LOG.info("********** Pluto Portal Driver Shut Down **********\n\n");
        }
    }


    // Private Destruction Methods ---------------------------------------------

    /**
     * Destroyes the portlet container and removes it from servlet context.
     *
     * @param servletContext the servlet context.
     */
    private void destroyContainer(ServletContext servletContext)
    {
        if (LOG.isLoggable(Level.INFO))
        {
            LOG.info("Shutting down Pluto Portal Driver...");
        }
        PortletContainer container = (PortletContainer)
                servletContext.getAttribute(CONTAINER_KEY);
        if (container != null)
        {
            try
            {
                container.destroy();
                if (LOG.isLoggable(Level.INFO))
                {
                    LOG.info("Pluto Portal Driver shut down.");
                }
            } catch (PortletContainerException ex)
            {
                LOG.log(Level.SEVERE, "Unable to shut down portlet container: "
                        + ex.getMessage(), ex);
            } finally
            {
                servletContext.removeAttribute(CONTAINER_KEY);
            }
        }
    }

    /**
     * Destroyes the portal driver config and removes it from servlet context.
     *
     * @param servletContext the servlet context.
     */
    private void destroyDriverConfiguration(ServletContext servletContext)
    {
        DriverConfiguration driverConfig = (DriverConfiguration)
                servletContext.getAttribute(DRIVER_CONFIG_KEY);
        if (driverConfig != null)
        {
            servletContext.removeAttribute(DRIVER_CONFIG_KEY);
        }
    }

    /**
     * Destroyes the portal admin config and removes it from servlet context.
     *
     * @param servletContext the servlet context.
     */
    private void destroyAdminConfiguration(ServletContext servletContext)
    {
        AdminConfiguration adminConfig = (AdminConfiguration)
                servletContext.getAttribute(ADMIN_CONFIG_KEY);
        if (adminConfig != null)
        {
            try
            {
                adminConfig.destroy();
                if (LOG.isLoggable(Level.INFO))
                {
                    LOG.info("Pluto Portal Admin Config destroyed.");
                }
            } catch (DriverConfigurationException ex)
            {
                LOG.log(Level.SEVERE,"Unable to destroy portal admin config: "
                        + ex.getMessage(), ex);
            } finally
            {
                servletContext.removeAttribute(ADMIN_CONFIG_KEY);
            }
        }
    }

}

