class Solution {
    private static Map<Character, Integer> charCount(String s) {
        Map<Character, Integer> count = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (!count.containsKey(c)) count.put(c, 0);
            count.put(c, count.get(c) + 1);
        }
        return count;
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> count1 = charCount(s);
        Map<Character, Integer> count2 = charCount(t);
        return count1.equals(count2);
    }
}
