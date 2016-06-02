package ads.domain;

import java.io.Serializable;

public class Donut implements Serializable {
	private String name;
	private String desc;
	private String grease;
	private String sweetener;

	public Donut(String name, String desc, String grease, String sweetener) {
		super();
		this.name = name;
		this.desc = desc;
		this.grease = grease;
		this.sweetener = sweetener;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getGrease() {
		return grease;
	}

	public void setGrease(String grease) {
		this.grease = grease;
	}

	public String getSweetener() {
		return sweetener;
	}

	public void setSweetener(String sweetener) {
		this.sweetener = sweetener;
	}

}
