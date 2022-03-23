package kodlamaio.northwind.business.abstracts;

import java.util.List;


import kodlamaio.northwind.entities.concretes.hayvanSahibi;

public interface HayvanSahibiService {
	void add(hayvanSahibi hayvanSahibi);
	void update(hayvanSahibi hayvanSahibi);
	
	List<hayvanSahibi> getAll();
}
