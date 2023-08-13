
public class Chicken extends ToppingsDecorator {

	Chicken(Pizza pizza) {
		super(pizza);
	}

	@Override
	public int cost() {
		return pizza.cost() + 80;
	}

}
