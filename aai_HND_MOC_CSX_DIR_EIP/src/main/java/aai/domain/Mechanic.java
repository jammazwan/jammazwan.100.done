package aai.domain;

import java.io.Serializable;

public class Mechanic implements Serializable {
	private String age;
	private String town;

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

}
