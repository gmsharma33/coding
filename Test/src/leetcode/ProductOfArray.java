package leetcode;

/**
 * LeetCode -
 * https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/530/week-3/3300/
 * 
 * @author sharma
 *
 */
public class ProductOfArray {

	public static void main(String[] args) {
		int[] arr = new ProductOfArray().productExceptSelf(new int[] {0,1,0});
		for (int a : arr) {
			System.out.println(a);
		}
	}

	/*
	 * int len = nums.length; int[] output = new int[len]; for(int i = 0; i < len;
	 * i++) { int product = 1; for(int j = 0; j < len; j++) { if(i != j) { product
	 * *= nums[j]; } } output[i] = product; } return output;
	 */
	public int[] productExceptSelf(int[] nums) {
		int len = nums.length;
		int[] output = new int[len];
		int product = 1;
		boolean flag = false;
		boolean isZero = false;
		int count = 0;
		for(int i = 0; i < len; i++) {
			if(nums[i] != 0) {
				product *= nums[i];
			}
			if(nums[i] == 0) {
				count++;
				if(count >= 2) {
					flag = true;
				}
				isZero = true;
			}
		}
		if(len == 2) {
			output[0] = nums[1];
			output[1] = nums[0];
			return output;
		}
		for(int i = 0; i < len; i++) {
			if(flag) {
				output[i] = 0;
			} else if(nums[i] == 0) {
				output[i] = product;
			} else {
				if(isZero) {
					output[i] = 0;
				} else {
					output[i] = product / nums[i];
				}
			}
		}
		return output;
	}

}
