package aax;

import java.util.Date;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class AaxProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		exchange.getIn().setBody((exchange.getIn().getBody(String.class).toLowerCase()));
		exchange.getIn().setHeader("CamelFileName", "Importantaax" + (new Date().getTime()) + ".txt");
	}

}
