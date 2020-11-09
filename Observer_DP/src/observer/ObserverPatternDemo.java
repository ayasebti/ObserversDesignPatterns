package observer;

import java.util.concurrent.TimeUnit;

public class ObserverPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject subject= new Subject();
		
		new BinaryObserver(subject);
		new OctaObserver(subject);
		new HexaObserver(subject);
		
		
		while (true) {
			for (int i=0; i<60; i++) {
				subject.setState(i);
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}
		
	}

}
