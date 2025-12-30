package demo;

public class Nestedifexample1 {

	public static void main(String[] args) 
	{
		int age=14;
		boolean card=true;
		if(age>=18) 
		{
			System.out.println("Person can enter club");
			if (card=true) 
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
