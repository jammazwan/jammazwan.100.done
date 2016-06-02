package abv;

import java.util.Date;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import abv.domain.Leg;
import abv.domain.Foot;

public class AbvProcessor implements Processor {
	
    public void process(Exchange exchange) throws Exception {
		Leg leg = exchange.getIn().getBody(Leg.class);
		Foot foot = new Foot();
		foot.setSize(leg.getLength());
		foot.setWeight("Weight is a function of leg strength, which is " + leg.getFitness());
		exchange.getOut().setBody(foot);
	}


}
