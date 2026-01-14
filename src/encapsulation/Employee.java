package encapsulation;

public class Employee {
	
	private String empId;
	private double salary;
	
	public void setEmpId(String id) {
		empId=id;
	}
	
	public String getempId() {
		return empId;
	}
	
	public void setsalary(double newsalary) {
		salary=newsalary;
	}
	
	public double getsalary() {
		return salary;
	}

}
