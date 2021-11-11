package Adapters;

import Abstracts.CustomerCheckService;
import Entities.Customer;

public class EDevletServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return customer.getNationalityId().length()==11;
	}

}
