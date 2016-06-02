package aad;

import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.junit.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JmsRouteTest extends CamelSpringTestSupport {

    protected AbstractXmlApplicationContext createApplicationContext() {
        return new ClassPathXmlApplicationContext("META-INF/spring/jmsRoute.xml");
    }

    @Test
    public void testProducerTemplateInOnly() throws Exception {
        MockEndpoint result = getMockEndpoint("mock:result");
        result.expectedBodiesReceived("My order is aad");
        template.sendBodyAndHeader("activemq:myjms","My order is aad", "MyHead", "mock:a,mock:c,mock:result");
        result.assertIsSatisfied();
    }

}
