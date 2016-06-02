package ado.domain;

import java.io.Serializable;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@CsvRecord(separator = ",", crlf = "UNIX", skipFirstLine = true)
public class Sale implements Serializable {
	@DataField(pos = 1)
	private String street;
	@DataField(pos = 2)
	private String city;
	@DataField(pos = 3)
	private String zip;
	@DataField(pos = 4)
	private String state;
	@DataField(pos = 5)
	private String beds;
	@DataField(pos = 6)
	private String baths;
	@DataField(pos = 7)
	private String sq__ft;
	@DataField(pos = 8)
	private String type;
	@DataField(pos = 9)
	private String sale_date;
	@DataField(pos = 10)
	private String price;
	@DataField(pos = 11)
	private String latitude;
	@DataField(pos = 12)
	private String longitude;

	public Sale(String street, String city, String zip, String state, String beds, String baths, String sq__ft,
			String type, String sale_date, String price, String latitude, String longitude) {
		super();
		this.street = street;
		this.city = city;
		this.zip = zip;
		this.state = state;
		this.beds = beds;
		this.baths = baths;
		this.sq__ft = sq__ft;
		this.type = type;
		this.sale_date = sale_date;
		this.price = price;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getBeds() {
		return beds;
	}

	public void setBeds(String beds) {
		this.beds = beds;
	}

	public String getBaths() {
		return baths;
	}

	public void setBaths(String baths) {
		this.baths = baths;
	}

	public String getSq__ft() {
		return sq__ft;
	}

	public void setSq__ft(String sq__ft) {
		this.sq__ft = sq__ft;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSale_date() {
		return sale_date;
	}

	public void setSale_date(String sale_date) {
		this.sale_date = sale_date;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

}
