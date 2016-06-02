package abf;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import abf.domain.Plant;

public class AbfProcessor implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {
		Plant plant = new Plant("MYcommon", "MYbotanical", "MYzone", "MYlight", "MYprice", "MYavailability");
		exchange.getIn().setBody(plant);
	}

}
