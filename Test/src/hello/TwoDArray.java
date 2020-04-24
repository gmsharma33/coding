package hello;

import java.util.Scanner;

public class TwoDArray {
	
	private static final Scanner scanner = new Scanner(System.in);
	static int R = 6, C = 6;
	
	public static void main(String[] args) {
		int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        int sum = 0, maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < R - 2; i++) {
        	for (int j = 0; j <  C - 2; j++) {
        		sum = arr[i][j] + arr[i][j + 1] + arr[i][j+2]
        				+ arr[i + 1][j+1]
        				+ arr[i + 2][j] + arr[i + 2][j+1] + arr[i + 2][j+2];
        		if(sum > maxSum) {
        			maxSum = sum;
        		}
        	}
        }
        System.out.println(maxSum);
	}
	
	private static int getSum(int[][] arr, int i, int j) {
		try {
			return arr[i][j] + arr[i][j + 1] + arr[i][j + 2] +
					arr[i + 1][j + 1] + 
					arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
		} catch (Exception e) {
			
		}
		return 0;
	}

}
