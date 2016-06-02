package adn;

import org.apache.camel.builder.RouteBuilder;

public class AdnRoutes extends RouteBuilder {

	public void configure() throws Exception {
		from("cxf:bean:entryEndpoint").process("adnProcessor").wireTap("direct:two");
		from("direct:two").process("processorTwo").bean("routingSequence").to("file://../_test/");
		from("direct:this").log("THIS");
		from("direct:that").log("THAT");
	}

}