package abq;

import java.util.Date;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;

public class AbqRoutes extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("direct:one").process(new Processor() {
			public void process(Exchange exchange) throws Exception {
				exchange.getIn().setHeader("CamelFileName", "abqImportant" + (new Date().getTime()) + ".txt");
			}
		}).to("direct:two");

		from("direct:two").to("ftp://192.168.99.100/?username=petec&password=frog").log("DONE.");
	}
}
