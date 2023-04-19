package Count;

import java.util.Scanner;

public class DuplicatedCharInGivenString {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String name = "Hello  java program How are you";

		// we need to conver string to array because we cannot trace STring directlty
		char[] array = name.toCharArray();

		// to compare we need to store this charecter in boolean in the array form only
		boolean[] visited = new boolean[array.length];

		for (int i = 0; i < array.length; i++) {
			if (visited[i] == true) {
				continue;
			}
			int count = 0;
			for (int j = 0; j < array.length; j++) {
				if (array[i] == array[j]) {
					count++;
					visited[j] = true;
				}
			}
			if (count > 1) {
				System.out.println(array[i] + " charector repeated: " + count + " times");
			}
		}

	}
}
