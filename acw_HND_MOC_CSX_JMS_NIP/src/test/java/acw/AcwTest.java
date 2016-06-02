package acw;

import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.junit.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jcraft.jsch.Buffer;

import acw.domain.Buzzard;

public class AcwTest extends CamelSpringTestSupport {

    @Override
    protected AbstractXmlApplicationContext createApplicationContext() {
        return new ClassPathXmlApplicationContext("META-INF/spring/camel-context.xml");
    }

    @Test
    public void testHelloBean() throws Exception {
//    	Thread.sleep(20000000);
    	Buzzard buzzard = new Buzzard("3yrs", "Turkey Vulture", "Central Texas, USA", "6ft");
        String reply = template.requestBody("cxf:bean:entryEndpoint", buzzard, String.class);
		assertEquals(buzzard.toString(), reply);
		Thread.sleep(1000);
    }

}
