package act;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;

public class ActRoutes extends RouteBuilder {

    @Autowired
    private ActProcessor exampleBean;

    @Override
    public void configure() throws Exception {
    	from("timer://act?repeatCount=1").process("actProcessor").to("direct:two");
    	from("direct:two").to("jpa:aal.domain.ActThing").log("DONE");
    }
}
