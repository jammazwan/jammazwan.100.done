package aah;

import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AahTest extends CamelSpringTestSupport{

	@Override
	protected AbstractApplicationContext createApplicationContext() {
        return new ClassPathXmlApplicationContext("META-INF/spring/camel-context.xml");
	}
	
	@Test
	public void testRoutes() throws Exception{
		Thread.sleep(5000);
	}

}
