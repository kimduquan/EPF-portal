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
package org.apache.pluto.driver.services.portal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.pluto.container.PageResourceId;

/**
 */
public class PageConfig {

   private static final Logger LOG = Logger.getLogger(PageConfig.class.getName());

   private String name;
   private String uri;
   private Collection<String> portletIds;
   private int orderNumber;
   private List<PageResourceId> pageResources = new ArrayList<PageResourceId>();

   public PageConfig() {
      this.portletIds = new ArrayList<String>();
      if (LOG.isLoggable(Level.FINE)) {
         LOG.info("Constructor.");
     }
   }
   
   public List<PageResourceId> getPageResources() {
      return pageResources;
   }
   
   public void addPageDependency(String name, String scope, String version) {
      if (name != null) {
         PageResourceId resid = new PageResourceId(name, scope, version);
         pageResources.add(resid);
      } else {
         LOG.warning("Resource name cannot be null.");
      }

      if (LOG.isLoggable(Level.INFO)) {
         StringBuilder txt = new StringBuilder(128);
         txt.append("Adding resource dependency. # deps: ").append(pageResources.size());
         txt.append(", name: ").append(name);
         txt.append(", scope: ").append(scope);
         txt.append(", version: ").append(version);
         LOG.info(txt.toString());
      }
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
      if (LOG.isLoggable(Level.FINE)) {
         LOG.info("Page Name = " + name);
     }
   }

   public String getUri() {
      return uri;
   }

   public void setUri(String uri) {
      this.uri = uri;
   }

   public Collection<String> getPortletIds() {
      return portletIds;
   }

   public void setPortletIds(Collection<String> ids) {
      this.portletIds = ids;
   }

   public void addPortlet(String contextPath, String portletName) {
      String pid = PortletWindowConfig.createPortletId(contextPath, portletName, createPlacementId());
      if (LOG.isLoggable(Level.INFO)) {
         LOG.info("Add Portlet ID = " + pid);
      }
      synchronized(portletIds) {
         portletIds.add(pid);
      }
   }

   public void removePortlet(String portletId) {
      portletIds.remove(portletId);
   }

   void setOrderNumber(int number) {
      this.orderNumber = number;
   }

   int getOrderNumber() {
      return orderNumber;
   }

   private String createPlacementId() {
      return getName().hashCode() + "|"+portletIds.size();
   }

}
