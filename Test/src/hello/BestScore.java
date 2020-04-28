package hello;

import java.io.IOException;
import java.util.Scanner;

public class BestScore {

	// Complete the breakingRecords function below.
	static int[] breakingRecords(int[] scores) {
		int high = scores[0];
		int low = scores[0];
		int highCount = 0, lowCount = 0;
		for(int i = 1; i < scores.length; i++) {
			if(high < scores[i]) {
				high = scores[i];
				highCount++;
			}
			if(low > scores[i]) {
				low = scores[i];
				lowCount++;
			}
		}
		return new int[] {highCount, lowCount};
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] scores = new int[n];

		String[] scoresItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int scoresItem = Integer.parseInt(scoresItems[i]);
			scores[i] = scoresItem;
		}

		int[] result = breakingRecords(scores);

		for (int i = 0; i < result.length; i++) {
			System.out.print(String.valueOf(result[i]));

			if (i != result.length - 1) {
				System.out.print(" ");
			}
		}

		scanner.close();
	}

}
