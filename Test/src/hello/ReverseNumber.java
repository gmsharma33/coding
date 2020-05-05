package hello;

import java.io.IOException;
import java.util.Scanner;

public class ReverseNumber {

	// Complete the beautifulDays function below.
	static int beautifulDays(int i, int j, int k) {
		int count = 0;
		for (int index = i; index <= j; index++) {
			if (Math.abs(reverse(index) - index) % k == 0) {
				count++;
			}
		}

		return count;
	}

	static int reverse(int n) {
		int rev = 0;
		while (n != 0) {
			int q = n % 10;
			rev = (rev * 10) + q;
			n = n / 10;
		}
		return rev;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		String[] ijk = scanner.nextLine().split(" ");

		int i = Integer.parseInt(ijk[0]);

		int j = Integer.parseInt(ijk[1]);

		int k = Integer.parseInt(ijk[2]);

		int result = beautifulDays(i, j, k);

		System.out.println(String.valueOf(result));

		scanner.close();
	}

}