class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // complement 4 : 3
            if(map.containsKey(complement)) { // false : 
                // found it
                result[0] = map.get(complement);
                result[1] = i;
                return result;
            } else {
                map.put(nums[i], i);
            }
        }
        return result;
    }
}
