package acm;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import acm.domain.Person;

public class AcmProcessor implements Processor {


	@Override
	public void process(Exchange exchange) throws Exception {	
		Person person = new Person("Mytitle", "MYname", "MYcountry", "MYcompany", "MYage", "MYyear");
		exchange.getIn().setBody(person);
		exchange.getIn().setHeader("CamelFileName", "acm_person.xml");
	}

}
