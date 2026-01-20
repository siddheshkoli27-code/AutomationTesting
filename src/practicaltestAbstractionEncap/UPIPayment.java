package practicaltestAbstractionEncap;

public class UPIPayment extends Payment {

	@Override
	public void makePayment(double amount) {

		System.out.println("Paid amount using UPI:"+amount);
	}

}
