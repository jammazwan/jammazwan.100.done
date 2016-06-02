package example;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;

public class ExampleRoute extends RouteBuilder {
	static int i;

    @Autowired
    private ExampleBean exampleBean;

    @Override
    public void configure() throws Exception {
    	from("file://../_csv/?noop=true&fileName=crime_short.csv").unmarshal().csv()
        .split(body())
            .process(new Processor() {
                public void process(Exchange exchange) throws Exception {
                    String text = exchange.getIn().getBody(String.class);
                    System.out.println("LOOK "+i++ + text);
                }
            });
    }
}
