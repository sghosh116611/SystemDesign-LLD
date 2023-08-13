
public class Main {

	public static void main(String[] args) {
		
		Observable observableA = new StockAObservable();
		Observable observableB = new StockBObservable();
		
		Observer ob1 = new ObserverA(observableA);
		Observer ob2 = new ObserverA(observableB);
		Observer ob3 = new ObserverB(observableA);
		
		observableA.setData(10);
		observableB.setData(10);
	}
}
