package employee;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	static int ID =1;
	private int id;
	private String name;
	private int managerId;       /// id of the manager employee reports to
	List<Employee> subordinates;
	
	public Employee(String name) {
		this.name = name;
		this.id = getUniqueId();
		managerId = 0;
		subordinates = new ArrayList<Employee>();
	}

	private int getUniqueId() {
		return ID++;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public List<Employee> getSubordinates() {
		return subordinates;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	
	public void addSubordinate(Employee emp) {
		subordinates.add(emp);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", managerId=" + managerId + ", subordinates=" + subordinates
				+ "]";
	}
	
}
