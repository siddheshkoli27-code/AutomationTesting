package Constructor;

public class Car {
	
	String Company;
	String model;
	int year;
	
	Car(String s1,String s2, int y){
		Company=s1;
		model=s2;
		year=y;
		System.out.println(" Company name of Car is : "+ Company);
		System.out.println(" Model of Car is : "+ model);
		System.out.println(" Year of Car is : "+ year);
	}

	public static void main(String[] args) {
		Car c1= new Car("TATA","CNG",2022);

	}

}
