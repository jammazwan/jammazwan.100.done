package adc;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class AdcProcessor implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {
		String text = exchange.getIn().getBody(String.class);
		exchange.getIn().setBody(text.toUpperCase());
	}

}
