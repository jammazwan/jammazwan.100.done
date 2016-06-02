package abu.domain;

import java.io.Serializable;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
@CsvRecord(separator = ",", crlf = "UNIX", skipFirstLine=true)
public class Trans implements Serializable {
    private static final long serialVersionUID = 414632787969243627L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
	@DataField(pos = 1)
	private String Transaction_date;
	@DataField(pos = 2)
	private String Product;
	@DataField(pos = 3)
	private String Price;
	@DataField(pos = 4)
	private String Payment_Type;
	@DataField(pos = 5)
	private String Name;
	@DataField(pos = 6)
	private String City;
	@DataField(pos = 7)
	private String State;
	@DataField(pos = 8)
	private String Country;
	@DataField(pos = 9)
	private String Account_Created;
	@DataField(pos = 10)
	private String Last_Login;
	@DataField(pos = 11)
	private String Latitude;
	@DataField(pos = 12)
	private String Longitude;

	public String getTransaction_date() {
		return Transaction_date;
	}

	public void setTransaction_date(String transaction_date) {
		Transaction_date = transaction_date;
	}

	public String getProduct() {
		return Product;
	}

	public void setProduct(String product) {
		Product = product;
	}

	public String getPrice() {
		return Price;
	}

	public void setPrice(String price) {
		Price = price;
	}

	public String getPayment_Type() {
		return Payment_Type;
	}

	public void setPayment_Type(String payment_Type) {
		Payment_Type = payment_Type;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public String getAccount_Created() {
		return Account_Created;
	}

	public void setAccount_Created(String account_Created) {
		Account_Created = account_Created;
	}

	public String getLast_Login() {
		return Last_Login;
	}

	public void setLast_Login(String last_Login) {
		Last_Login = last_Login;
	}

	public String getLatitude() {
		return Latitude;
	}

	public void setLatitude(String latitude) {
		Latitude = latitude;
	}

	public String getLongitude() {
		return Longitude;
	}

	public void setLongitude(String longitude) {
		Longitude = longitude;
	}

}
