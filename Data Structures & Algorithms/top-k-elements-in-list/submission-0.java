class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // 1. Count frequencies
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        /*
        {
            1: 1,
            2: 2,
            3: 3
        }
        */

        // 2. Min-Heap ordered by frequency (lowest frequency at the top)
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));

        for (int num : map.keySet()) {
            pq.offer(num);
            if (pq.size() > k) {
                pq.poll(); // Keep only the top k most frequent
            }
        }

        // 3. Extract the top k elements into the result array
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll();
        }

        return ans;
    }
}