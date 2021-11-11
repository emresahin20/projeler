package Concrate;

import Abstracts.BaseSellerManager;
import Adapters.SellerServiceAdapter;
import Entities.Customer;
import Entities.Game;

public class SellerCustomerManager extends BaseSellerManager{

	SellerServiceAdapter sellerServiceAdapter;
	
	public SellerCustomerManager(SellerServiceAdapter sellerServiceAdapter) {
		super();
		this.sellerServiceAdapter = sellerServiceAdapter;
	}

	@Override
	public void seller(Game game, Customer customer) {
		super.seller(game, customer);
	}

}
