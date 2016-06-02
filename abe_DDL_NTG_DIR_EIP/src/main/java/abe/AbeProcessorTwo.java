package abe;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import abe.domain.FooBar;

public class AbeProcessorTwo implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {
		FooBar fooBar = (FooBar)exchange.getIn().getBody();
		fooBar.setAce("word");
		exchange.getIn().setHeader("slip", "direct:"+fooBar.getAce());
		
	}
}
