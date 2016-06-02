package acy.domain;

import java.io.Serializable;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@CsvRecord(separator = ",", crlf = "UNIX", skipFirstLine=true)
public class Crime implements Serializable{
	@DataField(pos = 1)
	private String cdatetime;
	@DataField(pos = 2)
	private String address;
	@DataField(pos = 3)
	private String district;
	@DataField(pos = 4)
	private String beat;
	@DataField(pos = 5)
	private String grid;
	@DataField(pos = 6)
	private String crimedescr;
	@DataField(pos = 7)
	private String ucr_ncic_code;
	@DataField(pos = 8)
	private String latitude;
	@DataField(pos = 9)
	private String longitude;

	public String getCdatetime() {
		return cdatetime;
	}

	public void setCdatetime(String cdatetime) {
		this.cdatetime = cdatetime;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getBeat() {
		return beat;
	}

	public void setBeat(String beat) {
		this.beat = beat;
	}

	public String getGrid() {
		return grid;
	}

	public void setGrid(String grid) {
		this.grid = grid;
	}

	public String getCrimedescr() {
		return crimedescr;
	}

	public void setCrimedescr(String crimedescr) {
		this.crimedescr = crimedescr;
	}

	public String getUcr_ncic_code() {
		return ucr_ncic_code;
	}

	public void setUcr_ncic_code(String ucr_ncic_code) {
		this.ucr_ncic_code = ucr_ncic_code;
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
