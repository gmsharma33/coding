package hello;

public class PerfectNumber {

	public static void main(String[] args) {
		System.out.println(new PerfectNumber().findMaxSubArrayWithPerfectNum(new int[] {1, 7, 36, 4, 6, 28, 4}));
	}

	private int findMaxSubArrayWithPerfectNum(int[] nums) {
		int count = 0;
		int max = 0;
		for (int i = 33550330; i < 33550340; i++) {
			if (isPerfectNumber(i)) {
				System.out.println(i);
				count++;
			}
			max = Math.max(count, max);
		}
		return max;
	}

	private boolean isPerfectNumber(int num) {
		int sum = 0;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		return sum == num;
	}

}
