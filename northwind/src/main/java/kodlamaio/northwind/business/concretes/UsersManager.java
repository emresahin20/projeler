package kodlamaio.northwind.business.concretes;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import kodlamaio.northwind.business.abstracts.UsersService;
import kodlamaio.northwind.dataAccess.abstracts.UsersDao;
import kodlamaio.northwind.entities.concretes.Users;

public class UsersManager implements UsersService {

	
	
	UsersDao usersDao;
	public void UsersDao (UsersDao usersDao) {
		this.usersDao = usersDao;
	}
	
	@Override
	public void add(Users users) {
		if(users.getŞifre().length()<6 ) {
			System.out.println("Zayıf şifre , şifrenizi güçlendiriniz");
		}	
		
		final String EMAIL_PATTERN = "^(.+)@(\\S+)$";
	    final Pattern pattern = Pattern.compile(EMAIL_PATTERN);
	    Matcher matcher = pattern.matcher(users.getePosta());
	      
	    	if(!matcher.matches()) {
	    	   System.out.println(users.getePosta() + " Bu e-posta , e-posta formatına uygun değil.");
	    	   
	       }
	    	for(@SuppressWarnings("unused") UsersDao users1 : usersDao.findAll());
	    		if(users.getePosta().equals(users.getePosta())) {
	    			System.out.println(users.getePosta() + "Bu e-posta sistemde mevcut");
	    		}
	    	if(users.getIsim().length()<2 && users.getSoyad().length()<2) {
	    		System.out.println("Ad ve soyad en az 2 karakterden oluşmalıdır.");
	    	} 
	
		
	}

	@Override
	public void update(Users users) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Users> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
