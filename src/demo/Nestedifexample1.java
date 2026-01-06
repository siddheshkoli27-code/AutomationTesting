package demo;

public class Nestedifexample1 {

	public static void main(String[] args) 
	{
		int age=20;
		boolean card=false;
		if(age>=18) 
		{
			System.out.println("Person can enter club");
			if (card=false) 
			{
				System.out.println("Entry Allowed");
			}
			else 
			{
				System.out.println("Card is not present");
				
			}
		}
		else
		{
			System.out.println("Entry Denied");
			
		}
		
		

	}

}
