package dp_observer;

public interface Observable {
	public void attach(Observer o);
	public void deatach(Observer o);
	public void notifyObservers();

}
