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


package org.apache.pluto.container.impl;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.portlet.RenderParameters;
import javax.portlet.MutableRenderParameters;
import org.apache.pluto.container.PortletURLProvider;
import org.apache.pluto.container.PortletURLProvider.ParamType;

/**
 * @author nick
 *
 */
public class RenderParametersImpl extends PortletParametersImpl implements
      RenderParameters {
   private static final Logger   LOGGER     = Logger.getLogger(RenderParametersImpl.class.getName());
   private static final boolean  isTrace    = LOGGER.isLoggable(Level.FINE);

   // called to force class loading in Container thread
   public static final void load() {
      if (isTrace) {
         LOGGER.info("Loaded.");
      }
   };
   
   private final Set<String> prpNames;

   /**
    * For creating a new object from scratch
    * 
    * @param urlProvider
    * @param windowId
    */
   public RenderParametersImpl(PortletURLProvider urlProvider, String windowId) {
      super(urlProvider, windowId, ParamType.RENDER);
      prpNames = urlProvider.getPublicParameterNames(windowId);
   }
   
   /**
    * For cloning an object
    * 
    * @param params
    * @param windowId
    */
   protected RenderParametersImpl(Map<String, String[]> params, String windowId, Set<String> prpNames) {
      super(params, windowId, ParamType.RENDER);
      this.prpNames = new HashSet<String>(prpNames);
   }

   /* (non-Javadoc)
    * @see javax.portlet.PortletParameters#mutableClone()
    */
   @Override
   public MutableRenderParameters clone() {
      if (isTrace) {
         LOGGER.info("Window ID: " + windowId + ", ParameterType: " + type);
      }

      // create a mutable clone, breaking link to the underlying URL provider.
      MutableRenderParametersImpl map = new MutableRenderParametersImpl(params, windowId, prpNames);
      
      return map;
   }

   public boolean isPublic(String name) {
      checkNull("name", name);
      boolean isPublic = prpNames.contains(name); 
      
      if (isTrace) {
         StringBuilder txt = new StringBuilder();
         txt.append("Window ID: ").append(windowId)
            .append(", Name: ").append(name)
            .append(", isPublic: ").append(isPublic);
         LOGGER.info(txt.toString());
      }
      
      return isPublic;
   }

}
