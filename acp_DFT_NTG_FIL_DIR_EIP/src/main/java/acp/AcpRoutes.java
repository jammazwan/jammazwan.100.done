package acp;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;

import acp.domain.Fred;

public class AcpRoutes extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("file://../_test/?noop=true&fileName=fred_age.txt")
            .process(new Processor() {
                public void process(Exchange exchange) throws Exception {
                    String text = exchange.getIn().getBody(String.class);
                    Fred fred = new Fred();
                    fred.age = text;
                    exchange.getIn().setBody(fred);
                    exchange.getIn().setHeader("recipients", "direct:fred");
                }
            }).to("direct:two");
        from("direct:two").recipientList(header("recipients")).log("DONE");
        from("direct:fred").log("SEE? FRED");
    }
}
