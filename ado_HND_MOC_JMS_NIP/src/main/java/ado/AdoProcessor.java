package ado;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import ado.domain.Sale;

public class AdoProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		Sale sale = new Sale("MYstreet", "MYcity", "MYzip", "MYstate", "MYbeds", "MYbaths", "MYsq__ft", "MYtype",
				"MYsale_date", "MYprice", "MYlatitude", "MYlongitude");
		exchange.getIn().setBody(sale);
		exchange.getIn().setHeader("CamelFileName", "adoSale.csv");
	}

}
