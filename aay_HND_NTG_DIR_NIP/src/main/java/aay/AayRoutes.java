package aay;

import org.apache.camel.builder.RouteBuilder;

public class AayRoutes extends RouteBuilder {


    @Override
    public void configure() throws Exception {
    	from("timer://aay?repeatCount=1")
            .process("aayProcessor").to("direct:dos");
    	
    	from("direct:dos").to("jpa:aay.domain.Food");
    }
}
