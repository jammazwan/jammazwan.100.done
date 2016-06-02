package acu;

import java.util.Date;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import acu.domain.Cart;
import acu.domain.Result;

public class ProcessorTwo implements Processor {
	
    public void process(Exchange exchange) throws Exception {
		Cart cart = exchange.getIn().getBody(Cart.class);
		Result result = new Result();
		result.setDate(""+ new Date());
		result.setName("Bill");
		result.setDesc("Resulting in an order of " + cart.getItem());
		exchange.getOut().setBody(result);
    	exchange.getOut().setHeader("CamelFileName", "acu_result.csv");
	}


}
