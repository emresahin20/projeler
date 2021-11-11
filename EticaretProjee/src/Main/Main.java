package Main;

import Business.abstracts.UserService;
import Business.concretes.UserManager;
import Core.GoogleAuthManagerAdapter;
import DataAccess.concretes.HibernateUserDao;
import Entities.concretes.User;
import GoogleAuthManager.GoogleAuthManager;

public class Main {

	public static void main(String[] args) {
		UserService userService= new UserManager(new HibernateUserDao() , new GoogleAuthManagerAdapter(new GoogleAuthManager()));
		User user= new User(1, "Emre", "Şahin", "sahinemre20@icloud.com", "1234522",true);
		
		userService.signIn(user);
		userService.logIn(user);
		userService.confirm(user);
		userService.logInWithAccount(user);
		userService.signInWithAccount(user);
	}

}
