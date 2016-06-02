package aau;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;

public class AauRoutes extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("file://../_csv/?noop=true&fileName=sale.csv").process("aauProcesor").to("jms:mrimportant");
		
		from("jms:mrimportant").to("file://../_test/");
	}
}
