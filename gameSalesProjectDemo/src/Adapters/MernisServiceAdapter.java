package Adapters;

import gameSalesProjectDemo.Abstract.IGamerCheckService;
import gameSalesProjectDemo.Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements IGamerCheckService {
	
	

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula(
					Long.valueOf(gamer.getNationalityId()),
					gamer.getFirstName().toUpperCase(),
					gamer.getLastName().toUpperCase(), 
					gamer.getDateOfBirth()
					);
			
		} catch (Exception e) {
			System.out.println("Not a valid person");
		}
		
		return false;
		
		
		
		
	}


}
