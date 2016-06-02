package aba;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;

public class AbaRoutes extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("file://../_json/?noop=true&fileName=zip.json").to("direct:two");
		from("direct:two").to("ftp://192.168.99.100/?username=petec&password=frog").log("WOULDA");
	}
}
