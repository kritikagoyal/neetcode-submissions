class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int length = Integer.MAX_VALUE;
        int start = 0;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= target) {
                length = Math.min(length, i - start + 1); // 6,5 -> 5
                sum -= nums[start];
                start++; // start = 1
            }
        }
        return length == Integer.MAX_VALUE ? 0 : length;
    }
}