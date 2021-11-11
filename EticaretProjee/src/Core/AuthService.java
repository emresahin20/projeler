package Core;

import Entities.concretes.User;

public interface AuthService {
	
	void signIn(User user);
	void logIn(User user);
}
