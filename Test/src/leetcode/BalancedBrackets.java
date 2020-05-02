package leetcode;

public class BalancedBrackets {

	public static void main(String[] args) {
		String s = "()";
	}

	static boolean isBalanced(String in) {
		while (true) {
			in = in.replaceAll("\\(\\)", "");
		}
	}

}
