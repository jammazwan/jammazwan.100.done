package aah.domain;

public class Foo {
	private int id;
	private String value;
	private String text;

	public Foo(int id, String value, String text) {
		super();
		this.id = id;
		this.value = value;
		this.text = text;
	}
	@Override
	public String toString(){
		String out = "{\"id\":\""+id+"\", \"value\":\""+value+"\", \"text\":\""+text + "\"}";
		return out;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
