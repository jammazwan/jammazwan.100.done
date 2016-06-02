package acs;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import acs.domain.Stock;

public class AcsProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		Stock stock = new Stock("MYpermalink", "MYcompany", "MYnumEmps", "MYcategory", "MYcity", "MYstate",
				"MYfundedDate", "MYraisedAmt", "MYraisedCurrency", "MYround");
		exchange.getIn().setBody(stock);
		exchange.getIn().setHeader("CamelFileName", "acsStock.csv");
	}

}
