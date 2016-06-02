package aau;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class AauProcessor  implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {
		String text = exchange.getIn().getBody(String.class);
		text = text.toUpperCase();
		exchange.getIn().setBody(text);
		exchange.getIn().setHeader("CamelFileName", "importantstuff.txt");
	}
	

}
