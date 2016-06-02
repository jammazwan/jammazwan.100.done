package acu;

import java.util.Date;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;

import acu.domain.Cart;
import acu.domain.Result;

public class AcuRoutes extends RouteBuilder {

	public void configure() throws Exception {

		from("cxf:bean:entryEndpoint").wireTap("jms:two").process("acuProcessor");
		from("jms:two").process("processorTwo").marshal("bindyDataformat").to("file://../_test/")
				.to("ftp://192.168.99.100/?username=petec&password=frog");
	}

}