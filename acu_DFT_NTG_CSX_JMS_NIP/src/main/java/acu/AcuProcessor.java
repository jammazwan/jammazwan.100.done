package acu;

import java.util.Date;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import acu.domain.Cart;
import acu.domain.Result;

public class AcuProcessor implements Processor {
	
    public void process(Exchange exchange) throws Exception {
		Cart cart = exchange.getIn().getBody(Cart.class);
		Result result = new Result();
		result.setDate(""+ new Date());
		result.setName(cart.getName());
		result.setDesc("Resulting order of " + cart.getItem());
		exchange.getOut().setBody(result);
	}


}
