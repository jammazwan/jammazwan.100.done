package aby;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;

public class AbyRoutes extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		
		
		from("jms:one").log("ONE").to("jms:two");

		from("jms:two").log("TWO");
	}
}
