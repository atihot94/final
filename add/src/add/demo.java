package add;

import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number 1  :");
		int a= scanner.nextInt();
		System.out.println("enter number 2  :");
		int b=scanner.nextInt();
	
		int c=a+b;
		int s=a-b;
		int m=a*b; 
		System.out.println("sum of two numbers is :" + c);
		System.out.println("subtrction of two numbers is :" + s);
		System.out.println("multipication of two numbers is :" + m);
	}

}
