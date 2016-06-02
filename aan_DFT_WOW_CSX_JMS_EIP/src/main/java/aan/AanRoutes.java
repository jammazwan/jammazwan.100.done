package aan;

import org.apache.camel.builder.RouteBuilder;

public class AanRoutes extends RouteBuilder {

	public void configure() throws Exception {
		from("cxf:bean:entryEndpoint").process("aanProcessor").wireTap("jms:two").aggregate(header("routeslip"), new MyAggregationStrategy()).completionSize(2).to("direct:three");
		from("jms:two").process("processorTwo").to("file://../_test/");
		from("direct:three").log("THREE");
	}

}