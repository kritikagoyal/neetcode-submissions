class Solution {
    List<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        backtrack(n, new StringBuilder(""), 0, 0);
        return res;
    }

    private void backtrack(int n, StringBuilder curr, int openN, int closeN) {
        if (openN == n && closeN == n) {
            res.add(curr.toString());
            return;
        }

        if (openN < n) {
            curr.append("(");
            backtrack(n, curr, openN + 1, closeN);
            curr.deleteCharAt(curr.length() - 1);
        }

        if (closeN < openN) {
            curr.append(")");
            backtrack(n, curr, openN, closeN + 1);
            curr.deleteCharAt(curr.length() - 1);
        }
    }
}
