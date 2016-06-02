package aai.domain;

import java.io.Serializable;

public class Car implements Serializable {
	private String model;
	private String year;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

}
