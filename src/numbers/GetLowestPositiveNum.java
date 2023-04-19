package numbers;

import java.util.Scanner;

public class GetLowestPositiveNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Number");
		int n=sc.nextInt();
		boolean found=false;
		
		int num=n-1;
		
		while (found!=true) {
			num++;
			for (int i = 1; i <= n; i++) {
	            
	            if (num % i != 0) {
	                break;
	            } else if (i == n)
	                found = true;
	        }
		}
		System.out.println(num);
	}

}
