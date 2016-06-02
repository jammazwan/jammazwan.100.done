package abp;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;

public class AbpRoutes extends RouteBuilder {

    @Autowired
    private AbpBean exampleBean;

    @Override
    public void configure() throws Exception {
    	from("timer://foo?repeatCount=1").process("abpBean").to("direct:two");
        from("direct:two")
        .to("jpa:aal.domain.Cd");
//            .process(new Processor() {
//                public void process(Exchange exchange) throws Exception {
//                }
//            });
    }
}
