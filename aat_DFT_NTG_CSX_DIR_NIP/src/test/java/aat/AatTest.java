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
package aat;

import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.junit.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aat.domain.Cushion;
import aat.domain.Sofa;

/**
 * @version $Revision: 85 $
 */
public class AatTest extends CamelSpringTestSupport {

	@Override
	protected AbstractXmlApplicationContext createApplicationContext() {
		return new ClassPathXmlApplicationContext("META-INF/spring/camel-route.xml");
	}

	@Test
	public void testOrderOk() throws Exception {
		// Thread.sleep(200000000);
		Sofa sofa = new Sofa();
		sofa.setFirmness("soft");
		sofa.setMaterial("leather");
		Cushion cushion = template.requestBody("cxf:bean:entryEndpoint", sofa, Cushion.class);
		assertEquals("soft", sofa.getFirmness());
		// hah! Better put a sleep or JMS will not have time to do it's send!
		Thread.sleep(1000);
	}
}
