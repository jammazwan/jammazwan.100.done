package aan;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import aan.domain.Possum;

public class ProcessorTwo implements Processor {
	
    public void process(Exchange exchange) throws Exception {
    	Possum possom = exchange.getIn().getBody(Possum.class);
		XmlMapper xmlMapper = new XmlMapper();
		String xml = xmlMapper.writeValueAsString(possom);
		exchange.getOut().setBody(xml);
    	exchange.getOut().setHeader("CamelFileName", "aan_races.xml");
	}


}
