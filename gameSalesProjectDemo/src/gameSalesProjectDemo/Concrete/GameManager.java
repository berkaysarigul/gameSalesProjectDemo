package gameSalesProjectDemo.Concrete;

import gameSalesProjectDemo.Abstract.IGameService;
import gameSalesProjectDemo.Entities.Game;

public class GameManager implements IGameService{

	@Override
	public void add(Game game) {
		System.out.println("Oyun ba�ar� ile eklendi : " + game.getName());
		
	}

	@Override
	public void delete(Game game) {
		
		System.out.println("Oyun ba�ar� ile silindi" + game.getName());
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun ba�ar� ile g�ncellendi" + game.getName());
		
	}

	




}
