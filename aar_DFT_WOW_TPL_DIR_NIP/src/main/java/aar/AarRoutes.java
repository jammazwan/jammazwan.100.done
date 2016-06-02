package aar;

import java.util.Date;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;

public class AarRoutes extends RouteBuilder {


    @Override
    public void configure() throws Exception {
        from("direct:example")
            .process(new Processor() {
                public void process(Exchange exchange) throws Exception {
                    exchange.getIn().setHeader("CamelFileName", "Importatn"+(new Date().getTime()+ ".txt"));
                }
            }).to("direct:two");
        
        from("direct:two").to("ftp://192.168.99.100/?username=petec&password=frog");
    }
}