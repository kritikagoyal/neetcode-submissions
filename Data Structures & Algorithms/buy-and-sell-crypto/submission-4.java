class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0]; // [5,1,5,6,7,1]
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }
        return maxProfit;
    }
}
