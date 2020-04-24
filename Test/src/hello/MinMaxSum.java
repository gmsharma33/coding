package hello;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author sharma
 *
 */
public class MinMaxSum {

	static void miniMaxSum(int[] arr) {
		Arrays.sort(arr);
		BigInteger min = new BigInteger(arr[0] + "");
		min = min.add(new BigInteger(arr[1] + "")).add(new BigInteger(arr[2] + "")).add(new BigInteger(arr[3] + ""));
		BigInteger max = new BigInteger(arr[1] + "");
		max = max.add(new BigInteger(arr[2] + "")).add(new BigInteger(arr[3] + "")).add(new BigInteger(arr[4] + ""));
		System.out.println(min + " " + max);
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = new int[5];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < 5; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}
		miniMaxSum(arr);
		scanner.close();
	}

}
