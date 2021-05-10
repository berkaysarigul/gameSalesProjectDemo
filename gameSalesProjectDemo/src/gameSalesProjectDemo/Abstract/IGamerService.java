package gameSalesProjectDemo.Abstract;

import gameSalesProjectDemo.Entities.Gamer;

public interface IGamerService {
	
	void add(Gamer gamer);
	void delete(Gamer gamer);
	void update(Gamer gamer);

}
