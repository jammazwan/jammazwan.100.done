package aba;

import org.apache.camel.builder.RouteBuilder;

public class AbaRoutes extends RouteBuilder {


    @SuppressWarnings("deprecation")
	@Override
    public void configure() throws Exception {
        from("direct:one")
            .process("abaProcessor").to("direct:two");
        from("direct:two").routingSlip("routingSlips");
        from("direct:develop").to("log:EIProutingSlipHere-direct:develop");
        from("direct:example").to("log:EIProutingSlipHere- direct:example");
        from("direct:in").to("log:EIProutingSlipHere-direct:in");
        from("direct:java").to("log:EIProutingSlipHere-direct:java");
        from("direct:first").to("log:EIProutingSlipHere-direct:first");
    }
}
