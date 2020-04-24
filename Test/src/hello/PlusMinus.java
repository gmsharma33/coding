package hello;

import java.util.Scanner;

public class PlusMinus {

	// Complete the plusMinus function below.
	static void plusMinus(int[] arr) {
		double positiveCount = 0, negativeCount = 0, zeros = 0;
		for(int ele : arr) {
			if(ele == 0) {
				zeros++;
			} else if(ele > 0) {
				positiveCount++;
			} else {
				negativeCount++;
			}
		}
		double len = arr.length;
		System.out.printf("%.6f", positiveCount/len);
		System.out.println();
		System.out.printf("%.6f", negativeCount/len);
		System.out.println();
		System.out.printf("%.6f", zeros/len);
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] arr = new int[n];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}

		plusMinus(arr);

		scanner.close();
	}

}
