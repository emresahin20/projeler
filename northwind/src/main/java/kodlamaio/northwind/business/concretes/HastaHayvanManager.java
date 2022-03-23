package kodlamaio.northwind.business.concretes;

import java.util.List;

import kodlamaio.northwind.business.abstracts.HastaHayvanService;
import kodlamaio.northwind.entities.concretes.hastaHayvan;

public class HastaHayvanManager implements HastaHayvanService{

	@Override
	public void add(hastaHayvan hastaHayvan) {
		System.out.println("kaydınız oluşturuldu " +  hastaHayvan.getAd());
		
	}

	@Override
	public void update(hastaHayvan hastaHayvan) {
		System.out.println("kaydınız güncellendi " +  hastaHayvan.getAd());
		
	}

	@Override
	public List<hastaHayvan> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
