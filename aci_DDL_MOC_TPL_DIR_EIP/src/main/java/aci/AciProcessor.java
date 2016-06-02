package aci;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class AciProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		String newBody = exchange.getIn().getBody(String.class);
		newBody += " so there boy";
		exchange.getIn().setBody(newBody);
	}
	

}
