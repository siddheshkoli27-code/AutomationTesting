package practicaltestAbstractionEncap;

public class Employee {
	
	private int empId;
	private double salary;
	
	public void setEmpId(int id) {
		empId=id;
	}
	public int getEmpId() {
		return empId;
	}
	public void setSalary(double newSalary) {
		salary = newSalary;
	}
	public double getSalary() {
		return salary;
	}

}
