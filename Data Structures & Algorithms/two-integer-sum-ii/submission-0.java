class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int leftPtr = 0;
        int rightPtr = numbers.length - 1;
        int[] result = new int[2];

        while(rightPtr > leftPtr) {
            if ((numbers[leftPtr] + numbers[rightPtr]) > target) {
                rightPtr = rightPtr - 1;
            } else if ((numbers[leftPtr] + numbers[rightPtr]) < target) {
                leftPtr = leftPtr + 1;
            } else {
                result[0] = leftPtr + 1;
                result[1] = rightPtr + 1;
                rightPtr = 0;
            }
        }
        return result;
    }
}
