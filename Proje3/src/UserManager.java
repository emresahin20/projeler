
public class UserManager {

	void logIn(User user) {
		System.out.println("Kaydınız Yapıldı " + user.firstName);
	}
	
	void singIn(User user) {
		System.out.println("Giriş Yapıldı" + user.firstName);	
	}
	
	void singOut(User user) {
		System.out.println("Çıkış Yapıldı" + user.firstName);
	}
}
