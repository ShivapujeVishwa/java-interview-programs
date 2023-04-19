package numbers;

import java.util.Scanner;

class withoughtUsingInbuiltFuction {
	// withought using inbuilt function, also we get given number is amstrong or not

	public void Armstrong() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number:");
		int num = sc.nextInt();

		int a = num;
		int total = 0;
		int count = 0;

		while (a != 0) {
			count++;
			a = a / 10;
		}
		int b = num;
		while (b != 0) {
			int eachNumberPower = 1;
			int rem = b % 10;
			for (int i = 1; i <= count; i++) {
				eachNumberPower = eachNumberPower * rem;
			}
			b = b / 10;
			total = total + eachNumberPower;
		}
		if (num == total) {
			System.out.println("given number is Armstrong");
		} else {
			System.out.println("given number is not a Armstrong");
		}
	}
}

public class GivenNumberArmstrongorNot {
	public static void main(String[] args) {

		withoughtUsingInbuiltFuction methode = new withoughtUsingInbuiltFuction();
		methode.Armstrong();

		usingInbuiltFunction math = new usingInbuiltFunction();
		math.armstorng();
	}
}

class usingInbuiltFunction {
	// using inbuilt function, we get the given number is Amstong or not
	public void armstorng() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number:");
		int num = sc.nextInt();

		
		int a = num;
		int b=num;
		int sum = 0;
		int count = 0;

		while (a != 0) {
			count++;
			a = a / 10;
		}
		
		while (b != 0) {
			int rem = b % 10;
			sum = (int) (sum + Math.pow(rem, count));
			b=b/10;
		}
		if (num == sum) {
			System.out.println("given number is Armstrong");
		} else {
			System.out.println("given number is not a Armstrong");
		}
	}
}
