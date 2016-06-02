package aag;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import aag.domain.Food;

public class AagProcessorTwo implements Processor{
    public void process(Exchange exchange) throws Exception {
		int i = ((int) (Math.random() * 2)+1) ;
       Food food = (Food)exchange.getIn().getBody(Food.class);
       String xml = "<?xml version=\"1.0\" encoding=\"ISO8859-1\" ?><food><name>" + food.getName() + "</name><price>"+food.getPrice()+"</price><index>" + i + "</index></food>";
       exchange.getIn().setBody(xml);
    }

}
