package method;

public class Counter {

	static int staticCount=0;
	int nonStaticCount=0;
	
	public static void incrementStatic() {
		staticCount++;
		System.out.println("Static Count is = " + staticCount);
	}
	public void incrementNonStatic() {
		nonStaticCount++;
		System.out.println("Non Static Count is = " + nonStaticCount);
	}

}
