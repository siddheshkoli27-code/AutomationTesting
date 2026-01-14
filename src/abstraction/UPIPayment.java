package abstraction;

public class UPIPayment extends Payment {
	
	void makePayment(double amount) {
		System.out.println("Paid ₹ amount using UPI is : "+ amount);
	}

}
