package adb;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;

public class AdbRoutes extends RouteBuilder {

    @Autowired
    private AdbProcessor exampleBean;

    @Override
    public void configure() throws Exception {
    	from("timer://adb?repeatCount=1").process("adbProcessor").to("jms:two");
    	from("jms:two").recipientList(header("recipients")).log("DONE");
    	from("jms:fred").log("FRED");
    	from("jms:traveler").log("TRAVELER");
    }
}
