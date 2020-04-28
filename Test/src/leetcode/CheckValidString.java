package leetcode;

import java.util.Stack;

public class CheckValidString {

	public static void main(String[] args) {
		System.out.println(new CheckValidString().checkValidString("(*)"));
	}

	public boolean checkValidString(String s) {
		boolean flag = false;
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == ')') {
				if (!stack.isEmpty()) {
					char c2 = stack.pop();
					if (c2 != '(') {
						return false;
					}
				}
			} else if (c == '(') {
				stack.push(c);
			}
		}
		if (stack.isEmpty()) {
			return true;
		}
		return flag;
	}

}
