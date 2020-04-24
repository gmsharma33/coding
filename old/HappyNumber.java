package test;

public class HappyNumber {

	public static void main(String[] args) {
		System.out.println(isHappy(1111111));
	}

	public static boolean isHappy(int n) {
		while (true) {
			if (n % 10 != n) {
				int sum = sumOfDigits(n);
				n = sum;
				if(n == 1 || n == 7) {
					return true;
				}
			} else {
				return false;
			}
		}
	}

	private static int sumOfDigits(int n) {
		int q;
		int sum = 0;
		int rem;
		do {
			q = n % 10;
			sum += q * q;
			rem = n / 10;
			n = n / 10;
		} while (rem != 0);
		return sum;
	}
}
