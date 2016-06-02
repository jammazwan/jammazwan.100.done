package adn;

import org.apache.camel.RoutingSlip;

public class RoutingSequence {
	@RoutingSlip
	public String get(String body) {
		return "direct:this,direct:that";
	}

}
