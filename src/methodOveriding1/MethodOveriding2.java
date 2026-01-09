package methodOveriding1;

public class MethodOveriding2 {

	public static void main(String[] args) {

		Vehicle v;
		v=new Vehicle();
		v.speed();
		v=new Bike();
		v.speed();
		v=new Car();
		v.speed();
		
		
	}

}
