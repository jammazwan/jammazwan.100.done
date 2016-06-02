package abx;

import org.apache.camel.builder.RouteBuilder;

public class AbxRoutes extends RouteBuilder {


    @Override
    public void configure() throws Exception {
    	from("timer://foo?repeatCount=1").process("abxProcessor").to("jms:two");
    	from("jms:two").wireTap("jms:three").log("DONE");
    	from("jms:three").log("NOW, REALLY DONE ${body}");
    }
}
