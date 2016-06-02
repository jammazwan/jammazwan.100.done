package abr;
import javax.jws.WebService;

import abr.domain.Pole;
import abr.domain.Crank;

@WebService
public interface AbrService {
	Crank turns(Pole region);
}
