package Constructor;

public class StudentDefault {
	String name;
	int age;
	
	StudentDefault(){
		System.out.println(" Default Constructor is called");
		name="Rahul";
		age=25;
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}

	public static void main(String[] args) {
		StudentDefault s1=new StudentDefault();

	}

}
