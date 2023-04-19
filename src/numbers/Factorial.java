package numbers;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		
		int factorial = 1;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number :");
		int number = sc.nextInt();

		for (int i = number; i >= 1; i--) {
			factorial *= i;
			
		}
		System.out.println("factorial of " + number + " is:" + factorial);
	}
}
