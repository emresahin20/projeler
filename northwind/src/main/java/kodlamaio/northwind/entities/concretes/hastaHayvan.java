package kodlamaio.northwind.entities.concretes;

public class hastaHayvan extends hayvanSahibi{

	private String tür;
	private String isim;
	private double yaş;
	private String açıklama;
	
	public hastaHayvan() {
		
	}
	
	public hastaHayvan(String tür, String isim, double yaş, String açıklama) {
		super();
		this.tür = tür;
		this.isim = isim;
		this.yaş = yaş;
		this.açıklama = açıklama;
	}

	public String getTür() {
		return tür;
	}

	public void setTür(String tür) {
		this.tür = tür;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public double getYaş() {
		return yaş;
	}

	public void setYaş(double yaş) {
		this.yaş = yaş;
	}

	public String getAçıklama() {
		return açıklama;
	}

	public void setAçıklama(String açıklama) {
		this.açıklama = açıklama;
	}
	
}
