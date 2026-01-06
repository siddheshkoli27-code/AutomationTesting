package practice;

public class Test1 {

	public static void main(String[] args) {
		/*int a=10;
		int b=15;
		int c=a+b;
		System.out.println("Addition of number is:" + c);*/
		
		int rows=5;//
		for(int i=1;i<=rows;i++) {		//(int i=rows; i>=1;--i)
			for(int j=1;j<=i;j++) { 	//(int j=1;j<=i;++j)
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
