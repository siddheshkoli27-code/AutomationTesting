package practice;

public class Test9 {

	public static void main(String[] args) {
		int i=2;
		int sum=0;
		do {
			if(i%2==0);
			{
				sum=sum+i;
				i=i+2;
			}
			
		}while(i<=100);
		System.out.println("The sum of even numbers are : " + sum);
	}

}
