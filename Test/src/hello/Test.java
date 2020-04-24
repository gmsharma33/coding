package hello;

import java.io.IOException;
import java.util.Scanner;

public class Test {

	// Complete the sockMerchant function below.
	static int sockMerchant(int n, int[] ar) {
		int count = 0;
		for (int i = 0; i < ar.length; i++) {
			for (int k = i + 1; k < ar.length; k++) {
				if(i == k) continue;
				if (ar[i] == ar[k] && (ar[i] != -100 && ar[k] != -100)) {
					count++;
					ar[k] = -100;
					break;
				}
			}
		}
		return count;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] ar = new int[n];

		String[] arItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arItem = Integer.parseInt(arItems[i]);
			ar[i] = arItem;
		}

		int result = sockMerchant(n, ar);
		System.out.println(result);

		scanner.close();
	}

}
