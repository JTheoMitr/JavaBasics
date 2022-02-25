package observer.design;

public class Appserver {
	
	public static void main(String[] args) {
		Firecloud postoffice = new Firecloud();
		TikTok chris = new TikTok("Chris");
		TikTok john = new TikTok("John");
		
		//chris n john were bugging/polling the post office
		chris.checkArrivalTheirPassport(null);
		john.checkArrivalTheirPassport(null);
		
		//post office was angry and asked them to leave[register] their ph nos
		postoffice.subscribe(chris);
		postoffice.subscribe(john);
		
		UpdatedVideo passport = new UpdatedVideo("John", "johns phone", "You've got a new Firecloud update");
		postoffice.ppOfficeSendsaPPPostOffice(passport);


	}

}
