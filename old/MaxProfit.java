package test;

public class MaxProfit {

	public static void main(String[] args) {
		int[] prices = new int[] {7,1,5,3,6,4};
		System.out.println(new MaxProfit().maxProfit(prices, 0, prices.length - 1));
	}

	public int maxProfit(int[] prices, int start, int end) {
		int profit = 0;
		if(end <= start) {
			return 0;
		}
		
		for(int i = start; i < end; i++) {
			for(int j = i + 1; j <= end; j++) {
				if(prices[j] > prices[i]) {
					int currProfit = prices[j] - prices[i] 
							+ maxProfit(prices, start, i - 1)
							+ maxProfit(prices, j + 1, end);
					profit = Math.max(profit, currProfit);
				}
			}
		}
		
		return profit;
	}
}
