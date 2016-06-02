package adn;

import java.util.Date;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import adn.domain.Light;
import adn.domain.Screen;

public class AdnProcessor implements Processor {
	
    public void process(Exchange exchange) throws Exception {
		Screen screen = exchange.getIn().getBody(Screen.class);
		Light light = new Light();
		light.setSzwitch(screen.getName());
		light.setDesc("Switch is for " + screen.getWeight());
		exchange.getOut().setBody(light);
	}


}
