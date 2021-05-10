package gameSalesProjectDemo.Abstract;

import gameSalesProjectDemo.Entities.Game;


public interface IGameService {
	
	void add(Game game);
	void delete(Game game);
	void update(Game game);

}
