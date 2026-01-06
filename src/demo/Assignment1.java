package demo;

public class Assignment1 {
	
	static int y=100;
	int z=50;
	public static void main(String[] args) {
		
		int a=10;
		System.out.println(a);//1
		double d=20.2056;
		System.out.println(d);//1
		char c='C';
		System.out.println(c);//1
		boolean b=false;
		System.out.println(b);//1
		String s1="Sidd";
		System.out.println(s1);//1
		System.out.println("-----------------");
		
		int a1=5,b1=10,c1=15;
		System.out.println(a1+" "+b1+" "+c1);//2
		System.out.println("-----------------");
		
		String s2="Hello";
		String s3="World";
		System.out.println(s2+" "+s3);//3
		System.out.println("-----------------");
		
		String s4="My Name is Siddhesh";
		String s5="My Course Name is Java";
		String s6="My Age is 31";
		System.out.println(s4+" "+s5+" "+s6);//6
		System.out.println("--------------------------------");
		
		int x=10;
		System.out.println(x);//local variable//7
		System.out.println(y);//static variable//7
		Assignment1 ag=new Assignment1();//create object for instance or non static variable//7
		System.out.println(ag.z);//Instance or non static variable//7
		System.out.println("-----------------");
		
		boolean bol=false;
		System.out.println(bol);//8
		System.out.println("-----------------");
		
		double p=10.50,q=2.5;
		double r=p+q;
		double s=p-q;
		double t=p*q;
		double u=p/q;
		System.out.println("Sum of two numbers are: "+ r); //9
		System.out.println("Difference of two numbers is : "+ s); //9
		System.out.println("Product of two numbers are:" + t); //9
		System.out.println("Quotient of two number is: "+ u); //9
		System.out.println("-----------------------------"); //9
		
		int length=10;
		int width=5;
		int area=length*width;
		System.out.println("Area of rectange is: "+ area); //10
		System.out.println("-----------------------------");
		
		int e=10;
		int f=15;
		System.out.println("Before Swapping value for e:"+ e);
		System.out.println("Before Swapping value for f:" + f);	
		int g=e;
		e=f;
		f=g;
		System.out.println("After Swapping value for e:" + e);//11
		System.out.println("After Swapping value for f:" + f);//11
		System.out.println("-----------------------------");
		
		int e1=20;
		int f1=25;
		System.out.println("Before Swapping value for e1:" + e1);
		System.out.println("Before Swapping value for f1:" + f1);
		e1=e1+f1;
		f1=e1-f1;
		e1=e1-f1;
		System.out.println("After Swapping value for e1:" + e1);//12
		System.out.println("After Swapping value for f1:" + f1);//12
		System.out.println("-----------------------------");
		
		int k1=10;
		String l1="Practice Java";
		System.out.println("Concatenation is: " + k1+" "+l1);
		

	}

}
