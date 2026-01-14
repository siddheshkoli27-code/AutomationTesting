package abstractionInterface;

public class Bike implements Vehicle,Fuel {

	@Override
	public void refuel(int litres) {
		System.out.println("Bike refueled with x litres: "+" "+litres);
	}

	@Override
	public void start() {
		System.out.println("Bike is starting with self-start button");
	}

}
