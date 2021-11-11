import Abstracts.BaseCampaignManager;
import Abstracts.BaseCustomerManager;
import Abstracts.BaseSellerManager;
import Adapters.EDevletServiceAdapter;
import Adapters.SellerServiceAdapter;
import Concrate.CampaignManager;
import Concrate.GamerCustomerManager;
import Concrate.SellerCustomerManager;
import Entities.Game;
import Entities.Gamer;
import Entities.Seller;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager baseCustomerManager = new GamerCustomerManager(new EDevletServiceAdapter());
		BaseCampaignManager baseCampaignManager = new CampaignManager(new SellerServiceAdapter());
		BaseSellerManager baseSellerManager = new SellerCustomerManager(new SellerServiceAdapter());

		Gamer gamer1 = new Gamer();
		gamer1.setId(1);
		gamer1.setFirstName(" Emre ");
		gamer1.setLastName(" Şahin ");
		gamer1.setEmail(" Eş@gmail.com ");
		gamer1.setDateOfBirth(null);
		gamer1.setUserName(" amroth ");
		gamer1.setNationalityId("11111111111");
		
		Seller seller1 = new Seller ();
		seller1.setId(2);
		seller1.setFirstName(" Akın ");
		seller1.setLastName(" Ilık ");
		seller1.setNumber(" 33333 ");
		seller1.setDateOfBirth(null);
		seller1.setNationalityId("22222222222");
		
		Game game1 = new Game();
		game1.setGameName(" Cs ");
		game1.setPrice(38);
		game1.setDiscount(10);
		
		Game game2 = new Game();
		game2.setGameName(" Pubg ");
		game2.setPrice(100);
		game2.setDiscount(57);
		
		
		baseCustomerManager.add(gamer1);
		baseCustomerManager.update(gamer1);
		baseCustomerManager.delete(gamer1);
		
		baseSellerManager.seller(game1, gamer1);
		baseSellerManager.seller(game2, gamer1);
		
		baseCampaignManager.campaignAdd(game1, seller1);
		baseCampaignManager.campaignUpdate(game2, seller1);
		baseCampaignManager.campaignDelete(game1, seller1);
		
		
		
	}

}
