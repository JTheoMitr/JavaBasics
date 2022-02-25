package observer.design;

public interface Subject {
	
	void subscribe(Observer o);
	void unSubscibe(Observer o);
	void Notify();

}
