package aax;

import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.junit.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AaxTest extends CamelSpringTestSupport {

	@Override
	protected AbstractXmlApplicationContext createApplicationContext() {
		return new ClassPathXmlApplicationContext("META-INF/spring/camel-context.xml");
	}

	@Test
	public void testHelloBean() throws Exception {
		MockEndpoint counterMock = getMockEndpoint("mock:counter");
		MockEndpoint contentMock = getMockEndpoint("mock:content");
		contentMock.expectedMessageCount(1);
		String value = "Develop Example In Java First";
		contentMock.expectedBodyReceived().body().equals(value);
		template.sendBody("direct:one", value);
		Thread.sleep(2000);
		contentMock.assertIsSatisfied();
		counterMock.assertIsSatisfied();
	}

}
