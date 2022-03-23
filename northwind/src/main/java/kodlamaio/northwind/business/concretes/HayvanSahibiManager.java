package kodlamaio.northwind.business.concretes;

import java.util.List;

import kodlamaio.northwind.business.abstracts.HayvanSahibiService;
import kodlamaio.northwind.entities.concretes.hayvanSahibi;

public class HayvanSahibiManager implements HayvanSahibiService {

	@Override
	public void add(hayvanSahibi hayvanSahibi) {
		System.out.println("kaydınız oluşturuldu " + hayvanSahibi.getAd());
		
	}

	@Override
	public void update(hayvanSahibi hayvanSahibi) {
		System.out.println("Bilgileriniz güncellendi  " + hayvanSahibi.getAd());
		
	}

	@Override
	public List<hayvanSahibi> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
