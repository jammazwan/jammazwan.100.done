package abh;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;

import abh.domain.FooBar;

public class AbhRoutes extends RouteBuilder {

    @Override
    public void configure() throws Exception {
    	from("timer://abh?repeatCount=1").process("abhBean").to("direct:two");
 
        from("direct:two").wireTap("direct:three").log("DONE");
        
        from("direct:three")
            .process(new Processor() {
                public void process(Exchange exchange) throws Exception {
                	FooBar foobar = (FooBar)exchange.getIn().getBody(FooBar.class);
                    String text = foobar.foo;
                    exchange.getIn().setBody(text);
                }
            }).log("${body}");
    }
}
