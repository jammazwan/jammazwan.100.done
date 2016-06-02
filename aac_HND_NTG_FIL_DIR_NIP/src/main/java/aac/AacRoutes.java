package aac;

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
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.model.dataformat.XStreamDataFormat;

import aaaa.domain.Catalog;
import aaaa.domain.Cd;

public class AacRoutes extends RouteBuilder {

	private static volatile boolean constructorInjected;
	private static volatile boolean methodInjected;
	private static StringBuffer sb = new StringBuffer();

	/*
	 * This code is derived from
	 * https://github.com/apache/camel/blob/master/components/camel-xstream/src/
	 * test/java/org/apache/camel/dataformat/xstream/XStreamConfigurationTest.
	 * java and I have absolutely no understanding how it works, just got it
	 * working and quit trying to understand it.
	 */
	@Override
	public void configure() throws Exception {
		XStreamDataFormat xstreamDefinition = new XStreamDataFormat();
		Map<String, String> aliases = new HashMap<String, String>();
		aliases.put("catalog", Catalog.class.getName());
		aliases.put("cd", Cd.class.getName());
		xstreamDefinition.setAliases(aliases);
		xstreamDefinition.setPermissions(Catalog.class, Cd.class);

		List<String> converters = new ArrayList<String>();
		/*
		 * ABSOLUTELY NO UNDERSTANDING OF NEXT TWO LINES???? WTF?
		 */
		converters.add(CheckMethodInjection.class.getName());
		converters.add(CheckConstructorInjection.class.getName());
		xstreamDefinition.setConverters(converters);

		Map<String, String[]> implicits = new HashMap<String, String[]>();
		implicits.put(Catalog.class.getName(), new String[] { "cds" });
		xstreamDefinition.setImplicitCollections(implicits);

		// from("direct:marshal").marshal(xstreamDefinition).to("mock:result");
		// from("direct:unmarshal").unmarshal(xstreamDefinition).to("mock:result");

		from("file://../_xml/?noop=true&fileName=catalog.xml")
				// .log("Starting to process xml file: ${header.CamelFileName}")
				.unmarshal(xstreamDefinition).process(new Processor() {
					public void process(Exchange exchange) throws Exception {
						Catalog catalog = exchange.getIn().getBody(Catalog.class);
						for (Cd cd : catalog.getCds()) {
							sb.append(cd.getArtist() + ", ");
							sb.append(cd.getArtist() + ", ");
							sb.append(cd.getCompany() + ", ");
							sb.append(cd.getCountry() + ", ");
							sb.append(cd.getPrice() + "\n");
						}
						exchange.getIn().setBody(sb.toString());
						exchange.getIn().setHeader("CamelFileName",
								exchange.getIn().getHeader("CamelFileName") + ".txt");
					}
				}).log("Delimited file is now being FTPd...").to("ftp://192.168.99.100/?username=petec&password=frog");

		// xstreamDefinition = new XStreamDataFormat();
		//// xstreamDefinition.setDriver("json");
		// aliases = new HashMap<String, String>();
		// aliases.put("catalog", Catalog.class.getName());
		// xstreamDefinition.setAliases(aliases);
		// xstreamDefinition.setPermissions(Catalog.class, Cd.class);
		//
		// converters = new ArrayList<String>();
		// converters.add(Cd.class.getName());
		// xstreamDefinition.setConverters(converters);
		//// from("direct:marshal-json").marshal(xstreamDefinition).to("mock:result");
		//// from("direct:unmarshal-json").unmarshal(xstreamDefinition).to("mock:result");
		//
		// org.apache.camel.dataformat.xstream.XStreamDataFormat
		// xStreamDataFormat
		// = new org.apache.camel.dataformat.xstream.XStreamDataFormat();
		//// xStreamDataFormat.setXstreamDriver(new
		// JsonHierarchicalStreamDriver());
		// xStreamDataFormat.setPermissions("+6org.apache.camel.dataformat.xstream.*");
		//
		//// from("direct:myDriver").marshal(xStreamDataFormat).to("mock:result");
		//
		// //*********************************

	}

	// public static class CdConverter implements Converter {
	//
	// @SuppressWarnings("rawtypes")
	// public boolean canConvert(Class type) {
	// return Cd.class.isAssignableFrom(type);
	// }
	//
	// public Object unmarshal(HierarchicalStreamReader reader,
	// UnmarshallingContext context) {
	// Cd cd = new Cd();
	// cd.setArtist("BOSCO"+ reader.getAttribute("artist"));
	// cd.setCompany(reader.getAttribute("company"));
	// cd.setCountry(reader.getAttribute("country"));
	// cd.setPrice(reader.getAttribute("price"));
	// cd.setTitle(reader.getAttribute("title"));
	// cd.setYear(reader.getAttribute("year"));
	// return cd;
	// }
	//
	// public void marshal(Object object, HierarchicalStreamWriter writer,
	// MarshallingContext context) {
	// writer.addAttribute("artist", ((Cd) object).getArtist());
	// writer.addAttribute("company", ((Cd) object).getCompany());
	// writer.addAttribute("country", ((Cd) object).getCountry());
	// writer.addAttribute("price", ((Cd) object).getPrice());
	// writer.addAttribute("title", ((Cd) object).getTitle());
	// writer.addAttribute("year", ((Cd) object).getYear());
	// }
	// }

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
