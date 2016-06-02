package acw;

import org.apache.camel.builder.RouteBuilder;

public class AcwRoutes extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("cxf:bean:entryEndpoint").wireTap("jms:two").process("acwProcessor");
		from("jms:two").process("processorTwo").marshal("bindyDataformat").to("file://../_test/")
				.to("ftp://192.168.99.100/?username=petec&password=frog");
	}
}
