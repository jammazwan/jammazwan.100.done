package ads;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import ads.domain.Donut;

public class AdsProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		Donut donut = new Donut("chocolate covered", "cake donut with sprinkles", "cheap", "corn syrup");
		exchange.getIn().setBody(donut);
		exchange.getIn().setHeader("CamelFileName", "donut.xml");
	}


}
