package numbers;

import java.util.Scanner;

public class SumofDigit {
	public static void main(String[] args) {

		int n, sum = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("enter a number:");
		int m = sc.nextInt();

		while (m > 0) {
			n = m % 10;
			sum += n;
			m = m / 10;
		}
		System.out.println(sum);
	}
}
