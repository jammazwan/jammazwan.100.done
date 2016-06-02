package act.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class ActThing {
    private static final long serialVersionUID = 414632787969243627L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
	private String name;

	public ActThing(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
