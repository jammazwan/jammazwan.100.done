package aav;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import aav.domain.Sale;

public class AavProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		exchange.getIn().setHeader("CamelFileName", "my_sale.csv");
		Sale sale = new Sale("MYstreet", "MYcity", "MYzip", "MYstate", "MYbeds", "MYbaths", "MYsq__ft", "MYtype",
				"MYsale_date", "MYprice", "MYlatitude", "MYlongitude");
		exchange.getIn().setBody(sale);
	}

}
