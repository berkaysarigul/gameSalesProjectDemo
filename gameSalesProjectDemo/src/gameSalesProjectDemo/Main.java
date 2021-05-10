package gameSalesProjectDemo;

import Adapters.MernisServiceAdapter;
import gameSalesProjectDemo.Concrete.*;
import gameSalesProjectDemo.Entities.*;

public class Main {

	public static void main(String[] args) {
		Gamer gamer = new Gamer(1, "Ömer Berkay", "Sarýgül", 2004, "10000000000");
		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		gamerManager.add(gamer);
		
		System.out.println("--------------------------------------");
		GameManager gameManager = new GameManager();
		gameManager.add(new Game(1,"CS GO",75.99));
		
		System.out.println("---------------------------------------");
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(new Campaign(1,"Yýlbaþý",15.99));
		
		System.out.println("---------------------------------------");
		
		GameSalesManager gameSalesManager = new GameSalesManager();
		gameSalesManager.sell(gamer, new Game(1,"CS GO",75.99));
		gameSalesManager.sell(gamer, new Game(1,"CS GO",75.99), new Campaign(1,"Yýlbaþý",15.99 ));
		
		System.out.println("---------------------------------------");
		
		
	}

}
