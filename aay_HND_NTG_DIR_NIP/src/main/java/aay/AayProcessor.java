package aay;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import aay.domain.Food;

public class AayProcessor implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {
		Food food = new Food("soda pop", "0.05", "health food", "200");
		exchange.getIn().setBody(food);
	}


}
