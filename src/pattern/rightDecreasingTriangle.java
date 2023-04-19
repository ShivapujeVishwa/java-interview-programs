package pattern;

import java.util.Scanner;

public class rightDecreasingTriangle {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	char name='a';
	System.out.println(" Enter number");
	int num=sc.nextInt();
	
	for (int i = 0; i < num; i++) {
		for (int j = i; j <num; j++) {
			System.out.print("  ");//we need to give two empty space other than we get different pattern
		}
		for (int j = 0; j <=i; j++) {
			System.out.print(name++ +" ");
		}
		System.out.println();
	}
}
}
