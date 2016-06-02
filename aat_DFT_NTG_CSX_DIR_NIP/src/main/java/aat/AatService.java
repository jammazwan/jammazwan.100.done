package aat;
import javax.jws.WebService;

import aat.domain.Cushion;
import aat.domain.Sofa;

@WebService
public interface AatService {
	Cushion decorates(Sofa sofa);
}
