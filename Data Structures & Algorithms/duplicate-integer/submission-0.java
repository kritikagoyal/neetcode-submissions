class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Have I seen this number before?
        // Always use Hashset
        Set<Integer> seen = new HashSet<>();
        for (int n : nums) {
            if(!seen.add(n)) {
                return true;
            }
        }
        return false;
    }
}