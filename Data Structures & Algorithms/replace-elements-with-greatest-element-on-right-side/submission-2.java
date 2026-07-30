class Solution {
    public int[] replaceElements(int[] arr) {
        int currMax = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            int newMax = Math.max(currMax, arr[i]);
            arr[i] = currMax;
            currMax = newMax;
        }
        return arr;
    }
}