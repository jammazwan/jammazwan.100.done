package acn.domain;

import java.io.Serializable;

public class Light implements Serializable {
	private String szwitch;
	private String desc;

	public String getSzwitch() {
		return szwitch;
	}

	public void setSzwitch(String szwitch) {
		this.szwitch = szwitch;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
}
