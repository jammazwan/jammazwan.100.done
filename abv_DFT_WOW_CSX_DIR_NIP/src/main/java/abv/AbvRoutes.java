package abv;

import org.apache.camel.builder.RouteBuilder;

public class AbvRoutes extends RouteBuilder {

	public void configure() throws Exception {
		from("cxf:bean:entryEndpoint").process("abvProcessor").wireTap("direct:two");
		from("direct:two").process("processorTwo").to("file://../_test/");
	}

}