package kodlamaio.northwind.api.controllers;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import kodlamaio.northwind.business.abstracts.UsersService;

import kodlamaio.northwind.entities.concretes.Users;

@RestController
@RequestMapping("/api/users")
public class ProductsController {
	
	private UsersService usersService;
	
	@Autowired
	public ProductsController(UsersService usersService) {
		super();
		this.usersService = usersService;
	}


	@GetMapping("/getall")
	public List<Users> getAll() {
		return this.usersService.getAll();
	}
}
