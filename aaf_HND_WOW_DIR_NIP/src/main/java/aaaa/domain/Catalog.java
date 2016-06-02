package aaaa.domain;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
	private List<Cd> cds;

	public List<Cd> getCds() {
		return cds;
	}

	public void setCds(List<Cd> cds) {
		this.cds = cds;
	}

	public void addCd(Cd cd) {
		if (cds == null) {
			cds = new ArrayList<Cd>();
		}
		if (!cds.contains(cd)) {
			cds.add(cd);
		}
	}
}
