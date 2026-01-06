package practicaltest;

public class Book {
	String title;
	String author;
	int price;
	
	Book(String s1,String s2, int p){
		title=s1;
		author=s2;
		price=p;
	}
		public void displayDetails(){
		System.out.println("Title of Book is: "+title);
		System.out.println("Author of Book is: "+author);
		System.out.println("Price of Book is: "+price);
	}
	
	public static void main(String[] args) {
		Book b=new Book("White Flower","Kane",100);
		b.displayDetails();
		
	}

}
