package demo;

public class Ifelseifexample2 {

	public static void main(String[] args) {
		
		int temp=-8;
		if(temp>30) {
			System.out.println("Temperature is Hot");
		}else if(temp >=20 && temp<=30){
			System.out.println("Temperature is Warm");
		}else if(temp>=10 && temp <=19) {
			System.out.println("Temperature is Cold");
		}else {
			System.out.println("Temperature is Very Cold");
		}

	}

}
