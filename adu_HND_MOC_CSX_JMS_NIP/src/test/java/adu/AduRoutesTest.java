package adu;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import adu.domain.Area;

public class AduRoutesTest {

	@Test
	public void test() throws Exception {
		Area area = new Area();
		area.setDate("" + new Date().toString());
		area.setDesc("wide");
		area.setName("here");
		XmlMapper xmlMapper = new XmlMapper();
		String xml = xmlMapper.writeValueAsString(area);
		assertTrue(xml.startsWith("<Area><name>here</name>"));
	}

}
