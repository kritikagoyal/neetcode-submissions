class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i]; // 7-4 = 3
            if (map.containsKey(diff)) { // false
                ans[0] = map.get(diff);
                ans[1] = i;
                return ans;
            }
            map.put(nums[i], i); // {3,0}
        }
        return ans;
    }
}
