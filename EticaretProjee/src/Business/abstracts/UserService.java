package Business.abstracts;

import Entities.concretes.User;

public interface UserService {
	
	void signIn(User user);
	void logIn(User user);
	void confirm(User user);
	void signInWithAccount(User user);
	void logInWithAccount(User user);
}
