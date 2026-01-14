package abstractionInterface;

public class Car implements Vehicle,Fuel {

	@Override
	public void refuel(int litres) {
		System.out.println("Car refueled with "+litres+" "+"litres");
	}

	@Override
	public void start() {
		System.out.println("Car is starting with key ignition.");
		
	}

}
