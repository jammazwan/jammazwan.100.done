package acj;

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

import acj.domain.Cd;

import org.apache.camel.model.dataformat.XStreamDataFormat;

public class AcjRoutes extends RouteBuilder {

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
		from("timer://acj?repeatCount=1").process("acjProcessor").to("jms:two");
		//LOOK MA! This shouldn't be possible because used jms and Cd class is not Serializeable
		from("jms:two").marshal(xstreamDefinition).to("file://../_test/");
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
