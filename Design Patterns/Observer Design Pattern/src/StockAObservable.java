import java.util.ArrayList;
import java.util.List;

public class StockAObservable implements Observable {
	List<Observer> observerList = new ArrayList<>();
	int stock = 0;

	@Override
	public void add(Observer ob) {
		// TODO Auto-generated method stub
		observerList.add(ob);
	}

	@Override
	public void remove(Observer ob) {
		// TODO Auto-generated method stub
		observerList.remove(ob);
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for (Observer observer : observerList) {
			observer.update();
		}
	}

	@Override
	public void setData(int stock) {
		// TODO Auto-generated method stub
		this.stock += stock;
		notifyObserver();
	}

	@Override
	public int getData() {
		// TODO Auto-generated method stub
		return this.stock;
	}

}
