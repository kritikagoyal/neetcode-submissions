class Solution {
    public int uniquePaths(int m, int n) {
        return uniquePaths(0, 0, m, n, new HashMap<>());
    }

    public int uniquePaths(int r, int c, int m, int n, HashMap<List<Integer>, Integer> memo) {
        if (r == m || c == n) return 0;

        if (r == m - 1 && c == n - 1) return 1;

        List<Integer> pos = List.of(r, c);
        if (memo.containsKey(pos)) return memo.get(pos);

        int result = uniquePaths(r + 1, c, m, n, memo) + uniquePaths(r, c + 1, m, n, memo);
        memo.put(pos, result);
        return result;
    }
}
