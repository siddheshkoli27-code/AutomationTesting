package encapsulation;

public class EncapsulationEx1 {

	public static void main(String[] args) {

		Student s1=new Student();
		s1.setName("Siddhesh");
		s1.setAge(31);
		
		System.out.println("Name:"+s1.getname());
		System.out.println("Age:"+s1.getAge());
	}

}
