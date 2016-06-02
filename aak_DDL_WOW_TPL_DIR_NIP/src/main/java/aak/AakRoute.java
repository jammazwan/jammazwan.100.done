package aak;

import java.util.Date;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;

public class AakRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("direct:one").to("direct:two");
        
        from("direct:two")
            .process(new Processor() {
                public void process(Exchange exchange) throws Exception {
                	String dateString = ""+ new Date().getTime();
                	exchange.getIn().setHeader("CamelFileName", "Important" +dateString + ".txt" );
                }
            }).to("ftp://192.168.99.100/?username=petec&password=frog");
    }
}
