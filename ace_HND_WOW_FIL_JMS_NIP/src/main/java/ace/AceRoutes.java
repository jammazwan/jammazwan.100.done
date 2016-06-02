package ace;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

import ace.domain.Person;

import org.apache.camel.model.dataformat.XStreamDataFormat;

public class AceRoutes extends RouteBuilder {
	private static volatile boolean constructorInjected;
	private static volatile boolean methodInjected;

	@Override
	public void configure() throws Exception {

		XStreamDataFormat xstreamDefinition = new XStreamDataFormat();
		Map<String, String> aliases = new HashMap<String, String>();
		aliases.put("person", Person.class.getName());
		xstreamDefinition.setAliases(aliases);
		xstreamDefinition.setPermissions(Person.class);
		List<String> converters = new ArrayList<String>();
		converters.add(CheckMethodInjection.class.getName());
		converters.add(CheckConstructorInjection.class.getName());
		xstreamDefinition.setConverters(converters);
		from("file://../_xml/?noop=true&fileName=person.xml").to("jms:two");
		from("jms:two").unmarshal(xstreamDefinition).log("Starting to process xml file: ${header.CamelFileName}")
				.to("jpa:ace.domain.Person");
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
