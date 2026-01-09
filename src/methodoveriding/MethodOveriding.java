package methodoveriding;

public class MethodOveriding {

	public static void main(String[] args) {

		Bank b;
		
		b=new SBI();
		System.out.println("Rate of Interest for SBI is: "+b.getRateOfInterest());
		
		b=new Axis();
		System.out.println("Rate of Interest for Axis is: "+b.getRateOfInterest());
		
		b=new ICICI();
		System.out.println("Rate of Interest for ICICI is: "+b.getRateOfInterest());
	}

}
