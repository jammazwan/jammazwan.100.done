package aat;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import aat.domain.Cushion;
import aat.domain.Sofa;

public class AatProcessor implements Processor {
	
    public void process(Exchange exchange) throws Exception {
		Sofa sofa = exchange.getIn().getBody(Sofa.class);
		Cushion cushion = new Cushion();
		cushion.setPattern(sofa.getFirmness());
		cushion.setColor("Weight is a function of leg strength, which is " + sofa.getMaterial());
		exchange.getOut().setBody(cushion);
	}


}
