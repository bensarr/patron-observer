package dp_observer;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable {
	
	private int state;
	private List<Observer> observers = new ArrayList<>();

	@Override
	public void attach(Observer o) {
		// TODO Auto-generated method stub
		this.observers.add(o);
	}

	@Override
	public void deatach(Observer o) {
		// TODO Auto-generated method stub
		this.observers.remove(o);

	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for (Observer observer : observers) {
			observer.update(this);
		}

	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		this.notifyObservers();
	}

}
