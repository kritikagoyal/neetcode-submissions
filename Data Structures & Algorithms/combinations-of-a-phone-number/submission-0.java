class Solution {

    private static final Map<Character, String> map = Map.of(
        '2', "abc", '3', "def", '4', "ghi", '5', "jkl",
        '6', "mno", '7', "pqrs", '8', "tuv", '9', "wxyz"
    );

    StringBuilder current = new StringBuilder();
    List<String> ans = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.isEmpty()) return ans;
        backtrack(digits, 0);
        return ans;
    }

    private void backtrack(String digits, int idx) {
        if (idx == digits.length()) {
            ans.add(current.toString());
            return;
        }

        String letters = map.get(digits.charAt(idx));
        for (char c : letters.toCharArray()) {
            current.append(c);
            backtrack(digits, idx + 1);
            current.deleteCharAt(current.length() - 1);
        }
    }
}
