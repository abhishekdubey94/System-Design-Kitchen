import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee {

	private String name;
	private long empId;
	private String position;
	List<Employee> reportees = new ArrayList<>();

	public Manager(long empId, String name, String position) {
		this.name = name;
		this.empId = empId;
		this.position = position;
	}

	@Override
	public void showEmployeeDetails() {
		System.out.println(empId+" " +name+ " " + position );
		for(Employee e: reportees) {
			showEmployeeDetails();
		}
	}
	
	public void addEmployee(Employee emp) {
		reportees.add(emp);
	}
	
	public void removeEmployee(Employee emp) {
		reportees.remove(emp);
	}

}
