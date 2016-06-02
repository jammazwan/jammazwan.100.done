package abj;

import java.util.Date;

import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.junit.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AbjTest extends CamelSpringTestSupport {

    @Override
    protected AbstractXmlApplicationContext createApplicationContext() {
        return new ClassPathXmlApplicationContext("META-INF/spring/camel-context.xml");
    }

    @Test
    public void testHelloBean() throws Exception {
    	String fileName = "abiImportant"+(new Date().getTime())+".txt";
    	MockEndpoint counterEndpoint = getMockEndpoint("mock:counter");
    	MockEndpoint contentEndpoint = getMockEndpoint("mock:content");
    	counterEndpoint.expectedMessageCount(1);
    	contentEndpoint.expectedHeaderReceived("CamelFileName", fileName);
        String reply = template.requestBody("direct:one", fileName, String.class);
        System.out.println(reply);
        contentEndpoint.assertIsSatisfied();
        counterEndpoint.assertIsSatisfied();
    }

}
