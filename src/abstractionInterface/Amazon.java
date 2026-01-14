package abstractionInterface;

public class Amazon implements ECommerce {

	@Override
	public void placeOrder(String item, int quantity) {
		System.out.println("Order place on Amazon:"+item+" "+quantity);
		
	}
	
	

}
