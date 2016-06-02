package aai;

import org.apache.camel.builder.RouteBuilder;

public class AaiRoutes extends RouteBuilder {

	public void configure() throws Exception {
		from("cxf:bean:entryEndpoint").process("aaiProcessor").wireTap("direct:two");
		from("direct:two").process("processorTwo").bean("routingSequence").to("file://../_test/");
		from("direct:three").log("DIRECT THREE");
	}

}