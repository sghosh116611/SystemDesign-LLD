
public class FactoryProducer {

	public Factory getFactory(String factoryType) {
		switch (factoryType) {
		case "fruit":
			return new FruitFactory();
		case "vegetable":
			return new VegetableFactory();
		default:
			return null;
		}
	}

}
