package abs;

import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.junit.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import abs.domain.Tube;

public class AbsTest extends CamelSpringTestSupport {

    @Override
    protected AbstractXmlApplicationContext createApplicationContext() {
        return new ClassPathXmlApplicationContext("META-INF/spring/camel-context.xml");
    }

    @Test
    public void testHelloBean() throws Exception {
		// Thread.sleep(200000000);
		Tube tube = new Tube("20ft", ".4mil", "1in", "clear PVC");
		String reply = template.requestBody("cxf:bean:entryEndpoint", tube, String.class);
		assertEquals(reply, tube.toString());
		Thread.sleep(1000);
	}

}
