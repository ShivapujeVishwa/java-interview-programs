package pattern;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		int space = 1;

		Scanner sc = new Scanner(System.in);

		System.out.println("enter number:");
		int n = sc.nextInt();

		space = n - 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			//space--;
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
