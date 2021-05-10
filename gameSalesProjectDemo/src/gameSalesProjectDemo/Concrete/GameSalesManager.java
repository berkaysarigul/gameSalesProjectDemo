package gameSalesProjectDemo.Concrete;

import gameSalesProjectDemo.Abstract.IGameSalesService;
import gameSalesProjectDemo.Entities.Campaign;
import gameSalesProjectDemo.Entities.Game;
import gameSalesProjectDemo.Entities.Gamer;

public class GameSalesManager implements IGameSalesService {

	@Override
	public void sell(Gamer gamer, Game game) {
		
		System.out.println("Say�n " + gamer.getFirstName()+ " " + game.getName() + " isimli oyunu ba�ar� ile sat�n ald�n�z");
		
	}

	@Override
	public void sell(Gamer gamer, Game game, Campaign campaign) {
		System.out.println("Say�n " + gamer.getFirstName()+ " " + game.getName() + " isimli oyunu "+ campaign.getDiscount() + " TL indirim ile sat�n ald�n�z");		
	}


	
	

}
