package abe;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import abe.domain.FooBar;

public class AbeProcessorOne implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {
		FooBar fooBar = new FooBar("oneword");
		exchange.getIn().setBody(fooBar);
	}

}
