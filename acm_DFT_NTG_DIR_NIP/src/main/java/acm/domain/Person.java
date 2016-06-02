package acm.domain;

public class Person {
	/*
	 * 
	 * <title>Empire Burlesque</title> <name>Bob Dylan</name>
	 * <country>USA</country> <company>Columbia</company> <age>50</age>
	 * <year>2003</year>
	 */
	private String title;
	private String name;
	private String country;
	private String company;
	private String age;
	private String year;

	public Person(String title, String name, String country, String company, String age, String year) {
		super();
		this.title = title;
		this.name = name;
		this.country = country;
		this.company = company;
		this.age = age;
		this.year = year;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}
}
