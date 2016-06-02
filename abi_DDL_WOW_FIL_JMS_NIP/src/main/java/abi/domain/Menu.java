package abi.domain;

import java.util.ArrayList;
import java.util.List;

public class Menu {
	private List<Food> foods;

	public List<Food> getFoods() {
		return foods;
	}

	public void setFoods(List<Food> foods) {
		this.foods = foods;
	}

	public void addFood(Food food) {
		if (foods == null) {
			foods = new ArrayList<Food>();
		}
		if (!foods.contains(food)) {
			foods.add(food);
		}
	}
}
