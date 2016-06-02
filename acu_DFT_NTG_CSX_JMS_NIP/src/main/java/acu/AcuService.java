package acu;
import javax.jws.WebService;

import acu.domain.Cart;
import acu.domain.Result;

@WebService
public interface AcuService {
	Result click(Cart cart);
}
