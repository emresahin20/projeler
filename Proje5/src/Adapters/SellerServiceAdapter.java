package Adapters;

import Abstracts.SellerDiscountService;
import Entities.Game;

public class SellerServiceAdapter implements SellerDiscountService {


	@Override
	public double discountedPrice(Game game) {
		return game.getPrice()- ( game.getPrice() * game.getDiscount() /100);
	}

}
