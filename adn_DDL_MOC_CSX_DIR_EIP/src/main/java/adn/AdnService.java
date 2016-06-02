package adn;
import javax.jws.WebService;

import adn.domain.Light;
import adn.domain.Screen;

@WebService
public interface AdnService {
	Light filters(Screen screen);
}
