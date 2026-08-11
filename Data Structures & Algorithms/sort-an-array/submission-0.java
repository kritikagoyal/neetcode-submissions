class Solution {
    public void merge(int[] nums, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for(int i = 0; i < n1; i++) {
            L[i] = nums[l + i];
        }

        for(int i = 0; i < n2; i++) {
            R[i] = nums[mid + 1 + i];
        }

        int i = 0;
        int j = 0;
        int k = l;

        while(i < n1 && j < n2) {
            if(L[i] <= R[j]) {
                nums[k] = L[i];
                i++;
                k++;
            } else {
                nums[k] = R[j];
                j++;
                k++;
            }
        }

        while(i < n1) {
            nums[k] = L[i];
            i++;
            k++;
        }

        while(j < n2) {
            nums[k] = R[j];
            j++;
            k++;
        }
    }

    public void sort(int[] nums, int l, int r) {
        int mid = l + ((r - l) / 2);
        if (l >= r) {
            return;
        }
        sort(nums, l, mid);
        sort(nums, mid + 1, r);

        merge(nums, l, mid, r);
    }

    public int[] sortArray(int[] nums) {
        // divide and conquer -> divide the array till single elements and then merge
        sort(nums, 0, nums.length - 1);
        return nums;
    }
}