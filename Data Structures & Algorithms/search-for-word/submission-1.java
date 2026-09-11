class Solution {
    public static boolean recursiveSearch(char[][] board, String word, int row, int col, int idx, boolean[][] visited) {
        // base case
        if (idx == word.length()) {
            return true;
        }

        if (row < 0 || col < 0 || row >= board.length || col >= board[0].length) {
            return false;
        }

        if(visited[row][col]) {
            return false;
        }

        // pruning condition #1
        if (board[row][col] != word.charAt(idx)) {
            return false;
        }
        
        // choose
        visited[row][col] = true;

        boolean found = recursiveSearch(board, word, row - 1, col, idx + 1, visited) ||
        recursiveSearch(board, word, row, col - 1, idx + 1, visited) ||
        recursiveSearch(board, word, row + 1, col, idx + 1, visited) ||
        recursiveSearch(board, word, row, col + 1, idx + 1, visited);

        visited[row][col] = false;

        return found;
    }

    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;
        boolean[][] visited = new boolean[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (recursiveSearch(board, word, i, j, 0, visited)) {
                    return true;
                }
            }
        }
        return false;
    }
}
