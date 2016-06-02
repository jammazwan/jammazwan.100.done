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
package aai;

import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.junit.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aai.domain.Mechanic;
import aai.domain.Car;

/**
 * @version $Revision: 85 $
 */
public class AaiTest extends CamelSpringTestSupport {

	@Override
	protected AbstractXmlApplicationContext createApplicationContext() {
		return new ClassPathXmlApplicationContext("META-INF/spring/camel-context.xml");
	}

	@Test
	public void testOrderOk() throws Exception {
		// Thread.sleep(200000000);
		Car car = new Car();
		car.setModel("Ford Mustang");
		car.setYear("1966");
		Mechanic mechanic = template.requestBody("cxf:bean:entryEndpoint", car, Mechanic.class);
		assertTrue(mechanic.getTown().contains(car.getModel()));
		// hah! Better put a sleep or JMS will not have time to do it's send!
		Thread.sleep(1000);
	}

	@Test
	public void testWithMocks() throws Exception {
		MockEndpoint testResult = getMockEndpoint("mock:four");
		testResult.expectedBodiesReceived(
				"<Mechanic><age>22 but acts older because this is a 1966car</age><town>Wilkins, Missouri, which means the favorite car is Ford Mustang</town></Mechanic>");
		Car car = new Car();
		car.setModel("Ford Mustang");
		car.setYear("1966");
		template.sendBody("cxf:bean:entryEndpoint", car);
		Thread.sleep(1000);
		testResult.assertIsSatisfied();

	}
}
