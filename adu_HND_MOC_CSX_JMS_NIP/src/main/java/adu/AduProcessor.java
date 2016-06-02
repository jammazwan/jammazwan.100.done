package adu;

import java.util.Date;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import adu.domain.Region;
import adu.domain.Area;

public class AduProcessor implements Processor {
	
    public void process(Exchange exchange) throws Exception {
		Region region = exchange.getIn().getBody(Region.class);
		Area area = new Area();
		area.setDate(""+ new Date());
		area.setName(region.getName());
		area.setDesc("Includes region of " + region.getItem());
		exchange.getOut().setBody(area);
	}


}
