package aap;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;

public class AapRoutes extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("cxf:bean:entryEndpoint").wireTap("jms:two").process("aapProcessor").process(new Processor() {
            public void process(Exchange exchange) throws Exception {
                System.out.println(">>>>>>>>" 
                        + exchange.getIn().getBody(String.class));   
            }
        }).to("mock:content");
        from("jms:two").to("jpa:aap.domain.Cleaner").to("mock:count");
    }
}
