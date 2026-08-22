class Solution {
    int n, m;
    int memo[][];
    public int longestCommonSubsequence(String text1, String text2) {
        n = text1.length();
        m = text2.length();
        memo = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                memo[i][j] = -1;
            }
        }

        return solve(0, 0, text1, text2);
    }

    private int solve(int idx1, int idx2, String text1, String text2) {
        if (idx1 >= n || idx2 >= m) {
            return 0;
        }

        if (memo[idx1][idx2] != -1) {
            return memo[idx1][idx2];
        }

        if (text1.charAt(idx1) == text2.charAt(idx2)) {
            memo[idx1][idx2] = 1 + solve(idx1 + 1, idx2 + 1, text1, text2);
        } else {
            memo[idx1][idx2] = Math.max(
                solve(idx1 + 1, idx2, text1, text2),
                solve(idx1, idx2 + 1, text1, text2)
            );
        }
        return memo[idx1][idx2];
    }
}
