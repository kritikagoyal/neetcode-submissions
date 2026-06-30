class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        for (int i = 0; i < stones.length; i++) {
            maxHeap.offer(stones[i]);
        }

        while(maxHeap.size() > 1) {
            int s1 = maxHeap.poll();
            int s2 = maxHeap.poll();

            int diff = s1 - s2;

            if (diff > 0) {
                maxHeap.offer(diff);
            }
        }

        if (maxHeap.size() == 0) return 0;
        return maxHeap.peek();
    }
}
