
public class ObserverB implements Observer {

	Observable observable;

	ObserverB(Observable observable) {
		this.observable = observable;
		this.observable.add(this);
	}

	@Override
	public void update() {
		System.out.println("Getting updates from Observer B -> " + observable.getData());
	}

}
