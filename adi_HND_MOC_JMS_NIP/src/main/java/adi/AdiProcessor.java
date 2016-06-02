package adi;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import adi.domain.Sale;

public class AdiProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
    	Sale sale = new Sale("street", "MYcity", "MYzip", "MYstate", "MYbeds", "MYbaths", "MYsq__ft", "MYtype", "MYsale_date", "MYprice", "MYlatitude", "MYlongitude");
    	sale.setBeds("Posturebedic");
    	sale.setCity("Austin, TX");
    	sale.setPrice("$150");
    	exchange.getIn().setBody(sale);
    	exchange.getIn().setHeader("CamelFileName", "adi_sale.csv");
	}

}
