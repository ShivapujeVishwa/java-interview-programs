package numbers;

import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		int sumE = 0, sumO = 0;
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		int[] array = new int[num];
		for (int i = 0; i < num; i++) {
			array[i] = sc.nextInt();
		}

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				sumE += array[i];
				
			}else {
				sumO += array[i];
				
			}
		}
		System.out.println(sumE);
		System.out.println(sumO);
	}
}
