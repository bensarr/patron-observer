package dp_observer;

public class OctalObserver implements Observer {

	@Override
	public void update(Observable observable) {
		// TODO Auto-generated method stub

		int state = ((ObservableImpl) observable).getState();
	    System.out.println( "Octal String: " + Integer.toOctalString( state ) ); 
	}

}
