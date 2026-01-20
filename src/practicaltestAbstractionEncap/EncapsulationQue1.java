package practicaltestAbstractionEncap;

public class EncapsulationQue1 {

	public static void main(String[] args) {

		Student s = new Student();
		s.setName("Ramesh");
		s.setAge(28);
		
		System.out.println("Student name is:"+s.getName());
		System.out.println("Student's age is:"+s.getAge());
	}

}
