package gameSalesProjectDemo.Concrete;

import gameSalesProjectDemo.Abstract.IGameSalesService;
import gameSalesProjectDemo.Entities.Campaign;
import gameSalesProjectDemo.Entities.Game;
import gameSalesProjectDemo.Entities.Gamer;

public class GameSalesManager implements IGameSalesService {

	@Override
	public void sell(Gamer gamer, Game game) {
		
		System.out.println("Sayýn " + gamer.getFirstName()+ " " + game.getName() + " isimli oyunu baþarý ile satýn aldýnýz");
		
	}

	@Override
	public void sell(Gamer gamer, Game game, Campaign campaign) {
		System.out.println("Sayýn " + gamer.getFirstName()+ " " + game.getName() + " isimli oyunu "+ campaign.getDiscount() + " TL indirim ile satýn aldýnýz");		
	}


	
	

}
