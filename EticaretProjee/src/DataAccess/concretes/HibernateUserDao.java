package DataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import DataAccess.abstracts.UserDao;
import Entities.concretes.User;

public class HibernateUserDao implements UserDao{

	List<User> users = new ArrayList<User>();
	
	@Override
	public void signIn(User user) {
		System.out.println(user.getFirstName() + " Kullanıcı başarıyla kaydedildi.");
			users.add(user);
	}

	@Override
	public void logIn(User user) {
		System.out.println(user.getFirstName() + " Kullanıcı başarıyla giriş yapıldı.");
		
	}

	@Override
	public void confirm(User user) {
		System.out.println(user.getEmail() + " Kullanıcı başarıyla doğrulandı.");
		user.setVerify(true);
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return this.users;
	}

}
