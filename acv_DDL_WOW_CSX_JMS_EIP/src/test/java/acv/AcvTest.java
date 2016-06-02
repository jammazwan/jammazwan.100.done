package acv;

import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.junit.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import acv.domain.Tile;

public class AcvTest extends CamelSpringTestSupport {

    @Override
    protected AbstractXmlApplicationContext createApplicationContext() {
        return new ClassPathXmlApplicationContext("META-INF/spring/camel-context.xml");
    }

    @Test
    public void testHelloBean() throws Exception {
    	Tile tile = new Tile("red", "1/2in", "3oz", "6inX6in");
        String reply = template.requestBody("cxf:bean:entryEndpoint", tile, String.class);
		assertEquals(tile.toString(), reply);
    }

}
