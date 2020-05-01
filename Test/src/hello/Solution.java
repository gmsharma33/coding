package hello;

import java.util.HashSet;
import java.util.Set;

public class Solution {

	public static void main(String[] args) throws Exception {
		int[] arr = { 10, 15, 3, 7 };
		int k = 17;
		boolean flag = false;
		Set<Integer> set = new HashSet<>();
		for (int i : arr) {
			set.add(Math.abs(i - k));
			if (set.contains(i)) {
				flag = true;
				break;
			}
		}
		System.out.println(flag);
	}
}
