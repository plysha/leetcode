package easy;

public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        int l = 0;
        int r = 1;
        int maxProfit = 0;

        while (r < prices.length) {
            if (prices[l] < prices[r]) {
                int profit = prices[r] - prices[l];
                maxProfit = Math.max(profit, maxProfit);
            } else {
                l = r;
            }
            r++;
        }

        return maxProfit;
    }
}
