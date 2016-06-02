package aai;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import aai.domain.Mechanic;
import aai.domain.Car;

public class AaiProcessor implements Processor {

	public void process(Exchange exchange) throws Exception {
		Car car = exchange.getIn().getBody(Car.class);
		Mechanic mechanic = new Mechanic();
		mechanic.setTown("Wilkins, Missouri, which means the favorite car is " + car.getModel());
		mechanic.setAge("22 but acts older because this is a " + car.getYear() + "car");
		exchange.getOut().setBody(mechanic);
	}

}
