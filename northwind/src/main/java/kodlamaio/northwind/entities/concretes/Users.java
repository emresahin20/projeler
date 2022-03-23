package kodlamaio.northwind.entities.concretes;

public class Users {

	private String isim;
	private String soyad;
	private String ePosta;
	private String şifre;
	private String tekrarŞifre;
	
	public Users() {
		
	}
	
	public Users(String isim, String soyad, String ePosta, String şifre, String tekrarŞifre) {
		super();
		this.isim = isim;
		this.soyad = soyad;
		this.ePosta = ePosta;
		this.şifre = şifre;
		this.tekrarŞifre = tekrarŞifre;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public String getePosta() {
		return ePosta;
	}

	public void setePosta(String ePosta) {
		this.ePosta = ePosta;
	}

	public String getŞifre() {
		return şifre;
	}

	public void setŞifre(String şifre) {
		this.şifre = şifre;
	}

	public String getTekrarŞifre() {
		return tekrarŞifre;
	}

	public void setTekrarŞifre(String tekrarŞifre) {
		this.tekrarŞifre = tekrarŞifre;
	}
	
}
