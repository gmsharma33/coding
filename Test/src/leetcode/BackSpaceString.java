package leetcode;

import java.util.Stack;

/**
 * LeetCode problem :
 * https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/529/week-2/3291/
 * 
 * @author sharma
 *
 */
public class BackSpaceString {

	public static void main(String[] args) {
		System.out.println(new BackSpaceString().backspaceCompare("a#c", "b"));
	}

	public boolean backspaceCompare(String S, String T) {
		return build(S).equals(build(T));
	}

	private String build(String s) {
		Stack<Character> stack = new Stack<>();
		char[] arr = s.toCharArray();
		for (char c : arr) {
			if (c != '#') {
				stack.push(c);
			} else if (!stack.isEmpty()) {
				stack.pop();
			}
		}
		return String.valueOf(stack);
	}

}
