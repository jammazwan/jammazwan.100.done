package abx;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import abx.domain.Rascal;

public class AbxProcessor implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {
		exchange.getIn().setBody(new Rascal());
	}

}
