package abf.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Plant implements Serializable {
    private static final long serialVersionUID = 414632787969243627L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
	/*
	 * <plant> <common>Buttercup</common> <botanical>Ranunculus</botanical>
	 * <zone>4</zone> <light>Shade</light> <price>$2.57</price>
	 * <availability>061099</availability> </plant>
	 */
	private String common;
	private String botanical;
	private String zone;
	private String light;
	private String price;
	private String availability;
	
	public Plant(){
		super();
	}
	

	public Plant(String common, String botanical, String zone, String light, String price, String availability) {
		super();
		this.common = common;
		this.botanical = botanical;
		this.zone = zone;
		this.light = light;
		this.price = price;
		this.availability = availability;
	}

	public String getCommon() {
		return common;
	}

	public void setCommon(String common) {
		this.common = common;
	}

	public String getBotanical() {
		return botanical;
	}

	public void setBotanical(String botanical) {
		this.botanical = botanical;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public String getLight() {
		return light;
	}

	public void setLight(String light) {
		this.light = light;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

}
