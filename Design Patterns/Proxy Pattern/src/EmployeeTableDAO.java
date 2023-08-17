
public class EmployeeTableDAO implements EmployeeTable {

	@Override
	public void create() {
		System.out.println("Employee created");
	}

	@Override
	public void get() {
		System.out.println("Got the employee");
	}

	@Override
	public void delete() {
		System.out.println("Deleted employee");
	}

}
