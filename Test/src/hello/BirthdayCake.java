package hello;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class BirthdayCake {

	static int birthdayCakeCandles(int[] ar) {
		int res = 0, temp;
		Arrays.sort(ar);
		temp = ar[ar.length - 1];
		for (int i = ar.length - 1; i >= 0; i--) {
			if (temp == ar[i]) {
				res++;
			} else {
				break;
			}
			temp = ar[i];
		}
		return res;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		int arCount = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] ar = new int[arCount];

		String[] arItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < arCount; i++) {
			int arItem = Integer.parseInt(arItems[i]);
			ar[i] = arItem;
		}

		int result = birthdayCakeCandles(ar);

		System.out.println(String.valueOf(result));

		scanner.close();
	}

}
