package test;

public class HighestSumOfSubArray {

	public static void main(String[] args) {
		System.out.println(new HighestSumOfSubArray().maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
	}

	public int maxSubArray(int[] nums) {
		/*
		 * int maxSum = nums[0]; for (int i = 0; i < nums.length; i++) { int sum =
		 * nums[i]; maxSum = sum > maxSum ? sum : maxSum; for (int k = i + 1; k <
		 * nums.length; k++) { sum += nums[k]; if (sum > maxSum) { maxSum = sum; } } }
		 * return maxSum;
		 */
		int max = Integer.MIN_VALUE, max_end = 0;
		for(int i = 0; i < nums.length; i++) {
			max_end += nums[i];
			if(max < max_end) {
				max = max_end;
			}
			if(max_end < 0) {
				max_end = 0;
			}
		}
		return max;
	}

}
