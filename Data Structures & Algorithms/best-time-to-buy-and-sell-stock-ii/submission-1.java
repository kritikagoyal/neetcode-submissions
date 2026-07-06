class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int start = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[start]) {
                maxProfit += prices[i] - prices[start];
            }
            start++;
        }
        return maxProfit;
    }
}