package abstraction;

public class AbstractionEx2 {

	public static void main(String[] args) {

		Payment p1=new CreditCardPayment();
		p1.makePayment(200.59);
		
		Payment p2=new UPIPayment();
		p2.makePayment(150.34);
	}

}
