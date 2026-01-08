package multipleInheritance;

public class Animal implements Cat,Dog {
	
	public void bark() {
		System.out.println("Dog is barking");
	}
	
	public void Meow() {
		System.out.println("Cat meows");
	}

}
