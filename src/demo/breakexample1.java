package demo;

public class breakexample1 {

	public static void main(String[] args) 
	{
		for(int i=1;i<=5; i++) 
		{
			if(i==3) 
			{
				System.out.println("breaking point at i = " + i);
				break;
			}
			System.out.println("i = " +i);
		}
		
	
	}

}
