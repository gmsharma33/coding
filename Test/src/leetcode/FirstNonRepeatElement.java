package leetcode;

public class FirstNonRepeatElement {

	public static void main(String[] args) {
		System.out.println(new FirstNonRepeatElement().firstUniqChar("loveleetcode"));
	}

	public int firstUniqChar(String s) {
		int index = -1;
		int[] arr = new int[26];
		for (char c : s.toCharArray()) {
			arr[c - 97]++;
		}
		int i = 0;
		for (char c : s.toCharArray()) {
			if (arr[c - 97] == 1) {
				index = i;
				break;
			}
			i++;
		}
		return index;
	}

}
