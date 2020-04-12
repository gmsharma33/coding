package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveDuplicateWords {
	
	public static void main(String[] args) {
		String pattern = "(?i)\\b([a-z]+)\\b(?:\\s+\\1\\b)+";
		Pattern r = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
		String input = "I love Love to To tO code";
		Matcher matcher = r.matcher(input);
		while(matcher.find()) {
			input = input.replaceAll(matcher.group(), matcher.group(1));
		}
		System.out.println(input);
		
	}

}
