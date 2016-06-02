package abh;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import abh.domain.FooBar;

public class AbhBean implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
			FooBar fooBar = new FooBar();
			fooBar.foo = "something";
			exchange.getIn().setBody(fooBar);

	}
}
