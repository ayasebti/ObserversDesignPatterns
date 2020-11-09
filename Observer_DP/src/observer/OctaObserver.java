package observer;

public class OctaObserver extends Observer{
	
	public OctaObserver(Subject subject) {
		this.subject = subject;
	    this.subject.attach(this);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("La valeur en Octa est: "+Integer.toOctalString(subject.getState()));
	}

}
