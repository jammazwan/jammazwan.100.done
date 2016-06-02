package acn.domain;

import java.io.Serializable;

public class Screen implements Serializable{
	private String weight;
	private String name;


	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
