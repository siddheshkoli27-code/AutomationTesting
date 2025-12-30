package Constructor;

public class Book {
	String title;
	String author;
	int price;
	
	Book(String s1, String s2, int p){
		title=s1;
		author=s2;
		price=p;
		System.out.println("Title is : "+ title);
		System.out.println("Author is : "+ author);
		System.out.println("price is : "+ price);
	}

	public static void main(String[] args) {
		Book b1= new Book("Demo","Test",100);
		Book b2= new Book("Demo2","Test2",200);
		
	}

}
