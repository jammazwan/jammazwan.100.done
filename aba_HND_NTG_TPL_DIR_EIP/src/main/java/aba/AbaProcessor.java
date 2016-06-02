package aba;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;

public class AbaProcessor implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {
		String text  = exchange.getIn().getBody(String.class);
		text = text.toLowerCase();
		exchange.getOut().setBody(text);
		computeSlip(exchange.getOut());
	}

	private void computeSlip(Message out) {
		StringBuffer sb = new StringBuffer();
		String text = out.getBody(String.class);
		String[] slips = text.split(" ");
		for(int i = 0;i<slips.length; i++){
			sb.append(",direct:"+ slips[i]);
		}
		String slip = sb.toString().substring(1, sb.toString().length());
		out.setHeader("routingSlips", slip);
	}

}
