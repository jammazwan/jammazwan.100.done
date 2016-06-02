package abf;

import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.junit.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import abf.domain.Plant;

public class AbfTest extends CamelSpringTestSupport {

    @Override
    protected AbstractXmlApplicationContext createApplicationContext() {
        return new ClassPathXmlApplicationContext("META-INF/spring/camel-context.xml");
    }

    @Test
    public void testHelloBean() throws Exception {
    	MockEndpoint counterEndpoint = getMockEndpoint("mock:counter");
    	MockEndpoint contentEndpoint = getMockEndpoint("mock:content");
    	counterEndpoint.expectedMessageCount(2);
    	Thread.sleep(2000);
    	contentEndpoint.expectedBodyReceived().body().isInstanceOf(Plant.class);
    	counterEndpoint.assertIsSatisfied();
    	contentEndpoint.assertIsSatisfied();
    }

}
