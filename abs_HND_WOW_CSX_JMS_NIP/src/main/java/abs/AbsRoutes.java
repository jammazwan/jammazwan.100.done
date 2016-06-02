package abs;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;

public class AbsRoutes extends RouteBuilder {

    @Autowired
    private AbsProcessor exampleBean;

    @Override
    public void configure() throws Exception {
        from("cxf:bean:entryEndpoint").wireTap("jms:two").process("absProcessor");
        from("jms:two").to("jpa:abs.domain.Tube");
    }
}
