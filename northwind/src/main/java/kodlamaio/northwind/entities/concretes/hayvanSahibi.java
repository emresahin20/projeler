package kodlamaio.northwind.entities.concretes;

public class hayvanSahibi  {

	private int id;
	private String ad;
	private String soyad;
	private String iletişimB;
	private String telefon;
	private String ePosta;
	
	public hayvanSahibi() {
		
	}
	
	
	public hayvanSahibi(int id, String ad, String soyad, String iletişimB, String telefon, String ePosta) {
		super();
		this.id = id;
		this.ad = ad;
		this.soyad = soyad;
		this.iletişimB = iletişimB;
		this.telefon = telefon;
		this.ePosta = ePosta;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getAd() {
		return ad;
	}


	public void setAd(String ad) {
		this.ad = ad;
	}


	public String getSoyad() {
		return soyad;
	}


	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}


	public String getIletişimB() {
		return iletişimB;
	}


	public void setIletişimB(String iletişimB) {
		this.iletişimB = iletişimB;
	}


	public String getTelefon() {
		return telefon;
	}


	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}


	public String getePosta() {
		return ePosta;
	}


	public void setePosta(String ePosta) {
		this.ePosta = ePosta;
	}
}
