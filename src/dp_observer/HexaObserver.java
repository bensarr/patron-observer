package dp_observer;

public class HexaObserver implements Observer {

	@Override
	public void update(Observable observable) {
		// TODO Auto-generated method stub

		int state = ((ObservableImpl) observable).getState();
	    System.out.println( "Hexa String: " + Integer.toHexString( state ).toUpperCase() ); 
	}

}
