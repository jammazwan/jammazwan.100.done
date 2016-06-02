package abu;

import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;

import abu.domain.Trans;

public class AbuRoutes extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("file://../_csv/?noop=true&fileName=trans.csv").unmarshal("bindyDataformat").process(new Processor() {
			public void process(Exchange exchange) throws Exception {
				List<Trans> list = (List<Trans>) exchange.getIn().getBody();
			}
		}).to("jms:two");
		from("jms:two")
		.to("jpa:aal.domain.Cd").log("not done yet");
	}
}
