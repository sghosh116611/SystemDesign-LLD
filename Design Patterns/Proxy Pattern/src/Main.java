
public class Main {
	public static void main(String[] args) {
		EmployeeTable dao = new EmployeeTableDAOProxy(new EmployeeTableDAO());
		dao.create();
	}
}
