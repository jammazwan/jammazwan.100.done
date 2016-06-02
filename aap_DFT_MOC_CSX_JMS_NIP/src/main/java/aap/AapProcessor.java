package aap;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import aap.domain.Cleaner;

public class AapProcessor implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {
		Cleaner cleaner = exchange.getIn().getBody(Cleaner.class);
		exchange.getOut().setBody(cleaner.toString());
	}


}
