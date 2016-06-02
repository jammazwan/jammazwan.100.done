package aaj;

import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AajTest extends CamelSpringTestSupport {

	@Override
	protected AbstractApplicationContext createApplicationContext() {
		return new ClassPathXmlApplicationContext("META-INF/spring/camel-context.xml");
	}

	@Test
	public void testAag() throws Exception {
		MockEndpoint result = getMockEndpoint("mock:also");
		result.expectedMinimumMessageCount(2);
		Thread.sleep(1000);
		result.assertIsSatisfied();
	}

}
