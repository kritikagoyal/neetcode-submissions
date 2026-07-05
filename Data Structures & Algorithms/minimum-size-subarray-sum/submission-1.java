class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int length = Integer.MAX_VALUE;
        int start = 0;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= target) {
                length = Math.min(length, i - start + 1);
                sum -= nums[start];
                start++;
            }
        }
        return length == Integer.MAX_VALUE ? 0 : length;
    }
}