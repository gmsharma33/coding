package leetcode;

public class StringShift {

	public static void main(String[] args) {
		int[][] shift = {{0, 1}, {1, 2}};
		String s = "abc";
		//"xqgwkiqpif"
		//{{1,4},{0,7},{0,8},{0,7},{0,6},{1,3},{0,1},{1,7},{0,5},{0,6}]
		System.out.println(new StringShift().stringShift(s, shift));
	}

	public String stringShift(String s, int[][] shift) {
		int diff = findShiftDiff(shift);
		String res = s;
		if(diff < 0) {
			diff = Math.abs(diff);
			diff = Math.abs(findDiff(diff, s.length()));
			String s1 = s.substring(s.length() - diff);
			String s2 = s.substring(0, s.length() - diff);
			res = s1 + s2;
		} else if(diff > 0) {
			diff = Math.abs(findDiff(diff, s.length()));
			String s1 = s.substring(0, diff);
			String s2 = s.substring(diff);
			res = s2 + s1;
		}
		return res;
	}

	private int findShiftDiff(int[][] shift) {
		int left = 0, right = 0;
		for(int i = 0; i < shift.length; i++) {
			if(shift[i][0] == 0) {
				left += shift[i][1];
			}
			if(shift[i][0] == 1) {
				right += shift[i][1];
			}
		}
		return left - right;
	}
	
	private int findDiff(int diff, int length) {
		if(diff < length) {
			return diff;
		}
		int tempDiff = 0;
		while(true) {
			if(diff > 0) {
				tempDiff = diff - length;
			}
			if(tempDiff < length) {
				break;
			}
			diff = tempDiff;
		}
		return tempDiff; 
	}

}
