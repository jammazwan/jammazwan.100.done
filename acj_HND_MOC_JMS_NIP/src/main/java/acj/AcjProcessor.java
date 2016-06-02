package acj;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import acj.domain.Cd;

public class AcjProcessor implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {
		Cd cd = new Cd("Willing", "May Williams", "Afghanistan", "Columbia", "3.00", "1922");
		exchange.getIn().setBody(cd);
		exchange.getIn().setHeader("CamelFileName", "mycd.xml");
	}

}
