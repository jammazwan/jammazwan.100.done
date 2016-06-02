package acv.domain;

import java.io.Serializable;

public class Tile implements Serializable{
	private String color;
	private String thickness;
	private String weight;
	private String dimensions;

	public Tile() {
		super();
	}

	public Tile(String color, String thickness, String weight, String dimensions) {
		super();
		this.color = color;
		this.thickness = thickness;
		this.weight = weight;
		this.dimensions = dimensions;
	}

	public String toString() {
		return "color is " + color + " and  thickness is " + thickness + " and  weight is " + weight
				+ " and  dimensions are " + dimensions;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getThickness() {
		return thickness;
	}

	public void setThickness(String thickness) {
		this.thickness = thickness;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getDimensions() {
		return dimensions;
	}

	public void setDimensions(String dimensions) {
		this.dimensions = dimensions;
	}
}
