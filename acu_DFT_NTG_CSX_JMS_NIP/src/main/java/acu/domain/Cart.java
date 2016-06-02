package acu.domain;

import java.io.Serializable;

public class Cart implements Serializable{
	private String item;
	private String name;

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
