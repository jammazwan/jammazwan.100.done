package aai;
import javax.jws.WebService;

import aai.domain.Mechanic;
import aai.domain.Car;

@WebService
public interface AaiService {
	Mechanic fixes(Car sofa);
}
