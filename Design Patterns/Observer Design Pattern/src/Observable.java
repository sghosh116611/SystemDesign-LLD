
public interface Observable {

	public void add(Observer ob);

	public void remove(Observer ob);

	public void notifyObserver();

	public void setData(int stock);
	
	public int getData();
}
