package adu.domain;

import java.io.Serializable;

public class Region implements Serializable{
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
