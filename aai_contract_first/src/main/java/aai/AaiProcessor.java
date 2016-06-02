package aai;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class AaiProcessor implements Processor {

	public void process(Exchange exchange) throws Exception {
		Car car = exchange.getIn().getBody(Car.class);
		Mechanic mechanic = new Mechanic();
		mechanic.setAge("26");
		mechanic.setTown("Wilkins, MI");
		exchange.getOut().setBody(mechanic);
	}

}
