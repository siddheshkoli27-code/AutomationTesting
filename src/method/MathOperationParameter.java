package method;

public class MathOperationParameter {
	
	public static void multiplyNumbers(int a, int b) {
		int result1=a*b;
		System.out.println("Multiplication of Numbers is :"+ result1);
	}
	public void addNumbers(int c, int d) {
		int result2=c*d;
		System.out.println("Addition of Numbers is :" + result2);
	}

	public static void main(String[] args) {
		multiplyNumbers(5,2);
		MathOperationParameter m1= new MathOperationParameter();
		m1.addNumbers(6, 6);
		
	}

}
