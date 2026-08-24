class Solution {
    public int coinChange(int[] coins, int amount) {
        return coinChange(coins, amount, new HashMap<>());
    }

    private int coinChange(int[] coins, int amount, HashMap<Integer, Integer> memo) {
        if (amount == 0) return 0;
        if (amount < 0) return -1;

        if (memo.containsKey(amount)) {
            return memo.get(amount);
        }
        
        int minCoins = Integer.MAX_VALUE;

        for (int coin : coins) {
            int subAmount = amount - coin;
            int numberOfCoins = coinChange(coins, subAmount, memo);
            if (numberOfCoins != -1) {
                if (numberOfCoins + 1 < minCoins) {
                    minCoins = numberOfCoins + 1;
                }
            }
        }
        if (minCoins == Integer.MAX_VALUE) minCoins = -1;
        memo.put(amount, minCoins);
        return minCoins;
    }
}
