package hello;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeapYear {

	static String dayOfProgrammer(int year) {
		int sum = 0;
        boolean isLeapYear = false;
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            isLeapYear = true;
        }
        if(year % 4 == 0 && year < 1920) {
            isLeapYear = true;
        }
        int[] arr = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (isLeapYear) {
            arr[1] = 29;
        }
        int i = 0;
        for (i = 0; i < arr.length; i++) {
            sum += arr[i];
            if(sum > 256) {
                break;
            }
        }
        sum = sum - arr[i];
        int diff = 256 - sum + (year == 1918 ? 13 : 0);
        return diff + ".0" + (i + 1) + "." + year;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int year = Integer.parseInt(bufferedReader.readLine().trim());

		String result = dayOfProgrammer(year);

		System.out.println(result);

		bufferedReader.close();
	}

}
