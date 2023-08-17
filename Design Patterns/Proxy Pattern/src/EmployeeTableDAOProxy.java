
public class EmployeeTableDAOProxy implements EmployeeTable {
	EmployeeTableDAO dao;
	
	EmployeeTableDAOProxy(EmployeeTableDAO dao){
		this.dao = dao;
	}

	@Override
	public void create() {
		System.out.println("Inside proxy");
		dao.create();
	}

	@Override
	public void get() {
		System.out.println("Inside proxy");
		dao.get();
	}

	@Override
	public void delete() {
		System.out.println("Inside proxy");
		dao.delete();
	}

}
