package numbers;

import java.util.Scanner;

public class SumOfPrimeNumbers {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number:");
		int num = sc.nextInt();
		int n=num;
		int count;
		int N = 1;
		int sum = 0;
		while (N <= n) {
			count = 0;
			int i = 2;
			while (i <= N / 2) {

				if (N % i == 0) {
					count++;
					break;
				}
				i++;
			}
			if (count == 0 && N != 1) {

				sum = sum + N;
			}
			N++;
		}
		System.out.println(sum);
	}

}
