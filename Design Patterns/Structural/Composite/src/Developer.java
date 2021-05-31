
public class Developer implements Employee {
	private String name;
	private long empId;
	private String position;

	public Developer(long empId, String name, String position) {
		this.name = name;
		this.empId = empId;
		this.position = position;
	}

	@Override
	public void showEmployeeDetails() {
		System.out.println(empId+" " +name+ " " + position );
	}

}
