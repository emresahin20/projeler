package kodlamaio.northwind.business.abstracts;

import java.util.List;

import kodlamaio.northwind.entities.concretes.hastaHayvan;

public interface HastaHayvanService {
	void add(hastaHayvan hastaHayvan);
	void update(hastaHayvan hastaHayvan);
	
	List<hastaHayvan> getAll();
}
