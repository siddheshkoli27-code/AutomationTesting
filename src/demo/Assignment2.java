package demo;

public class Assignment2 {

	public static void main(String[] args) {
		int x=10,y=5;
		int add=x+y;
		System.out.println(add);//1
		int sub=x-y;
		System.out.println(sub);//1
		int mul=x*y;
		System.out.println(mul);//1
		int divide=x/y;
		System.out.println(divide);//1
		int mod=x%y;
		System.out.println(mod);//1
		System.out.println("-------------");
		
		int a1=8,b1=3;
		int c1=(a1*b1)+(a1/b1)-(a1%b1);
		System.out.println(c1);//2
		System.out.println("-------------");
		
		float x1=3.5f,y1=3.5f;
		System.out.println(x1<=y1);//3
		System.out.println("-------------");
		
		int num=20;
		System.out.println(num+=5);//4
		System.out.println(num-=3);//4
		System.out.println(num*=2);//4
		System.out.println(num/=4);//4
		System.out.println(num%=3);//4
		System.out.println("-------------");
		
		int a3=69,b3=5;
		System.out.println(a3>b3);//5
		System.out.println("-------------"); 
		
		int p=10;
		++p;
		System.out.println(p);

	}

}
