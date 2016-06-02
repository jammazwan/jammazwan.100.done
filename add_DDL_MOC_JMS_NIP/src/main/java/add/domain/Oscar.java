package add.domain;

import java.io.Serializable;

public class Oscar implements Serializable{
	private String name;
	private String fur;
	private String handSlot;
	
	
	public Oscar(String name, String fur, String handSlot) {
		super();
		this.name = name;
		this.fur = fur;
		this.handSlot = handSlot;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFur() {
		return fur;
	}
	public void setFur(String fur) {
		this.fur = fur;
	}
	public String getHandSlot() {
		return handSlot;
	}
	public void setHandSlot(String handSlot) {
		this.handSlot = handSlot;
	}
}
