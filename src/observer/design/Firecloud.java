package observer.design;

import java.util.ArrayList;

public class Firecloud implements Subject {
	
	private ArrayList<UpdatedVideo> allReceviedPassport;
	private ArrayList<Observer> observerSubscribersLedger;
	
	public Firecloud()
	{
		allReceviedPassport = new ArrayList<>();
		observerSubscribersLedger = new ArrayList<>();
	}

	
	public void ppOfficeSendsaPPPostOffice(UpdatedVideo m){
		allReceviedPassport.add(m);
		Notify();
	}
	
	public ArrayList<UpdatedVideo> getAllVideos()
	{
		return allReceviedPassport;
	}
	
	@Override
	public void subscribe(Observer o) {
		//when abdul subscribes to this post office
		//this post office has to maintain a ledger of all the subscribers
		//along with their phnos and email ids
		observerSubscribersLedger.add(o);

	}

	@Override
	public void unSubscibe(Observer o) {
		//remove the name of abdul from the subscriptionLedger
		observerSubscribersLedger.remove(o);

		
	}

	@Override
	public void Notify() {
		//if a passport arrives at the post office.. we need to notify abdul
		for (int i = 0; i < observerSubscribersLedger.size(); i++)
			observerSubscribersLedger.get(i).update(this);
	}


}
