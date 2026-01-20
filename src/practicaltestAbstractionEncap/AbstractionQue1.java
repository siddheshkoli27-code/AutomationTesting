package practicaltestAbstractionEncap;

public class AbstractionQue1 {

	public static void main(String[] args) {

		Ecommerce e1 = new Amazon();
		e1.placeOrder("Electronic Gadget", 5);
		
		Ecommerce e2= new Flipkart();
		e2.placeOrder("Toys", 3);
		
	}

}
