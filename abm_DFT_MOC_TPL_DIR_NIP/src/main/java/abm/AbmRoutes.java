package abm;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;

public class AbmRoutes extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("direct:one")
            .process(new Processor() {
                public void process(Exchange exchange) throws Exception {
                    String text = exchange.getIn().getBody(String.class);
                    exchange.getIn().setHeader("CamelFileName", text);
                }
            }).to("mock:content").to("direct:two");
        
        from("direct:two").to("ftp://192.168.99.100/?username=petec&password=frog").to("mock:counter");
    }
}
