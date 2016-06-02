package abr.domain;

import java.io.Serializable;

public class Crank implements Serializable{
	private String handle;
	private String desc;


	public String getHandle() {
		return handle;
	}

	public void setHandle(String handle) {
		this.handle = handle;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
}
