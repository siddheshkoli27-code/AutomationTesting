package encapsulation;

public class EncapsulationEx2 {

	public static void main(String[] args) {
		
		Employee e1=new Employee();
		e1.setEmpId("EMP001");
		e1.setsalary(35000.50);
		
		System.out.println("Employee id is: "+e1.getempId());
		System.out.println("Salary of Employee is: "+e1.getsalary());

	}

}
