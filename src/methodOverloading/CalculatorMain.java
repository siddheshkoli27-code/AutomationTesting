package methodOverloading;

public class CalculatorMain {

	public static void main(String[] args) {

		Calculator c1=new Calculator();
		c1.add(10,5);
		c1.add(5.5,3.5);
		c1.add(10, 10,10);
		c1.add("Sidd learns", " Java");
	}

}
