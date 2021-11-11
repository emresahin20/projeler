package Abstracts;

import Entities.Customer;
import Entities.Game;

public interface CampaingService {

	void campaignAdd(Game game, Customer customer);
	void campaignUpdate(Game game, Customer customer);
	void campaignDelete(Game game, Customer customer);
}
