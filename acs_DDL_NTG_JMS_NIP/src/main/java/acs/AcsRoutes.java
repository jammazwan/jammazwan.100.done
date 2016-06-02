package acs;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;

public class AcsRoutes extends RouteBuilder {

    @Autowired
    private AcsProcessor exampleBean;

    @Override
    public void configure() throws Exception {
    	from("timer://acs?repeatCount=1")
            .process("acsProcessor").to("jms:two");
    	
    	from("jms:two").marshal("bindyDataformat").to("file://../_test/").to("jpa:acs.domain.Stock").log("DONE");
    }
}
