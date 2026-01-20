package ExceptionHandling;

public class ArithmaticException {

	public static void main(String[] args) {

		try {
			int a=50/0;
			System.out.println("NUmber not divisible");
		}catch(ArithmeticException e) {
			System.out.println("Error:cannot divide by zero");
		}
		
	}

}
