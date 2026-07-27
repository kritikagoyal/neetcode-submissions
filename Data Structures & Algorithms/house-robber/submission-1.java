class Solution {
    public int rob(int[] nums) {
        return rob(nums, 0, new HashMap<>());
    }

    private int rob(int[] nums, int i, HashMap<Integer, Integer> memo) {
        if (i >= nums.length) return 0;

        if (memo.containsKey(i)) return memo.get(i);

        int result = Math.max(
            nums[i] + rob(nums, i + 2, memo),
            rob(nums, i + 1, memo)
        );
        memo.put(i, result);
        return result;
    }
}
