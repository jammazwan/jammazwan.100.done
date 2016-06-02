package acy;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;

public class AcyRoutes extends RouteBuilder {

	@Autowired
	private AcyRoutingBean exampleBean;

	@Override
	public void configure() throws Exception {
		from("file://../_csv?noop=true&fileName=crime_short.csv").unmarshal("bindyDataformat").to("jms:two");
		from("jms:two").bean("acyRoutingBean").log("DONE");
		from("jms:notmuchhere").log("NOT MUCH THERE");
	}
}
