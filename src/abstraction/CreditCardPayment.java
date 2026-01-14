package abstraction;

public class CreditCardPayment extends Payment {
	
	void makePayment(double amount) {
		System.out.println("Paid ₹ amount using Credit is : "+ amount);
	}

}
