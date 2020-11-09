package observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	int state;
	List<Observer> observers=new ArrayList<>();
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
		notifyAllObservers();

	}
	public void attach(Observer observer) {
		observers.add(observer);
		
	}
	
	public void unattach(Observer observer) {
		int index=observers.indexOf(observer);
		observers.remove(index);
		
	}
	
	public void notifyAllObservers() {
		for (Observer observer:observers) {
			observer.update();
		}
	}
	

}
