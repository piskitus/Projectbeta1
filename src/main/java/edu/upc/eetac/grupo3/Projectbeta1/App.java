/*
 * Copyright [GRUPO3]
 * 
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
package edu.upc.eetac.grupo3.Projectbeta1;

import org.apache.log4j.Logger;
 
/**
 * Hello world!
 * 
 */
public class App {
	static Logger logger = Logger.getLogger(App.class);
	public static void main(String[] args) {
		System.out.println("Hello baby!");
		
		logger.error("This is an error message.");
		logger.warn("This is a warning message.");
		logger.info("This is an informational message.");
		logger.debug("This is a error message.");
	}
}