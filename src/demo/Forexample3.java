package demo;

public class Forexample3 {

	public static void main(String[] args) {
		int num=41;
		int count=0;
		
		for(int i=1;i<=num;i++) {
			if(num % i==0) {
				count++;
			}
		}
		if(count==2) 
			System.out.println("Number is prime number");
		else
			System.out.println("Number is not a prime number");
	}

}
