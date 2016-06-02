package acn;
import javax.jws.WebService;

import acn.domain.Light;
import acn.domain.Screen;

@WebService
public interface AcnService {
	Light filters(Screen screen);
}
