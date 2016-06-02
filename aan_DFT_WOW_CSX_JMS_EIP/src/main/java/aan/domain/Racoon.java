package aan.domain;

import java.io.Serializable;

public class Racoon implements Serializable{
	private String weight;
	private String speed;


	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}
}
