package act;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import act.domain.ActThing;

public class ActProcessor implements Processor {


	@Override
	public void process(Exchange exchange) throws Exception {
		ActThing actThing = new ActThing("dog catcher");
		exchange.getIn().setBody(actThing);
	}

}
