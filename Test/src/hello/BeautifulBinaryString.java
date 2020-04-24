package hello;

import java.io.IOException;
import java.util.Scanner;

public class BeautifulBinaryString {

	// Complete the beautifulBinaryString function below.
	static int beautifulBinaryString(String b) {
		int count = (b.length() - b.replaceAll("010", "").length())/3;
		return count;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String b = scanner.nextLine();

		int result = beautifulBinaryString(b);

		System.out.println(String.valueOf(result));

		scanner.close();
	}

}
