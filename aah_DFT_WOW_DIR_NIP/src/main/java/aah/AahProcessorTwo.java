package aah;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import aah.domain.Foo;

public class AahProcessorTwo implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {
		Foo foo = (Foo)exchange.getIn().getBody(Foo.class);
		String json = foo.toString();
		exchange.getIn().setBody(json);
		exchange.getIn().setHeader("CamelFileName", "foo.json");
	}

}
