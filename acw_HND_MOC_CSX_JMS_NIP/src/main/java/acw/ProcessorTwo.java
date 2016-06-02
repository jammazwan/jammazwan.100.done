package acw;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import acw.domain.Buzzard;

public class ProcessorTwo implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		Buzzard buzzard = exchange.getIn().getBody(Buzzard.class);
        String region = buzzard.getRegion();
        buzzard.setRegion(region.replaceAll(",", " "));
     	exchange.getIn().setHeader("CamelFileName", "acw_vulture.csv");
	}


}
