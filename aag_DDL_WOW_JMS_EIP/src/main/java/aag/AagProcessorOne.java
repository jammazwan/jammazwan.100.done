package aag;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import aag.domain.Food;

public class AagProcessorOne implements Processor{
    public void process(Exchange exchange) throws Exception {
        Food food = new Food("apple", "1.17", "Washington County Delicious", "200");
        exchange.getIn().setBody(food);
    }

}
