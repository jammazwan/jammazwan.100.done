package aaf;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import aaaa.domain.Cd;

public class AafProcessorTwo implements Processor{
    public void process(Exchange exchange) throws Exception {
       Cd cd = (Cd)exchange.getIn().getBody(Cd.class);
       String text = cd.getArtist() + " " + cd.getPrice();
       exchange.getIn().setBody(text);
       exchange.getIn().setHeader("CamelFileName", "cd.txt");
    }

}
