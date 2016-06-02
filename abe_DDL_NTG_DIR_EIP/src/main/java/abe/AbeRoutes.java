package abe;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;

public class AbeRoutes extends RouteBuilder {

	@Autowired
	private AbeProcessorOne exampleBean;

	@SuppressWarnings("deprecation")
	@Override
	public void configure() throws Exception {
		from("timer://foo?repeatCount=1").process("abeProcessorOne").process("abeProcessorTwo").to("direct:two");
		from("direct:two").routingSlip("slip");
		from("direct:word").log("DONE.");
	}
}
