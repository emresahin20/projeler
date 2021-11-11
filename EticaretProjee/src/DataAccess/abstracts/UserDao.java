package DataAccess.abstracts;

import java.util.List;

import Entities.concretes.User;

public interface UserDao {
	
	void signIn(User user);
	void logIn(User user);
	void confirm(User user);
	
	List<User> getAll();
}
