package methodoverloadingPrinter;

public class Printer {
	
	public void printValue (int num) {
		System.out.println(num);
	}
	public void printValue(double num) {
		System.out.println(num);
	}
	public void printValue(String s) {
		System.out.println(s);
	}
	public void printValue(boolean b) {
		System.out.println(b);
	}

}
