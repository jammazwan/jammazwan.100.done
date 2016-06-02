package abr;

import java.util.Date;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import abr.domain.Pole;
import abr.domain.Crank;

public class AbrProcessor implements Processor {
	
    public void process(Exchange exchange) throws Exception {
		Pole pole = exchange.getIn().getBody(Pole.class);
		Crank crank = new Crank();
		crank.setHandle(pole.getName());
		crank.setDesc("Pole is " + pole.getType());
		exchange.getOut().setBody(crank);
	}


}
