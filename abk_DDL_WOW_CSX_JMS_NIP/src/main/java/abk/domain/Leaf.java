package abk.domain;

import java.io.Serializable;

public class Leaf implements Serializable{
	private String type;
	private String name;

	public String getType() {
		return type;
	}

	public void setType(String item) {
		this.type = item;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
