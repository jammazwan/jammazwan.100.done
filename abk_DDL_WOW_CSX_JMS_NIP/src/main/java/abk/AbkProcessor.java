package abk;

import java.util.Date;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import abk.domain.Tree;
import abk.domain.Leaf;

public class AbkProcessor implements Processor {
	
    public void process(Exchange exchange) throws Exception {
		Leaf leaf = exchange.getIn().getBody(Leaf.class);
		Tree area = new Tree();
		area.setSpecies(leaf.getName());
		area.setDesc("Leaf is " + leaf.getType());
		exchange.getOut().setBody(area);
	}


}
