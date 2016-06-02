package aaaa.domain;

import java.util.ArrayList;
import java.util.List;

public class Nursery {
	private List<Plant> plants;

	public List<Plant> getPlants() {
		return plants;
	}

	public void setPlants(List<Plant> plants) {
		this.plants = plants;
	}

	public void addPlant(Plant plant) {
		if (plants == null) {
			plants = new ArrayList<Plant>();
		}
		if (!plants.contains(plant)) {
			plants.add(plant);
		}
	}
}
