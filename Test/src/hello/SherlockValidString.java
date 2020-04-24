package hello;

import java.io.IOException;
import java.util.Scanner;

public class SherlockValidString {

	static String isValid(String s) {
		String out = "";
		int[] arr = new int[26];
		for(char c : s.toCharArray()) {
			
		}
		return out;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		String s = scanner.nextLine();

		String result = isValid(s);

		System.out.println(result);

		scanner.close();
	}

}
