package aco;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;

public class AcoRoutes extends RouteBuilder {


    @Override
    public void configure() throws Exception {
        from("jms:one").to("jms:two");
        from("jms:two").log("DONE");
    }
}
