
public class Paneer extends ToppingsDecorator {

	Paneer(Pizza pizza) {
		super(pizza);
	}

	@Override
	public int cost() {
		return pizza.cost() + 50;
	}

}
