package Abstracts;

import Entities.Customer;
import Entities.Game;

public abstract class BaseSellerManager implements SellerService {

	@Override
	public void seller(Game game, Customer customer) {
		System.out.println(game.getGameName() + " game " + customer.getFirstName() + " to the person " + game.getPrice() + " sold for tl " );
		
	}

}
