package Concrate;

import Abstracts.BaseCustomerManager;
import Abstracts.CustomerCheckService;
import Entities.Customer;

public class GamerCustomerManager extends BaseCustomerManager {
	
	CustomerCheckService customerCheckService;
	
	public GamerCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void add(Customer customer) {
		if(this.customerCheckService.checkIfRealPerson(customer)) {
			super.add(customer);
		}
		else {
			System.out.println("Not a Valid Person");
		}
	}	

	@Override
	public void update(Customer customer) {
		if(this.customerCheckService.checkIfRealPerson(customer)) {
			super.update(customer);
		}
		else {
			System.out.println("Not a Valid Person");
		}
	}

	@Override
	public void delete(Customer customer) {
		if(this.customerCheckService.checkIfRealPerson(customer)) {
			super.update(customer);
		}
		else {
			System.out.println("Not a Valid Person");
		}

	}
}
