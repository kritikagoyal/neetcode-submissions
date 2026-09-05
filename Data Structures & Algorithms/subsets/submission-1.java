class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        recursiveSubsets(0, nums, new ArrayList<>(), result);
        return result;
    }

    private void recursiveSubsets(int idx, int[] nums, List<Integer> currentPath, List<List<Integer>> result) {
        if (idx == nums.length) {
            result.add(new ArrayList<>(currentPath));
            return;
        }
        
        currentPath.add(nums[idx]);
        recursiveSubsets(idx + 1, nums, currentPath, result);

        currentPath.remove(currentPath.size() - 1);
        recursiveSubsets(idx + 1, nums, currentPath, result);
    }
}
