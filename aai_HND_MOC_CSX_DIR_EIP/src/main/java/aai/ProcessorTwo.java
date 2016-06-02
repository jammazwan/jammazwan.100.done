package aai;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import aai.domain.Mechanic;
import aai.domain.Car;

public class ProcessorTwo implements Processor {
	
    public void process(Exchange exchange) throws Exception {
    	Mechanic mechanic = exchange.getIn().getBody(Mechanic.class);
		XmlMapper xmlMapper = new XmlMapper();
		String xml = xmlMapper.writeValueAsString(mechanic);
		exchange.getOut().setBody(xml);
    	exchange.getOut().setHeader("CamelFileName", "aai_fixes.xml");
	}


}
