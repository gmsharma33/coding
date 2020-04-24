package hello;

import java.io.IOException;
import java.util.Scanner;

public class Anagrams {

	// Complete the makeAnagram function below.
	static int makeAnagram(String a, String b) {
		int count = 0;
		int[] arr = new int[26];
		for(char c : a.toCharArray()) {
			arr[c - 97]++;
		}
		for(char c : b.toCharArray()) {
			arr[c - 97]--;
		}
		for(int c : arr) {
			count += Math.abs(c);
		}
		return count;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		String a = scanner.nextLine();

		String b = scanner.nextLine();

		int res = makeAnagram(a, b);

		System.out.println(String.valueOf(res));

		scanner.close();
	}

}
