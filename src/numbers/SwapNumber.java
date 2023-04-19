package numbers;

import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number:");
		int n = sc.nextInt();

		System.out.println("enter another number:");
		int m = sc.nextInt();
//swapping two numbers by using temporary variable
//		int temp = m;
//		m = n;
//		n = temp;

//swapping tow numbers without using temporary variable
	//	m=n+m-(n=m);
		
//swapping of two numbers withought using third variable		
		n=m+n;
		m=n-m;
		n=n-m;
				

		System.out.println("After swapping of two numbers:");
		System.out.println("first number is:" + n);
		System.out.println("Second number is:" + m);
	}
}
