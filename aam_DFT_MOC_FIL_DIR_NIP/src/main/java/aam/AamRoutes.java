package aam;

import java.util.Date;
import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.processor.DeadLetterChannel;

import aam.domain.Trans;

public class AamRoutes extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("file://../_csv/?noop=true&fileName=trans.csv").unmarshal("bindyDataformat").process(new Processor() {
			public void process(Exchange exchange) throws Exception {
				List<Trans> list = (List<Trans>) exchange.getIn().getBody();
				StringBuffer sb = new StringBuffer();
				for (Trans trans : list) {
					sb.append(trans.getCity() + "\n");
				}
				exchange.getIn().setBody(sb.toString());
				exchange.getIn().setHeader("CamelFileName", "important" + (new Date().getTime()) + ".txt");
			}
		}).to("direct:two").to("mock:result");

		from("direct:two").to("ftp://192.168.99.100/?username=petec&password=frog").to("mock:result");
	}
}
