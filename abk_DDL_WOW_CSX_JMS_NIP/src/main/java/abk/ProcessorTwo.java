package abk;

import java.util.Date;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import abk.domain.Tree;
import abk.domain.Leaf;

public class ProcessorTwo implements Processor {
	
    public void process(Exchange exchange) throws Exception {
    	Tree tree = exchange.getIn().getBody(Tree.class);
		XmlMapper xmlMapper = new XmlMapper();
		String xml = xmlMapper.writeValueAsString(tree);
		exchange.getOut().setBody(xml);
    	exchange.getOut().setHeader("CamelFileName", "abk_grows.xml");
	}


}
