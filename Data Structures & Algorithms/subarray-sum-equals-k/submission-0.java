class Solution {
    public int subarraySum(int[] nums, int k) {
        int currSum = 0;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            int req = currSum - k; // 0
            count += map.getOrDefault(req, 0); // 1
            map.put(currSum, map.getOrDefault(currSum, 0) + 1);
        }
        return count;
    }
}