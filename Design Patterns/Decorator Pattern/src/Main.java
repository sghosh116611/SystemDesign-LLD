
public class Main {

	public static void main(String[] args) {

		Pizza pizza = new Farmhouse();
		System.out.println(pizza.cost());

		Pizza paneerPizza = new Paneer(pizza);
		Pizza chickenPizza = new Chicken(pizza);

		Pizza chickenPaneerPizza = new Chicken(new Paneer(pizza));

		System.out.println(paneerPizza.cost());
		System.out.println(chickenPizza.cost());
		
		System.out.println(chickenPaneerPizza.cost());
	}

}
