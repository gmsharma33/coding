package hello;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ConvertTimeTo24 {

	static String timeConversion(String s) throws ParseException {
		String outputTime = "";
		SimpleDateFormat format = new SimpleDateFormat("hh:mm:ssa");
		Date date = format.parse(s);
		outputTime = new SimpleDateFormat("HH:mm:ss").format(date);
		return outputTime;
	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException, ParseException {
		String s = scan.nextLine();

		String result = timeConversion(s);

		System.out.println(result);
	}

}
