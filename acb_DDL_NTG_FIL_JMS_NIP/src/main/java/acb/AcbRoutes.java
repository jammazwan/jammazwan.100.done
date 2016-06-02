package acb;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;

public class AcbRoutes extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("file://../_test/?noop=true&fileName=menu.xml").to("jms:two");
        
        from("jms:two").to("ftp://192.168.99.100/?username=petec&password=frog").log("DONE");
    }
}
