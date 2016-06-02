package abv;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import abv.domain.Foot;
import abv.domain.Leg;

public class ProcessorTwo implements Processor {
	
    public void process(Exchange exchange) throws Exception {
    	Foot foot = exchange.getIn().getBody(Foot.class);
		XmlMapper xmlMapper = new XmlMapper();
		String xml = xmlMapper.writeValueAsString(foot);
		exchange.getOut().setBody(xml);
    	exchange.getOut().setHeader("CamelFileName", "abv_supports.xml");
	}


}
