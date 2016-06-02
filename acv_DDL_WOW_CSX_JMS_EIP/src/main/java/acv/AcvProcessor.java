package acv;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import acv.domain.Tile;

public class AcvProcessor implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {
		Tile tile = exchange.getIn().getBody(Tile.class);
		exchange.getOut().setBody(tile.toString());
	}

}
