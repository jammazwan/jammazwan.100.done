package abo.domain;


public class Zip {
/*
 { "city" : "AGAWAM", "loc" : [ -72.622739, 42.070206 ], "pop" : 15338, "state" : "MA", "_id" : "01001" }

 */
	private String city;
	private String loc;
	private String pop;
	private String state;
	private String _id;
	
	public Zip(String city, String loc, String pop, String state, String _id) {
		super();
		this.city = city;
		this.loc = loc;
		this.pop = pop;
		this.state = state;
		this._id = _id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public String getPop() {
		return pop;
	}
	public void setPop(String pop) {
		this.pop = pop;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
}
