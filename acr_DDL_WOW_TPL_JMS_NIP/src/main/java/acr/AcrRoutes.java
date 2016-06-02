package acr;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;

public class AcrRoutes extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("jms:one").process(new Processor() {
			public void process(Exchange exchange) throws Exception {
				String text = exchange.getIn().getBody(String.class);
				text = text.toLowerCase();
				exchange.getIn().setBody(text);
			}
		}).to("jms:two");
		from("jms:two").log("DONE WITH BODY ${body}");
	}
}
