class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int l = s.length();
        boolean result = true;
        for(int i = 0; i < l; i++) {
            l--;
            if (s.charAt(i) != s.charAt(l)) {
                result = false;
                break;
            }
        }
        return result;
    }
}
