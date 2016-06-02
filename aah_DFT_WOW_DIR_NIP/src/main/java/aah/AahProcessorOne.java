package aah;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import aah.domain.Foo;

public class AahProcessorOne implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {
		Foo foo = new Foo(3, "four", "This is text 5");
		exchange.getIn().setBody(foo);
	}

}
