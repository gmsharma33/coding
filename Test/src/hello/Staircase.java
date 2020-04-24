package hello;

import java.util.Scanner;

/**
 * Print # character based on input
 * 
 * @author sharma
 *
 */
public class Staircase {

	static void staircase(int n) {
		int spaceCount = 0;
		for (int i = 0; i < n; i++) {
			spaceCount = n - (i + 1);
			System.out.print(new String(new char[spaceCount]).replace("\0", " "));
			System.out.println(new String(new char[n - spaceCount]).replace("\0", "#"));
		}
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		staircase(n);
		scanner.close();
	}

}
