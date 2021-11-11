package Business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Business.abstracts.UserService;
import Core.AuthService;
import DataAccess.abstracts.UserDao;
import Entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;
	private AuthService authService;
	
	public UserManager(UserDao userDao, AuthService authService) {
		super();
		this.userDao = userDao;
		this.authService = authService;
	}

	@Override
	public void signIn(User user) {
		if(user.getPassword().length()<6 ) {
			System.out.println("Zayıf şifre , şifrenizi güçlendiriniz");
		}	
		
		final String EMAIL_PATTERN = "^(.+)@(\\S+)$";
	    final Pattern pattern = Pattern.compile(EMAIL_PATTERN);
	    Matcher matcher = pattern.matcher(user.getEmail());
	      
	    	if(!matcher.matches()) {
	    	   System.out.println(user.getEmail() + " Bu e-posta , e-posta formatına uygun değil.");
	    	   
	       }
	    	for(User users : userDao.getAll());
	    		if(user.getEmail().equals(user.getEmail())) {
	    			System.out.println(user.getEmail() + "Bu e-posta sistemde mevcut");
	    		}
	    	if(user.getFirstName().length()<2 && user.getLastName().length()<2) {
	    		System.out.println("Ad ve soyad en az 2 karakterden oluşmalıdır.");
	    	} 
		
	}

	@Override
	public void logIn(User user) {
		if(	user.isVerify() == true) {
			userDao.logIn(user);
		}else {
			System.out.println("Giriş başarısız.");
		}
		
	}

	@Override
	public void confirm(User user) {
		if(user.isVerify()==true) {
			userDao.confirm(user);
			System.out.println("E-posta adresiniz doğrulandı");
			
		}else {
			System.out.println("E-posta adresiniz doğrulanamadı");
		}
		
	}

	@Override
	public void signInWithAccount(User user) {
		user.setVerify(true);
		this.authService.logIn(user);
	}

	@Override
	public void logInWithAccount(User user) {
		if(user.isVerify()==true) {
			this.authService.logIn(user);
			
		}else {
			System.out.println("Henüz Kayıt olmamışsınız");
		}
		
	}

}
