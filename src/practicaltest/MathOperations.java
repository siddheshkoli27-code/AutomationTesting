package practicaltest;

public class MathOperations {
	int a=10;
	int b=20;

	public static void multiplyNumber(int a, int b) {
		int result=a*b;
		System.out.println("Multiplication of Two NUmber is:"+result);
	}
	
	public void addNUmbers(int a, int b) {
		int add=a+b;
		System.out.println("Addition of two numbers is:"+add);
		
	}
	public static void main(String[] args) {
		multiplyNumber(10,20);
		MathOperations m=new MathOperations();
		m.addNUmbers(10, 20);

	}

}
