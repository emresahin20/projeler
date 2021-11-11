package Concrate;

import Abstracts.BaseCampaignManager;
import Adapters.SellerServiceAdapter;
import Entities.Customer;
import Entities.Game;

public class CampaignManager extends BaseCampaignManager{

	
	SellerServiceAdapter sellerServiceAdapter;
	
	public CampaignManager(SellerServiceAdapter sellerServiceAdapter) {
		super();
		this.sellerServiceAdapter = sellerServiceAdapter;
	}

	@Override
	public void campaignAdd(Game game, Customer customer) {
		super.campaignAdd(game, customer);
	}

	@Override
	public void campaignUpdate(Game game, Customer customer) {
		game.setPrice((int)this.sellerServiceAdapter.discountedPrice(game));
		super.campaignUpdate(game, customer);
	}

	@Override
	public void campaignDelete(Game game, Customer customer) {
		// TODO Auto-generated method stub
		super.campaignDelete(game, customer);
	}

	
	}


