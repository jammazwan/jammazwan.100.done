package adh;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class AdhProcessor implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {
		String xml = exchange.getIn().getBody(String.class);
		xml = xml.replaceAll("food>", "chow>");
		System.out.println(xml);
		exchange.getIn().setBody(xml);
		exchange.getIn().setHeader("recipients", "direct:beekeeper");
	}

}
