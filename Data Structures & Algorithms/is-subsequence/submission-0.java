class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0; // pointer for s
        for (int j = 0; j < t.length(); j++) {
            if (i == s.length()) break;
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                continue;
            }
        }
        return i == s.length();
    }
}