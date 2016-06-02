package acz;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;

public class AczRoutes extends RouteBuilder {


    @Override
    public void configure() throws Exception {
        
    	from("file://../_json/?noop=true&fileName=bank.json").to("direct:one");
    	from("direct:one").to("file://../_test/").to("ftp://192.168.99.100/?username=petec&password=frog").log("DONE with  ${header.CamelFileName}");
    }
}
