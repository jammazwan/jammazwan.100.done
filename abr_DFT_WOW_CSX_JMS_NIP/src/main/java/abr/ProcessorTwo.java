package abr;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import abr.domain.Crank;

public class ProcessorTwo implements Processor {
	
    public void process(Exchange exchange) throws Exception {
    	Crank crank = exchange.getIn().getBody(Crank.class);
		XmlMapper xmlMapper = new XmlMapper();
		String xml = xmlMapper.writeValueAsString(crank);
		exchange.getOut().setBody(xml);
    	exchange.getOut().setHeader("CamelFileName", "abr_turns.xml");
	}


}
