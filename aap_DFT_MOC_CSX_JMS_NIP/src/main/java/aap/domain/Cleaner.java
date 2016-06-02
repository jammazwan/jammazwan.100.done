package aap.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cleaner implements Serializable{
	private static final long serialVersionUID = 414632787969243627L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	private String name;
	private String age;
	private String health;
	private String oCDness;

	public Cleaner() {
		super();
	}

	public Cleaner(String name, String age, String health, String oCDness) {
		super();
		this.name = name;
		this.age = age;
		this.health = health;
		this.oCDness = oCDness;
	}

	public String toString() {
		return "name is " + name + " and  age is " + age + " and  health is " + health + " and  oCDness is " + oCDness;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getHealth() {
		return health;
	}

	public void setHealth(String health) {
		this.health = health;
	}

	public String getOCDness() {
		return oCDness;
	}

	public void setOCDness(String oCDness) {
		this.oCDness = oCDness;
	}

}
