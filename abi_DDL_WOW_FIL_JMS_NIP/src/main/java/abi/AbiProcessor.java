package abi;

import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.thoughtworks.xstream.XStream;

import abi.domain.Food;
import abi.domain.Menu;

public class AbiProcessor implements Processor{
	protected XStream xstream = new XStream();

	@Override
	public void process(Exchange exchange) throws Exception {
		String xml = exchange.getIn().getBody(String.class);
		xstream.alias("menu", Menu.class);
		xstream.alias("food", Food.class);
		xstream.addImplicitCollection(Menu.class, "foods");
		Menu newMenu = (Menu) xstream.fromXML(xml);
		List<Food> menu = newMenu.getFoods(); 
		exchange.getIn().setBody(menu);
		exchange.getIn().setHeader("CamelFileName", "menu.csv");
	}
	

}
