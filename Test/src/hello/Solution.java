package hello;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

	// Complete the commonChild function below.
	static int commonChild(String s1, String s2) {
		Map<Character, Integer> set1 = new HashMap<>();
		Map<Character, Integer> set2 = new HashMap<>();
		for (int i = 0; i < s1.length(); i++) {
			set1.put(s1.charAt(i), set1.get(s1.charAt(i)) == null ? 0 : s1.charAt(i) + 1);
			set2.put(s2.charAt(i), set2.get(s2.charAt(i)) == null ? 0 : s2.charAt(i) + 1);
		}
		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			if((set1.containsKey(c) && set2.containsKey(c))) {
				
			}
		}
		int count = 0;

		return count;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		String s1 = scanner.nextLine();

		String s2 = scanner.nextLine();

		int result = commonChild(s1, s2);

		System.out.println(String.valueOf(result));

		scanner.close();
	}

}