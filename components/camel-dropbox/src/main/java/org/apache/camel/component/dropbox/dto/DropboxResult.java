/**
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
package org.apache.camel.component.dropbox.dto;

import java.io.OutputStream;
import java.util.Map;

import org.apache.camel.Exchange;

public abstract class DropboxResult {

    protected Object resultEntries;

    /**
     * Populate the camel exchange with the results from dropbox method invocations.
     * @param exchange
     */
    public abstract void populateExchange(Exchange exchange);

//    public Map<String, OutputStream> getResultEntries()  {
//        return resultEntries;
//    }

    public void setResultEntries(Map<String, OutputStream> resultEntries) {
        this.resultEntries = resultEntries;
    }

}