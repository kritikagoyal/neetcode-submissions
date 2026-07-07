class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = nums[0];
        maxSum = currentSum;

        for (int i = 1; i < nums.length; i++) {
            if (currentSum < 0) currentSum = 0;
            currentSum += nums[i];
            maxSum = Math.max(maxSum, currentSum);
        }

        return Math.max(currentSum, maxSum);
    }
}
