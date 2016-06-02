package adk;

import java.util.Date;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class AdkProcessor implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {
		exchange.getIn().setHeader("CamelFileName", "adkImportant"+(new Date().getTime())+".txt");
	}

}
