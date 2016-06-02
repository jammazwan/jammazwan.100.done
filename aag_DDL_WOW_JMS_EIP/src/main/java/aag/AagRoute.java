package aag;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;

public class AagRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("timer://foo?repeatCount=1").process("aagProcessorOne").process("aagProcessorTwo")
				.process("aagProcessorThree").to("jms:two").process("aagProcessorThree").to("jms:two")
				.process("aagProcessorThree").to("jms:two").process("aagProcessorThree").to("jms:two")
				.process("aagProcessorThree").to("jms:two").process("aagProcessorThree").to("jms:two")
				.process("aagProcessorThree").to("jms:two");
		from("jms:two").aggregate(header("correlationValue"), new AagAggregationStrategy()).completionSize(6)
				.completionTimeout(2000).process(new Processor() {
					public void process(Exchange exchange) throws Exception {
						String text = exchange.getIn().getHeader("correlationValue").toString() + "\n"
								+ exchange.getIn().getBody().toString();
						System.out.println("\n\n" + text + "\n\n");
					}
				});
	}
}