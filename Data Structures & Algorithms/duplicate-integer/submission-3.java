class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> num = new HashSet<>();
        for (int n : nums) {
            if (!num.add(n)) {
                return true;
            }
        }
        return false;
    }
}