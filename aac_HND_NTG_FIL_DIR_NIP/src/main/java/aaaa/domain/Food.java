package aaaa.domain;

public class Food {
	/*
	 * <food> <name>Belgian Waffles</name> <price>$5.95</price> <description>two
	 * of our famous Belgian Waffles with plenty of real maple
	 * syrup</description> <calories>650</calories> </food>
	 */
	private String name;
	private String price;
	private String description;
	private String calories;

	public Food(String name, String price, String description, String calories) {
		super();
		this.name = name;
		this.price = price;
		this.description = description;
		this.calories = calories;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCalories() {
		return calories;
	}

	public void setCalories(String calories) {
		this.calories = calories;
	}

}
