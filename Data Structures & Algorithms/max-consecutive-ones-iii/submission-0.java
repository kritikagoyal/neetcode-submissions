class Solution {
    public int longestOnes(int[] nums, int k) {
        int start = 0;
        int end = 0;
        int sz = nums.length;
        int zeroes = 0;
        int result = 0;

        while(end < sz) {
            if (nums[end] == 0) {
                zeroes++;
            }

            while(zeroes > k && start <= end) {
                if (nums[start] == 0) {
                    zeroes--;
                }
                start++;
            }
            result = Math.max(end - start + 1, result);
            end++;
        }
        return result;
    }
}