package test;

public class MoveZeroesToRight {

	public static void main(String[] args) {
		new MoveZeroesToRight().moveZeroes(new int[] {0, 0, 1});
	}

	public void moveZeroes(int[] nums) {
		int count = 0;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] != 0) {
				nums[count] = nums[i];
				count++;
			}
		}
		while(count < nums.length) {
			nums[count] = 0;
			count++;
		}
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + ",");
		}
	}

}
