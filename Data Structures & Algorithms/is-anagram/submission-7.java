class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Integer> count = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (count.containsKey(c)) {
                count.put(c, count.get(c) + 1);
            } else {
                count.put(c, 1);
            }
        }

        for (char c : t.toCharArray()) {
            if (count.containsKey(c)) {
                count.put(c, count.get(c) - 1);
            }
        }

        for (int v : count.values()) {
            if (v != 0) return false;
        }

        return true;
    }
}
