package Constructor;

public class Circle {
	
	double radius;
	Circle(double r){
		radius =r;
	}
	 double calculateArea() {
		return  3.14 * radius * radius;
	}
	
	public static void main(String[] args) {
		Circle c1= new Circle(3);
		System.out.println("Area of circle :" + c1.calculateArea());

	}

}
