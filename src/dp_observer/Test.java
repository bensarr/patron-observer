package dp_observer;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObservableImpl observable = new ObservableImpl();
		
		Observer o1 = new BinaryObserver();
		Observer o2 = new OctalObserver();
		Observer o3 = new HexaObserver();
		
		observable.attach(o1);
		observable.attach(o3);

		observable.setState(10);
		observable.deatach(o1);
		observable.setState(25);
	}

}
