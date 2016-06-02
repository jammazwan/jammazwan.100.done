package abt;

import org.apache.camel.builder.RouteBuilder;

public class AbtRoutes extends RouteBuilder {


    @Override
    public void configure() throws Exception {
    	from("file://../_xml/?noop=true&fileName=cd.xml").to("direct:two");
    	
        from("direct:two").to("ftp://192.168.99.100/?username=petec&password=frog").log("DONE.");
    }
}
