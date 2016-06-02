package adu;

import java.util.Date;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import adu.domain.Region;
import adu.domain.Area;

public class ProcessorTwo implements Processor {
	
    public void process(Exchange exchange) throws Exception {
		Region region = exchange.getIn().getBody(Region.class);
		Area area = new Area();
		area.setDate(""+ new Date());
		area.setName("Area 52");
		area.setDesc("Encloses " + region.getItem());
		XmlMapper xmlMapper = new XmlMapper();
		String xml = xmlMapper.writeValueAsString(area);
		exchange.getOut().setBody(xml);
    	exchange.getOut().setHeader("CamelFileName", "adu_enclose.xml");
	}


}
