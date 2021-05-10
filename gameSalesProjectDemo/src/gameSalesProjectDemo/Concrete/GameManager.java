package gameSalesProjectDemo.Concrete;

import gameSalesProjectDemo.Abstract.IGameService;
import gameSalesProjectDemo.Entities.Game;

public class GameManager implements IGameService{

	@Override
	public void add(Game game) {
		System.out.println("Oyun baþarý ile eklendi : " + game.getName());
		
	}

	@Override
	public void delete(Game game) {
		
		System.out.println("Oyun baþarý ile silindi" + game.getName());
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun baþarý ile güncellendi" + game.getName());
		
	}

	




}
