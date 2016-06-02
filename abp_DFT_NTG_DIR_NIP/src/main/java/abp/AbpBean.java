package abp;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import abp.domain.FooBarWah;

public class AbpBean implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {
		FooBarWah fooBarWah = new FooBarWah("MYname", "MYdescription", "MYtype");
		exchange.getIn().setBody(fooBarWah);
		
	}
}
