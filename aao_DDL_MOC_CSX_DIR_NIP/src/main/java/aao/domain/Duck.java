package aao.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Duck {
    private static final long serialVersionUID = 414632787969243627L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
	private String feet;
	private String color;
	private String wingspan;
	private String bill;
	private String walk;

	public String toString() {
		return "Duck with " + feet + " feet and " + bill + " bill and " + color + " color and " + wingspan
				+ " wingspan and " + walk + " walk";
	}

	public Duck() {
		super();
	}

	public Duck(String feet, String color, String wingspan, String bill, String walk) {
		super();
		this.feet = feet;
		this.color = color;
		this.wingspan = wingspan;
		this.bill = bill;
		this.walk = walk;
	}

	public String getFeet() {
		return feet;
	}

	public void setFeet(String feet) {
		this.feet = feet;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getWingspan() {
		return wingspan;
	}

	public void setWingspan(String wingspan) {
		this.wingspan = wingspan;
	}

	public String getBill() {
		return bill;
	}

	public void setBill(String bill) {
		this.bill = bill;
	}

	public String getWalk() {
		return walk;
	}

	public void setWalk(String walk) {
		this.walk = walk;
	}

}
