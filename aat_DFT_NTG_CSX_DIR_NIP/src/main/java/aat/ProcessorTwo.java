package aat;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import aat.domain.Cushion;
import aat.domain.Sofa;

public class ProcessorTwo implements Processor {
	
    public void process(Exchange exchange) throws Exception {
    	Cushion cushion = exchange.getIn().getBody(Cushion.class);
		XmlMapper xmlMapper = new XmlMapper();
		String xml = xmlMapper.writeValueAsString(cushion);
		exchange.getOut().setBody(xml);
    	exchange.getOut().setHeader("CamelFileName", "aat_decorates.xml");
	}


}
