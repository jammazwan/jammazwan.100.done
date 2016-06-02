package ack;

import java.util.Date;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;

public class AckRoutes extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("direct:one").to("direct:two");
		from("direct:two").process(new Processor() {
			public void process(Exchange exchange) throws Exception {
				exchange.getIn().setHeader("CamelFileName", "ackImortant" + (new Date().getTime() + ".txt"));
			}
		}).to("ftp://192.168.99.100/?username=petec&password=frog");;
	}
}
