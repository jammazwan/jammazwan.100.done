package acs.domain;

import java.io.Serializable;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@CsvRecord(separator = ",", crlf = "UNIX", skipFirstLine=true)
public class Stock implements Serializable {
	@DataField(pos = 1)
	private String permalink;
	@DataField(pos = 2)
	private String company;
	@DataField(pos = 3)
	private String numEmps;
	@DataField(pos = 4)
	private String category;
	@DataField(pos = 5)
	private String city;
	@DataField(pos = 6)
	private String state;
	@DataField(pos = 7)
	private String fundedDate;
	@DataField(pos = 8)
	private String raisedAmt;
	@DataField(pos = 9)
	private String raisedCurrency;
	@DataField(pos = 10)
	private String round;


	public Stock(String permalink, String company, String numEmps, String category, String city, String state,
			String fundedDate, String raisedAmt, String raisedCurrency, String round) {
		super();
		this.permalink = permalink;
		this.company = company;
		this.numEmps = numEmps;
		this.category = category;
		this.city = city;
		this.state = state;
		this.fundedDate = fundedDate;
		this.raisedAmt = raisedAmt;
		this.raisedCurrency = raisedCurrency;
		this.round = round;
	}
	public String getPermalink() {
		return permalink;
	}

	public void setPermalink(String permalink) {
		this.permalink = permalink;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getNumEmps() {
		return numEmps;
	}

	public void setNumEmps(String numEmps) {
		this.numEmps = numEmps;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getFundedDate() {
		return fundedDate;
	}

	public void setFundedDate(String fundedDate) {
		this.fundedDate = fundedDate;
	}

	public String getRaisedAmt() {
		return raisedAmt;
	}

	public void setRaisedAmt(String raisedAmt) {
		this.raisedAmt = raisedAmt;
	}

	public String getRaisedCurrency() {
		return raisedCurrency;
	}

	public void setRaisedCurrency(String raisedCurrency) {
		this.raisedCurrency = raisedCurrency;
	}

	public String getRound() {
		return round;
	}

	public void setRound(String round) {
		this.round = round;
	}

}
