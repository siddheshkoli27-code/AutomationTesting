package methodOverloading;

public class MethodOverloading {

	public static void main(String[] args) {
		
		MathOperation1 m1 = new MathOperation1();
		m1.add(10, 5);
		m1.add(10,10,10);
		
		
		MathOperation2 m2 =new MathOperation2();
		m2.add(5, 10);
		m2.add(2.5, 5.5);
		
		MathOperation3 m3 =new MathOperation3();
		m3.add(10, "Java");
		m3.add("Automation",20);

	}

}
