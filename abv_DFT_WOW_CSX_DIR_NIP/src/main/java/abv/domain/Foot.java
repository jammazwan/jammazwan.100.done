package abv.domain;

import java.io.Serializable;

public class Foot implements Serializable {
	private String weight;
	private String size;

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

}
