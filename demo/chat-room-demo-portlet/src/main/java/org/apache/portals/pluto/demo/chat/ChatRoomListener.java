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


package org.apache.portals.pluto.demo.chat;

import java.io.IOException;

import javax.portlet.PortletAsyncEvent;
import javax.portlet.PortletAsyncListener;
import javax.portlet.annotations.PortletRequestScoped;

/**
 * Simple async listener to watch for timeouts. 
 * 
 * @author Scott Nicklous
 *
 */
@PortletRequestScoped
public class ChatRoomListener implements PortletAsyncListener {
   
   private volatile boolean timeout = false;
   
   public boolean isTimeout() {
      return timeout;
   }

   @Override
   public void onComplete(PortletAsyncEvent evt) throws IOException {
   }
   @Override
   public void onError(PortletAsyncEvent evt) throws IOException {
   }

   @Override
   public void onStartAsync(PortletAsyncEvent evt) throws IOException {
   }

   @Override
   public void onTimeout(PortletAsyncEvent evt) throws IOException {
      timeout = true;
      evt.getPortletAsyncContext().complete();
   }

}
