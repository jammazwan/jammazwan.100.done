package aan;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import aan.domain.Possum;
import aan.domain.Racoon;

public class AanProcessor implements Processor {
	
    public void process(Exchange exchange) throws Exception {
		Racoon racoon = exchange.getIn().getBody(Racoon.class);
		Possum possom = new Possum();
		possom.setTorso("medium");
		possom.setLegs("Legs are stronger than for a racoon's weight which is " + racoon.getWeight());
		exchange.getOut().setBody(possom);
		exchange.getOut().setHeader("routeslip", exchange.getIn().getHeader("routeslip"));
	}


}
