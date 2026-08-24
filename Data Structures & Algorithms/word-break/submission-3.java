class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        return wordBreak(s, wordDict, 0, new HashMap<>());
    }

    private boolean wordBreak(String s, List<String> wordDict, int idx, HashMap<Integer, Boolean> memo) {
        if (idx == s.length()) return true;
        if (memo.containsKey(idx)) return memo.get(idx);

        for (String word : wordDict) {
            if (s.startsWith(word.toLowerCase(), idx)) {
                if (wordBreak(s, wordDict, idx + word.length(), memo)) {
                    memo.put(idx, true);
                    return true;
                }
            }
        }
        memo.put(idx, false);
        return false;
    }
}
