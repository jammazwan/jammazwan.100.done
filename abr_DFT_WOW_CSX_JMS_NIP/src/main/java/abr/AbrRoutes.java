package abr;

import org.apache.camel.builder.RouteBuilder;

public class AbrRoutes extends RouteBuilder {

	public void configure() throws Exception {
		from("cxf:bean:entryEndpoint").process("abrProcessor").wireTap("jms:two");
		from("jms:two").process("processorTwo").to("file://../_test/");
	}

}