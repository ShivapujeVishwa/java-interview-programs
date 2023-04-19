package numbers;

import java.util.Scanner;

public class reverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		int sum1=0;
		int n;

		System.out.println("enter Number:");
		int num = sc.nextInt();

		while (num > 0) {
			n = num % 10;
			sum = sum * 10 + n;//it gives reverse of a given number
			sum1 +=n;//it gives sum of all digit
			num = num / 10;
		}
		System.out.println(sum);
		System.out.println(sum1);
	}
}
