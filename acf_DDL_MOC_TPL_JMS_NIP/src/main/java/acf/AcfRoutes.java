package acf;

import org.apache.camel.builder.RouteBuilder;

public class AcfRoutes extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("jms:one").to("jms:two");
        from("jms:two").to("log:DONE");
    }
}
