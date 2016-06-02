package adb;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import adb.domain.FooBaria;

public class AdbProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		FooBaria fooBaria = new FooBaria("fred", "traveler", 42);
		exchange.getIn().setBody(fooBaria);
		String recipientList = "jms:" + fooBaria.getName() + ",jms:" + fooBaria.getDesc();
		exchange.getIn().setHeader("recipients", recipientList);
	}

}
