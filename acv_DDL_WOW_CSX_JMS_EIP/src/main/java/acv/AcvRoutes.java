package acv;

import org.apache.camel.builder.RouteBuilder;

public class AcvRoutes extends RouteBuilder {

    @Override
    public void configure() throws Exception {
    	from("cxf:bean:entryEndpoint").process("acvProcessor").to("jms:two");
    	from("jms:two").log("do some more work here instead of this log");
    }
}
