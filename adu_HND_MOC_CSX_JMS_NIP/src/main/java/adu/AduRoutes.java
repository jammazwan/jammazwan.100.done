package adu;

import org.apache.camel.builder.RouteBuilder;

public class AduRoutes extends RouteBuilder {

	public void configure() throws Exception {
		from("cxf:bean:entryEndpoint").wireTap("direct:two").process("aduProcessor");
		from("direct:two").process("processorTwo").to("file://../_test/");
	}

}