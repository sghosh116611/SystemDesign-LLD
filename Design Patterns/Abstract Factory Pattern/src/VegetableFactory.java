
public class VegetableFactory implements Factory {

	@Override
	public Produce getType(String produce) {
		switch (produce) {
		case "potato":
			return new Potato();
		case "tomato":
			return new Tomato();
		default:
			return null;
		}
	}

}
