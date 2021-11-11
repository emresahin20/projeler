package Main;

import java.time.LocalDate;

import Abstracts.BaseCustomerManager;
import Adapters.MernisAdapterService;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		 BaseCustomerManager neroCustomerManager=new NeroCustomerManager();
		 BaseCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new MernisAdapterService());
		
		 Customer customer1 = new Customer();
		 customer1.setId(1);
		 customer1.setFirstName("Emre");
		 customer1.setLastName("Şahin");
		 customer1.setNationalityId("1112222333344");
		 customer1.setDateOfBirth(LocalDate.of(2001, 06, 18));
		 
		 
		 neroCustomerManager.save(customer1);
		 starbucksCustomerManager.save(customer1);
		 
		 
	}

	
	

}
