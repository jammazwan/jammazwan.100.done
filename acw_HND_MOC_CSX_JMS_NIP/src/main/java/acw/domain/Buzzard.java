package acw.domain;

import java.io.Serializable;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@CsvRecord(separator = ",", crlf = "UNIX", skipFirstLine = true)
public class Buzzard implements Serializable {
	@DataField(pos = 1)
	private String age;
	@DataField(pos = 2)
	private String subspecies;
	@DataField(pos = 3)
	private String region;
	@DataField(pos = 4)
	private String wingspan;
	
	public Buzzard(){
		super();
	}

	public Buzzard(String age, String subspecies, String region, String wingspan) {
		super();
		this.age = age;
		this.subspecies = subspecies;
		this.region = region;
		this.wingspan = wingspan;
	}

	public String toString() {
		return "age is " + age + " and  subspecies is " + subspecies + " and  region is " + region
				+ " and  wingspan is " + wingspan;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSubspecies() {
		return subspecies;
	}

	public void setSubspecies(String subspecies) {
		this.subspecies = subspecies;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getWingspan() {
		return wingspan;
	}

	public void setWingspan(String wingspan) {
		this.wingspan = wingspan;
	}

}
