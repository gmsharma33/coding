package leetcode;

import java.util.HashMap;
import java.util.Map;

public class ContiguosArray {

	public static void main(String[] args) {
		int[] nums = {0,0,1,0,0,0,1,1};
		System.out.println(new ContiguosArray().findMaxLength(nums));
	}

	public int findMaxLength(int[] nums) {
		int len = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				nums[i] = -1;
			}
		}
		int sum = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int n = nums.length;
		for (int i = 0; i < n; i++) {
			sum += nums[i];
			if(sum == 0) {
				len = i + 1;
			}
			if(map.containsKey(sum + n)) {
				if(len < i - map.get(sum + n)) {
					len = i - map.get(sum + n);
				}
			} else {
				map.put(sum + n, i);
			}
			
		}
		return len;
	}

}
