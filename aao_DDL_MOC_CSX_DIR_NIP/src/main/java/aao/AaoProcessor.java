package aao;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import aao.domain.Duck;

public class AaoProcessor implements Processor {


	@Override
	public void process(Exchange exchange) throws Exception {	
		Duck duck = exchange.getIn().getBody(Duck.class);	
		exchange.getOut().setBody(duck.toString());
	}

}
