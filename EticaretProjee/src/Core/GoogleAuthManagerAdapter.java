package Core;

import Entities.concretes.User;
import GoogleAuthManager.GoogleAuthManager;

public class GoogleAuthManagerAdapter implements AuthService {

	GoogleAuthManager googleAuthManager;
	
	
	
	public GoogleAuthManagerAdapter(GoogleAuthManager googleAuthManager) {
		super();
		this.googleAuthManager = googleAuthManager;
	}

	@Override
	public void signIn(User user) {
		googleAuthManager.signIn(user);
		
	}

	@Override
	public void logIn(User user) {
		googleAuthManager.logIn(user);
		
	}

}
