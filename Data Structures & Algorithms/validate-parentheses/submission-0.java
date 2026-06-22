class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>(); // stack to store opening brackets
        Map<Character, Character> closeToOpen = new HashMap<>();

        closeToOpen.put(')', '(');
        closeToOpen.put(']', '[');
        closeToOpen.put('}', '{');

        for (char c : s.toCharArray()) {
            if (closeToOpen.containsKey(c)) { // it is a closing bracket, hence needs to be removed
                if (!stack.isEmpty() && stack.peek() == closeToOpen.get(c)) {
                    stack.pop();
                } else {
                    return false;
                }
            } else { // it is an opening bracket, hence needs to be pushed to the stack
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
