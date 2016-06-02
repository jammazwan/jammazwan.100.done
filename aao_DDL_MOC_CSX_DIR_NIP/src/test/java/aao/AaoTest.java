package aao;

import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.junit.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aao.domain.Duck;

public class AaoTest extends CamelSpringTestSupport {

	@Override
	protected AbstractXmlApplicationContext createApplicationContext() {
		return new ClassPathXmlApplicationContext("META-INF/spring/camel-context.xml");
	}

	@Test
	public void testHelloBean() throws Exception {
		MockEndpoint result = getMockEndpoint("mock:result");
		result.expectedMessageCount(1);
		MockEndpoint stringResult = getMockEndpoint("mock:resultbody");
		;
		// Thread.sleep(5000000);
		Duck duck = new Duck("webbed", "green", "28inch", "slightly hooked", "fast");
		stringResult.expectedBodiesReceived(duck.toString());
		System.err.println(duck.toString());
		String reply = template.requestBody("cxf:bean:entryEndpoint", duck, String.class);
		assertEquals("Duck with webbed feet and slightly hooked bill and green color and 28inch wingspan and fast walk",
				reply);
		Thread.sleep(1000);
		result.assertIsSatisfied();
		stringResult.assertIsSatisfied();
	}

}
