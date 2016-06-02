package aaj;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import aaj.domain.Stock;

public class AajProcessorOne implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		Stock stock = new Stock("MYpermalink", "MYcompany", 6, "MYcategory", "MYcity", "MYstate", "MYfundedDate",
				"MYraisedAmt", "MYraisedCurrency", "MY round");
		exchange.getIn().setBody(stock);
	}

}
