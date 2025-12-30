package Constructor;

public class StudentParameters {
	String name;
	int age;
	
	StudentParameters(String n, int a){
		System.out.println("This is Parameterized Constructor");
		name=n;
		age=a;
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}

	public static void main(String[] args) {
		StudentParameters s1=new StudentParameters("Rohit",25);
	}

}
