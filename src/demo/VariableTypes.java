package demo;

public class VariableTypes {

	static int b=20;
	int c=30;
	public static void main(String[] args) {
	
		int a = 10;
		System.out.println(a);//local variable
		System.out.println(b);// static variable
		VariableTypes obj = new VariableTypes();// need to create object using class name
		System.out.println(obj.c);// Instance Variable or non static variable
		System.out.println(b+obj.c);
	}

}
