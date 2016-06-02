package ado;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;

public class AdoRoutes extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("timer://ado?repeatCount=1").process("adoProcessor").to("jms:two");

		from("jms:two")
		.marshal("bindyDataformat").to("file://../_test/").to("ftp://192.168.99.100/?username=petec&password=frog")
				.log("DONE with  ${header.CamelFileName}");
		;

	}
}
