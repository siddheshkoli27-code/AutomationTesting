package methodOverloading;

public class Calculator {
	
	public void add(int a,int b) {
		System.out.println("Sum of two integers is: "+(a+b));
	}
	public void add(double a, double b) {
		System.out.println("Sum of two double value is: "+(a+b));
	}
	public void add(int a,int b,int c) {
		System.out.println("Sum of three integers value is: "+(a+b+c));
	}
	public void add(String a, String b) {
		System.out.println("Concatenation of two strings is:"+(a+b));
	}

}
