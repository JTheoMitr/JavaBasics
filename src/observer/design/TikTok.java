package observer.design;

import java.util.ArrayList;

public class TikTok implements Observer {

String name;
	
	public TikTok(String name)
	{
		this.name = name;
	}

	@Override
	public void update(Object obj) {
		if (obj instanceof Firecloud)
		{
			Firecloud po = (Firecloud) obj;
			checkArrivalTheirPassport(po.getAllRecivedPPatPO());
		}
	}
	
	//polling the server for updates
	//abdul goes to passport office and sift through the bunch of passports
	public void checkArrivalTheirPassport(ArrayList<UpdatedVideo> setOfPassport) {
		if(setOfPassport!= null) { //if there are passports in the po
			for ( int i =0; i < setOfPassport.size(); i++)

			{
				if (name.compareTo(setOfPassport.get(i).receiverName) == 0)
					System.out.println(name + ": " + setOfPassport.get(i).content);
			}
			}
			else {
				System.out.println(name+" your passport hasn't arrived yet");
			}
		}

		
	}

