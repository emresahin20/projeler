package springintroo;

public class CustomerManager {
	
	private CustomerDalDao customerDal;
	
	
	public CustomerManager(CustomerDalDao customerDal) {
		super();
		this.customerDal = customerDal;
	}


	public void add() {
		customerDal.add();
	}
}
