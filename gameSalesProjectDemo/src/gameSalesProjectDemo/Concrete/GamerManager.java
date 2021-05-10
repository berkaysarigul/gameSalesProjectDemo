package gameSalesProjectDemo.Concrete;

import gameSalesProjectDemo.Abstract.IGamerCheckService;
import gameSalesProjectDemo.Abstract.IGamerService;
import gameSalesProjectDemo.Entities.Gamer;

public class GamerManager implements IGamerService {
	IGamerCheckService gamerCheckService;

	public GamerManager(IGamerCheckService gamerCheckService) {
		
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void add(Gamer gamer) {
		if(gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println("Baþarý ile kayýt olundu : " + gamer.getFirstName() + " " + gamer.getLastName() );
		}else {
			System.out.println("not a valid person");
		}
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Baþarýyla silindi : " + gamer.getFirstName() + " " + gamer.getLastName() );
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Baþarý ile güncellendi " + gamer.getFirstName() + " " + gamer.getLastName());
		
	}

}
