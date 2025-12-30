package method;

public class NonStaticEx1 {
	
	public void shownonstaticmsg() 
	{
		System.out.println("This is not static method");
		
	}
	public static void main(String[] args) {
		NonStaticEx1 obj1 = new NonStaticEx1();
		obj1.shownonstaticmsg();
		StaticEx1.showmsg(); //Can access both static and non static members of the class.
		
		
	}

}
