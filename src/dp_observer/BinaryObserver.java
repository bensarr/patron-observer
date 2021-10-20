package dp_observer;

public class BinaryObserver implements Observer {

	@Override
	public void update(Observable observable) {
		// TODO Auto-generated method stub

		int state = ((ObservableImpl) observable).getState();
	    System.out.println( "Binary String: " + Integer.toBinaryString( state ) ); 
	}

}
