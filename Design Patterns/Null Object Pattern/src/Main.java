
public class Main {

	public static void main(String[] args) {
		Machine machine = new ObjectFactory().getObject("NullTest");
		System.out.println(machine.getMachineType());
	}
}
