package abk;

import org.apache.camel.builder.RouteBuilder;

public class AbkRoutes extends RouteBuilder {

	public void configure() throws Exception {
		from("cxf:bean:entryEndpoint").process("abkProcessor").wireTap("jms:two");
		from("jms:two").process("processorTwo").to("file://../_test/");
	}

}