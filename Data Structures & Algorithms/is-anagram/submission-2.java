class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        // Create a hash map to keep a count of letter frequency
        Map<Character, Integer> count = new HashMap<>();
        for (char c1 : s.toCharArray()) {
            count.put(c1, count.getOrDefault(c1, 0) + 1);
        }
        for (char c2 : t.toCharArray()) {
            count.put(c2, count.getOrDefault(c2, 0) - 1);
        }
        for (int value : count.values()) {
            if (value != 0) {
                return false;
            }
        }
        return true;
    }
}
