package practicaltestAbstractionEncap;

public class AbstractionQue2 {

	public static void main(String[] args) {

	
		Payment p1=new CreditCardPayment();
		p1.makePayment(100.53);
		Payment p2=new UPIPayment();
		p2.makePayment(200.87);
	}

}
