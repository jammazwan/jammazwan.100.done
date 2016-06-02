package ach;

import org.apache.camel.builder.RouteBuilder;

public class AchRoutes extends RouteBuilder {

    @Override
    public void configure() throws Exception {
    	from("file://../_json/?noop=true&fileName=bank.json").to("direct:one");
        from("direct:one").to("ftp://192.168.99.100/?username=petec&password=frog").log("DONE");
    }
}
