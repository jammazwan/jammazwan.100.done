package acw;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import acw.domain.Buzzard;

public class AcwProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
			Buzzard buzzard = exchange.getIn().getBody(Buzzard.class);
			exchange.getOut().setBody(buzzard.toString());
	}


}
