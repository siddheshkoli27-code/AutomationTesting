package demo;

public class IfelseIfexample1 {

	public static void main(String[] args) 
	{
		int num=64;
		if(num>=90 && num<=100) 
		{
			System.out.println("Students Grade is A+");
		}
		else if(num>=80 && num<=89) 
		{
			System.out.println("Students Grade is A");
		}
		else if(num>=70 && num<=79)
		{
			System.out.println("Students Grade is B");
		}
		else if(num>=60 && num<=69)
		{
			System.out.println("Students Grade is C");
		}
		else
		{
			System.out.println("Student has Failed");
		}
		

	}

}
