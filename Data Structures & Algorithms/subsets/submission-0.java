class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        recursiveSubset(0, nums, new ArrayList<>(), result);
        return result;
    }

    private void recursiveSubset(int idx, int[] nums, List<Integer> currentPath, List<List<Integer>> result) {
        if (idx == nums.length) {
            result.add(new ArrayList<>(currentPath));
            return;
        }

        // choice 1 -> take it
        currentPath.add(nums[idx]);
        recursiveSubset(idx + 1, nums, currentPath, result);

        // choice 2 -> Skip it
        currentPath.remove(currentPath.size() - 1);
        recursiveSubset(idx + 1, nums, currentPath, result);
    }
}
