package abstractionInterface;

public class AbstractionInterface {

	public static void main(String[] args) {

		ECommerce e1 = new Amazon();
		e1.placeOrder("Gadget", 5);
		
		ECommerce e2 = new Flipkart();
		e2.placeOrder("Electronic gadget", 5);
	}

}
