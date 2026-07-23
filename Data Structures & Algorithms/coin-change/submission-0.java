class Solution {
    public int coinChange(int[] coins, int amount) {
        return coinChange(coins, amount, new HashMap<>());
    }

    public int coinChange(int[] coins, int amount, HashMap<Integer, Integer> memo) {
        if (amount == 0) return 0;
        if (amount < 0) return -1;

        if (memo.containsKey(amount)) return memo.get(amount);
        int num = Integer.MAX_VALUE;

        for (int coin : coins) {
            int diff = amount - coin;
            int numberOfCoins = coinChange(coins, diff, memo);
            // ONLY proceed if the sub-problem did NOT return a dead end (-1)
            if (numberOfCoins != -1) {
                // Now it is safe to add 1 and check if it's our new minimum
                if (numberOfCoins + 1 < num) {
                    num = numberOfCoins + 1;
                }
            }
        }

        if (num == Integer.MAX_VALUE) {
            num = -1; 
        }
        memo.put(amount, num);
        return num;
    }
}
