
public class Main {

	public static void main(String[] args) {
		FactoryProducer factoryProducer = new FactoryProducer();
		Factory fruitFactory = factoryProducer.getFactory("fruit");
		Factory vegetableFactory = factoryProducer.getFactory("vegetable");

		Produce apple = fruitFactory.getType("apple");
		Produce mango = fruitFactory.getType("mango");

		Produce tomato = vegetableFactory.getType("tomato");
		Produce potato = vegetableFactory.getType("potato");

		apple.type();
		mango.type();

		tomato.type();
		potato.type();
	}

}
