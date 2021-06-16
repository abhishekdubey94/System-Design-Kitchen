package system;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import employee.Employee;

public class EmployeeSystem {
	List<Employee> employees;
	Map<Integer, Employee> employeeMap;
	
	

	public EmployeeSystem() {
		this.employees = new ArrayList<Employee>();
		this.employeeMap = new HashMap<>();
	}

	public void registerEmployee(Employee emp) {
		employees.add(emp);
		employeeMap.put(emp.getId(),emp);
	}

	public void registerManager(int empId, int managerId) {
		
		if(!employeeMap.containsKey(empId) || !employeeMap.containsKey(managerId)) {
			System.out.println("Wrong employee id or manager Id");
			return;
		}
		
		
		Employee employee = employeeMap.get(empId);
		Employee manager = employeeMap.get(managerId);
		
		employee.setManagerId(managerId);
		manager.addSubordinate(employee);
	}

	public void printDetails(int id) {

		if(!employeeMap.containsKey(id)) {
			System.out.println("Wrong id");
			return;
		}
		System.out.println(employeeMap.get(id).toString());
	}

	public void printDetails(String name) {

		for(Employee emp : employees) {
			if(emp.getName().substring(0,name.length())==name) {
				System.out.println(emp.toString());
			}
		}
		
		System.out.println("Can't find a match");
	}

	public List<Employee> getSubordinate(int managerId) {
		if(!employeeMap.containsKey(managerId)) {
			return null;
		}
		return employeeMap.get(managerId).getSubordinates();
	}

	public List<Employee> getSubordinate(String name) {
		for(Employee emp : employees) {
			if(emp.getName().substring(0,name.length())==name) {
				return emp.getSubordinates();
			}
		}
		
		return null;
	}
}
