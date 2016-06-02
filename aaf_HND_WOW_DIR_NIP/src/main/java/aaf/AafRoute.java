package aaf;

import org.apache.camel.builder.RouteBuilder;

public class AafRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("timer://foo?repeatCount=1").process("aafProcessorOne").process("aafProcessorTwo")
				.to("ftp://192.168.99.100/?username=petec&password=frog");
	}
}
