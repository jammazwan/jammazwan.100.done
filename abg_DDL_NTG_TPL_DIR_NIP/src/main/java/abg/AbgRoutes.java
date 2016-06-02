package abg;

import org.apache.camel.builder.RouteBuilder;

public class AbgRoutes extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("direct:one").to("direct:two");
        from("direct:two").to("ftp://192.168.99.100/?username=petec&password=frog").log("DONE");
    }
}
