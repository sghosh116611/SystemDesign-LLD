
public class FruitFactory implements Factory {

	@Override
	public Produce getType(String produce) {
		switch (produce) {
		case "mango":
			return new Mango();
		case "apple":
			return new Apple();
		default:
			return null;
		}
	}

}
