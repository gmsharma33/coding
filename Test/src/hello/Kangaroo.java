package hello;

import java.io.IOException;
import java.util.Scanner;

public class Kangaroo {

	static String kangaroo(int x1, int v1, int x2, int v2) {
		int count = 0;
		if(x1 < x2 && v1 <= v2) {
			return "NO";
		}
		while (true) {
			if (x1 < x2) {
				count++;
			}
			if (x1 > x2) {
				count--;
			}
			if (x1 == x2) {
				return "YES";
			}
			if(count == 0) {
				return "NO";
			}
			x1 += v1;
			x2 += v2;
		}
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		String[] x1V1X2V2 = scanner.nextLine().split(" ");

		int x1 = Integer.parseInt(x1V1X2V2[0]);

		int v1 = Integer.parseInt(x1V1X2V2[1]);

		int x2 = Integer.parseInt(x1V1X2V2[2]);

		int v2 = Integer.parseInt(x1V1X2V2[3]);

		String result = kangaroo(x1, v1, x2, v2);

		System.out.println(result);

		scanner.close();
	}

}
