package aaj;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;

import aaj.domain.Stock;

public class AajRoutes extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("timer://foo?repeatCount=1").process("processorOne").to("direct:two").to("mock:also");

		from("direct:two").process(new Processor() {
			public void process(Exchange exchange) throws Exception {
				Stock stock = (Stock) exchange.getIn().getBody(Stock.class);
				exchange.getIn().setHeader("CamelFileName", "stock1.csv");
			}
		}).marshal("bindyDataformat").to("ftp://192.168.99.100/?username=petec&password=frog").to("mock:also");
	}

}
