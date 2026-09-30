class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();

        // {r: 0, a: 0, c: 0, e: 0}

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.getOrDefault(c, 0) - 1);
            } else {
                return false;
            }
        }

        for (int val : map.values()) {
            if (val != 0) {
                return false;
            }
        }

        return true;
    }
}
