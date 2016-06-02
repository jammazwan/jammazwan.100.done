package abw;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class AbwProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		exchange.getIn().setHeader("slip", "direct:a, direct:b, direct:c");
	}

}
