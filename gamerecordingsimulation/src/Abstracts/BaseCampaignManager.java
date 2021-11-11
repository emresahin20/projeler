package Abstracts;

import Entities.Customer;
import Entities.Game;

public abstract class BaseCampaignManager implements CampaingService {

	@Override
	public void campaignAdd(Game game, Customer customer) {
		System.out.println(game.getGameName() + " game " + customer.getFirstName() + " to the person " + game.getDiscount() + " on sale ");
		
	}

	@Override
	public void campaignUpdate(Game game, Customer customer) {
		System.out.println(game.getGameName() + " new price of the game "  + game.getPrice());
	}

	@Override
	public void campaignDelete(Game game, Customer customer) {
		System.out.println(game.getGameName() + " game discount " + customer.getFirstName() + " terminated by ");	
	}
}
