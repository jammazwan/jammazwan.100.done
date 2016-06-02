package adu;
import javax.jws.WebService;

import adu.domain.Region;
import adu.domain.Area;

@WebService
public interface AduService {
	Area enclose(Region region);
}
