package adi;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;

import adi.domain.Sale;

public class AdiRoutes extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("timer://adi?repeatCount=1").process("adiProcessor").log("DONE with  ${header.CamelFileName}")
				.marshal("bindyDataformat").process(new Processor() {
					public void process(Exchange exchange) throws Exception {
						String text = exchange.getIn().getBody(String.class);
						String newAnswer = text.replaceAll("Posturebedic", "Posturepedic");
						exchange.getIn().setBody(newAnswer);
					}
				}).to("jms:two");

		from("jms:two").to("file://../_test/")
				.to("ftp://192.168.99.100/?username=petec&password=frog").log("DONE with  ${header.CamelFileName}");
	}
}
