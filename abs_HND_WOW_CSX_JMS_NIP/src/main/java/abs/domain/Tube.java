package abs.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tube implements Serializable {
	private static final long serialVersionUID = 41463278969243627L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;

	private String length;
	private String thickness;
	private String diameter;
	private String material;

	public String toString() {
		return "length is " + length + " and  thickness is " + thickness + " and  diameter is " + diameter
				+ " and  material is " + material;
	}

	public Tube() {
		super();
	}

	public Tube(String length, String thickness, String diameter, String material) {
		super();
		this.length = length;
		this.thickness = thickness;
		this.diameter = diameter;
		this.material = material;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public String getThickness() {
		return thickness;
	}

	public void setThickness(String thickness) {
		this.thickness = thickness;
	}

	public String getDiameter() {
		return diameter;
	}

	public void setDiameter(String diameter) {
		this.diameter = diameter;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

}
