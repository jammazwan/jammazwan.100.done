package adp;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;

public class AdpRoutes extends RouteBuilder {


    @Override
    public void configure() throws Exception {
    	from("file://../_xml/?noop=true&fileName=cd.xml").to("jms:one");
    	from("jms:one").to("file://../_test/").log("DONE with  ${header.CamelFileName}");


//    	.to("ftp://192.168.99.100/?username=petec&password=frog");
    }
}
