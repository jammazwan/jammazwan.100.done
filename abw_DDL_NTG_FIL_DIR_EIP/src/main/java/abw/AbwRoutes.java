package abw;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;

public class AbwRoutes extends RouteBuilder {

	@SuppressWarnings("deprecation")
	@Override
	public void configure() throws Exception {
		from("file://../_xml/?noop=true&fileName=catalog.xml").process("abwProcessor").to("direct:two").log("Not done");

		from("direct:two").routingSlip("slip");

		from("direct:a").log("A");
		from("direct:b").log("B");
		from("direct:c").log("C");
	}
}
