package aan;
import javax.jws.WebService;

import aan.domain.Possum;
import aan.domain.Racoon;

@WebService
public interface AanService {
	Possum races(Racoon screen);
}
