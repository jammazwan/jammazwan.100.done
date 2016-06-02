package aan.domain;

import java.io.Serializable;

public class Possum implements Serializable {
	private String legs;
	private String torso;
	public String getLegs() {
		return legs;
	}
	public void setLegs(String legs) {
		this.legs = legs;
	}
	public String getTorso() {
		return torso;
	}
	public void setTorso(String torso) {
		this.torso = torso;
	}

}
