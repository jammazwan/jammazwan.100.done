package aaf;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import aaaa.domain.Cd;

public class AafProcessorOne implements Processor{
    public void process(Exchange exchange) throws Exception {
        Cd cd = new Cd("Harry Connig Live", "Harry Connig", "USA", "Warner Bros", "17.00", "1924");
        exchange.getIn().setBody(cd);
    }

}
