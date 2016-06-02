package acn;

import org.apache.camel.builder.RouteBuilder;

public class AcnRoutes extends RouteBuilder {

	public void configure() throws Exception {
		from("cxf:bean:entryEndpoint").process("acnProcessor").wireTap("jms:two");
		from("jms:two").process("processorTwo").to("file://../_test/");
	}

}