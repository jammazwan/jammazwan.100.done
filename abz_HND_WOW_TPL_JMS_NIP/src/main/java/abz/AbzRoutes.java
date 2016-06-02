package abz;

import org.apache.camel.builder.RouteBuilder;

public class AbzRoutes extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("jms:one").to("jms:important");

		from("jms:important").log("DONE IMPORTANTLY");
	}
}
