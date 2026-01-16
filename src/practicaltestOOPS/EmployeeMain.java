package practicaltestOOPS;

public class EmployeeMain {

	public static void main(String[] args) {

		Employee e;
		e=new Manager();
		e.calculateSalary();
		e=new Developer();
		e.calculateSalary();
	}

}
