package kodlamaio.northwind.business.abstracts;

import java.util.List;

import kodlamaio.northwind.entities.concretes.Users;

public interface UsersService {

	void add(Users users);
	void update(Users users);
	
	List<Users> getAll();

}
