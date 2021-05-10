package gameSalesProjectDemo.Abstract;

import gameSalesProjectDemo.Entities.Campaign;
import gameSalesProjectDemo.Entities.Game;
import gameSalesProjectDemo.Entities.Gamer;

public interface IGameSalesService {
	void sell(Gamer gamer, Game game);
	
	void sell(Gamer gamer , Game game, Campaign campaign);

}
