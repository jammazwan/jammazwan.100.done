package aah;

import org.apache.camel.builder.RouteBuilder;

public class Routes extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("timer://aag?repeatCount=1").process("processorOne").process("processorTwo").to("direct:two");
		
		from("direct:two").to("ftp://192.168.99.100/?username=petec&password=frog");

	}

}
