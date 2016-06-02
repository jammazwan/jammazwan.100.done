package aag;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import aag.domain.Food;

public class AagProcessorThree implements Processor {
	public void process(Exchange exchange) throws Exception {
		int i = ((int) (Math.random() * 2)+1) ;
		String xml = exchange.getIn().getBody(String.class);
		exchange.getIn().setHeader("correlationValue", ""+i);
		if (xml.length() < 60) {
			System.err.println(xml);
			throw new RuntimeException();
		}
		xml = xml.substring(0, xml.length() - 16) + i + xml.substring(xml.length() - 15, xml.length());
		System.out.println(xml);
		exchange.getIn().setBody(xml);
	}

}
