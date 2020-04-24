package hello;

import java.io.IOException;
import java.util.Scanner;

public class SpecialString {

	static long substrCount(int n, String s) {
		long count = 0;
		if (isPalindrome(s)) {
			// count++;
		}
		/*
		 * int i = 0; while (i != -1) { s = s.substring(i); if (isPalindrome(s)) {
		 * count++; } i++; }
		 */

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j <= n; j++) {
				String sub = s.substring(i, j);
				if (isPalindrome(sub)) {
					count++;
				}
			}
		}

		return count;

	}

	static boolean isPalindrome(String s) {
		int len = s.length();
		if (len == 0)
			return false;
		if (len == 1)
			return true;
		if (s.replaceAll(s.charAt(0) + "", "").isEmpty())
			return true;
		if (len % 2 == 0) {
			return s.replaceAll(s.charAt(0) + "", "").length() == 0;
		} else {
			char in = s.charAt(len / 2);
			s = s.replace(in + "", "");
			return s.replaceAll(s.charAt(0) + "", "").length() == 0;
		}
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String s = scanner.nextLine();

		long result = substrCount(n, s);

		System.out.println(String.valueOf(result));

		scanner.close();
	}
}
