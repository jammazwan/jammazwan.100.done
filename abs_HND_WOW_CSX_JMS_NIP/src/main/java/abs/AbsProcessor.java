package abs;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import abs.domain.Tube;

public class AbsProcessor implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {
		Tube tube = exchange.getIn().getBody(Tube.class);
		exchange.getOut().setBody(tube.toString());
	}


}
