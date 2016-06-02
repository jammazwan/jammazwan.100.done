package aax;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;

public class AaxRoutes extends RouteBuilder {

    @Autowired
    private AaxProcessor exampleBean;

    @Override
    public void configure() throws Exception {
        from("direct:one").process("aaxProcessor").to("mock:content").to("direct:two");
        
        from("direct:two").to("ftp://192.168.99.100/?username=petec&password=frog").to("mock:counter");
    }
}
