package hello;

import java.io.IOException;
import java.util.Scanner;

public class RotateArray {

	// Complete the rotLeft function below.
	static int[] rotLeft(int[] a, int d) {
		int	len = a.length;
		int[] res = new int[d];
		int c = d;
		for(int i = 0; i < c; i++) {
			res[i] = a[i];
		}
		for(int i = 0; i < len - d; i++) {
			a[i] = a[i + d];
		}
		for(int i = 0; i < res.length; i++) {
			a[len - d + i] = res[i];
		}
		return a;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		//BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] nd = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nd[0]);

		int d = Integer.parseInt(nd[1]);

		int[] a = new int[n];

		String[] aItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int aItem = Integer.parseInt(aItems[i]);
			a[i] = aItem;
		}

		int[] result = rotLeft(a, d);

		for (int i = 0; i < result.length; i++) {
			System.out.print(String.valueOf(result[i]));

			if (i != result.length - 1) {
				System.out.print(" ");
			}
		}

		System.out.println();

		scanner.close();
	}

}
