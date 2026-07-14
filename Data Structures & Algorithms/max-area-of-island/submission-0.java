class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        Set<Integer> visited = new HashSet<>();
        int maxSize = Integer.MIN_VALUE;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                int size = exploreSize(r, c, grid, visited);
                if (size > maxSize) maxSize = size;
            }
        }
        return maxSize;
    }

    public static int exploreSize(int r, int c, int[][] grid, Set<Integer> visited) {
        boolean rowInbounds = 0 <= r && r < grid.length;
        boolean colInbounds = 0 <= c && c < grid[0].length;

        if (!rowInbounds || !colInbounds) return 0;

        if (grid[r][c] == 0) return 0;

        int pos = r * grid[0].length + c;
        if (visited.contains(pos)) return 0;
        visited.add(pos);

        int totalSize = 1;
        totalSize += exploreSize(r + 1, c, grid, visited);
        totalSize += exploreSize(r - 1, c, grid, visited);
        totalSize += exploreSize(r, c - 1, grid, visited);
        totalSize += exploreSize(r, c + 1, grid, visited);

        return totalSize;
    }
}
