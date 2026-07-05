class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> windowSet = new HashSet<>();
        int left = 0, maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            while (windowSet.contains(s.charAt(i))) {
                windowSet.remove(s.charAt(left));
                left++;
            }
            windowSet.add(s.charAt(i));
            maxLength = Math.max(maxLength, i - left + 1);
        }
        return maxLength;
    }
}
