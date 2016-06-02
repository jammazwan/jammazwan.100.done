package aal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

import aal.domain.Cd;

import org.apache.camel.model.dataformat.XStreamDataFormat;

/*
 * Note that this touches both XStream to serialize from xml,
 *  and jpa to deserialize from object into db. Still worked.
 */
public class AalRoutes extends RouteBuilder {
	/*
	 * also see AacRoutes.java for working example This code is derived from
	 * https://github.com/apache/camel/blob/master/components/camel-xstream/src/
	 * test/java/org/apache/camel/dataformat/xstream/XStreamConfigurationTest.
	 * java and I have absolutely no understanding how it works, just got it
	 * working and quit trying to understand it.
	 */

	private static volatile boolean constructorInjected;
	private static volatile boolean methodInjected;

	@Override
	public void configure() throws Exception {
		XStreamDataFormat xstreamDefinition = new XStreamDataFormat();
		Map<String, String> aliases = new HashMap<String, String>();
		aliases.put("cd", Cd.class.getName());
		xstreamDefinition.setAliases(aliases);
		xstreamDefinition.setPermissions(Cd.class);
		List<String> converters = new ArrayList<String>();
		converters.add(CheckMethodInjection.class.getName());
		converters.add(CheckConstructorInjection.class.getName());
		xstreamDefinition.setConverters(converters);

		from("file://../_xml/?noop=true&fileName=cd.xml").log("Starting to process xml file: ${header.CamelFileName}")
				.unmarshal(xstreamDefinition).process(new Processor() {
					public void process(Exchange exchange) throws Exception {
						Cd cd = (Cd) exchange.getIn().getBody(Cd.class);
					}
				}).to("direct:two").to("mock:result");

		from("direct:two").to("jpa:aal.domain.Cd").to("mock:result");
	}

	public static class CheckConstructorInjection implements Converter {
		public CheckConstructorInjection(XStream xstream) {
			if (xstream != null) {
				constructorInjected = true;
			} else {
				throw new RuntimeException("XStream should not be null");
			}
		}

		public void marshal(Object source, HierarchicalStreamWriter writer, MarshallingContext context) {
		}

		public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
			return null;
		}

		@SuppressWarnings("rawtypes")
		public boolean canConvert(Class type) {
			return false;
		}
	}

	public static class CheckMethodInjection implements Converter {
		public CheckMethodInjection() {

		}

		public void setXStream(XStream xstream) {
			if (xstream != null) {
				methodInjected = true;
			} else {
				throw new RuntimeException("XStream should not be null");
			}
		}

		public void marshal(Object source, HierarchicalStreamWriter writer, MarshallingContext context) {
		}

		public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
			return null;
		}

		@SuppressWarnings("rawtypes")
		public boolean canConvert(Class type) {
			return false;
		}
	}

}
