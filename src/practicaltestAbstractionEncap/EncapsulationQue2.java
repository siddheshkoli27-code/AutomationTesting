package practicaltestAbstractionEncap;

public class EncapsulationQue2 {

	public static void main(String[] args) {

		Employee e = new Employee();
		
		e.setEmpId(101);
		e.setSalary(55678.35);
		
		System.out.println("Employee id for Employee is:"+e.getEmpId());
		System.out.println("Salary for Employee is: "+e.getSalary());
	}

}
