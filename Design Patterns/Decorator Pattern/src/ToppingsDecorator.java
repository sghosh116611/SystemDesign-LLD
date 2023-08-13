
public abstract class ToppingsDecorator implements Pizza{
	Pizza pizza = null;

	ToppingsDecorator(Pizza pizza) {
		this.pizza = pizza;
	}

}
