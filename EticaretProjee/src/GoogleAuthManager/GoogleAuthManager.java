package GoogleAuthManager;

import Entities.concretes.User;

public class GoogleAuthManager {
	
	public void signIn(User user) {
		System.out.println(user.getFirstName() +" Kaydınız başarıyla tamamlandı.");
	}
	
	public void logIn(User user) {
		System.out.println(user.getFirstName() + " Giriş gerçekleşti.");
	}
}
