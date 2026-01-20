package practicaltestAbstractionEncap;

public class CreditCardPayment extends Payment {

	@Override
	public void makePayment(double amount) {

		System.out.println("Paid amount using Credit card:"+amount);
	}

}
