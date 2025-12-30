package method;

public class MaxNumber {
	int num1=10;
	int num2=70;
	int num3=30;
	
	public static void findMax(int num1,int num2, int num3) {
		if(num1 >num2 && num1>num3) {
			System.out.println("Number 1 is greater than num2 and num3");
		}else if(num2 >num1 && num2 >num3) {
			System.out.println("Number 2 is greater than num1 and num3");
		}else {
			System.out.println("Number 3 is greater than num1 and num2");
		}
	}

	public static void main(String[] args) {

		findMax(10,70,30);
	}

}
