package abi;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;

public class AbiRoutes extends RouteBuilder {


    @Override
    public void configure() throws Exception {
    	from("file://../_xml/?noop=true&fileName=menu.xml").process("abiProcessor").to("jms:one");
    	
        from("jms:one").marshal("bindyDataformat").to("ftp://192.168.99.100/?username=petec&password=frog").log("DONE.");
    }
}
