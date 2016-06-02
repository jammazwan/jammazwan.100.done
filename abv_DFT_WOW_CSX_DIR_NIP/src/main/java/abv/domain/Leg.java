package abv.domain;

import java.io.Serializable;

public class Leg implements Serializable {
	private String length;
	private String fitness;

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public String getFitness() {
		return fitness;
	}

	public void setFitness(String fitness) {
		this.fitness = fitness;
	}

}
