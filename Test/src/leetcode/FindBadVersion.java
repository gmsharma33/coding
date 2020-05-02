package leetcode;

import java.util.Random;

class VersionControl {
	boolean[] arr;

	public boolean isBadVersion(int version) {
		return arr[version];
	}

	public void setArr(boolean[] arr) {
		this.arr = arr;
	}
}

public class FindBadVersion extends VersionControl {

	public int firstBadVersion(int n) {
		int left = 0, right = n;
		while(right > left) {
			int mid = left + (right - left) / 2;
			if(isBadVersion(mid)) {
				right = mid;
			} else {
				left = mid + 1;
			}
		}
		return left;
	}

	public static void main(String[] args) {
		FindBadVersion obj = new FindBadVersion();
		boolean[] b = new boolean[1000];
		int r = new Random().nextInt(400);
		System.out.println(r);
		for (int i = r; i < b.length; i++) {
			b[i] = true;
		}
		obj.setArr(b);
		System.out.println(obj.firstBadVersion(obj.arr.length));
	}

}
