class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        int leftSum = 0;
        int diff = 0;
        for (int n : nums) {
            sum += n;
        }

        for (int i = 0; i < nums.length; i++) {
            diff = sum - nums[i];
            if (diff == leftSum * 2) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}