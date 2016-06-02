package abo;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.json.JsonHierarchicalStreamDriver;

import abo.domain.Zip;

public class TryMe {

	public static void main(String[] args) {
		Zip zip = new Zip("78749", "12345", "23", "TX", "001");
        XStream xstream = new XStream(new JsonHierarchicalStreamDriver());
        xstream.setMode(XStream.NO_REFERENCES);
        xstream.alias("zip", Zip.class);
        System.out.println(xstream.toXML(zip));		
	}

}
