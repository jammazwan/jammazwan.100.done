package adn;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import adn.domain.Light;

public class ProcessorTwo implements Processor {
	
    public void process(Exchange exchange) throws Exception {
    	Light light = exchange.getIn().getBody(Light.class);
		XmlMapper xmlMapper = new XmlMapper();
		String xml = xmlMapper.writeValueAsString(light);
		exchange.getOut().setBody(xml);
    	exchange.getOut().setHeader("CamelFileName", "adn_filters.xml");
	}


}
