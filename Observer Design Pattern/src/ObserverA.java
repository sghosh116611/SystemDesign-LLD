
public class ObserverA implements Observer {
	
	Observable observable;
	
	ObserverA(Observable observable){
		this.observable = observable;
		this.observable.add(this);
	}
	
	@Override
	public void update() {
		System.out.println("Getting updates from Observer A -> " + observable.getData());
	}

}
