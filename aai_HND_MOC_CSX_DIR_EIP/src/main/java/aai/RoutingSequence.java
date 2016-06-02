package aai;

import org.apache.camel.RoutingSlip;

public class RoutingSequence {
	@RoutingSlip 
	public String get(String body){
		return"direct:three, mock:four";
	}

}
