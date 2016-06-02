package adb.domain;

public class FooBaria {
	private String name;
	private String desc;
	private int size;

	public FooBaria(String name, String desc, int size) {
		super();
		this.name = name;
		this.desc = desc;
		this.size = size;
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

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
}
