class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        // Array to hold the count of the 26 lowercase English letters
        int[] counts = new int[26];

        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++; // Increment for string s
            counts[t.charAt(i) - 'a']--; // Decrement for string t
        }

        for (int count : counts) {
            if (count != 0) return false;
        }

        return true;
    }
}