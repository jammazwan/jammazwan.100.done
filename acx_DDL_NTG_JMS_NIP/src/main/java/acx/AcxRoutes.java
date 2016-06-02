package acx;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;

public class AcxRoutes extends RouteBuilder {

	@Autowired
	private AcxProcessor exampleBean;

	@Override
	public void configure() throws Exception {
		from("timer://acx?repeatCount=1").process("acxProcessor").marshal("bindyDataformat").to("jms:two");
		from("jms:two").to("file://../_test").to("ftp://192.168.99.100/?username=petec&password=frog").log("DONE");
	}
}
