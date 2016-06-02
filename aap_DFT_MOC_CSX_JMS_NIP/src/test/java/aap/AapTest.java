package aap;

import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.junit.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aap.domain.Cleaner;

public class AapTest extends CamelSpringTestSupport {

	@Override
	protected AbstractXmlApplicationContext createApplicationContext() {
		return new ClassPathXmlApplicationContext("META-INF/spring/camel-route.xml");
	}

	@Test
	public void testOrderOk() throws Exception {
//		 Thread.sleep(2000000);
		MockEndpoint countEndpoint = getMockEndpoint("mock:count");
		countEndpoint.expectedMessageCount(1);
		MockEndpoint contentEndpoint = getMockEndpoint("mock:content");
		Cleaner cleaner = new Cleaner("Mark Meandro", "63", "excellent health, but cranky", "modestly OCD");
		String reply = template.requestBody("cxf:bean:entryEndpoint", cleaner, String.class);
		contentEndpoint.expectedBodyReceived().body().equals(reply);
		System.err.println(reply);
		assertEquals(reply, cleaner.toString());
		Thread.sleep(1000);
		countEndpoint.assertIsSatisfied();
		contentEndpoint.assertIsSatisfied();
	}

}
