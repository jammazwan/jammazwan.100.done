package example;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;

public class ExampleRoute extends RouteBuilder {

    @Autowired
    private ExampleBean exampleBean;

    @Override
    public void configure() throws Exception {
        from("direct:example")
            .process(new Processor() {
                public void process(Exchange exchange) throws Exception {
                    String text = exchange.getIn().getBody(String.class);
                    String newAnswer = exampleBean.answer(text);
                    exchange.getOut().setBody(newAnswer);
                }
            });
    }
}
