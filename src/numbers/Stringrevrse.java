package numbers;

import java.util.Scanner;

public class Stringrevrse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Strng name:");
		String name = sc.next();

		char[] ch = name.toCharArray();

		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print( ch[i]);
		}
	}
}
