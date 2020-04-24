package hello;

import java.io.IOException;
import java.util.Scanner;

public class MinimumSwap {

	// Complete the minimumSwaps function below.
	static int minimumSwaps(int[] arr) {
		int min = 0;
		boolean[] visited = new boolean[arr.length];
		for(int j = 0; j < arr.length; j++) {
			int i = j, cycle = 0;
			while(!visited[i]) {
				visited[i] = true;
				i = arr[i] - 1;
				cycle++;
			}
			if(cycle != 0) {
				min += cycle - 1;
			}
		}
		return min;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] arr = new int[n];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}

		int res = minimumSwaps(arr);

		System.out.println(String.valueOf(res));
		scanner.close();
	}

}
