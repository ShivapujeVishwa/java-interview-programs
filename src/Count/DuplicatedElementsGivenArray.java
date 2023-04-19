package Count;

import java.util.Scanner;

public class DuplicatedElementsGivenArray {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter an Element");
		int num = sc.nextInt();

		int[] array = new int[num];
		System.out.println("enter array elements");
		for (int i = 0; i < num; i++) {
			//excepting elements from user
			array[i] = sc.nextInt();
		}
		boolean[] visited=new boolean[array.length];
		for (int i = 0; i < array.length; i++) {
			if (visited[i]==true) {
				continue;
			}
			int count=0;
			for (int j = 0; j < visited.length; j++) {
				if (array[i]==array[j]) {
					count++;
					visited[j]=true;
				}
			}
			if (count>1) {
				System.out.println(array[i]+" "+count);
			}
		}
		
	}

}
