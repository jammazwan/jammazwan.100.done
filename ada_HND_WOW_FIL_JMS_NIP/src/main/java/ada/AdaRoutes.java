package ada;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;

public class AdaRoutes extends RouteBuilder {


    @Override
    public void configure() throws Exception {
    	from("file://../_csv/?noop=true&fileName=sale.csv").to("jms:two");
    	from("jms:two").to("file://../_test/").to("ftp://192.168.99.100/?username=petec&password=frog");
    }
}
