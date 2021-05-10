package gameSalesProjectDemo.Abstract;

import gameSalesProjectDemo.Entities.Campaign;

public interface ICampaignService {
	void add(Campaign campaign);
	void delete(Campaign campaign);
	void update(Campaign campaign);

}
