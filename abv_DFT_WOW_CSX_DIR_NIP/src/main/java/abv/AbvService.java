package abv;
import javax.jws.WebService;

import abv.domain.Leg;
import abv.domain.Foot;

@WebService
public interface AbvService {
	Foot supports(Leg leg);
}
