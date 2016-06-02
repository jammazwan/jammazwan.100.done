package add;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import add.domain.Oscar;

public class AddProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
    	Oscar oscar = new Oscar("grouch", "nylon", "back lower");
    	exchange.getIn().setBody(oscar);
    	exchange.getIn().setHeader("CamelFileName", "oscar.xml");
	}

}
