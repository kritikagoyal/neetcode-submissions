class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        return uniquePathsWithObstacles(0, 0, obstacleGrid, new HashMap<>());
    }

    public int uniquePathsWithObstacles(int r, int c, int[][] grid, HashMap<List<Integer>, Integer> memo) {
        if (r == grid.length || c == grid[0].length) return 0;
        if (grid[r][c] == 1) return 0;
        if (r == grid.length - 1 && c == grid[0].length - 1) return 1;

        List<Integer> pos = List.of(r, c);
        if (memo.containsKey(pos)) return memo.get(pos);

        int result = uniquePathsWithObstacles(r + 1, c, grid, memo) + uniquePathsWithObstacles(r, c + 1, grid, memo);
        memo.put(pos, result);
        return result;
    }
}