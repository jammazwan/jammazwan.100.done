package aao;
import javax.jws.WebService;

import aao.domain.Duck;

@WebService
public interface AaoService {
	String fixes(Duck duck);
}
