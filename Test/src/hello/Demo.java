package hello;

import java.io.IOException;
import java.util.Scanner;

public class Demo {

	// Complete the countingValleys function below.
	static int countingValleys(int n, String s) {
		int count = 0, v = 0;
		for (char c : s.toCharArray()) {
			if (c == 'U') {
				count++;
			} else if (c == 'D') {
				count--;
			}
			if(c == 'U' && count == 0) {
				v++;
			}
		}
		return v;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String s = scanner.nextLine();

		int result = countingValleys(n, s);

		System.out.println(String.valueOf(result));

		scanner.close();
	}
}