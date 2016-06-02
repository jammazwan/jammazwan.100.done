package acx;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import acx.domain.Stock;

public class AcxProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		Stock stock = new Stock("Mypermalink", "MYcompany", "MYnumEmps", "MYcategory", "MYcity", "MYstate",
				"MYfundedDate", "MYraisedAmt", "MYraisedCurrency", "MYround");
		exchange.getIn().setBody(stock);
		exchange.getIn().setHeader("CamelFileName", "acxStock.csv");
	}

}
