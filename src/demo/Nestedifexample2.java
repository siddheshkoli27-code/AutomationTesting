package demo;

public class Nestedifexample2 {

	public static void main(String[] args) 
	{
		String s1="admin";
		int password=1234;
		if(s1=="admin") 
		{
			System.out.println("Username is valid");
			
		if (password==1234) 
		{
			System.out.println("Login Successful");
		}
		else
		{
			System.out.println("Invalid credentials");
		}
	
	}
	}
}

