package adc;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;

public class AdcRoutes extends RouteBuilder {


    @Override
    public void configure() throws Exception {
        from("jms:one").process("adcProcessor").to("jms:two");
        from("jms:two").to("jms:important").log("VERY IMPORTANT FOR SURE");
        from("jms:important").log("VERY IMPORTANT message received.");
    }
}
