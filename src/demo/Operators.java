package demo;

public class Operators {

	public static void main(String[] args) {

		int a=10, b=5;
		
		int add=a+b;
		System.out.println(add);//Arithmetic operators
		int sub=a-b;
		System.out.println(sub);//Arithmetic operators
		int mul=a*b;
		System.out.println(mul);//Arithmetic operators
		int mod=a%b;
		System.out.println(mod);//Arithmetic operators
		System.out.println("-------------------");
		
		System.out.println(a==b);//Comparison operators
		System.out.println(a!=b);//Comparison operators
		System.out.println(a>b);//Comparison operators
		System.out.println(a<b);//Comparison operators
		System.out.println(a<=b);//Comparison operators
		System.out.println(a>=b);//Comparison operators
		System.out.println("-------------------");
		
		boolean b1=true,b2=false;
		System.out.println(b1&&b2); //Logical AND Operator both values should be true then it will return true
		System.out.println(b1||b2); //Logical OR Operator even if one value is true it will return true
		System.out.println("-------------------");
		
		int x=5;
		x+=5; //Equivalent to x=x+5 It Adds and assigns value
		System.out.println(x); //Assignment operator
		x-=2; //Equivalent to x=x-2 It Subtracts and assigns value
		System.out.println(x); //Assignment operator
		x*=2; //Equivalent to x=x*2 It multiplies and assigns value
		System.out.println(x); //Assignment operator
		x%=2; //Equivalent to x=x%2 It finds remainder and assign value
		System.out.println(x); //Assignment operator
		System.out.println("-------------------");
		
		int p=5,q=10;
		System.out.println(p++);//Post Increment
		System.out.println(p);
		p--;// Post decrement
		System.out.println(p);
		System.out.println(++p);// Pre increment
		System.out.println(--p);// pre decrement
		
		
	}

}
