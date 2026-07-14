class Solution {
    public int numIslands(char[][] grid) {
        Set<Integer> visited = new HashSet<>();
        int count = 0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (explore(r, c, grid, visited)) count++;
            }
        }
        return count;
    }

    public static boolean explore(int r, int c, char[][] grid, Set<Integer> visited) {
        boolean rowInbounds = 0 <= r && r < grid.length;
        boolean colInbounds = 0 <= c && c < grid[0].length;

        if (!rowInbounds || !colInbounds) return false;

        if (grid[r][c] == '0') return false;

        int pos = r * grid[0].length + c;
        if (visited.contains(pos)) return false;
        visited.add(pos);

        explore(r - 1, c, grid, visited);
        explore(r + 1, c, grid, visited);
        explore(r, c - 1, grid, visited);
        explore(r, c + 1, grid, visited);

        return true;
    }
}
