package aat;

import org.apache.camel.builder.RouteBuilder;

public class AatRoutes extends RouteBuilder {

	public void configure() throws Exception {
		from("cxf:bean:entryEndpoint").process("aatProcessor").wireTap("direct:two");
		from("direct:two").process("processorTwo").to("file://../_test/");
	}

}