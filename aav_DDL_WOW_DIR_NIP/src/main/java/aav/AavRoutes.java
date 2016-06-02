package aav;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;

public class AavRoutes extends RouteBuilder {


    @Override
    public void configure() throws Exception {
    	from("timer://aav?repeatCount=1").process("aavProcessor").to("direct:second");
    	
    	from("direct:second").marshal("bindyDataformat").to("file://../_test/");
    }
}
