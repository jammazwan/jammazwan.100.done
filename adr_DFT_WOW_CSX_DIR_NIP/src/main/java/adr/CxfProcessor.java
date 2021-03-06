package adr;

import java.util.Date;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import adr.domain.Cart;
import adr.domain.Order;

public class CxfProcessor implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {
		Cart cart = exchange.getIn().getBody(Cart.class);
		Order order = new Order();
		order.setDate(""+ new Date());
		order.setName(cart.getName());
		order.setDesc("Order for " + cart.getItem());
		exchange.getOut().setBody(order);
	}

		

}
